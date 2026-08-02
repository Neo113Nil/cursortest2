package com.vk.video.ui.discovery.minimizable.related_videos;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vk.dto.video.VideoListWithTotalCount;
import com.vk.dto.video.VideoSeason;
import com.vk.libvideo.api.di.VideoPlaylistReversionComponent;
import com.vk.libvideo.video.queue.api.model.related.VideoRelatedVideosOrder;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.q;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSource;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSourceArgs;
import com.vk.video.ui.discovery.minimizable.related_videos.c;
import com.vk.video.ui.discovery.minimizable.related_videos.data.VideoRelatedVideosPagingType;
import com.vk.video.ui.discovery.minimizable.related_videos.h;
import com.vk.video.ui.discovery.minimizable.related_videos.m;
import com.vk.video.ui.discovery.minimizable.related_videos.o;
import io.reactivex.rxjava3.core.b0;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.b1;
import io.reactivex.rxjava3.internal.operators.single.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.a76;
import xsna.ahn;
import xsna.b4u;
import xsna.b8e0;
import xsna.be50;
import xsna.bjm0;
import xsna.bwr0;
import xsna.c5g;
import xsna.cef;
import xsna.d7b0;
import xsna.dib;
import xsna.dz2;
import xsna.epx;
import xsna.f0o0;
import xsna.fnz;
import xsna.g7;
import xsna.gcc0;
import xsna.gub0;
import xsna.hfm0;
import xsna.hg1;
import xsna.hkp;
import xsna.hmj0;
import xsna.hsc0;
import xsna.hus0;
import xsna.izs;
import xsna.j3z;
import xsna.j5g;
import xsna.je40;
import xsna.k9x;
import xsna.kcm0;
import xsna.ksb0;
import xsna.ljs;
import xsna.m1t0;
import xsna.m5t0;
import xsna.mct0;
import xsna.mqz;
import xsna.n6;
import xsna.n9e;
import xsna.ngs0;
import xsna.nz10;
import xsna.ogs0;
import xsna.pgs0;
import xsna.pme0;
import xsna.pu50;
import xsna.q5t0;
import xsna.q9f0;
import xsna.qgs0;
import xsna.qs6;
import xsna.r820;
import xsna.rbt0;
import xsna.rgo0;
import xsna.rsg0;
import xsna.rva;
import xsna.s3q0;
import xsna.sbq;
import xsna.sd9;
import xsna.sdy;
import xsna.tfx;
import xsna.ti30;
import xsna.uft0;
import xsna.uyn0;
import xsna.v100;
import xsna.v3l;
import xsna.v5b;
import xsna.v95;
import xsna.vgs0;
import xsna.vii0;
import xsna.vqp;
import xsna.wcl0;
import xsna.whe;
import xsna.wjs0;
import xsna.wlw;
import xsna.wvq0;
import xsna.wx30;
import xsna.xa9;
import xsna.xx40;
import xsna.y730;
import xsna.yfb;
import xsna.z0r0;

/* compiled from: VideoDiscoveryRelatedVideosStateLoader.kt */
/* loaded from: classes7.dex */
public final class k {
    public final hkp a;
    public final m5t0 b;
    public final VideoPlaylistReversionComponent c;
    public final boolean d;
    public final hus0 e;
    public final hsc0 f;
    public io.reactivex.rxjava3.disposables.c g;
    public final d h;
    public final e i;
    public final c j;
    public final a k;

