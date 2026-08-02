package com.vk.superapp.bridges.dto.analytics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkStepsResultPermissionItem.kt */
/* loaded from: classes6.dex */
public final class VkStepsResultPermissionItem$PermissionState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkStepsResultPermissionItem$PermissionState[] $VALUES;
    public static final VkStepsResultPermissionItem$PermissionState ERROR;
    public static final VkStepsResultPermissionItem$PermissionState PERMISSIONS_GRANTED;
    public static final VkStepsResultPermissionItem$PermissionState SOME_PERMISSIONS_DISABLED;

    static {
        VkStepsResultPermissionItem$PermissionState vkStepsResultPermissionItem$PermissionState = new VkStepsResultPermissionItem$PermissionState("PERMISSIONS_GRANTED", 0);
        PERMISSIONS_GRANTED = vkStepsResultPermissionItem$PermissionState;
        VkStepsResultPermissionItem$PermissionState vkStepsResultPermissionItem$PermissionState2 = new VkStepsResultPermissionItem$PermissionState("SOME_PERMISSIONS_DISABLED", 1);
        SOME_PERMISSIONS_DISABLED = vkStepsResultPermissionItem$PermissionState2;
        VkStepsResultPermissionItem$PermissionState vkStepsResultPermissionItem$PermissionState3 = new VkStepsResultPermissionItem$PermissionState("ERROR", 2);
        ERROR = vkStepsResultPermissionItem$PermissionState3;
        VkStepsResultPermissionItem$PermissionState[] vkStepsResultPermissionItem$PermissionStateArr = {vkStepsResultPermissionItem$PermissionState, vkStepsResultPermissionItem$PermissionState2, vkStepsResultPermissionItem$PermissionState3};
        $VALUES = vkStepsResultPermissionItem$PermissionStateArr;
        $ENTRIES = new asp(vkStepsResultPermissionItem$PermissionStateArr);
    }

    public VkStepsResultPermissionItem$PermissionState() {
        throw null;
    }

    public static VkStepsResultPermissionItem$PermissionState valueOf(String str) {
        return (VkStepsResultPermissionItem$PermissionState) Enum.valueOf(VkStepsResultPermissionItem$PermissionState.class, str);
    }

    public static VkStepsResultPermissionItem$PermissionState[] values() {
        return (VkStepsResultPermissionItem$PermissionState[]) $VALUES.clone();
    }
}
