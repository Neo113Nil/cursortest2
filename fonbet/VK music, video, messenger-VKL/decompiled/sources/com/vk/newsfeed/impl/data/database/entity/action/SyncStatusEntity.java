package com.vk.newsfeed.impl.data.database.entity.action;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SyncStatusEntity.kt */
/* loaded from: classes.dex */
public final class SyncStatusEntity {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SyncStatusEntity[] $VALUES;
    public static final SyncStatusEntity NOT_SYNCED;
    public static final SyncStatusEntity SYNCED;
    public static final SyncStatusEntity SYNC_IN_PROGRESS;
    private final String value;

    static {
        SyncStatusEntity syncStatusEntity = new SyncStatusEntity("NOT_SYNCED", 0, "not_synced");
        NOT_SYNCED = syncStatusEntity;
        SyncStatusEntity syncStatusEntity2 = new SyncStatusEntity("SYNC_IN_PROGRESS", 1, "sync_in_progress");
        SYNC_IN_PROGRESS = syncStatusEntity2;
        SyncStatusEntity syncStatusEntity3 = new SyncStatusEntity("SYNCED", 2, "synced");
        SYNCED = syncStatusEntity3;
        SyncStatusEntity[] syncStatusEntityArr = {syncStatusEntity, syncStatusEntity2, syncStatusEntity3};
        $VALUES = syncStatusEntityArr;
        $ENTRIES = new asp(syncStatusEntityArr);
    }

    public SyncStatusEntity(String str, int i, String str2) {
        this.value = str2;
    }

    public static SyncStatusEntity valueOf(String str) {
        return (SyncStatusEntity) Enum.valueOf(SyncStatusEntity.class, str);
    }

    public static SyncStatusEntity[] values() {
        return (SyncStatusEntity[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