    public k(m1t0 m1t0Var, sdy sdyVar, hkp hkpVar, m5t0 m5t0Var, VideoPlaylistReversionComponent videoPlaylistReversionComponent, boolean z, hus0 hus0Var, hsc0 hsc0Var) {
        this.a = hkpVar;
        this.b = m5t0Var;
        this.c = videoPlaylistReversionComponent;
        this.d = z;
        this.e = hus0Var;
        this.f = hsc0Var;
        d dVar = new d(m5t0Var);
        this.h = dVar;
        int i = 0;
        this.i = new e(m5t0Var, dVar, z, new whe(1, this, k.class, "updateState", "updateState(Lcom/vk/video/ui/discovery/minimizable/related_videos/VideoDiscoveryRelatedVideosState;)V", i, 15), hus0Var);
        this.j = new c(dVar, m5t0Var, z, new xa9(1, this, k.class, "updateState", "updateState(Lcom/vk/video/ui/discovery/minimizable/related_videos/VideoDiscoveryRelatedVideosState;)V", i, 14), hus0Var);
        this.k = new a(hus0Var);
    }

    public static h.a i(h.a aVar, VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs) {
        o oVar = aVar.g;
        if (!(oVar instanceof o.a)) {
            oVar = null;
        }
        if (oVar == null) {
            return aVar;
        }
        int i = videoDiscoveryRelatedVideosSourceArgs.c;
        VideoFile videoFile = videoDiscoveryRelatedVideosSourceArgs.b;
        List<mct0> list = ((o.a) oVar).a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (mct0 mct0Var : list) {
            if (mct0Var.a == i) {
                List<rbt0> list2 = mct0Var.e;
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                for (rbt0 rbt0Var : list2) {
                    List<VideoFile> list3 = rbt0Var.d;
                    ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
                    for (VideoFile videoFile2 : list3) {
                        if (epx.f(videoFile2.a1(), videoFile.a1())) {
                            videoFile2 = videoFile;
                        }
                        arrayList3.add(videoFile2);
                    }
                    arrayList2.add(new rbt0(rbt0Var.a, rbt0Var.b, rbt0Var.c, arrayList3, rbt0Var.e, rbt0Var.f));
                }
                mct0Var = mct0.a(mct0Var, null, 0, arrayList2, null, null, 111);
            }
            arrayList.add(mct0Var);
        }
        return h.a.h(aVar, null, null, 0, null, null, null, new o.a(arrayList), null, null, false, false, false, 4031);
    }

