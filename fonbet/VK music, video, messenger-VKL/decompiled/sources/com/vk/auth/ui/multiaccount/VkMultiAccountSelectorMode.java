package com.vk.auth.ui.multiaccount;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkMultiAccountSelectorMode.kt */
/* loaded from: classes15.dex */
public final class VkMultiAccountSelectorMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkMultiAccountSelectorMode[] $VALUES;
    public static final VkMultiAccountSelectorMode DEFAULT;
    public static final VkMultiAccountSelectorMode SELECTION_DISABLED_MODE;

    static {
        VkMultiAccountSelectorMode vkMultiAccountSelectorMode = new VkMultiAccountSelectorMode("DEFAULT", 0);
        DEFAULT = vkMultiAccountSelectorMode;
        VkMultiAccountSelectorMode vkMultiAccountSelectorMode2 = new VkMultiAccountSelectorMode("SELECTION_DISABLED_MODE", 1);
        SELECTION_DISABLED_MODE = vkMultiAccountSelectorMode2;
        VkMultiAccountSelectorMode[] vkMultiAccountSelectorModeArr = {vkMultiAccountSelectorMode, vkMultiAccountSelectorMode2};
        $VALUES = vkMultiAccountSelectorModeArr;
        $ENTRIES = new asp(vkMultiAccountSelectorModeArr);
    }

    public VkMultiAccountSelectorMode() {
        throw null;
    }

    public static VkMultiAccountSelectorMode valueOf(String str) {
        return (VkMultiAccountSelectorMode) Enum.valueOf(VkMultiAccountSelectorMode.class, str);
    }

    public static VkMultiAccountSelectorMode[] values() {
        return (VkMultiAccountSelectorMode[]) $VALUES.clone();
    }
}
