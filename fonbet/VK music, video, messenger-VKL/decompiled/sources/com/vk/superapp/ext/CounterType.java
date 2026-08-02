package com.vk.superapp.ext;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BadgeInfoExt.kt */
/* loaded from: classes6.dex */
public final class CounterType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CounterType[] $VALUES;
    public static final CounterType DEFAULT;
    public static final CounterType WITH_PLUS;

    static {
        CounterType counterType = new CounterType("WITH_PLUS", 0);
        WITH_PLUS = counterType;
        CounterType counterType2 = new CounterType("DEFAULT", 1);
        DEFAULT = counterType2;
        CounterType[] counterTypeArr = {counterType, counterType2};
        $VALUES = counterTypeArr;
        $ENTRIES = new asp(counterTypeArr);
    }

    public CounterType() {
        throw null;
    }

    public static CounterType valueOf(String str) {
        return (CounterType) Enum.valueOf(CounterType.class, str);
    }

    public static CounterType[] values() {
        return (CounterType[]) $VALUES.clone();
    }
}
