package com.vk.core.tool.onboarding;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkOnboarding.kt */
/* loaded from: classes17.dex */
public final class VkOnboarding$TintColor {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkOnboarding$TintColor[] $VALUES;
    public static final VkOnboarding$TintColor Azure;
    public static final VkOnboarding$TintColor Cyan;
    public static final VkOnboarding$TintColor Lime;
    public static final VkOnboarding$TintColor Pink;

    static {
        VkOnboarding$TintColor vkOnboarding$TintColor = new VkOnboarding$TintColor("Lime", 0);
        Lime = vkOnboarding$TintColor;
        VkOnboarding$TintColor vkOnboarding$TintColor2 = new VkOnboarding$TintColor("Cyan", 1);
        Cyan = vkOnboarding$TintColor2;
        VkOnboarding$TintColor vkOnboarding$TintColor3 = new VkOnboarding$TintColor("Azure", 2);
        Azure = vkOnboarding$TintColor3;
        VkOnboarding$TintColor vkOnboarding$TintColor4 = new VkOnboarding$TintColor("Pink", 3);
        Pink = vkOnboarding$TintColor4;
        VkOnboarding$TintColor[] vkOnboarding$TintColorArr = {vkOnboarding$TintColor, vkOnboarding$TintColor2, vkOnboarding$TintColor3, vkOnboarding$TintColor4};
        $VALUES = vkOnboarding$TintColorArr;
        $ENTRIES = new asp(vkOnboarding$TintColorArr);
    }

    public VkOnboarding$TintColor() {
        throw null;
    }

    public static zrp<VkOnboarding$TintColor> h() {
        return $ENTRIES;
    }

    public static VkOnboarding$TintColor valueOf(String str) {
        return (VkOnboarding$TintColor) Enum.valueOf(VkOnboarding$TintColor.class, str);
    }

    public static VkOnboarding$TintColor[] values() {
        return (VkOnboarding$TintColor[]) $VALUES.clone();
    }
}
