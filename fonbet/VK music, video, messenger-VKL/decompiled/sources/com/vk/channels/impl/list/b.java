package com.vk.channels.impl.list;

import android.content.Context;
import android.view.View;
import com.vk.channels.api.Channel;
import com.vk.channels.api.ChannelEntryPoint;
import com.vk.channels.api.ChannelFilter;
import com.vk.channels.impl.list.c;
import com.vk.channels.impl.list.e;
import com.vk.channels.impl.list.g;
import com.vk.channels.impl.list.loader.ChannelsListItemsLoader;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.ChannelSource;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import defpackage.p;
import defpackage.z;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import xsna.aeb;
import xsna.agb;
import xsna.asu0;
import xsna.az;
import xsna.b60;
import xsna.bg1;
import xsna.bhb;
import xsna.bpn0;
import xsna.c40;
import xsna.cau0;
import xsna.cz;
import xsna.d9w;
import xsna.di6;
import xsna.e1;
import xsna.en;
import xsna.epx;
import xsna.ez;
import xsna.f40;
import xsna.feb;
import xsna.fjk0;
import xsna.g2v;
import xsna.h60;
import xsna.hfz;
import xsna.hgb;
import xsna.ho1;
import xsna.hv;
import xsna.hz;
import xsna.igb;
import xsna.io1;
import xsna.iz;
import xsna.iz0;
import xsna.j41;
import xsna.j5g;
import xsna.jv;
import xsna.jz;
import xsna.k5;
import xsna.kju0;
import xsna.lz0;
import xsna.mcf0;
import xsna.nkb;
import xsna.odw;
import xsna.ogb;
import xsna.ov2;
import xsna.oz;
import xsna.pcf0;
import xsna.ph3;
import xsna.po1;
import xsna.qtd0;
import xsna.qz;
import xsna.rgb;
import xsna.rkb;
import xsna.thb;
import xsna.tta;
import xsna.tz;
import xsna.u8m;
import xsna.ur0;
import xsna.uta;
import xsna.wdj;
import xsna.xf1;
import xsna.xgb;
import xsna.ygb;

/* compiled from: ChannelsListFeature.kt */
/* loaded from: classes16.dex */
public final class b extends di6<bhb, e, g, c> {
    public final xgb h;
    public final tta i;
    public final wdj j;
    public final thb k;
    public final feb l;
    public final cau0 m;
    public ChannelsListItemsLoader n;
    public volatile ProfilesInfo o;
    public final bpn0 p;
    public final io.reactivex.rxjava3.subjects.d<ygb.a<ChannelsListItemsLoader.a>> q;
    public final AtomicBoolean r;
    public final io.reactivex.rxjava3.subjects.f<Boolean> s;
    public SchemeStat$EventItem t;

