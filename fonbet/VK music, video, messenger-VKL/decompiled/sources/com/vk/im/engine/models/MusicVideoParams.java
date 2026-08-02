package com.vk.im.engine.models;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Genre;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.ms9;
import xsna.qoy;
import xsna.zcl;

/* compiled from: MusicVideoParams.kt */
/* loaded from: classes2.dex */
public final class MusicVideoParams extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<MusicVideoParams> CREATOR = new a();
    public final String b;
    public final long c;
    public final boolean d;
    public final List<Genre> e;
    public final List<Artist> f;
    public final List<Artist> g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MusicVideoParams> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MusicVideoParams a(Serializer serializer) {
            return new MusicVideoParams(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MusicVideoParams[i];
        }
    }

    public MusicVideoParams() {
        this(null, 0L, false, null, null, null, 63, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.Y(this.c);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.W(this.e);
        serializer.W(this.f);
        serializer.W(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicVideoParams)) {
            return false;
        }
        MusicVideoParams musicVideoParams = (MusicVideoParams) obj;
        return epx.f(this.b, musicVideoParams.b) && this.c == musicVideoParams.c && this.d == musicVideoParams.d && epx.f(this.e, musicVideoParams.e) && epx.f(this.f, musicVideoParams.f) && epx.f(this.g, musicVideoParams.g);
    }

    public final int hashCode() {
        String str = this.b;
        int b = qoy.b(bh10.a((str == null ? 0 : str.hashCode()) * 31, 31, this.c), 31, this.d);
        List<Genre> list = this.e;
        int hashCode = (b + (list == null ? 0 : list.hashCode())) * 31;
        List<Artist> list2 = this.f;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Artist> list3 = this.g;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicVideoParams(subtitle=");
        sb.append(this.b);
        sb.append(", releaseDate=");
        sb.append(this.c);
        sb.append(", explicit=");
        sb.append(this.d);
        sb.append(", genres=");
        sb.append(this.e);
        sb.append(", artists=");
        sb.append(this.f);
        sb.append(", featArtists=");
        return ms9.a(')', sb, this.g);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ MusicVideoParams(String str, long j, boolean z, List list, List list2, List list3, int i, zcl zclVar) {
        this(str, j, r7, r8, r9, r10);
        List list4;
        List list5;
        boolean z2;
        List list6;
        str = (i & 1) != 0 ? "" : str;
        j = (i & 2) != 0 ? 0L : j;
        z = (i & 4) != 0 ? false : z;
        list = (i & 8) != 0 ? null : list;
        list2 = (i & 16) != 0 ? null : list2;
        if ((i & 32) != 0) {
            list4 = null;
            list6 = list;
            list5 = list2;
            z2 = z;
        } else {
            list4 = list3;
            list5 = list2;
            z2 = z;
            list6 = list;
        }
    }

    public MusicVideoParams(String str, long j, boolean z, List<Genre> list, List<Artist> list2, List<Artist> list3) {
        this.b = str;
        this.c = j;
        this.d = z;
        this.e = list;
        this.f = list2;
        this.g = list3;
    }

    public MusicVideoParams(MusicVideoFile musicVideoFile) {
        this(musicVideoFile.D1, musicVideoFile.F1, musicVideoFile.A1, musicVideoFile.E1, musicVideoFile.B1, musicVideoFile.C1);
    }

    public MusicVideoParams(Serializer serializer) {
        this(serializer.H(), serializer.w(), serializer.m(), serializer.l(Genre.class.getClassLoader()), serializer.l(Artist.class.getClassLoader()), serializer.l(Artist.class.getClassLoader()));
    }
}
