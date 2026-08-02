package com.vk.core.compose.component.input;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InputSelect.kt */
/* loaded from: classes17.dex */
public final class InputSelect$State {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ InputSelect$State[] $VALUES;
    public static final InputSelect$State Active;
    public static final a Companion;
    public static final InputSelect$State Default;
    public static final InputSelect$State Error;
    public static final InputSelect$State Hover;
    public static final InputSelect$State NoBorder;
    public static final InputSelect$State Valid;

    /* compiled from: InputSelect.kt */
    public static final class a {
    }

    static {
        InputSelect$State inputSelect$State = new InputSelect$State("Default", 0);
        Default = inputSelect$State;
        InputSelect$State inputSelect$State2 = new InputSelect$State("Active", 1);
        Active = inputSelect$State2;
        InputSelect$State inputSelect$State3 = new InputSelect$State("Hover", 2);
        Hover = inputSelect$State3;
        InputSelect$State inputSelect$State4 = new InputSelect$State("Error", 3);
        Error = inputSelect$State4;
        InputSelect$State inputSelect$State5 = new InputSelect$State("Valid", 4);
        Valid = inputSelect$State5;
        InputSelect$State inputSelect$State6 = new InputSelect$State("NoBorder", 5);
        NoBorder = inputSelect$State6;
        InputSelect$State[] inputSelect$StateArr = {inputSelect$State, inputSelect$State2, inputSelect$State3, inputSelect$State4, inputSelect$State5, inputSelect$State6};
        $VALUES = inputSelect$StateArr;
        $ENTRIES = new asp(inputSelect$StateArr);
        Companion = new a();
    }

    public InputSelect$State() {
        throw null;
    }

    public static InputSelect$State valueOf(String str) {
        return (InputSelect$State) Enum.valueOf(InputSelect$State.class, str);
    }

    public static InputSelect$State[] values() {
        return (InputSelect$State[]) $VALUES.clone();
    }
}
