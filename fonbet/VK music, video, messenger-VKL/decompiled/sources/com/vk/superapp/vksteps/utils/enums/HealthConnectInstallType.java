package com.vk.superapp.vksteps.utils.enums;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HealthConnectInstallType.kt */
/* loaded from: classes6.dex */
public final class HealthConnectInstallType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HealthConnectInstallType[] $VALUES;
    public static final HealthConnectInstallType NOT_INSTALLED;
    public static final HealthConnectInstallType PLAY_STORE;
    public static final HealthConnectInstallType SYSTEM_PREINSTALLED;
    public static final HealthConnectInstallType UNKNOWN_SOURCE;

    static {
        HealthConnectInstallType healthConnectInstallType = new HealthConnectInstallType("SYSTEM_PREINSTALLED", 0);
        SYSTEM_PREINSTALLED = healthConnectInstallType;
        HealthConnectInstallType healthConnectInstallType2 = new HealthConnectInstallType("PLAY_STORE", 1);
        PLAY_STORE = healthConnectInstallType2;
        HealthConnectInstallType healthConnectInstallType3 = new HealthConnectInstallType("UNKNOWN_SOURCE", 2);
        UNKNOWN_SOURCE = healthConnectInstallType3;
        HealthConnectInstallType healthConnectInstallType4 = new HealthConnectInstallType("NOT_INSTALLED", 3);
        NOT_INSTALLED = healthConnectInstallType4;
        HealthConnectInstallType[] healthConnectInstallTypeArr = {healthConnectInstallType, healthConnectInstallType2, healthConnectInstallType3, healthConnectInstallType4};
        $VALUES = healthConnectInstallTypeArr;
        $ENTRIES = new asp(healthConnectInstallTypeArr);
    }

    public HealthConnectInstallType() {
        throw null;
    }

    public static HealthConnectInstallType valueOf(String str) {
        return (HealthConnectInstallType) Enum.valueOf(HealthConnectInstallType.class, str);
    }

    public static HealthConnectInstallType[] values() {
        return (HealthConnectInstallType[]) $VALUES.clone();
    }
}
