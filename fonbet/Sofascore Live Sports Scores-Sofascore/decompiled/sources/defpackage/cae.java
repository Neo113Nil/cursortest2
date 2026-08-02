package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class cae {
    static {
        ypa.b(new t2e(3));
    }

    public static final void a(j6c j6cVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1351680338);
        int i2 = (av8Var.g(j6cVar) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            xtc d = bkh.d(yqo.u(utc.a, 15.0f, 15.0f, null), 1.0f);
            l8g a = k8g.a(ww9.g, uxf.l, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            av8Var.d0(-2027971663);
            int C0 = ((int) ((kx4) av8Var.k(dh3.h)).C0((int) (((ata) ((s8l) av8Var.k(dh3.u))).a() >> 32))) - 16;
            av8Var.s(false);
            int K0 = CollectionsKt.K0(CollectionsKt.L0(j6cVar.a, 2));
            Integer num = (Integer) CollectionsKt.a0(2, j6cVar.a);
            if (num == null) {
                av8Var.d0(1557653403);
                av8Var.s(false);
            } else {
                av8Var.d0(1557653404);
                int intValue = num.intValue();
                int min = Math.min(C0 / intValue, 112);
                av8Var.d0(-2027958706);
                int i3 = 0;
                while (i3 < intValue) {
                    b9b.c((n8b) j6cVar.b.get(K0), min, r8b.b, null, false, null, false, null, av8Var, 14183808);
                    i3++;
                    K0++;
                }
                av8Var.s(false);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bae(j6cVar, i, 0);
        }
    }

    public static final void b(j6c j6cVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1926362234);
        int i2 = (av8Var.g(j6cVar) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            av8Var.d0(-103199363);
            int C0 = ((int) ((kx4) av8Var.k(dh3.h)).C0((int) (((ata) ((s8l) av8Var.k(dh3.u))).a() >> 32))) - 16;
            av8Var.s(false);
            utc utcVar = utc.a;
            xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            int i3 = 6;
            u23 a = t23.a(ww9.h, uxf.o, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            av8Var.d0(-1134341789);
            Iterator it = CollectionsKt.L0(j6cVar.a, 2).iterator();
            int i4 = 0;
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                int min = Math.min(C0 / intValue, 112);
                xtc d = bkh.d(utcVar, 1.0f);
                l8g a2 = k8g.a(ww9.g, uxf.l, av8Var, i3);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, d);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a2, hf3.g);
                waa.K(av8Var, m2, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C2, hf3.d);
                av8Var.d0(658590748);
                int i5 = 0;
                while (i5 < intValue) {
                    int i6 = intValue;
                    int i7 = min;
                    b9b.c((n8b) j6cVar.b.get(i4), i7, r8b.b, null, false, null, false, null, av8Var, 14183808);
                    i5++;
                    min = i7;
                    i4++;
                    intValue = i6;
                }
                av8Var.s(false);
                av8Var.s(true);
                i3 = 6;
            }
            av8Var.s(false);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bae(j6cVar, i, 1);
        }
    }

    public static final void c(j6c j6cVar, Function0 function0, of3 of3Var, int i) {
        j6cVar.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-54996079);
        int i2 = (av8Var.g(j6cVar) ? 4 : 2) | i | (av8Var.i(function0) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            tol.b(dh3.n.a(ema.a), yqo.H(-2026071983, av8Var, new aae(function0, j6cVar)), av8Var, 56);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new aae(j6cVar, function0, i);
        }
    }
}
