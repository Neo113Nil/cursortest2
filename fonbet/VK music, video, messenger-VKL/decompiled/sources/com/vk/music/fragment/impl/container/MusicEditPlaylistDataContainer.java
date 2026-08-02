package com.vk.music.fragment.impl.container;

import com.vk.core.serialize.Serializer;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.ReorderAudioAction;
import com.vk.dto.music.Thumb;
import java.util.ArrayList;
import xsna.zcl;

/* compiled from: MusicEditPlaylistDataContainer.kt */
/* loaded from: classes3.dex */
public final class MusicEditPlaylistDataContainer extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<MusicEditPlaylistDataContainer> CREATOR = new a();
    public boolean b;
    public int c;
    public String d;
    public String e;
    public Thumb f;
    public Playlist g;
    public ArrayList<MusicTrack> h;
    public final ArrayList<MusicTrack> i;
    public final ArrayList<MusicTrack> j;
    public final ArrayList<ReorderAudioAction> k;
    public final ArrayList<MusicTrack> l;
    public String m;
    public final boolean n;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MusicEditPlaylistDataContainer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MusicEditPlaylistDataContainer a(Serializer serializer) {
            return new MusicEditPlaylistDataContainer(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MusicEditPlaylistDataContainer[i];
        }
    }

    public MusicEditPlaylistDataContainer() {
        this(false, 0, null, null, null, null, null, null, null, null, null, null, false, 8191, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.S(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.i0(this.f);
        serializer.i0(this.g);
        serializer.W(this.h);
        serializer.W(this.i);
        serializer.W(this.j);
        serializer.W(this.k);
        serializer.W(this.l);
        serializer.j0(this.m);
        serializer.L(this.n ? (byte) 1 : (byte) 0);
    }

    public /* synthetic */ MusicEditPlaylistDataContainer(boolean z, int i, String str, String str2, Thumb thumb, Playlist playlist, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, String str3, boolean z2, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : thumb, (i2 & 32) != 0 ? null : playlist, (i2 & 64) != 0 ? null : arrayList, (i2 & 128) != 0 ? new ArrayList() : arrayList2, (i2 & 256) != 0 ? new ArrayList() : arrayList3, (i2 & 512) != 0 ? new ArrayList() : arrayList4, (i2 & 1024) != 0 ? new ArrayList() : arrayList5, (i2 & 2048) == 0 ? str3 : null, (i2 & 4096) != 0 ? false : z2);
    }

    public MusicEditPlaylistDataContainer(boolean z, int i, String str, String str2, Thumb thumb, Playlist playlist, ArrayList<MusicTrack> arrayList, ArrayList<MusicTrack> arrayList2, ArrayList<MusicTrack> arrayList3, ArrayList<ReorderAudioAction> arrayList4, ArrayList<MusicTrack> arrayList5, String str3, boolean z2) {
        this.b = z;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = thumb;
        this.g = playlist;
        this.h = arrayList;
        this.i = arrayList2;
        this.j = arrayList3;
        this.k = arrayList4;
        this.l = arrayList5;
        this.m = str3;
        this.n = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MusicEditPlaylistDataContainer(Serializer serializer) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r0 == null ? new ArrayList() : r0, serializer.H(), serializer.m());
        boolean m = serializer.m();
        int u = serializer.u();
        String H = serializer.H();
        String H2 = serializer.H();
        Thumb thumb = (Thumb) serializer.G(Thumb.class.getClassLoader());
        Playlist playlist = (Playlist) serializer.G(Playlist.class.getClassLoader());
        ArrayList l = serializer.l(MusicTrack.class.getClassLoader());
        ArrayList l2 = serializer.l(MusicTrack.class.getClassLoader());
        l2 = l2 == null ? new ArrayList() : l2;
        ArrayList l3 = serializer.l(MusicTrack.class.getClassLoader());
        l3 = l3 == null ? new ArrayList() : l3;
        ArrayList l4 = serializer.l(ReorderAudioAction.class.getClassLoader());
        l4 = l4 == null ? new ArrayList() : l4;
        ArrayList l5 = serializer.l(MusicTrack.class.getClassLoader());
    }
}
