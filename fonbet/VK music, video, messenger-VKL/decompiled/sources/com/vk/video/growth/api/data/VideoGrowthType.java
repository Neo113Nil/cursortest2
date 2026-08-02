package com.vk.video.growth.api.data;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoGrowthType.kt */
/* loaded from: classes6.dex */
public final class VideoGrowthType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoGrowthType[] $VALUES;
    public static final VideoGrowthType BOTTOM_SHEET;
    public static final VideoGrowthType BOTTOM_SHEET_AND_BUTTON;
    public static final VideoGrowthType CTA_BANNER;
    public static final VideoGrowthType GRAY_BUTTON;

    static {
        VideoGrowthType videoGrowthType = new VideoGrowthType("BOTTOM_SHEET_AND_BUTTON", 0);
        BOTTOM_SHEET_AND_BUTTON = videoGrowthType;
        VideoGrowthType videoGrowthType2 = new VideoGrowthType("BOTTOM_SHEET", 1);
        BOTTOM_SHEET = videoGrowthType2;
        VideoGrowthType videoGrowthType3 = new VideoGrowthType("GRAY_BUTTON", 2);
        GRAY_BUTTON = videoGrowthType3;
        VideoGrowthType videoGrowthType4 = new VideoGrowthType("CTA_BANNER", 3);
        CTA_BANNER = videoGrowthType4;
        VideoGrowthType[] videoGrowthTypeArr = {videoGrowthType, videoGrowthType2, videoGrowthType3, videoGrowthType4};
        $VALUES = videoGrowthTypeArr;
        $ENTRIES = new asp(videoGrowthTypeArr);
    }

    public VideoGrowthType() {
        throw null;
    }

    public static VideoGrowthType valueOf(String str) {
        return (VideoGrowthType) Enum.valueOf(VideoGrowthType.class, str);
    }

    public static VideoGrowthType[] values() {
        return (VideoGrowthType[]) $VALUES.clone();
    }
}
