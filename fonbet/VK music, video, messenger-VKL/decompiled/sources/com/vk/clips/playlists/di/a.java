package com.vk.clips.playlists.di;

import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.single.o;
import io.reactivex.rxjava3.internal.operators.single.r;
import io.reactivex.rxjava3.internal.operators.single.y;
import io.reactivex.rxjava3.kotlin.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import xsna.aa6;
import xsna.ahn;
import xsna.asu0;
import xsna.bk1;
import xsna.c5g;
import xsna.c8;
import xsna.ca6;
import xsna.cse;
import xsna.db;
import xsna.due;
import xsna.dz2;
import xsna.eue;
import xsna.ij8;
import xsna.j4c;
import xsna.j5g;
import xsna.kl6;
import xsna.kp5;
import xsna.kue;
import xsna.l14;
import xsna.l22;
import xsna.lk;
import xsna.mgj0;
import xsna.ng3;
import xsna.nm0;
import xsna.nt;
import xsna.q45;
import xsna.qa;
import xsna.rsg0;
import xsna.s2f;
import xsna.tp0;
import xsna.ver0;
import xsna.vf4;
import xsna.vve;
import xsna.yfb;

/* compiled from: ClipsPlaylistsInteractorImpl.kt */
/* loaded from: classes16.dex */
public final class a implements due {
    public final cse a;
    public final kue b;
    public final vve c;
    public final s2f d;
    public final com.vk.clips.playlists.a e;
    public final ConcurrentHashMap<UserId, Integer> f = new ConcurrentHashMap<>();

    public a(cse cseVar, kue kueVar, vve vveVar, s2f s2fVar, com.vk.clips.playlists.a aVar) {
        this.a = cseVar;
        this.b = kueVar;
        this.c = vveVar;
        this.d = s2fVar;
        this.e = aVar;
    }

    @Override // xsna.due
    public final void a(ClipsPlaylist clipsPlaylist, VideoFile videoFile) {
        nm0 nm0Var = new nm0(4);
        x<ClipsPlaylist> f = f(clipsPlaylist, Collections.singletonList(videoFile));
        asu0 asu0Var = asu0.a;
        ver0.a(c.e(f.q(asu0Var.c()).m(asu0Var.d()), new ij8(2, this, nm0Var), new l14(this, clipsPlaylist, nm0Var, 5)));
    }

    @Override // xsna.due
    public final void b(ClipsPlaylist clipsPlaylist, VideoFile videoFile) {
        lk lkVar = new lk(11);
        ver0.a(c.e(g(clipsPlaylist, Collections.singletonList(videoFile)).m(asu0.a.d()), new l22(7, this, lkVar), new j4c(this, clipsPlaylist, lkVar, videoFile, 1)));
    }

    @Override // xsna.due
    public final x c(int i, UserId userId) {
        return rsg0.W(yfb.x(this.b.b.k(userId, Collections.singletonList(Integer.valueOf(i)))), 7);
    }

    @Override // xsna.due
    public final x d(int i, UserId userId, boolean z) {
        dz2 x = yfb.x(mgj0.n(this.b.b, userId, null, Collections.singletonList(Integer.valueOf(i)), null, null, null, null, null, 250));
        ahn.D(x);
        return rsg0.w0(x).l(new c8(new vf4(i, 1, userId, z), 7));
    }

    @Override // xsna.due
    public final int e(UserId userId) {
        Integer num = this.f.get(userId);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // xsna.due
    public final x<ClipsPlaylist> f(ClipsPlaylist clipsPlaylist, List<? extends VideoFile> list) {
        int i = clipsPlaylist.b;
        UserId userId = clipsPlaylist.f;
        List<? extends VideoFile> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((VideoFile) it.next()).a1());
        }
        Set S0 = j5g.S0(arrayList);
        kue kueVar = this.b;
        return new o(new r(kueVar.c(i, userId), new bk1(new kp5(5, rsg0.W(yfb.x(kueVar.b.j(userId, Integer.valueOf(i), null, j5g.O0(S0))), 7).l(new aa6(new nt(21), 9)), list), 6)).q(asu0.a.c()), new tp0(new eue(list, this, clipsPlaylist, S0), 12));
    }

    @Override // xsna.due
    public final x<ClipsPlaylist> g(ClipsPlaylist clipsPlaylist, List<? extends VideoFile> list) {
        UserId userId = clipsPlaylist.f;
        int i = clipsPlaylist.b;
        kue kueVar = this.b;
        y c = kueVar.c(i, userId);
        List<? extends VideoFile> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((VideoFile) it.next()).a1());
        }
        return new o(new r(c, new qa(new ng3(8, rsg0.W(yfb.x(mgj0.y(kueVar.b, clipsPlaylist.f, Integer.valueOf(i), null, j5g.O0(j5g.S0(arrayList)), null, 20)), 7).l(new ca6(new db(22), 8)), list), 11)).q(asu0.a.c()), new kl6(new q45(list, clipsPlaylist, this, 2), 8));
    }
}
