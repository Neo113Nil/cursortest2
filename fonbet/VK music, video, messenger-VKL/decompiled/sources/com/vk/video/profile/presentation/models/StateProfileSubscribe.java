package com.vk.video.profile.presentation.models;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StateProfileSubscribe.kt */
/* loaded from: classes6.dex */
public final class StateProfileSubscribe {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StateProfileSubscribe[] $VALUES;
    public static final StateProfileSubscribe SUBSCRIBE;
    public static final StateProfileSubscribe UNSUBSCRIBE;

    static {
        StateProfileSubscribe stateProfileSubscribe = new StateProfileSubscribe("SUBSCRIBE", 0);
        SUBSCRIBE = stateProfileSubscribe;
        StateProfileSubscribe stateProfileSubscribe2 = new StateProfileSubscribe("UNSUBSCRIBE", 1);
        UNSUBSCRIBE = stateProfileSubscribe2;
        StateProfileSubscribe[] stateProfileSubscribeArr = {stateProfileSubscribe, stateProfileSubscribe2};
        $VALUES = stateProfileSubscribeArr;
        $ENTRIES = new asp(stateProfileSubscribeArr);
    }

    public StateProfileSubscribe() {
        throw null;
    }

    public static StateProfileSubscribe valueOf(String str) {
        return (StateProfileSubscribe) Enum.valueOf(StateProfileSubscribe.class, str);
    }

    public static StateProfileSubscribe[] values() {
        return (StateProfileSubscribe[]) $VALUES.clone();
    }
}
