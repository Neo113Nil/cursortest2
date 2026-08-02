package com.vk.im.engine.models.sync;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SyncStartCause.kt */
/* loaded from: classes.dex */
public final class SyncStartCause {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SyncStartCause[] $VALUES;
    public static final SyncStartCause APP_RESUME;
    public static final SyncStartCause APP_START;
    public static final a Companion;
    public static final SyncStartCause DEFERRED_SYNC;
    public static final SyncStartCause PUSH;
    private static final SyncStartCause[] VALUES;
    private final String id;

    /* compiled from: SyncStartCause.kt */
    public static final class a {
    }

    static {
        SyncStartCause syncStartCause = new SyncStartCause("APP_START", 0, "app_start");
        APP_START = syncStartCause;
        SyncStartCause syncStartCause2 = new SyncStartCause("APP_RESUME", 1, "app_resume");
        APP_RESUME = syncStartCause2;
        SyncStartCause syncStartCause3 = new SyncStartCause("PUSH", 2, "push");
        PUSH = syncStartCause3;
        SyncStartCause syncStartCause4 = new SyncStartCause("DEFERRED_SYNC", 3, "deferred_sync");
        DEFERRED_SYNC = syncStartCause4;
        SyncStartCause[] syncStartCauseArr = {syncStartCause, syncStartCause2, syncStartCause3, syncStartCause4};
        $VALUES = syncStartCauseArr;
        $ENTRIES = new asp(syncStartCauseArr);
        Companion = new a();
        VALUES = values();
    }

    public SyncStartCause(String str, int i, String str2) {
        this.id = str2;
    }

    public static SyncStartCause valueOf(String str) {
        return (SyncStartCause) Enum.valueOf(SyncStartCause.class, str);
    }

    public static SyncStartCause[] values() {
        return (SyncStartCause[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }
}
