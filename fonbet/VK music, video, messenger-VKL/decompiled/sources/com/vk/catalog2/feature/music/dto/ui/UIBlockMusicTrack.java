package com.vk.catalog2.feature.music.dto.ui;

import com.vk.catalog2.common.dto.api.ShowAllInfo;
import com.vk.catalog2.common.dto.api.music.CatalogMusicTrackLocalState;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.a;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.chart.ChartInfo;
import java.util.Objects;
import xsna.dfp0;
import xsna.epx;
import xsna.ho8;
import xsna.qjg;
import xsna.zcl;

/* compiled from: UIBlockMusicTrack.kt */
/* loaded from: classes16.dex */
public final class UIBlockMusicTrack extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockMusicTrack> CREATOR = new a();
    public final String A;
    public final String B;
    public final CatalogMusicTrackLocalState C;
    public final ShowAllInfo D;
    public final boolean E;
    public final String F;
    public final int y;
    public final MusicTrack z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockMusicTrack> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockMusicTrack a(Serializer serializer) {
            return new UIBlockMusicTrack(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockMusicTrack[i];
        }
    }

    public UIBlockMusicTrack(Serializer serializer) {
        super(serializer);
        MusicTrack musicTrack = (MusicTrack) serializer.G(MusicTrack.class.getClassLoader());
        this.z = musicTrack;
        this.y = serializer.u();
        this.A = serializer.H();
        String H = serializer.H();
        this.B = H == null ? "" : H;
        this.C = (CatalogMusicTrackLocalState) serializer.A(CatalogMusicTrackLocalState.class.getClassLoader());
        this.D = (ShowAllInfo) serializer.G(ShowAllInfo.class.getClassLoader());
        this.E = serializer.m();
        this.F = musicTrack.Fb();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.F;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.z);
        serializer.S(this.y);
        serializer.j0(this.A);
        serializer.j0(this.B);
        serializer.e0(this.C);
        serializer.i0(this.D);
        serializer.L(this.E ? (byte) 1 : (byte) 0);
    }

    public final UIBlockMusicTrack Pb(MusicTrack musicTrack) {
        com.vk.catalog2.common.dto.api.ui.a a2 = a.C0482a.a(this);
        CatalogMusicTrackLocalState zb = CatalogMusicTrackLocalState.zb(this.C, false, false, 7);
        ShowAllInfo showAllInfo = this.D;
        return new UIBlockMusicTrack(a2, musicTrack, this.A, null, zb, showAllInfo != null ? ShowAllInfo.zb(showAllInfo) : null, this.E, this.F, 8, null);
    }

    public final boolean Qb(MusicTrack musicTrack) {
        return epx.f(this.F, musicTrack.Fb());
    }

    public final MusicTrack Rb() {
        return this.z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockMusicTrack) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockMusicTrack uIBlockMusicTrack = (UIBlockMusicTrack) obj;
        MusicTrack musicTrack = uIBlockMusicTrack.z;
        MusicTrack musicTrack2 = uIBlockMusicTrack.z;
        MusicTrack musicTrack3 = this.z;
        return epx.f(musicTrack3, musicTrack) && epx.f(musicTrack3.J, musicTrack2.J) && this.y == uIBlockMusicTrack.y && musicTrack3.U == musicTrack2.U && musicTrack3.l == musicTrack2.l && musicTrack3.g == musicTrack2.g && epx.f(this.A, uIBlockMusicTrack.A) && epx.f(this.B, uIBlockMusicTrack.B) && musicTrack3.M == musicTrack2.M && epx.f(this.C, uIBlockMusicTrack.C) && epx.f(this.D, uIBlockMusicTrack.D);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        Integer valueOf = Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p));
        Integer valueOf2 = Integer.valueOf(this.y);
        MusicTrack musicTrack = this.z;
        return Objects.hash(valueOf, this.z, valueOf2, Boolean.valueOf(musicTrack.U), Boolean.valueOf(musicTrack.l), Integer.valueOf(musicTrack.g), this.A, this.B, Boolean.valueOf(musicTrack.M), this.C, this.D, Boolean.valueOf(this.E));
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.z.y;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append('<');
        return ho8.a(sb, this.z.d, '>');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        com.vk.catalog2.common.dto.api.ui.a a2 = a.C0482a.a(this);
        MusicTrack zb = MusicTrack.zb(this.z, 0, null, 0, 0, null, false, null, null, false, false, null, null, null, -1, 1048575);
        CatalogMusicTrackLocalState zb2 = CatalogMusicTrackLocalState.zb(this.C, false, false, 7);
        ShowAllInfo showAllInfo = this.D;
        return new UIBlockMusicTrack(a2, zb, this.A, this.B, zb2, showAllInfo != null ? ShowAllInfo.zb(showAllInfo) : null, this.E, this.F);
    }

    public /* synthetic */ UIBlockMusicTrack(com.vk.catalog2.common.dto.api.ui.a aVar, MusicTrack musicTrack, String str, String str2, CatalogMusicTrackLocalState catalogMusicTrackLocalState, ShowAllInfo showAllInfo, boolean z, String str3, int i, zcl zclVar) {
        this(aVar, musicTrack, str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? new CatalogMusicTrackLocalState(false, false, false, 7, null) : catalogMusicTrackLocalState, (i & 32) != 0 ? null : showAllInfo, (i & 64) != 0 ? false : z, (i & 128) != 0 ? musicTrack.Fb() : str3);
    }

    public UIBlockMusicTrack(com.vk.catalog2.common.dto.api.ui.a aVar, MusicTrack musicTrack, String str, String str2, CatalogMusicTrackLocalState catalogMusicTrackLocalState, ShowAllInfo showAllInfo, boolean z, String str3) {
        super(aVar);
        this.z = musicTrack;
        ChartInfo chartInfo = musicTrack.D;
        this.y = chartInfo != null ? chartInfo.b : 0;
        this.A = str;
        this.B = str2;
        this.C = catalogMusicTrackLocalState;
        this.D = showAllInfo;
        this.E = z;
        this.F = str3;
    }

    public /* synthetic */ UIBlockMusicTrack(UIBlockMusicTrack uIBlockMusicTrack, MusicTrack musicTrack, CatalogMusicTrackLocalState catalogMusicTrackLocalState, ShowAllInfo showAllInfo, int i, zcl zclVar) {
        this(uIBlockMusicTrack, musicTrack, (i & 4) != 0 ? null : catalogMusicTrackLocalState, (i & 8) != 0 ? null : showAllInfo);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UIBlockMusicTrack(UIBlockMusicTrack uIBlockMusicTrack, MusicTrack musicTrack, CatalogMusicTrackLocalState catalogMusicTrackLocalState, ShowAllInfo showAllInfo) {
        this(r1, musicTrack, r3, r4, r5, showAllInfo, uIBlockMusicTrack.E, uIBlockMusicTrack.F);
        com.vk.catalog2.common.dto.api.ui.a a2 = a.C0482a.a(uIBlockMusicTrack);
        String str = uIBlockMusicTrack.A;
        String str2 = uIBlockMusicTrack.B;
        CatalogMusicTrackLocalState zb = catalogMusicTrackLocalState == null ? CatalogMusicTrackLocalState.zb(uIBlockMusicTrack.C, false, false, 7) : catalogMusicTrackLocalState;
        if (showAllInfo == null) {
            ShowAllInfo showAllInfo2 = uIBlockMusicTrack.D;
            showAllInfo = showAllInfo2 != null ? ShowAllInfo.zb(showAllInfo2) : null;
        }
    }
}
