package com.vk.messagetemplates.impl.details;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* compiled from: TemplateDetailsViewState.kt */
/* loaded from: classes3.dex */
public final class BottomBarViewState {
    public final boolean a;
    public final State b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TemplateDetailsViewState.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ACTIVE;
        public static final State DISABLED;
        public static final State PROGRESS;

        static {
            State state = new State(SignalingProtocol.STATE_ACTIVE, 0);
            ACTIVE = state;
            State state2 = new State("DISABLED", 1);
            DISABLED = state2;
            State state3 = new State("PROGRESS", 2);
            PROGRESS = state3;
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

    public BottomBarViewState(boolean z, State state) {
        this.a = z;
        this.b = state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomBarViewState)) {
            return false;
        }
        BottomBarViewState bottomBarViewState = (BottomBarViewState) obj;
        return this.a == bottomBarViewState.a && this.b == bottomBarViewState.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BottomBarViewState(isEdit=" + this.a + ", state=" + this.b + ')';
    }
}
