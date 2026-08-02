package com.vk.profile.core.tabs.ui.fab;

import xsna.asp;
import xsna.cwd0;
import xsna.dwd0;
import xsna.epx;
import xsna.zrp;

/* compiled from: ProfileFabState.kt */
/* loaded from: classes5.dex */
public final class ProfileFabState {
    public final int a;
    public final State b;
    public final cwd0 c;
    public final dwd0 d;
    public final dwd0 e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileFabState.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State EMPTY;
        public static final State ERROR;
        public static final State INITIAL;
        public static final State LOADED;
        public static final State LOADING;
        public static final State RELOAD;

        static {
            State state = new State("INITIAL", 0);
            INITIAL = state;
            State state2 = new State("EMPTY", 1);
            EMPTY = state2;
            State state3 = new State("ERROR", 2);
            ERROR = state3;
            State state4 = new State("LOADING", 3);
            LOADING = state4;
            State state5 = new State("LOADED", 4);
            LOADED = state5;
            State state6 = new State("RELOAD", 5);
            RELOAD = state6;
            State[] stateArr = {state, state2, state3, state4, state5, state6};
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

    public ProfileFabState(int i, State state, cwd0 cwd0Var, dwd0 dwd0Var, dwd0 dwd0Var2) {
        this.a = i;
        this.b = state;
        this.c = cwd0Var;
        this.d = dwd0Var;
        this.e = dwd0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileFabState)) {
            return false;
        }
        ProfileFabState profileFabState = (ProfileFabState) obj;
        return this.a == profileFabState.a && this.b == profileFabState.b && epx.f(this.c, profileFabState.c) && epx.f(this.d, profileFabState.d) && epx.f(this.e, profileFabState.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        cwd0 cwd0Var = this.c;
        int hashCode2 = (hashCode + (cwd0Var == null ? 0 : cwd0Var.hashCode())) * 31;
        dwd0 dwd0Var = this.d;
        int hashCode3 = (hashCode2 + (dwd0Var == null ? 0 : Integer.hashCode(dwd0Var.a))) * 31;
        dwd0 dwd0Var2 = this.e;
        return hashCode3 + (dwd0Var2 != null ? Integer.hashCode(dwd0Var2.a) : 0);
    }

    public final String toString() {
        return "ProfileFabState(id=" + this.a + ", state=" + this.b + ", leftButton=" + this.c + ", rightButton=" + this.d + ", growthTrapButton=" + this.e + ')';
    }
}
