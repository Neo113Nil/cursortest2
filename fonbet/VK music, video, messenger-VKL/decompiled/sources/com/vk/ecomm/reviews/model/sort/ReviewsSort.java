package com.vk.ecomm.reviews.model.sort;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReviewsSort.kt */
/* loaded from: classes18.dex */
public final class ReviewsSort {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReviewsSort[] $VALUES;
    public static final ReviewsSort HIGHEST_MARKS_SORT;
    public static final ReviewsSort LOWEST_MARKS_SORT;
    public static final ReviewsSort NEWEST_SORT;
    public static final ReviewsSort PUBLISHED_FROM_NEW_TO_OLD_SORT;
    public static final ReviewsSort PUBLISHED_FROM_OLD_TO_NEW_SORT;
    public static final ReviewsSort WITH_PHOTOS_SORT;
    private final String sortParam;

    static {
        ReviewsSort reviewsSort = new ReviewsSort("NEWEST_SORT", 0, "newest");
        NEWEST_SORT = reviewsSort;
        ReviewsSort reviewsSort2 = new ReviewsSort("PUBLISHED_FROM_NEW_TO_OLD_SORT", 1, "published");
        PUBLISHED_FROM_NEW_TO_OLD_SORT = reviewsSort2;
        ReviewsSort reviewsSort3 = new ReviewsSort("PUBLISHED_FROM_OLD_TO_NEW_SORT", 2, "-published");
        PUBLISHED_FROM_OLD_TO_NEW_SORT = reviewsSort3;
        ReviewsSort reviewsSort4 = new ReviewsSort("WITH_PHOTOS_SORT", 3, "photos");
        WITH_PHOTOS_SORT = reviewsSort4;
        ReviewsSort reviewsSort5 = new ReviewsSort("HIGHEST_MARKS_SORT", 4, "mark");
        HIGHEST_MARKS_SORT = reviewsSort5;
        ReviewsSort reviewsSort6 = new ReviewsSort("LOWEST_MARKS_SORT", 5, "-mark");
        LOWEST_MARKS_SORT = reviewsSort6;
        ReviewsSort[] reviewsSortArr = {reviewsSort, reviewsSort2, reviewsSort3, reviewsSort4, reviewsSort5, reviewsSort6};
        $VALUES = reviewsSortArr;
        $ENTRIES = new asp(reviewsSortArr);
    }

    public ReviewsSort(String str, int i, String str2) {
        this.sortParam = str2;
    }

    public static ReviewsSort valueOf(String str) {
        return (ReviewsSort) Enum.valueOf(ReviewsSort.class, str);
    }

    public static ReviewsSort[] values() {
        return (ReviewsSort[]) $VALUES.clone();
    }

    public final String h() {
        return this.sortParam;
    }
}
