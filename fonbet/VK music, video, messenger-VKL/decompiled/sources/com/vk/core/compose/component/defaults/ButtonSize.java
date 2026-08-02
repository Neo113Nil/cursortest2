package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkButtonDefaults.kt */
/* loaded from: classes17.dex */
public final class ButtonSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ButtonSize[] $VALUES;
    public static final ButtonSize Large;
    public static final ButtonSize Medium;
    public static final ButtonSize Small;

    static {
        ButtonSize buttonSize = new ButtonSize("Small", 0);
        Small = buttonSize;
        ButtonSize buttonSize2 = new ButtonSize("Medium", 1);
        Medium = buttonSize2;
        ButtonSize buttonSize3 = new ButtonSize("Large", 2);
        Large = buttonSize3;
        ButtonSize[] buttonSizeArr = {buttonSize, buttonSize2, buttonSize3};
        $VALUES = buttonSizeArr;
        $ENTRIES = new asp(buttonSizeArr);
    }

    public ButtonSize() {
        throw null;
    }

    public static zrp<ButtonSize> h() {
        return $ENTRIES;
    }

    public static ButtonSize valueOf(String str) {
        return (ButtonSize) Enum.valueOf(ButtonSize.class, str);
    }

    public static ButtonSize[] values() {
        return (ButtonSize[]) $VALUES.clone();
    }
}
