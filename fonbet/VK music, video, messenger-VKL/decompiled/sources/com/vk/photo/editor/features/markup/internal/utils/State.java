package com.vk.photo.editor.features.markup.internal.utils;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Animations.kt */
/* loaded from: classes4.dex */
public final class State {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ State[] $VALUES;
    public static final State Add;
    public static final State Remove;

    static {
        State state = new State("Add", 0);
        Add = state;
        State state2 = new State("Remove", 1);
        Remove = state2;
        State[] stateArr = {state, state2};
        $VALUES = stateArr;
        $ENTRIES = new asp(stateArr);
    }

    public State() {
        throw null;
    }

    public static State valueOf(String str) {
        return (State) Enum.valueOf(State.class, str);
    }

    public static State[] values() {
        return (State[]) $VALUES.clone();
    }
}
