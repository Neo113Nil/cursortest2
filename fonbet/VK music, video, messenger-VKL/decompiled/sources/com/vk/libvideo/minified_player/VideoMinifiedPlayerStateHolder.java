package com.vk.libvideo.minified_player;

import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.pip.VideoPipStateHolder;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.subjects.d;
import xsna.asp;
import xsna.awi0;
import xsna.j630;
import xsna.rts0;
import xsna.ysg0;
import xsna.zrp;

/* compiled from: VideoMinifiedPlayerStateHolder.kt */
/* loaded from: classes3.dex */
public final class VideoMinifiedPlayerStateHolder {
    public static final VideoMinifiedPlayerStateHolder a = new VideoMinifiedPlayerStateHolder();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoMinifiedPlayerStateHolder.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ACTIVATED;
        public static final State DESTROYING;
        public static final State HIDDEN;
        public static final State OPENED;

        static {
            State state = new State("HIDDEN", 0);
            HIDDEN = state;
            State state2 = new State("ACTIVATED", 1);
            ACTIVATED = state2;
            State state3 = new State("OPENED", 2);
            OPENED = state3;
            State state4 = new State("DESTROYING", 3);
            DESTROYING = state4;
            State[] stateArr = {state, state2, state3, state4};
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

    /* compiled from: VideoMinifiedPlayerStateHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoPipStateHolder.State.values().length];
            try {
                iArr[VideoPipStateHolder.State.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoPipStateHolder.State.SCHEDULED_TO_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoPipStateHolder.State.OPENED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoPipStateHolder.State.DRAWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoPipStateHolder.State.DESTROYING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static boolean a() {
        VideoPipStateHolder.a.getClass();
        if (VideoPipStateHolder.d()) {
            return true;
        }
        rts0 rts0Var = rts0.b;
        return rts0.c != null;
    }

    public static boolean b() {
        d<VideoMinimizableState> a2 = rts0.b.a();
        if (a2.P0() == null || (a2.P0() instanceof VideoMinimizableState.Hidden)) {
            VideoPipStateHolder.a.getClass();
            if (!VideoPipStateHolder.h()) {
                return false;
            }
        }
        return true;
    }

    public final q<State> c() {
        VideoPipStateHolder.a.getClass();
        t U = VideoPipStateHolder.g() ? ysg0.b.a.b0(VideoPipStateHolder.State.class).U(new awi0(new b(1, this, VideoMinifiedPlayerStateHolder.class, "mapPipState", "mapPipState(Lcom/vk/libvideo/pip/VideoPipStateHolder$State;)Lcom/vk/libvideo/minified_player/VideoMinifiedPlayerStateHolder$State;", 0), 7)) : g0.b;
        j1 U2 = rts0.b.a().U(new j630(new com.vk.libvideo.minified_player.a(1, this, VideoMinifiedPlayerStateHolder.class, "mapMiniPlayerState", "mapMiniPlayerState(Lcom/vk/libvideo/api/minimizable/VideoMinimizableState;)Lcom/vk/libvideo/minified_player/VideoMinifiedPlayerStateHolder$State;", 0), 22));
        U.getClass();
        return q.X(U, U2);
    }
}
