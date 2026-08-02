package com.vk.editor.filters.correction.entity;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HslColorType.kt */
/* loaded from: classes18.dex */
public final class HslColorType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HslColorType[] $VALUES;
    public static final HslColorType Blue;
    public static final HslColorType Cyan;
    public static final HslColorType Green;
    public static final HslColorType Magenta;
    public static final HslColorType Orange;
    public static final HslColorType Purple;
    public static final HslColorType Red;
    public static final HslColorType Yellow;

    static {
        HslColorType hslColorType = new HslColorType("Red", 0);
        Red = hslColorType;
        HslColorType hslColorType2 = new HslColorType("Orange", 1);
        Orange = hslColorType2;
        HslColorType hslColorType3 = new HslColorType("Yellow", 2);
        Yellow = hslColorType3;
        HslColorType hslColorType4 = new HslColorType("Green", 3);
        Green = hslColorType4;
        HslColorType hslColorType5 = new HslColorType("Cyan", 4);
        Cyan = hslColorType5;
        HslColorType hslColorType6 = new HslColorType("Blue", 5);
        Blue = hslColorType6;
        HslColorType hslColorType7 = new HslColorType("Purple", 6);
        Purple = hslColorType7;
        HslColorType hslColorType8 = new HslColorType("Magenta", 7);
        Magenta = hslColorType8;
        HslColorType[] hslColorTypeArr = {hslColorType, hslColorType2, hslColorType3, hslColorType4, hslColorType5, hslColorType6, hslColorType7, hslColorType8};
        $VALUES = hslColorTypeArr;
        $ENTRIES = new asp(hslColorTypeArr);
    }

    public HslColorType() {
        throw null;
    }

    public static zrp<HslColorType> h() {
        return $ENTRIES;
    }

    public static HslColorType valueOf(String str) {
        return (HslColorType) Enum.valueOf(HslColorType.class, str);
    }

    public static HslColorType[] values() {
        return (HslColorType[]) $VALUES.clone();
    }
}
