package com.vk.core.view.text.strategies;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExpandMeasureStrategy.kt */
/* loaded from: classes17.dex */
public final class ExpandMeasureStrategy {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ExpandMeasureStrategy[] $VALUES;
    public static final ExpandMeasureStrategy ShowMoreLine;
    public static final ExpandMeasureStrategy TextLine;

    static {
        ExpandMeasureStrategy expandMeasureStrategy = new ExpandMeasureStrategy("TextLine", 0);
        TextLine = expandMeasureStrategy;
        ExpandMeasureStrategy expandMeasureStrategy2 = new ExpandMeasureStrategy("ShowMoreLine", 1);
        ShowMoreLine = expandMeasureStrategy2;
        ExpandMeasureStrategy[] expandMeasureStrategyArr = {expandMeasureStrategy, expandMeasureStrategy2};
        $VALUES = expandMeasureStrategyArr;
        $ENTRIES = new asp(expandMeasureStrategyArr);
    }

    public ExpandMeasureStrategy() {
        throw null;
    }

    public static ExpandMeasureStrategy valueOf(String str) {
        return (ExpandMeasureStrategy) Enum.valueOf(ExpandMeasureStrategy.class, str);
    }

    public static ExpandMeasureStrategy[] values() {
        return (ExpandMeasureStrategy[]) $VALUES.clone();
    }
}
