package com.vk.superapp.vkhealth.permissions.api.type;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HealthConnectPermissionsStatus.kt */
/* loaded from: classes6.dex */
public final class HealthConnectPermissions {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HealthConnectPermissions[] $VALUES;
    public static final HealthConnectPermissions DISTANCE;
    public static final HealthConnectPermissions STEPS;
    public static final HealthConnectPermissions UNKNOWN;
    public static final HealthConnectPermissions WORKOUT;

    static {
        HealthConnectPermissions healthConnectPermissions = new HealthConnectPermissions("STEPS", 0);
        STEPS = healthConnectPermissions;
        HealthConnectPermissions healthConnectPermissions2 = new HealthConnectPermissions("DISTANCE", 1);
        DISTANCE = healthConnectPermissions2;
        HealthConnectPermissions healthConnectPermissions3 = new HealthConnectPermissions("WORKOUT", 2);
        WORKOUT = healthConnectPermissions3;
        HealthConnectPermissions healthConnectPermissions4 = new HealthConnectPermissions(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);
        UNKNOWN = healthConnectPermissions4;
        HealthConnectPermissions[] healthConnectPermissionsArr = {healthConnectPermissions, healthConnectPermissions2, healthConnectPermissions3, healthConnectPermissions4};
        $VALUES = healthConnectPermissionsArr;
        $ENTRIES = new asp(healthConnectPermissionsArr);
    }

    public HealthConnectPermissions() {
        throw null;
    }

    public static HealthConnectPermissions valueOf(String str) {
        return (HealthConnectPermissions) Enum.valueOf(HealthConnectPermissions.class, str);
    }

    public static HealthConnectPermissions[] values() {
        return (HealthConnectPermissions[]) $VALUES.clone();
    }
}
