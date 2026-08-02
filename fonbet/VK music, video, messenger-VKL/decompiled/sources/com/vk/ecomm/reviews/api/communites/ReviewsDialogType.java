package com.vk.ecomm.reviews.api.communites;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReviewsDialogType.kt */
/* loaded from: classes18.dex */
public final class ReviewsDialogType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReviewsDialogType[] $VALUES;
    public static final ReviewsDialogType CONFIRM;
    public static final ReviewsDialogType DEFAULT;

    static {
        ReviewsDialogType reviewsDialogType = new ReviewsDialogType("CONFIRM", 0);
        CONFIRM = reviewsDialogType;
        ReviewsDialogType reviewsDialogType2 = new ReviewsDialogType("DEFAULT", 1);
        DEFAULT = reviewsDialogType2;
        ReviewsDialogType[] reviewsDialogTypeArr = {reviewsDialogType, reviewsDialogType2};
        $VALUES = reviewsDialogTypeArr;
        $ENTRIES = new asp(reviewsDialogTypeArr);
    }

    public ReviewsDialogType() {
        throw null;
    }

    public static ReviewsDialogType valueOf(String str) {
        return (ReviewsDialogType) Enum.valueOf(ReviewsDialogType.class, str);
    }

    public static ReviewsDialogType[] values() {
        return (ReviewsDialogType[]) $VALUES.clone();
    }
}
