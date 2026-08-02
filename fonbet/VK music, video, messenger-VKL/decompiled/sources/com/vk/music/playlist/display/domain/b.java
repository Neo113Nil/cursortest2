package com.vk.music.playlist.display.domain;

import com.google.zxing.pdf417.PDF417Common;
import com.ironsource.Ad;
import com.vk.api.generated.account.dto.AccountToggleDto;
import com.vk.api.generated.audio.dto.AudioAudioRawIdTrackedDto;
import com.vk.api.generated.audio.dto.AudioGetPlaylistByIdExtendedExtraFieldsDto;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicDynamicRestriction;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistLink;
import com.vk.dto.music.PlaylistPermissions;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.internal.api.GsonHolder;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.offline.api.exception.DownloadingMusicAtWrongNetworkStateException;
import com.vk.music.offline.api.exception.SubscriptionExpiredException;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayPlaylistSource;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.music.playlist.display.domain.LoadPlaylistTracksRequest;
import com.vk.music.playlist.display.domain.a;
import com.vk.music.playlist.display.domain.d;
import com.vk.music.playlist.display.domain.e;
import com.vk.music.playlist.display.domain.h;
import com.vk.music.playlist.framework.presentation.track.MusicTrackPlayState;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.music.stats.MusicActionTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.b;
import com.vk.toggle.features.MusicFeatures;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.internal.operators.observable.o1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import xsna.a020;
import xsna.abo;
import xsna.azt;
import xsna.b25;
import xsna.b60;
import xsna.bjk;
import xsna.c5g;
import xsna.c60;
import xsna.c8;
import xsna.cfz;
import xsna.dn;
import xsna.e43;
import xsna.epx;
import xsna.eqd;
import xsna.es00;
import xsna.f4z;
import xsna.ff3;
import xsna.fkq0;
import xsna.fq1;
import xsna.g84;
import xsna.g9o;
import xsna.gr;
import xsna.gs00;
import xsna.gz30;
import xsna.h6g;
import xsna.ha40;
import xsna.hqz;
import xsna.hx4;
import xsna.i4h;
import xsna.i50;
import xsna.ia;
import xsna.iqz;
import xsna.irt;
import xsna.itg0;
import xsna.iw3;
import xsna.ix4;
import xsna.izs;
import xsna.j0r;
import xsna.j50;
import xsna.j5g;
import xsna.jb5;
import xsna.jnj;
import xsna.jqz;
import xsna.jt4;
import xsna.k840;
import xsna.kbb0;
import xsna.kl6;
import xsna.kr;
import xsna.lab0;
import xsna.lfn;
import xsna.lq40;
import xsna.lqk0;
import xsna.lr;
import xsna.lz40;
import xsna.ma;
import xsna.mfn;
import xsna.mmf;
import xsna.mzp0;
import xsna.oc40;
import xsna.pb;
import xsna.pf1;
import xsna.pq40;
import xsna.qey;
import xsna.rsg0;
import xsna.s3q0;
import xsna.sf;
import xsna.sh6;
import xsna.sp;
import xsna.st0;
import xsna.tcn;
import xsna.tf;
import xsna.tfx;
import xsna.tr;
import xsna.tw4;
import xsna.u2b0;
import xsna.ur;
import xsna.ut6;
import xsna.uw4;
import xsna.ux00;
import xsna.vk40;
import xsna.w060;
import xsna.w150;
import xsna.w7;
import xsna.w71;
import xsna.w950;
import xsna.wga;
import xsna.whe;
import xsna.wk50;
import xsna.wnt;
import xsna.wx00;
import xsna.wyg;
import xsna.x150;
import xsna.x2b0;
import xsna.xb20;
import xsna.xga;
import xsna.xx1;
import xsna.y50;
import xsna.ye40;
import xsna.yf1;
import xsna.yfb;
import xsna.yfn;
import xsna.yl0;
import xsna.zl0;
import xsna.zqh;

/* compiled from: DisplayMusicPlaylistFeature.kt */
/* loaded from: classes3.dex */
public final class b extends wk50<i, yfn, com.vk.music.playlist.display.domain.a, e> {
    public final f f;
    public final u2b0 g;
    public final oc40 h;
    public final b25 i;
    public final abo j;
    public final g9o k;
    public final pq40 l;
    public final lz40 m;
    public final mzp0 n;
    public final w060 o;
    public final f4z p;
    public final f4z q;
    public final com.vk.music.playlist.display.data.a r;
    public final io.reactivex.rxjava3.disposables.g s;
    public final io.reactivex.rxjava3.disposables.g t;
    public final io.reactivex.rxjava3.disposables.g u;
    public final io.reactivex.rxjava3.disposables.g v;
    public final io.reactivex.rxjava3.disposables.g w;
    public final c x;
    public final w71 y;