    public b(xgb xgbVar, tta ttaVar, wdj wdjVar, thb thbVar, feb febVar, cau0 cau0Var) {
        super(new bhb(0));
        this.h = xgbVar;
        this.i = ttaVar;
        this.j = wdjVar;
        this.k = thbVar;
        this.l = febVar;
        this.m = cau0Var;
        this.o = new ProfilesInfo();
        synchronized (xgbVar) {
            try {
                xgbVar.b++;
                ygb<?> ygbVar = xgbVar.c;
                if (ygbVar == null) {
                    com.vk.channels.impl.list.loader.b bVar = xgbVar.a;
                    Context context = bVar.a;
                    rgb rgbVar = bVar.b;
                    ChannelsListItemsLoader channelsListItemsLoader = new ChannelsListItemsLoader(context, rgbVar.a(ChannelFilter.ALL, rgbVar.a, rgbVar.b), bVar.c, bVar.d, bVar.e, bVar.f);
                    xgbVar.c = channelsListItemsLoader;
                    ygbVar = channelsListItemsLoader;
                }
                u(ygbVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.p = new bpn0(new com.vk.movika.sdk.base.model.props.c(9));
        io.reactivex.rxjava3.subjects.d<ygb.a<ChannelsListItemsLoader.a>> N0 = io.reactivex.rxjava3.subjects.d.N0();
        ChannelsListItemsLoader channelsListItemsLoader2 = this.n;
        i((channelsListItemsLoader2 == null ? null : channelsListItemsLoader2).i, io.reactivex.rxjava3.internal.functions.a.e, new h60(N0, 10));
        this.q = N0;
        this.r = new AtomicBoolean();
        io.reactivex.rxjava3.subjects.f<Boolean> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.s = fVar;
        ChannelsListItemsLoader channelsListItemsLoader3 = this.n;
        q<ogb.b> qVar = (channelsListItemsLoader3 == null ? null : channelsListItemsLoader3).j;
        asu0 asu0Var = asu0.a;
        this.b.b(qVar.a0(asu0Var.d()).subscribe(new k5(this, 6), new j41(new po1(this, 13), 7)));
        ChannelsListItemsLoader channelsListItemsLoader4 = this.n;
        y yVar = (channelsListItemsLoader4 != null ? channelsListItemsLoader4 : null).i;
        jz jzVar = new jz(new iz(this, 18), 9);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.b.b(yVar.E(jzVar, lVar, kVar, kVar).subscribe(new hv(this, 9), new jv(new com.vk.movika.sdk.base.observable.q(this, 17), 11)));
        if (thbVar != null) {
            this.b.b(new i0(new y(fVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), new en(11, new ur0(4))).a0(asu0Var.d()).subscribe(new z(this, 11), new f40(new e1(this, 18), 6)));
        }
    }

    @Override // xsna.di6
    public final void d(e eVar) {
        final aeb aebVar;
        ogb.a aVar;
        List<Channel> list;
        e eVar2 = eVar;
        Object obj = null;
        r1 = null;
        r1 = null;
        Channel channel = null;
        if (eVar2 instanceof e.d) {
            ChannelsListItemsLoader channelsListItemsLoader = this.n;
            (channelsListItemsLoader != null ? channelsListItemsLoader : null).d();
            return;
        }
        if (eVar2 instanceof e.C0538e) {
            ChannelsListItemsLoader channelsListItemsLoader2 = this.n;
            (channelsListItemsLoader2 != null ? channelsListItemsLoader2 : null).d();
            return;
        }
        if (eVar2 instanceof e.t) {
            v(((e.t) eVar2).b, null);
            return;
        }
        if (!(eVar2 instanceof e.u)) {
            int i = 6;
            int i2 = 12;
            int i3 = 13;
            int i4 = 9;
            int i5 = 7;
            int i6 = 10;
            if (eVar2 instanceof e.b) {
                e.b bVar = (e.b) eVar2;
                final long j = bVar.b;
                u8m u8mVar = bVar.c;
                tta ttaVar = this.i;
                if (epx.f(u8mVar, u8m.c.b)) {
                    f(ttaVar.b(j), new az(this, 11), new io.reactivex.rxjava3.functions.a() { // from class: xsna.dgb
                        @Override // io.reactivex.rxjava3.functions.a
                        public final void run() {
                            Serializer.c<Peer> cVar = Peer.CREATOR;
                            this.m(new c.d(Peer.a.b(j)));
                        }
                    });
                    return;
                }
                if (epx.f(u8mVar, u8m.f0.b)) {
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    di6.k(this, ttaVar.h(Peer.a.b(j)), new ho1(this, i5), null, 2);
                    return;
                }
                if (epx.f(u8mVar, u8m.g0.b)) {
                    Serializer.c<Peer> cVar2 = Peer.CREATOR;
                    di6.k(this, ttaVar.i(Peer.a.b(j)), new cz(this, i3), null, 2);
                    return;
                }
                if (epx.f(u8mVar, u8m.m0.b)) {
                    di6.k(this, ttaVar.j(j), new b60(this, i6), null, 2);
                    return;
                }
                if (epx.f(u8mVar, u8m.u0.b)) {
                    di6.k(this, ttaVar.m(j), new io1(this, i2), null, 2);
                    return;
                }
                if (epx.f(u8mVar, u8m.c0.b)) {
                    n(new g.C0539g(j));
                    return;
                }
                if (epx.f(u8mVar, u8m.o.b)) {
                    n(new g.e(j));
                    return;
                }
                if (epx.f(u8mVar, u8m.s.b)) {
                    g2v.c().getClass();
                    n(new g.f(j, R.string.vkim_channels_delete_submit_title, R.string.vkim_vkapp_channels_delete_submit_msg));
                    return;
                } else if (epx.f(u8mVar, u8m.d0.b)) {
                    di6.k(this, ttaVar.g(j), new ez(this, 4), null, 2);
                    return;
                } else if (epx.f(u8mVar, u8m.z.b)) {
                    f(ttaVar.d(j), new c40(this, i4), new io.reactivex.rxjava3.functions.a() { // from class: xsna.ggb
                        @Override // io.reactivex.rxjava3.functions.a
                        public final void run() {
                            this.n(new g.h(new g.h.a.C0540a(j)));
                        }
                    });
                    return;
                } else {
                    if (epx.f(u8mVar, u8m.s0.b)) {
                        f(this.i.k(j), new oz(this, i), new hgb(this, 0));
                        return;
                    }
                    return;
                }
            }
            if (eVar2 instanceof e.s) {
                wdj wdjVar = this.j;
                Set<Long> set = ((e.s) eVar2).b;
                odw odwVar = ((kju0) wdjVar.b).e;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    long longValue = ((Number) it.next()).longValue();
                    Serializer.c<Peer> cVar3 = Peer.CREATOR;
                    linkedHashSet.add(Peer.a.b(longValue));
                }
                odwVar.d(linkedHashSet);
                return;
            }
            if (eVar2 instanceof e.q) {
                e.q qVar = (e.q) eVar2;
                long j2 = qVar.b;
                boolean z = qVar.c;
                WeakReference<View> weakReference = qVar.d;
                qtd0 Cb = this.o.Cb(Long.valueOf(j2));
                if (Cb == null) {
                    return;
                }
                m(new c.C0537c(Cb, z, weakReference));
                return;
            }
            if (eVar2.equals(e.g.b)) {
                ChannelsListItemsLoader channelsListItemsLoader3 = this.n;
                if (channelsListItemsLoader3 == null) {
                    channelsListItemsLoader3 = null;
                }
                ygb.a<ChannelsListItemsLoader.a> P0 = channelsListItemsLoader3.h.P0();
                di6.k(this, P0 != null ? ((fjk0) channelsListItemsLoader3.d.a).b(P0.a.e) : io.reactivex.rxjava3.core.a.k(new IllegalStateException("State is null, but it should not be.")), new bg1(this, i6), null, 2);
                return;
            }
            if (eVar2.equals(e.j.b)) {
                ChannelsListItemsLoader channelsListItemsLoader4 = this.n;
                f(((fjk0) (channelsListItemsLoader4 != null ? channelsListItemsLoader4 : null).d.a).b(0).f(100L, TimeUnit.MILLISECONDS), new qz(this, i5), new igb(this, 0));
                return;
            }
            if (eVar2 instanceof e.o) {
                v(((e.o) eVar2).b, BuildInfo.t() ? null : ChannelEntryPoint.FolderRecommendations.b);
                return;
            }
            if (eVar2 instanceof e.l) {
                e.l lVar = (e.l) eVar2;
                final long j3 = lVar.b;
                final String str = lVar.c;
                f(this.i.e(j3, ChannelSource.FolderRecommendationsPlus.c), new ph3(this, i3), new io.reactivex.rxjava3.functions.a() { // from class: xsna.fgb
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        this.n(new g.h(new g.h.a.c(j3, str)));
                    }
                });
                return;
            }
            if (eVar2 instanceof e.m) {
                this.l.d(((e.m) eVar2).b);
                return;
            }
            if (eVar2 instanceof e.n) {
                di6.k(this, this.i.f(((e.n) eVar2).b), new ov2(this, i5), null, 2);
                return;
            }
            if (eVar2 instanceof e.c) {
                e.c cVar4 = (e.c) eVar2;
                final long j4 = cVar4.b;
                final CharSequence charSequence = cVar4.c;
                f(this.i.f(j4), new tz(this, i4), new io.reactivex.rxjava3.functions.a() { // from class: xsna.jgb
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        this.n(new g.h(new g.h.a.d(j4, charSequence)));
                    }
                });
                return;
            }
            if (eVar2 instanceof e.a) {
                e.a aVar2 = (e.a) eVar2;
                final long j5 = aVar2.b;
                final CharSequence charSequence2 = aVar2.c;
                f(this.i.e(j5, ChannelSource.Suggest.c), new hz(this, i2), new io.reactivex.rxjava3.functions.a() { // from class: xsna.egb
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        this.n(new g.h(new g.h.a.c(j5, charSequence2)));
                    }
                });
                return;
            }
            if (eVar2 instanceof e.i) {
                di6.k(this, this.i.c(((e.i) eVar2).b), new xf1(this, i6), null, 2);
                return;
            }
            if (eVar2 instanceof e.f) {
                m(new c.b(((e.f) eVar2).b));
                return;
            }
            if (eVar2 instanceof e.r) {
                di6.k(this, this.i.l(((e.r) eVar2).b), new p(this, i4), null, 2);
                return;
            }
            if (eVar2 instanceof e.k) {
                ChannelsListItemsLoader channelsListItemsLoader5 = this.n;
                final rkb rkbVar = (channelsListItemsLoader5 != null ? channelsListItemsLoader5 : null).c;
                rkbVar.g += 10;
                Channel channel2 = (Channel) j5g.k0(rkbVar.h.P0().a);
                if (channel2 == null || (aebVar = channel2.s) == null) {
                    aeb aebVar2 = aeb.d;
                    aeb aebVar3 = aeb.d;
                    aebVar = aeb.e;
                }
                rkbVar.f = new v(new Callable() { // from class: xsna.qkb
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return rkb.this.b.b(aebVar, 10);
                    }
                }).q(rkbVar.c.c()).subscribe(new tz(new iz0(rkbVar, i5), i6), new c40(new lz0(rkbVar, 14), i6));
                return;
            }
            if (!(eVar2 instanceof e.h)) {
                if (!(eVar2 instanceof e.p)) {
                    throw new NoWhenBranchMatchedException();
                }
                f(this.i.k(((e.p) eVar2).b), new oz(this, i), new hgb(this, 0));
                return;
            }
            ChannelsListItemsLoader channelsListItemsLoader6 = this.n;
            rkb rkbVar2 = (channelsListItemsLoader6 != null ? channelsListItemsLoader6 : null).c;
            rkbVar2.g = 2;
            io.reactivex.rxjava3.subjects.d<nkb> dVar = rkbVar2.h;
            List<Channel> subList = dVar.P0().a.subList(0, rkbVar2.g);
            nkb P02 = dVar.P0();
            dVar.onNext(new nkb(subList, P02.b, P02.c, subList.size(), P02.e));
            return;
        }
        long j6 = ((e.u) eVar2).b;
        ygb.a<ChannelsListItemsLoader.a> P03 = this.q.P0();
        if (P03 != null && (aVar = P03.a) != null && (list = aVar.a) != null) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((Channel) next).b == j6) {
                    obj = next;
                    break;
                }
            }
            channel = (Channel) obj;
        }
        if (channel == null || channel.n) {
            return;
        }
        boolean n = this.m.n();
        ImFeatures imFeatures = ImFeatures.ALL_FOLDER_HIDE_CHANNELS;
        imFeatures.getClass();
        ListBuilder a = agb.a(channel, false, !n, n && com.vk.toggle.b.A.a(imFeatures));
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = a.listIterator(0);
        while (true) {
            ListBuilder.a aVar3 = (ListBuilder.a) listIterator;
            if (!aVar3.hasNext()) {
                n(new g.d(new uta(j6, arrayList)));
                return;
            } else {
                Object next2 = aVar3.next();
                if (!(((u8m) next2) instanceof u8m.z)) {
                    arrayList.add(next2);
                }
            }
        }
    }

    @Override // xsna.di6, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        xgb xgbVar = this.h;
        synchronized (xgbVar) {
            try {
                int i = xgbVar.b;
                if (i <= 1) {
                    ygb<?> ygbVar = xgbVar.c;
                    if (ygbVar != null) {
                        ygbVar.destroy();
                    }
                    xgbVar.c = null;
                    xgbVar.b = 0;
                } else {
                    xgbVar.b = i - 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final d9w s() {
        return (d9w) this.p.getValue();
    }

    public final void u(ygb<?> ygbVar) {
        ChannelsListItemsLoader channelsListItemsLoader = ygbVar instanceof ChannelsListItemsLoader ? (ChannelsListItemsLoader) ygbVar : null;
        if (channelsListItemsLoader == null) {
            throw new IllegalStateException("Only ChannelsListItemsLoader is supported in ChannelsListFeature");
        }
        this.n = channelsListItemsLoader;
    }

    public final void v(long j, ChannelEntryPoint.FolderRecommendations folderRecommendations) {
        Object obj;
        Iterator<T> it = g().a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            hfz hfzVar = (hfz) obj;
            if (((hfzVar instanceof pcf0) && ((pcf0) hfzVar).b == j) || ((hfzVar instanceof mcf0) && ((mcf0) hfzVar).b == j)) {
                break;
            }
        }
        if (obj != null) {
            this.l.b(j);
            this.t = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MESSENGER_RECOMMENDATION, null, null, null, null, null, 62, null);
        }
        m(new c.a(j, folderRecommendations));
    }
}
