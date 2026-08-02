package com.vk.core.compose.component;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkHorizontalArrow.kt */
/* loaded from: classes17.dex */
public final class VkHorizontalArrowDirection {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkHorizontalArrowDirection[] $VALUES;
    public static final VkHorizontalArrowDirection Left;
    public static final VkHorizontalArrowDirection Right;

    static {
        VkHorizontalArrowDirection vkHorizontalArrowDirection = new VkHorizontalArrowDirection("Left", 0);
        Left = vkHorizontalArrowDirection;
        VkHorizontalArrowDirection vkHorizontalArrowDirection2 = new VkHorizontalArrowDirection("Right", 1);
        Right = vkHorizontalArrowDirection2;
        VkHorizontalArrowDirection[] vkHorizontalArrowDirectionArr = {vkHorizontalArrowDirection, vkHorizontalArrowDirection2};
        $VALUES = vkHorizontalArrowDirectionArr;
        $ENTRIES = new asp(vkHorizontalArrowDirectionArr);
    }

    public VkHorizontalArrowDirection() {
        throw null;
    }

    public static zrp<VkHorizontalArrowDirection> h() {
        return $ENTRIES;
    }

    public static VkHorizontalArrowDirection valueOf(String str) {
        return (VkHorizontalArrowDirection) Enum.valueOf(VkHorizontalArrowDirection.class, str);
    }

    public static VkHorizontalArrowDirection[] values() {
        return (VkHorizontalArrowDirection[]) $VALUES.clone();
    }
}