    /* compiled from: DisplayMusicPlaylistFeature.kt */
    public static final class a implements izs {
        public final /* synthetic */ MusicPlaybackLaunchContext c;

        public a(MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
            this.c = musicPlaybackLaunchContext;
        }

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            ArrayList arrayList;
            tfx tfxVar;
            tfx tfxVar2;
            jqz jqzVar = (jqz) obj;
            e.k kVar = new e.k(jqzVar);
            b bVar = b.this;
            bVar.T(kVar);
            com.vk.music.playlist.display.data.a aVar = bVar.r;
            u2b0 u2b0Var = bVar.g;
            lz40 lz40Var = bVar.m;
            int i = 0;
            if (jqzVar instanceof iqz) {
                w950.p(lz40Var.e, null, null, null, 7);
                x2b0.c(lz40Var.f, null, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYLIST_FULL, 13);
                iqz iqzVar = (iqz) jqzVar;
                List<AudioAudioRawIdTrackedDto> list = iqzVar.e;
                Playlist playlist = iqzVar.a;
                bVar.T(new e.d(b.V(bVar, playlist, u2b0Var)));
                ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
                com.vk.mvi.core.internal.executors.a.b(new lfn(bVar, bVar));
                if (!list.isEmpty()) {
                    int size = list.size();
                    int i2 = 100 > size ? size : 100;
                    int i3 = playlist.O;
                    boolean d = jnj.d(i3);
                    MusicPlaybackLaunchContext musicPlaybackLaunchContext = this.c;
                    if (!d && jnj.e(i3)) {
                        musicPlaybackLaunchContext = musicPlaybackLaunchContext.Cb("kids_editorial_section");
                    }
                    MusicPlaybackLaunchContext musicPlaybackLaunchContext2 = musicPlaybackLaunchContext;
                    bVar.d0(new LoadPlaylistTracksRequest(iqzVar.a, 0, i2, list.subList(0, i2), LoadPlaylistTracksRequest.State.LOADING, musicPlaybackLaunchContext2));
                    String str = iqzVar.f;
                    int i4 = 1;
                    if (str != null) {
                        bVar.v.b(rsg0.T(yfb.x(wga.d(aVar.e, str, null, null, null, null, musicPlaybackLaunchContext2.Lb(), 30718))).F(new x150(new irt(4), i)).U(new iw3(new tw4(aVar.g, 10), 24)).subscribe(new kl6(new tcn(bVar, i4), 15)));
                    }
                    if (playlist.Eb() && MusicFeatures.AUDIO_ARTIST_ALBUM_BANNER.h()) {
                        String Lb = musicPlaybackLaunchContext2.Lb();
                        UserId userId = playlist.c;
                        int i5 = playlist.b;
                        String str2 = playlist.x;
                        xga xgaVar = aVar.e;
                        MusicFeatures.Companion.getClass();
                        ArrayList a = MusicFeatures.a.a();
                        ArrayList arrayList2 = new ArrayList(c5g.u(a, 10));
                        Iterator it = a.iterator();
                        while (it.hasNext()) {
                            b.d dVar = (b.d) it.next();
                            arrayList2.add(new AccountToggleDto(dVar.a, dVar.b.toString(), dVar.c.toString(), null, null, 24, null));
                        }
                        xgaVar.getClass();
                        tfx tfxVar3 = new tfx("catalog.getAudioPlaylist", new gr(6), new dn(7));
                        tfx.n(tfxVar3, "owner_id", userId, 0L, 0L, 12);
                        tfx.l(tfxVar3, "id", i5, 0, 0, 12);
                        if (Lb != null) {
                            arrayList = arrayList2;
                            tfxVar = tfxVar3;
                            tfx.o(tfxVar, "ref", Lb, 0, 0, 12);
                        } else {
                            arrayList = arrayList2;
                            tfxVar = tfxVar3;
                        }
                        tfxVar.j("need_blocks", true);
                        if (str2 != null) {
                            tfxVar2 = tfxVar;
                            tfx.o(tfxVar2, "access_key", str2, 0, 0, 12);
                        } else {
                            tfxVar2 = tfxVar;
                        }
                        tfx.o(tfxVar2, "applied_toggles", GsonHolder.a().toJson(arrayList), 0, 0, 12);
                        bVar.w.b(rsg0.T(yfb.x(tfxVar2)).F(new wnt(new ye40(2), 8)).U(new pb(new whe(aVar.h, 8), 26)).subscribe(new y50(new zqh(bVar, 10), 21)));
                    }
                }
            } else if (jqzVar instanceof hqz) {
                w950.p(lz40Var.e, null, null, null, 7);
                x2b0.c(lz40Var.f, null, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYLIST_FULL, 13);
                bVar.T(new e.d(b.V(bVar, ((hqz) jqzVar).a, u2b0Var)));
                ExecutorService executorService2 = com.vk.mvi.core.internal.executors.a.a;
                com.vk.mvi.core.internal.executors.a.b(new mfn(0, bVar, bVar));
            }
            mzp0 mzp0Var = bVar.n;
            if (mzp0Var != null) {
                mzp0Var.c(jqzVar instanceof hqz);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, a.c cVar, u2b0 u2b0Var, oc40 oc40Var, b25 b25Var, abo aboVar, lq40 lq40Var, lq40 lq40Var2, lz40 lz40Var, mzp0 mzp0Var) {
        super(cVar, fVar);
        w060 w060Var = new w060(b25Var);
        this.f = fVar;
        this.g = u2b0Var;
        this.h = oc40Var;
        this.i = b25Var;
        this.j = aboVar;
        this.k = lq40Var;
        this.l = lq40Var2;
        this.m = lz40Var;
        this.n = mzp0Var;
        this.o = w060Var;
        this.p = new f4z();
        this.q = new f4z();
        this.r = new com.vk.music.playlist.display.data.a(oc40Var, aboVar, lq40Var2);
        io.reactivex.rxjava3.disposables.g gVar = new io.reactivex.rxjava3.disposables.g();
        this.e.b(gVar);
        this.s = gVar;
        io.reactivex.rxjava3.disposables.g gVar2 = new io.reactivex.rxjava3.disposables.g();
        this.e.b(gVar2);
        this.t = gVar2;
        io.reactivex.rxjava3.disposables.g gVar3 = new io.reactivex.rxjava3.disposables.g();
        this.e.b(gVar3);
        this.u = gVar3;
        io.reactivex.rxjava3.disposables.g gVar4 = new io.reactivex.rxjava3.disposables.g();
        this.e.b(gVar4);
        this.v = gVar4;
        io.reactivex.rxjava3.disposables.g gVar5 = new io.reactivex.rxjava3.disposables.g();
        this.e.b(gVar5);
        this.w = gVar5;
        c cVar2 = new c(this);
        this.x = cVar2;
        w71 w71Var = new w71(500L, new jb5(this, 6), new eqd(this, 15));
        this.e.b(w71Var.d);
        this.y = w71Var;
        u2b0Var.P0(cVar2, true);
        this.e.b(oc40Var.a().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ia(new h6g(this, 13), 28)));
    }

