package com.vk.core.tool.onboarding;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkTooltip.kt */
/* loaded from: classes17.dex */
public final class VkTooltip$MarkerSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkTooltip$MarkerSize[] $VALUES;
    public static final VkTooltip$MarkerSize Size146;
    public static final VkTooltip$MarkerSize Size48;
    public static final VkTooltip$MarkerSize Size56;
    public static final VkTooltip$MarkerSize Size64;
    public static final VkTooltip$MarkerSize Size72;
    public static final VkTooltip$MarkerSize Size96;
    private final float size;

    static {
        VkTooltip$MarkerSize vkTooltip$MarkerSize = new VkTooltip$MarkerSize("Size48", 0, 48);
        Size48 = vkTooltip$MarkerSize;
        VkTooltip$MarkerSize vkTooltip$MarkerSize2 = new VkTooltip$MarkerSize("Size56", 1, 56);
        Size56 = vkTooltip$MarkerSize2;
        VkTooltip$MarkerSize vkTooltip$MarkerSize3 = new VkTooltip$MarkerSize("Size64", 2, 64);
        Size64 = vkTooltip$MarkerSize3;
        VkTooltip$MarkerSize vkTooltip$MarkerSize4 = new VkTooltip$MarkerSize("Size72", 3, 72);
        Size72 = vkTooltip$MarkerSize4;
        VkTooltip$MarkerSize vkTooltip$MarkerSize5 = new VkTooltip$MarkerSize("Size96", 4, 96);
        Size96 = vkTooltip$MarkerSize5;
        VkTooltip$MarkerSize vkTooltip$MarkerSize6 = new VkTooltip$MarkerSize("Size146", 5, 146);
        Size146 = vkTooltip$MarkerSize6;
        VkTooltip$MarkerSize[] vkTooltip$MarkerSizeArr = {vkTooltip$MarkerSize, vkTooltip$MarkerSize2, vkTooltip$MarkerSize3, vkTooltip$MarkerSize4, vkTooltip$MarkerSize5, vkTooltip$MarkerSize6};
        $VALUES = vkTooltip$MarkerSizeArr;
        $ENTRIES = new asp(vkTooltip$MarkerSizeArr);
    }

    public VkTooltip$MarkerSize(String str, int i, float f) {
        this.size = f;
    }

    public static VkTooltip$MarkerSize valueOf(String str) {
        return (VkTooltip$MarkerSize) Enum.valueOf(VkTooltip$MarkerSize.class, str);
    }

    public static VkTooltip$MarkerSize[] values() {
        return (VkTooltip$MarkerSize[]) $VALUES.clone();
    }

    public final float h() {
        return this.size;
    }
}
