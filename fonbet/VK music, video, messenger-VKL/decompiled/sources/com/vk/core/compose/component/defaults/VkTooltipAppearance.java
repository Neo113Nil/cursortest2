package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkTooltipDefaults.kt */
/* loaded from: classes17.dex */
public final class VkTooltipAppearance {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkTooltipAppearance[] $VALUES;
    public static final VkTooltipAppearance Accent;
    public static final VkTooltipAppearance InvariableBlack;
    public static final VkTooltipAppearance InvariablyWhite;
    public static final VkTooltipAppearance Inversion;
    public static final VkTooltipAppearance Neutral;
    public static final VkTooltipAppearance Transparent;

    static {
        VkTooltipAppearance vkTooltipAppearance = new VkTooltipAppearance("Accent", 0);
        Accent = vkTooltipAppearance;
        VkTooltipAppearance vkTooltipAppearance2 = new VkTooltipAppearance("Neutral", 1);
        Neutral = vkTooltipAppearance2;
        VkTooltipAppearance vkTooltipAppearance3 = new VkTooltipAppearance("Inversion", 2);
        Inversion = vkTooltipAppearance3;
        VkTooltipAppearance vkTooltipAppearance4 = new VkTooltipAppearance("InvariablyWhite", 3);
        InvariablyWhite = vkTooltipAppearance4;
        VkTooltipAppearance vkTooltipAppearance5 = new VkTooltipAppearance("InvariableBlack", 4);
        InvariableBlack = vkTooltipAppearance5;
        VkTooltipAppearance vkTooltipAppearance6 = new VkTooltipAppearance("Transparent", 5);
        Transparent = vkTooltipAppearance6;
        VkTooltipAppearance[] vkTooltipAppearanceArr = {vkTooltipAppearance, vkTooltipAppearance2, vkTooltipAppearance3, vkTooltipAppearance4, vkTooltipAppearance5, vkTooltipAppearance6};
        $VALUES = vkTooltipAppearanceArr;
        $ENTRIES = new asp(vkTooltipAppearanceArr);
    }

    public VkTooltipAppearance() {
        throw null;
    }

    public static zrp<VkTooltipAppearance> h() {
        return $ENTRIES;
    }

    public static VkTooltipAppearance valueOf(String str) {
        return (VkTooltipAppearance) Enum.valueOf(VkTooltipAppearance.class, str);
    }

    public static VkTooltipAppearance[] values() {
        return (VkTooltipAppearance[]) $VALUES.clone();
    }
}
