package com.vk.mediastore.media;

import xsna.asp;
import xsna.r7s0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoCacheIdImpl.kt */
/* loaded from: classes.dex */
public final class VideoCacheIdImpl implements r7s0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoCacheIdImpl[] $VALUES;
    public static final VideoCacheIdImpl MESSAGES;
    public static final VideoCacheIdImpl STORY;
    public static final VideoCacheIdImpl VIDEOS;
    private final String id;

    static {
        VideoCacheIdImpl videoCacheIdImpl = new VideoCacheIdImpl("VIDEOS", 0, "videos");
        VIDEOS = videoCacheIdImpl;
        VideoCacheIdImpl videoCacheIdImpl2 = new VideoCacheIdImpl("MESSAGES", 1, "messages");
        MESSAGES = videoCacheIdImpl2;
        VideoCacheIdImpl videoCacheIdImpl3 = new VideoCacheIdImpl("STORY", 2, "story");
        STORY = videoCacheIdImpl3;
        VideoCacheIdImpl[] videoCacheIdImplArr = {videoCacheIdImpl, videoCacheIdImpl2, videoCacheIdImpl3};
        $VALUES = videoCacheIdImplArr;
        $ENTRIES = new asp(videoCacheIdImplArr);
    }

    public VideoCacheIdImpl(String str, int i, String str2) {
        this.id = str2;
    }

    public static VideoCacheIdImpl valueOf(String str) {
        return (VideoCacheIdImpl) Enum.valueOf(VideoCacheIdImpl.class, str);
    }

    public static VideoCacheIdImpl[] values() {
        return (VideoCacheIdImpl[]) $VALUES.clone();
    }

    @Override // xsna.r7s0
    public final String getId() {
        return this.id;
    }
}
