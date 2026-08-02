package com.vk.dto.common;

import java.util.NoSuchElementException;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DownloadState.kt */
/* loaded from: classes18.dex */
public final class DownloadState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DownloadState[] $VALUES;
    public static final a Companion;
    public static final DownloadState DOWNLOADED;
    public static final DownloadState DOWNLOADING;
    public static final DownloadState DOWNLOAD_REQUIRED;
    private final int id;

    /* compiled from: DownloadState.kt */
    public static final class a {
        public static DownloadState a(int i) {
            for (DownloadState downloadState : DownloadState.values()) {
                if (downloadState.h() == i) {
                    return downloadState;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    static {
        DownloadState downloadState = new DownloadState("DOWNLOADED", 0, 0);
        DOWNLOADED = downloadState;
        DownloadState downloadState2 = new DownloadState("DOWNLOADING", 1, 1);
        DOWNLOADING = downloadState2;
        DownloadState downloadState3 = new DownloadState("DOWNLOAD_REQUIRED", 2, 2);
        DOWNLOAD_REQUIRED = downloadState3;
        DownloadState[] downloadStateArr = {downloadState, downloadState2, downloadState3};
        $VALUES = downloadStateArr;
        $ENTRIES = new asp(downloadStateArr);
        Companion = new a();
    }

    public DownloadState(String str, int i, int i2) {
        this.id = i2;
    }

    public static DownloadState valueOf(String str) {
        return (DownloadState) Enum.valueOf(DownloadState.class, str);
    }

    public static DownloadState[] values() {
        return (DownloadState[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
