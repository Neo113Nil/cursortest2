package com.vk.libvideo.autoplay;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutoPlayMinifiedState.kt */
/* loaded from: classes2.dex */
public final class AutoPlayMinifiedState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AutoPlayMinifiedState[] $VALUES;
    public static final a Companion;
    public static final AutoPlayMinifiedState MINIPLAYER;
    public static final AutoPlayMinifiedState NONE;
    public static final AutoPlayMinifiedState PIP;

    /* compiled from: AutoPlayMinifiedState.kt */
    public static final class a {
    }

    static {
        AutoPlayMinifiedState autoPlayMinifiedState = new AutoPlayMinifiedState("NONE", 0);
        NONE = autoPlayMinifiedState;
        AutoPlayMinifiedState autoPlayMinifiedState2 = new AutoPlayMinifiedState("PIP", 1);
        PIP = autoPlayMinifiedState2;
        AutoPlayMinifiedState autoPlayMinifiedState3 = new AutoPlayMinifiedState("MINIPLAYER", 2);
        MINIPLAYER = autoPlayMinifiedState3;
        AutoPlayMinifiedState[] autoPlayMinifiedStateArr = {autoPlayMinifiedState, autoPlayMinifiedState2, autoPlayMinifiedState3};
        $VALUES = autoPlayMinifiedStateArr;
        $ENTRIES = new asp(autoPlayMinifiedStateArr);
        Companion = new a();
    }

    public AutoPlayMinifiedState() {
        throw null;
    }

    public static AutoPlayMinifiedState valueOf(String str) {
        return (AutoPlayMinifiedState) Enum.valueOf(AutoPlayMinifiedState.class, str);
    }

    public static AutoPlayMinifiedState[] values() {
        return (AutoPlayMinifiedState[]) $VALUES.clone();
    }

    public final boolean h() {
        return this == PIP || this == MINIPLAYER;
    }
}
