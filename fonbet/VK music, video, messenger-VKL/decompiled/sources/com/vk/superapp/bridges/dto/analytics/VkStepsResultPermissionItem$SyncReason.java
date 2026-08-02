package com.vk.superapp.bridges.dto.analytics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkStepsResultPermissionItem.kt */
/* loaded from: classes6.dex */
public final class VkStepsResultPermissionItem$SyncReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkStepsResultPermissionItem$SyncReason[] $VALUES;
    public static final VkStepsResultPermissionItem$SyncReason CHECK_STEPS_PERMISSIONS_COMMAND;
    public static final VkStepsResultPermissionItem$SyncReason GET_STEPS_COMMAND;

    static {
        VkStepsResultPermissionItem$SyncReason vkStepsResultPermissionItem$SyncReason = new VkStepsResultPermissionItem$SyncReason("CHECK_STEPS_PERMISSIONS_COMMAND", 0);
        CHECK_STEPS_PERMISSIONS_COMMAND = vkStepsResultPermissionItem$SyncReason;
        VkStepsResultPermissionItem$SyncReason vkStepsResultPermissionItem$SyncReason2 = new VkStepsResultPermissionItem$SyncReason("GET_STEPS_COMMAND", 1);
        GET_STEPS_COMMAND = vkStepsResultPermissionItem$SyncReason2;
        VkStepsResultPermissionItem$SyncReason[] vkStepsResultPermissionItem$SyncReasonArr = {vkStepsResultPermissionItem$SyncReason, vkStepsResultPermissionItem$SyncReason2};
        $VALUES = vkStepsResultPermissionItem$SyncReasonArr;
        $ENTRIES = new asp(vkStepsResultPermissionItem$SyncReasonArr);
    }

    public VkStepsResultPermissionItem$SyncReason() {
        throw null;
    }

    public static VkStepsResultPermissionItem$SyncReason valueOf(String str) {
        return (VkStepsResultPermissionItem$SyncReason) Enum.valueOf(VkStepsResultPermissionItem$SyncReason.class, str);
    }

    public static VkStepsResultPermissionItem$SyncReason[] values() {
        return (VkStepsResultPermissionItem$SyncReason[]) $VALUES.clone();
    }
}
