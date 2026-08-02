package com.vk.clips.editor.base.api;

import android.os.Bundle;
import xsna.asp;
import xsna.zrp;

/* compiled from: ClipsEditorScreen.kt */
/* loaded from: classes16.dex */
public interface ClipsEditorScreen {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsEditorScreen.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ASPECT_RATIO;
        public static final State AUDIO_EFFECTS;
        public static final State CORRECTION;
        public static final State SPEED;
        public static final State STICKERS_SELECTOR;
        public static final State STICKERS_STYLE_EDITOR;
        public static final State SWAP;
        public static final State VIDEO_CROPPER;
        public static final State VIDEO_FULLSCREEN;
        public static final State VOLUME;

        static {
            State state = new State("VIDEO_CROPPER", 0);
            VIDEO_CROPPER = state;
            State state2 = new State("VIDEO_FULLSCREEN", 1);
            VIDEO_FULLSCREEN = state2;
            State state3 = new State("STICKERS_SELECTOR", 2);
            STICKERS_SELECTOR = state3;
            State state4 = new State("STICKERS_STYLE_EDITOR", 3);
            STICKERS_STYLE_EDITOR = state4;
            State state5 = new State("CORRECTION", 4);
            CORRECTION = state5;
            State state6 = new State("SPEED", 5);
            SPEED = state6;
            State state7 = new State("ASPECT_RATIO", 6);
            ASPECT_RATIO = state7;
            State state8 = new State("SWAP", 7);
            SWAP = state8;
            State state9 = new State("VOLUME", 8);
            VOLUME = state9;
            State state10 = new State("AUDIO_EFFECTS", 9);
            AUDIO_EFFECTS = state10;
            State[] stateArr = {state, state2, state3, state4, state5, state6, state7, state8, state9, state10};
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

    /* compiled from: ClipsEditorScreen.kt */
    public static abstract class a {
        public final Bundle a;

        /* compiled from: ClipsEditorScreen.kt */
        /* renamed from: com.vk.clips.editor.base.api.ClipsEditorScreen$a$a, reason: collision with other inner class name */
        public static final class C0579a extends a {
        }

        /* compiled from: ClipsEditorScreen.kt */
        public static final class b extends a {
            public final com.vk.clips.editor.state.model.b b;

            public b(com.vk.clips.editor.state.model.b bVar, Bundle bundle) {
                super(bundle);
                this.b = bVar;
            }
        }

        public a(Bundle bundle) {
            this.a = bundle;
        }
    }

    boolean a0();

    void b(boolean z, a aVar);

    void close();

    State getState();
}
