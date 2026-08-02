package com.vk.editor.filters.correction.model;

import com.vk.dto.clips.ClipItemFilterType;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FilterType.kt */
/* loaded from: classes18.dex */
public final class FilterType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FilterType[] $VALUES;
    public static final FilterType B_W_01;
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
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FilterType.values().length];
            try {
                iArr[FilterType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FilterType.NATURAL_02.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FilterType.NATURAL_04.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FilterType.VINTAGE_NATURAL_06.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FilterType.NATURAL_05.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FilterType.VINTAGE_LMP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FilterType.LUT_02.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FilterType.LUT_01.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FilterType.LUT_03.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[FilterType.LUT_04.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[FilterType.LUT_05.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[FilterType.FREAKY_GF_01.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[FilterType.RGB_02.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[FilterType.RGB_03.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[FilterType.RGB_05.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[FilterType.RGB_01.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[FilterType.B_W_01.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[FilterType.VINTAGE_01.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[FilterType.VINTAGE_02.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
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
    }

    public FilterType() {
        throw null;
    }

    public static zrp<FilterType> h() {
        return $ENTRIES;
    }

    public static FilterType valueOf(String str) {
        return (FilterType) Enum.valueOf(FilterType.class, str);
    }

    public static FilterType[] values() {
        return (FilterType[]) $VALUES.clone();
    }

    public final ClipItemFilterType i() {
        switch (a.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return ClipItemFilterType.NONE;
            case 2:
                return ClipItemFilterType.NATURAL_02;
            case 3:
                return ClipItemFilterType.NATURAL_04;
            case 4:
                return ClipItemFilterType.VINTAGE_NATURAL_06;
            case 5:
                return ClipItemFilterType.NATURAL_05;
            case 6:
                return ClipItemFilterType.VINTAGE_LMP;
            case 7:
                return ClipItemFilterType.LUT_02;
            case 8:
                return ClipItemFilterType.LUT_01;
            case 9:
                return ClipItemFilterType.LUT_03;
            case 10:
                return ClipItemFilterType.LUT_04;
            case 11:
                return ClipItemFilterType.LUT_05;
            case 12:
                return ClipItemFilterType.FREAKY_GF_01;
            case 13:
                return ClipItemFilterType.RGB_02;
            case 14:
                return ClipItemFilterType.RGB_03;
            case 15:
                return ClipItemFilterType.RGB_05;
            case 16:
                return ClipItemFilterType.RGB_01;
            case 17:
                return ClipItemFilterType.B_W_01;
            case 18:
                return ClipItemFilterType.VINTAGE_01;
            case 19:
                return ClipItemFilterType.VINTAGE_02;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
