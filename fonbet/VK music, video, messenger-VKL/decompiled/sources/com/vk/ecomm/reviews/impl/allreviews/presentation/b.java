package com.vk.ecomm.reviews.impl.allreviews.presentation;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.api.model.createreview.CreateCommunityReviewData;
import com.vk.ecomm.reviews.impl.allreviews.domain.model.ItemStatus;
import com.vk.ecomm.reviews.impl.allreviews.presentation.a;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.disposables.g;
import io.reactivex.rxjava3.internal.operators.mixed.k;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a610;
import xsna.a7f0;
import xsna.adz;
import xsna.ar;
import xsna.br;
import xsna.bv4;
import xsna.c5g;
import xsna.c8;
import xsna.cf10;
import xsna.cqv;
import xsna.cww;
import xsna.df10;
import xsna.dwg;
import xsna.epx;
import xsna.es00;
import xsna.f4z;
import xsna.fju;
import xsna.fkq0;
import xsna.fq1;
import xsna.fs00;
import xsna.ft00;
import xsna.gmj;
import xsna.gs00;
import xsna.hs00;
import xsna.iou;
import xsna.ir;
import xsna.ire;
import xsna.j9k;
import xsna.jjx;
import xsna.jr;
import xsna.ju;
import xsna.kf3;
import xsna.l2i;
import xsna.m1k;
import xsna.mzp0;
import xsna.nv2;
import xsna.o43;
import xsna.ox0;
import xsna.ps2;
import xsna.qcl;
import xsna.qcw;
import xsna.r9k;
import xsna.ri0;
import xsna.rsg0;
import xsna.s41;
import xsna.smg;
import xsna.tfx;
import xsna.uf1;
import xsna.vsq;
import xsna.vx6;
import xsna.wj50;
import xsna.wk50;
import xsna.wpg;
import xsna.ws00;
import xsna.xs00;
import xsna.xsq;
import xsna.yd10;
import xsna.yfb;
import xsna.yh1;
import xsna.yhu;
import xsna.yi2;
import xsna.ys00;

/* compiled from: MarketAllReviewsFeature.kt */
/* loaded from: classes18.dex */
public final class b extends wk50<e, ft00, a, c> {
    public final smg f;
    public final mzp0 g;
    public final g h;
    public final g i;
    public final f4z j;
    public final f4z k;
    public final ys00 l;

    public b(d dVar, smg smgVar, mzp0 mzp0Var) {
        super(a.c.b, dVar);
        this.f = smgVar;
        this.g = mzp0Var;
        this.h = new g();
        this.i = new g();
        f4z f4zVar = new f4z();
        this.j = f4zVar;
        this.k = new f4z();
        this.l = new ys00(f4zVar);
    }

