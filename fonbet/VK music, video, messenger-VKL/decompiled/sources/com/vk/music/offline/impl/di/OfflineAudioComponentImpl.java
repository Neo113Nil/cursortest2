package com.vk.music.offline.impl.di;

import android.content.Context;
import androidx.media3.datasource.a;
import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.offline.c;
import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.music.offline.core.database.OfflineAudioDatabase;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ab3;
import xsna.abo;
import xsna.ap;
import xsna.b0g;
import xsna.b67;
import xsna.bp;
import xsna.bpn0;
import xsna.c8m;
import xsna.cp;
import xsna.ctp;
import xsna.cu2;
import xsna.df5;
import xsna.dp;
import xsna.dr6;
import xsna.du70;
import xsna.ef40;
import xsna.ehs;
import xsna.ep;
import xsna.fb8;
import xsna.fk80;
import xsna.fp;
import xsna.fpf0;
import xsna.fu2;
import xsna.g3j;
import xsna.g3o;
import xsna.g8m;
import xsna.gat;
import xsna.gb3;
import xsna.gb8;
import xsna.hb8;
import xsna.hpf0;
import xsna.hy6;
import xsna.ib3;
import xsna.ilb;
import xsna.iw00;
import xsna.jb3;
import xsna.jhg;
import xsna.ju70;
import xsna.k840;
import xsna.k850;
import xsna.kgp0;
import xsna.lq40;
import xsna.mal;
import xsna.mm20;
import xsna.mzc0;
import xsna.nwy;
import xsna.nxv;
import xsna.oxv;
import xsna.pu70;
import xsna.pwj0;
import xsna.pxv;
import xsna.qcy;
import xsna.qgp0;
import xsna.qh4;
import xsna.qxv;
import xsna.rbb0;
import xsna.rxv;
import xsna.sg40;
import xsna.sp40;
import xsna.t3a;
import xsna.ub60;
import xsna.ubb0;
import xsna.uy2;
import xsna.vb60;
import xsna.vbp;
import xsna.vi40;
import xsna.whb0;
import xsna.z56;

/* compiled from: OfflineAudioComponentImpl.kt */
/* loaded from: classes.dex */
public final class OfflineAudioComponentImpl implements OfflineAudioComponent {
    public static final /* synthetic */ qcy<Object>[] M;
    public final bpn0 A;
    public final nwy B;
    public final bpn0 C;
    public final bpn0 D;
    public final bpn0 E;
    public final bpn0 F;
    public final bpn0 G;
    public final bpn0 H;
    public final bpn0 I;
    public final bpn0 J;
    public final nwy K;
    public final nwy L;
    public final Context a;
    public final qgp0 b;
    public final ubb0 c;
    public final pu70 d;
    public final mal e;
    public final bpn0 f;
    public final bpn0 g;
    public final bpn0 h = new bpn0(new gat(this, 8));
    public final bpn0 i;
    public final bpn0 j;
    public final nwy k;
    public final nwy l;
    public final nwy m;
    public final nwy n;
    public final nwy o;
    public final nwy p;
    public final nwy q;
    public final nwy r;
    public final nwy s;
    public final nwy t;
    public final nwy u;
    public final bpn0 v;
    public final bpn0 w;
    public final bpn0 x;
    public final nwy y;
    public final nwy z;

