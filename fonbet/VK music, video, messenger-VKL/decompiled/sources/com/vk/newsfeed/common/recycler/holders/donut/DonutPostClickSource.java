package com.vk.newsfeed.common.recycler.holders.donut;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DonutPostClickHandler.kt */
/* loaded from: classes4.dex */
public final class DonutPostClickSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DonutPostClickSource[] $VALUES;
    public static final DonutPostClickSource Background;
    public static final DonutPostClickSource Button;

    static {
        DonutPostClickSource donutPostClickSource = new DonutPostClickSource("Background", 0);
        Background = donutPostClickSource;
        DonutPostClickSource donutPostClickSource2 = new DonutPostClickSource("Button", 1);
        Button = donutPostClickSource2;
        DonutPostClickSource[] donutPostClickSourceArr = {donutPostClickSource, donutPostClickSource2};
        $VALUES = donutPostClickSourceArr;
        $ENTRIES = new asp(donutPostClickSourceArr);
    }

    public DonutPostClickSource() {
        throw null;
    }

    public static DonutPostClickSource valueOf(String str) {
        return (DonutPostClickSource) Enum.valueOf(DonutPostClickSource.class, str);
    }

    public static DonutPostClickSource[] values() {
        return (DonutPostClickSource[]) $VALUES.clone();
    }
}
