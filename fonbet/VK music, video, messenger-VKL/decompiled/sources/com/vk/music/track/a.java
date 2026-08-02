package com.vk.music.track;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.movika.sdk.base.flow.binding.c;
import com.vk.movika.sdk.base.model.history.b;
import com.vk.movika.sdk.base.observable.e0;
import com.vk.movika.sdk.base.ui.j;
import com.vk.music.common.MusicPlaybackLaunchContext;
import io.reactivex.rxjava3.core.g;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import xsna.a630;
import xsna.amp;
import xsna.amt;
import xsna.as;
import xsna.at;
import xsna.b630;
import xsna.ba5;
import xsna.bn40;
import xsna.br;
import xsna.bt;
import xsna.bv5;
import xsna.c2y;
import xsna.c3v;
import xsna.c5g;
import xsna.c630;
import xsna.com;
import xsna.cyc;
import xsna.cz;
import xsna.d05;
import xsna.d120;
import xsna.d630;
import xsna.dam;
import xsna.drm0;
import xsna.dz2;
import xsna.e420;
import xsna.e630;
import xsna.ed;
import xsna.eiy;
import xsna.et;
import xsna.f2u;
import xsna.f630;
import xsna.fq;
import xsna.g630;
import xsna.gp;
import xsna.gq;
import xsna.gzs;
import xsna.h630;
import xsna.hq;
import xsna.i76;
import xsna.ir0;
import xsna.irt;
import xsna.itg0;
import xsna.iu1;
import xsna.iu4;
import xsna.ix4;
import xsna.j41;
import xsna.j8;
import xsna.jh;
import xsna.jnj;
import xsna.juz;
import xsna.jz;
import xsna.k22;
import xsna.k2y;
import xsna.k5;
import xsna.k840;
import xsna.kmq;
import xsna.l8k;
import xsna.lh3;
import xsna.lrq;
import xsna.lwa;
import xsna.m1k;
import xsna.m1r;
import xsna.m40;
import xsna.m5;
import xsna.n9w;
import xsna.nex;
import xsna.nm3;
import xsna.o25;
import xsna.ob50;
import xsna.oc40;
import xsna.oyr;
import xsna.p11;
import xsna.pdw;
import xsna.per;
import xsna.pqz;
import xsna.q130;
import xsna.ql2;
import xsna.quz;
import xsna.qxi;
import xsna.r5v0;
import xsna.rop;
import xsna.rsg0;
import xsna.rt10;
import xsna.s3q0;
import xsna.s6x;
import xsna.sh6;
import xsna.skz;
import xsna.sux;
import xsna.tfx;
import xsna.u4u;
import xsna.up;
import xsna.uuz;
import xsna.vhb0;
import xsna.vp;
import xsna.w00;
import xsna.wmz;
import xsna.wx00;
import xsna.x620;
import xsna.xht;
import xsna.xn;
import xsna.xnr;
import xsna.y34;
import xsna.yfb;
import xsna.yhu;

/* compiled from: ModernMusicTrackModelImpl.kt */
/* loaded from: classes.dex */
public final class a implements a630 {
    public final ix4 b;
    public final qxi c;
    public final oc40 d;

    public a() {
        ix4 ix4Var = new ix4();
        qxi qxiVar = new qxi();
        r5v0 r5v0Var = k840.a.h;
        r5v0Var = r5v0Var == null ? null : r5v0Var;
        this.b = ix4Var;
        this.c = qxiVar;
        this.d = r5v0Var;
    }

    @Override // xsna.a630
    public final boolean D(MusicTrack musicTrack) {
        Episode episode;
        return (musicTrack == null || (episode = musicTrack.w) == null || episode.zb()) ? false : true;
    }

    @Override // xsna.a630
    public final q<Boolean> E(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        bn40.f("MusicTrack: ", musicTrack, " , refer.source: ", MusicPlaybackLaunchContext.Mb(musicPlaybackLaunchContext));
        m1 y0 = rsg0.y0(new lrq(musicTrack.c, musicTrack.b, musicPlaybackLaunchContext.t()), null, null, 3);
        jz jzVar = new jz(new q130(musicTrack, 1), 26);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(jzVar, lVar, kVar, kVar).F(new ir0(new irt(3), 26));
    }

