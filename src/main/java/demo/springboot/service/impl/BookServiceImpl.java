package demo.springboot.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.springboot.dao.BookDao;
import demo.springboot.domain.Book;
import demo.springboot.service.BookService;

/**
 * Book 业务层实现
 *
 * Created by bysocket on 30/09/2017.
 */
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;

	@Override
	public List<Book> findAll() {
		return bookDao.findAll();
	}

	@Override
	public int insertByBook(Book book) {
		return bookDao.insertByBook(book);
	}

	@Override
	public int update(Book book) {
		return bookDao.update(book);
	}

	@Override
	public int delete(Long id) {
		return bookDao.delete(id);
	}

	@Override
	public Book findById(Long id) {
		return bookDao.findById(id);
	}
}
