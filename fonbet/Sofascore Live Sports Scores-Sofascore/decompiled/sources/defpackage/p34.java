package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class p34 implements ct8 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p34(xtc xtcVar, boolean z, boolean z2, Function0 function0, Function1 function1) {
        this.e = xtcVar;
        this.b = z;
        this.c = z2;
        this.f = function0;
        this.d = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v30, types: [xtc] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object] */
    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a99 a99Var;
        av8 av8Var;
        oxh oxhVar;
        boolean z;
        int i = this.a;
        a99 a99Var2 = nf3.a;
        boolean z2 = this.c;
        Object obj4 = this.f;
        Function1 function1 = this.d;
        Object obj5 = this.e;
        boolean z3 = this.b;
        utc utcVar = utc.a;
        switch (i) {
            case 0:
                xtc xtcVar = (xtc) obj5;
                Function0 function0 = (Function0) obj4;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 17) != 16)) {
                    nq8.h(av8Var2, bkh.e(utcVar, 8.0f));
                    xtc q = n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var2), (z3 || z2) ? o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12) : o7g.a(16.0f));
                    k1c c = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, q);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var2, c, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var2, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var2, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var2, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var2, C, f50Var3);
                    xtc b0 = l98.b0(utcVar, 16.0f);
                    u23 a = t23.a(ww9.d, uxf.o, av8Var2, 0);
                    int hashCode2 = Long.hashCode(av8Var2.T);
                    aee m2 = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, b0);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a, f50Var);
                    waa.K(av8Var2, m2, ff3Var);
                    bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                    waa.K(av8Var2, C2, f50Var3);
                    xtc q2 = n9e.q(bkh.d(wnn.A(utcVar, o7g.a(8.0f)), 1.0f), lz.D(R.color.surface_2, av8Var2), oyn.e);
                    boolean g = av8Var2.g(function0);
                    Object O = av8Var2.O();
                    if (g || O == a99Var2) {
                        O = new v61(7, function0);
                        av8Var2.n0(O);
                    }
                    xtc y = tol.y(q2, false, false, false, 0L, null, (Function0) O, av8Var2, 31);
                    k1c c2 = e12.c(uxf.g, false);
                    int hashCode3 = Long.hashCode(av8Var2.T);
                    aee m3 = av8Var2.m();
                    xtc C3 = fqj.C(av8Var2, y);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, c2, f50Var);
                    waa.K(av8Var2, m3, ff3Var);
                    bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
                    waa.K(av8Var2, C3, f50Var3);
                    String v = oea.v(R.string.commentary_goal, av8Var2);
                    yf8 yf8Var = xth.a;
                    udj.c(v, l98.b0(utcVar, 16.0f), lz.D(R.color.crowdsourcing, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.i(), av8Var2, 48, 0, 130040);
                    bf3.t(av8Var2, true, utcVar, 8.0f, av8Var2);
                    r34.a(function1, av8Var2, 0);
                    av8Var2.s(true);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                break;
            case 1:
                f6i f6iVar = (f6i) obj5;
                gv9 gv9Var = (gv9) obj4;
                of3 of3Var2 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                if (z3 && z2) {
                    av8 av8Var3 = (av8) of3Var2;
                    av8Var3.d0(1455137418);
                    tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 15, 0L, 0L, av8Var3, null);
                    av8Var3.s(false);
                } else {
                    av8 av8Var4 = (av8) of3Var2;
                    av8Var4.d0(1455201805);
                    av8Var4.s(false);
                }
                xtc d = bkh.d(utcVar, 1.0f);
                c6i c6iVar = f6iVar.c;
                a6i a6iVar = c6iVar != null ? c6iVar.b : null;
                hrh hrhVar = hrh.m;
                av8 av8Var5 = (av8) of3Var2;
                boolean g2 = av8Var5.g(function1);
                Object O2 = av8Var5.O();
                if (g2 || O2 == a99Var2) {
                    O2 = new k1e(13, function1);
                    av8Var5.n0(O2);
                }
                trh.a(gv9Var, a6iVar, (Function1) O2, d, null, null, hrhVar, false, false, false, null, null, av8Var5, 1575936, 4016);
                break;
            default:
                uza uzaVar = (uza) obj5;
                gv9 gv9Var2 = uzaVar.b;
                ksa ksaVar = (ksa) obj4;
                of3 of3Var3 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var6 = (av8) of3Var3;
                if (av8Var6.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    av8Var6.d0(-492643836);
                    xtc q3 = !z3 ? n9e.q(utcVar, lz.D(R.color.surface_1, av8Var6), oyn.e) : utcVar;
                    av8Var6.s(false);
                    xtc d2 = bkh.d(gz8.x(q3, null, null, 3), 1.0f);
                    u23 a2 = t23.a(ww9.d, uxf.o, av8Var6, 0);
                    int hashCode4 = Long.hashCode(av8Var6.T);
                    aee m4 = av8Var6.m();
                    xtc C4 = fqj.C(av8Var6, d2);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var6.h0();
                    if (av8Var6.S) {
                        av8Var6.l(zg3Var2);
                    } else {
                        av8Var6.q0();
                    }
                    f50 f50Var4 = hf3.g;
                    waa.K(av8Var6, a2, f50Var4);
                    ff3 ff3Var2 = hf3.f;
                    waa.K(av8Var6, m4, ff3Var2);
                    Integer valueOf2 = Integer.valueOf(hashCode4);
                    f50 f50Var5 = hf3.j;
                    waa.K(av8Var6, valueOf2, f50Var5);
                    ry ryVar2 = hf3.k;
                    waa.J(av8Var6, ryVar2);
                    f50 f50Var6 = hf3.d;
                    waa.K(av8Var6, C4, f50Var6);
                    xtc d3 = bkh.d(utcVar, 1.0f);
                    l8g a3 = k8g.a(ww9.b, uxf.m, av8Var6, 48);
                    int hashCode5 = Long.hashCode(av8Var6.T);
                    aee m5 = av8Var6.m();
                    xtc C5 = fqj.C(av8Var6, d3);
                    av8Var6.h0();
                    if (av8Var6.S) {
                        av8Var6.l(zg3Var2);
                    } else {
                        av8Var6.q0();
                    }
                    waa.K(av8Var6, a3, f50Var4);
                    waa.K(av8Var6, m5, ff3Var2);
                    bf3.s(hashCode5, av8Var6, f50Var5, av8Var6, ryVar2);
                    waa.K(av8Var6, C5, f50Var6);
                    gv9 gv9Var3 = uzaVar.e;
                    if (gv9Var2.size() > 1) {
                        av8Var6.d0(632912225);
                        av8Var6.d0(1821540052);
                        xtc d0 = l98.d0(fn0.e(0.7f, kda.O(utcVar, "sub_season_chips", av8Var6), true), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                        if (ksaVar.d() && z2) {
                            z = false;
                            d0 = d0.z(kda.M(3, av8Var6, utcVar, false, false));
                        } else {
                            z = false;
                        }
                        xtc xtcVar2 = d0;
                        av8Var6.s(z);
                        t3e B = l98.B(8.0f, 2);
                        gv9 gv9Var4 = uzaVar.b;
                        String str = uzaVar.g;
                        lrh lrhVar = z3 ? frh.m : hrh.m;
                        boolean g3 = av8Var6.g(function1);
                        Object O3 = av8Var6.O();
                        a99Var = a99Var2;
                        if (g3 || O3 == a99Var) {
                            O3 = new k1e(28, function1);
                            av8Var6.n0(O3);
                        }
                        trh.a(gv9Var4, str, (Function1) O3, xtcVar2, ksaVar, B, lrhVar, false, false, false, null, null, av8Var6, 196608, 3968);
                        av8Var = av8Var6;
                        av8Var.s(false);
                    } else {
                        a99Var = a99Var2;
                        av8Var = av8Var6;
                        av8Var.d0(633938418);
                        av8Var.s(false);
                    }
                    if (gv9Var3.isEmpty()) {
                        av8Var.d0(634899666);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(634064712);
                        Iterator it = gv9Var3.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ?? next = it.next();
                                if (Intrinsics.c(((oxh) next).a, uzaVar.f)) {
                                    oxhVar = next;
                                }
                            } else {
                                oxhVar = null;
                            }
                        }
                        oxh oxhVar2 = oxhVar;
                        t3e t3eVar = new t3e(8.0f, 8.0f, 8.0f, 8.0f);
                        uxh uxhVar = z3 ? rxh.i : sxh.i;
                        utc q4 = gv9Var2.size() > 1 ? bkh.q(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 140.0f, 1) : utcVar;
                        boolean g4 = av8Var.g(function1);
                        Object O4 = av8Var.O();
                        if (g4 || O4 == a99Var) {
                            O4 = new k1e(25, function1);
                            av8Var.n0(O4);
                        }
                        r4a.j(gv9Var3, oxhVar2, (Function1) O4, q4, uxhVar, false, t3eVar, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 12582912, 864);
                        av8Var.s(false);
                    }
                    av8Var.s(true);
                    if (uzaVar.c.isEmpty()) {
                        av8Var.d0(-285830354);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-286497970);
                        t3e t3eVar2 = new t3e(8.0f, 8.0f, 8.0f, 8.0f);
                        xtc O5 = kda.O(bkh.d(utcVar, 1.0f), "chip_filter", av8Var);
                        gv9 gv9Var5 = uzaVar.c;
                        lnj lnjVar = uzaVar.d;
                        lrh lrhVar2 = z3 ? frh.m : hrh.m;
                        boolean g5 = av8Var.g(function1);
                        Object O6 = av8Var.O();
                        if (g5 || O6 == a99Var) {
                            O6 = new k1e(26, function1);
                            av8Var.n0(O6);
                        }
                        trh.a(gv9Var5, lnjVar, (Function1) O6, O5, null, t3eVar2, lrhVar2, false, false, false, null, null, av8Var, 196608, 3984);
                        av8Var.s(false);
                    }
                    av8Var.s(true);
                } else {
                    av8Var6.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ p34(boolean z, uza uzaVar, Function1 function1, ksa ksaVar, boolean z2) {
        this.b = z;
        this.e = uzaVar;
        this.d = function1;
        this.f = ksaVar;
        this.c = z2;
    }

    public /* synthetic */ p34(boolean z, boolean z2, f6i f6iVar, gv9 gv9Var, Function1 function1) {
        this.b = z;
        this.c = z2;
        this.e = f6iVar;
        this.f = gv9Var;
        this.d = function1;
    }
}
