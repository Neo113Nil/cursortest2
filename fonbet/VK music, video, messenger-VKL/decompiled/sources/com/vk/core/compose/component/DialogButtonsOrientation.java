package com.vk.core.compose.component;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkAlert.kt */
/* loaded from: classes17.dex */
public final class DialogButtonsOrientation {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DialogButtonsOrientation[] $VALUES;
    public static final DialogButtonsOrientation Horizontal;
    public static final DialogButtonsOrientation Vertical;

    static {
        DialogButtonsOrientation dialogButtonsOrientation = new DialogButtonsOrientation("Horizontal", 0);
        Horizontal = dialogButtonsOrientation;
        DialogButtonsOrientation dialogButtonsOrientation2 = new DialogButtonsOrientation("Vertical", 1);
        Vertical = dialogButtonsOrientation2;
        DialogButtonsOrientation[] dialogButtonsOrientationArr = {dialogButtonsOrientation, dialogButtonsOrientation2};
        $VALUES = dialogButtonsOrientationArr;
        $ENTRIES = new asp(dialogButtonsOrientationArr);
    }

    public DialogButtonsOrientation() {
        throw null;
    }

    public static DialogButtonsOrientation valueOf(String str) {
        return (DialogButtonsOrientation) Enum.valueOf(DialogButtonsOrientation.class, str);
    }

    public static DialogButtonsOrientation[] values() {
        return (DialogButtonsOrientation[]) $VALUES.clone();
    }
}
