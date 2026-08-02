package com.vk.superapp.bridges.dto.analytics;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkStepsResultPermissionItem.kt */
/* loaded from: classes6.dex */
public final class VkStepsResultPermissionItem$Permission {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkStepsResultPermissionItem$Permission[] $VALUES;
    public static final VkStepsResultPermissionItem$Permission ACTIVITY_RECOGNITION;
    public static final VkStepsResultPermissionItem$Permission DISTANCE;
    public static final VkStepsResultPermissionItem$Permission STEPS;
    public static final VkStepsResultPermissionItem$Permission UNKNOWN;
    public static final VkStepsResultPermissionItem$Permission WORKOUT;

    static {
        VkStepsResultPermissionItem$Permission vkStepsResultPermissionItem$Permission = new VkStepsResultPermissionItem$Permission("STEPS", 0);
        STEPS = vkStepsResultPermissionItem$Permission;
        VkStepsResultPermissionItem$Permission vkStepsResultPermissionItem$Permission2 = new VkStepsResultPermissionItem$Permission("DISTANCE", 1);
        DISTANCE = vkStepsResultPermissionItem$Permission2;
        VkStepsResultPermissionItem$Permission vkStepsResultPermissionItem$Permission3 = new VkStepsResultPermissionItem$Permission("ACTIVITY_RECOGNITION", 2);
        ACTIVITY_RECOGNITION = vkStepsResultPermissionItem$Permission3;
        VkStepsResultPermissionItem$Permission vkStepsResultPermissionItem$Permission4 = new VkStepsResultPermissionItem$Permission("WORKOUT", 3);
        WORKOUT = vkStepsResultPermissionItem$Permission4;
        VkStepsResultPermissionItem$Permission vkStepsResultPermissionItem$Permission5 = new VkStepsResultPermissionItem$Permission(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);
        UNKNOWN = vkStepsResultPermissionItem$Permission5;
        VkStepsResultPermissionItem$Permission[] vkStepsResultPermissionItem$PermissionArr = {vkStepsResultPermissionItem$Permission, vkStepsResultPermissionItem$Permission2, vkStepsResultPermissionItem$Permission3, vkStepsResultPermissionItem$Permission4, vkStepsResultPermissionItem$Permission5};
        $VALUES = vkStepsResultPermissionItem$PermissionArr;
        $ENTRIES = new asp(vkStepsResultPermissionItem$PermissionArr);
    }

    public VkStepsResultPermissionItem$Permission() {
        throw null;
    }

    public static VkStepsResultPermissionItem$Permission valueOf(String str) {
        return (VkStepsResultPermissionItem$Permission) Enum.valueOf(VkStepsResultPermissionItem$Permission.class, str);
    }

    public static VkStepsResultPermissionItem$Permission[] values() {
        return (VkStepsResultPermissionItem$Permission[]) $VALUES.clone();
    }
}
