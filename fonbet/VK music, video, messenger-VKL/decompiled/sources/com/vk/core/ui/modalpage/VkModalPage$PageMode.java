package com.vk.core.ui.modalpage;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkModalPage.kt */
/* loaded from: classes17.dex */
public final class VkModalPage$PageMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkModalPage$PageMode[] $VALUES;
    public static final VkModalPage$PageMode DynamicHeight;
    public static final VkModalPage$PageMode FullScreen;

    static {
        VkModalPage$PageMode vkModalPage$PageMode = new VkModalPage$PageMode("FullScreen", 0);
        FullScreen = vkModalPage$PageMode;
        VkModalPage$PageMode vkModalPage$PageMode2 = new VkModalPage$PageMode("DynamicHeight", 1);
        DynamicHeight = vkModalPage$PageMode2;
        VkModalPage$PageMode[] vkModalPage$PageModeArr = {vkModalPage$PageMode, vkModalPage$PageMode2};
        $VALUES = vkModalPage$PageModeArr;
        $ENTRIES = new asp(vkModalPage$PageModeArr);
    }

    public VkModalPage$PageMode() {
        throw null;
    }

    public static VkModalPage$PageMode valueOf(String str) {
        return (VkModalPage$PageMode) Enum.valueOf(VkModalPage$PageMode.class, str);
    }

    public static VkModalPage$PageMode[] values() {
        return (VkModalPage$PageMode[]) $VALUES.clone();
    }
}
