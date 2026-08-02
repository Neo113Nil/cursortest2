package com.vk.typography;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TextViewExt.kt */
/* loaded from: classes11.dex */
public final class TextSizeUnit {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TextSizeUnit[] $VALUES;
    public static final TextSizeUnit PX;
    public static final TextSizeUnit SP;

    static {
        TextSizeUnit textSizeUnit = new TextSizeUnit("SP", 0);
        SP = textSizeUnit;
        TextSizeUnit textSizeUnit2 = new TextSizeUnit("PX", 1);
        PX = textSizeUnit2;
        TextSizeUnit[] textSizeUnitArr = {textSizeUnit, textSizeUnit2};
        $VALUES = textSizeUnitArr;
        $ENTRIES = new asp(textSizeUnitArr);
    }

    public TextSizeUnit() {
        throw null;
    }

    public static TextSizeUnit valueOf(String str) {
        return (TextSizeUnit) Enum.valueOf(TextSizeUnit.class, str);
    }

    public static TextSizeUnit[] values() {
        return (TextSizeUnit[]) $VALUES.clone();
    }
}
