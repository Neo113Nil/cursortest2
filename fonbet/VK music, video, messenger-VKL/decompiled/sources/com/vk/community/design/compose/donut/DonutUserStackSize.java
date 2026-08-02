package com.vk.community.design.compose.donut;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DonutUserStackDefaults.kt */
/* loaded from: classes17.dex */
public final class DonutUserStackSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DonutUserStackSize[] $VALUES;
    public static final DonutUserStackSize Large;
    public static final DonutUserStackSize Medium;

    static {
        DonutUserStackSize donutUserStackSize = new DonutUserStackSize("Medium", 0);
        Medium = donutUserStackSize;
        DonutUserStackSize donutUserStackSize2 = new DonutUserStackSize("Large", 1);
        Large = donutUserStackSize2;
        DonutUserStackSize[] donutUserStackSizeArr = {donutUserStackSize, donutUserStackSize2};
        $VALUES = donutUserStackSizeArr;
        $ENTRIES = new asp(donutUserStackSizeArr);
    }

    public DonutUserStackSize() {
        throw null;
    }

    public static zrp<DonutUserStackSize> h() {
        return $ENTRIES;
    }

    public static DonutUserStackSize valueOf(String str) {
        return (DonutUserStackSize) Enum.valueOf(DonutUserStackSize.class, str);
    }

    public static DonutUserStackSize[] values() {
        return (DonutUserStackSize[]) $VALUES.clone();
    }
}
