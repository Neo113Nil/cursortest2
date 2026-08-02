package com.vk.im.engine.models.conversations;

import java.util.NoSuchElementException;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BotKeyboard.kt */
/* loaded from: classes2.dex */
public final class ButtonType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ButtonType[] $VALUES;
    public static final ButtonType CALLBACK;
    public static final ButtonType CAMERA;
    public static final ButtonType CONTACT;
    public static final a Companion;
    public static final ButtonType GALLERY;
    public static final ButtonType LINK;
    public static final ButtonType LOCATION;
    public static final ButtonType MODAL_VIEW;
    public static final ButtonType RESET;
    public static final ButtonType START;
    public static final ButtonType TEXT;
    public static final ButtonType UNSUPPORTED;
    public static final ButtonType VKAPP;
    public static final ButtonType VKPAY;
    public static final ButtonType WEBVIEW;
    private final int id;

    /* compiled from: BotKeyboard.kt */
    public static final class a {
        public static ButtonType a(int i) {
            for (ButtonType buttonType : ButtonType.values()) {
                if (buttonType.h() == i) {
                    return buttonType;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    static {
        ButtonType buttonType = new ButtonType("TEXT", 0, 0);
        TEXT = buttonType;
        ButtonType buttonType2 = new ButtonType("LOCATION", 1, 1);
        LOCATION = buttonType2;
        ButtonType buttonType3 = new ButtonType("CAMERA", 2, 2);
        CAMERA = buttonType3;
        ButtonType buttonType4 = new ButtonType("CONTACT", 3, 3);
        CONTACT = buttonType4;
        ButtonType buttonType5 = new ButtonType("GALLERY", 4, 4);
        GALLERY = buttonType5;
        ButtonType buttonType6 = new ButtonType("START", 5, 5);
        START = buttonType6;
        ButtonType buttonType7 = new ButtonType("RESET", 6, 6);
        RESET = buttonType7;
        ButtonType buttonType8 = new ButtonType("WEBVIEW", 7, 7);
        WEBVIEW = buttonType8;
        ButtonType buttonType9 = new ButtonType("VKPAY", 8, 8);
        VKPAY = buttonType9;
        ButtonType buttonType10 = new ButtonType("VKAPP", 9, 9);
        VKAPP = buttonType10;
        ButtonType buttonType11 = new ButtonType("LINK", 10, 10);
        LINK = buttonType11;
        ButtonType buttonType12 = new ButtonType("CALLBACK", 11, 11);
        CALLBACK = buttonType12;
        ButtonType buttonType13 = new ButtonType("MODAL_VIEW", 12, 12);
        MODAL_VIEW = buttonType13;
        ButtonType buttonType14 = new ButtonType("UNSUPPORTED", 13, -1);
        UNSUPPORTED = buttonType14;
        ButtonType[] buttonTypeArr = {buttonType, buttonType2, buttonType3, buttonType4, buttonType5, buttonType6, buttonType7, buttonType8, buttonType9, buttonType10, buttonType11, buttonType12, buttonType13, buttonType14};
        $VALUES = buttonTypeArr;
        $ENTRIES = new asp(buttonTypeArr);
        Companion = new a();
    }

    public ButtonType(String str, int i, int i2) {
        this.id = i2;
    }

    public static ButtonType valueOf(String str) {
        return (ButtonType) Enum.valueOf(ButtonType.class, str);
    }

    public static ButtonType[] values() {
        return (ButtonType[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
