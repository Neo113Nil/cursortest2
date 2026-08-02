package com.vk.clips.editor.voiceover.impl;

import android.content.Context;
import android.media.MediaRecorder;
import android.os.Build;
import java.util.Arrays;
import xsna.asp;
import xsna.bd3;
import xsna.lyd;
import xsna.od3;
import xsna.u40;
import xsna.x0e;
import xsna.zrp;

/* compiled from: ClipsEditorVoiceOverAudioRecorder.kt */
/* loaded from: classes16.dex */
public final class ClipsEditorVoiceOverAudioRecorder implements MediaRecorder.OnErrorListener, MediaRecorder.OnInfoListener {
    public final Context a;
    public MediaRecorder b;
    public od3 c;
    public u40 d;
    public State e;
    public Exception f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsEditorVoiceOverAudioRecorder.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ERROR;
        public static final State IDLE;
        public static final State INITIALIZED;
        public static final State PREPARED;
        public static final State PREPARING;
        public static final State RECORDED;
        public static final State RECORDING;

        static {
            State state = new State("IDLE", 0);
            IDLE = state;
            State state2 = new State("ERROR", 1);
            ERROR = state2;
            State state3 = new State("INITIALIZED", 2);
            INITIALIZED = state3;
            State state4 = new State("PREPARING", 3);
            PREPARING = state4;
            State state5 = new State("PREPARED", 4);
            PREPARED = state5;
            State state6 = new State("RECORDING", 5);
            RECORDING = state6;
            State state7 = new State("RECORDED", 6);
            RECORDED = state7;
            State[] stateArr = {state, state2, state3, state4, state5, state6, state7};
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

    public ClipsEditorVoiceOverAudioRecorder(Context context) {
        this.a = context;
        this.b = Build.VERSION.SDK_INT >= 31 ? x0e.a(context) : new MediaRecorder();
        this.e = State.IDLE;
    }

    public final void a(State state) {
        this.e = state;
        od3 od3Var = this.c;
        if (od3Var != null) {
            od3Var.invoke(state);
        }
    }

    public final void b(MediaRecorder mediaRecorder) {
        State state;
        if (this.e == State.RECORDING) {
            try {
                mediaRecorder.stop();
                state = State.RECORDED;
            } catch (Exception e) {
                this.f = e;
                lyd.a.a("ClipsEditorVoiceOverAudioRecorder", e);
                state = State.ERROR;
            }
            a(state);
        }
    }

    @Override // android.media.MediaRecorder.OnErrorListener
    public final void onError(MediaRecorder mediaRecorder, int i, int i2) {
        a(State.ERROR);
        StringBuilder sb = new StringBuilder("onError mr=");
        sb.append(mediaRecorder);
        sb.append(", what=");
        IllegalStateException illegalStateException = new IllegalStateException(bd3.b(", extra=", i, i2, sb));
        this.f = illegalStateException;
        lyd.a.g(illegalStateException, Arrays.copyOf(new Object[]{"ClipsEditorVoiceOverAudioRecorder"}, 1));
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        lyd.a.e(Arrays.copyOf(new Object[]{"ClipsEditorVoiceOverAudioRecorder", "onInfo mr=" + mediaRecorder + ", what=" + i + ", extra=" + i2}, 2));
        if (i == 800) {
            if (mediaRecorder != null) {
                b(mediaRecorder);
            }
            u40 u40Var = this.d;
            if (u40Var != null) {
                u40Var.invoke();
            }
        }
    }
}
