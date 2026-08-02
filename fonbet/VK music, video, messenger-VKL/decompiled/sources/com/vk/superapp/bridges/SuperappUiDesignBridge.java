package com.vk.superapp.bridges;

import android.widget.TextView;
import xsna.asp;
import xsna.zrp;

/* compiled from: SuperappUiDesignBridge.kt */
/* loaded from: classes11.dex */
public interface SuperappUiDesignBridge {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperappUiDesignBridge.kt */
    /* loaded from: classes6.dex */
    public static final class FontFamily {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FontFamily[] $VALUES;
        public static final FontFamily BLACK;
        public static final FontFamily BOLD;
        public static final FontFamily LIGHT;
        public static final FontFamily MEDIUM;
        public static final FontFamily REGULAR;

        static {
            FontFamily fontFamily = new FontFamily("LIGHT", 0);
            LIGHT = fontFamily;
            FontFamily fontFamily2 = new FontFamily("REGULAR", 1);
            REGULAR = fontFamily2;
            FontFamily fontFamily3 = new FontFamily("MEDIUM", 2);
            MEDIUM = fontFamily3;
            FontFamily fontFamily4 = new FontFamily("BOLD", 3);
            BOLD = fontFamily4;
            FontFamily fontFamily5 = new FontFamily("BLACK", 4);
            BLACK = fontFamily5;
            FontFamily[] fontFamilyArr = {fontFamily, fontFamily2, fontFamily3, fontFamily4, fontFamily5};
            $VALUES = fontFamilyArr;
            $ENTRIES = new asp(fontFamilyArr);
        }

        public FontFamily() {
            throw null;
        }

        public static FontFamily valueOf(String str) {
            return (FontFamily) Enum.valueOf(FontFamily.class, str);
        }

        public static FontFamily[] values() {
            return (FontFamily[]) $VALUES.clone();
        }
    }

    /* compiled from: SuperappUiDesignBridge.kt */
    /* loaded from: classes6.dex */
    public static final class a {
    }

    boolean a();

    void b(TextView textView, FontFamily fontFamily);
}
