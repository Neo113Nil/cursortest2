package com.vk.core.view.components.placeholder;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Placeholder.kt */
/* loaded from: classes17.dex */
public final class ButtonArrangement {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ButtonArrangement[] $VALUES;
    public static final ButtonArrangement HorizontalFilled;
    public static final ButtonArrangement HorizontalHugged;
    public static final ButtonArrangement VerticalFilled;

    static {
        ButtonArrangement buttonArrangement = new ButtonArrangement("VerticalFilled", 0);
        VerticalFilled = buttonArrangement;
        ButtonArrangement buttonArrangement2 = new ButtonArrangement("HorizontalHugged", 1);
        HorizontalHugged = buttonArrangement2;
        ButtonArrangement buttonArrangement3 = new ButtonArrangement("HorizontalFilled", 2);
        HorizontalFilled = buttonArrangement3;
        ButtonArrangement[] buttonArrangementArr = {buttonArrangement, buttonArrangement2, buttonArrangement3};
        $VALUES = buttonArrangementArr;
        $ENTRIES = new asp(buttonArrangementArr);
    }

    public ButtonArrangement() {
        throw null;
    }

    public static ButtonArrangement valueOf(String str) {
        return (ButtonArrangement) Enum.valueOf(ButtonArrangement.class, str);
    }

    public static ButtonArrangement[] values() {
        return (ButtonArrangement[]) $VALUES.clone();
    }
}
