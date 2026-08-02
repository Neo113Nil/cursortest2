package com.vk.im.engine.models.conversations;

import java.util.NoSuchElementException;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BotKeyboard.kt */
/* loaded from: classes2.dex */
public final class ButtonColor {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ButtonColor[] $VALUES;
    public static final a Companion;
    public static final ButtonColor DEFAULT;
    public static final ButtonColor NEGATIVE;
    public static final ButtonColor POSITIVE;
    public static final ButtonColor PRIMARY;
    public static final ButtonColor VKPAY;
    private final int id;

    /* compiled from: BotKeyboard.kt */
    public static final class a {
        public static ButtonColor a(int i) {
            for (ButtonColor buttonColor : ButtonColor.values()) {
                if (buttonColor.h() == i) {
                    return buttonColor;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    static {
        ButtonColor buttonColor = new ButtonColor("POSITIVE", 0, 0);
        POSITIVE = buttonColor;
        ButtonColor buttonColor2 = new ButtonColor("NEGATIVE", 1, 1);
        NEGATIVE = buttonColor2;
        ButtonColor buttonColor3 = new ButtonColor("PRIMARY", 2, 2);
        PRIMARY = buttonColor3;
        ButtonColor buttonColor4 = new ButtonColor("DEFAULT", 3, 3);
        DEFAULT = buttonColor4;
        ButtonColor buttonColor5 = new ButtonColor("VKPAY", 4, 4);
        VKPAY = buttonColor5;
        ButtonColor[] buttonColorArr = {buttonColor, buttonColor2, buttonColor3, buttonColor4, buttonColor5};
        $VALUES = buttonColorArr;
        $ENTRIES = new asp(buttonColorArr);
        Companion = new a();
    }

    public ButtonColor(String str, int i, int i2) {
        this.id = i2;
    }

    public static ButtonColor valueOf(String str) {
        return (ButtonColor) Enum.valueOf(ButtonColor.class, str);
    }

    public static ButtonColor[] values() {
        return (ButtonColor[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
