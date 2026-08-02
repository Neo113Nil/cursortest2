package com.vk.im.engine.utils;

import xsna.asp;
import xsna.hkb;
import xsna.nhi;
import xsna.uni;
import xsna.woi;
import xsna.wzs;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StringMatchStrategy.kt */
/* loaded from: classes2.dex */
public final class StringMatchStrategy {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StringMatchStrategy[] $VALUES;
    public static final StringMatchStrategy ANY;
    public static final StringMatchStrategy ENDING_WITH;
    public static final StringMatchStrategy STARTING_WITH;
    public static final StringMatchStrategy STRICT;
    private final wzs<String, String, Boolean> predicate;

    /* compiled from: StringMatchStrategy.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StringMatchStrategy.values().length];
            try {
                iArr[StringMatchStrategy.STARTING_WITH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StringMatchStrategy.ENDING_WITH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StringMatchStrategy.ANY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StringMatchStrategy.STRICT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        StringMatchStrategy stringMatchStrategy = new StringMatchStrategy("STRICT", 0, new woi(3));
        STRICT = stringMatchStrategy;
        StringMatchStrategy stringMatchStrategy2 = new StringMatchStrategy("STARTING_WITH", 1, new uni(5));
        STARTING_WITH = stringMatchStrategy2;
        StringMatchStrategy stringMatchStrategy3 = new StringMatchStrategy("ENDING_WITH", 2, new hkb(11));
        ENDING_WITH = stringMatchStrategy3;
        StringMatchStrategy stringMatchStrategy4 = new StringMatchStrategy("ANY", 3, new nhi(8));
        ANY = stringMatchStrategy4;
        StringMatchStrategy[] stringMatchStrategyArr = {stringMatchStrategy, stringMatchStrategy2, stringMatchStrategy3, stringMatchStrategy4};
        $VALUES = stringMatchStrategyArr;
        $ENTRIES = new asp(stringMatchStrategyArr);
    }

    public StringMatchStrategy(String str, int i, wzs wzsVar) {
        this.predicate = wzsVar;
    }

    public static StringMatchStrategy valueOf(String str) {
        return (StringMatchStrategy) Enum.valueOf(StringMatchStrategy.class, str);
    }

    public static StringMatchStrategy[] values() {
        return (StringMatchStrategy[]) $VALUES.clone();
    }
}
