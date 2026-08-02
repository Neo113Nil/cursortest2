package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class oj5 implements et8 {
    public final /* synthetic */ List a;
    public final /* synthetic */ gv9 b;
    public final /* synthetic */ hj5 c;
    public final /* synthetic */ e1d d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ cdi g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ pj5 i;
    public final /* synthetic */ double j;
    public final /* synthetic */ cdi k;
    public final /* synthetic */ cdi l;
    public final /* synthetic */ double m;

    public oj5(List list, gv9 gv9Var, hj5 hj5Var, e1d e1dVar, int i, int i2, cdi cdiVar, boolean z, pj5 pj5Var, double d, cdi cdiVar2, cdi cdiVar3, double d2) {
        this.a = list;
        this.b = gv9Var;
        this.c = hj5Var;
        this.d = e1dVar;
        this.e = i;
        this.f = i2;
        this.g = cdiVar;
        this.h = z;
        this.i = pj5Var;
        this.j = d;
        this.k = cdiVar2;
        this.l = cdiVar3;
        this.m = d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v61 */
    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long j;
        Object obj5;
        Object obj6;
        boolean z;
        int i;
        boolean z2;
        e1d e1dVar;
        boolean z3;
        float f;
        boolean z4;
        cdi cdiVar;
        xtc e;
        long j2;
        jf9 jf9Var;
        long j3;
        boolean z5;
        cdi cdiVar2;
        pj5 pj5Var;
        ff3 ff3Var;
        f50 f50Var;
        ry ryVar;
        ?? r1;
        pj5 pj5Var2;
        boolean z6;
        utc utcVar;
        long j4;
        boolean z7;
        xtc e2;
        boolean z8;
        boolean z9;
        float f2;
        float f3;
        float f4;
        jf9 jf9Var2 = oyn.e;
        xpa xpaVar = (xpa) obj;
        int intValue = ((Number) obj2).intValue();
        of3 of3Var = (of3) obj3;
        int intValue2 = ((Number) obj4).intValue();
        mv1 mv1Var = uxf.c;
        mv1 mv1Var2 = uxf.g;
        int i2 = (intValue2 & 6) == 0 ? (((av8) of3Var).g(xpaVar) ? 4 : 2) | intValue2 : intValue2;
        if ((intValue2 & 48) == 0) {
            i2 |= ((av8) of3Var).e(intValue) ? 32 : 16;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            gj5 gj5Var = (gj5) this.a.get(intValue);
            av8Var.d0(-798052002);
            boolean a = gj5Var.a();
            boolean z10 = gj5Var.w;
            int i3 = gj5Var.a;
            if (a) {
                j = ljg.f(av8Var, -2103964203, R.color.surface_1, av8Var, false);
            } else {
                av8Var.d0(-2103963405);
                av8Var.s(false);
                j = r13.h;
            }
            gv9 gv9Var = this.b;
            Iterator<E> it = gv9Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj5 = null;
                    break;
                }
                obj5 = it.next();
                if (((gj5) obj5).a()) {
                    break;
                }
            }
            gj5 gj5Var2 = (gj5) obj5;
            int i4 = gj5Var2 != null ? gj5Var2.a : -1;
            ListIterator listIterator = gv9Var.listIterator(gv9Var.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj6 = null;
                    break;
                }
                obj6 = listIterator.previous();
                if (((gj5) obj6).a()) {
                    break;
                }
            }
            gj5 gj5Var3 = (gj5) obj6;
            int i5 = gj5Var3 != null ? gj5Var3.a : -1;
            boolean z11 = i3 == i4;
            boolean z12 = i3 == i5;
            hj5 hj5Var = this.c;
            boolean z13 = hj5Var.b;
            boolean z14 = z13 && (gj5Var.a() || (i4 <= i3 && i3 <= i5));
            utc utcVar2 = utc.a;
            boolean z15 = z14;
            xtc d = bkh.d(utcVar2, 1.0f);
            e1d e1dVar2 = this.d;
            if (((Boolean) e1dVar2.getValue()).booleanValue()) {
                z = z10;
                i = i3;
                z2 = z13;
                e1dVar = e1dVar2;
                z3 = false;
                d = d.z(gz8.y(s02.h0(this.e, 0, null, 6)));
            } else {
                z = z10;
                i = i3;
                z2 = z13;
                e1dVar = e1dVar2;
                z3 = false;
            }
            xtc Y = fz8.Y(d, n9a.b);
            k1c c = e12.c(mv1Var, z3);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, Y);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var2 = hf3.g;
            waa.K(av8Var, c, f50Var2);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var, m, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var3 = hf3.j;
            waa.K(av8Var, valueOf, f50Var3);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            boolean z16 = z11;
            f50 f50Var4 = hf3.d;
            waa.K(av8Var, C, f50Var4);
            xtc r = bkh.r(utcVar2, null, 3);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            long j5 = j;
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, r);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var2);
            waa.K(av8Var, m2, ff3Var2);
            bf3.s(hashCode2, av8Var, f50Var3, av8Var, ryVar2);
            waa.K(av8Var, C2, f50Var4);
            boolean booleanValue = ((Boolean) e1dVar.getValue()).booleanValue();
            cdi cdiVar3 = this.g;
            if (booleanValue) {
                av8Var.d0(610134089);
                int a3 = wzb.a(Math.pow(2.0d, 2 - (((Number) cdiVar3.getValue()).intValue() - this.f)));
                for (int i6 = 0; i6 < a3; i6++) {
                    nq8.h(av8Var, bkh.e(utcVar2, 19.0f));
                }
                av8Var.s(false);
            } else {
                av8Var.d0(610431038);
                av8Var.s(false);
            }
            av8Var.s(true);
            n12 n12Var = n12.a;
            xtc d2 = bkh.d(bkh.c(n12Var.a(utcVar2, mv1Var2), 1.0f), 1.0f);
            u23 a4 = t23.a(ww9.f, uxf.q, av8Var, 54);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d2);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var5 = hf3.g;
            waa.K(av8Var, a4, f50Var5);
            ff3 ff3Var3 = hf3.f;
            waa.K(av8Var, m3, ff3Var3);
            Integer valueOf2 = Integer.valueOf(hashCode3);
            f50 f50Var6 = hf3.j;
            waa.K(av8Var, valueOf2, f50Var6);
            ry ryVar3 = hf3.k;
            waa.J(av8Var, ryVar3);
            f50 f50Var7 = hf3.d;
            waa.K(av8Var, C3, f50Var7);
            boolean z17 = this.h;
            cdi cdiVar4 = this.k;
            if (!z2 || z16) {
                f = Float.MAX_VALUE;
                av8Var.d0(-1462402315);
                if (((Boolean) e1dVar.getValue()).booleanValue()) {
                    av8Var.d0(-814277810);
                    z4 = z17;
                    cdiVar = cdiVar4;
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    e = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    av8Var.s(false);
                } else {
                    z4 = z17;
                    cdiVar = cdiVar4;
                    av8Var.d0(-41251377);
                    e = bkh.e(utcVar2, ((p75) cdiVar.getValue()).a);
                    av8Var.s(false);
                }
                xtc p = bkh.p(e, (i % 2 != 0 || z4 || z2) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 4.0f);
                j2 = j5;
                jf9Var = jf9Var2;
                nq8.h(av8Var, n9e.q(p, j2, jf9Var));
                av8Var.s(false);
            } else {
                f = Float.MAX_VALUE;
                av8Var.d0(-1461585465);
                av8Var.s(false);
                z4 = z17;
                cdiVar = cdiVar4;
                j2 = j5;
                jf9Var = jf9Var2;
            }
            double d3 = this.j;
            int i7 = (int) (d3 / 16.0d);
            int i8 = i7 + 1;
            if (i7 % 2 != 0) {
                i7 = i8;
            }
            if (!z15 || z16) {
                j3 = j2;
                z5 = false;
            } else {
                j3 = j2;
                z5 = true;
            }
            boolean booleanValue2 = ((Boolean) e1dVar.getValue()).booleanValue();
            float f5 = ((p75) cdiVar.getValue()).a;
            jf9 jf9Var3 = jf9Var;
            pj5 pj5Var3 = this.i;
            long j6 = j3;
            int i9 = i7;
            cdi cdiVar5 = cdiVar;
            e1d e1dVar3 = e1dVar;
            boolean z18 = z4;
            pj5Var3.H(i9, z5, d3, booleanValue2, f5, av8Var, 6);
            cdi cdiVar6 = this.l;
            xtc d4 = bkh.d(bkh.e(utcVar2, ((p75) cdiVar6.getValue()).a), 1.0f);
            lv1 lv1Var = uxf.m;
            wxf wxfVar = ww9.b;
            l8g a5 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, d4);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a5, f50Var5);
            waa.K(av8Var, m4, ff3Var3);
            bf3.s(hashCode4, av8Var, f50Var6, av8Var, ryVar3);
            waa.K(av8Var, C4, f50Var7);
            nq8.h(av8Var, n9e.q(bkh.e(bkh.p(utcVar2, 18.0f), (!gj5Var.k || hj5Var.c) ? 0.0f : 4.0f), j6, jf9Var3));
            goa goaVar = new goa(1.0f, true);
            int intValue3 = ((Number) cdiVar3.getValue()).intValue();
            boolean booleanValue3 = ((Boolean) e1dVar3.getValue()).booleanValue();
            boolean g = av8Var.g(gj5Var) | av8Var.i(pj5Var3);
            Object O = av8Var.O();
            if (g || O == nf3.a) {
                O = new pi(5, gj5Var, pj5Var3);
                av8Var.n0(O);
            }
            t74.a(goaVar, gj5Var, j6, this.f, intValue3, this.m, booleanValue3, (Function0) O, av8Var, 0);
            if (z15 && gj5Var.a()) {
                av8Var.d0(210176441);
                cdiVar2 = cdiVar6;
                xtc p2 = bkh.p(utcVar2, 16.0f);
                l8g a6 = k8g.a(wxfVar, uxf.l, av8Var, 0);
                int hashCode5 = Long.hashCode(av8Var.T);
                aee m5 = av8Var.m();
                xtc C5 = fqj.C(av8Var, p2);
                av8Var.h0();
                pj5Var = pj5Var3;
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a6, f50Var5);
                ff3Var = ff3Var3;
                waa.K(av8Var, m5, ff3Var);
                ryVar = ryVar3;
                bf3.s(hashCode5, av8Var, f50Var6, av8Var, ryVar);
                waa.K(av8Var, C5, f50Var7);
                f50Var = f50Var6;
                nq8.h(av8Var, n9e.q(bkh.e(bkh.p(utcVar2, 5.0f), 2.0f), lz.D(R.color.surface_1, av8Var), jf9Var3));
                nq8.h(av8Var, bkh.e(bkh.p(utcVar2, 6.0f), 2.0f));
                nq8.h(av8Var, n9e.q(bkh.e(bkh.p(utcVar2, 5.0f), 2.0f), lz.D(R.color.surface_1, av8Var), jf9Var3));
                av8Var.s(true);
                av8Var.s(false);
            } else {
                cdiVar2 = cdiVar6;
                pj5Var = pj5Var3;
                ff3Var = ff3Var3;
                f50Var = f50Var6;
                ryVar = ryVar3;
                av8Var.d0(211569891);
                av8Var.s(false);
            }
            if (z2) {
                r1 = 0;
                av8Var.d0(212132355);
                av8Var.s(false);
            } else {
                av8Var.d0(211655699);
                nq8.h(av8Var, n9e.q(bkh.e(bkh.p(utcVar2, 18.0f), !z18 ? 4.0f : 0.0f), j6, jf9Var3));
                r1 = 0;
                av8Var.s(false);
            }
            if (z15) {
                av8Var.d0(212212242);
                pj5 pj5Var4 = pj5Var;
                z6 = z12;
                pj5Var4.G(r1, av8Var, z16, z6);
                av8Var.s(r1);
                pj5Var2 = pj5Var4;
            } else {
                pj5Var2 = pj5Var;
                z6 = z12;
                av8Var.d0(212351587);
                av8Var.s(r1);
            }
            if (z2) {
                utcVar = utcVar2;
                av8Var.d0(213392195);
                av8Var.s(false);
            } else {
                av8Var.d0(212452337);
                int i10 = i % 2;
                if (i10 == 1) {
                    f2 = 2.0f;
                    float f6 = (((p75) cdiVar2.getValue()).a / 2.0f) - 2.0f;
                    if (f6 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f6 = 0.0f;
                    }
                    f3 = f6;
                } else {
                    f2 = 2.0f;
                    f3 = 0.0f;
                }
                if (i10 == 0) {
                    float f7 = (((p75) cdiVar2.getValue()).a / f2) - f2;
                    if (f7 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f7 = 0.0f;
                    }
                    f4 = f7;
                } else {
                    f4 = 0.0f;
                }
                utcVar = utcVar2;
                nq8.h(av8Var, n9e.q(bkh.e(bkh.p(l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, 5), !z18 ? 4.0f : 0.0f), (((p75) cdiVar2.getValue()).a / 2.0f) + 2.0f), j6, jf9Var3));
                av8Var.s(false);
            }
            av8Var.s(true);
            if (!z15 || z6) {
                j4 = j6;
                z7 = false;
            } else {
                j4 = j6;
                z7 = true;
            }
            long j7 = j4;
            pj5Var2.H(i9, z7, this.j, ((Boolean) e1dVar3.getValue()).booleanValue(), ((p75) cdiVar5.getValue()).a, av8Var, 6);
            av8 av8Var2 = av8Var;
            if (!z2 || z6) {
                av8Var2.d0(-1455756907);
                if (((Boolean) e1dVar3.getValue()).booleanValue()) {
                    av8Var2.d0(103071429);
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    e2 = new goa(1.0f > f ? f : 1.0f, true);
                    av8Var2.s(false);
                } else {
                    av8Var2.d0(-47868666);
                    e2 = bkh.e(utcVar, ((p75) cdiVar5.getValue()).a);
                    av8Var2.s(false);
                }
                nq8.h(av8Var2, n9e.q(bkh.p(e2, (i % 2 != 1 || z18 || z2) ? 0.0f : 4.0f), j7, jf9Var3));
                av8Var2.s(false);
            } else {
                av8Var2.d0(-1454940057);
                av8Var2.s(false);
            }
            av8Var2.s(true);
            if ((z || gj5Var.x) && gj5Var.a()) {
                av8Var2.d0(726391385);
                long f8 = z ? ljg.f(av8Var2, 993264632, R.color.value, av8Var2, false) : ljg.f(av8Var2, 993265153, R.color.neutral_default, av8Var2, false);
                int i11 = z ? R.string.final_string : R.string.third_place;
                float f9 = ((p75) cdiVar5.getValue()).a - 8.0f;
                utc utcVar3 = utcVar;
                xtc a7 = n12Var.a(bkh.g(l98.d0(n9e.q(l98.f0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f9 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : f9, 7), f8, o7g.a(8.0f)), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), uxf.j);
                k1c c2 = e12.c(mv1Var, false);
                int hashCode6 = Long.hashCode(av8Var2.T);
                aee m6 = av8Var2.m();
                xtc C6 = fqj.C(av8Var2, a7);
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var2);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, c2, f50Var5);
                waa.K(av8Var2, m6, ff3Var);
                bf3.s(hashCode6, av8Var2, f50Var, av8Var2, ryVar);
                waa.K(av8Var2, C6, f50Var7);
                String v = oea.v(i11, av8Var2);
                xtc a8 = n12Var.a(utcVar3, mv1Var2);
                long D = lz.D(R.color.surface_1, av8Var2);
                yf8 yf8Var = xth.a;
                q5a.w(v, a8, D, null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.c(), av8Var2, 0, 0, 131064);
                av8Var2 = av8Var2;
                z8 = true;
                av8Var2.s(true);
                z9 = false;
                av8Var2.s(false);
            } else {
                z8 = true;
                z9 = false;
                av8Var2.d0(727770420);
                av8Var2.s(false);
            }
            av8Var2.s(z8);
            av8Var2.s(z9);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
