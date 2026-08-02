package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkSpinnerDefault.kt */
/* loaded from: classes17.dex */
public final class SpinnerSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SpinnerSize[] $VALUES;
    public static final SpinnerSize Size16;
    public static final SpinnerSize Size24;
    public static final SpinnerSize Size28;
    public static final SpinnerSize Size36;
    public static final SpinnerSize Size56;

    static {
        SpinnerSize spinnerSize = new SpinnerSize("Size16", 0);
        Size16 = spinnerSize;
        SpinnerSize spinnerSize2 = new SpinnerSize("Size24", 1);
        Size24 = spinnerSize2;
        SpinnerSize spinnerSize3 = new SpinnerSize("Size28", 2);
        Size28 = spinnerSize3;
        SpinnerSize spinnerSize4 = new SpinnerSize("Size36", 3);
        Size36 = spinnerSize4;
        SpinnerSize spinnerSize5 = new SpinnerSize("Size56", 4);
        Size56 = spinnerSize5;
        SpinnerSize[] spinnerSizeArr = {spinnerSize, spinnerSize2, spinnerSize3, spinnerSize4, spinnerSize5};
        $VALUES = spinnerSizeArr;
        $ENTRIES = new asp(spinnerSizeArr);
    }

    public SpinnerSize() {
        throw null;
    }

    public static zrp<SpinnerSize> h() {
        return $ENTRIES;
    }

    public static SpinnerSize valueOf(String str) {
        return (SpinnerSize) Enum.valueOf(SpinnerSize.class, str);
    }

    public static SpinnerSize[] values() {
        return (SpinnerSize[]) $VALUES.clone();
    }
}
