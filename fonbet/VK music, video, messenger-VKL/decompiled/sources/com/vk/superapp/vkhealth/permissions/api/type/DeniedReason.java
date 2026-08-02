package com.vk.superapp.vkhealth.permissions.api.type;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HealthConnectPermissionsStatus.kt */
/* loaded from: classes11.dex */
public final class DeniedReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DeniedReason[] $VALUES;
    public static final DeniedReason EXCEPTION;
    public static final DeniedReason GRANTED_PERMISSION_EMPTY;
    public static final DeniedReason HC_NOT_INSTALLED;
    public static final DeniedReason SDK_UNAVAILABLE;

    static {
        DeniedReason deniedReason = new DeniedReason("HC_NOT_INSTALLED", 0);
        HC_NOT_INSTALLED = deniedReason;
        DeniedReason deniedReason2 = new DeniedReason("SDK_UNAVAILABLE", 1);
        SDK_UNAVAILABLE = deniedReason2;
        DeniedReason deniedReason3 = new DeniedReason("EXCEPTION", 2);
        EXCEPTION = deniedReason3;
        DeniedReason deniedReason4 = new DeniedReason("GRANTED_PERMISSION_EMPTY", 3);
        GRANTED_PERMISSION_EMPTY = deniedReason4;
        DeniedReason[] deniedReasonArr = {deniedReason, deniedReason2, deniedReason3, deniedReason4};
        $VALUES = deniedReasonArr;
        $ENTRIES = new asp(deniedReasonArr);
    }

    public DeniedReason() {
        throw null;
    }

    public static DeniedReason valueOf(String str) {
        return (DeniedReason) Enum.valueOf(DeniedReason.class, str);
    }

    public static DeniedReason[] values() {
        return (DeniedReason[]) $VALUES.clone();
    }
}
