package io.intercom.android.sdk.articles;

/* loaded from: classes9.dex */
public interface ArticleWebViewListener {
    void articleNotFound();

    void onArticleFinishedLoading();

    void onArticleLoadingError();

    void onArticleStartedLoading();

    void scrollArticleViewTo(int i);
}