    public final void a(q qVar, VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs, boolean z) {
        o oVar;
        Integer num;
        VideoFile g;
        VideoFile d;
        VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs2 = qVar.c;
        h hVar = qVar.s;
        if (epx.f(videoDiscoveryRelatedVideosSourceArgs2, videoDiscoveryRelatedVideosSourceArgs)) {
            return;
        }
        this.f.invoke(videoDiscoveryRelatedVideosSourceArgs);
        VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs3 = qVar.c;
        if (!(videoDiscoveryRelatedVideosSourceArgs3 instanceof VideoDiscoveryRelatedVideosSourceArgs.Playlist) || !(videoDiscoveryRelatedVideosSourceArgs instanceof VideoDiscoveryRelatedVideosSourceArgs.Playlist)) {
            if (!(videoDiscoveryRelatedVideosSourceArgs3 instanceof VideoDiscoveryRelatedVideosSourceArgs.TemporaryPlaylist) || !(videoDiscoveryRelatedVideosSourceArgs instanceof VideoDiscoveryRelatedVideosSourceArgs.TemporaryPlaylist)) {
                if (videoDiscoveryRelatedVideosSourceArgs instanceof VideoDiscoveryRelatedVideosSourceArgs.Playlist) {
                    g((VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs);
                    return;
                } else if (!(videoDiscoveryRelatedVideosSourceArgs instanceof VideoDiscoveryRelatedVideosSourceArgs.TemporaryPlaylist)) {
                    this.e.invoke(c.s0.C1981c.b);
                    return;
                } else {
                    l(h.c.a);
                    b((VideoDiscoveryRelatedVideosSourceArgs.TemporaryPlaylist) videoDiscoveryRelatedVideosSourceArgs);
                    return;
                }
            }
            VideoDiscoveryRelatedVideosSourceArgs.TemporaryPlaylist temporaryPlaylist = (VideoDiscoveryRelatedVideosSourceArgs.TemporaryPlaylist) videoDiscoveryRelatedVideosSourceArgs3;
            VideoDiscoveryRelatedVideosSourceArgs.TemporaryPlaylist temporaryPlaylist2 = (VideoDiscoveryRelatedVideosSourceArgs.TemporaryPlaylist) videoDiscoveryRelatedVideosSourceArgs;
            int i = temporaryPlaylist.c;
            int i2 = temporaryPlaylist2.c;
            VideoFile videoFile = temporaryPlaylist2.b;
            if (i != i2 || !epx.f(temporaryPlaylist.g, temporaryPlaylist2.g)) {
                l(h.c.a);
                b(temporaryPlaylist2);
                return;
            } else {
                if (epx.f(temporaryPlaylist.b.a1(), videoFile.a1())) {
                    return;
                }
                h.a aVar = hVar instanceof h.a ? (h.a) hVar : null;
                oVar = aVar != null ? aVar.g : null;
                if (oVar == null || p.c(oVar, videoFile) <= -1) {
                    h(qVar, temporaryPlaylist2, false);
                    return;
                } else {
                    k(i((h.a) hVar, temporaryPlaylist), videoFile);
                    return;
                }
            }
        }
        VideoDiscoveryRelatedVideosSourceArgs.Playlist playlist = (VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs3;
        VideoDiscoveryRelatedVideosSourceArgs.Playlist playlist2 = (VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs;
        int i3 = playlist.c;
        VideoRelatedVideosOrder videoRelatedVideosOrder = playlist.l;
        VideoFile videoFile2 = playlist.b;
        int i4 = playlist2.c;
        VideoRelatedVideosOrder videoRelatedVideosOrder2 = playlist2.l;
        VideoFile videoFile3 = playlist2.b;
        if (i3 != i4 || !epx.f(playlist.i, playlist2.i)) {
            g(playlist2);
            return;
        }
        if (!f.b(playlist)) {
            if (!epx.f(videoRelatedVideosOrder, videoRelatedVideosOrder2)) {
                if ((videoRelatedVideosOrder instanceof VideoRelatedVideosOrder.Shuffled) != (videoRelatedVideosOrder2 instanceof VideoRelatedVideosOrder.Shuffled)) {
                    h(qVar, playlist2, true);
                    return;
                } else {
                    h(qVar, playlist2, false);
                    return;
                }
            }
            if (epx.f(videoFile2.a1(), videoFile3.a1())) {
                return;
            }
            h.a aVar2 = hVar instanceof h.a ? (h.a) hVar : null;
            oVar = aVar2 != null ? aVar2.g : null;
            if (oVar == null || p.c(oVar, videoFile3) <= -1) {
                h(qVar, playlist2, false);
                return;
            } else {
                k(i((h.a) hVar, playlist), videoFile3);
                return;
            }
        }
        if (z || (num = playlist2.h) == null) {
            g(playlist2);
            return;
        }
        e eVar = this.i;
        d dVar = eVar.b;
        whe wheVar = eVar.d;
        Integer num2 = playlist.g;
        Integer num3 = playlist2.g;
        h.a aVar3 = hVar instanceof h.a ? (h.a) hVar : null;
        if (aVar3 != null) {
            if (epx.f(videoFile2.a1(), videoFile3.a1())) {
                if (epx.f(num2, num3)) {
                    return;
                }
                h.a aVar4 = (h.a) hVar;
                io.reactivex.rxjava3.disposables.c cVar = eVar.f;
                if (cVar != null) {
                    cVar.dispose();
                }
                io.reactivex.rxjava3.disposables.c cVar2 = dVar.b;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                dVar.b = null;
                VideoDiscoveryRelatedVideosSource videoDiscoveryRelatedVideosSource = aVar4.h;
                if (!(videoDiscoveryRelatedVideosSource instanceof VideoDiscoveryRelatedVideosSource.Playlist)) {
                    if (!(videoDiscoveryRelatedVideosSource instanceof VideoDiscoveryRelatedVideosSource.TemporaryPlaylist)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                List<VideoSeason> list = ((VideoDiscoveryRelatedVideosSource.Playlist) videoDiscoveryRelatedVideosSource).b.q;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (VideoSeason videoSeason : list) {
                    arrayList.add((num3 != null && videoSeason.b == num3.intValue()) ? VideoSeason.zb(videoSeason, true) : VideoSeason.zb(videoSeason, false));
                }
                VideoDiscoveryRelatedVideosSource.Playlist playlist3 = (VideoDiscoveryRelatedVideosSource.Playlist) aVar4.h;
                VideoDiscoveryRelatedVideosSource.Playlist a = VideoDiscoveryRelatedVideosSource.Playlist.a(playlist3, VideoAlbum.Ab(playlist3.b, false, arrayList, 229375));
                mct0 e = p.e(aVar4.g, num.intValue());
                if (num.equals(num3) && e != null) {
                    wheVar.invoke(h.a.h(aVar4, null, null, 0, null, null, new m.a(e), null, a, null, false, false, false, 3935));
                    return;
                } else {
                    wheVar.invoke(h.a.h(aVar4, null, null, 0, null, null, m.c.a, null, a, null, false, false, false, 3935));
                    eVar.a(playlist2);
                    return;
                }
            }
            o oVar2 = aVar3.g;
            o.a aVar5 = oVar2 instanceof o.a ? (o.a) oVar2 : null;
            m mVar = aVar3.f;
            m.a aVar6 = mVar instanceof m.a ? (m.a) mVar : null;
            Integer num4 = playlist.h;
            if (epx.f(num2, num4) && epx.f(num3, num)) {
                eVar.b(aVar3, videoFile3);
                return;
            }
            if (!epx.f(num2, num4) && !epx.f(num3, num)) {
                eVar.b(aVar3, videoFile3);
                return;
            }
            if (epx.f(num2, num4)) {
                eVar.b(aVar3, videoFile3);
                eVar.e.invoke(new c.s0.b(num.intValue()));
                return;
            }
            if (epx.f(num2, num4)) {
                return;
            }
            if (!epx.f((aVar5 == null || (d = p.d(aVar5, videoFile2)) == null) ? null : d.a1(), videoFile3.a1())) {
                if (!epx.f((aVar5 == null || (g = p.g(aVar5, videoFile2)) == null) ? null : g.a1(), videoFile3.a1())) {
                    if (aVar6 != null) {
                        mct0 mct0Var = aVar6.a;
                        dVar.a();
                        wheVar.invoke(h.a.h(aVar3, videoFile3, mct0Var.d(videoFile3), mct0Var.b(videoFile3), null, null, null, new o.a(Collections.singletonList(mct0Var)), null, null, false, false, false, 4024));
                        return;
                    }
                    return;
                }
            }
            h.a aVar7 = aVar3;
            mct0 f = p.f(aVar5, videoFile3);
            if (f != null) {
                io.reactivex.rxjava3.disposables.c cVar3 = dVar.b;
                if (cVar3 != null) {
                    cVar3.dispose();
                }
                dVar.b = null;
                wheVar.invoke(h.a.h(aVar7, videoFile3, p.d(oVar2, videoFile3), p.c(oVar2, videoFile3), null, null, new m.a(f), null, null, null, false, false, false, 4056));
            }
        }
    }

    public final void b(VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs) {
        io.reactivex.rxjava3.disposables.c i;
        b0 l;
        j();
        if (videoDiscoveryRelatedVideosSourceArgs instanceof VideoDiscoveryRelatedVideosSourceArgs.TemporaryPlaylist) {
            VideoDiscoveryRelatedVideosSourceArgs.TemporaryPlaylist temporaryPlaylist = (VideoDiscoveryRelatedVideosSourceArgs.TemporaryPlaylist) videoDiscoveryRelatedVideosSourceArgs;
            String str = temporaryPlaylist.f;
            UserId userId = temporaryPlaylist.g;
            String str2 = temporaryPlaylist.j;
            if (str == null) {
                l = x.i(new IllegalArgumentException("TemporaryPlaylistId cannot be null"));
            } else {
                ((uft0) this.a.b).getClass();
                tfx tfxVar = new tfx("video.getAssistantAlbumById", new wcl0(4), new gub0(5));
                tfx.o(tfxVar, "temporary_uid", str, 0, 0, 12);
                if (str2 != null) {
                    tfx.o(tfxVar, "query_id", str2, 0, 0, 12);
                }
                dz2 x = yfb.x(tfxVar);
                ahn.D(x);
                l = rsg0.W(x, 7).l(new q9f0(new wx30(18), 3));
            }
            i = hg1.i(new r(x.B(l, m1t0.a(userId), new qs6(new a76((byte) 0, 5), 18)), new xx40(new j(this, str, videoDiscoveryRelatedVideosSourceArgs, 0), 15)).h(new be50(new vgs0(this, 0), 23)), new hfm0(this, 13));
        } else {
            if (!(videoDiscoveryRelatedVideosSourceArgs instanceof VideoDiscoveryRelatedVideosSourceArgs.Playlist)) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = videoDiscoveryRelatedVideosSourceArgs.c;
            UserId userId2 = ((VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs).i;
            z0r0 z0r0Var = new z0r0(userId2, i2, videoDiscoveryRelatedVideosSourceArgs.b.a1());
            ahn.D(z0r0Var);
            i = hg1.i(new r(x.B(rsg0.W(z0r0Var, 7), m1t0.a(userId2), new g7(new v3l(1), 20)), new pu50(new uyn0(3, videoDiscoveryRelatedVideosSourceArgs, this), 15)).h(new ksb0(new b8e0(this, 20), 14)), new bjm0(this, 10));
        }
        this.g = i;
    }

    public final void c(q qVar, VideoRelatedVideosPagingType videoRelatedVideosPagingType) {
        c cVar = this.j;
        d dVar = cVar.a;
        VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs = qVar.c;
        VideoDiscoveryRelatedVideosSourceArgs.Playlist playlist = videoDiscoveryRelatedVideosSourceArgs instanceof VideoDiscoveryRelatedVideosSourceArgs.Playlist ? (VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs : null;
        h hVar = qVar.s;
        h.a aVar = hVar instanceof h.a ? (h.a) hVar : null;
        if (playlist != null) {
            Integer num = playlist.h;
            int i = playlist.c;
            if (aVar != null) {
                int i2 = c.a.$EnumSwitchMapping$0[videoRelatedVideosPagingType.ordinal()];
                if (i2 == 1) {
                    mct0 e = p.e(aVar.g, num != null ? num.intValue() : i);
                    if (e != null) {
                        rbt0 rbt0Var = (rbt0) j5g.k0(e.e);
                        if (rbt0Var == null || !rbt0Var.f) {
                            if (num != null) {
                                i = num.intValue();
                            }
                            n9e n9eVar = new n9e(cVar, i, 1);
                            k9x k9xVar = e.b;
                            io.reactivex.rxjava3.disposables.c cVar2 = dVar.c;
                            if (cVar2 == null || cVar2.h()) {
                                Pair pair = new Pair(Integer.valueOf(k9xVar.c), Boolean.valueOf(k9xVar.c >= e.d));
                                int intValue = ((Number) pair.d()).intValue();
                                if (((Boolean) pair.g()).booleanValue()) {
                                    return;
                                }
                                x<VideoListWithTotalCount> c = dVar.c(playlist, i, intValue, 50);
                                qgs0 qgs0Var = new qgs0(new mqz(n9eVar, intValue, 1), 0);
                                c.getClass();
                                dVar.c = io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.single.n(c, qgs0Var), new kcm0(n9eVar, intValue), new cef(n9eVar, dVar, intValue));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                m mVar = aVar.f;
                if (!(mVar instanceof m.a)) {
                    if (!(mVar instanceof m.b) && !epx.f(mVar, m.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                mct0 mct0Var = ((m.a) mVar).a;
                rbt0 rbt0Var2 = (rbt0) j5g.k0(mct0Var.e);
                if (rbt0Var2 == null || !rbt0Var2.f) {
                    Integer num2 = playlist.g;
                    if (num2 != null) {
                        i = num2.intValue();
                    }
                    v5b v5bVar = new v5b(cVar, i, 3);
                    k9x k9xVar2 = mct0Var.b;
                    io.reactivex.rxjava3.disposables.c cVar3 = dVar.b;
                    if (cVar3 == null || cVar3.h()) {
                        Pair pair2 = new Pair(Integer.valueOf(k9xVar2.c), Boolean.valueOf(k9xVar2.c >= mct0Var.d));
                        int intValue2 = ((Number) pair2.d()).intValue();
                        if (((Boolean) pair2.g()).booleanValue()) {
                            return;
                        }
                        x<VideoListWithTotalCount> c2 = dVar.c(playlist, i, intValue2, 50);
                        f0o0 f0o0Var = new f0o0(new nz10(v5bVar, intValue2, 2), 3);
                        c2.getClass();
                        dVar.b = io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.single.n(c2, f0o0Var), new dib(v5bVar, intValue2, 1), new fnz(v5bVar, dVar, intValue2));
                    }
                }
            }
        }
    }

    public final void d(q qVar, VideoRelatedVideosPagingType videoRelatedVideosPagingType) {
        c cVar = this.j;
        d dVar = cVar.a;
        VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs = qVar.c;
        VideoDiscoveryRelatedVideosSourceArgs.Playlist playlist = videoDiscoveryRelatedVideosSourceArgs instanceof VideoDiscoveryRelatedVideosSourceArgs.Playlist ? (VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs : null;
        h hVar = qVar.s;
        h.a aVar = hVar instanceof h.a ? (h.a) hVar : null;
        if (playlist != null) {
            Integer num = playlist.h;
            int i = playlist.c;
            if (aVar != null) {
                int i2 = c.a.$EnumSwitchMapping$0[videoRelatedVideosPagingType.ordinal()];
                if (i2 == 1) {
                    mct0 e = p.e(aVar.g, num != null ? num.intValue() : i);
                    if (e != null) {
                        rbt0 rbt0Var = (rbt0) j5g.a0(e.e);
                        if (rbt0Var == null || !rbt0Var.f) {
                            if (num != null) {
                                i = num.intValue();
                            }
                            n6 n6Var = new n6(cVar, i, 2);
                            io.reactivex.rxjava3.disposables.c cVar2 = dVar.c;
                            if (cVar2 == null || cVar2.h()) {
                                k9x k9xVar = e.b;
                                int i3 = k9xVar.b;
                                int i4 = i3 < 50 ? i3 : 50;
                                Pair pair = new Pair(Integer.valueOf(Math.max(0, i3 - 50)), Boolean.valueOf(k9xVar.b == 0));
                                int intValue = ((Number) pair.d()).intValue();
                                if (((Boolean) pair.g()).booleanValue()) {
                                    return;
                                }
                                x<VideoListWithTotalCount> c = dVar.c(playlist, i, intValue, i4);
                                wvq0 wvq0Var = new wvq0(new vqp(n6Var, intValue, 2), 4);
                                c.getClass();
                                dVar.c = io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.single.n(c, wvq0Var), new sbq(n6Var, intValue, 1), new wlw(n6Var, dVar, intValue));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                m mVar = aVar.f;
                if (!(mVar instanceof m.a)) {
                    if (!(mVar instanceof m.b) && !epx.f(mVar, m.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                mct0 mct0Var = ((m.a) mVar).a;
                rbt0 rbt0Var2 = (rbt0) j5g.a0(mct0Var.e);
                if (rbt0Var2 == null || !rbt0Var2.f) {
                    Integer num2 = playlist.g;
                    if (num2 != null) {
                        i = num2.intValue();
                    }
                    ogs0 ogs0Var = new ogs0(cVar, i, 0);
                    io.reactivex.rxjava3.disposables.c cVar3 = dVar.b;
                    if (cVar3 == null || cVar3.h()) {
                        k9x k9xVar2 = mct0Var.b;
                        int i5 = k9xVar2.b;
                        int i6 = i5 < 50 ? i5 : 50;
                        Pair pair2 = new Pair(Integer.valueOf(Math.max(0, i5 - 50)), Boolean.valueOf(k9xVar2.b == 0));
                        int intValue2 = ((Number) pair2.d()).intValue();
                        if (((Boolean) pair2.g()).booleanValue()) {
                            return;
                        }
                        x<VideoListWithTotalCount> c2 = dVar.c(playlist, i, intValue2, i6);
                        y730 y730Var = new y730(new b4u(ogs0Var, intValue2, 2), 21);
                        c2.getClass();
                        dVar.b = io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.single.n(c2, y730Var), new rva(ogs0Var, intValue2, 1), new gcc0(ogs0Var, dVar, intValue2));
                    }
                }
            }
        }
    }

    public final void e(q qVar) {
        h hVar = qVar.s;
        VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs = qVar.c;
        boolean z = videoDiscoveryRelatedVideosSourceArgs instanceof VideoDiscoveryRelatedVideosSourceArgs.Playlist;
        VideoDiscoveryRelatedVideosSourceArgs.Playlist playlist = z ? (VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs : null;
        if (playlist != null) {
            if (epx.f(hVar, h.b.a)) {
                g(playlist);
                return;
            }
            if (!f.b(playlist) || epx.f(playlist.h, playlist.g)) {
                h.a aVar = hVar instanceof h.a ? (h.a) hVar : null;
                Object obj = aVar != null ? aVar.f : null;
                m.b bVar = obj instanceof m.b ? (m.b) obj : null;
                h(qVar, playlist, bVar != null ? bVar.a : false);
                return;
            }
            e eVar = this.i;
            eVar.getClass();
            h.a aVar2 = hVar instanceof h.a ? (h.a) hVar : null;
            VideoDiscoveryRelatedVideosSourceArgs.Playlist playlist2 = z ? (VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs : null;
            if (aVar2 == null || playlist2 == null) {
                return;
            }
            eVar.d.invoke(h.a.h(aVar2, null, null, 0, null, null, m.c.a, null, null, null, false, false, false, 4063));
            eVar.a(playlist2);
        }
    }

    public final void f(q qVar, int i) {
        VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs = qVar.c;
        if (videoDiscoveryRelatedVideosSourceArgs instanceof VideoDiscoveryRelatedVideosSourceArgs.Playlist) {
            a(qVar, VideoDiscoveryRelatedVideosSourceArgs.Playlist.e((VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs, null, Integer.valueOf(i), null, null, 251), false);
        } else if (!(videoDiscoveryRelatedVideosSourceArgs instanceof VideoDiscoveryRelatedVideosSourceArgs.TemporaryPlaylist) && videoDiscoveryRelatedVideosSourceArgs != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void g(VideoDiscoveryRelatedVideosSourceArgs.Playlist playlist) {
        a aVar = this.k;
        io.reactivex.rxjava3.disposables.c cVar = aVar.b;
        if (cVar != null) {
            cVar.dispose();
        }
        sd9 sd9Var = new sd9();
        StringBuilder sb = new StringBuilder();
        sb.append(playlist.i.b);
        sb.append('_');
        sb.append(playlist.c);
        String sb2 = sb.toString();
        r820 r820Var = new r820(aVar, 10);
        v100 v100Var = new v100(aVar, 18);
        v95 v95Var = new v95(aVar, 9);
        io.reactivex.rxjava3.subjects.f<bwr0> fVar = wjs0.b;
        ljs ljsVar = new ljs(new ti30(sd9Var, sb2, v100Var, r820Var, v95Var), 16);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        aVar.b = new b1(fVar.E(ljsVar, lVar, kVar, kVar)).subscribe();
        l(h.c.a);
        b(playlist);
    }

    public final void h(q qVar, VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs, boolean z) {
        io.reactivex.rxjava3.disposables.c cVar;
        x l;
        c cVar2 = this.j;
        xa9 xa9Var = cVar2.d;
        h hVar = qVar.s;
        if (!(hVar instanceof h.a)) {
            if (hVar instanceof h.c) {
                xa9Var.invoke(h.c.a);
                b(videoDiscoveryRelatedVideosSourceArgs);
                s3q0 s3q0Var = s3q0.a;
                return;
            }
            return;
        }
        h.a aVar = (h.a) hVar;
        xa9Var.invoke(h.a.h(aVar, videoDiscoveryRelatedVideosSourceArgs.b, null, -1, null, null, m.c.a, new o.a(EmptyList.b), null, null, videoDiscoveryRelatedVideosSourceArgs.d() instanceof VideoRelatedVideosOrder.Shuffled, videoDiscoveryRelatedVideosSourceArgs.d() instanceof VideoRelatedVideosOrder.Reverse, false, 2456));
        io.reactivex.rxjava3.disposables.c cVar3 = cVar2.f;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        if (videoDiscoveryRelatedVideosSourceArgs instanceof VideoDiscoveryRelatedVideosSourceArgs.Playlist) {
            VideoDiscoveryRelatedVideosSourceArgs.Playlist playlist = (VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs;
            int i = playlist.c;
            m5t0 m5t0Var = cVar2.b;
            int i2 = 1;
            if (z) {
                io.reactivex.rxjava3.internal.operators.single.b bVar = new io.reactivex.rxjava3.internal.operators.single.b(new ngs0(cVar2, playlist, i));
                d7b0 a = l.a(playlist, i);
                r a2 = q5t0.a(m5t0Var, a.a, a.b, a.c, false, a.d, a.e);
                d7b0 a3 = l.a(playlist, i);
                l = x.A(bVar, a2, q5t0.a(m5t0Var, a3.a, a3.b, a3.c, true, a3.d, a3.e), new je40(new rgo0(i2, cVar2, playlist), 18));
            } else {
                Integer num = playlist.g;
                if (num != null) {
                    i = num.intValue();
                }
                l = new io.reactivex.rxjava3.internal.operators.single.b(new ngs0(cVar2, playlist, i)).l(new vii0(new hmj0(5, cVar2, playlist), 6));
            }
            cVar = hg1.i(l.h(new j3z(new pme0(cVar2, z, i2), 22)), new pgs0(1, cVar2.e, izs.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0));
        } else {
            cVar = null;
        }
        cVar2.f = cVar;
    }

    public final void j() {
        io.reactivex.rxjava3.disposables.c cVar = this.g;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.k.b;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        e eVar = this.i;
        io.reactivex.rxjava3.disposables.c cVar3 = eVar.f;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar4 = eVar.g;
        if (cVar4 != null) {
            cVar4.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar5 = eVar.h;
        if (cVar5 != null) {
            cVar5.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar6 = this.j.f;
        if (cVar6 != null) {
            cVar6.dispose();
        }
        d dVar = this.h;
        io.reactivex.rxjava3.disposables.c cVar7 = dVar.b;
        if (cVar7 != null) {
            cVar7.dispose();
        }
        dVar.b = null;
        dVar.a();
    }

    public final void k(h.a aVar, VideoFile videoFile) {
        o oVar = aVar.g;
        l(h.a.h(aVar, videoFile, p.d(oVar, videoFile), p.c(oVar, videoFile), null, null, null, null, null, null, false, false, false, 4088));
    }

    public final void l(h hVar) {
        this.e.invoke(new c.s0.f(hVar));
    }
}
