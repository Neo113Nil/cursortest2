package com.vk.music.player.api.helper;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.ks4;
import xsna.mr10;
import xsna.rs4;
import xsna.zrp;

/* compiled from: AudioPlayer.kt */
/* loaded from: classes3.dex */
public interface AudioPlayer {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioPlayer.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State BUFFERING;
        public static final State ENDED;
        public static final State IDLE;
        public static final State PAUSED;
        public static final State PLAYING;

        static {
            State state = new State("IDLE", 0);
            IDLE = state;
            State state2 = new State("PLAYING", 1);
            PLAYING = state2;
            State state3 = new State("PAUSED", 2);
            PAUSED = state3;
            State state4 = new State("BUFFERING", 3);
            BUFFERING = state4;
            State state5 = new State(SignalingProtocol.STATE_ENDED, 4);
            ENDED = state5;
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

    long a();

    boolean d();

    boolean e();

    void f(rs4 rs4Var);

    void g(ks4 ks4Var);

    int getAudioSessionId();

    int getBufferedPercentage();

    long getCurrentPosition();

    long getDuration();

    boolean getPlayWhenReady();

    float getVolume();

    mr10 h();

    void i(rs4 rs4Var);

    boolean isEnded();

    boolean isReady();

    boolean isReleased();

    void j(ks4 ks4Var);

    void release();

    void seekTo(long j);

    void setPlayWhenReady(boolean z);

    void setPlaybackSpeed(float f);

    void setVolume(float f);

    void stop();
}
