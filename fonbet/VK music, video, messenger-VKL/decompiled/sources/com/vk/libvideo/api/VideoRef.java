package com.vk.libvideo.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoRef.kt */
/* loaded from: classes2.dex */
public final class VideoRef {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoRef[] $VALUES;
    public static final VideoRef CREATE_NEW_ALBUM;
    private final String value = "create_new_album";

    static {
        VideoRef videoRef = new VideoRef();
        CREATE_NEW_ALBUM = videoRef;
        VideoRef[] videoRefArr = {videoRef};
        $VALUES = videoRefArr;
        $ENTRIES = new asp(videoRefArr);
    }

    public static VideoRef valueOf(String str) {
        return (VideoRef) Enum.valueOf(VideoRef.class, str);
    }

    public static VideoRef[] values() {
        return (VideoRef[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
