package com.vk.typography;

import android.content.Context;
import android.graphics.Typeface;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.lang.reflect.Field;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Regex;
import xsna.asp;
import xsna.dbg0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Font.kt */
/* loaded from: classes11.dex */
public final class Font {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Font[] $VALUES;
    public static final Font Black;
    public static final Font Bold;
    public static final Font Bold14;
    public static final Font Bold15;
    public static final Font Bold16;
    public static final Font Bold20;
    public static final a Companion;
    public static final float DEFAULT_SIZE_SP = 13.0f;
    public static final Font DisplayBold;
    public static final Font DisplayDemiBold;
    public static final Font DisplayMedium;
    public static final Font DisplayRegular;
    public static final Font FortunAfLed7Seg3;
    public static final Font Light;
    public static final Font Light14;
    public static final Font Light15;
    public static final Font Light16;
    public static final Font Light20;
    public static final Font Medium;
    public static final Font Medium14;
    public static final Font Medium15;
    public static final Font Medium16;
    public static final Font Medium20;
    public static final Font Regular;
    public static final Font Regular14;
    public static final Font Regular15;
    public static final Font Regular16;
    public static final Font Regular20;
    public static final Font RussooneRegular;
    private static final Field[] fontResources;
    private static final Regex fontResourcesRegex;
    private final FontFamily family;
    private final float letterSpacing;
    private final Integer resId;

    /* compiled from: Font.kt */
    public static final class a {

