package com.vk.dialogsfab.impl;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DialogsFabFeature.kt */
/* loaded from: classes18.dex */
public final class Mode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Mode[] $VALUES;
    public static final Mode EXTENDED;
    public static final Mode NEW_CHAT;

    static {
        Mode mode = new Mode("EXTENDED", 0);
        EXTENDED = mode;
        Mode mode2 = new Mode("NEW_CHAT", 1);
        NEW_CHAT = mode2;
        Mode[] modeArr = {mode, mode2};
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
