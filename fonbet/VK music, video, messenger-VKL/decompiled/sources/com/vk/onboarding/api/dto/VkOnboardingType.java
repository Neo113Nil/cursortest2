package com.vk.onboarding.api.dto;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkOnboardingType.kt */
/* loaded from: classes4.dex */
public final class VkOnboardingType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkOnboardingType[] $VALUES;
    public static final VkOnboardingType Banner;
    public static final VkOnboardingType Fullscreen;
    public static final VkOnboardingType Highlighter;
    public static final VkOnboardingType Toast;
    public static final VkOnboardingType Tooltip;

    static {
        VkOnboardingType vkOnboardingType = new VkOnboardingType("Banner", 0);
        Banner = vkOnboardingType;
        VkOnboardingType vkOnboardingType2 = new VkOnboardingType("Tooltip", 1);
        Tooltip = vkOnboardingType2;
        VkOnboardingType vkOnboardingType3 = new VkOnboardingType("Fullscreen", 2);
        Fullscreen = vkOnboardingType3;
        VkOnboardingType vkOnboardingType4 = new VkOnboardingType("Toast", 3);
        Toast = vkOnboardingType4;
        VkOnboardingType vkOnboardingType5 = new VkOnboardingType("Highlighter", 4);
        Highlighter = vkOnboardingType5;
        VkOnboardingType[] vkOnboardingTypeArr = {vkOnboardingType, vkOnboardingType2, vkOnboardingType3, vkOnboardingType4, vkOnboardingType5};
        $VALUES = vkOnboardingTypeArr;
        $ENTRIES = new asp(vkOnboardingTypeArr);
    }

    public VkOnboardingType() {
        throw null;
    }

    public static VkOnboardingType valueOf(String str) {
        return (VkOnboardingType) Enum.valueOf(VkOnboardingType.class, str);
    }

    public static VkOnboardingType[] values() {
        return (VkOnboardingType[]) $VALUES.clone();
    }
}
