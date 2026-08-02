package com.vk.music.player;

import android.os.SystemClock;
import com.vk.core.serialize.Serializer;
import xsna.vu5;
import xsna.zcl;

/* compiled from: PlaybackActionMeta.kt */
/* loaded from: classes3.dex */
public final class PlaybackActionMeta extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PlaybackActionMeta> CREATOR = new a();
    public final int b;
    public final long c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PlaybackActionMeta> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PlaybackActionMeta a(Serializer serializer) {
            return new PlaybackActionMeta(serializer.u(), serializer.w());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlaybackActionMeta[i];
        }
    }

    public /* synthetic */ PlaybackActionMeta(int i, long j, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? SystemClock.elapsedRealtime() : j);
    }

    public static PlaybackActionMeta zb(PlaybackActionMeta playbackActionMeta, int i, long j, int i2) {
        if ((i2 & 1) != 0) {
            i = playbackActionMeta.b;
        }
        if ((i2 & 2) != 0) {
            j = playbackActionMeta.c;
        }
        playbackActionMeta.getClass();
        return new PlaybackActionMeta(i, j);
    }

    public final int Ab() {
        return this.b;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.Y(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaybackActionMeta)) {
            return false;
        }
        PlaybackActionMeta playbackActionMeta = (PlaybackActionMeta) obj;
        return this.b == playbackActionMeta.b && this.c == playbackActionMeta.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackActionMeta(actionTrigger=");
        sb.append(this.b);
        sb.append(", actionTimestamp=");
        return vu5.a(')', this.c, sb);
    }

    public PlaybackActionMeta(int i, long j) {
        this.b = i;
        this.c = j;
    }
}
