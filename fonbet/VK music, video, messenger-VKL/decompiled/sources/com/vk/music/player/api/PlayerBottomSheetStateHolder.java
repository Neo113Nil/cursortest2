package com.vk.music.player.api;

import xsna.asp;
import xsna.zrp;

/* compiled from: PlayerBottomSheetStateHolder.kt */
/* loaded from: classes.dex */
public interface PlayerBottomSheetStateHolder {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PlayerBottomSheetStateHolder.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State STATE_COLLAPSED;
        public static final State STATE_DRAGGING;
        public static final State STATE_EXPANDED;
        public static final State STATE_HIDDEN;
        public static final State STATE_SETTLING;

        static {
            State state = new State("STATE_DRAGGING", 0);
            STATE_DRAGGING = state;
            State state2 = new State("STATE_SETTLING", 1);
            STATE_SETTLING = state2;
            State state3 = new State("STATE_EXPANDED", 2);
            STATE_EXPANDED = state3;
            State state4 = new State("STATE_COLLAPSED", 3);
            STATE_COLLAPSED = state4;
            State state5 = new State("STATE_HIDDEN", 4);
            STATE_HIDDEN = state5;
            State[] stateArr = {state, state2, state3, state4, state5};
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

    State getState();

    void setState(int i);

    /* compiled from: PlayerBottomSheetStateHolder.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final PlayerBottomSheetStateHolder STUB = new C1332a();

        public final PlayerBottomSheetStateHolder getSTUB() {
            return STUB;
        }

        /* compiled from: PlayerBottomSheetStateHolder.kt */
        /* renamed from: com.vk.music.player.api.PlayerBottomSheetStateHolder$a$a, reason: collision with other inner class name */
        public static final class C1332a implements PlayerBottomSheetStateHolder {
            @Override // com.vk.music.player.api.PlayerBottomSheetStateHolder
            public final State getState() {
                return State.STATE_HIDDEN;
            }

            @Override // com.vk.music.player.api.PlayerBottomSheetStateHolder
            public final void setState(int i) {
            }
        }
    }
}
