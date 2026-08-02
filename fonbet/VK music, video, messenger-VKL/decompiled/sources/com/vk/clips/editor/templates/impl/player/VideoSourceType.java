package com.vk.clips.editor.templates.impl.player;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoSourceType.kt */
/* loaded from: classes16.dex */
public final class VideoSourceType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoSourceType[] $VALUES;
    public static final VideoSourceType DASH;
    public static final VideoSourceType DASH_WEBM;
    public static final VideoSourceType HLS;
    public static final VideoSourceType MP4;

    static {
        VideoSourceType videoSourceType = new VideoSourceType("HLS", 0);
        HLS = videoSourceType;
        VideoSourceType videoSourceType2 = new VideoSourceType("MP4", 1);
        MP4 = videoSourceType2;
        VideoSourceType videoSourceType3 = new VideoSourceType("DASH", 2);
        DASH = videoSourceType3;
        VideoSourceType videoSourceType4 = new VideoSourceType("DASH_WEBM", 3);
        DASH_WEBM = videoSourceType4;
        VideoSourceType[] videoSourceTypeArr = {videoSourceType, videoSourceType2, videoSourceType3, videoSourceType4};
        $VALUES = videoSourceTypeArr;
        $ENTRIES = new asp(videoSourceTypeArr);
    }

    public VideoSourceType() {
        throw null;
    }

    public static VideoSourceType valueOf(String str) {
        return (VideoSourceType) Enum.valueOf(VideoSourceType.class, str);
    }

    public static VideoSourceType[] values() {
        return (VideoSourceType[]) $VALUES.clone();
    }
}