    public static final e.c U(b bVar, yfn yfnVar) {
        MusicTrack f;
        MusicTrack f2;
        u2b0 u2b0Var = bVar.g;
        boolean b0 = bVar.b0(yfnVar);
        String str = null;
        if (b0 && u2b0Var.m0() == PlayState.PLAYING) {
            com.vk.music.player.f H = u2b0Var.H();
            if (H != null && (f2 = H.f()) != null) {
                str = f2.Hb();
            }
            return new e.c(str, true);
        }
        if (!b0 || u2b0Var.m0() != PlayState.PAUSED) {
            if (yfnVar.k != MusicTrackPlayState.REQUESTED) {
                return new e.c(null, false);
            }
            return null;
        }
        com.vk.music.player.f H2 = u2b0Var.H();
        if (H2 != null && (f = H2.f()) != null) {
            str = f.Hb();
        }
        return new e.c(str, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0051, code lost:
    
        if ((r2 != null ? r2.e : false) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean V(b bVar, Playlist playlist, u2b0 u2b0Var) {
        boolean z;
        int i = playlist.v;
        if ((!sp.f(u2b0Var) || playlist.Fb() || i <= 0) && !xx1.e(xx1.m(playlist)) && !xx1.b(playlist) && !xx1.d(playlist) && !xx1.t(playlist) && !xx1.s(playlist)) {
            if (!playlist.Fb()) {
                if (i <= 0 || xx1.x(playlist) || xx1.u(playlist)) {
                    PlaylistPermissions playlistPermissions = playlist.B;
                }
            }
            z = false;
            return (z || jnj.f(playlist.O)) ? false : true;
        }
        z = true;
        if (z) {
        }
    }

    public static final boolean W(b bVar, Playlist playlist, Playlist playlist2) {
        PlaylistLink playlistLink;
        PlaylistLink playlistLink2;
        Boolean bool;
        if ((!epx.f(playlist.c, playlist2.c) || playlist.b != playlist2.b) && (((playlistLink = playlist.f) == null || !epx.f(playlistLink.c, playlist2.c) || playlistLink.b != playlist2.b) && ((playlistLink2 = playlist2.f) == null || !epx.f(playlistLink2.c, playlist.c) || playlistLink2.b != playlist.b))) {
            PlaylistLink playlistLink3 = playlist.f;
            PlaylistLink playlistLink4 = playlist2.f;
            if (playlistLink3 == null || playlistLink4 == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(epx.f(playlistLink3.c, playlistLink4.c) && playlistLink3.b == playlistLink4.b);
            }
            if (!epx.f(bool, Boolean.TRUE)) {
                return false;
            }
        }
        return true;
    }

    public static StartPlayPlaylistSource X(Playlist playlist) {
        String str = playlist.x;
        String str2 = playlist.h;
        if (str2 == null) {
            str2 = "";
        }
        return new StartPlayPlaylistSource(new PlaySourceMeta.PlaylistPlaySourceMeta(str2, playlist.Eb(), playlist.c, playlist.b, playlist.O, playlist.z), null, null, str, 6, null);
    }

    @Override // xsna.wk50
    public final void N(yfn yfnVar, com.vk.music.playlist.display.domain.a aVar) {
        PlaylistPermissions playlistPermissions;
        PlaylistPermissions playlistPermissions2;
        UserId userId;
        yfn yfnVar2 = yfnVar;
        com.vk.music.playlist.display.domain.a aVar2 = aVar;
        LoadPlaylistTracksRequest loadPlaylistTracksRequest = yfnVar2.s;
        Map<String, MusicTrack> map = yfnVar2.n;
        Playlist playlist = yfnVar2.c;
        boolean z = aVar2 instanceof a.c;
        u2b0 u2b0Var = this.g;
        if (z) {
            a.c cVar = (a.c) aVar2;
            boolean z2 = cVar instanceof a.c.b;
            jqz.b bVar = jqz.b.a;
            if (z2) {
                Playlist playlist2 = ((a.c.b) cVar).b;
                T(new e.m(playlist2));
                T(new e.k(bVar));
                c0(playlist2.c, playlist2.b, playlist2.x, Z(yfnVar2));
            } else if (cVar instanceof a.c.C1342a) {
                T(new e.k(bVar));
                a.c.C1342a c1342a = (a.c.C1342a) cVar;
                c0(c1342a.b, c1342a.c, c1342a.d, Z(yfnVar2));
            } else {
                if (!epx.f(cVar, a.c.C1343c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                T(new e.k(jqz.c.a));
                c0(playlist.c, playlist.b, playlist.x, Z(yfnVar2));
            }
            T(new e.f(u2b0Var.U0()));
            return;
        }
        boolean z3 = aVar2 instanceof a.b;
        lz40 lz40Var = this.m;
        f4z f4zVar = this.p;
        if (!z3) {
            if (aVar2 instanceof a.e) {
                a.e eVar = (a.e) aVar2;
                if (eVar instanceof a.e.c) {
                    f4zVar.b(new d.o(((a.e.c) eVar).b));
                    return;
                } else if (epx.f(eVar, a.e.b.b)) {
                    f4zVar.b(d.h.a);
                    return;
                } else {
                    if (!epx.f(eVar, a.e.C1345a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f4zVar.b(d.e.a);
                    return;
                }
            }
            if (!(aVar2 instanceof a.f)) {
                if (aVar2 instanceof a.d) {
                    a.d dVar = (a.d) aVar2;
                    if (!(dVar instanceof a.d.C1344a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a.d.C1344a c1344a = (a.d.C1344a) dVar;
                    f4zVar.b(new d.m(c1344a.b, c1344a.c));
                    return;
                }
                if (!(aVar2 instanceof a.InterfaceC1338a)) {
                    throw new NoWhenBranchMatchedException();
                }
                a.InterfaceC1338a interfaceC1338a = (a.InterfaceC1338a) aVar2;
                if (epx.f(interfaceC1338a, a.InterfaceC1338a.b.b)) {
                    f0(yfnVar2);
                    return;
                } else {
                    if (!epx.f(interfaceC1338a, a.InterfaceC1338a.C1339a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Y(yfnVar2);
                    return;
                }
            }
            a.f fVar = (a.f) aVar2;
            if (fVar instanceof a.f.c) {
                MusicTrack musicTrack = map.get(((a.f.c) fVar).b);
                if (musicTrack != null) {
                    f4zVar.b(new d.n(musicTrack, playlist, Z(yfnVar2)));
                    return;
                }
                return;
            }
            if (fVar instanceof a.f.e) {
                String str = ((a.f.e) fVar).b;
                MusicTrack musicTrack2 = map.get(str);
                boolean f = epx.f(yfnVar2.l, str);
                String str2 = musicTrack2 != null ? musicTrack2.y : null;
                lz40Var.getClass();
                MusicActionTracker.Action action = f ? MusicActionTracker.Action.Pause : MusicActionTracker.Action.Play;
                MusicActionTracker musicActionTracker = lz40Var.b;
                if (musicActionTracker != null) {
                    musicActionTracker.a(action, new MusicActionTracker.a.b(str2));
                }
                lz40Var.a.f0(Ad.d);
                NewsEntry newsEntry = lz40Var.d;
                if (newsEntry instanceof PromoPost) {
                    lz40Var.c.r1(newsEntry);
                }
                StartPlayPlaylistSource X = X(playlist);
                List<lab0.a> list = yfnVar2.m;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    MusicTrack musicTrack3 = map.get(((lab0.a) it.next()).a);
                    if (musicTrack3 != null) {
                        arrayList.add(musicTrack3);
                    }
                }
                u2b0Var.N0(new lqk0(X, musicTrack2, arrayList, Z(yfnVar2), 0, (ShuffleMode) null, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 880));
                return;
            }
            if (fVar instanceof a.f.b) {
                MusicTrack musicTrack4 = map.get(((a.f.b) fVar).b);
                if (musicTrack4 != null) {
                    f4zVar.b(new d.j(musicTrack4, Z(yfnVar2)));
                    return;
                }
                return;
            }
            if (!(fVar instanceof a.f.C1346a)) {
                if (!(fVar instanceof a.f.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (loadPlaylistTracksRequest.e == LoadPlaylistTracksRequest.State.ERROR) {
                    d0(loadPlaylistTracksRequest);
                    return;
                }
                return;
            }
            List<AudioAudioRawIdTrackedDto> list2 = yfnVar2.j;
            if (loadPlaylistTracksRequest.e != LoadPlaylistTracksRequest.State.COMPLETED || loadPlaylistTracksRequest.c >= list2.size()) {
                return;
            }
            int i = loadPlaylistTracksRequest.c;
            int i2 = i + 100;
            int size = list2.size();
            int i3 = i2 > size ? size : i2;
            MusicPlaybackLaunchContext Z = Z(yfnVar2);
            int i4 = playlist.O;
            if (!jnj.d(i4) && jnj.e(i4)) {
                Z = Z.Cb("kids_editorial_section");
            }
            d0(new LoadPlaylistTracksRequest(yfnVar2.c, i, i3, list2.subList(i, i3), LoadPlaylistTracksRequest.State.LOADING, Z));
            return;
        }
        a.b bVar2 = (a.b) aVar2;
        if (epx.f(bVar2, a.b.d.b)) {
            f4zVar.b(d.a.a);
            return;
        }
        if (epx.f(bVar2, a.b.e.b)) {
            f4zVar.b(new d.k(playlist, Z(yfnVar2)));
            return;
        }
        if (epx.f(bVar2, a.b.c.b)) {
            kbb0 kbb0Var = yfnVar2.z;
            if (!(kbb0Var instanceof kbb0.f)) {
                if (kbb0Var instanceof kbb0.a) {
                    f4zVar.b(new d.f(playlist, Z(yfnVar2)));
                    MusicActionTracker musicActionTracker2 = lz40Var.b;
                    if (musicActionTracker2 != null) {
                        musicActionTracker2.a(MusicActionTracker.Action.GoToArtist, MusicActionTracker.a.C1355a.a);
                        return;
                    }
                    return;
                }
                return;
            }
            if (jnj.d(playlist.O)) {
                f4zVar.b(d.q.a);
                return;
            }
            PlaylistLink playlistLink = playlist.f;
            if (playlistLink == null || (userId = playlistLink.c) == null) {
                userId = playlist.c;
            }
            f4zVar.b(new d.l(userId));
            MusicActionTracker musicActionTracker3 = lz40Var.b;
            if (musicActionTracker3 != null) {
                musicActionTracker3.a(MusicActionTracker.Action.GoToArtist, MusicActionTracker.a.C1355a.a);
                return;
            }
            return;
        }
        boolean f2 = epx.f(bVar2, a.b.i.b);
        e.g gVar = e.g.b;
        if (f2) {
            if (b0(yfnVar2)) {
                u2b0Var.w1(new PlaybackActionMeta(6, 0L, 2, null));
                return;
            }
            if ((u2b0Var.m0() == PlayState.PAUSED || u2b0Var.m0() == PlayState.PLAYING) && !u2b0Var.I1()) {
                return;
            }
            T(gVar);
            e0(yfnVar2, ShuffleMode.SHUFFLE_AUTO, PlayRequestTrigger.FAST_PLAY_TRACK_LIST);
            MusicActionTracker musicActionTracker4 = lz40Var.b;
            if (musicActionTracker4 != null) {
                musicActionTracker4.a(MusicActionTracker.Action.PlayAll, MusicActionTracker.a.C1355a.a);
            }
            lz40Var.a.f0("all");
            NewsEntry newsEntry2 = lz40Var.d;
            if (newsEntry2 instanceof PromoPost) {
                lz40Var.c.r1(newsEntry2);
                return;
            }
            return;
        }
        if (epx.f(bVar2, a.b.j.b)) {
            if (b0(yfnVar2)) {
                u2b0Var.o();
                return;
            }
            if ((u2b0Var.m0() == PlayState.PAUSED || u2b0Var.m0() == PlayState.PLAYING) && !u2b0Var.I1()) {
                return;
            }
            T(gVar);
            e0(yfnVar2, ShuffleMode.SHUFFLE_ON, PlayRequestTrigger.SHUFFLE_BUTTON);
            MusicActionTracker musicActionTracker5 = lz40Var.b;
            if (musicActionTracker5 != null) {
                musicActionTracker5.a(MusicActionTracker.Action.MixAllTracks, MusicActionTracker.a.C1355a.a);
            }
            lz40Var.a.f0("shuffle");
            NewsEntry newsEntry3 = lz40Var.d;
            if (newsEntry3 instanceof PromoPost) {
                lz40Var.c.r1(newsEntry3);
                return;
            }
            return;
        }
        boolean f3 = epx.f(bVar2, a.b.g.b);
        f4z f4zVar2 = this.q;
        if (!f3) {
            if (epx.f(bVar2, a.b.h.b)) {
                if (!epx.f(playlist.H, DownloadingState.NotLoaded.b)) {
                    f4zVar.b(new d.g(playlist, Z(yfnVar2)));
                    return;
                }
                MusicActionTracker musicActionTracker6 = lz40Var.b;
                if (musicActionTracker6 != null) {
                    musicActionTracker6.a(MusicActionTracker.Action.Download, MusicActionTracker.a.C1355a.a);
                }
                com.vk.core.utils.newtork.b.a.getClass();
                if (com.vk.core.utils.newtork.b.d()) {
                    Y(yfnVar2);
                    return;
                } else {
                    f4zVar2.b(h.a.b.b);
                    return;
                }
            }
            if (epx.f(bVar2, a.b.C1340a.b)) {
                f4zVar.b(new d.i(playlist));
                return;
            }
            if (epx.f(bVar2, a.b.C1341b.b)) {
                MusicDynamicRestriction musicDynamicRestriction = playlist.z;
                if (musicDynamicRestriction != null) {
                    f4zVar.b(new d.r(musicDynamicRestriction));
                    return;
                }
                return;
            }
            if (!epx.f(bVar2, a.b.f.b)) {
                throw new NoWhenBranchMatchedException();
            }
            com.vk.core.utils.newtork.b.a.getClass();
            if (!com.vk.core.utils.newtork.b.d()) {
                f4zVar2.b(h.a.b.b);
                return;
            }
            String str3 = playlist.Eb() ? "album_mix" : "playlist_mix";
            String Ib = playlist.Ib();
            String str4 = playlist.h;
            if (str4 == null) {
                str4 = "";
            }
            u2b0Var.N0(new lqk0(new StartPlayVkMixSource("", "", str3, false, str4, null, Ib, null, null, null, PDF417Common.MAX_CODEWORDS_IN_BARCODE, null), (MusicTrack) null, (List) null, Z(yfnVar2), 0, (ShuffleMode) null, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 886));
            return;
        }
        if (xx1.v(playlist)) {
            PlaylistPermissions playlistPermissions3 = playlist.B;
            if ((playlistPermissions3 != null ? playlistPermissions3.c : false) || playlist.S4()) {
                f4zVar.b(new d.C1347d(playlist));
                return;
            } else {
                f0(yfnVar2);
                return;
            }
        }
        boolean z4 = (jnj.f(playlist.O) || (playlistPermissions2 = playlist.B) == null) ? false : playlistPermissions2.d;
        io.reactivex.rxjava3.disposables.g gVar2 = this.u;
        com.vk.music.playlist.display.data.a aVar3 = this.r;
        if (z4) {
            String t = Z(yfnVar2).t();
            com.vk.core.utils.newtork.b.a.getClass();
            if (!com.vk.core.utils.newtork.b.d()) {
                f4zVar2.b(h.a.b.b);
                return;
            }
            gVar2.b(itg0.m(aVar3.a(playlist, j5g.O0(map.values()), t).F(new st0(new i4h(yfnVar2, 13), 15))));
            MusicActionTracker musicActionTracker7 = lz40Var.b;
            if (musicActionTracker7 != null) {
                musicActionTracker7.a(MusicActionTracker.Action.AddToMe, MusicActionTracker.a.C1355a.a);
            }
            NewsEntry newsEntry4 = lz40Var.d;
            if (newsEntry4 instanceof PromoPost) {
                lz40Var.c.u0(newsEntry4);
                return;
            }
            return;
        }
        if (!jnj.f(playlist.O) && (playlistPermissions = playlist.B) != null) {
            r3 = playlistPermissions.h;
        }
        if (r3) {
            ix4 ix4Var = aVar3.d;
            UserId userId2 = playlist.c;
            int i5 = playlist.b;
            ix4Var.getClass();
            tfx tfxVar = new tfx("audio.savePlaylistAsCopy", new tr(4), new ur(4));
            tfx.n(tfxVar, "owner_id", userId2, 0L, 0L, 12);
            tfx.l(tfxVar, "playlist_id", i5, 0, 0, 12);
            gVar2.b(rsg0.T(yfb.x(tfxVar)).F(new vk40(new azt(12), 1)).U(new cfz(new uw4(jt4.a, 12), 6)).subscribe(new tf(new bjk(this, 2), 22)));
        }
    }

    public final void Y(yfn yfnVar) {
        boolean c = k840.a.i.c();
        d.p pVar = d.p.a;
        f4z f4zVar = this.p;
        if (!c) {
            f4zVar.b(pVar);
            return;
        }
        boolean I = k840.a.d().I();
        d.b bVar = d.b.a;
        if (!I) {
            f4zVar.b(bVar);
            return;
        }
        Playlist playlist = yfnVar.c;
        if (xx1.w(playlist) || xx1.v(xx1.m(playlist))) {
            try {
                this.k.a0(xx1.k(playlist));
                return;
            } catch (DownloadingMusicAtWrongNetworkStateException unused) {
                f4zVar.b(bVar);
                return;
            } catch (SubscriptionExpiredException unused2) {
                f4zVar.b(pVar);
                return;
            }
        }
        if (!k840.a.d().Z()) {
            f4zVar.b(new d.c(playlist));
            return;
        }
        q<PlaylistLink> a2 = this.r.a(playlist, j5g.O0(yfnVar.n.values()), Z(yfnVar).t());
        pf1 pf1Var = new pf1(new g84(12, this, yfnVar), 16);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.u.b(itg0.m(a2.E(pf1Var, lVar, kVar, kVar)));
        lz40 lz40Var = this.m;
        MusicActionTracker musicActionTracker = lz40Var.b;
        if (musicActionTracker != null) {
            musicActionTracker.a(MusicActionTracker.Action.AddToMe, MusicActionTracker.a.C1355a.a);
        }
        NewsEntry newsEntry = lz40Var.d;
        if (newsEntry instanceof PromoPost) {
            lz40Var.c.u0(newsEntry);
        }
    }

    public final MusicPlaybackLaunchContext Z(yfn yfnVar) {
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = yfnVar.q;
        Playlist playlist = yfnVar.c;
        if (musicPlaybackLaunchContext == null) {
            musicPlaybackLaunchContext = this.i.a(playlist.c) ? MusicPlaybackLaunchContext.f : fkq0.b(playlist.c) ? MusicPlaybackLaunchContext.m : MusicPlaybackLaunchContext.j;
        }
        return musicPlaybackLaunchContext.Db(playlist).Cb(yfnVar.e);
    }

    public final boolean b0(yfn yfnVar) {
        Object obj;
        Iterator<T> it = yfnVar.j.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String p = a020.p((AudioAudioRawIdTrackedDto) next);
            MusicTrack b = this.g.b();
            if (epx.f(p, b != null ? b.Hb() : null)) {
                obj = next;
                break;
            }
        }
        return obj != null;
    }

    public final void c0(UserId userId, int i, String str, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        this.t.b(null);
        mzp0 mzp0Var = this.n;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        com.vk.music.playlist.display.data.a aVar = this.r;
        m1 T = rsg0.T(yfb.x(aVar.d.p(userId, i, e43.l(AudioGetPlaylistByIdExtendedExtraFieldsDto.AUDIO_IDS, AudioGetPlaylistByIdExtendedExtraFieldsDto.OWNER, AudioGetPlaylistByIdExtendedExtraFieldsDto.EXTRA_RECOMMENDATIONS_SECTION_ID, AudioGetPlaylistByIdExtendedExtraFieldsDto.ALBUM_PARTS_FIRST_AUDIOS), str, 0, musicPlaybackLaunchContext.Lb())));
        int i2 = 4;
        o1 o1Var = new o1(T.F(new ux00(new qey(13), i2)).U(new xb20(new es00(aVar, 8), i2)), new w7(new w150(aVar, i, userId), 26));
        a aVar2 = new a(musicPlaybackLaunchContext);
        int i3 = 24;
        this.s.b(o1Var.subscribe(new b60(aVar2, i3), new c60(new mmf(this, i3), 24)));
    }

    public final void d0(LoadPlaylistTracksRequest loadPlaylistTracksRequest) {
        io.reactivex.rxjava3.disposables.g gVar = this.t;
        io.reactivex.rxjava3.disposables.c a2 = gVar.a();
        if (a2 == null || a2.h()) {
            T(new e.l(LoadPlaylistTracksRequest.a(loadPlaylistTracksRequest, 0, LoadPlaylistTracksRequest.State.LOADING, 47)));
            Playlist playlist = loadPlaylistTracksRequest.a;
            List<AudioAudioRawIdTrackedDto> list = loadPlaylistTracksRequest.d;
            MusicPlaybackLaunchContext musicPlaybackLaunchContext = loadPlaylistTracksRequest.f;
            com.vk.music.playlist.display.data.a aVar = this.r;
            ix4 ix4Var = aVar.d;
            List<AudioAudioRawIdTrackedDto> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AudioAudioRawIdTrackedDto) it.next()).d());
            }
            gVar.b(rsg0.T(yfb.x(hx4.o(ix4Var, arrayList, musicPlaybackLaunchContext.Lb(), 2))).F(new wx00(new ha40(2), 3)).U(new fq1(new yf1(list, aVar, playlist), 26)).subscribe(new sh6(new ma(10, this, loadPlaylistTracksRequest), 19), new sf(new ut6(13, this, loadPlaylistTracksRequest), 22)));
        }
    }

    public final void e0(yfn yfnVar, ShuffleMode shuffleMode, PlayRequestTrigger playRequestTrigger) {
        StartPlayPlaylistSource X = X(yfnVar.c);
        List<lab0.a> list = yfnVar.m;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            MusicTrack musicTrack = yfnVar.n.get(((lab0.a) it.next()).a);
            if (musicTrack != null) {
                arrayList.add(musicTrack);
            }
        }
        this.g.N0(new lqk0(X, (MusicTrack) null, arrayList, Z(yfnVar), 0, shuffleMode, playRequestTrigger, (AdsAudioPixelsContainer) null, 0L, 818));
    }

    public final void f0(yfn yfnVar) {
        q T;
        q U;
        com.vk.core.utils.newtork.b.a.getClass();
        if (!com.vk.core.utils.newtork.b.d()) {
            this.q.b(h.a.b.b);
            return;
        }
        Playlist k = xx1.k(yfnVar.c);
        Playlist playlist = yfnVar.c;
        List O0 = j5g.O0(yfnVar.n.values());
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = yfnVar.q;
        String t = musicPlaybackLaunchContext != null ? musicPlaybackLaunchContext.t() : null;
        com.vk.music.playlist.display.data.a aVar = this.r;
        aVar.getClass();
        PlaylistLink playlistLink = playlist.g;
        if (playlistLink == null) {
            U = q.T(playlist);
        } else {
            UserId userId = playlistLink.c;
            int i = playlistLink.b;
            if (jnj.h(playlist.O)) {
                T = rsg0.T(yfb.x(aVar.f.f(i, userId, t))).U(new gs00(new gz30(1), 4));
            } else {
                aVar.d.getClass();
                tfx tfxVar = new tfx("audio.deletePlaylist", new kr(6), new lr(7));
                tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
                tfx.l(tfxVar, "playlist_id", i, 0, 0, 8);
                T = rsg0.T(yfb.x(tfxVar));
            }
            U = T.F(new ff3(new j0r(13), 24)).U(new c8(new wyg(playlist, O0, aVar, 3), 23));
        }
        this.u.b(U.subscribe(new zl0(new yl0(7, this, k), 24), new j50(new i50(yfnVar, 25), 21)));
        MusicActionTracker musicActionTracker = this.m.b;
        if (musicActionTracker != null) {
            musicActionTracker.a(MusicActionTracker.Action.RemoveFromMe, MusicActionTracker.a.C1355a.a);
        }
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        this.g.n0(this.x);
    }
}
