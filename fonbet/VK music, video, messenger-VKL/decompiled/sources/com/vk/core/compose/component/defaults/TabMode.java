package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkTabsDefault.kt */
/* loaded from: classes17.dex */
public final class TabMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TabMode[] $VALUES;
    public static final TabMode Accent;
    public static final TabMode Default;
    public static final TabMode Secondary;

    static {
        TabMode tabMode = new TabMode("Default", 0);
        Default = tabMode;
        TabMode tabMode2 = new TabMode("Secondary", 1);
        Secondary = tabMode2;
        TabMode tabMode3 = new TabMode("Accent", 2);
        Accent = tabMode3;
        TabMode[] tabModeArr = {tabMode, tabMode2, tabMode3};
        $VALUES = tabModeArr;
        $ENTRIES = new asp(tabModeArr);
    }

    public TabMode() {
        throw null;
    }

    public static TabMode valueOf(String str) {
        return (TabMode) Enum.valueOf(TabMode.class, str);
    }

    public static TabMode[] values() {
        return (TabMode[]) $VALUES.clone();
    }
}
