package com.vk.music.player;

import xsna.asp;
import xsna.ozl;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PauseReason.kt */
@ozl
/* loaded from: classes3.dex */
public final class PauseReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PauseReason[] $VALUES;
    public static final PauseReason AUTO;
    public static final PauseReason BG_LIMIT;
    public static final PauseReason CAR_MODE;
    public static final a Companion;
    public static final PauseReason FOCUS_LOST;
    public static final PauseReason HEADSET_EJECT;
    public static final PauseReason QUEUE;
    public static final PauseReason SLEEP_TIMER;
    public static final PauseReason USER_CLICKED;

    /* compiled from: PauseReason.kt */
    public static final class a {
    }

    static {
        PauseReason pauseReason = new PauseReason("USER_CLICKED", 0);
        USER_CLICKED = pauseReason;
        PauseReason pauseReason2 = new PauseReason("QUEUE", 1);
        QUEUE = pauseReason2;
        PauseReason pauseReason3 = new PauseReason("HEADSET_EJECT", 2);
        HEADSET_EJECT = pauseReason3;
        PauseReason pauseReason4 = new PauseReason("AUTO", 3);
        AUTO = pauseReason4;
        PauseReason pauseReason5 = new PauseReason("SLEEP_TIMER", 4);
        SLEEP_TIMER = pauseReason5;
        PauseReason pauseReason6 = new PauseReason("CAR_MODE", 5);
        CAR_MODE = pauseReason6;
        PauseReason pauseReason7 = new PauseReason("BG_LIMIT", 6);
        BG_LIMIT = pauseReason7;
        PauseReason pauseReason8 = new PauseReason("FOCUS_LOST", 7);
        FOCUS_LOST = pauseReason8;
        PauseReason[] pauseReasonArr = {pauseReason, pauseReason2, pauseReason3, pauseReason4, pauseReason5, pauseReason6, pauseReason7, pauseReason8};
        $VALUES = pauseReasonArr;
        $ENTRIES = new asp(pauseReasonArr);
        Companion = new a();
    }

    public PauseReason() {
        throw null;
    }

    public static PauseReason valueOf(String str) {
        return (PauseReason) Enum.valueOf(PauseReason.class, str);
    }

    public static PauseReason[] values() {
        return (PauseReason[]) $VALUES.clone();
    }
}
