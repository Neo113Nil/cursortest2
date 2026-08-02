package com.vk.music.offline.api.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DownloadType.kt */
/* loaded from: classes3.dex */
public final class DownloadType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DownloadType[] $VALUES;
    public static final DownloadType ANY;
    public static final DownloadType DOWNLOADED;

    static {
        DownloadType downloadType = new DownloadType("ANY", 0);
        ANY = downloadType;
        DownloadType downloadType2 = new DownloadType("DOWNLOADED", 1);
        DOWNLOADED = downloadType2;
        DownloadType[] downloadTypeArr = {downloadType, downloadType2};
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
