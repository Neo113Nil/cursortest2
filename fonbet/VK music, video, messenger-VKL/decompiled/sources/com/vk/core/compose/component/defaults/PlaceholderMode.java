package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkPlaceholderDefaults.kt */
/* loaded from: classes17.dex */
public final class PlaceholderMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlaceholderMode[] $VALUES;
    public static final PlaceholderMode Neutral;
    public static final PlaceholderMode Overlay;
    public static final PlaceholderMode Primary;

    static {
        PlaceholderMode placeholderMode = new PlaceholderMode("Primary", 0);
        Primary = placeholderMode;
        PlaceholderMode placeholderMode2 = new PlaceholderMode("Overlay", 1);
        Overlay = placeholderMode2;
        PlaceholderMode placeholderMode3 = new PlaceholderMode("Neutral", 2);
        Neutral = placeholderMode3;
        PlaceholderMode[] placeholderModeArr = {placeholderMode, placeholderMode2, placeholderMode3};
        $VALUES = placeholderModeArr;
        $ENTRIES = new asp(placeholderModeArr);
    }

    public PlaceholderMode() {
        throw null;
    }

    public static PlaceholderMode valueOf(String str) {
        return (PlaceholderMode) Enum.valueOf(PlaceholderMode.class, str);
    }

    public static PlaceholderMode[] values() {
        return (PlaceholderMode[]) $VALUES.clone();
    }
}
