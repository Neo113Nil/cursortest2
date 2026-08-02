package com.vk.superapp.vkworkout.types;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SyncWorkoutReason.kt */
/* loaded from: classes6.dex */
public final class SyncWorkoutReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SyncWorkoutReason[] $VALUES;
    public static final SyncWorkoutReason APP_START;
    public static final SyncWorkoutReason BACKGROUND_SYNC;
    public static final SyncWorkoutReason BRIDGE_EVENT;
    public static final SyncWorkoutReason WIDGET_UPDATE;

    static {
        SyncWorkoutReason syncWorkoutReason = new SyncWorkoutReason("BRIDGE_EVENT", 0);
        BRIDGE_EVENT = syncWorkoutReason;
        SyncWorkoutReason syncWorkoutReason2 = new SyncWorkoutReason("BACKGROUND_SYNC", 1);
        BACKGROUND_SYNC = syncWorkoutReason2;
        SyncWorkoutReason syncWorkoutReason3 = new SyncWorkoutReason("WIDGET_UPDATE", 2);
        WIDGET_UPDATE = syncWorkoutReason3;
        SyncWorkoutReason syncWorkoutReason4 = new SyncWorkoutReason("APP_START", 3);
        APP_START = syncWorkoutReason4;
        SyncWorkoutReason[] syncWorkoutReasonArr = {syncWorkoutReason, syncWorkoutReason2, syncWorkoutReason3, syncWorkoutReason4};
        $VALUES = syncWorkoutReasonArr;
        $ENTRIES = new asp(syncWorkoutReasonArr);
    }

    public SyncWorkoutReason() {
        throw null;
    }

    public static SyncWorkoutReason valueOf(String str) {
        return (SyncWorkoutReason) Enum.valueOf(SyncWorkoutReason.class, str);
    }

    public static SyncWorkoutReason[] values() {
        return (SyncWorkoutReason[]) $VALUES.clone();
    }
}
