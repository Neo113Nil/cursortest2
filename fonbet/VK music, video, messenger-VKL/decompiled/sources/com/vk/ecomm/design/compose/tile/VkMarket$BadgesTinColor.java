package com.vk.ecomm.design.compose.tile;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkMarket.kt */
/* loaded from: classes18.dex */
public final class VkMarket$BadgesTinColor {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkMarket$BadgesTinColor[] $VALUES;
    public static final VkMarket$BadgesTinColor Discount;
    public static final VkMarket$BadgesTinColor Ozon;

    static {
        VkMarket$BadgesTinColor vkMarket$BadgesTinColor = new VkMarket$BadgesTinColor("Ozon", 0);
        Ozon = vkMarket$BadgesTinColor;
        VkMarket$BadgesTinColor vkMarket$BadgesTinColor2 = new VkMarket$BadgesTinColor("Discount", 1);
        Discount = vkMarket$BadgesTinColor2;
        VkMarket$BadgesTinColor[] vkMarket$BadgesTinColorArr = {vkMarket$BadgesTinColor, vkMarket$BadgesTinColor2};
        $VALUES = vkMarket$BadgesTinColorArr;
        $ENTRIES = new asp(vkMarket$BadgesTinColorArr);
    }

    public VkMarket$BadgesTinColor() {
        throw null;
    }

    public static VkMarket$BadgesTinColor valueOf(String str) {
        return (VkMarket$BadgesTinColor) Enum.valueOf(VkMarket$BadgesTinColor.class, str);
    }

    public static VkMarket$BadgesTinColor[] values() {
        return (VkMarket$BadgesTinColor[]) $VALUES.clone();
    }
}
