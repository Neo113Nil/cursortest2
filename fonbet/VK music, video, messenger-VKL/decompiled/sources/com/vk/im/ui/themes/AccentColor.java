package com.vk.im.ui.themes;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccentColor.kt */
/* loaded from: classes2.dex */
public final class AccentColor {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccentColor[] $VALUES;
    public static final AccentColor BLUE;
    public static final AccentColor GREEN;
    public static final AccentColor NOT_SET;
    public static final AccentColor ORANGE;
    public static final AccentColor RED;
    public static final AccentColor TURQUOISE;
    public static final AccentColor VIOLET;
    private final int attrId;
    private final int nameId;

    static {
        AccentColor accentColor = new AccentColor("NOT_SET", 0, 0, R.string.color_picker_choice_no_color);
        NOT_SET = accentColor;
        AccentColor accentColor2 = new AccentColor("RED", 1, R.attr.im_theme_red, R.string.color_picker_color_name_red);
        RED = accentColor2;
        AccentColor accentColor3 = new AccentColor("ORANGE", 2, R.attr.im_theme_orange, R.string.color_picker_color_name_orange);
        ORANGE = accentColor3;
        AccentColor accentColor4 = new AccentColor("GREEN", 3, R.attr.im_theme_green, R.string.color_picker_color_name_green);
        GREEN = accentColor4;
        AccentColor accentColor5 = new AccentColor("TURQUOISE", 4, R.attr.im_theme_turquoise, R.string.color_picker_color_name_turquoise);
        TURQUOISE = accentColor5;
        AccentColor accentColor6 = new AccentColor("VIOLET", 5, R.attr.im_theme_violet, R.string.color_picker_color_name_purple);
        VIOLET = accentColor6;
        AccentColor accentColor7 = new AccentColor("BLUE", 6, R.attr.im_theme_blue, R.string.color_picker_color_name_blue);
        BLUE = accentColor7;
        AccentColor[] accentColorArr = {accentColor, accentColor2, accentColor3, accentColor4, accentColor5, accentColor6, accentColor7};
        $VALUES = accentColorArr;
        $ENTRIES = new asp(accentColorArr);
    }

    public AccentColor(String str, int i, int i2, int i3) {
        this.attrId = i2;
        this.nameId = i3;
    }

    public static AccentColor valueOf(String str) {
        return (AccentColor) Enum.valueOf(AccentColor.class, str);
    }

    public static AccentColor[] values() {
        return (AccentColor[]) $VALUES.clone();
    }

    public final int h() {
        return this.attrId;
    }

    public final int i() {
        return this.nameId;
    }
}
