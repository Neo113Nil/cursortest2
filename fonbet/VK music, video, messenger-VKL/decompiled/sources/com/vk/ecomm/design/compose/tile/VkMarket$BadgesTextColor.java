package com.vk.ecomm.design.compose.tile;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkMarket.kt */
/* loaded from: classes18.dex */
public final class VkMarket$BadgesTextColor {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkMarket$BadgesTextColor[] $VALUES;
    public static final VkMarket$BadgesTextColor Discount;

    static {
        VkMarket$BadgesTextColor vkMarket$BadgesTextColor = new VkMarket$BadgesTextColor("Discount", 0);
        Discount = vkMarket$BadgesTextColor;
        VkMarket$BadgesTextColor[] vkMarket$BadgesTextColorArr = {vkMarket$BadgesTextColor};
        $VALUES = vkMarket$BadgesTextColorArr;
        $ENTRIES = new asp(vkMarket$BadgesTextColorArr);
    }

    public VkMarket$BadgesTextColor() {
        throw null;
    }

    public static VkMarket$BadgesTextColor valueOf(String str) {
        return (VkMarket$BadgesTextColor) Enum.valueOf(VkMarket$BadgesTextColor.class, str);
    }

    public static VkMarket$BadgesTextColor[] values() {
        return (VkMarket$BadgesTextColor[]) $VALUES.clone();
    }
}
