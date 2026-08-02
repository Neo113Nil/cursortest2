package com.vk.music.player;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.music.player.PlaySourceMeta;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;
import xsna.yba;
import xsna.zcl;

/* compiled from: StartPlayRequest.kt */
/* loaded from: classes3.dex */
public final class StartPlayPlaylistSource extends StartPlaySource implements yba {
    public static final Serializer.c<StartPlayPlaylistSource> CREATOR = new a();
    public final PlaySourceMeta.PlaylistPlaySourceMeta c;
    public final String d;
    public final String e;
    public final String f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StartPlayPlaylistSource> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StartPlayPlaylistSource a(Serializer serializer) {
            return new StartPlayPlaylistSource(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StartPlayPlaylistSource[i];
        }
    }

    public /* synthetic */ StartPlayPlaylistSource(PlaySourceMeta.PlaylistPlaySourceMeta playlistPlaySourceMeta, String str, String str2, String str3, int i, zcl zclVar) {
        this(playlistPlaySourceMeta, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : str3);
    }

    public final PlaySourceMeta.PlaylistPlaySourceMeta Ab() {
        return this.c;
    }

    public final String Bb() {
        PlaySourceMeta.PlaylistPlaySourceMeta playlistPlaySourceMeta = this.c;
        UserId userId = playlistPlaySourceMeta.d;
        int i = playlistPlaySourceMeta.e;
        String str = this.f;
        if (str == null || str.length() == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(userId);
            sb.append('_');
            sb.append(i);
            return sb.toString();
        }
        return userId + '_' + i + '_' + str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.f);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.e0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartPlayPlaylistSource)) {
            return false;
        }
        StartPlayPlaylistSource startPlayPlaylistSource = (StartPlayPlaylistSource) obj;
        return epx.f(this.c, startPlayPlaylistSource.c) && epx.f(this.d, startPlayPlaylistSource.d) && epx.f(this.e, startPlayPlaylistSource.e) && epx.f(this.f, startPlayPlaylistSource.f);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.c.hashCode() * 31, 31, this.d), 31, this.e);
        String str = this.f;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartPlayPlaylistSource(meta=");
        sb.append(this.c);
        sb.append(", blockId=");
        sb.append(this.d);
        sb.append(", sectionId=");
        sb.append(this.e);
        sb.append(", playlistAccessKey=");
        return ho8.a(sb, this.f, ')');
    }

    @Override // xsna.yba
    public final String v0() {
        return this.e;
    }

    @Override // xsna.yba
    public final String w() {
        return this.d;
    }

    @Override // com.vk.music.player.StartPlaySource
    public final PlaySourceMeta zb() {
        return this.c;
    }

    public StartPlayPlaylistSource(PlaySourceMeta.PlaylistPlaySourceMeta playlistPlaySourceMeta, String str, String str2, String str3) {
        super(playlistPlaySourceMeta, null);
        this.c = playlistPlaySourceMeta;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StartPlayPlaylistSource(Serializer serializer) {
        this(r5 == null ? (PlaySourceMeta.PlaylistPlaySourceMeta) PlaySourceMeta.PlaylistPlaySourceMeta.h.getValue() : r5, r1, r2, r0);
        String H = serializer.H();
        String H2 = serializer.H();
        H2 = H2 == null ? "" : H2;
        String H3 = serializer.H();
        String str = H3 != null ? H3 : "";
        PlaySourceMeta.PlaylistPlaySourceMeta playlistPlaySourceMeta = (PlaySourceMeta.PlaylistPlaySourceMeta) serializer.A(PlaySourceMeta.PlaylistPlaySourceMeta.class.getClassLoader());
    }
}
