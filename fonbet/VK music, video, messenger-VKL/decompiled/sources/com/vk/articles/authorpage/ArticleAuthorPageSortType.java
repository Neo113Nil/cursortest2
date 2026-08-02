package com.vk.articles.authorpage;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ArticleAuthorPageSortType.kt */
/* loaded from: classes15.dex */
public final class ArticleAuthorPageSortType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ArticleAuthorPageSortType[] $VALUES;
    public static final ArticleAuthorPageSortType DATE;
    public static final ArticleAuthorPageSortType VIEWS;
    private final int id;
    private final int nameResId;

    static {
        ArticleAuthorPageSortType articleAuthorPageSortType = new ArticleAuthorPageSortType("DATE", 0, 0, R.string.article_sort_time);
        DATE = articleAuthorPageSortType;
        ArticleAuthorPageSortType articleAuthorPageSortType2 = new ArticleAuthorPageSortType("VIEWS", 1, 1, R.string.article_sort_interesting);
        VIEWS = articleAuthorPageSortType2;
        ArticleAuthorPageSortType[] articleAuthorPageSortTypeArr = {articleAuthorPageSortType, articleAuthorPageSortType2};
        $VALUES = articleAuthorPageSortTypeArr;
        $ENTRIES = new asp(articleAuthorPageSortTypeArr);
    }

    public ArticleAuthorPageSortType(String str, int i, int i2, int i3) {
        this.id = i2;
        this.nameResId = i3;
    }

    public static ArticleAuthorPageSortType valueOf(String str) {
        return (ArticleAuthorPageSortType) Enum.valueOf(ArticleAuthorPageSortType.class, str);
    }

    public static ArticleAuthorPageSortType[] values() {
        return (ArticleAuthorPageSortType[]) $VALUES.clone();
    }

    public final int h() {
        return this.nameResId;
    }
}
