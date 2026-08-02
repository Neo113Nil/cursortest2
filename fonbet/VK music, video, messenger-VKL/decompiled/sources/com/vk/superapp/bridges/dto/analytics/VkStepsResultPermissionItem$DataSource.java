package com.vk.superapp.bridges.dto.analytics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkStepsResultPermissionItem.kt */
/* loaded from: classes6.dex */
public final class VkStepsResultPermissionItem$DataSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkStepsResultPermissionItem$DataSource[] $VALUES;
    public static final VkStepsResultPermissionItem$DataSource GOOGLE_FIT;
    public static final VkStepsResultPermissionItem$DataSource HEALTH_CONNECT;
    public static final VkStepsResultPermissionItem$DataSource HUAWEI_HEALTH;
    public static final VkStepsResultPermissionItem$DataSource UNDEFINED;

    static {
        VkStepsResultPermissionItem$DataSource vkStepsResultPermissionItem$DataSource = new VkStepsResultPermissionItem$DataSource("GOOGLE_FIT", 0);
        GOOGLE_FIT = vkStepsResultPermissionItem$DataSource;
        VkStepsResultPermissionItem$DataSource vkStepsResultPermissionItem$DataSource2 = new VkStepsResultPermissionItem$DataSource("HEALTH_CONNECT", 1);
        HEALTH_CONNECT = vkStepsResultPermissionItem$DataSource2;
        VkStepsResultPermissionItem$DataSource vkStepsResultPermissionItem$DataSource3 = new VkStepsResultPermissionItem$DataSource("HUAWEI_HEALTH", 2);
        HUAWEI_HEALTH = vkStepsResultPermissionItem$DataSource3;
        VkStepsResultPermissionItem$DataSource vkStepsResultPermissionItem$DataSource4 = new VkStepsResultPermissionItem$DataSource("UNDEFINED", 3);
        UNDEFINED = vkStepsResultPermissionItem$DataSource4;
        VkStepsResultPermissionItem$DataSource[] vkStepsResultPermissionItem$DataSourceArr = {vkStepsResultPermissionItem$DataSource, vkStepsResultPermissionItem$DataSource2, vkStepsResultPermissionItem$DataSource3, vkStepsResultPermissionItem$DataSource4};
        $VALUES = vkStepsResultPermissionItem$DataSourceArr;
        $ENTRIES = new asp(vkStepsResultPermissionItem$DataSourceArr);
    }

    public VkStepsResultPermissionItem$DataSource() {
        throw null;
    }

    public static VkStepsResultPermissionItem$DataSource valueOf(String str) {
        return (VkStepsResultPermissionItem$DataSource) Enum.valueOf(VkStepsResultPermissionItem$DataSource.class, str);
    }

    public static VkStepsResultPermissionItem$DataSource[] values() {
        return (VkStepsResultPermissionItem$DataSource[]) $VALUES.clone();
    }
}
