package com.vk.catalog2.common.ui.mvp.util;

import com.ironsource.X3;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogUniversalButtonsHandler.kt */
/* loaded from: classes16.dex */
public final class ButtonStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ButtonStyle[] $VALUES;
    public static final a Companion;
    public static final ButtonStyle NONE;
    public static final ButtonStyle PRIMARY;
    public static final ButtonStyle SECONDARY;
    public static final ButtonStyle TERTIARY;
    private final String value;

    /* compiled from: CatalogUniversalButtonsHandler.kt */
    public static final class a {
    }

    static {
        ButtonStyle buttonStyle = new ButtonStyle("NONE", 0, "none");
        NONE = buttonStyle;
        ButtonStyle buttonStyle2 = new ButtonStyle("PRIMARY", 1, "primary");
        PRIMARY = buttonStyle2;
        ButtonStyle buttonStyle3 = new ButtonStyle("SECONDARY", 2, X3.i.Y);
        SECONDARY = buttonStyle3;
        ButtonStyle buttonStyle4 = new ButtonStyle("TERTIARY", 3, "tertiary");
        TERTIARY = buttonStyle4;
        ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2, buttonStyle3, buttonStyle4};
        $VALUES = buttonStyleArr;
        $ENTRIES = new asp(buttonStyleArr);
        Companion = new a();
    }

    public ButtonStyle(String str, int i, String str2) {
        this.value = str2;
    }

    public static ButtonStyle valueOf(String str) {
        return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
    }

    public static ButtonStyle[] values() {
        return (ButtonStyle[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
