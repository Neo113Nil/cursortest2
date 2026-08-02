package com.vk.music.fragment.impl.model;

import com.vk.core.serialize.Serializer;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistOwner;
import java.util.ArrayList;
import java.util.List;
import xsna.zcl;

/* compiled from: MusicPlaylistsModelDataContainer.kt */
/* loaded from: classes3.dex */
public final class MusicPlaylistsModelDataContainer extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<MusicPlaylistsModelDataContainer> CREATOR = new a();
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public String f;
    public String g;
    public PlaylistOwner h;
    public ArrayList<Playlist> i;
    public int j;
    public long k;
    public List<MusicTrack> l;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MusicPlaylistsModelDataContainer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MusicPlaylistsModelDataContainer a(Serializer serializer) {
            return new MusicPlaylistsModelDataContainer(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MusicPlaylistsModelDataContainer[i];
        }
    }

    public MusicPlaylistsModelDataContainer() {
        this(false, false, false, false, null, null, null, null, 0, 0L, null, 2047, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.i0(this.h);
        serializer.W(this.i);
        serializer.S(this.j);
        serializer.Y(this.k);
        serializer.W(this.l);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ MusicPlaylistsModelDataContainer(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, PlaylistOwner playlistOwner, ArrayList arrayList, int i, long j, List list, int i2, zcl zclVar) {
        this(z, z2, r1, r3, r4, r6, r7, r8, r2, r9, (i2 & 1024) != 0 ? null : list);
        long j2;
        z = (i2 & 1) != 0 ? false : z;
        z2 = (i2 & 2) != 0 ? false : z2;
        boolean z5 = (i2 & 4) != 0 ? false : z3;
        boolean z6 = (i2 & 8) != 0 ? false : z4;
        String str3 = (i2 & 16) != 0 ? null : str;
        String str4 = (i2 & 32) != 0 ? null : str2;
        PlaylistOwner playlistOwner2 = (i2 & 64) != 0 ? null : playlistOwner;
        ArrayList arrayList2 = (i2 & 128) != 0 ? null : arrayList;
        int i3 = (i2 & 256) == 0 ? i : 0;
        if ((i2 & 512) != 0) {
            Long l = -1L;
            j2 = l.longValue();
        } else {
            j2 = j;
        }
    }

    public MusicPlaylistsModelDataContainer(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, PlaylistOwner playlistOwner, ArrayList<Playlist> arrayList, int i, long j, List<MusicTrack> list) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = str;
        this.g = str2;
        this.h = playlistOwner;
        this.i = arrayList;
        this.j = i;
        this.k = j;
        this.l = list;
    }

    public MusicPlaylistsModelDataContainer(Serializer serializer) {
        this(serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.H(), serializer.H(), (PlaylistOwner) serializer.G(PlaylistOwner.class.getClassLoader()), serializer.l(Playlist.class.getClassLoader()), serializer.u(), serializer.w(), serializer.l(MusicTrack.class.getClassLoader()));
    }
}
