package com.vk.media;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MediaFilteringStrategy.kt */
/* loaded from: classes3.dex */
public final class MediaFilteringStrategy {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MediaFilteringStrategy[] $VALUES;
    public static final MediaFilteringStrategy ANY_VIDEO;
    public static final MediaFilteringStrategy ANY_VIDEO_WITH_AUDIO;
    public static final a Companion;
    public static final MediaFilteringStrategy NONE;
    public static final MediaFilteringStrategy VIDEO_AVC;
    public static final MediaFilteringStrategy VIDEO_AVC_HEVC;

    /* compiled from: MediaFilteringStrategy.kt */
    public static final class a {
    }

    static {
        MediaFilteringStrategy mediaFilteringStrategy = new MediaFilteringStrategy("NONE", 0);
        NONE = mediaFilteringStrategy;
        MediaFilteringStrategy mediaFilteringStrategy2 = new MediaFilteringStrategy("ANY_VIDEO", 1);
        ANY_VIDEO = mediaFilteringStrategy2;
        MediaFilteringStrategy mediaFilteringStrategy3 = new MediaFilteringStrategy("VIDEO_AVC", 2);
        VIDEO_AVC = mediaFilteringStrategy3;
        MediaFilteringStrategy mediaFilteringStrategy4 = new MediaFilteringStrategy("VIDEO_AVC_HEVC", 3);
        VIDEO_AVC_HEVC = mediaFilteringStrategy4;
        MediaFilteringStrategy mediaFilteringStrategy5 = new MediaFilteringStrategy("ANY_VIDEO_WITH_AUDIO", 4);
        ANY_VIDEO_WITH_AUDIO = mediaFilteringStrategy5;
        MediaFilteringStrategy[] mediaFilteringStrategyArr = {mediaFilteringStrategy, mediaFilteringStrategy2, mediaFilteringStrategy3, mediaFilteringStrategy4, mediaFilteringStrategy5};
        $VALUES = mediaFilteringStrategyArr;
        $ENTRIES = new asp(mediaFilteringStrategyArr);
        Companion = new a();
    }

    public MediaFilteringStrategy() {
        throw null;
    }

    public static MediaFilteringStrategy valueOf(String str) {
        return (MediaFilteringStrategy) Enum.valueOf(MediaFilteringStrategy.class, str);
    }

    public static MediaFilteringStrategy[] values() {
        return (MediaFilteringStrategy[]) $VALUES.clone();
    }
}
