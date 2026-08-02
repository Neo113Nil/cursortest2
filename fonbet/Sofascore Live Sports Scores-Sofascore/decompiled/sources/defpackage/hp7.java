package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class hp7 implements ct8 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ qp7 b;
    public final /* synthetic */ ev6 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ hp7(qp7 qp7Var, ev6 ev6Var, Function1 function1) {
        this.b = qp7Var;
        this.c = ev6Var;
        this.d = function1;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        qp7 qp7Var;
        float f;
        float f2;
        String w;
        int i = this.a;
        Function1 function1 = this.d;
        qp7 qp7Var2 = this.b;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).h(booleanValue) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (!av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    av8Var.W();
                } else if (booleanValue) {
                    av8Var.d0(1226222677);
                    s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 62, 0L, 0L, av8Var, bkh.c);
                    av8Var.s(false);
                } else {
                    av8Var.d0(1226457347);
                    q5a.p(bkh.c, null, yqo.H(2147265259, av8Var, new ip7(qp7Var2, function1)), null, null, 0, r13.h, 0L, null, yqo.H(1774505781, av8Var, new hp7(qp7Var2, this.c, function1)), av8Var, 806879622, 442);
                    av8Var.s(false);
                }
                return Unit.a;
            default:
                p3e p3eVar = (p3e) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                p3eVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(p3eVar) ? 4 : 2;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    float a = p3eVar.a();
                    utc utcVar = utc.a;
                    xtc f0 = l98.f0(hkg.u0(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a, 7), hkg.o0(av8Var2), false, 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 7);
                    p4h p4hVar = ww9.d;
                    kv1 kv1Var = uxf.o;
                    u23 a2 = t23.a(p4hVar, kv1Var, av8Var2, 0);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, f0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var2, a2, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var2, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var2, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var2, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var2, C, f50Var3);
                    int i2 = qp7Var2.b;
                    gv9 gv9Var = qp7Var2.h;
                    ev6 ev6Var = this.c;
                    int i3 = ev6Var.n;
                    int i4 = ev6Var.r;
                    if (i2 != i3) {
                        i4++;
                    }
                    String w2 = oea.w(R.string.fantasy_round_x_fixtures, new Object[]{Integer.valueOf(i4)}, av8Var2);
                    long D = lz.D(R.color.n_lv_1, av8Var2);
                    xtc b0 = l98.b0(utcVar, 16.0f);
                    yf8 yf8Var = xth.a;
                    udj.c(w2, b0, D, null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.l(), av8Var2, 48, 24576, 114680);
                    tol.b(nyd.a.a(null), yqo.H(1494474175, av8Var2, new hl7(qp7Var2, 7)), av8Var2, 56);
                    float f3 = 8.0f;
                    if (gv9Var.isEmpty()) {
                        qp7Var = qp7Var2;
                        f = 8.0f;
                        f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        av8Var2.d0(1860412739);
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(1859510639);
                        ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                        qp7Var = qp7Var2;
                        xtc x = gz8.x(bkh.d(utcVar, 1.0f), null, null, 3);
                        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        xtc d0 = l98.d0(x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                        u23 a3 = t23.a(ng0Var, kv1Var, av8Var2, 6);
                        int hashCode2 = Long.hashCode(av8Var2.T);
                        aee m2 = av8Var2.m();
                        xtc C2 = fqj.C(av8Var2, d0);
                        av8Var2.h0();
                        if (av8Var2.S) {
                            av8Var2.l(zg3Var);
                        } else {
                            av8Var2.q0();
                        }
                        waa.K(av8Var2, a3, f50Var);
                        waa.K(av8Var2, m2, ff3Var);
                        bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                        Iterator p = ljg.p(av8Var2, C2, f50Var3, -1709118349, gv9Var);
                        while (p.hasNext()) {
                            tp7 tp7Var = (tp7) p.next();
                            if (tp7Var instanceof rp7) {
                                av8Var2.d0(1318354544);
                                w = oea.v(tp7Var.a, av8Var2);
                                av8Var2.s(false);
                            } else {
                                if (!(tp7Var instanceof sp7)) {
                                    throw dmi.h(av8Var2, 1318351463, false);
                                }
                                av8Var2.d0(1318358834);
                                int i5 = tp7Var.a;
                                sp7 sp7Var = (sp7) tp7Var;
                                w = oea.w(i5, new Object[]{sp7Var.b, Integer.valueOf(sp7Var.c)}, av8Var2);
                                av8Var2.s(false);
                            }
                            String str = w;
                            float f5 = f4;
                            float f6 = f3;
                            i2a.l(0, 0L, av8Var2, null, str);
                            f3 = f6;
                            f4 = f5;
                        }
                        f2 = f4;
                        f = f3;
                        ljg.t(av8Var2, false, true, false);
                    }
                    nq8.h(av8Var2, bkh.e(utcVar, 16.0f));
                    gv9 gv9Var2 = qp7Var.d;
                    boolean g = av8Var2.g(function1);
                    Object O = av8Var2.O();
                    if (g || O == nf3.a) {
                        O = new k46(26, function1);
                        av8Var2.n0(O);
                    }
                    t62.i(gv9Var2, ev6Var, null, (Function1) O, av8Var2, 0);
                    x2a.d(bf3.g(16.0f, R.string.fantasy_selection_info, av8Var2, av8Var2, utcVar), l98.d0(utcVar, f, f2, 2), null, 0L, 0L, lz.D(R.color.surface_1, av8Var2), null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var2, 48, 0, 2012);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ hp7(qp7 qp7Var, Function1 function1, ev6 ev6Var) {
        this.b = qp7Var;
        this.d = function1;
        this.c = ev6Var;
    }
}
