package com.vk.superapp.bridges.dto.analytics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkStepsResultPermissionItem.kt */
/* loaded from: classes6.dex */
public final class VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus[] $VALUES;
    public static final VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus AVAILABLE;
    public static final VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus NEED_INSTALL;
    public static final VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus NEED_UPDATE;
    public static final VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus UNAVAILABLE;
    public static final VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus UNAVAILABLE_TIMEOUT;

    static {
        VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus vkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus = new VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus("UNAVAILABLE", 0);
        UNAVAILABLE = vkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus;
        VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus vkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus2 = new VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus("AVAILABLE", 1);
        AVAILABLE = vkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus2;
        VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus vkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus3 = new VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus("NEED_UPDATE", 2);
        NEED_UPDATE = vkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus3;
        VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus vkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus4 = new VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus("NEED_INSTALL", 3);
        NEED_INSTALL = vkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus4;
        VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus vkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus5 = new VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus("UNAVAILABLE_TIMEOUT", 4);
        UNAVAILABLE_TIMEOUT = vkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus5;
        VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus[] vkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatusArr = {vkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus, vkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus2, vkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus3, vkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus4, vkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus5};
        $VALUES = vkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatusArr;
        $ENTRIES = new asp(vkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatusArr);
    }

    public VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus() {
        throw null;
    }

    public static VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus valueOf(String str) {
        return (VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus) Enum.valueOf(VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus.class, str);
    }

    public static VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus[] values() {
        return (VkStepsResultPermissionItem$HealthConnectInfo$HealthConnectSdkStatus[]) $VALUES.clone();
    }
}
