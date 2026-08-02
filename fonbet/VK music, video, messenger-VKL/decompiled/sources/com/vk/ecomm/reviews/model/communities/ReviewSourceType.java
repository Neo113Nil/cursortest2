package com.vk.ecomm.reviews.model.communities;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReviewSourceType.kt */
/* loaded from: classes18.dex */
public final class ReviewSourceType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReviewSourceType[] $VALUES;
    public static final ReviewSourceType Vk;
    public static final ReviewSourceType YClients;
    private final int id;

    static {
        ReviewSourceType reviewSourceType = new ReviewSourceType("Vk", 0, 0);
        Vk = reviewSourceType;
        ReviewSourceType reviewSourceType2 = new ReviewSourceType("YClients", 1, 1);
        YClients = reviewSourceType2;
        ReviewSourceType[] reviewSourceTypeArr = {reviewSourceType, reviewSourceType2};
        $VALUES = reviewSourceTypeArr;
        $ENTRIES = new asp(reviewSourceTypeArr);
    }

    public ReviewSourceType(String str, int i, int i2) {
        this.id = i2;
    }

    public static ReviewSourceType valueOf(String str) {
        return (ReviewSourceType) Enum.valueOf(ReviewSourceType.class, str);
    }

    public static ReviewSourceType[] values() {
        return (ReviewSourceType[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
