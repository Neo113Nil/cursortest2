package com.vk.clips.edit.impl.deps.features;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipEditVkFeatures.kt */
/* loaded from: classes16.dex */
public final class ClipEditVkFeatures {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipEditVkFeatures[] $VALUES;
    public static final ClipEditVkFeatures All;
    public static final ClipEditVkFeatures Coauthors;
    public static final ClipEditVkFeatures Ord;
    public static final ClipEditVkFeatures TrendingHashtags;
    public static final ClipEditVkFeatures VideoAttach;

    static {
        ClipEditVkFeatures clipEditVkFeatures = new ClipEditVkFeatures("Coauthors", 0);
        Coauthors = clipEditVkFeatures;
        ClipEditVkFeatures clipEditVkFeatures2 = new ClipEditVkFeatures("VideoAttach", 1);
        VideoAttach = clipEditVkFeatures2;
        ClipEditVkFeatures clipEditVkFeatures3 = new ClipEditVkFeatures("Ord", 2);
        Ord = clipEditVkFeatures3;
        ClipEditVkFeatures clipEditVkFeatures4 = new ClipEditVkFeatures("TrendingHashtags", 3);
        TrendingHashtags = clipEditVkFeatures4;
        ClipEditVkFeatures clipEditVkFeatures5 = new ClipEditVkFeatures("All", 4);
        All = clipEditVkFeatures5;
        ClipEditVkFeatures[] clipEditVkFeaturesArr = {clipEditVkFeatures, clipEditVkFeatures2, clipEditVkFeatures3, clipEditVkFeatures4, clipEditVkFeatures5};
        $VALUES = clipEditVkFeaturesArr;
        $ENTRIES = new asp(clipEditVkFeaturesArr);
    }

    public ClipEditVkFeatures() {
        throw null;
    }

    public static ClipEditVkFeatures valueOf(String str) {
        return (ClipEditVkFeatures) Enum.valueOf(ClipEditVkFeatures.class, str);
    }

    public static ClipEditVkFeatures[] values() {
        return (ClipEditVkFeatures[]) $VALUES.clone();
    }
}
