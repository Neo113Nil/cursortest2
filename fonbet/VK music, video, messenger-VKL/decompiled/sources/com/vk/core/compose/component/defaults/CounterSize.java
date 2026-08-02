package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkCounterDefaults.kt */
/* loaded from: classes17.dex */
public final class CounterSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CounterSize[] $VALUES;
    public static final CounterSize Large;
    public static final CounterSize Medium;
    public static final CounterSize Small;

    static {
        CounterSize counterSize = new CounterSize("Small", 0);
        Small = counterSize;
        CounterSize counterSize2 = new CounterSize("Medium", 1);
        Medium = counterSize2;
        CounterSize counterSize3 = new CounterSize("Large", 2);
        Large = counterSize3;
        CounterSize[] counterSizeArr = {counterSize, counterSize2, counterSize3};
        $VALUES = counterSizeArr;
        $ENTRIES = new asp(counterSizeArr);
    }

    public CounterSize() {
        throw null;
    }

    public static zrp<CounterSize> h() {
        return $ENTRIES;
    }

    public static CounterSize valueOf(String str) {
        return (CounterSize) Enum.valueOf(CounterSize.class, str);
    }

    public static CounterSize[] values() {
        return (CounterSize[]) $VALUES.clone();
    }
}
