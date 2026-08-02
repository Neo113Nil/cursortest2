package com.vk.core.compose.component.modal;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Modal.kt */
/* loaded from: classes17.dex */
public final class Mode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Mode[] $VALUES;
    public static final Mode Card;
    public static final Mode DynamicHeight;
    public static final Mode FullScreen;

    static {
        Mode mode = new Mode("FullScreen", 0);
        FullScreen = mode;
        Mode mode2 = new Mode("DynamicHeight", 1);
        DynamicHeight = mode2;
        Mode mode3 = new Mode("Card", 2);
        Card = mode3;
        Mode[] modeArr = {mode, mode2, mode3};
        $VALUES = modeArr;
        $ENTRIES = new asp(modeArr);
    }

    public Mode() {
        throw null;
    }

    public static Mode valueOf(String str) {
        return (Mode) Enum.valueOf(Mode.class, str);
    }

    public static Mode[] values() {
        return (Mode[]) $VALUES.clone();
    }
}
