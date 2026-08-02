package com.vk.dto.clips;

import com.vk.media.filters.model.FilterType;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipItemFilterType.kt */
/* loaded from: classes18.dex */
public final class ClipItemFilterType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipItemFilterType[] $VALUES;
    public static final ClipItemFilterType B_W_01;
    public static final a Companion;
    public static final ClipItemFilterType FREAKY_GF_01;
    public static final ClipItemFilterType LUT_01;
    public static final ClipItemFilterType LUT_02;
    public static final ClipItemFilterType LUT_03;
    public static final ClipItemFilterType LUT_04;
    public static final ClipItemFilterType LUT_05;
    public static final ClipItemFilterType NATURAL_02;
    public static final ClipItemFilterType NATURAL_04;
    public static final ClipItemFilterType NATURAL_05;
    public static final ClipItemFilterType NONE;
    public static final ClipItemFilterType RGB_01;
    public static final ClipItemFilterType RGB_02;
    public static final ClipItemFilterType RGB_03;
    public static final ClipItemFilterType RGB_05;
    public static final ClipItemFilterType VINTAGE_01;
    public static final ClipItemFilterType VINTAGE_02;
    public static final ClipItemFilterType VINTAGE_LMP;
    public static final ClipItemFilterType VINTAGE_NATURAL_06;

    /* compiled from: ClipItemFilterType.kt */
    public static final class a {
        public static ClipItemFilterType a(String str) {
            ClipItemFilterType clipItemFilterType;
            ClipItemFilterType[] values = ClipItemFilterType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                clipItemFilterType = null;
                if (i >= length) {
                    break;
                }
                ClipItemFilterType clipItemFilterType2 = values[i];
                String name = clipItemFilterType2.name();
                Locale locale = Locale.ROOT;
                if (name.toLowerCase(locale).equals(str != null ? str.toLowerCase(locale) : null)) {
                    clipItemFilterType = clipItemFilterType2;
                    break;
                }
                i++;
            }
            return clipItemFilterType == null ? ClipItemFilterType.NONE : clipItemFilterType;
        }
    }

    /* compiled from: ClipItemFilterType.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipItemFilterType.values().length];
            try {
                iArr[ClipItemFilterType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipItemFilterType.NATURAL_02.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipItemFilterType.NATURAL_04.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClipItemFilterType.VINTAGE_NATURAL_06.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ClipItemFilterType.NATURAL_05.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ClipItemFilterType.VINTAGE_LMP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ClipItemFilterType.LUT_02.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ClipItemFilterType.LUT_01.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ClipItemFilterType.LUT_03.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ClipItemFilterType.LUT_04.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ClipItemFilterType.LUT_05.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ClipItemFilterType.FREAKY_GF_01.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ClipItemFilterType.RGB_02.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ClipItemFilterType.RGB_03.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ClipItemFilterType.RGB_05.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ClipItemFilterType.RGB_01.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ClipItemFilterType.B_W_01.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ClipItemFilterType.VINTAGE_01.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ClipItemFilterType.VINTAGE_02.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        ClipItemFilterType clipItemFilterType = new ClipItemFilterType("NONE", 0);
        NONE = clipItemFilterType;
        ClipItemFilterType clipItemFilterType2 = new ClipItemFilterType("NATURAL_02", 1);
        NATURAL_02 = clipItemFilterType2;
        ClipItemFilterType clipItemFilterType3 = new ClipItemFilterType("NATURAL_04", 2);
        NATURAL_04 = clipItemFilterType3;
        ClipItemFilterType clipItemFilterType4 = new ClipItemFilterType("VINTAGE_NATURAL_06", 3);
        VINTAGE_NATURAL_06 = clipItemFilterType4;
        ClipItemFilterType clipItemFilterType5 = new ClipItemFilterType("NATURAL_05", 4);
        NATURAL_05 = clipItemFilterType5;
        ClipItemFilterType clipItemFilterType6 = new ClipItemFilterType("VINTAGE_LMP", 5);
        VINTAGE_LMP = clipItemFilterType6;
        ClipItemFilterType clipItemFilterType7 = new ClipItemFilterType("LUT_02", 6);
        LUT_02 = clipItemFilterType7;
        ClipItemFilterType clipItemFilterType8 = new ClipItemFilterType("LUT_01", 7);
        LUT_01 = clipItemFilterType8;
        ClipItemFilterType clipItemFilterType9 = new ClipItemFilterType("LUT_03", 8);
        LUT_03 = clipItemFilterType9;
        ClipItemFilterType clipItemFilterType10 = new ClipItemFilterType("LUT_04", 9);
        LUT_04 = clipItemFilterType10;
        ClipItemFilterType clipItemFilterType11 = new ClipItemFilterType("LUT_05", 10);
        LUT_05 = clipItemFilterType11;
        ClipItemFilterType clipItemFilterType12 = new ClipItemFilterType("FREAKY_GF_01", 11);
        FREAKY_GF_01 = clipItemFilterType12;
        ClipItemFilterType clipItemFilterType13 = new ClipItemFilterType("RGB_02", 12);
        RGB_02 = clipItemFilterType13;
        ClipItemFilterType clipItemFilterType14 = new ClipItemFilterType("RGB_03", 13);
        RGB_03 = clipItemFilterType14;
        ClipItemFilterType clipItemFilterType15 = new ClipItemFilterType("RGB_05", 14);
        RGB_05 = clipItemFilterType15;
        ClipItemFilterType clipItemFilterType16 = new ClipItemFilterType("RGB_01", 15);
        RGB_01 = clipItemFilterType16;
        ClipItemFilterType clipItemFilterType17 = new ClipItemFilterType("B_W_01", 16);
        B_W_01 = clipItemFilterType17;
        ClipItemFilterType clipItemFilterType18 = new ClipItemFilterType("VINTAGE_01", 17);
        VINTAGE_01 = clipItemFilterType18;
        ClipItemFilterType clipItemFilterType19 = new ClipItemFilterType("VINTAGE_02", 18);
        VINTAGE_02 = clipItemFilterType19;
        ClipItemFilterType[] clipItemFilterTypeArr = {clipItemFilterType, clipItemFilterType2, clipItemFilterType3, clipItemFilterType4, clipItemFilterType5, clipItemFilterType6, clipItemFilterType7, clipItemFilterType8, clipItemFilterType9, clipItemFilterType10, clipItemFilterType11, clipItemFilterType12, clipItemFilterType13, clipItemFilterType14, clipItemFilterType15, clipItemFilterType16, clipItemFilterType17, clipItemFilterType18, clipItemFilterType19};
        $VALUES = clipItemFilterTypeArr;
        $ENTRIES = new asp(clipItemFilterTypeArr);
        Companion = new a();
    }

    public ClipItemFilterType() {
        throw null;
    }

    public static zrp<ClipItemFilterType> h() {
        return $ENTRIES;
    }

    public static ClipItemFilterType valueOf(String str) {
        return (ClipItemFilterType) Enum.valueOf(ClipItemFilterType.class, str);
    }

    public static ClipItemFilterType[] values() {
        return (ClipItemFilterType[]) $VALUES.clone();
    }

    public final FilterType i() {
        switch (b.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return FilterType.NONE;
            case 2:
                return FilterType.NATURAL_02;
            case 3:
                return FilterType.NATURAL_04;
            case 4:
                return FilterType.VINTAGE_NATURAL_06;
            case 5:
                return FilterType.NATURAL_05;
            case 6:
                return FilterType.VINTAGE_LMP;
            case 7:
                return FilterType.LUT_02;
            case 8:
                return FilterType.LUT_01;
            case 9:
                return FilterType.LUT_03;
            case 10:
                return FilterType.LUT_04;
            case 11:
                return FilterType.LUT_05;
            case 12:
                return FilterType.FREAKY_GF_01;
            case 13:
                return FilterType.RGB_02;
            case 14:
                return FilterType.RGB_03;
            case 15:
                return FilterType.RGB_05;
            case 16:
                return FilterType.RGB_01;
            case 17:
                return FilterType.B_W_01;
            case 18:
                return FilterType.VINTAGE_01;
            case 19:
                return FilterType.VINTAGE_02;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
