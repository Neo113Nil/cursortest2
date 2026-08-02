package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkButtonDefaults.kt */
/* loaded from: classes17.dex */
public final class ButtonAppearance {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ButtonAppearance[] $VALUES;
    public static final ButtonAppearance Accent;
    public static final ButtonAppearance Negative;
    public static final ButtonAppearance Neutral;
    public static final ButtonAppearance Overlay;
    public static final ButtonAppearance Positive;

    static {
        ButtonAppearance buttonAppearance = new ButtonAppearance("Accent", 0);
        Accent = buttonAppearance;
        ButtonAppearance buttonAppearance2 = new ButtonAppearance("Positive", 1);
        Positive = buttonAppearance2;
        ButtonAppearance buttonAppearance3 = new ButtonAppearance("Negative", 2);
        Negative = buttonAppearance3;
        ButtonAppearance buttonAppearance4 = new ButtonAppearance("Neutral", 3);
        Neutral = buttonAppearance4;
        ButtonAppearance buttonAppearance5 = new ButtonAppearance("Overlay", 4);
        Overlay = buttonAppearance5;
        ButtonAppearance[] buttonAppearanceArr = {buttonAppearance, buttonAppearance2, buttonAppearance3, buttonAppearance4, buttonAppearance5};
        $VALUES = buttonAppearanceArr;
        $ENTRIES = new asp(buttonAppearanceArr);
    }

    public ButtonAppearance() {
        throw null;
    }

    public static zrp<ButtonAppearance> h() {
        return $ENTRIES;
    }

    public static ButtonAppearance valueOf(String str) {
        return (ButtonAppearance) Enum.valueOf(ButtonAppearance.class, str);
    }

    public static ButtonAppearance[] values() {
        return (ButtonAppearance[]) $VALUES.clone();
    }
}
