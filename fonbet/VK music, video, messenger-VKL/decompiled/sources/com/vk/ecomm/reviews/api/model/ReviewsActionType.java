package com.vk.ecomm.reviews.api.model;

import xsna.asp;
import xsna.u60;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReviewsActionType.kt */
/* loaded from: classes18.dex */
public final class ReviewsActionType implements u60 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReviewsActionType[] $VALUES;
    public static final ReviewsActionType ACTION_COPY_TEXT;
    public static final ReviewsActionType ACTION_DELETE;
    public static final ReviewsActionType ACTION_EDIT;
    public static final ReviewsActionType ACTION_LIKE;
    public static final ReviewsActionType ACTION_PIN;
    public static final ReviewsActionType ACTION_REPLY;
    public static final ReviewsActionType ACTION_REPORT;
    public static final ReviewsActionType ACTION_UNLIKE;
    public static final ReviewsActionType ACTION_UNPIN;

    static {
        ReviewsActionType reviewsActionType = new ReviewsActionType("ACTION_REPLY", 0);
        ACTION_REPLY = reviewsActionType;
        ReviewsActionType reviewsActionType2 = new ReviewsActionType("ACTION_COPY_TEXT", 1);
        ACTION_COPY_TEXT = reviewsActionType2;
        ReviewsActionType reviewsActionType3 = new ReviewsActionType("ACTION_REPORT", 2);
        ACTION_REPORT = reviewsActionType3;
        ReviewsActionType reviewsActionType4 = new ReviewsActionType("ACTION_EDIT", 3);
        ACTION_EDIT = reviewsActionType4;
        ReviewsActionType reviewsActionType5 = new ReviewsActionType("ACTION_DELETE", 4);
        ACTION_DELETE = reviewsActionType5;
        ReviewsActionType reviewsActionType6 = new ReviewsActionType("ACTION_LIKE", 5);
        ACTION_LIKE = reviewsActionType6;
        ReviewsActionType reviewsActionType7 = new ReviewsActionType("ACTION_UNLIKE", 6);
        ACTION_UNLIKE = reviewsActionType7;
        ReviewsActionType reviewsActionType8 = new ReviewsActionType("ACTION_PIN", 7);
        ACTION_PIN = reviewsActionType8;
        ReviewsActionType reviewsActionType9 = new ReviewsActionType("ACTION_UNPIN", 8);
        ACTION_UNPIN = reviewsActionType9;
        ReviewsActionType[] reviewsActionTypeArr = {reviewsActionType, reviewsActionType2, reviewsActionType3, reviewsActionType4, reviewsActionType5, reviewsActionType6, reviewsActionType7, reviewsActionType8, reviewsActionType9};
        $VALUES = reviewsActionTypeArr;
        $ENTRIES = new asp(reviewsActionTypeArr);
    }

    public ReviewsActionType() {
        throw null;
    }

    public static ReviewsActionType valueOf(String str) {
        return (ReviewsActionType) Enum.valueOf(ReviewsActionType.class, str);
    }

    public static ReviewsActionType[] values() {
        return (ReviewsActionType[]) $VALUES.clone();
    }
}
