package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SeparatorDefaults.kt */
/* loaded from: classes17.dex */
public final class SeparatorDpi {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SeparatorDpi[] $VALUES;
    public static final SeparatorDpi At1x;
    public static final SeparatorDpi At2x;
    public static final SeparatorDpi At3x;

    static {
        SeparatorDpi separatorDpi = new SeparatorDpi("At1x", 0);
        At1x = separatorDpi;
        SeparatorDpi separatorDpi2 = new SeparatorDpi("At2x", 1);
        At2x = separatorDpi2;
        SeparatorDpi separatorDpi3 = new SeparatorDpi("At3x", 2);
        At3x = separatorDpi3;
        SeparatorDpi[] separatorDpiArr = {separatorDpi, separatorDpi2, separatorDpi3};
        $VALUES = separatorDpiArr;
        $ENTRIES = new asp(separatorDpiArr);
    }

    public SeparatorDpi() {
        throw null;
    }

    public static zrp<SeparatorDpi> h() {
        return $ENTRIES;
    }

    public static SeparatorDpi valueOf(String str) {
        return (SeparatorDpi) Enum.valueOf(SeparatorDpi.class, str);
    }

    public static SeparatorDpi[] values() {
        return (SeparatorDpi[]) $VALUES.clone();
    }
}
