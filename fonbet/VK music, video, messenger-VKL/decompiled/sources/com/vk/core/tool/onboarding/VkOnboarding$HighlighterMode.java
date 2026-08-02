package com.vk.core.tool.onboarding;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkOnboarding.kt */
/* loaded from: classes17.dex */
public final class VkOnboarding$HighlighterMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkOnboarding$HighlighterMode[] $VALUES;
    public static final VkOnboarding$HighlighterMode Token;
    public static final VkOnboarding$HighlighterMode View;

    static {
        VkOnboarding$HighlighterMode vkOnboarding$HighlighterMode = new VkOnboarding$HighlighterMode("Token", 0);
        Token = vkOnboarding$HighlighterMode;
        VkOnboarding$HighlighterMode vkOnboarding$HighlighterMode2 = new VkOnboarding$HighlighterMode("View", 1);
        View = vkOnboarding$HighlighterMode2;
        VkOnboarding$HighlighterMode[] vkOnboarding$HighlighterModeArr = {vkOnboarding$HighlighterMode, vkOnboarding$HighlighterMode2};
        $VALUES = vkOnboarding$HighlighterModeArr;
        $ENTRIES = new asp(vkOnboarding$HighlighterModeArr);
    }

    public VkOnboarding$HighlighterMode() {
        throw null;
    }

    public static VkOnboarding$HighlighterMode valueOf(String str) {
        return (VkOnboarding$HighlighterMode) Enum.valueOf(VkOnboarding$HighlighterMode.class, str);
    }

    public static VkOnboarding$HighlighterMode[] values() {
        return (VkOnboarding$HighlighterMode[]) $VALUES.clone();
    }
}
