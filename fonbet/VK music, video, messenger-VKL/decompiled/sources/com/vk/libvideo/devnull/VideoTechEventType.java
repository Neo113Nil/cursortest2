package com.vk.libvideo.devnull;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoTechEventType.kt */
/* loaded from: classes2.dex */
public final class VideoTechEventType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoTechEventType[] $VALUES;
    public static final VideoTechEventType VIDEO_TECH_WASTED_PLAYER;
    private final String eventName = "video_tech_wasted_player";

    static {
        VideoTechEventType videoTechEventType = new VideoTechEventType();
        VIDEO_TECH_WASTED_PLAYER = videoTechEventType;
        VideoTechEventType[] videoTechEventTypeArr = {videoTechEventType};
        $VALUES = videoTechEventTypeArr;
        $ENTRIES = new asp(videoTechEventTypeArr);
    }

    public static VideoTechEventType valueOf(String str) {
        return (VideoTechEventType) Enum.valueOf(VideoTechEventType.class, str);
    }

    public static VideoTechEventType[] values() {
        return (VideoTechEventType[]) $VALUES.clone();
    }

    public final String h() {
        return this.eventName;
    }
}
