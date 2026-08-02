package com.vk.libvideo.live.impl.views.live;

import xsna.dvp;
import xsna.piz;

/* loaded from: classes3.dex */
public final class ProgressErrorStateMashine {
    public piz a;
    public State b;
    public State c;
    public State d;
    public State e;
    public State f;
    public State g;
    public dvp h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        private static final /* synthetic */ State[] $VALUES;
        public static final State HIDE;
        public static final State SHOW;

        static {
            State state = new State("HIDE", 0);
            HIDE = state;
            State state2 = new State("SHOW", 1);
            SHOW = state2;
            $VALUES = new State[]{state, state2};
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

    public final void a() {
        State state = this.d;
        State state2 = State.SHOW;
        if (state == state2 || this.e == state2) {
            this.f = State.HIDE;
            this.g = state2;
            return;
        }
        if (this.b == state2 || this.c == state2) {
            this.f = state2;
        } else {
            this.f = State.HIDE;
        }
        this.g = State.HIDE;
    }

    public final void b() {
        piz pizVar = this.a;
        if (pizVar != null) {
            State state = this.f;
            State state2 = State.SHOW;
            if (state == state2) {
                pizVar.I();
            } else {
                pizVar.r();
            }
            if (this.g == state2) {
                this.a.T(this.h);
            } else {
                this.a.Q1();
            }
        }
    }
}
