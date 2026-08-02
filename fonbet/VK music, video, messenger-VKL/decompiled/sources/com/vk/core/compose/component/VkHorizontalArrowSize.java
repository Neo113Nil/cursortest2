package com.vk.core.compose.component;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkHorizontalArrow.kt */
/* loaded from: classes17.dex */
public final class VkHorizontalArrowSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkHorizontalArrowSize[] $VALUES;
    public static final VkHorizontalArrowSize Medium;
    public static final VkHorizontalArrowSize Small;

    static {
        VkHorizontalArrowSize vkHorizontalArrowSize = new VkHorizontalArrowSize("Small", 0);
        Small = vkHorizontalArrowSize;
        VkHorizontalArrowSize vkHorizontalArrowSize2 = new VkHorizontalArrowSize("Medium", 1);
        Medium = vkHorizontalArrowSize2;
        VkHorizontalArrowSize[] vkHorizontalArrowSizeArr = {vkHorizontalArrowSize, vkHorizontalArrowSize2};
        $VALUES = vkHorizontalArrowSizeArr;
        $ENTRIES = new asp(vkHorizontalArrowSizeArr);
    }

    public VkHorizontalArrowSize() {
        throw null;
    }

    public static zrp<VkHorizontalArrowSize> h() {
        return $ENTRIES;
    }

    public static VkHorizontalArrowSize valueOf(String str) {
        return (VkHorizontalArrowSize) Enum.valueOf(VkHorizontalArrowSize.class, str);
    }

    public static VkHorizontalArrowSize[] values() {
        return (VkHorizontalArrowSize[]) $VALUES.clone();
    }
}
