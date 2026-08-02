package com.vk.im.engine.internal.merge.messages;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WeightStrategy.kt */
/* loaded from: classes2.dex */
public final class WeightStrategy {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WeightStrategy[] $VALUES;
    public static final WeightStrategy AUTO;
    public static final WeightStrategy FORCE_LATEST;

    static {
        WeightStrategy weightStrategy = new WeightStrategy("AUTO", 0);
        AUTO = weightStrategy;
        WeightStrategy weightStrategy2 = new WeightStrategy("FORCE_LATEST", 1);
        FORCE_LATEST = weightStrategy2;
        WeightStrategy[] weightStrategyArr = {weightStrategy, weightStrategy2};
        $VALUES = weightStrategyArr;
        $ENTRIES = new asp(weightStrategyArr);
    }

    public WeightStrategy() {
        throw null;
    }

    public static WeightStrategy valueOf(String str) {
        return (WeightStrategy) Enum.valueOf(WeightStrategy.class, str);
    }

    public static WeightStrategy[] values() {
        return (WeightStrategy[]) $VALUES.clone();
    }
}