    @Override // xsna.a630
    public final q<Pair<int[], Playlist>> F(MusicTrack musicTrack, Playlist playlist, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        bn40.f("MusicTrack: ", musicTrack, ", playlist:", playlist);
        j1 U = rsg0.y0(yfb.x(this.b.i(playlist.c, playlist.b, Collections.singletonList(musicTrack.Ib()))), null, null, 3).U(new nm3(new h630(playlist, 0), 22));
        m1r m1rVar = new m1r(new k22(11, musicTrack, playlist), 8);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return U.E(m1rVar, lVar, kVar, kVar).F(new eiy(new com(14), 2));
    }

    @Override // xsna.a630
    public final boolean G(MusicTrack musicTrack) {
        return (musicTrack == null || musicTrack.Vb() || musicTrack.B() || musicTrack.Ub() || musicTrack.Sb()) ? false : true;
    }

    @Override // xsna.a630
    public final q<Boolean> J(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        bn40.f("MusicTrack: ", musicTrack, ", refer.source: ", MusicPlaybackLaunchContext.Mb(musicPlaybackLaunchContext));
        m1 y0 = rsg0.y0(new kmq(musicTrack.c, musicTrack.b, musicPlaybackLaunchContext.t()), null, null, 3);
        wx00 wx00Var = new wx00(new yhu(musicTrack, 9), 2);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(wx00Var, lVar, kVar, kVar).F(new cz(new pqz(4), 29));
    }

    @Override // xsna.a630
    public final void M(Context context, MusicTrack musicTrack) {
        k840.a.d().R(context, musicTrack);
    }

    @Override // xsna.a630
    public final void P(Activity activity, int i, AudioBookChapter audioBookChapter, boolean z) {
        itg0.j(k840.a.d().D(i, audioBookChapter.getId()), null, 3);
    }

    @Override // xsna.a630
    public final q<Boolean> Q(int i, boolean z, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        String Jb = musicPlaybackLaunchContext != null ? musicPlaybackLaunchContext.Jb() : null;
        this.b.getClass();
        tfx tfxVar = new tfx("audio.unfollowRadioStation", new et(3), new gp(5));
        tfx.l(tfxVar, "station_id", i, 0, 0, 12);
        if (Jb != null) {
            tfx.o(tfxVar, "ref", Jb, 0, 0, 12);
        }
        j1 U = rsg0.y0(yfb.x(tfxVar), null, null, 3).U(new b630(new c3v(2), 0));
        j41 j41Var = new j41(new d630(this, i, 0), 23);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return U.E(j41Var, lVar, kVar, kVar).F(new w00(new i76(z, 1), 27));
    }

