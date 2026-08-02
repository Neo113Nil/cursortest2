package com.vk.update.core;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DownloadState.kt */
/* loaded from: classes6.dex */
public final class DownloadState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DownloadState[] $VALUES;
    public static final DownloadState DOWNLOADED;
    public static final DownloadState DOWNLOADING;
    public static final DownloadState NOT_LOADED;

    static {
        DownloadState downloadState = new DownloadState("DOWNLOADED", 0);
        DOWNLOADED = downloadState;
        DownloadState downloadState2 = new DownloadState("DOWNLOADING", 1);
        DOWNLOADING = downloadState2;
        DownloadState downloadState3 = new DownloadState("NOT_LOADED", 2);
        NOT_LOADED = downloadState3;
        DownloadState[] downloadStateArr = {downloadState, downloadState2, downloadState3};
        $VALUES = downloadStateArr;
        $ENTRIES = new asp(downloadStateArr);
    }

    public DownloadState() {
        throw null;
    }

    public static DownloadState valueOf(String str) {
        return (DownloadState) Enum.valueOf(DownloadState.class, str);
    }

    public static DownloadState[] values() {
        return (DownloadState[]) $VALUES.clone();
    }
}
