package com.vk.media.filters.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FilterType.kt */
/* loaded from: classes3.dex */
public final class FilterType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FilterType[] $VALUES;
    public static final FilterType B_W_01;
    public static final a Companion;
    public static final FilterType FREAKY_GF_01;
    public static final FilterType LUT_01;
    public static final FilterType LUT_02;
    public static final FilterType LUT_03;
    public static final FilterType LUT_04;
    public static final FilterType LUT_05;
    public static final FilterType NATURAL_02;
    public static final FilterType NATURAL_04;
    public static final FilterType NATURAL_05;
    public static final FilterType NONE;
    public static final FilterType RGB_01;
    public static final FilterType RGB_02;
    public static final FilterType RGB_03;
    public static final FilterType RGB_05;
    public static final FilterType VINTAGE_01;
    public static final FilterType VINTAGE_02;
    public static final FilterType VINTAGE_LMP;
    public static final FilterType VINTAGE_NATURAL_06;

    /* compiled from: FilterType.kt */
    public static final class a {
    }

    static {
        FilterType filterType = new FilterType("NONE", 0);
        NONE = filterType;
        FilterType filterType2 = new FilterType("NATURAL_02", 1);
        NATURAL_02 = filterType2;
        FilterType filterType3 = new FilterType("NATURAL_04", 2);
        NATURAL_04 = filterType3;
        FilterType filterType4 = new FilterType("VINTAGE_NATURAL_06", 3);
        VINTAGE_NATURAL_06 = filterType4;
        FilterType filterType5 = new FilterType("NATURAL_05", 4);
        NATURAL_05 = filterType5;
        FilterType filterType6 = new FilterType("VINTAGE_LMP", 5);
        VINTAGE_LMP = filterType6;
        FilterType filterType7 = new FilterType("LUT_02", 6);
        LUT_02 = filterType7;
        FilterType filterType8 = new FilterType("LUT_01", 7);
        LUT_01 = filterType8;
        FilterType filterType9 = new FilterType("LUT_03", 8);
        LUT_03 = filterType9;
        FilterType filterType10 = new FilterType("LUT_04", 9);
        LUT_04 = filterType10;
        FilterType filterType11 = new FilterType("LUT_05", 10);
        LUT_05 = filterType11;
        FilterType filterType12 = new FilterType("FREAKY_GF_01", 11);
        FREAKY_GF_01 = filterType12;
        FilterType filterType13 = new FilterType("RGB_02", 12);
        RGB_02 = filterType13;
        FilterType filterType14 = new FilterType("RGB_03", 13);
        RGB_03 = filterType14;
        FilterType filterType15 = new FilterType("RGB_05", 14);
        RGB_05 = filterType15;
        FilterType filterType16 = new FilterType("RGB_01", 15);
        RGB_01 = filterType16;
        FilterType filterType17 = new FilterType("B_W_01", 16);
        B_W_01 = filterType17;
        FilterType filterType18 = new FilterType("VINTAGE_01", 17);
        VINTAGE_01 = filterType18;
        FilterType filterType19 = new FilterType("VINTAGE_02", 18);
        VINTAGE_02 = filterType19;
        FilterType[] filterTypeArr = {filterType, filterType2, filterType3, filterType4, filterType5, filterType6, filterType7, filterType8, filterType9, filterType10, filterType11, filterType12, filterType13, filterType14, filterType15, filterType16, filterType17, filterType18, filterType19};
        $VALUES = filterTypeArr;
        $ENTRIES = new asp(filterTypeArr);
        Companion = new a();
    }

    public FilterType() {
        throw null;
    }

    public static FilterType valueOf(String str) {
        return (FilterType) Enum.valueOf(FilterType.class, str);
    }

    public static FilterType[] values() {
        return (FilterType[]) $VALUES.clone();
    }
}
