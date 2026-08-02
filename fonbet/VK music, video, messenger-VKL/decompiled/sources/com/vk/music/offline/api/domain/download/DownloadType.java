package com.vk.music.offline.api.domain.download;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DownloadType.kt */
/* loaded from: classes3.dex */
public final class DownloadType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DownloadType[] $VALUES;
    public static final DownloadType AUDIO_BOOK_CHAPTER;
    public static final DownloadType MUSIC_TRACK;
    public static final DownloadType PODCAST_EPISODE;

    static {
        DownloadType downloadType = new DownloadType("MUSIC_TRACK", 0);
        MUSIC_TRACK = downloadType;
        DownloadType downloadType2 = new DownloadType("AUDIO_BOOK_CHAPTER", 1);
        AUDIO_BOOK_CHAPTER = downloadType2;
        DownloadType downloadType3 = new DownloadType("PODCAST_EPISODE", 2);
        PODCAST_EPISODE = downloadType3;
        DownloadType[] downloadTypeArr = {downloadType, downloadType2, downloadType3};
        $VALUES = downloadTypeArr;
        $ENTRIES = new asp(downloadTypeArr);
    }

    public DownloadType() {
        throw null;
    }

    public static DownloadType valueOf(String str) {
        return (DownloadType) Enum.valueOf(DownloadType.class, str);
    }

    public static DownloadType[] values() {
        return (DownloadType[]) $VALUES.clone();
    }
}
