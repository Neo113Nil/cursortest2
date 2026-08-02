package com.vk.community.design.compose.donut;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DonutUserStack.kt */
/* loaded from: classes17.dex */
public final class DonutUserStackClipPosition {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DonutUserStackClipPosition[] $VALUES;
    public static final DonutUserStackClipPosition End;
    public static final DonutUserStackClipPosition Start;

    static {
        DonutUserStackClipPosition donutUserStackClipPosition = new DonutUserStackClipPosition("Start", 0);
        Start = donutUserStackClipPosition;
        DonutUserStackClipPosition donutUserStackClipPosition2 = new DonutUserStackClipPosition("End", 1);
        End = donutUserStackClipPosition2;
        DonutUserStackClipPosition[] donutUserStackClipPositionArr = {donutUserStackClipPosition, donutUserStackClipPosition2};
        $VALUES = donutUserStackClipPositionArr;
        $ENTRIES = new asp(donutUserStackClipPositionArr);
    }

    public DonutUserStackClipPosition() {
        throw null;
    }

    public static zrp<DonutUserStackClipPosition> h() {
        return $ENTRIES;
    }

    public static DonutUserStackClipPosition valueOf(String str) {
        return (DonutUserStackClipPosition) Enum.valueOf(DonutUserStackClipPosition.class, str);
    }

    public static DonutUserStackClipPosition[] values() {
        return (DonutUserStackClipPosition[]) $VALUES.clone();
    }
}
