package com.vk.im.engine.models.sync;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SyncStopCause.kt */
/* loaded from: classes2.dex */
public final class SyncStopCause {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SyncStopCause[] $VALUES;
    public static final SyncStopCause APP_PAUSE;
    public static final a Companion;
    public static final SyncStopCause DEFERRED_SYNC;
    public static final SyncStopCause EXCLUDED_FROM_COMPANION;
    public static final SyncStopCause PUSH;
    private static final SyncStopCause[] VALUES;
    private final String id;

    /* compiled from: SyncStopCause.kt */
    public static final class a {
    }

    static {
        SyncStopCause syncStopCause = new SyncStopCause("APP_PAUSE", 0, "app_pause");
        APP_PAUSE = syncStopCause;
        SyncStopCause syncStopCause2 = new SyncStopCause("PUSH", 1, "push");
        PUSH = syncStopCause2;
        SyncStopCause syncStopCause3 = new SyncStopCause("EXCLUDED_FROM_COMPANION", 2, "excluded_from_companion");
        EXCLUDED_FROM_COMPANION = syncStopCause3;
        SyncStopCause syncStopCause4 = new SyncStopCause("DEFERRED_SYNC", 3, "deferred_sync");
        DEFERRED_SYNC = syncStopCause4;
        SyncStopCause[] syncStopCauseArr = {syncStopCause, syncStopCause2, syncStopCause3, syncStopCause4};
        $VALUES = syncStopCauseArr;
        $ENTRIES = new asp(syncStopCauseArr);
        Companion = new a();
        VALUES = values();
    }

    public SyncStopCause(String str, int i, String str2) {
        this.id = str2;
    }

    public static SyncStopCause valueOf(String str) {
        return (SyncStopCause) Enum.valueOf(SyncStopCause.class, str);
    }

    public static SyncStopCause[] values() {
        return (SyncStopCause[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }
}
