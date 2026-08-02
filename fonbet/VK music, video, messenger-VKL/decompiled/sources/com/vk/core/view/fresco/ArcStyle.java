package com.vk.core.view.fresco;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ArcStyle.kt */
/* loaded from: classes17.dex */
public final class ArcStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ArcStyle[] $VALUES;
    public static final ArcStyle ARC_BOTTOM_LEFT_BOTTOM_RIGHT;
    public static final ArcStyle ARC_BOTTOM_LEFT_TOP_RIGHT;
    public static final ArcStyle ARC_BOTTOM_RIGHT_TOP_LEFT;
    public static final ArcStyle ARC_BOTTOM_RIGHT_TOP_RIGHT;
    public static final ArcStyle ARC_NONE;
    public static final ArcStyle ARC_TOP_LEFT_BOTTOM_LEFT;
    public static final ArcStyle ARC_TOP_LEFT_BOTTOM_RIGHT;
    public static final ArcStyle ARC_TOP_RIGHT_BOTTOM_LEFT;
    public static final ArcStyle ARC_TOP_RIGHT_TOP_LEFT;
    public static final a Companion;

    /* compiled from: ArcStyle.kt */
    public static final class a {

        /* compiled from: ArcStyle.kt */
        /* renamed from: com.vk.core.view.fresco.ArcStyle$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0888a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ArcStyle.values().length];
                try {
                    iArr[ArcStyle.ARC_BOTTOM_LEFT_TOP_RIGHT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ArcStyle.ARC_TOP_LEFT_BOTTOM_RIGHT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ArcStyle.ARC_TOP_RIGHT_BOTTOM_LEFT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ArcStyle.ARC_BOTTOM_RIGHT_TOP_LEFT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ArcStyle.ARC_BOTTOM_LEFT_BOTTOM_RIGHT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ArcStyle.ARC_TOP_LEFT_BOTTOM_LEFT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ArcStyle.ARC_TOP_RIGHT_TOP_LEFT.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[ArcStyle.ARC_BOTTOM_RIGHT_TOP_RIGHT.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    }

    static {
        ArcStyle arcStyle = new ArcStyle("ARC_NONE", 0);
        ARC_NONE = arcStyle;
        ArcStyle arcStyle2 = new ArcStyle("ARC_BOTTOM_LEFT_TOP_RIGHT", 1);
        ARC_BOTTOM_LEFT_TOP_RIGHT = arcStyle2;
        ArcStyle arcStyle3 = new ArcStyle("ARC_TOP_LEFT_BOTTOM_RIGHT", 2);
        ARC_TOP_LEFT_BOTTOM_RIGHT = arcStyle3;
        ArcStyle arcStyle4 = new ArcStyle("ARC_TOP_RIGHT_BOTTOM_LEFT", 3);
        ARC_TOP_RIGHT_BOTTOM_LEFT = arcStyle4;
        ArcStyle arcStyle5 = new ArcStyle("ARC_BOTTOM_RIGHT_TOP_LEFT", 4);
        ARC_BOTTOM_RIGHT_TOP_LEFT = arcStyle5;
        ArcStyle arcStyle6 = new ArcStyle("ARC_BOTTOM_LEFT_BOTTOM_RIGHT", 5);
        ARC_BOTTOM_LEFT_BOTTOM_RIGHT = arcStyle6;
        ArcStyle arcStyle7 = new ArcStyle("ARC_TOP_LEFT_BOTTOM_LEFT", 6);
        ARC_TOP_LEFT_BOTTOM_LEFT = arcStyle7;
        ArcStyle arcStyle8 = new ArcStyle("ARC_TOP_RIGHT_TOP_LEFT", 7);
        ARC_TOP_RIGHT_TOP_LEFT = arcStyle8;
        ArcStyle arcStyle9 = new ArcStyle("ARC_BOTTOM_RIGHT_TOP_RIGHT", 8);
        ARC_BOTTOM_RIGHT_TOP_RIGHT = arcStyle9;
        ArcStyle[] arcStyleArr = {arcStyle, arcStyle2, arcStyle3, arcStyle4, arcStyle5, arcStyle6, arcStyle7, arcStyle8, arcStyle9};
        $VALUES = arcStyleArr;
        $ENTRIES = new asp(arcStyleArr);
        Companion = new a();
    }

    public ArcStyle() {
        throw null;
    }

    public static ArcStyle valueOf(String str) {
        return (ArcStyle) Enum.valueOf(ArcStyle.class, str);
    }

    public static ArcStyle[] values() {
        return (ArcStyle[]) $VALUES.clone();
    }
}
