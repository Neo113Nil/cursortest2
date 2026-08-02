package com.vk.superapp.bridges.dto.analytics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkHealthSyncEvent.kt */
/* loaded from: classes6.dex */
public final class HealthSyncState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HealthSyncState[] $VALUES;
    public static final HealthSyncState API_SYNC_ERROR;
    public static final HealthSyncState HEALTH_PROVIDER_ERROR;
    public static final HealthSyncState NO_DATA_CHANGES;
    public static final HealthSyncState SUCCESS;

    static {
        HealthSyncState healthSyncState = new HealthSyncState("SUCCESS", 0);
        SUCCESS = healthSyncState;
        HealthSyncState healthSyncState2 = new HealthSyncState("HEALTH_PROVIDER_ERROR", 1);
        HEALTH_PROVIDER_ERROR = healthSyncState2;
        HealthSyncState healthSyncState3 = new HealthSyncState("API_SYNC_ERROR", 2);
        API_SYNC_ERROR = healthSyncState3;
        HealthSyncState healthSyncState4 = new HealthSyncState("NO_DATA_CHANGES", 3);
        NO_DATA_CHANGES = healthSyncState4;
        HealthSyncState[] healthSyncStateArr = {healthSyncState, healthSyncState2, healthSyncState3, healthSyncState4};
        $VALUES = healthSyncStateArr;
        $ENTRIES = new asp(healthSyncStateArr);
    }

    public HealthSyncState() {
        throw null;
    }

    public static HealthSyncState valueOf(String str) {
        return (HealthSyncState) Enum.valueOf(HealthSyncState.class, str);
    }

    public static HealthSyncState[] values() {
        return (HealthSyncState[]) $VALUES.clone();
    }
}
