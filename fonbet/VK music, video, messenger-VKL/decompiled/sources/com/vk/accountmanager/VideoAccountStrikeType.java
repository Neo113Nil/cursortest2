package com.vk.accountmanager;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoAccountStrikeType.kt */
/* loaded from: classes14.dex */
public final class VideoAccountStrikeType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoAccountStrikeType[] $VALUES;
    public static final VideoAccountStrikeType LIVE;
    public static final VideoAccountStrikeType VIDEO_UPLOAD;

    static {
        VideoAccountStrikeType videoAccountStrikeType = new VideoAccountStrikeType("LIVE", 0);
        LIVE = videoAccountStrikeType;
        VideoAccountStrikeType videoAccountStrikeType2 = new VideoAccountStrikeType("VIDEO_UPLOAD", 1);
        VIDEO_UPLOAD = videoAccountStrikeType2;
        VideoAccountStrikeType[] videoAccountStrikeTypeArr = {videoAccountStrikeType, videoAccountStrikeType2};
        $VALUES = videoAccountStrikeTypeArr;
        $ENTRIES = new asp(videoAccountStrikeTypeArr);
    }

    public VideoAccountStrikeType() {
        throw null;
    }

    public static VideoAccountStrikeType valueOf(String str) {
        return (VideoAccountStrikeType) Enum.valueOf(VideoAccountStrikeType.class, str);
    }

    public static VideoAccountStrikeType[] values() {
        return (VideoAccountStrikeType[]) $VALUES.clone();
    }
}
