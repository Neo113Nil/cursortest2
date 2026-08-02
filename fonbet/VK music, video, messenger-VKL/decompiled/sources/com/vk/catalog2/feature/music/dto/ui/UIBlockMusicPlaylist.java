package com.vk.catalog2.feature.music.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.dto.music.chart.ChartInfo;
import java.util.List;
import java.util.Objects;
import xsna.dfp0;
import xsna.epx;
import xsna.ho8;
import xsna.i7o0;
import xsna.qjg;
import xsna.zcl;

/* compiled from: UIBlockMusicPlaylist.kt */
/* loaded from: classes16.dex */
public final class UIBlockMusicPlaylist extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockMusicPlaylist> CREATOR = new a();
    public final Float A;
    public final String B;
    public final String C;
    public final String D;
    public final boolean E;
    public final boolean F;
    public final Thumb G;
    public final List<Artist> H;
    public final int y;
    public Playlist z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockMusicPlaylist> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockMusicPlaylist a(Serializer serializer) {
            return new UIBlockMusicPlaylist(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockMusicPlaylist[i];
        }
    }

    public UIBlockMusicPlaylist(Serializer serializer) {
        super(serializer);
        this.B = "";
        this.E = true;
        this.z = (Playlist) serializer.G(Playlist.class.getClassLoader());
        this.y = serializer.u();
        this.A = serializer.t();
        String H = serializer.H();
        this.B = H != null ? H : "";
        this.C = serializer.H();
        this.D = serializer.H();
        this.E = serializer.m();
        this.F = serializer.m();
        this.G = (Thumb) serializer.G(Thumb.class.getClassLoader());
        this.H = serializer.B(Artist.class.getClassLoader());
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.z.Hb();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Gb() {
        return this.z.Ib();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.z);
        serializer.S(this.y);
        serializer.R(this.A);
        serializer.j0(this.B);
        serializer.j0(this.C);
        serializer.j0(this.D);
        serializer.L(this.E ? (byte) 1 : (byte) 0);
        serializer.L(this.F ? (byte) 1 : (byte) 0);
        serializer.i0(this.G);
        serializer.f0(this.H);
    }

    public final List<Artist> Pb() {
        return this.H;
    }

    public final String Qb() {
        return this.D;
    }

    public final Float Rb() {
        return this.A;
    }

    public final String Sb() {
        return this.B;
    }

    public final Thumb Tb() {
        return this.G;
    }

    public final Playlist Ub() {
        return this.z;
    }

    public final boolean Vb() {
        return this.E;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockMusicPlaylist) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockMusicPlaylist uIBlockMusicPlaylist = (UIBlockMusicPlaylist) obj;
        Playlist playlist = uIBlockMusicPlaylist.z;
        return epx.f(this.z, playlist) && epx.f(this.z.H, playlist.H) && epx.f(this.z.p, playlist.p) && epx.f(this.z.h, playlist.h) && epx.f(this.z.B, playlist.B) && this.z.C == playlist.C && this.y == uIBlockMusicPlaylist.y && epx.e(this.A, uIBlockMusicPlaylist.A) && epx.f(this.B, uIBlockMusicPlaylist.B) && epx.f(this.C, uIBlockMusicPlaylist.C) && epx.f(this.D, uIBlockMusicPlaylist.D) && this.E == uIBlockMusicPlaylist.E && this.F == uIBlockMusicPlaylist.F && epx.f(this.G, uIBlockMusicPlaylist.G) && epx.f(this.H, uIBlockMusicPlaylist.H);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        Integer valueOf = Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p));
        Playlist playlist = this.z;
        return Objects.hash(valueOf, playlist, playlist.p, playlist.h, playlist.B, Integer.valueOf(this.y), this.A, this.B, this.C, this.D, Boolean.valueOf(this.E), Boolean.valueOf(this.F), this.G, this.H);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.z.F;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append('<');
        return ho8.a(sb, this.z.h, '>');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        Playlist zb = Playlist.zb(this.z, null, null, null, null, -1, 255);
        Thumb thumb = this.G;
        Thumb zb2 = thumb != null ? Thumb.zb(thumb, null, 15) : null;
        List<Artist> list = this.H;
        return new UIBlockMusicPlaylist(Ab, zb, this.A, this.B, this.C, this.D, this.E, this.F, zb2, list != null ? i7o0.a(list) : null);
    }

    public /* synthetic */ UIBlockMusicPlaylist(com.vk.catalog2.common.dto.api.ui.a aVar, Playlist playlist, Float f, String str, String str2, String str3, boolean z, boolean z2, Thumb thumb, List list, int i, zcl zclVar) {
        this(aVar, playlist, (i & 4) != 0 ? null : f, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? true : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? null : thumb, (i & 512) != 0 ? null : list);
    }

    public UIBlockMusicPlaylist(com.vk.catalog2.common.dto.api.ui.a aVar, Playlist playlist, Float f, String str, String str2, String str3, boolean z, boolean z2, Thumb thumb, List<Artist> list) {
        super(aVar);
        this.B = "";
        this.E = true;
        this.z = playlist;
        ChartInfo chartInfo = playlist.G;
        this.y = chartInfo != null ? chartInfo.b : 0;
        this.A = f;
        this.B = str;
        this.C = str2;
        this.D = str3;
        this.E = z;
        this.F = z2;
        this.G = thumb;
        this.H = list;
    }
}
