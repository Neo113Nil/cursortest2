package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkCounterDefaults.kt */
/* loaded from: classes17.dex */
public final class CounterMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CounterMode[] $VALUES;
    public static final CounterMode Contrast;
    public static final CounterMode Primary;
    public static final CounterMode Tertiary;

    static {
        CounterMode counterMode = new CounterMode("Primary", 0);
        Primary = counterMode;
        CounterMode counterMode2 = new CounterMode("Contrast", 1);
        Contrast = counterMode2;
        CounterMode counterMode3 = new CounterMode("Tertiary", 2);
        Tertiary = counterMode3;
        CounterMode[] counterModeArr = {counterMode, counterMode2, counterMode3};
        $VALUES = counterModeArr;
        $ENTRIES = new asp(counterModeArr);
    }

    public CounterMode() {
        throw null;
    }

    public static zrp<CounterMode> h() {
        return $ENTRIES;
    }

    public static CounterMode valueOf(String str) {
        return (CounterMode) Enum.valueOf(CounterMode.class, str);
    }

    public static CounterMode[] values() {
        return (CounterMode[]) $VALUES.clone();
    }
}
