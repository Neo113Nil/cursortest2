package com.vk.music.player;

import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.generated.audio.dto.AudioGetIdsBySourceSourceDto;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.StartPlayEntitySource;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.p;
import defpackage.s;
import io.reactivex.rxjava3.disposables.g;
import io.reactivex.rxjava3.internal.operators.single.l;
import io.reactivex.rxjava3.internal.operators.single.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.utils.Logger;
import xsna.asu0;
import xsna.bf2;
import xsna.bn40;
import xsna.bpn0;
import xsna.c5g;
import xsna.e5;
import xsna.efz;
import xsna.epx;
import xsna.gc;
import xsna.go9;
import xsna.hx4;
import xsna.hxa0;
import xsna.j5g;
import xsna.l5;
import xsna.lqk0;
import xsna.m5;
import xsna.pj4;
import xsna.po5;
import xsna.ri0;
import xsna.rsg0;
import xsna.u940;
import xsna.uq50;
import xsna.vj0;
import xsna.yfb;

/* compiled from: AutoflowDelegate.kt */
/* loaded from: classes3.dex */
public final class a {
    public final hxa0 a;
    public final u940 b;
    public LoopMode c;
    public lqk0 d;
    public boolean e;
    public boolean f;
    public PlayerTrack g;
    public PlayerTrack h;
    public boolean i;
    public boolean j;
    public final bpn0 k = new bpn0(new gc(2));
    public final g l = new g();

    /* compiled from: AutoflowDelegate.kt */
    /* renamed from: com.vk.music.player.a$a, reason: collision with other inner class name */
    public static final class C1330a {
        public C1330a() {
        }
    }

    public a(com.vk.music.pref.a aVar, hxa0 hxa0Var, u940 u940Var) {
        this.a = hxa0Var;
        this.b = u940Var;
        this.c = aVar.n0();
        hxa0Var.w(new C1330a());
    }

    public static final void a(a aVar, PlayerTrack playerTrack) {
        MusicPlaybackLaunchContext musicPlaybackLaunchContext;
        MusicTrack musicTrack;
        aVar.h = playerTrack;
        boolean z = false;
        aVar.f = false;
        if (playerTrack != null && (musicTrack = playerTrack.b) != null && musicTrack.Tb()) {
            z = true;
        }
        aVar.i = z;
        com.vk.music.player.playback.e i = aVar.a.i();
        String str = null;
        PlaybackLaunchMeta playbackLaunchMeta = i != null ? i.b : null;
        if (playbackLaunchMeta != null && (musicPlaybackLaunchContext = playbackLaunchMeta.b) != null) {
            str = musicPlaybackLaunchContext.Gb();
        }
        aVar.j = epx.f(str, "kids_section");
    }

    public final void b() {
        this.l.b(null);
        this.e = false;
        this.f = false;
        this.d = null;
    }

    public final void c(uq50 uq50Var) {
        this.f = true;
        int i = 3;
        this.l.b(e().subscribe(new p(new ri0(1, this, uq50Var), i), new bf2(new po5(1, bn40.a, bn40.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0, 0), i)));
    }

    public final boolean d() {
        return !this.j && !this.a.r() && this.g == null && this.i && this.c == LoopMode.NONE;
    }

    public final l e() {
        MusicTrack musicTrack;
        PlaybackLaunchMeta playbackLaunchMeta;
        hxa0 hxa0Var = this.a;
        com.vk.music.player.playback.e i = hxa0Var.i();
        String str = null;
        PlaybackLaunchMeta playbackLaunchMeta2 = i != null ? i.b : null;
        com.vk.music.player.playback.e i2 = hxa0Var.i();
        StartPlaySource startPlaySource = i2 != null ? i2.a : null;
        PlayerTrack C = hxa0Var.C() != null ? hxa0Var.C() : hxa0Var.b();
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = (C == null || (playbackLaunchMeta = C.c) == null) ? null : playbackLaunchMeta.b;
        boolean z = false;
        if (musicPlaybackLaunchContext != null && musicPlaybackLaunchContext.b.getInt("__META_AD_CATEGORY", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE) == 107) {
            z = true;
        }
        List<PlayerTrack> n = hxa0Var.n();
        List I0 = j5g.I0(50, n);
        ArrayList arrayList = new ArrayList(c5g.u(I0, 10));
        Iterator it = I0.iterator();
        while (it.hasNext()) {
            arrayList.add(((PlayerTrack) it.next()).b.Fb());
        }
        boolean z2 = startPlaySource instanceof StartPlayCatalogSource;
        String j = z2 ? AudioGetIdsBySourceSourceDto.CATALOG.j() : startPlaySource instanceof StartPlayEntitySource ? ((StartPlayEntitySource) startPlaySource).c.h() : startPlaySource instanceof StartPlayPlaylistSource ? AudioGetIdsBySourceSourceDto.PLAYLIST.j() : startPlaySource instanceof StartPlaySimilarTracksSource ? AudioGetIdsBySourceSourceDto.SIMILAR_TRACK.j() : startPlaySource instanceof StartPlaySingleTrackSource ? AudioGetIdsBySourceSourceDto.PLAYLIST.j() : startPlaySource instanceof StartPlayUserSource ? AudioGetIdsBySourceSourceDto.PLAYLIST.j() : z ? AudioGetIdsBySourceSourceDto.CATALOG.j() : AudioGetIdsBySourceSourceDto.PLAYLIST.j();
        if (startPlaySource instanceof StartPlaySingleTrackSource) {
            str = ((StartPlaySingleTrackSource) startPlaySource).e;
        } else if (z2) {
            str = ((StartPlayCatalogSource) startPlaySource).c;
        } else if (startPlaySource instanceof StartPlayPlaylistSource) {
            str = ((StartPlayPlaylistSource) startPlaySource).Bb();
        } else if (startPlaySource instanceof StartPlayUserSource) {
            str = efz.b(((StartPlayUserSource) startPlaySource).c.b, "_-1", new StringBuilder());
        } else if (startPlaySource instanceof StartPlayEntitySource) {
            StartPlayEntitySource startPlayEntitySource = (StartPlayEntitySource) startPlaySource;
            str = startPlayEntitySource.d;
            if (startPlayEntitySource.c == StartPlayEntitySource.PlayEntitySource.IM) {
                str = go9.b(BundleUtil.UNDERLINE_TAG, str);
            }
        } else if (z) {
            str = musicPlaybackLaunchContext.t();
        } else if (C != null && (musicTrack = C.b) != null) {
            str = musicTrack.Ib();
        }
        int i3 = 1;
        r rVar = new r(rsg0.w0(yfb.x(((hx4) this.k.getValue()).l(n.size(), j, str, arrayList))).l(new pj4(new e5(n, 6), 4)), new vj0(new s(i3, this, playbackLaunchMeta2), i3));
        asu0 asu0Var = asu0.a;
        return rVar.q(asu0Var.c()).m(asu0Var.d()).h(new m5(new l5(this, 6), 3));
    }
}
