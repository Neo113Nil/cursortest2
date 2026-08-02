package com.vk.clips.viewer.impl.feed.wrapper.ui.transition;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsWrapperTransitionState.kt */
/* loaded from: classes17.dex */
public final class ClipsWrapperTransitionState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsWrapperTransitionState[] $VALUES;
    public static final ClipsWrapperTransitionState HIDE_FINISHED;
    public static final ClipsWrapperTransitionState HIDE_RUNNING;
    public static final ClipsWrapperTransitionState NOT_STARTED;
    public static final ClipsWrapperTransitionState SHOW_FINISHED;
    public static final ClipsWrapperTransitionState SHOW_RUNNING;

    static {
        ClipsWrapperTransitionState clipsWrapperTransitionState = new ClipsWrapperTransitionState("NOT_STARTED", 0);
        NOT_STARTED = clipsWrapperTransitionState;
        ClipsWrapperTransitionState clipsWrapperTransitionState2 = new ClipsWrapperTransitionState("SHOW_RUNNING", 1);
        SHOW_RUNNING = clipsWrapperTransitionState2;
        ClipsWrapperTransitionState clipsWrapperTransitionState3 = new ClipsWrapperTransitionState("SHOW_FINISHED", 2);
        SHOW_FINISHED = clipsWrapperTransitionState3;
        ClipsWrapperTransitionState clipsWrapperTransitionState4 = new ClipsWrapperTransitionState("HIDE_RUNNING", 3);
        HIDE_RUNNING = clipsWrapperTransitionState4;
        ClipsWrapperTransitionState clipsWrapperTransitionState5 = new ClipsWrapperTransitionState("HIDE_FINISHED", 4);
        HIDE_FINISHED = clipsWrapperTransitionState5;
        ClipsWrapperTransitionState[] clipsWrapperTransitionStateArr = {clipsWrapperTransitionState, clipsWrapperTransitionState2, clipsWrapperTransitionState3, clipsWrapperTransitionState4, clipsWrapperTransitionState5};
        $VALUES = clipsWrapperTransitionStateArr;
        $ENTRIES = new asp(clipsWrapperTransitionStateArr);
    }

    public ClipsWrapperTransitionState() {
        throw null;
    }

    public static ClipsWrapperTransitionState valueOf(String str) {
        return (ClipsWrapperTransitionState) Enum.valueOf(ClipsWrapperTransitionState.class, str);
    }

    public static ClipsWrapperTransitionState[] values() {
        return (ClipsWrapperTransitionState[]) $VALUES.clone();
    }
}
