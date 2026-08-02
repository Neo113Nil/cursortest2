package com.vk.libvideo.adfree.api.domain.objects;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoAdFreeTrapEventTrigger.kt */
/* loaded from: classes18.dex */
public final class VideoAdFreeTrapEventTrigger {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoAdFreeTrapEventTrigger[] $VALUES;
    public static final VideoAdFreeTrapEventTrigger AD_END;
    public static final VideoAdFreeTrapEventTrigger AD_SKIP;
    public static final VideoAdFreeTrapEventTrigger AD_START;
    public static final VideoAdFreeTrapEventTrigger APP_START;
    public static final VideoAdFreeTrapEventTrigger DISCOVERY_START;
    public static final VideoAdFreeTrapEventTrigger VIDEO_TAB_START;

    static {
        VideoAdFreeTrapEventTrigger videoAdFreeTrapEventTrigger = new VideoAdFreeTrapEventTrigger("APP_START", 0);
        APP_START = videoAdFreeTrapEventTrigger;
        VideoAdFreeTrapEventTrigger videoAdFreeTrapEventTrigger2 = new VideoAdFreeTrapEventTrigger("DISCOVERY_START", 1);
        DISCOVERY_START = videoAdFreeTrapEventTrigger2;
        VideoAdFreeTrapEventTrigger videoAdFreeTrapEventTrigger3 = new VideoAdFreeTrapEventTrigger("AD_SKIP", 2);
        AD_SKIP = videoAdFreeTrapEventTrigger3;
        VideoAdFreeTrapEventTrigger videoAdFreeTrapEventTrigger4 = new VideoAdFreeTrapEventTrigger("AD_START", 3);
        AD_START = videoAdFreeTrapEventTrigger4;
        VideoAdFreeTrapEventTrigger videoAdFreeTrapEventTrigger5 = new VideoAdFreeTrapEventTrigger("AD_END", 4);
        AD_END = videoAdFreeTrapEventTrigger5;
        VideoAdFreeTrapEventTrigger videoAdFreeTrapEventTrigger6 = new VideoAdFreeTrapEventTrigger("VIDEO_TAB_START", 5);
        VIDEO_TAB_START = videoAdFreeTrapEventTrigger6;
        VideoAdFreeTrapEventTrigger[] videoAdFreeTrapEventTriggerArr = {videoAdFreeTrapEventTrigger, videoAdFreeTrapEventTrigger2, videoAdFreeTrapEventTrigger3, videoAdFreeTrapEventTrigger4, videoAdFreeTrapEventTrigger5, videoAdFreeTrapEventTrigger6};
        $VALUES = videoAdFreeTrapEventTriggerArr;
        $ENTRIES = new asp(videoAdFreeTrapEventTriggerArr);
    }

    public VideoAdFreeTrapEventTrigger() {
        throw null;
    }

    public static VideoAdFreeTrapEventTrigger valueOf(String str) {
        return (VideoAdFreeTrapEventTrigger) Enum.valueOf(VideoAdFreeTrapEventTrigger.class, str);
    }

    public static VideoAdFreeTrapEventTrigger[] values() {
        return (VideoAdFreeTrapEventTrigger[]) $VALUES.clone();
    }
}