    @Override // xsna.a630
    public final q<Playlist> V(MusicTrack musicTrack, Playlist playlist) {
        bn40.f("MusicTrack:", musicTrack, "Playlist:", playlist);
        UserId userId = playlist.c;
        int i = playlist.b;
        List singletonList = Collections.singletonList(musicTrack.Fb());
        this.b.getClass();
        tfx tfxVar = new tfx("audio.removeFromPlaylist", new as(4), new p11(4));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "playlist_id", i, 0, 0, 8);
        tfxVar.i("audio_ids", singletonList);
        j1 U = rsg0.y0(yfb.x(tfxVar), null, null, 3).U(new lh3(new m1k(playlist, 28), 25));
        iu1 iu1Var = new iu1(new rop(musicTrack, 19), 23);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return U.E(iu1Var, lVar, kVar, kVar).F(new f2u(new xht(10), 5));
    }

    @Override // xsna.a630
    public final void W(Context context, MusicTrack musicTrack, boolean z, List<String> list) {
        if (list.size() > 1) {
            k840.a.d().J(list);
        } else {
            k840.a.d().L(musicTrack);
        }
    }

    @Override // xsna.a630
    public final q<Boolean> X0(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        if (!musicTrack.Vb()) {
            return g0.b;
        }
        bn40.f("MusicTrack: ", musicTrack, " , refer.source: ", MusicPlaybackLaunchContext.Mb(musicPlaybackLaunchContext));
        m1 y0 = rsg0.y0(new vhb0(musicTrack.c, musicTrack.b, musicPlaybackLaunchContext.t()), null, null, 3);
        k2y k2yVar = new k2y(new d05(25, this, musicTrack), 4);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(k2yVar, lVar, kVar, kVar).F(new rt10(new uuz(8), 3));
    }

    @Override // xsna.a630
    public final q<Integer> e1(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext, boolean z) {
        String str;
        j1 U;
        bn40.f("musicTrack: ", musicTrack, ", refer.source: ", MusicPlaybackLaunchContext.Mb(musicPlaybackLaunchContext));
        if (musicTrack.l) {
            U = rsg0.y0(yfb.x(this.b.k(musicTrack.b, musicTrack.c)), null, null, 3).U(new y34(new quz(5), 25));
        } else {
            int i = musicTrack.b;
            UserId userId = musicTrack.c;
            if (musicPlaybackLaunchContext == null || (str = musicPlaybackLaunchContext.t()) == null) {
                str = "";
            }
            U = rsg0.y0(yfb.x(this.b.y(i, userId, str, musicTrack.r, musicTrack.y)), null, null, 3).U(new c(new e420(1), 23));
        }
        boolean z2 = musicTrack.l;
        qxi qxiVar = this.c;
        j1 U2 = z2 ? rsg0.y0(yfb.x(qxiVar.g(musicTrack.b, musicTrack.c, null)), null, null, 3).U(new ed(new s6x(9), 26)) : rsg0.y0(yfb.x(qxiVar.c(musicTrack.b, musicTrack.c, null)), null, null, 3).U(new m40(new amp(14), 27));
        if (jnj.h(ob50.c(musicTrack))) {
            U = U2;
        }
        wmz wmzVar = new wmz(new f630(musicTrack, z), 4);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return U.E(wmzVar, lVar, kVar, kVar).F(new c2y(new dam(18), 6));
    }

    @Override // xsna.a630
    public final void f1(Context context, MusicTrack musicTrack, Playlist playlist) {
        k840.a.d().q(musicTrack, playlist);
    }

    @Override // xsna.a630
    public final boolean i(MusicTrack musicTrack) {
        if (musicTrack == null || !musicTrack.Tb()) {
            if (musicTrack == null) {
                return false;
            }
            if ((o25.a().a(musicTrack.c) && !musicTrack.l) || musicTrack.Vb() || musicTrack.Mb() || musicTrack.B() || musicTrack.Sb() || musicTrack.Ub()) {
                return false;
            }
            if (musicTrack.Qb() && (!musicTrack.Wb() || musicTrack.b <= 0)) {
                return false;
            }
        } else {
            if (musicTrack.U || musicTrack.B() || musicTrack.Rb()) {
                return false;
            }
            if (!musicTrack.Tb() && (!musicTrack.Wb() || musicTrack.b <= 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.a630
    public final boolean i0(MusicTrack musicTrack) {
        if (musicTrack == null || !musicTrack.Tb()) {
            if (musicTrack == null || !o25.a().a(musicTrack.c) || musicTrack.l || musicTrack.Rb()) {
                return false;
            }
        } else if (!musicTrack.U || musicTrack.Rb()) {
            return false;
        }
        return true;
    }

    @Override // xsna.a630
    public final q<Boolean> j0(int i, boolean z, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        String Jb = musicPlaybackLaunchContext != null ? musicPlaybackLaunchContext.Jb() : null;
        this.b.getClass();
        tfx tfxVar = new tfx("audio.followRadioStation", new at(4), new bt(3));
        tfx.l(tfxVar, "station_id", i, 0, 0, 12);
        if (Jb != null) {
            tfx.o(tfxVar, "ref", Jb, 0, 0, 12);
        }
        j1 U = rsg0.y0(yfb.x(tfxVar), null, null, 3).U(new oyr(new l8k(21), 8));
        sh6 sh6Var = new sh6(new lwa(this, i, 1), 23);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return U.E(sh6Var, lVar, kVar, kVar).F(new nex(new xnr(z, 1), 4));
    }

    @Override // xsna.a630
    public final boolean j1(MusicTrack musicTrack) {
        Episode episode;
        return (musicTrack == null || (episode = musicTrack.w) == null || !episode.zb()) ? false : true;
    }

    @Override // xsna.a630
    public final void l0(List<String> list, MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext, gzs<s3q0> gzsVar) {
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (String str : list2) {
            arrayList.add(drm0.g0(str, BundleUtil.UNDERLINE_TAG, str));
        }
        q.O(arrayList).v(new ql2(new cyc(musicTrack, arrayList, this, musicPlaybackLaunchContext, 2), 29), true, g.b).F(new skz(new ba5(1, gzsVar), 5)).subscribe();
    }

    @Override // xsna.a630
    public final q<Boolean> p1(MusicTrack musicTrack, boolean z, boolean z2) {
        bn40.f("MusicTrack:", musicTrack);
        List singletonList = Collections.singletonList(musicTrack.Fb());
        this.b.getClass();
        tfx tfxVar = new tfx("audio.removeDislike", new b(4), new fq(3));
        tfxVar.i("audio_ids", singletonList);
        j1 U = rsg0.y0(yfb.x(tfxVar), null, null, 3).U(new j(new u4u(13), 29));
        xn xnVar = new xn(new g630(this, musicTrack, z, z2), 29);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return U.E(xnVar, lVar, kVar, kVar).F(new pdw(new per(13), 4));
    }

    @Override // xsna.a630
    public final q<Boolean> q1(MusicTrack musicTrack, boolean z) {
        bn40.f("MusicTrack:", musicTrack);
        List singletonList = Collections.singletonList(musicTrack.Fb());
        this.b.getClass();
        tfx tfxVar = new tfx("audio.addDislike", new gq(3), new hq(2));
        tfxVar.i("audio_ids", singletonList);
        j1 U = rsg0.y0(yfb.x(tfxVar), null, null, 3).U(new iu4(new juz(2), 20));
        d120 d120Var = new d120(new c630(z, musicTrack, this), 2);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return U.E(d120Var, lVar, kVar, kVar).F(new amt(new x620(4), 9));
    }

    @Override // xsna.a630
    public final q<List<String>> u1(MusicTrack musicTrack, boolean z) {
        bn40.f("MusicTrack: " + musicTrack);
        int i = musicTrack.b;
        UserId userId = musicTrack.c;
        this.b.getClass();
        tfx tfxVar = new tfx("audio.delete", new up(2), new vp(3));
        tfx.l(tfxVar, "audio_id", i, 0, 0, 8);
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        dz2 x = yfb.x(tfxVar);
        StringBuilder sb = new StringBuilder();
        sb.append(musicTrack.c.b);
        sb.append('_');
        sb.append(musicTrack.b);
        List singletonList = Collections.singletonList(sb.toString());
        this.c.getClass();
        tfx tfxVar2 = new tfx("kidsCollection.removeAudios", new j8(14), new jh(15));
        tfxVar2.i("audio_ids", singletonList);
        j1 U = jnj.h(ob50.c(musicTrack)) ? rsg0.y0(yfb.x(tfxVar2), null, null, 3).U(new br(new sux(3), 25)) : rsg0.y0(x, null, null, 3).U(new e630(new n9w(6)));
        k5 k5Var = new k5(new bv5(musicTrack, z, 1), 29);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return U.E(k5Var, lVar, kVar, kVar).F(new m5(new e0(29), 27));
    }

    @Override // xsna.a630
    public final boolean y(MusicTrack musicTrack) {
        return musicTrack == null || musicTrack.Xb();
    }

    @Override // xsna.a630
    public final void y1(Activity activity, AudioBook audioBook, AudioBookChapter audioBookChapter) {
        k840.a.d().C(activity, audioBook, audioBookChapter);
    }
}