    /* compiled from: OfflineAudioComponentImpl.kt */
    public static final class a implements c8m<OfflineAudioComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            Context context = ((AppContextDiComponent) g8mVar.a(fpf0.a(AppContextDiComponent.class))).a;
            OfflineAudioDatabase a = OfflineAudioDatabase.j.a(context);
            mm20 mm20Var = new mm20(a.E(), a.F());
            return new OfflineAudioComponentImpl(context, new qgp0(a.E(), a.F(), mm20Var), new ubb0(a.E(), a.F(), mm20Var), new pu70(context), new mal(g8mVar, 1), new bpn0(new ub60(g8mVar, 1)), new bpn0(new vb60(g8mVar, 1)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(OfflineAudioComponentImpl.class, "trackOfflineInteractor", "getTrackOfflineInteractor()Lcom/vk/music/offline/api/domain/interactor/TrackOfflineInteractor;", 0);
        hpf0 hpf0Var = fpf0.a;
        M = new qcy[]{propertyReference1Impl, fp.c(0, OfflineAudioComponentImpl.class, "playlistOfflineInteractor", "getPlaylistOfflineInteractor()Lcom/vk/music/offline/api/domain/interactor/PlaylistOfflineInteractor;", hpf0Var), ep.a(0, OfflineAudioComponentImpl.class, "storageTypeInteractor", "getStorageTypeInteractor()Lcom/vk/music/offline/api/domain/interactor/MusicStorageTypeInteractor;", hpf0Var), ep.a(0, OfflineAudioComponentImpl.class, "offlineHlsComponents", "getOfflineHlsComponents()Lcom/vk/music/offline/api/legacy/OfflineHlsComponents;", hpf0Var), ep.a(0, OfflineAudioComponentImpl.class, "musicOfflineManager", "getMusicOfflineManager()Lcom/vk/music/offline/api/legacy/MusicOfflineManager;", hpf0Var), ep.a(0, OfflineAudioComponentImpl.class, "clearStorageInteractor", "getClearStorageInteractor()Lcom/vk/music/offline/api/domain/interactor/MusicClearStorageInteractor;", hpf0Var), ep.a(0, OfflineAudioComponentImpl.class, "audioBookOfflineInteractor", "getAudioBookOfflineInteractor()Lcom/vk/music/offline/api/domain/interactor/AudioBookOfflineInteractor;", hpf0Var), ep.a(0, OfflineAudioComponentImpl.class, "chapterOfflineInteractor", "getChapterOfflineInteractor()Lcom/vk/music/offline/api/domain/interactor/ChapterOfflineInteractor;", hpf0Var), ep.a(0, OfflineAudioComponentImpl.class, "podcastOfflineInteractor", "getPodcastOfflineInteractor()Lcom/vk/music/offline/api/domain/interactor/PodcastOfflineInteractor;", hpf0Var), ep.a(0, OfflineAudioComponentImpl.class, "episodeOfflineInteractor", "getEpisodeOfflineInteractor()Lcom/vk/music/offline/api/domain/interactor/EpisodeOfflineInteractor;", hpf0Var), ep.a(0, OfflineAudioComponentImpl.class, "autoDownloadOfflineInteractor", "getAutoDownloadOfflineInteractor()Lcom/vk/music/offline/api/domain/interactor/AutoDownloadOfflineInteractor;", hpf0Var), ep.a(0, OfflineAudioComponentImpl.class, "contentPrefetchConfig", "getContentPrefetchConfig()Lcom/vk/music/player/cache/PrefetchConfig;", hpf0Var), ep.a(0, OfflineAudioComponentImpl.class, "contentAutoDownloadConfig", "getContentAutoDownloadConfig()Lcom/vk/music/offline/api/model/config/AutoDownloadConfig;", hpf0Var), ep.a(0, OfflineAudioComponentImpl.class, "autoDownloadEvictor", "getAutoDownloadEvictor()Lcom/vk/music/offline/api/domain/download/MusicAutoDownloadEvictor;", hpf0Var), ep.a(0, OfflineAudioComponentImpl.class, "musicDownloadsInProgressProvider", "getMusicDownloadsInProgressProvider()Lcom/vk/music/offline/impl/download/MusicDownloadsInProgressProviderImpl;", hpf0Var), ep.a(0, OfflineAudioComponentImpl.class, "downloadedEntitiesMarker", "getDownloadedEntitiesMarker()Lcom/vk/music/offline/api/legacy/DownloadedEntitiesMarker;", hpf0Var)};
    }

    public OfflineAudioComponentImpl(Context context, qgp0 qgp0Var, ubb0 ubb0Var, pu70 pu70Var, mal malVar, bpn0 bpn0Var, bpn0 bpn0Var2) {
        this.a = context;
        this.b = qgp0Var;
        this.c = ubb0Var;
        this.d = pu70Var;
        this.e = malVar;
        this.f = bpn0Var;
        this.g = bpn0Var2;
        int i = 10;
        this.i = new bpn0(new ab3(i));
        int i2 = 5;
        this.j = new bpn0(new rxv(this, i2));
        b0g b0gVar = b0g.a;
        b0g.a(new b0g.a() { // from class: xsna.et70
            @Override // xsna.b0g.a
            public final void a() {
                OfflineAudioComponentImpl offlineAudioComponentImpl = OfflineAudioComponentImpl.this;
                bpn0 bpn0Var3 = offlineAudioComponentImpl.j;
                qcy<Object>[] qcyVarArr = OfflineAudioComponentImpl.M;
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                if (com.vk.toggle.d.T(k840.a.i.b())) {
                    gm80 gm80Var = (gm80) bpn0Var3.getValue();
                    gm80Var.getClass();
                    asu0.a.getClass();
                    asu0.n().execute(new kyc(gm80Var, 6));
                } else {
                    gm80 gm80Var2 = (gm80) bpn0Var3.getValue();
                    gm80Var2.getClass();
                    asu0.a.getClass();
                    asu0.n().execute(new em80(gm80Var2, 0));
                }
                nwy nwyVar = offlineAudioComponentImpl.B;
                qcy<Object> qcyVar = OfflineAudioComponentImpl.M[13];
                ((wa40) nwyVar.c()).c();
            }
        });
        int i3 = 3;
        this.k = new nwy(new iw00(this, i3));
        this.l = new nwy(new uy2(this, i2));
        int i4 = 4;
        this.m = new nwy(new ap(this, i4));
        this.n = new nwy(new bp(this, i4));
        this.o = new nwy(new dp(this, 1));
        this.p = new nwy(new t3a(this, i3));
        this.q = new nwy(new gb3(this, i));
        this.r = new nwy(new cp(this, i4));
        int i5 = 6;
        this.s = new nwy(new z56(this, i5));
        this.t = new nwy(new b67(this, i5));
        this.u = new nwy(new jhg(this, i2));
        this.v = new bpn0(new g3j(this, i2));
        int i6 = 7;
        this.w = new bpn0(new fb8(this, i6));
        this.x = new bpn0(new gb8(this, i2));
        this.y = new nwy(new hb8(i5));
        this.z = new nwy(new cu2(i6));
        this.A = new bpn0(new ehs(this, i2));
        this.B = new nwy(new fu2(this, i5));
        this.C = new bpn0(new vbp(this, i2));
        this.D = new bpn0(new nxv(this, i4));
        this.E = new bpn0(new oxv(this, i6));
        this.F = new bpn0(new pxv(this, i2));
        this.G = new bpn0(new qxv(this, i4));
        this.H = new bpn0(new dr6(12));
        this.I = new bpn0(new g3o(this, i2));
        this.J = new bpn0(new hy6(this, 9));
        this.K = new nwy(new ib3(i));
        this.L = new nwy(new jb3(this, i5));
    }

    @Override // com.vk.music.offline.api.di.OfflineAudioComponent
    public final qh4 Ae() {
        qcy<Object> qcyVar = M[6];
        return (qh4) this.q.c();
    }

    public final a.b Df(a.InterfaceC0045a interfaceC0045a, boolean z) {
        a.b bVar = new a.b();
        bVar.a = ((sp40) this.E.getValue()).getCache();
        bVar.c = new ju70();
        bVar.e = interfaceC0045a;
        if (!z) {
            bVar.d(null);
        }
        return bVar;
    }

    public final sg40 Ef() {
        return (sg40) this.G.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final vi40 Ff() {
        qcy<Object> qcyVar = M[14];
        return (vi40) this.K.c();
    }

    @Override // com.vk.music.offline.api.di.OfflineAudioComponent
    /* renamed from: Gf, reason: merged with bridge method [inline-methods] */
    public final fk80 I() {
        return (fk80) this.x.getValue();
    }

    @Override // com.vk.music.offline.api.di.OfflineAudioComponent
    public final k850 Ib() {
        qcy<Object> qcyVar = M[2];
        return (k850) this.m.c();
    }

    @Override // com.vk.music.offline.api.di.OfflineAudioComponent
    public final lq40 Ja() {
        qcy<Object> qcyVar = M[4];
        return (lq40) this.o.c();
    }

    @Override // com.vk.music.offline.api.di.OfflineAudioComponent
    public final rbb0 K1() {
        qcy<Object> qcyVar = M[1];
        return (rbb0) this.l.c();
    }

    @Override // com.vk.music.offline.api.di.OfflineAudioComponent
    public final ef40 Na() {
        qcy<Object> qcyVar = M[5];
        return (ef40) this.p.c();
    }

    @Override // com.vk.music.offline.api.di.OfflineAudioComponent
    public final ilb O2() {
        qcy<Object> qcyVar = M[7];
        return (ilb) this.r.c();
    }

    @Override // com.vk.music.offline.api.di.OfflineAudioComponent
    public final c P6() {
        return (c) this.C.getValue();
    }

    @Override // com.vk.music.offline.api.di.OfflineAudioComponent
    public final du70 U8() {
        qcy<Object> qcyVar = M[3];
        return (du70) this.n.c();
    }

    @Override // com.vk.music.offline.api.di.OfflineAudioComponent
    public final ctp W8() {
        qcy<Object> qcyVar = M[9];
        return (ctp) this.t.c();
    }

    @Override // com.vk.music.offline.api.di.OfflineAudioComponent
    public final abo l8() {
        qcy<Object> qcyVar = M[15];
        return (abo) this.L.c();
    }

    @Override // com.vk.music.offline.api.di.OfflineAudioComponent
    public final kgp0 n7() {
        qcy<Object> qcyVar = M[0];
        return (kgp0) this.k.c();
    }

    @Override // com.vk.music.offline.api.di.OfflineAudioComponent
    public final df5 u3() {
        qcy<Object> qcyVar = M[10];
        return (df5) this.u.c();
    }

    @Override // com.vk.music.offline.api.di.OfflineAudioComponent
    public final com.vk.music.player.cache.a v0() {
        qcy<Object> qcyVar = M[11];
        return (com.vk.music.player.cache.a) this.y.c();
    }

    @Override // com.vk.music.offline.api.di.OfflineAudioComponent
    public final whb0 v7() {
        qcy<Object> qcyVar = M[8];
        return (whb0) this.s.c();
    }

    @Override // com.vk.music.offline.api.di.OfflineAudioComponent
    public final mzc0 x0() {
        return (mzc0) this.A.getValue();
    }
}
