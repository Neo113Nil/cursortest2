package com.vk.superapp.bridges.dto.analytics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkHealthSyncEvent.kt */
/* loaded from: classes6.dex */
public final class HealthDataProvider {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HealthDataProvider[] $VALUES;
    public static final HealthDataProvider GOOGLE_FIT;
    public static final HealthDataProvider HEALTH_CONNECT;
    public static final HealthDataProvider HUAWEI_HEALTH;

    static {
        HealthDataProvider healthDataProvider = new HealthDataProvider("GOOGLE_FIT", 0);
        GOOGLE_FIT = healthDataProvider;
        HealthDataProvider healthDataProvider2 = new HealthDataProvider("HUAWEI_HEALTH", 1);
        HUAWEI_HEALTH = healthDataProvider2;
        HealthDataProvider healthDataProvider3 = new HealthDataProvider("HEALTH_CONNECT", 2);
        HEALTH_CONNECT = healthDataProvider3;
        HealthDataProvider[] healthDataProviderArr = {healthDataProvider, healthDataProvider2, healthDataProvider3};
        $VALUES = healthDataProviderArr;
        $ENTRIES = new asp(healthDataProviderArr);
    }

    public HealthDataProvider() {
        throw null;
    }

    public static HealthDataProvider valueOf(String str) {
        return (HealthDataProvider) Enum.valueOf(HealthDataProvider.class, str);
    }

    public static HealthDataProvider[] values() {
        return (HealthDataProvider[]) $VALUES.clone();
    }
}
