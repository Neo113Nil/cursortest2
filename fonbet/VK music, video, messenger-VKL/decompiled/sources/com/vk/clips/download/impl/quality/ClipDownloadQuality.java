package com.vk.clips.download.impl.quality;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipDownloadQuality.kt */
/* loaded from: classes16.dex */
public final class ClipDownloadQuality {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipDownloadQuality[] $VALUES;
    public static final a Companion;
    public static final ClipDownloadQuality QUALITY_1080p;
    public static final ClipDownloadQuality QUALITY_480p;
    public static final ClipDownloadQuality QUALITY_720p;
    private final String quality;

    /* compiled from: ClipDownloadQuality.kt */
    public static final class a {
    }

    static {
        ClipDownloadQuality clipDownloadQuality = new ClipDownloadQuality("QUALITY_1080p", 0, "1080p");
        QUALITY_1080p = clipDownloadQuality;
        ClipDownloadQuality clipDownloadQuality2 = new ClipDownloadQuality("QUALITY_720p", 1, "720p");
        QUALITY_720p = clipDownloadQuality2;
        ClipDownloadQuality clipDownloadQuality3 = new ClipDownloadQuality("QUALITY_480p", 2, "480p");
        QUALITY_480p = clipDownloadQuality3;
        ClipDownloadQuality[] clipDownloadQualityArr = {clipDownloadQuality, clipDownloadQuality2, clipDownloadQuality3};
        $VALUES = clipDownloadQualityArr;
        $ENTRIES = new asp(clipDownloadQualityArr);
        Companion = new a();
    }

    public ClipDownloadQuality(String str, int i, String str2) {
        this.quality = str2;
    }

    public static ClipDownloadQuality valueOf(String str) {
        return (ClipDownloadQuality) Enum.valueOf(ClipDownloadQuality.class, str);
    }

    public static ClipDownloadQuality[] values() {
        return (ClipDownloadQuality[]) $VALUES.clone();
    }

    public final String h() {
        return this.quality;
    }
}
