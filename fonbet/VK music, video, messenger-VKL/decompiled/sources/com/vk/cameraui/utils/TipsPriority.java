package com.vk.cameraui.utils;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TipsPriority.kt */
/* loaded from: classes16.dex */
public final class TipsPriority {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TipsPriority[] $VALUES;
    public static final TipsPriority DUET_RECORDING;
    public static final TipsPriority DURATION_CHANGED;

    static {
        TipsPriority tipsPriority = new TipsPriority("DUET_RECORDING", 0);
        DUET_RECORDING = tipsPriority;
        TipsPriority tipsPriority2 = new TipsPriority("DURATION_CHANGED", 1);
        DURATION_CHANGED = tipsPriority2;
        TipsPriority[] tipsPriorityArr = {tipsPriority, tipsPriority2};
        $VALUES = tipsPriorityArr;
        $ENTRIES = new asp(tipsPriorityArr);
    }

    public TipsPriority() {
        throw null;
    }

    public static TipsPriority valueOf(String str) {
        return (TipsPriority) Enum.valueOf(TipsPriority.class, str);
    }

    public static TipsPriority[] values() {
        return (TipsPriority[]) $VALUES.clone();
    }
}
