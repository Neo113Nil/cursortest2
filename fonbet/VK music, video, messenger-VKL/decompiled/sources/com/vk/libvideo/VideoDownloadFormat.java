package com.vk.libvideo;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoDownloadFormat.kt */
/* loaded from: classes17.dex */
public final class VideoDownloadFormat {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoDownloadFormat[] $VALUES;
    public static final VideoDownloadFormat DASH;
    public static final VideoDownloadFormat HLS;
    public static final VideoDownloadFormat MP4;

    static {
        VideoDownloadFormat videoDownloadFormat = new VideoDownloadFormat("DASH", 0);
        DASH = videoDownloadFormat;
        VideoDownloadFormat videoDownloadFormat2 = new VideoDownloadFormat("HLS", 1);
        HLS = videoDownloadFormat2;
        VideoDownloadFormat videoDownloadFormat3 = new VideoDownloadFormat("MP4", 2);
        MP4 = videoDownloadFormat3;
        VideoDownloadFormat[] videoDownloadFormatArr = {videoDownloadFormat, videoDownloadFormat2, videoDownloadFormat3};
        $VALUES = videoDownloadFormatArr;
        $ENTRIES = new asp(videoDownloadFormatArr);
    }

    public VideoDownloadFormat() {
        throw null;
    }

    public static VideoDownloadFormat valueOf(String str) {
        return (VideoDownloadFormat) Enum.valueOf(VideoDownloadFormat.class, str);
    }

    public static VideoDownloadFormat[] values() {
        return (VideoDownloadFormat[]) $VALUES.clone();
    }
}
