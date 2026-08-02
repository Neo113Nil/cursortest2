package com.vk.clips.design.view.sidecontrols.models;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CounterMode.kt */
/* loaded from: classes16.dex */
public final class CounterMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CounterMode[] $VALUES;
    public static final CounterMode AVAILABLE;
    public static final a Companion;
    public static final CounterMode UNAVAILABLE;
    private final boolean isNeedToShowCounter;

    /* compiled from: CounterMode.kt */
    public static final class a {
    }

    static {
        CounterMode counterMode = new CounterMode("AVAILABLE", 0, true);
        AVAILABLE = counterMode;
        CounterMode counterMode2 = new CounterMode("UNAVAILABLE", 1, false);
        UNAVAILABLE = counterMode2;
        CounterMode[] counterModeArr = {counterMode, counterMode2};
        $VALUES = counterModeArr;
        $ENTRIES = new asp(counterModeArr);
        Companion = new a();
    }

    public CounterMode(String str, int i, boolean z) {
        this.isNeedToShowCounter = z;
    }

    public static CounterMode valueOf(String str) {
        return (CounterMode) Enum.valueOf(CounterMode.class, str);
    }

    public static CounterMode[] values() {
        return (CounterMode[]) $VALUES.clone();
    }

    public final boolean h() {
        return this.isNeedToShowCounter;
    }
}
