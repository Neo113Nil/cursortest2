package com.vk.im.ui.components.attaches_history.attaches.model.audio;

import com.vk.dto.music.MusicTrack;
import com.vk.im.external.AudioTrack;
import xsna.epx;
import xsna.rq;

/* compiled from: AudioTrackState.kt */
/* loaded from: classes2.dex */
public abstract class c {
    public final int a;

    /* compiled from: AudioTrackState.kt */
    public static final class a extends c {
        public final int b;
        public final MusicTrack c;

        public a(int i, MusicTrack musicTrack) {
            super(musicTrack.b);
            this.b = i;
            this.c = musicTrack;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AddRemoveFromMyMusic(oldId=");
            sb.append(this.b);
            sb.append(", musicTrack=");
            return rq.c(sb, this.c, ')');
        }
    }

    /* compiled from: AudioTrackState.kt */
    public static final class b extends c {
    }

    /* compiled from: AudioTrackState.kt */
    /* renamed from: com.vk.im.ui.components.attaches_history.attaches.model.audio.c$c, reason: collision with other inner class name */
    public static final class C1142c extends c {
        public final AudioTrack b;

        public C1142c(AudioTrack audioTrack) {
            super(audioTrack.b.b);
            this.b = audioTrack;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1142c) && epx.f(this.b, ((C1142c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Paused(audioTrack=" + this.b + ')';
        }
    }

    /* compiled from: AudioTrackState.kt */
    public static final class d extends c {
        public final AudioTrack b;

        public d(AudioTrack audioTrack) {
            super(audioTrack.b.b);
            this.b = audioTrack;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Playing(audioTrack=" + this.b + ')';
        }
    }

    public c(int i) {
        this.a = i;
    }
}
