package com.example.simple.recommendation.spring.service;

import java.util.List;

import com.example.simple.recommendation.spring.entity.Keyword;

public interface KeywordService {

	public void addKeyword(Keyword keyword);
	public int getArticleKeywordCount(long articleId);
	public List<Keyword> listKeywords();
	public List<Keyword> listArticleKeywords(long articleId);
}
