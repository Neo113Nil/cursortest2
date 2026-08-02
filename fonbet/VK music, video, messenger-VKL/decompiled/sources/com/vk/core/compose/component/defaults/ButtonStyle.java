package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkButtonDefaults.kt */
/* loaded from: classes17.dex */
public final class ButtonStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ButtonStyle[] $VALUES;
    public static final ButtonStyle Link;
    public static final ButtonStyle Outline;
    public static final ButtonStyle Primary;
    public static final ButtonStyle Secondary;
    public static final ButtonStyle Tertiary;

    static {
        ButtonStyle buttonStyle = new ButtonStyle("Primary", 0);
        Primary = buttonStyle;
        ButtonStyle buttonStyle2 = new ButtonStyle("Secondary", 1);
        Secondary = buttonStyle2;
        ButtonStyle buttonStyle3 = new ButtonStyle("Tertiary", 2);
        Tertiary = buttonStyle3;
        ButtonStyle buttonStyle4 = new ButtonStyle("Outline", 3);
        Outline = buttonStyle4;
        ButtonStyle buttonStyle5 = new ButtonStyle("Link", 4);
        Link = buttonStyle5;
        ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2, buttonStyle3, buttonStyle4, buttonStyle5};
        $VALUES = buttonStyleArr;
        $ENTRIES = new asp(buttonStyleArr);
    }

    public ButtonStyle() {
        throw null;
    }

    public static zrp<ButtonStyle> h() {
        return $ENTRIES;
    }

    public static ButtonStyle valueOf(String str) {
        return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
    }

    public static ButtonStyle[] values() {
        return (ButtonStyle[]) $VALUES.clone();
    }
}
