package com.vk.music.player;

import com.vk.core.serialize.Serializer;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import java.util.UUID;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.shy;
import xsna.zcl;

/* compiled from: PlayerTrack.kt */
/* loaded from: classes3.dex */
public final class PlayerTrack extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PlayerTrack> CREATOR = new a();
    public MusicTrack b;
    public final PlaybackLaunchMeta c;
    public int d;
    public long e;
    public final String f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PlayerTrack> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PlayerTrack a(Serializer serializer) {
            return new PlayerTrack(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlayerTrack[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PlayerTrack(MusicTrack musicTrack, PlaybackLaunchMeta playbackLaunchMeta, int i, long j, String str, int i2, zcl zclVar) {
        this(musicTrack, playbackLaunchMeta, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? UUID.randomUUID().toString() : str);
        if ((i2 & 2) != 0) {
            Object obj = PlaybackLaunchMeta.g;
            playbackLaunchMeta = PlaybackLaunchMeta.a.a();
        }
    }

    public static PlayerTrack zb(PlayerTrack playerTrack, MusicTrack musicTrack, int i) {
        if ((i & 1) != 0) {
            musicTrack = playerTrack.b;
        }
        MusicTrack musicTrack2 = musicTrack;
        PlaybackLaunchMeta playbackLaunchMeta = playerTrack.c;
        int i2 = playerTrack.d;
        long j = (i & 8) != 0 ? playerTrack.e : 0L;
        String str = playerTrack.f;
        playerTrack.getClass();
        return new PlayerTrack(musicTrack2, playbackLaunchMeta, i2, j, str);
    }

    public final MusicTrack Ab() {
        return this.b;
    }

    public final String Bb() {
        return this.f;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
        serializer.S(this.d);
        serializer.Y(this.e);
        serializer.j0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerTrack)) {
            return false;
        }
        PlayerTrack playerTrack = (PlayerTrack) obj;
        return epx.f(this.b, playerTrack.b) && epx.f(this.c, playerTrack.c) && this.d == playerTrack.d && this.e == playerTrack.e && epx.f(this.f, playerTrack.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + bh10.a(shy.a(this.d, (this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerTrack(musicTrack=");
        sb.append(this.b);
        sb.append(", launchMeta=");
        sb.append(this.c);
        sb.append(", position=");
        sb.append(this.d);
        sb.append(", progressMs=");
        sb.append(this.e);
        sb.append(", uuid=");
        return ho8.a(sb, this.f, ')');
    }

    public PlayerTrack(MusicTrack musicTrack, PlaybackLaunchMeta playbackLaunchMeta, int i, long j, String str) {
        this.b = musicTrack;
        this.c = playbackLaunchMeta;
        this.d = i;
        this.e = j;
        this.f = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PlayerTrack(Serializer serializer) {
        this(r2, r3, r4, r5, r9 == null ? "" : r9);
        MusicTrack musicTrack = (MusicTrack) serializer.G(MusicTrack.class.getClassLoader());
        PlaybackLaunchMeta playbackLaunchMeta = (PlaybackLaunchMeta) serializer.G(PlaybackLaunchMeta.class.getClassLoader());
        if (playbackLaunchMeta == null) {
            Object obj = PlaybackLaunchMeta.g;
            playbackLaunchMeta = PlaybackLaunchMeta.a.a();
        }
        PlaybackLaunchMeta playbackLaunchMeta2 = playbackLaunchMeta;
        int u = serializer.u();
        long w = serializer.w();
        String H = serializer.H();
    }
}
