package com.vk.dto.common;

import com.vk.core.apps.BuildInfo;
import java.util.Iterator;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoCanDownload.kt */
/* loaded from: classes18.dex */
public final class VideoCanDownload {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoCanDownload[] $VALUES;
    public static final VideoCanDownload CACHE;
    public static final VideoCanDownload CACHE_AND_FILE;
    public static final a Companion;
    public static final VideoCanDownload FILE;
    public static final VideoCanDownload NO;
    private final int value;

    /* compiled from: VideoCanDownload.kt */
    public static final class a {
        public static VideoCanDownload a(int i) {
            Object obj;
            Iterator<E> it = VideoCanDownload.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((VideoCanDownload) obj).i() == (i & 3)) {
                    break;
                }
            }
            VideoCanDownload videoCanDownload = (VideoCanDownload) obj;
            return videoCanDownload == null ? VideoCanDownload.NO : videoCanDownload;
        }
    }

    static {
        VideoCanDownload videoCanDownload = new VideoCanDownload("NO", 0, 0);
        NO = videoCanDownload;
        VideoCanDownload videoCanDownload2 = new VideoCanDownload("CACHE", 1, 1);
        CACHE = videoCanDownload2;
        VideoCanDownload videoCanDownload3 = new VideoCanDownload("FILE", 2, 2);
        FILE = videoCanDownload3;
        VideoCanDownload videoCanDownload4 = new VideoCanDownload("CACHE_AND_FILE", 3, 3);
        CACHE_AND_FILE = videoCanDownload4;
        VideoCanDownload[] videoCanDownloadArr = {videoCanDownload, videoCanDownload2, videoCanDownload3, videoCanDownload4};
        $VALUES = videoCanDownloadArr;
        $ENTRIES = new asp(videoCanDownloadArr);
        Companion = new a();
    }

    public VideoCanDownload(String str, int i, int i2) {
        this.value = i2;
    }

    public static zrp<VideoCanDownload> h() {
        return $ENTRIES;
    }

    public static VideoCanDownload valueOf(String str) {
        return (VideoCanDownload) Enum.valueOf(VideoCanDownload.class, str);
    }

    public static VideoCanDownload[] values() {
        return (VideoCanDownload[]) $VALUES.clone();
    }

    public final int i() {
        return this.value;
    }

    public final boolean j() {
        if (this != FILE) {
            return (BuildInfo.t() || BuildInfo.g()) && this == CACHE_AND_FILE;
        }
        return true;
    }
}
