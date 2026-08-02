package com.vk.core.ui.themes;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ThemeKeyAttributes.kt */
/* loaded from: classes.dex */
public final class ThemeKeyAttributes {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ThemeKeyAttributes[] $VALUES;
    public static final ThemeKeyAttributes BACKGROUND;
    public static final ThemeKeyAttributes BACKGROUND_DRAWABLE;
    public static final ThemeKeyAttributes BACKGROUND_RES;
    public static final ThemeKeyAttributes BACKGROUND_TINT;
    public static final ThemeKeyAttributes CONTENT_SCRIM;
    public static final a Companion;
    public static final ThemeKeyAttributes DRAWABLE_TINT;
    public static final ThemeKeyAttributes HINT_TEXT_COLOR;
    public static final ThemeKeyAttributes IMAGE_COLOR_FILTER;
    public static final ThemeKeyAttributes IMAGE_COLOR_FILTER_MODE;
    public static final ThemeKeyAttributes IMAGE_DRAWABLE;
    public static final ThemeKeyAttributes IMAGE_TINT;
    public static final ThemeKeyAttributes TEXT_COLOR;
    public static final ThemeKeyAttributes TEXT_COLOR_STATE_LIST;
    public static final ThemeKeyAttributes TITLE_COLOR;
    private final int key;

    /* compiled from: ThemeKeyAttributes.kt */
    public static final class a {
    }

    static {
        ThemeKeyAttributes themeKeyAttributes = new ThemeKeyAttributes("TEXT_COLOR", 0, 0);
        TEXT_COLOR = themeKeyAttributes;
        ThemeKeyAttributes themeKeyAttributes2 = new ThemeKeyAttributes("BACKGROUND", 1, 1);
        BACKGROUND = themeKeyAttributes2;
        ThemeKeyAttributes themeKeyAttributes3 = new ThemeKeyAttributes("IMAGE_DRAWABLE", 2, 2);
        IMAGE_DRAWABLE = themeKeyAttributes3;
        ThemeKeyAttributes themeKeyAttributes4 = new ThemeKeyAttributes("BACKGROUND_RES", 3, 3);
        BACKGROUND_RES = themeKeyAttributes4;
        ThemeKeyAttributes themeKeyAttributes5 = new ThemeKeyAttributes("BACKGROUND_DRAWABLE", 4, 4);
        BACKGROUND_DRAWABLE = themeKeyAttributes5;
        ThemeKeyAttributes themeKeyAttributes6 = new ThemeKeyAttributes("IMAGE_COLOR_FILTER", 5, 5);
        IMAGE_COLOR_FILTER = themeKeyAttributes6;
        ThemeKeyAttributes themeKeyAttributes7 = new ThemeKeyAttributes("IMAGE_COLOR_FILTER_MODE", 6, 6);
        IMAGE_COLOR_FILTER_MODE = themeKeyAttributes7;
        ThemeKeyAttributes themeKeyAttributes8 = new ThemeKeyAttributes("IMAGE_TINT", 7, 7);
        IMAGE_TINT = themeKeyAttributes8;
        ThemeKeyAttributes themeKeyAttributes9 = new ThemeKeyAttributes("CONTENT_SCRIM", 8, 8);
        CONTENT_SCRIM = themeKeyAttributes9;
        ThemeKeyAttributes themeKeyAttributes10 = new ThemeKeyAttributes("TITLE_COLOR", 9, 9);
        TITLE_COLOR = themeKeyAttributes10;
        ThemeKeyAttributes themeKeyAttributes11 = new ThemeKeyAttributes("BACKGROUND_TINT", 10, 10);
        BACKGROUND_TINT = themeKeyAttributes11;
        ThemeKeyAttributes themeKeyAttributes12 = new ThemeKeyAttributes("TEXT_COLOR_STATE_LIST", 11, 11);
        TEXT_COLOR_STATE_LIST = themeKeyAttributes12;
        ThemeKeyAttributes themeKeyAttributes13 = new ThemeKeyAttributes("DRAWABLE_TINT", 12, 12);
        DRAWABLE_TINT = themeKeyAttributes13;
        ThemeKeyAttributes themeKeyAttributes14 = new ThemeKeyAttributes("HINT_TEXT_COLOR", 13, 13);
        HINT_TEXT_COLOR = themeKeyAttributes14;
        ThemeKeyAttributes[] themeKeyAttributesArr = {themeKeyAttributes, themeKeyAttributes2, themeKeyAttributes3, themeKeyAttributes4, themeKeyAttributes5, themeKeyAttributes6, themeKeyAttributes7, themeKeyAttributes8, themeKeyAttributes9, themeKeyAttributes10, themeKeyAttributes11, themeKeyAttributes12, themeKeyAttributes13, themeKeyAttributes14};
        $VALUES = themeKeyAttributesArr;
        $ENTRIES = new asp(themeKeyAttributesArr);
        Companion = new a();
    }

    public ThemeKeyAttributes(String str, int i, int i2) {
        this.key = i2;
    }

    public static ThemeKeyAttributes valueOf(String str) {
        return (ThemeKeyAttributes) Enum.valueOf(ThemeKeyAttributes.class, str);
    }

    public static ThemeKeyAttributes[] values() {
        return (ThemeKeyAttributes[]) $VALUES.clone();
    }

    public final int h() {
        return this.key;
    }
}
