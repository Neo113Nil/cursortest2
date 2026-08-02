package com.vk.libvideo.models.autoplay.ad_pixels;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutoPlayAdPixelsTrackerType.kt */
/* loaded from: classes3.dex */
public final class AutoPlayAdPixelsTrackerType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AutoPlayAdPixelsTrackerType[] $VALUES;
    public static final AutoPlayAdPixelsTrackerType CLIPS;
    public static final AutoPlayAdPixelsTrackerType NEWSFEED;
    public static final AutoPlayAdPixelsTrackerType NONE;

    static {
        AutoPlayAdPixelsTrackerType autoPlayAdPixelsTrackerType = new AutoPlayAdPixelsTrackerType("NEWSFEED", 0);
        NEWSFEED = autoPlayAdPixelsTrackerType;
        AutoPlayAdPixelsTrackerType autoPlayAdPixelsTrackerType2 = new AutoPlayAdPixelsTrackerType("CLIPS", 1);
        CLIPS = autoPlayAdPixelsTrackerType2;
        AutoPlayAdPixelsTrackerType autoPlayAdPixelsTrackerType3 = new AutoPlayAdPixelsTrackerType("NONE", 2);
        NONE = autoPlayAdPixelsTrackerType3;
        AutoPlayAdPixelsTrackerType[] autoPlayAdPixelsTrackerTypeArr = {autoPlayAdPixelsTrackerType, autoPlayAdPixelsTrackerType2, autoPlayAdPixelsTrackerType3};
        $VALUES = autoPlayAdPixelsTrackerTypeArr;
        $ENTRIES = new asp(autoPlayAdPixelsTrackerTypeArr);
    }

    public AutoPlayAdPixelsTrackerType() {
        throw null;
    }

    public static AutoPlayAdPixelsTrackerType valueOf(String str) {
        return (AutoPlayAdPixelsTrackerType) Enum.valueOf(AutoPlayAdPixelsTrackerType.class, str);
    }

    public static AutoPlayAdPixelsTrackerType[] values() {
        return (AutoPlayAdPixelsTrackerType[]) $VALUES.clone();
    }
}
