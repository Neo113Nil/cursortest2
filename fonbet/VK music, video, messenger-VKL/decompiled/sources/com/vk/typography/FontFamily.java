package com.vk.typography;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import xsna.asp;
import xsna.epx;
import xsna.zil0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FontFamily.kt */
/* loaded from: classes11.dex */
public final class FontFamily {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FontFamily[] $VALUES;
    public static final FontFamily BLACK;
    public static final FontFamily BOLD;
    public static final a Companion;
    public static final FontFamily DISPLAY_BOLD;
    public static final FontFamily DISPLAY_DEMIBOLD;
    public static final FontFamily DISPLAY_MEDIUM;
    public static final FontFamily DISPLAY_REGULAR;
    public static final FontFamily FORTUN_AF_LED_7_SEG3;
    public static final FontFamily LIGHT;
    public static final FontFamily MEDIUM;
    public static final FontFamily REGULAR;
    public static final FontFamily RUSSOONE_REGULAR;
    private final String systemName;
    private final int systemStyle;

    /* compiled from: FontFamily.kt */
    public static final class a {
        @SuppressLint({"ResourceType"})
        public static FontFamily a(int i, Context context) {
            FontFamily fontFamily;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{R.attr.fontFamily, R.attr.textStyle});
            int i2 = 0;
            String string = obtainStyledAttributes.getString(0);
            int i3 = obtainStyledAttributes.getInt(1, 0);
            obtainStyledAttributes.recycle();
            FontFamily[] values = FontFamily.values();
            int length = values.length;
            while (true) {
                if (i2 >= length) {
                    fontFamily = null;
                    break;
                }
                fontFamily = values[i2];
                if (epx.f(fontFamily.h(), string) && fontFamily.i() == i3) {
                    break;
                }
                i2++;
            }
            if (fontFamily != null) {
                return fontFamily;
            }
            throw new Resources.NotFoundException(zil0.a(i3, "A font for this style is not found: systemName = ", string, ", systemStyle = "));
        }
    }

    static {
        FontFamily fontFamily = new FontFamily("LIGHT", 0, "sans-serif-light", 0);
        LIGHT = fontFamily;
        FontFamily fontFamily2 = new FontFamily("REGULAR", 1, C.SANS_SERIF_NAME, 0);
        REGULAR = fontFamily2;
        FontFamily fontFamily3 = new FontFamily("MEDIUM", 2, "sans-serif-medium", 0);
        MEDIUM = fontFamily3;
        FontFamily fontFamily4 = new FontFamily("BOLD", 3, C.SANS_SERIF_NAME, 1);
        BOLD = fontFamily4;
        FontFamily fontFamily5 = new FontFamily("BLACK", 4, "sans-serif-black", 0);
        BLACK = fontFamily5;
        FontFamily fontFamily6 = new FontFamily("DISPLAY_REGULAR", 5, C.SANS_SERIF_NAME, 0);
        DISPLAY_REGULAR = fontFamily6;
        FontFamily fontFamily7 = new FontFamily("DISPLAY_MEDIUM", 6, "sans-serif-medium", 0);
        DISPLAY_MEDIUM = fontFamily7;
        FontFamily fontFamily8 = new FontFamily("DISPLAY_DEMIBOLD", 7, C.SANS_SERIF_NAME, 1);
        DISPLAY_DEMIBOLD = fontFamily8;
        FontFamily fontFamily9 = new FontFamily("DISPLAY_BOLD", 8, C.SANS_SERIF_NAME, 1);
        DISPLAY_BOLD = fontFamily9;
        FontFamily fontFamily10 = new FontFamily("FORTUN_AF_LED_7_SEG3", 9, C.SANS_SERIF_NAME, 0);
        FORTUN_AF_LED_7_SEG3 = fontFamily10;
        FontFamily fontFamily11 = new FontFamily("RUSSOONE_REGULAR", 10, C.SANS_SERIF_NAME, 0);
        RUSSOONE_REGULAR = fontFamily11;
        FontFamily[] fontFamilyArr = {fontFamily, fontFamily2, fontFamily3, fontFamily4, fontFamily5, fontFamily6, fontFamily7, fontFamily8, fontFamily9, fontFamily10, fontFamily11};
        $VALUES = fontFamilyArr;
        $ENTRIES = new asp(fontFamilyArr);
        Companion = new a();
    }

    public FontFamily(String str, int i, String str2, int i2) {
        this.systemName = str2;
        this.systemStyle = i2;
    }

    public static FontFamily valueOf(String str) {
        return (FontFamily) Enum.valueOf(FontFamily.class, str);
    }

    public static FontFamily[] values() {
        return (FontFamily[]) $VALUES.clone();
    }

    public final String h() {
        return this.systemName;
    }

    public final int i() {
        return this.systemStyle;
    }
}
