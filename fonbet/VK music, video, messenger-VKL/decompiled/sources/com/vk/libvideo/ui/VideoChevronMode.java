package com.vk.libvideo.ui;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoChevronMode.kt */
/* loaded from: classes3.dex */
public final class VideoChevronMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoChevronMode[] $VALUES;
    public static final VideoChevronMode Minimize;
    public static final VideoChevronMode Pip;

    static {
        VideoChevronMode videoChevronMode = new VideoChevronMode("Pip", 0);
        Pip = videoChevronMode;
        VideoChevronMode videoChevronMode2 = new VideoChevronMode("Minimize", 1);
        Minimize = videoChevronMode2;
        VideoChevronMode[] videoChevronModeArr = {videoChevronMode, videoChevronMode2};
        $VALUES = videoChevronModeArr;
        $ENTRIES = new asp(videoChevronModeArr);
    }

    public VideoChevronMode() {
        throw null;
    }

    public static VideoChevronMode valueOf(String str) {
        return (VideoChevronMode) Enum.valueOf(VideoChevronMode.class, str);
    }

    public static VideoChevronMode[] values() {
        return (VideoChevronMode[]) $VALUES.clone();
    }
}
