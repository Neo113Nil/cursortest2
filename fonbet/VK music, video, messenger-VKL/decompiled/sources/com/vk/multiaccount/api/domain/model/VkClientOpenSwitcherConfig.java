package com.vk.multiaccount.api.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkClientOpenSwitcherConfig.kt */
/* loaded from: classes3.dex */
public final class VkClientOpenSwitcherConfig {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkClientOpenSwitcherConfig[] $VALUES;
    public static final VkClientOpenSwitcherConfig OPEN_AUTH;
    public static final VkClientOpenSwitcherConfig OPEN_SWITCHER;

    static {
        VkClientOpenSwitcherConfig vkClientOpenSwitcherConfig = new VkClientOpenSwitcherConfig("OPEN_AUTH", 0);
        OPEN_AUTH = vkClientOpenSwitcherConfig;
        VkClientOpenSwitcherConfig vkClientOpenSwitcherConfig2 = new VkClientOpenSwitcherConfig("OPEN_SWITCHER", 1);
        OPEN_SWITCHER = vkClientOpenSwitcherConfig2;
        VkClientOpenSwitcherConfig[] vkClientOpenSwitcherConfigArr = {vkClientOpenSwitcherConfig, vkClientOpenSwitcherConfig2};
        $VALUES = vkClientOpenSwitcherConfigArr;
        $ENTRIES = new asp(vkClientOpenSwitcherConfigArr);
    }

    public VkClientOpenSwitcherConfig() {
        throw null;
    }

    public static VkClientOpenSwitcherConfig valueOf(String str) {
        return (VkClientOpenSwitcherConfig) Enum.valueOf(VkClientOpenSwitcherConfig.class, str);
    }

    public static VkClientOpenSwitcherConfig[] values() {
        return (VkClientOpenSwitcherConfig[]) $VALUES.clone();
    }
}
