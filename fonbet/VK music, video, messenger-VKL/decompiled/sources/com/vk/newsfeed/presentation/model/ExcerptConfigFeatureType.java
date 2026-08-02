package com.vk.newsfeed.presentation.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExcerptConfigFeatureType.kt */
/* loaded from: classes4.dex */
public final class ExcerptConfigFeatureType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ExcerptConfigFeatureType[] $VALUES;
    public static final ExcerptConfigFeatureType Ads;
    public static final ExcerptConfigFeatureType DiscoverMediaPost;
    public static final ExcerptConfigFeatureType None;
    public static final ExcerptConfigFeatureType Post;
    private final int value;

    static {
        ExcerptConfigFeatureType excerptConfigFeatureType = new ExcerptConfigFeatureType("None", 0, 1);
        None = excerptConfigFeatureType;
        ExcerptConfigFeatureType excerptConfigFeatureType2 = new ExcerptConfigFeatureType("Post", 1, 2);
        Post = excerptConfigFeatureType2;
        ExcerptConfigFeatureType excerptConfigFeatureType3 = new ExcerptConfigFeatureType("Ads", 2, 3);
        Ads = excerptConfigFeatureType3;
        ExcerptConfigFeatureType excerptConfigFeatureType4 = new ExcerptConfigFeatureType("DiscoverMediaPost", 3, 4);
        DiscoverMediaPost = excerptConfigFeatureType4;
        ExcerptConfigFeatureType[] excerptConfigFeatureTypeArr = {excerptConfigFeatureType, excerptConfigFeatureType2, excerptConfigFeatureType3, excerptConfigFeatureType4};
        $VALUES = excerptConfigFeatureTypeArr;
        $ENTRIES = new asp(excerptConfigFeatureTypeArr);
    }

    public ExcerptConfigFeatureType(String str, int i, int i2) {
        this.value = i2;
    }

    public static ExcerptConfigFeatureType valueOf(String str) {
        return (ExcerptConfigFeatureType) Enum.valueOf(ExcerptConfigFeatureType.class, str);
    }

    public static ExcerptConfigFeatureType[] values() {
        return (ExcerptConfigFeatureType[]) $VALUES.clone();
    }

    public final int h() {
        return this.value;
    }
}
