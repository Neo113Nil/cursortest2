package com.vk.donut.video.model.presentation.cardsize;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DonutVideoCardSource.kt */
/* loaded from: classes18.dex */
public final class DonutVideoCardSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DonutVideoCardSource[] $VALUES;
    public static final DonutVideoCardSource LARGE_CARD;
    public static final DonutVideoCardSource PLAYER;
    public static final DonutVideoCardSource SMALL_CARD;

    static {
        DonutVideoCardSource donutVideoCardSource = new DonutVideoCardSource("SMALL_CARD", 0);
        SMALL_CARD = donutVideoCardSource;
        DonutVideoCardSource donutVideoCardSource2 = new DonutVideoCardSource("LARGE_CARD", 1);
        LARGE_CARD = donutVideoCardSource2;
        DonutVideoCardSource donutVideoCardSource3 = new DonutVideoCardSource("PLAYER", 2);
        PLAYER = donutVideoCardSource3;
        DonutVideoCardSource[] donutVideoCardSourceArr = {donutVideoCardSource, donutVideoCardSource2, donutVideoCardSource3};
        $VALUES = donutVideoCardSourceArr;
        $ENTRIES = new asp(donutVideoCardSourceArr);
    }

    public DonutVideoCardSource() {
        throw null;
    }

    public static DonutVideoCardSource valueOf(String str) {
        return (DonutVideoCardSource) Enum.valueOf(DonutVideoCardSource.class, str);
    }

    public static DonutVideoCardSource[] values() {
        return (DonutVideoCardSource[]) $VALUES.clone();
    }
}
