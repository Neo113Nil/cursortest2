package com.vk.core.view.components.tabs;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Tab.kt */
/* loaded from: classes17.dex */
public final class Tab$Mode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Tab$Mode[] $VALUES;
    public static final Tab$Mode Accent;
    public static final Tab$Mode Default;
    public static final Tab$Mode Secondary;

    static {
        Tab$Mode tab$Mode = new Tab$Mode("Default", 0);
        Default = tab$Mode;
        Tab$Mode tab$Mode2 = new Tab$Mode("Secondary", 1);
        Secondary = tab$Mode2;
        Tab$Mode tab$Mode3 = new Tab$Mode("Accent", 2);
        Accent = tab$Mode3;
        Tab$Mode[] tab$ModeArr = {tab$Mode, tab$Mode2, tab$Mode3};
        $VALUES = tab$ModeArr;
        $ENTRIES = new asp(tab$ModeArr);
    }

    public Tab$Mode() {
        throw null;
    }

    public static Tab$Mode valueOf(String str) {
        return (Tab$Mode) Enum.valueOf(Tab$Mode.class, str);
    }

    public static Tab$Mode[] values() {
        return (Tab$Mode[]) $VALUES.clone();
    }
}
