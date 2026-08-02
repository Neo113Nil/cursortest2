package com.vk.superapp.bridges.dto.analytics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkStepsResultPermissionItem.kt */
/* loaded from: classes6.dex */
public final class VkStepsResultPermissionItem$HealthConnectInfo$Installer {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkStepsResultPermissionItem$HealthConnectInfo$Installer[] $VALUES;
    public static final VkStepsResultPermissionItem$HealthConnectInfo$Installer NOT_INSTALLED;
    public static final VkStepsResultPermissionItem$HealthConnectInfo$Installer PLAY_STORE;
    public static final VkStepsResultPermissionItem$HealthConnectInfo$Installer SYSTEM_PREINSTALLED;
    public static final VkStepsResultPermissionItem$HealthConnectInfo$Installer UNKNOWN_SOURCE;

    static {
        VkStepsResultPermissionItem$HealthConnectInfo$Installer vkStepsResultPermissionItem$HealthConnectInfo$Installer = new VkStepsResultPermissionItem$HealthConnectInfo$Installer("SYSTEM_PREINSTALLED", 0);
        SYSTEM_PREINSTALLED = vkStepsResultPermissionItem$HealthConnectInfo$Installer;
        VkStepsResultPermissionItem$HealthConnectInfo$Installer vkStepsResultPermissionItem$HealthConnectInfo$Installer2 = new VkStepsResultPermissionItem$HealthConnectInfo$Installer("PLAY_STORE", 1);
        PLAY_STORE = vkStepsResultPermissionItem$HealthConnectInfo$Installer2;
        VkStepsResultPermissionItem$HealthConnectInfo$Installer vkStepsResultPermissionItem$HealthConnectInfo$Installer3 = new VkStepsResultPermissionItem$HealthConnectInfo$Installer("UNKNOWN_SOURCE", 2);
        UNKNOWN_SOURCE = vkStepsResultPermissionItem$HealthConnectInfo$Installer3;
        VkStepsResultPermissionItem$HealthConnectInfo$Installer vkStepsResultPermissionItem$HealthConnectInfo$Installer4 = new VkStepsResultPermissionItem$HealthConnectInfo$Installer("NOT_INSTALLED", 3);
        NOT_INSTALLED = vkStepsResultPermissionItem$HealthConnectInfo$Installer4;
        VkStepsResultPermissionItem$HealthConnectInfo$Installer[] vkStepsResultPermissionItem$HealthConnectInfo$InstallerArr = {vkStepsResultPermissionItem$HealthConnectInfo$Installer, vkStepsResultPermissionItem$HealthConnectInfo$Installer2, vkStepsResultPermissionItem$HealthConnectInfo$Installer3, vkStepsResultPermissionItem$HealthConnectInfo$Installer4};
        $VALUES = vkStepsResultPermissionItem$HealthConnectInfo$InstallerArr;
        $ENTRIES = new asp(vkStepsResultPermissionItem$HealthConnectInfo$InstallerArr);
    }

    public VkStepsResultPermissionItem$HealthConnectInfo$Installer() {
        throw null;
    }

    public static VkStepsResultPermissionItem$HealthConnectInfo$Installer valueOf(String str) {
        return (VkStepsResultPermissionItem$HealthConnectInfo$Installer) Enum.valueOf(VkStepsResultPermissionItem$HealthConnectInfo$Installer.class, str);
    }

    public static VkStepsResultPermissionItem$HealthConnectInfo$Installer[] values() {
        return (VkStepsResultPermissionItem$HealthConnectInfo$Installer[]) $VALUES.clone();
    }
}
