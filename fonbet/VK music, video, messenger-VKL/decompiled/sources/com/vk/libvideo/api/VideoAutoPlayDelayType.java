package com.vk.libvideo.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoAutoPlayDelayType.kt */
/* loaded from: classes2.dex */
public final class VideoAutoPlayDelayType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoAutoPlayDelayType[] $VALUES;
    public static final VideoAutoPlayDelayType CATALOG;
    public static final VideoAutoPlayDelayType DISCOVER;
    public static final VideoAutoPlayDelayType FEED;
    public static final VideoAutoPlayDelayType FEED_RECOMMENDED;
    public static final VideoAutoPlayDelayType POST;
    public static final VideoAutoPlayDelayType SEARCH_VIDEO;
    public static final VideoAutoPlayDelayType WALL;

    /* compiled from: VideoAutoPlayDelayType.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoAutoPlayDelayType.values().length];
            try {
                iArr[VideoAutoPlayDelayType.CATALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoAutoPlayDelayType.FEED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoAutoPlayDelayType.FEED_RECOMMENDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoAutoPlayDelayType.WALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoAutoPlayDelayType.DISCOVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VideoAutoPlayDelayType.POST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VideoAutoPlayDelayType.SEARCH_VIDEO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        VideoAutoPlayDelayType videoAutoPlayDelayType = new VideoAutoPlayDelayType("CATALOG", 0);
        CATALOG = videoAutoPlayDelayType;
        VideoAutoPlayDelayType videoAutoPlayDelayType2 = new VideoAutoPlayDelayType("FEED", 1);
        FEED = videoAutoPlayDelayType2;
        VideoAutoPlayDelayType videoAutoPlayDelayType3 = new VideoAutoPlayDelayType("FEED_RECOMMENDED", 2);
        FEED_RECOMMENDED = videoAutoPlayDelayType3;
        VideoAutoPlayDelayType videoAutoPlayDelayType4 = new VideoAutoPlayDelayType("WALL", 3);
        WALL = videoAutoPlayDelayType4;
        VideoAutoPlayDelayType videoAutoPlayDelayType5 = new VideoAutoPlayDelayType("DISCOVER", 4);
        DISCOVER = videoAutoPlayDelayType5;
        VideoAutoPlayDelayType videoAutoPlayDelayType6 = new VideoAutoPlayDelayType("POST", 5);
        POST = videoAutoPlayDelayType6;
        VideoAutoPlayDelayType videoAutoPlayDelayType7 = new VideoAutoPlayDelayType("SEARCH_VIDEO", 6);
        SEARCH_VIDEO = videoAutoPlayDelayType7;
        VideoAutoPlayDelayType[] videoAutoPlayDelayTypeArr = {videoAutoPlayDelayType, videoAutoPlayDelayType2, videoAutoPlayDelayType3, videoAutoPlayDelayType4, videoAutoPlayDelayType5, videoAutoPlayDelayType6, videoAutoPlayDelayType7};
        $VALUES = videoAutoPlayDelayTypeArr;
        $ENTRIES = new asp(videoAutoPlayDelayTypeArr);
    }

    public VideoAutoPlayDelayType() {
        throw null;
    }

    public static VideoAutoPlayDelayType valueOf(String str) {
        return (VideoAutoPlayDelayType) Enum.valueOf(VideoAutoPlayDelayType.class, str);
    }

    public static VideoAutoPlayDelayType[] values() {
        return (VideoAutoPlayDelayType[]) $VALUES.clone();
    }
}