    @Override // xsna.wk50
    public final void N(ft00 ft00Var, a aVar) {
        Object obj;
        UserId userId;
        UserId userId2;
        UserId userId3;
        ft00 ft00Var2 = ft00Var;
        a aVar2 = aVar;
        List<a610> list = ft00Var2.e;
        MarketAllReviewsTabTypes marketAllReviewsTabTypes = ft00Var2.t;
        List<cf10> list2 = ft00Var2.l;
        List<df10> list3 = ft00Var2.h;
        if (ft00Var2.o) {
            return;
        }
        if (aVar2 instanceof a.c) {
            T(c.b.b);
            Y();
            return;
        }
        if (aVar2 instanceof a.n) {
            T(c.k.b);
            Y();
            return;
        }
        if (aVar2 instanceof a.p) {
            T(c.b.b);
            Y();
            return;
        }
        if (aVar2 instanceof a.m) {
            if (ft00Var2.b() || ft00Var2.r != null) {
                return;
            }
            if (ft00Var2.g <= 0 || ft00Var2.s == null) {
                if (marketAllReviewsTabTypes == MarketAllReviewsTabTypes.MARKET_ITEM) {
                    X(list3.size());
                }
                if (marketAllReviewsTabTypes == MarketAllReviewsTabTypes.COMMUNITY) {
                    W(ft00Var2);
                    return;
                }
                return;
            }
            return;
        }
        if (aVar2 instanceof a.l) {
            if (ft00Var2.b()) {
                return;
            }
            if (marketAllReviewsTabTypes == MarketAllReviewsTabTypes.MARKET_ITEM) {
                X(list3.size());
            }
            if (marketAllReviewsTabTypes == MarketAllReviewsTabTypes.COMMUNITY) {
                W(ft00Var2);
                return;
            }
            return;
        }
        if (aVar2 instanceof a.b) {
            a.b bVar = (a.b) aVar2;
            List<df10> list4 = list3;
            ArrayList arrayList = new ArrayList(c5g.u(list4, 10));
            for (df10 df10Var : list4) {
                if (epx.f(df10Var.d, bVar.b)) {
                    df10Var = df10.a(df10Var, !df10Var.q, false, 983039);
                }
                arrayList.add(df10Var);
            }
            T(new c.m(arrayList));
            return;
        }
        if (aVar2 instanceof a.C1004a) {
            a.C1004a c1004a = (a.C1004a) aVar2;
            List<cf10> list5 = list2;
            ArrayList arrayList2 = new ArrayList(c5g.u(list5, 10));
            for (cf10 cf10Var : list5) {
                if (cf10Var.a == c1004a.b) {
                    cf10Var = cf10.a(cf10Var, !cf10Var.l, false, 63487);
                }
                arrayList2.add(cf10Var);
            }
            T(new c.l(arrayList2));
            return;
        }
        boolean z = aVar2 instanceof a.o;
        g gVar = this.i;
        if (z) {
            gVar.b(null);
            T(new c.n(((a.o) aVar2).b));
            return;
        }
        boolean z2 = aVar2 instanceof a.q;
        f4z f4zVar = this.j;
        if (z2) {
            a.q qVar = (a.q) aVar2;
            long j = qVar.b;
            float f = qVar.d;
            List<a610> list6 = list;
            ArrayList arrayList3 = new ArrayList(c5g.u(list6, 10));
            for (a610 a610Var : list6) {
                if (a610Var.c == j) {
                    a610Var = a610.a(a610Var, false, f, 127);
                }
                arrayList3.add(a610Var);
            }
            f4zVar.b(new xs00.d(j, qVar.c, Float.valueOf(f)));
            T(new c.d.a(arrayList3));
            return;
        }
        boolean z3 = aVar2 instanceof a.k;
        g gVar2 = this.h;
        if (z3) {
            a.k kVar = (a.k) aVar2;
            Integer num = kVar.e;
            boolean z4 = kVar.d;
            if (num != null && z4) {
                T(c.b.b);
                Y();
                return;
            }
            if (z4) {
                gVar2.b(q.B0(1L, TimeUnit.SECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new fs00(new uf1(23, ft00Var2, this), 0)));
            }
            List<a610> list7 = list;
            ArrayList arrayList4 = new ArrayList(c5g.u(list7, 10));
            for (a610 a610Var2 : list7) {
                if (a610Var2.c == kVar.b) {
                    a610Var2 = a610.a(a610Var2, z4, z4 ? kVar.c : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 63);
                }
                arrayList4.add(a610Var2);
            }
            T(new c.d.a(arrayList4));
            return;
        }
        boolean z5 = aVar2 instanceof a.g;
        f4z f4zVar2 = this.k;
        smg smgVar = this.f;
        if (z5) {
            a.g gVar3 = (a.g) aVar2;
            if (gVar3 instanceof a.g.c) {
                a.g.c cVar = (a.g.c) gVar3;
                int i = cVar.b;
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((cf10) next).a == i) {
                        r8 = next;
                        break;
                    }
                }
                cf10 cf10Var2 = (cf10) r8;
                if (cf10Var2 != null) {
                    f4zVar2.b(new ws00.b(cVar.c, i, cf10Var2.m, cf10Var2.n));
                    return;
                }
                return;
            }
            if (gVar3 instanceof a.g.C1006a) {
                a.g.C1006a c1006a = (a.g.C1006a) gVar3;
                T(c.j.b);
                gVar.b(null);
                a7f0.a.f(this, rsg0.w0(yfb.x(((yd10) smgVar.b).v(c1006a.b))).l(new yi2(new nv2(24, ft00Var2, c1006a), 25)), new yhu(this, 4), new r9k(this, 24), 1);
                return;
            }
            if (!(gVar3 instanceof a.g.b)) {
                if (!(gVar3 instanceof a.g.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                a.g.d dVar = (a.g.d) gVar3;
                T(c.j.b);
                gVar.b(null);
                a7f0.a.f(this, rsg0.w0(yfb.x(((yd10) smgVar.b).B(dVar.b))).l(new fq1(new ju(9, ft00Var2, dVar), 22)), new m1k(this, 21), new qcl(this, 24), 1);
                return;
            }
            a.g.b bVar2 = (a.g.b) gVar3;
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((cf10) next2).a == bVar2.b) {
                    r8 = next2;
                    break;
                }
            }
            cf10 cf10Var3 = (cf10) r8;
            if (cf10Var3 != null) {
                f4zVar.b(new xs00.a(fkq0.e(new UserId(cf10Var3.b)), new CreateCommunityReviewData(null, null, null, Integer.valueOf(cf10Var3.a), 7, null)));
                return;
            }
            return;
        }
        if (!(aVar2 instanceof a.j)) {
            if (aVar2 instanceof a.d) {
                int i2 = ((a.d) aVar2).b;
                if (i2 == ft00Var2.d) {
                    return;
                }
                gVar2.b(null);
                T(new c.d.b(i2));
                return;
            }
            boolean z6 = aVar2 instanceof a.e.b;
            ys00 ys00Var = this.l;
            if (z6) {
                ys00Var.a((a.e) aVar2, ft00Var2);
                return;
            }
            if (aVar2 instanceof a.e.C1005a) {
                ys00Var.a((a.e) aVar2, ft00Var2);
                return;
            }
            if (aVar2 instanceof a.h) {
                if (((a.h) aVar2).b.c == null) {
                    return;
                }
                T(c.b.b);
                Y();
                return;
            }
            if (aVar2 instanceof a.f) {
                a.f fVar = (a.f) aVar2;
                Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next3 = it3.next();
                    if (((cf10) next3).a == fVar.b) {
                        r8 = next3;
                        break;
                    }
                }
                if (((cf10) r8) != null) {
                    f4zVar.b(new xs00.c(new UserId(r8.b)));
                    return;
                }
                return;
            }
            if (!(aVar2 instanceof a.i)) {
                throw new NoWhenBranchMatchedException();
            }
            a.i iVar = (a.i) aVar2;
            Iterator<T> it4 = list3.iterator();
            while (true) {
                if (it4.hasNext()) {
                    obj = it4.next();
                    if (epx.f(((df10) obj).d, iVar.b)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            df10 df10Var2 = (df10) obj;
            if ((df10Var2 != null ? df10Var2.g : null) == null) {
                return;
            }
            ItemStatus itemStatus = df10Var2.p;
            if (itemStatus == ItemStatus.ACTIVE || itemStatus == ItemStatus.DISABLED || itemStatus == ItemStatus.HARDBANNED) {
                f4zVar.b(new xs00.e(df10Var2.f, df10Var2.g));
                return;
            }
            return;
        }
        a.j jVar = (a.j) aVar2;
        if (jVar instanceof a.j.c) {
            a.j.c cVar2 = (a.j.c) jVar;
            String str = cVar2.b;
            Iterator<T> it5 = list3.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                Object next4 = it5.next();
                if (epx.f(((df10) next4).d, str)) {
                    r8 = next4;
                    break;
                }
            }
            df10 df10Var3 = (df10) r8;
            if (df10Var3 != null) {
                f4zVar2.b(new ws00.c(cVar2.c, str, df10Var3.r, df10Var3.s));
                return;
            }
            return;
        }
        if (jVar instanceof a.j.C1007a) {
            a.j.C1007a c1007a = (a.j.C1007a) jVar;
            T(c.j.b);
            Iterator<T> it6 = list3.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                Object next5 = it6.next();
                if (epx.f(((df10) next5).d, c1007a.b)) {
                    r8 = next5;
                    break;
                }
            }
            df10 df10Var4 = (df10) r8;
            if (df10Var4 == null || (userId3 = df10Var4.g) == null || df10Var4.t) {
                return;
            }
            a7f0.a.f(this, rsg0.w0(yfb.x(((yd10) smgVar.b).t(userId3, df10Var4.f, df10Var4.e))).l(new gs00(new o43(26, ft00Var2, c1007a), 0)), new hs00(this, 0), new fju(this, 5), 1);
            return;
        }
        if (jVar instanceof a.j.d) {
            a.j.d dVar2 = (a.j.d) jVar;
            T(c.j.b);
            Iterator<T> it7 = list3.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    break;
                }
                Object next6 = it7.next();
                if (epx.f(((df10) next6).d, dVar2.b)) {
                    r8 = next6;
                    break;
                }
            }
            df10 df10Var5 = (df10) r8;
            if (df10Var5 == null || (userId2 = df10Var5.g) == null || !df10Var5.t) {
                return;
            }
            a7f0.a.f(this, rsg0.w0(yfb.x(((yd10) smgVar.b).m(userId2, df10Var5.f, df10Var5.e))).l(new yh1(new ri0(19, ft00Var2, dVar2), 23)), new es00(this, 0), new iou(this, 12), 1);
            return;
        }
        if (!(jVar instanceof a.j.b)) {
            throw new NoWhenBranchMatchedException();
        }
        a.j.b bVar3 = (a.j.b) jVar;
        Iterator<T> it8 = list3.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next7 = it8.next();
            if (epx.f(((df10) next7).d, bVar3.b)) {
                r8 = next7;
                break;
            }
        }
        df10 df10Var6 = (df10) r8;
        if (df10Var6 == null || (userId = df10Var6.g) == null) {
            return;
        }
        f4zVar.b(new xs00.b(userId, df10Var6.f, df10Var6.e));
    }

    public final f4z U() {
        return this.k;
    }

    public final wj50<xs00> V() {
        return this.j;
    }

    public final void W(ft00 ft00Var) {
        T(c.h.b);
        List<cf10> list = ft00Var.l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((cf10) obj).o) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        smg smgVar = this.f;
        yd10 yd10Var = (yd10) smgVar.b;
        Integer valueOf = Integer.valueOf(size);
        yd10Var.getClass();
        tfx tfxVar = new tfx("market.getUserReviewsCommunities", new ir(25), new jr(20));
        tfxVar.f(20, 1, 100, SignalingProtocol.KEY_LIMIT);
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, valueOf.intValue(), 0, 0, 8);
        this.i.b(a7f0.a.f(this, rsg0.w0(yfb.x(tfxVar)).l(new ox0(new j9k(smgVar, 27), 25)).l(new kf3(new xsq(13), 25)), new dwg(this, 29), new cww(this, 4), 1));
    }

    public final void X(int i) {
        T(c.h.b);
        smg smgVar = this.f;
        yd10 yd10Var = (yd10) smgVar.b;
        Integer valueOf = Integer.valueOf(i);
        yd10Var.getClass();
        tfx tfxVar = new tfx("market.getUserReviewsItems", new k(22), new n(19));
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, valueOf.intValue(), 0, 0, 8);
        tfxVar.f(20, 0, 100, SignalingProtocol.KEY_LIMIT);
        this.i.b(a7f0.a.f(this, rsg0.w0(yfb.x(tfxVar)).l(new adz(new gmj(smgVar, 21), 2)).l(new c8(new qcw(2), 18)), new cqv(this, 8), new wpg(this, 24), 1));
    }

    public final void Y() {
        mzp0 mzp0Var = this.g;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        smg smgVar = this.f;
        ((yd10) smgVar.b).getClass();
        a7f0.a.f(this, x.B(rsg0.w0(yfb.x(new tfx("market.getUserReviewsAggregated", new ar(21), new br(21)))).l(new s41(new jjx(smgVar, 2), 21)), x.t(1L, TimeUnit.SECONDS), new vx6(new bv4((byte) 0, 5), 20)).l(new ps2(new vsq(11), 23)), new l2i(this, 26), new ire(this, 25), 1);
    }
}
