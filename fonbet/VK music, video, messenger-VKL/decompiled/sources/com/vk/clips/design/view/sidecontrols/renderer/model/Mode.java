package com.vk.clips.design.view.sidecontrols.renderer.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Mode.kt */
/* loaded from: classes16.dex */
public final class Mode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Mode[] $VALUES;
    public static final Mode BUTTON;
    public static final Mode TOGGLE;

    static {
        Mode mode = new Mode("BUTTON", 0);
        BUTTON = mode;
        Mode mode2 = new Mode("TOGGLE", 1);
        TOGGLE = mode2;
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
