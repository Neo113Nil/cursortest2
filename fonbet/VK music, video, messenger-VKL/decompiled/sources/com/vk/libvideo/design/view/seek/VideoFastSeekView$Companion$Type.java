package com.vk.libvideo.design.view.seek;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoFastSeekView.kt */
/* loaded from: classes2.dex */
public final class VideoFastSeekView$Companion$Type {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoFastSeekView$Companion$Type[] $VALUES;
    public static final VideoFastSeekView$Companion$Type BUTTON;
    public static final VideoFastSeekView$Companion$Type NONE;
    public static final VideoFastSeekView$Companion$Type SEEK;
    public static final VideoFastSeekView$Companion$Type TAP;

    static {
        VideoFastSeekView$Companion$Type videoFastSeekView$Companion$Type = new VideoFastSeekView$Companion$Type("TAP", 0);
        TAP = videoFastSeekView$Companion$Type;
        VideoFastSeekView$Companion$Type videoFastSeekView$Companion$Type2 = new VideoFastSeekView$Companion$Type("BUTTON", 1);
        BUTTON = videoFastSeekView$Companion$Type2;
        VideoFastSeekView$Companion$Type videoFastSeekView$Companion$Type3 = new VideoFastSeekView$Companion$Type("SEEK", 2);
        SEEK = videoFastSeekView$Companion$Type3;
        VideoFastSeekView$Companion$Type videoFastSeekView$Companion$Type4 = new VideoFastSeekView$Companion$Type("NONE", 3);
        NONE = videoFastSeekView$Companion$Type4;
        VideoFastSeekView$Companion$Type[] videoFastSeekView$Companion$TypeArr = {videoFastSeekView$Companion$Type, videoFastSeekView$Companion$Type2, videoFastSeekView$Companion$Type3, videoFastSeekView$Companion$Type4};
        $VALUES = videoFastSeekView$Companion$TypeArr;
        $ENTRIES = new asp(videoFastSeekView$Companion$TypeArr);
    }

    public VideoFastSeekView$Companion$Type() {
        throw null;
    }

    public static VideoFastSeekView$Companion$Type valueOf(String str) {
        return (VideoFastSeekView$Companion$Type) Enum.valueOf(VideoFastSeekView$Companion$Type.class, str);
    }

    public static VideoFastSeekView$Companion$Type[] values() {
        return (VideoFastSeekView$Companion$Type[]) $VALUES.clone();
    }
}
