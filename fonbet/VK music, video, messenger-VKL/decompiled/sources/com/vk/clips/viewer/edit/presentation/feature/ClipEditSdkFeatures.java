package com.vk.clips.viewer.edit.presentation.feature;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipEditSdkFeatures.kt */
/* loaded from: classes17.dex */
public final class ClipEditSdkFeatures {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipEditSdkFeatures[] $VALUES;
    public static final ClipEditSdkFeatures ClipAttachVideoNewNaming;
    public static final ClipEditSdkFeatures Coauthors;
    public static final ClipEditSdkFeatures CoauthorsRedesign;
    public static final ClipEditSdkFeatures CoverSelector;
    public static final ClipEditSdkFeatures Ord;
    public static final ClipEditSdkFeatures TrendingHashtags;
    public static final ClipEditSdkFeatures VideoAttach;

    static {
        ClipEditSdkFeatures clipEditSdkFeatures = new ClipEditSdkFeatures("Ord", 0);
        Ord = clipEditSdkFeatures;
        ClipEditSdkFeatures clipEditSdkFeatures2 = new ClipEditSdkFeatures("VideoAttach", 1);
        VideoAttach = clipEditSdkFeatures2;
        ClipEditSdkFeatures clipEditSdkFeatures3 = new ClipEditSdkFeatures("CoverSelector", 2);
        CoverSelector = clipEditSdkFeatures3;
        ClipEditSdkFeatures clipEditSdkFeatures4 = new ClipEditSdkFeatures("Coauthors", 3);
        Coauthors = clipEditSdkFeatures4;
        ClipEditSdkFeatures clipEditSdkFeatures5 = new ClipEditSdkFeatures("CoauthorsRedesign", 4);
        CoauthorsRedesign = clipEditSdkFeatures5;
        ClipEditSdkFeatures clipEditSdkFeatures6 = new ClipEditSdkFeatures("TrendingHashtags", 5);
        TrendingHashtags = clipEditSdkFeatures6;
        ClipEditSdkFeatures clipEditSdkFeatures7 = new ClipEditSdkFeatures("ClipAttachVideoNewNaming", 6);
        ClipAttachVideoNewNaming = clipEditSdkFeatures7;
        ClipEditSdkFeatures[] clipEditSdkFeaturesArr = {clipEditSdkFeatures, clipEditSdkFeatures2, clipEditSdkFeatures3, clipEditSdkFeatures4, clipEditSdkFeatures5, clipEditSdkFeatures6, clipEditSdkFeatures7};
        $VALUES = clipEditSdkFeaturesArr;
        $ENTRIES = new asp(clipEditSdkFeaturesArr);
    }

    public ClipEditSdkFeatures() {
        throw null;
    }

    public static ClipEditSdkFeatures valueOf(String str) {
        return (ClipEditSdkFeatures) Enum.valueOf(ClipEditSdkFeatures.class, str);
    }

    public static ClipEditSdkFeatures[] values() {
        return (ClipEditSdkFeatures[]) $VALUES.clone();
    }
}
