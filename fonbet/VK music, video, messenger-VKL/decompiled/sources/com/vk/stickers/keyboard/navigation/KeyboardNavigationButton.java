package com.vk.stickers.keyboard.navigation;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KeyboardNavigationButton.kt */
/* loaded from: classes6.dex */
public final class KeyboardNavigationButton {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ KeyboardNavigationButton[] $VALUES;
    public static final KeyboardNavigationButton EMOJI;
    public static final KeyboardNavigationButton FAVORITES;
    public static final KeyboardNavigationButton RECENT;
    public static final KeyboardNavigationButton SETTINGS;
    public static final KeyboardNavigationButton UGC_CREATE;
    public static final KeyboardNavigationButton VMOJI_CREATE;
    private final int id;

    static {
        KeyboardNavigationButton keyboardNavigationButton = new KeyboardNavigationButton("FAVORITES", 0, -3);
        FAVORITES = keyboardNavigationButton;
        KeyboardNavigationButton keyboardNavigationButton2 = new KeyboardNavigationButton("RECENT", 1, -1);
        RECENT = keyboardNavigationButton2;
        KeyboardNavigationButton keyboardNavigationButton3 = new KeyboardNavigationButton("VMOJI_CREATE", 2, -4);
        VMOJI_CREATE = keyboardNavigationButton3;
        KeyboardNavigationButton keyboardNavigationButton4 = new KeyboardNavigationButton("EMOJI", 3, -5);
        EMOJI = keyboardNavigationButton4;
        KeyboardNavigationButton keyboardNavigationButton5 = new KeyboardNavigationButton("SETTINGS", 4, -2);
        SETTINGS = keyboardNavigationButton5;
        KeyboardNavigationButton keyboardNavigationButton6 = new KeyboardNavigationButton("UGC_CREATE", 5, -6);
        UGC_CREATE = keyboardNavigationButton6;
        KeyboardNavigationButton[] keyboardNavigationButtonArr = {keyboardNavigationButton, keyboardNavigationButton2, keyboardNavigationButton3, keyboardNavigationButton4, keyboardNavigationButton5, keyboardNavigationButton6};
        $VALUES = keyboardNavigationButtonArr;
        $ENTRIES = new asp(keyboardNavigationButtonArr);
    }

    public KeyboardNavigationButton(String str, int i, int i2) {
        this.id = i2;
    }

    public static KeyboardNavigationButton valueOf(String str) {
        return (KeyboardNavigationButton) Enum.valueOf(KeyboardNavigationButton.class, str);
    }

    public static KeyboardNavigationButton[] values() {
        return (KeyboardNavigationButton[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
