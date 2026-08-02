package com.vk.libvideo.api.seek.tracker;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoSeekEventSource.kt */
/* loaded from: classes2.dex */
public final class VideoSeekEventSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoSeekEventSource[] $VALUES;
    public static final VideoSeekEventSource DoubleTap;
    public static final VideoSeekEventSource Episode;
    public static final VideoSeekEventSource FastSeek;
    public static final VideoSeekEventSource Live;
    public static final VideoSeekEventSource PreciseSlider;
    public static final VideoSeekEventSource Slider;

    static {
        VideoSeekEventSource videoSeekEventSource = new VideoSeekEventSource("Slider", 0);
        Slider = videoSeekEventSource;
        VideoSeekEventSource videoSeekEventSource2 = new VideoSeekEventSource("PreciseSlider", 1);
        PreciseSlider = videoSeekEventSource2;
        VideoSeekEventSource videoSeekEventSource3 = new VideoSeekEventSource("DoubleTap", 2);
        DoubleTap = videoSeekEventSource3;
        VideoSeekEventSource videoSeekEventSource4 = new VideoSeekEventSource("Episode", 3);
        Episode = videoSeekEventSource4;
        VideoSeekEventSource videoSeekEventSource5 = new VideoSeekEventSource("Live", 4);
        Live = videoSeekEventSource5;
        VideoSeekEventSource videoSeekEventSource6 = new VideoSeekEventSource("FastSeek", 5);
        FastSeek = videoSeekEventSource6;
        VideoSeekEventSource[] videoSeekEventSourceArr = {videoSeekEventSource, videoSeekEventSource2, videoSeekEventSource3, videoSeekEventSource4, videoSeekEventSource5, videoSeekEventSource6};
        $VALUES = videoSeekEventSourceArr;
        $ENTRIES = new asp(videoSeekEventSourceArr);
    }

    public VideoSeekEventSource() {
        throw null;
    }

    public static VideoSeekEventSource valueOf(String str) {
        return (VideoSeekEventSource) Enum.valueOf(VideoSeekEventSource.class, str);
    }

    public static VideoSeekEventSource[] values() {
        return (VideoSeekEventSource[]) $VALUES.clone();
    }
}
