package com.vk.im.engine;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LifecycleState.kt */
/* loaded from: classes.dex */
public final class LifecycleState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LifecycleState[] $VALUES;
    public static final LifecycleState IDLE;
    public static final LifecycleState PREPARING_SERVICES;
    public static final LifecycleState READY;
    public static final LifecycleState SHUTTING_DOWN;

    static {
        LifecycleState lifecycleState = new LifecycleState("IDLE", 0);
        IDLE = lifecycleState;
        LifecycleState lifecycleState2 = new LifecycleState("PREPARING_SERVICES", 1);
        PREPARING_SERVICES = lifecycleState2;
        LifecycleState lifecycleState3 = new LifecycleState("READY", 2);
        READY = lifecycleState3;
        LifecycleState lifecycleState4 = new LifecycleState("SHUTTING_DOWN", 3);
        SHUTTING_DOWN = lifecycleState4;
        LifecycleState[] lifecycleStateArr = {lifecycleState, lifecycleState2, lifecycleState3, lifecycleState4};
        $VALUES = lifecycleStateArr;
        $ENTRIES = new asp(lifecycleStateArr);
    }

    public LifecycleState() {
        throw null;
    }

    public static LifecycleState valueOf(String str) {
        return (LifecycleState) Enum.valueOf(LifecycleState.class, str);
    }

    public static LifecycleState[] values() {
        return (LifecycleState[]) $VALUES.clone();
    }
}
