package com.vk.core.tool.onboarding;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkTooltip.kt */
/* loaded from: classes17.dex */
public final class VkTooltip$MarkerStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkTooltip$MarkerStyle[] $VALUES;
    public static final VkTooltip$MarkerStyle Style1;
    public static final VkTooltip$MarkerStyle Style2;
    public static final VkTooltip$MarkerStyle Style3;
    public static final VkTooltip$MarkerStyle Style4;
    public static final VkTooltip$MarkerStyle Style5;
    public static final VkTooltip$MarkerStyle Style6;

    static {
        VkTooltip$MarkerStyle vkTooltip$MarkerStyle = new VkTooltip$MarkerStyle("Style1", 0);
        Style1 = vkTooltip$MarkerStyle;
        VkTooltip$MarkerStyle vkTooltip$MarkerStyle2 = new VkTooltip$MarkerStyle("Style2", 1);
        Style2 = vkTooltip$MarkerStyle2;
        VkTooltip$MarkerStyle vkTooltip$MarkerStyle3 = new VkTooltip$MarkerStyle("Style3", 2);
        Style3 = vkTooltip$MarkerStyle3;
        VkTooltip$MarkerStyle vkTooltip$MarkerStyle4 = new VkTooltip$MarkerStyle("Style4", 3);
        Style4 = vkTooltip$MarkerStyle4;
        VkTooltip$MarkerStyle vkTooltip$MarkerStyle5 = new VkTooltip$MarkerStyle("Style5", 4);
        Style5 = vkTooltip$MarkerStyle5;
        VkTooltip$MarkerStyle vkTooltip$MarkerStyle6 = new VkTooltip$MarkerStyle("Style6", 5);
        Style6 = vkTooltip$MarkerStyle6;
        VkTooltip$MarkerStyle[] vkTooltip$MarkerStyleArr = {vkTooltip$MarkerStyle, vkTooltip$MarkerStyle2, vkTooltip$MarkerStyle3, vkTooltip$MarkerStyle4, vkTooltip$MarkerStyle5, vkTooltip$MarkerStyle6};
        $VALUES = vkTooltip$MarkerStyleArr;
        $ENTRIES = new asp(vkTooltip$MarkerStyleArr);
    }

    public VkTooltip$MarkerStyle() {
        throw null;
    }

    public static VkTooltip$MarkerStyle valueOf(String str) {
        return (VkTooltip$MarkerStyle) Enum.valueOf(VkTooltip$MarkerStyle.class, str);
    }

    public static VkTooltip$MarkerStyle[] values() {
        return (VkTooltip$MarkerStyle[]) $VALUES.clone();
    }
}
