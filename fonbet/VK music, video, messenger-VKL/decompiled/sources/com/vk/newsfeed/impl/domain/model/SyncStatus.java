package com.vk.newsfeed.impl.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionWithOfflineSupport.kt */
/* loaded from: classes4.dex */
public final class SyncStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SyncStatus[] $VALUES;
    public static final SyncStatus NOT_SYNCED;
    public static final SyncStatus SYNCED;
    public static final SyncStatus SYNC_IN_PROGRESS;

    static {
        SyncStatus syncStatus = new SyncStatus("NOT_SYNCED", 0);
        NOT_SYNCED = syncStatus;
        SyncStatus syncStatus2 = new SyncStatus("SYNC_IN_PROGRESS", 1);
        SYNC_IN_PROGRESS = syncStatus2;
        SyncStatus syncStatus3 = new SyncStatus("SYNCED", 2);
        SYNCED = syncStatus3;
        SyncStatus[] syncStatusArr = {syncStatus, syncStatus2, syncStatus3};
        $VALUES = syncStatusArr;
        $ENTRIES = new asp(syncStatusArr);
    }

    public SyncStatus() {
        throw null;
    }

    public static SyncStatus valueOf(String str) {
        return (SyncStatus) Enum.valueOf(SyncStatus.class, str);
    }

    public static SyncStatus[] values() {
        return (SyncStatus[]) $VALUES.clone();
    }
}
