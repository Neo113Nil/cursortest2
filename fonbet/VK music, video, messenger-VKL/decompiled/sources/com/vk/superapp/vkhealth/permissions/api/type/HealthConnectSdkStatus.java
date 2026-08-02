package com.vk.superapp.vkhealth.permissions.api.type;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HealthConnectSdkStatus.kt */
/* loaded from: classes11.dex */
public final class HealthConnectSdkStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HealthConnectSdkStatus[] $VALUES;
    public static final HealthConnectSdkStatus AVAILABLE;
    public static final HealthConnectSdkStatus NEED_INSTALL;
    public static final HealthConnectSdkStatus NEED_MANDATORY_UPDATE;
    public static final HealthConnectSdkStatus UNAVAILABLE;
    public static final HealthConnectSdkStatus UNAVAILABLE_TIMEOUT;
    private final String status;

    static {
        HealthConnectSdkStatus healthConnectSdkStatus = new HealthConnectSdkStatus("UNAVAILABLE", 0, "unavailable");
        UNAVAILABLE = healthConnectSdkStatus;
        HealthConnectSdkStatus healthConnectSdkStatus2 = new HealthConnectSdkStatus("AVAILABLE", 1, "available");
        AVAILABLE = healthConnectSdkStatus2;
        HealthConnectSdkStatus healthConnectSdkStatus3 = new HealthConnectSdkStatus("NEED_MANDATORY_UPDATE", 2, "need_update");
        NEED_MANDATORY_UPDATE = healthConnectSdkStatus3;
        HealthConnectSdkStatus healthConnectSdkStatus4 = new HealthConnectSdkStatus("NEED_INSTALL", 3, "need_install");
        NEED_INSTALL = healthConnectSdkStatus4;
        HealthConnectSdkStatus healthConnectSdkStatus5 = new HealthConnectSdkStatus("UNAVAILABLE_TIMEOUT", 4, "unavailable_timeout");
        UNAVAILABLE_TIMEOUT = healthConnectSdkStatus5;
        HealthConnectSdkStatus[] healthConnectSdkStatusArr = {healthConnectSdkStatus, healthConnectSdkStatus2, healthConnectSdkStatus3, healthConnectSdkStatus4, healthConnectSdkStatus5};
        $VALUES = healthConnectSdkStatusArr;
        $ENTRIES = new asp(healthConnectSdkStatusArr);
    }

    public HealthConnectSdkStatus(String str, int i, String str2) {
        this.status = str2;
    }

    public static HealthConnectSdkStatus valueOf(String str) {
        return (HealthConnectSdkStatus) Enum.valueOf(HealthConnectSdkStatus.class, str);
    }

    public static HealthConnectSdkStatus[] values() {
        return (HealthConnectSdkStatus[]) $VALUES.clone();
    }

    public final String h() {
        return this.status;
    }
}