        /* compiled from: Font.kt */
        /* renamed from: com.vk.typography.Font$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1932a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FontFamily.values().length];
                try {
                    iArr[FontFamily.LIGHT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FontFamily.REGULAR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FontFamily.MEDIUM.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[FontFamily.BOLD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[FontFamily.BLACK.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[FontFamily.DISPLAY_REGULAR.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[FontFamily.DISPLAY_MEDIUM.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[FontFamily.DISPLAY_DEMIBOLD.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[FontFamily.DISPLAY_BOLD.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[FontFamily.FORTUN_AF_LED_7_SEG3.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[FontFamily.RUSSOONE_REGULAR.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static Font a(FontFamily fontFamily, float f) {
            switch (C1932a.$EnumSwitchMapping$0[fontFamily.ordinal()]) {
                case 1:
                    return f >= 20.0f ? Font.Light20 : f >= 16.0f ? Font.Light16 : f >= 15.0f ? Font.Light15 : f >= 14.0f ? Font.Light14 : Font.Light;
                case 2:
                    return f >= 20.0f ? Font.Regular20 : f >= 16.0f ? Font.Regular16 : f >= 15.0f ? Font.Regular15 : f >= 14.0f ? Font.Regular14 : Font.Regular;
                case 3:
                    return f >= 20.0f ? Font.Medium20 : f >= 16.0f ? Font.Medium16 : f >= 15.0f ? Font.Medium15 : f >= 14.0f ? Font.Medium14 : Font.Medium;
                case 4:
                    return f >= 20.0f ? Font.Bold20 : f >= 16.0f ? Font.Bold16 : f >= 15.0f ? Font.Bold15 : f >= 14.0f ? Font.Bold14 : Font.Bold;
                case 5:
                    return Font.Black;
                case 6:
                    return Font.DisplayRegular;
                case 7:
                    return Font.DisplayMedium;
                case 8:
                    return Font.DisplayDemiBold;
                case 9:
                    return Font.DisplayBold;
                case 10:
                    return Font.FortunAfLed7Seg3;
                case 11:
                    return Font.RussooneRegular;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    static {
        FontFamily fontFamily = FontFamily.LIGHT;
        Font font = new Font("Light", 0, fontFamily, null, 6);
        Light = font;
        FontFamily fontFamily2 = FontFamily.REGULAR;
        Font font2 = new Font("Regular", 1, fontFamily2, null, 6);
        Regular = font2;
        FontFamily fontFamily3 = FontFamily.MEDIUM;
        Font font3 = new Font("Medium", 2, fontFamily3, null, 6);
        Medium = font3;
        FontFamily fontFamily4 = FontFamily.BOLD;
        Font font4 = new Font("Bold", 3, fontFamily4, null, 6);
        Bold = font4;
        Font font5 = new Font("Black", 4, FontFamily.BLACK, null, 6);
        Black = font5;
        Font font6 = new Font("Light14", 5, fontFamily, null, 6);
        Light14 = font6;
        Font font7 = new Font("Regular14", 6, fontFamily2, null, 6);
        Regular14 = font7;
        Font font8 = new Font("Medium14", 7, fontFamily3, null, 2);
        Medium14 = font8;
        Font font9 = new Font("Bold14", 8, fontFamily4, null, 2);
        Bold14 = font9;
        Font font10 = new Font("Light15", 9, fontFamily, null, 6);
        Light15 = font10;
        Font font11 = new Font("Regular15", 10, fontFamily2, null, 6);
        Regular15 = font11;
        Font font12 = new Font("Medium15", 11, fontFamily3, null, 6);
        Medium15 = font12;
        Font font13 = new Font("Bold15", 12, fontFamily4, null, 6);
        Bold15 = font13;
        Font font14 = new Font("Light16", 13, fontFamily, null, 6);
        Light16 = font14;
        Font font15 = new Font("Regular16", 14, fontFamily2, null, 6);
        Regular16 = font15;
        Font font16 = new Font("Medium16", 15, fontFamily3, null, 6);
        Medium16 = font16;
        Font font17 = new Font("Bold16", 16, fontFamily4, null, 6);
        Bold16 = font17;
        Font font18 = new Font("Light20", 17, fontFamily, null, 6);
        Light20 = font18;
        Font font19 = new Font("Regular20", 18, fontFamily2, null, 6);
        Regular20 = font19;
        Font font20 = new Font("Medium20", 19, fontFamily3, null, 6);
        Medium20 = font20;
        Font font21 = new Font("Bold20", 20, fontFamily4, null, 6);
        Bold20 = font21;
        Font font22 = new Font("DisplayRegular", 21, FontFamily.DISPLAY_REGULAR, Integer.valueOf(R.font.vk_sans_display_regular), 4);
        DisplayRegular = font22;
        Font font23 = new Font("DisplayMedium", 22, FontFamily.DISPLAY_MEDIUM, Integer.valueOf(R.font.vk_sans_display_medium), 4);
        DisplayMedium = font23;
        Font font24 = new Font("DisplayDemiBold", 23, FontFamily.DISPLAY_DEMIBOLD, Integer.valueOf(R.font.vk_sans_display_demibold), 4);
        DisplayDemiBold = font24;
        Font font25 = new Font("DisplayBold", 24, FontFamily.DISPLAY_BOLD, Integer.valueOf(R.font.vk_sans_display_bold), 4);
        DisplayBold = font25;
        Font font26 = new Font("FortunAfLed7Seg3", 25, FontFamily.FORTUN_AF_LED_7_SEG3, Integer.valueOf(R.font.vk_fortun_af_led7seg_3), 4);
        FortunAfLed7Seg3 = font26;
        Font font27 = new Font("RussooneRegular", 26, FontFamily.RUSSOONE_REGULAR, Integer.valueOf(R.font.vk_russoone_regular), 4);
        RussooneRegular = font27;
        Font[] fontArr = {font, font2, font3, font4, font5, font6, font7, font8, font9, font10, font11, font12, font13, font14, font15, font16, font17, font18, font19, font20, font21, font22, font23, font24, font25, font26, font27};
        $VALUES = fontArr;
        $ENTRIES = new asp(fontArr);
        Companion = new a();
        fontResources = R$font.class.getFields();
        fontResourcesRegex = new Regex("res/font/([0-9a-zA-Z_]*)");
    }

    public Font() {
        throw null;
    }

    public Font(String str, int i, FontFamily fontFamily, Integer num, int i2) {
        num = (i2 & 2) != 0 ? null : num;
        float f = (i2 & 4) != 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : -0.0031f;
        this.family = fontFamily;
        this.resId = num;
        this.letterSpacing = f;
    }

    public static Font valueOf(String str) {
        return (Font) Enum.valueOf(Font.class, str);
    }

    public static Font[] values() {
        return (Font[]) $VALUES.clone();
    }

    public final float j() {
        return this.letterSpacing;
    }

    public final Typeface k(Context context) {
        Typeface typeface;
        Integer num = this.resId;
        if (num != null) {
            int intValue = num.intValue();
            Companion.getClass();
            try {
                typeface = dbg0.a(intValue, context);
            } catch (Exception unused) {
                typeface = null;
            }
            if (typeface != null) {
                return typeface;
            }
        }
        return Typeface.create(this.family.h(), this.family.i());
    }
}
