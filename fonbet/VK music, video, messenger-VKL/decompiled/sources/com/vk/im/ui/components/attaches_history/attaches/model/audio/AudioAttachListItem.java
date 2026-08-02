package com.vk.im.ui.components.attaches_history.attaches.model.audio;

import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.AttachAudio;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.hfz;
import xsna.shy;
import xsna.zrp;

/* compiled from: AudioAttachListItem.kt */
/* loaded from: classes2.dex */
public final class AudioAttachListItem extends Serializer.StreamParcelableAdapter implements hfz {
    public static final Serializer.c<AudioAttachListItem> CREATOR = new a();
    public final AttachAudio b;
    public final int c;
    public final long d;
    public final State e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioAttachListItem.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State EMPTY;
        public static final State PAUSED;
        public static final State PLAYING;

        static {
            State state = new State("EMPTY", 0);
            EMPTY = state;
            State state2 = new State("PLAYING", 1);
            PLAYING = state2;
            State state3 = new State("PAUSED", 2);
            PAUSED = state3;
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

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AudioAttachListItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioAttachListItem a(Serializer serializer) {
            return new AudioAttachListItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AudioAttachListItem[i];
        }
    }

    public AudioAttachListItem(AttachAudio attachAudio, int i, long j, State state) {
        this.b = attachAudio;
        this.c = i;
        this.d = j;
        this.e = state;
    }

    public static AudioAttachListItem zb(AudioAttachListItem audioAttachListItem, AttachAudio attachAudio, State state, int i) {
        if ((i & 1) != 0) {
            attachAudio = audioAttachListItem.b;
        }
        AttachAudio attachAudio2 = attachAudio;
        int i2 = audioAttachListItem.c;
        long j = audioAttachListItem.d;
        if ((i & 8) != 0) {
            state = audioAttachListItem.e;
        }
        return new AudioAttachListItem(attachAudio2, i2, j, state);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.S(this.c);
        serializer.Y(this.d);
        serializer.j0(this.e.name());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioAttachListItem)) {
            return false;
        }
        AudioAttachListItem audioAttachListItem = (AudioAttachListItem) obj;
        return epx.f(this.b, audioAttachListItem.b) && this.c == audioAttachListItem.c && this.d == audioAttachListItem.d && this.e == audioAttachListItem.e;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf((int) this.b.f);
    }

    public final int hashCode() {
        return this.e.hashCode() + bh10.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d);
    }

    public final String toString() {
        return "AudioAttachListItem(attachAudio=" + this.b + ", msgCnvId=" + this.c + ", fromId=" + this.d + ", state=" + this.e + ')';
    }

    public AudioAttachListItem(Serializer serializer) {
        this((AttachAudio) serializer.G(AttachAudio.class.getClassLoader()), serializer.u(), serializer.w(), State.valueOf(serializer.H()));
    }
}
