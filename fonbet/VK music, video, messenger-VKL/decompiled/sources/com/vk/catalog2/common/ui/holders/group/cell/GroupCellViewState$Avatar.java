package com.vk.catalog2.common.ui.holders.group.cell;

import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* compiled from: GroupCellConfiguration.kt */
/* loaded from: classes16.dex */
public final class GroupCellViewState$Avatar {
    public final String a;
    public final State b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupCellConfiguration.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State Live;
        public static final State NewStory;
        public static final State Normal;

        static {
            State state = new State("Normal", 0);
            Normal = state;
            State state2 = new State("NewStory", 1);
            NewStory = state2;
            State state3 = new State("Live", 2);
            Live = state3;
            State[] stateArr = {state, state2, state3};
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

    public GroupCellViewState$Avatar(String str, State state) {
        this.a = str;
        this.b = state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupCellViewState$Avatar)) {
            return false;
        }
        GroupCellViewState$Avatar groupCellViewState$Avatar = (GroupCellViewState$Avatar) obj;
        return epx.f(this.a, groupCellViewState$Avatar.a) && this.b == groupCellViewState$Avatar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Avatar(baseUrl=" + this.a + ", state=" + this.b + ')';
    }
}
