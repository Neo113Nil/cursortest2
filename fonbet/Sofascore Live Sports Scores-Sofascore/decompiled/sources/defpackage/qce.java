package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class qce {
    public static final joa a;
    public static final joa b;
    public static final joa c;

    static {
        t2e t2eVar = new t2e(5);
        ysa ysaVar = ysa.c;
        ypa.a(ysaVar, t2eVar);
        a = ypa.a(ysaVar, new t2e(6));
        b = ypa.a(ysaVar, new t2e(7));
        c = ypa.a(ysaVar, new t2e(8));
    }

    public static final void a(bze bzeVar, of3 of3Var, int i) {
        String str = bzeVar.c;
        String str2 = bzeVar.b;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1386570639);
        int i2 = (av8Var.g(bzeVar) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            utc utcVar = utc.a;
            xtc Y = fz8.Y(l98.c0(n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_1, av8Var), oyn.e), 16.0f, 8.0f), n9a.a);
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.l, av8Var, 6);
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
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            boolean z = bzeVar.a;
            int m2 = yid.m(StringsKt.toIntOrNull(str2));
            int m3 = yid.m(StringsKt.toIntOrNull(str));
            bea.d(str2, str, z ? ljg.f(av8Var, -1515307492, R.color.live, av8Var, false) : m2 > m3 ? ljg.f(av8Var, -1515305860, R.color.n_lv_1, av8Var, false) : ljg.f(av8Var, -1515304772, R.color.n_lv_3, av8Var, false), z ? ljg.f(av8Var, -1515301988, R.color.live, av8Var, false) : m3 > m2 ? ljg.f(av8Var, -1515300356, R.color.n_lv_1, av8Var, false) : ljg.f(av8Var, -1515299268, R.color.n_lv_3, av8Var, false), l98.f0(bkh.q(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), av8Var, 24576);
            tz9.r(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 15, 0L, 0L, av8Var, null);
            av8Var = av8Var;
            bea.c(bzeVar.d, null, av8Var, 0);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new pce(bzeVar, i);
        }
    }
}
