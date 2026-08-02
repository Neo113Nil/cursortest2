package com.vk.core.tool.onboarding;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkOnboarding.kt */
/* loaded from: classes17.dex */
public final class VkOnboarding$GraffitiAlignment {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkOnboarding$GraffitiAlignment[] $VALUES;
    public static final VkOnboarding$GraffitiAlignment End;
    public static final VkOnboarding$GraffitiAlignment Start;

    static {
        VkOnboarding$GraffitiAlignment vkOnboarding$GraffitiAlignment = new VkOnboarding$GraffitiAlignment("Start", 0);
        Start = vkOnboarding$GraffitiAlignment;
        VkOnboarding$GraffitiAlignment vkOnboarding$GraffitiAlignment2 = new VkOnboarding$GraffitiAlignment("End", 1);
        End = vkOnboarding$GraffitiAlignment2;
        VkOnboarding$GraffitiAlignment[] vkOnboarding$GraffitiAlignmentArr = {vkOnboarding$GraffitiAlignment, vkOnboarding$GraffitiAlignment2};
        $VALUES = vkOnboarding$GraffitiAlignmentArr;
        $ENTRIES = new asp(vkOnboarding$GraffitiAlignmentArr);
    }

    public VkOnboarding$GraffitiAlignment() {
        throw null;
    }

    public static VkOnboarding$GraffitiAlignment valueOf(String str) {
        return (VkOnboarding$GraffitiAlignment) Enum.valueOf(VkOnboarding$GraffitiAlignment.class, str);
    }

    public static VkOnboarding$GraffitiAlignment[] values() {
        return (VkOnboarding$GraffitiAlignment[]) $VALUES.clone();
    }
}
