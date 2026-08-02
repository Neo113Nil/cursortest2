package com.vk.ecomm.reviews.impl.allreviews.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReviewStatus.kt */
/* loaded from: classes18.dex */
public final class ReviewStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReviewStatus[] $VALUES;
    public static final a Companion;
    public static final ReviewStatus DELETED;
    public static final ReviewStatus DISABLED;
    public static final ReviewStatus NEW;
    public static final ReviewStatus PUBLISHED;
    public static final ReviewStatus REJECTED;
    private final int value;

    /* compiled from: ReviewStatus.kt */
    public static final class a {
    }

    static {
        ReviewStatus reviewStatus = new ReviewStatus("NEW", 0, 1);
        NEW = reviewStatus;
        ReviewStatus reviewStatus2 = new ReviewStatus("PUBLISHED", 1, 2);
        PUBLISHED = reviewStatus2;
        ReviewStatus reviewStatus3 = new ReviewStatus("DELETED", 2, 3);
        DELETED = reviewStatus3;
        ReviewStatus reviewStatus4 = new ReviewStatus("REJECTED", 3, 4);
        REJECTED = reviewStatus4;
        ReviewStatus reviewStatus5 = new ReviewStatus("DISABLED", 4, 5);
        DISABLED = reviewStatus5;
        ReviewStatus[] reviewStatusArr = {reviewStatus, reviewStatus2, reviewStatus3, reviewStatus4, reviewStatus5};
        $VALUES = reviewStatusArr;
        $ENTRIES = new asp(reviewStatusArr);
        Companion = new a();
    }

    public ReviewStatus(String str, int i, int i2) {
        this.value = i2;
    }

    public static ReviewStatus valueOf(String str) {
        return (ReviewStatus) Enum.valueOf(ReviewStatus.class, str);
    }

    public static ReviewStatus[] values() {
        return (ReviewStatus[]) $VALUES.clone();
    }

    public final int h() {
        return this.value;
    }
}
