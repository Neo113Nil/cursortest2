package com.vk.newsfeed.common.recycler.holders.clips;

import java.util.LinkedHashMap;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* compiled from: ClipActionButtonStateRepository.kt */
/* loaded from: classes4.dex */
public final class ClipActionButtonStateRepository {
    public final LinkedHashMap a = new LinkedHashMap();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipActionButtonStateRepository.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ACTIVE;
        public static final State INACTIVE;

        static {
            State state = new State(SignalingProtocol.STATE_ACTIVE, 0);
            ACTIVE = state;
            State state2 = new State("INACTIVE", 1);
            INACTIVE = state2;
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
}
