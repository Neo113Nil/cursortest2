package com.vk.photo.editor.markup.view.tools.button;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ButtonMode.kt */
/* loaded from: classes4.dex */
public final class ButtonMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ButtonMode[] $VALUES;
    public static final ButtonMode Open;
    public static final ButtonMode Select;

    static {
        ButtonMode buttonMode = new ButtonMode("Select", 0);
        Select = buttonMode;
        ButtonMode buttonMode2 = new ButtonMode("Open", 1);
        Open = buttonMode2;
        ButtonMode[] buttonModeArr = {buttonMode, buttonMode2};
        $VALUES = buttonModeArr;
        $ENTRIES = new asp(buttonModeArr);
    }

    public ButtonMode() {
        throw null;
    }

    public static ButtonMode valueOf(String str) {
        return (ButtonMode) Enum.valueOf(ButtonMode.class, str);
    }

    public static ButtonMode[] values() {
        return (ButtonMode[]) $VALUES.clone();
    }
}
