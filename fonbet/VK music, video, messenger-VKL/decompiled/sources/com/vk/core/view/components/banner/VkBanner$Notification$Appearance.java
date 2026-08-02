package com.vk.core.view.components.banner;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkBanner.kt */
/* loaded from: classes17.dex */
public final class VkBanner$Notification$Appearance {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkBanner$Notification$Appearance[] $VALUES;
    public static final VkBanner$Notification$Appearance Negative;
    public static final VkBanner$Notification$Appearance Neutral;
    public static final VkBanner$Notification$Appearance Positive;
    public static final VkBanner$Notification$Appearance Warning;

    static {
        VkBanner$Notification$Appearance vkBanner$Notification$Appearance = new VkBanner$Notification$Appearance("Neutral", 0);
        Neutral = vkBanner$Notification$Appearance;
        VkBanner$Notification$Appearance vkBanner$Notification$Appearance2 = new VkBanner$Notification$Appearance("Warning", 1);
        Warning = vkBanner$Notification$Appearance2;
        VkBanner$Notification$Appearance vkBanner$Notification$Appearance3 = new VkBanner$Notification$Appearance("Negative", 2);
        Negative = vkBanner$Notification$Appearance3;
        VkBanner$Notification$Appearance vkBanner$Notification$Appearance4 = new VkBanner$Notification$Appearance("Positive", 3);
        Positive = vkBanner$Notification$Appearance4;
        VkBanner$Notification$Appearance[] vkBanner$Notification$AppearanceArr = {vkBanner$Notification$Appearance, vkBanner$Notification$Appearance2, vkBanner$Notification$Appearance3, vkBanner$Notification$Appearance4};
        $VALUES = vkBanner$Notification$AppearanceArr;
        $ENTRIES = new asp(vkBanner$Notification$AppearanceArr);
    }

    public VkBanner$Notification$Appearance() {
        throw null;
    }

    public static VkBanner$Notification$Appearance valueOf(String str) {
        return (VkBanner$Notification$Appearance) Enum.valueOf(VkBanner$Notification$Appearance.class, str);
    }

    public static VkBanner$Notification$Appearance[] values() {
        return (VkBanner$Notification$Appearance[]) $VALUES.clone();
    }
}
