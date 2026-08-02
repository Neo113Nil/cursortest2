package com.vk.clips.sdk.drafts.models.video.filter;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsDraftFilterType.kt */
/* loaded from: classes17.dex */
public final class ClipsDraftFilterType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsDraftFilterType[] $VALUES;
    public static final ClipsDraftFilterType B_W_01;
    public static final a Companion;
    public static final ClipsDraftFilterType FREAKY_GF_01;
    public static final ClipsDraftFilterType LUT_01;
    public static final ClipsDraftFilterType LUT_02;
    public static final ClipsDraftFilterType LUT_03;
    public static final ClipsDraftFilterType LUT_04;
    public static final ClipsDraftFilterType LUT_05;
    public static final ClipsDraftFilterType NATURAL_02;
    public static final ClipsDraftFilterType NATURAL_04;
    public static final ClipsDraftFilterType NATURAL_05;
    public static final ClipsDraftFilterType NONE;
    public static final ClipsDraftFilterType RGB_01;
    public static final ClipsDraftFilterType RGB_02;
    public static final ClipsDraftFilterType RGB_03;
    public static final ClipsDraftFilterType RGB_05;
    public static final ClipsDraftFilterType VINTAGE_01;
    public static final ClipsDraftFilterType VINTAGE_02;
    public static final ClipsDraftFilterType VINTAGE_LMP;
    public static final ClipsDraftFilterType VINTAGE_NATURAL_06;

    /* compiled from: ClipsDraftFilterType.kt */
    public static final class a {
    }

    static {
        ClipsDraftFilterType clipsDraftFilterType = new ClipsDraftFilterType("NONE", 0);
        NONE = clipsDraftFilterType;
        ClipsDraftFilterType clipsDraftFilterType2 = new ClipsDraftFilterType("NATURAL_02", 1);
        NATURAL_02 = clipsDraftFilterType2;
        ClipsDraftFilterType clipsDraftFilterType3 = new ClipsDraftFilterType("NATURAL_04", 2);
        NATURAL_04 = clipsDraftFilterType3;
        ClipsDraftFilterType clipsDraftFilterType4 = new ClipsDraftFilterType("VINTAGE_NATURAL_06", 3);
        VINTAGE_NATURAL_06 = clipsDraftFilterType4;
        ClipsDraftFilterType clipsDraftFilterType5 = new ClipsDraftFilterType("NATURAL_05", 4);
        NATURAL_05 = clipsDraftFilterType5;
        ClipsDraftFilterType clipsDraftFilterType6 = new ClipsDraftFilterType("VINTAGE_LMP", 5);
        VINTAGE_LMP = clipsDraftFilterType6;
        ClipsDraftFilterType clipsDraftFilterType7 = new ClipsDraftFilterType("LUT_02", 6);
        LUT_02 = clipsDraftFilterType7;
        ClipsDraftFilterType clipsDraftFilterType8 = new ClipsDraftFilterType("LUT_01", 7);
        LUT_01 = clipsDraftFilterType8;
        ClipsDraftFilterType clipsDraftFilterType9 = new ClipsDraftFilterType("LUT_03", 8);
        LUT_03 = clipsDraftFilterType9;
        ClipsDraftFilterType clipsDraftFilterType10 = new ClipsDraftFilterType("LUT_04", 9);
        LUT_04 = clipsDraftFilterType10;
        ClipsDraftFilterType clipsDraftFilterType11 = new ClipsDraftFilterType("LUT_05", 10);
        LUT_05 = clipsDraftFilterType11;
        ClipsDraftFilterType clipsDraftFilterType12 = new ClipsDraftFilterType("FREAKY_GF_01", 11);
        FREAKY_GF_01 = clipsDraftFilterType12;
        ClipsDraftFilterType clipsDraftFilterType13 = new ClipsDraftFilterType("RGB_02", 12);
        RGB_02 = clipsDraftFilterType13;
        ClipsDraftFilterType clipsDraftFilterType14 = new ClipsDraftFilterType("RGB_03", 13);
        RGB_03 = clipsDraftFilterType14;
        ClipsDraftFilterType clipsDraftFilterType15 = new ClipsDraftFilterType("RGB_05", 14);
        RGB_05 = clipsDraftFilterType15;
        ClipsDraftFilterType clipsDraftFilterType16 = new ClipsDraftFilterType("RGB_01", 15);
        RGB_01 = clipsDraftFilterType16;
        ClipsDraftFilterType clipsDraftFilterType17 = new ClipsDraftFilterType("B_W_01", 16);
        B_W_01 = clipsDraftFilterType17;
        ClipsDraftFilterType clipsDraftFilterType18 = new ClipsDraftFilterType("VINTAGE_01", 17);
        VINTAGE_01 = clipsDraftFilterType18;
        ClipsDraftFilterType clipsDraftFilterType19 = new ClipsDraftFilterType("VINTAGE_02", 18);
        VINTAGE_02 = clipsDraftFilterType19;
        ClipsDraftFilterType[] clipsDraftFilterTypeArr = {clipsDraftFilterType, clipsDraftFilterType2, clipsDraftFilterType3, clipsDraftFilterType4, clipsDraftFilterType5, clipsDraftFilterType6, clipsDraftFilterType7, clipsDraftFilterType8, clipsDraftFilterType9, clipsDraftFilterType10, clipsDraftFilterType11, clipsDraftFilterType12, clipsDraftFilterType13, clipsDraftFilterType14, clipsDraftFilterType15, clipsDraftFilterType16, clipsDraftFilterType17, clipsDraftFilterType18, clipsDraftFilterType19};
        $VALUES = clipsDraftFilterTypeArr;
        $ENTRIES = new asp(clipsDraftFilterTypeArr);
        Companion = new a();
    }

    public ClipsDraftFilterType() {
        throw null;
    }

    public static zrp<ClipsDraftFilterType> h() {
        return $ENTRIES;
    }

    public static ClipsDraftFilterType valueOf(String str) {
        return (ClipsDraftFilterType) Enum.valueOf(ClipsDraftFilterType.class, str);
    }

    public static ClipsDraftFilterType[] values() {
        return (ClipsDraftFilterType[]) $VALUES.clone();
    }
}
