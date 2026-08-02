package com.vk.clips.interests.impl.ui.button;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ButtonStyle.kt */
/* loaded from: classes16.dex */
public final class ButtonStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ButtonStyle[] $VALUES;
    public static final ButtonStyle NEXT_ONLY;
    public static final ButtonStyle NEXT_WITH_SKIP;
    private final int id;

    static {
        ButtonStyle buttonStyle = new ButtonStyle("NEXT_ONLY", 0, 0);
        NEXT_ONLY = buttonStyle;
        ButtonStyle buttonStyle2 = new ButtonStyle("NEXT_WITH_SKIP", 1, 1);
        NEXT_WITH_SKIP = buttonStyle2;
        ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2};
        $VALUES = buttonStyleArr;
        $ENTRIES = new asp(buttonStyleArr);
    }

    public ButtonStyle(String str, int i, int i2) {
        this.id = i2;
    }

    public static ButtonStyle valueOf(String str) {
        return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
    }

    public static ButtonStyle[] values() {
        return (ButtonStyle[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
