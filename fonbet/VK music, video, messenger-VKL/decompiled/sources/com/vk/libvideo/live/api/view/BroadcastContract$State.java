package com.vk.libvideo.live.api.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class BroadcastContract$State {
    private static final /* synthetic */ BroadcastContract$State[] $VALUES;
    public static final BroadcastContract$State END_SCREEN;
    public static final BroadcastContract$State LIVE;
    public static final BroadcastContract$State LIVE_ERROR;
    public static final BroadcastContract$State MODEL_ERROR;
    public static final BroadcastContract$State NOT_INITED;
    public static final BroadcastContract$State PREPARE;
    public static final BroadcastContract$State UPCOMING;

    static {
        BroadcastContract$State broadcastContract$State = new BroadcastContract$State("NOT_INITED", 0);
        NOT_INITED = broadcastContract$State;
        BroadcastContract$State broadcastContract$State2 = new BroadcastContract$State("MODEL_ERROR", 1);
        MODEL_ERROR = broadcastContract$State2;
        BroadcastContract$State broadcastContract$State3 = new BroadcastContract$State("UPCOMING", 2);
        UPCOMING = broadcastContract$State3;
        BroadcastContract$State broadcastContract$State4 = new BroadcastContract$State("PREPARE", 3);
        PREPARE = broadcastContract$State4;
        BroadcastContract$State broadcastContract$State5 = new BroadcastContract$State("LIVE", 4);
        LIVE = broadcastContract$State5;
        BroadcastContract$State broadcastContract$State6 = new BroadcastContract$State("LIVE_ERROR", 5);
        LIVE_ERROR = broadcastContract$State6;
        BroadcastContract$State broadcastContract$State7 = new BroadcastContract$State("END_SCREEN", 6);
        END_SCREEN = broadcastContract$State7;
        $VALUES = new BroadcastContract$State[]{broadcastContract$State, broadcastContract$State2, broadcastContract$State3, broadcastContract$State4, broadcastContract$State5, broadcastContract$State6, broadcastContract$State7};
    }

    public BroadcastContract$State() {
        throw null;
    }

    public static BroadcastContract$State valueOf(String str) {
        return (BroadcastContract$State) Enum.valueOf(BroadcastContract$State.class, str);
    }

    public static BroadcastContract$State[] values() {
        return (BroadcastContract$State[]) $VALUES.clone();
    }
}
