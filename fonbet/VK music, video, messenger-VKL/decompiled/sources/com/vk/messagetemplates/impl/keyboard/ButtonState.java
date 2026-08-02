package com.vk.messagetemplates.impl.keyboard;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TemplatesKeyboardViewState.kt */
/* loaded from: classes3.dex */
public final class ButtonState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ButtonState[] $VALUES;
    public static final ButtonState LOADING;
    public static final ButtonState NORMAL;

    static {
        ButtonState buttonState = new ButtonState("LOADING", 0);
        LOADING = buttonState;
        ButtonState buttonState2 = new ButtonState("NORMAL", 1);
        NORMAL = buttonState2;
        ButtonState[] buttonStateArr = {buttonState, buttonState2};
        $VALUES = buttonStateArr;
        $ENTRIES = new asp(buttonStateArr);
    }

    public ButtonState() {
        throw null;
    }

    public static ButtonState valueOf(String str) {
        return (ButtonState) Enum.valueOf(ButtonState.class, str);
    }

    public static ButtonState[] values() {
        return (ButtonState[]) $VALUES.clone();
    }
}
