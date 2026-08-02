package com.vk.core.tool.view.vkblur;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkBlurView.kt */
/* loaded from: classes17.dex */
public final class GradientDirection {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GradientDirection[] $VALUES;
    public static final GradientDirection BottomTop;
    public static final GradientDirection TopBottom;

    static {
        GradientDirection gradientDirection = new GradientDirection("TopBottom", 0);
        TopBottom = gradientDirection;
        GradientDirection gradientDirection2 = new GradientDirection("BottomTop", 1);
        BottomTop = gradientDirection2;
        GradientDirection[] gradientDirectionArr = {gradientDirection, gradientDirection2};
        $VALUES = gradientDirectionArr;
        $ENTRIES = new asp(gradientDirectionArr);
    }

    public GradientDirection() {
        throw null;
    }

    public static GradientDirection valueOf(String str) {
        return (GradientDirection) Enum.valueOf(GradientDirection.class, str);
    }

    public static GradientDirection[] values() {
        return (GradientDirection[]) $VALUES.clone();
    }
}
