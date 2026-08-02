package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.W3;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class ek1 {
    public static final joa a;

    static {
        i91 i91Var = new i91(4);
        ysa ysaVar = ysa.c;
        ypa.a(ysaVar, i91Var);
        a = ypa.a(ysaVar, new i91(5));
    }

    public static final void a(fk1 fk1Var, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        e1d e1dVar;
        String str;
        boolean z;
        a99 a99Var;
        String str2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(265349955);
        int i2 = i | (av8Var.g(fk1Var) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i3 = 0;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            Object O = av8Var.O();
            rq3 rq3Var = null;
            a99 a99Var2 = nf3.a;
            if (O == a99Var2) {
                O = e.f(null);
                av8Var.n0(O);
            }
            e1d e1dVar2 = (e1d) O;
            if (fk1Var != null) {
                av8Var.d0(-1993910219);
                ksa a2 = msa.a(0, 0, av8Var, 0, 3);
                wj1 wj1Var = fk1Var.e;
                boolean g = av8Var.g(a2);
                Object O2 = av8Var.O();
                if (g || O2 == a99Var2) {
                    O2 = new ck1(i3, rq3Var, a2);
                    av8Var.n0(O2);
                }
                hz8.o(av8Var, wj1Var, (Function2) O2);
                xtc d = bkh.d(xtcVar, 1.0f);
                t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 7);
                boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
                Object O3 = av8Var.O();
                if (z2 || O3 == a99Var2) {
                    O3 = new fa(6, fk1Var, function1, e1dVar2);
                    av8Var.n0(O3);
                }
                str = null;
                z = false;
                a99Var = a99Var2;
                e1dVar = e1dVar2;
                v8a.a(d, a2, C, null, null, null, false, null, (Function1) O3, av8Var, 384, PglCryptUtils.BASE64_FAILED);
                av8Var.s(false);
            } else {
                e1dVar = e1dVar2;
                str = null;
                z = false;
                a99Var = a99Var2;
                av8Var.d0(-1991102177);
                av8Var.s(false);
            }
            boolean z3 = ((ll1) e1dVar.getValue()) != null ? true : z;
            Object O4 = av8Var.O();
            if (O4 == a99Var) {
                O4 = new v30(4, e1dVar);
                av8Var.n0(O4);
            }
            Function0 function0 = (Function0) O4;
            ll1 ll1Var = (ll1) e1dVar.getValue();
            if (ll1Var == null) {
                av8Var.d0(-1990886759);
                av8Var.s(z);
                str2 = str;
            } else {
                av8Var.d0(-1990886758);
                String v = oea.v(o02.V(ll1Var), av8Var);
                av8Var.s(z);
                str2 = v;
            }
            tz9.l(z3, function0, null, false, null, str2, null, null, yqo.H(1642368102, av8Var, new hl6(16, e1dVar, fk1Var)), av8Var, 100663344, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cyb(fk1Var, function1, xtcVar, i, 4);
        }
    }

    public static final void b(qk1 qk1Var, of3 of3Var, int i) {
        qk1Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(167209640);
        int i2 = (av8Var.i(qk1Var) ? 4 : 2) | i;
        int i3 = 0;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            e1d x = rfo.x(qk1Var.f, av8Var, 0);
            boolean z = true;
            xhf J = x2a.J(av8Var);
            xtc d = bkh.d(utc.a, 1.0f);
            if (!Intrinsics.c((vnb) x.getValue(), tnb.a)) {
                fk1 fk1Var = (fk1) ((vnb) x.getValue()).a();
                if (!Intrinsics.c(fk1Var != null ? Boolean.valueOf(fk1Var.g) : null, Boolean.TRUE)) {
                    z = false;
                }
            }
            boolean i4 = av8Var.i(qk1Var);
            Object O = av8Var.O();
            if (i4 || O == nf3.a) {
                O = new yj1(qk1Var, 0);
                av8Var.n0(O);
            }
            x2a.h(z, (Function0) O, d, J, null, yqo.H(1558815599, av8Var, new ak1(J, x, i3)), yqo.H(-2142663026, av8Var, new hl6(15, qk1Var, x)), av8Var, 1769856);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t21(qk1Var, i, 20);
        }
    }

    public static final void c(fk1 fk1Var, Function1 function1, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1823847136);
        int i2 = i | (av8Var.g(fk1Var) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc d = bkh.d(utcVar, 1.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
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
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            xtc d0 = l98.d0(n9e.q(d2a.E(bkh.d(utcVar, 1.0f), 2.0f, null, false, 0L, 30), lz.D(R.color.surface_1, av8Var), oyn.e), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a3 = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            gv9 gv9Var = fk1Var.a;
            am1 am1Var = fk1Var.b;
            int i3 = (i2 << 3) & 896;
            e(gv9Var, am1Var, function1, av8Var, i3);
            Iterable iterable = am1Var != null ? am1Var.d : null;
            if (iterable == null) {
                iterable = km5.a;
            }
            i(l6g.W(iterable), fk1Var.c, function1, new goa(1.0f, false), av8Var, i3);
            Iterable iterable2 = fk1Var.d;
            if (iterable2 == null) {
                iterable2 = km5.a;
            }
            h(l6g.W(iterable2), fk1Var.e, function1, av8Var, i3);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vn6(fk1Var, function1, i, 11);
        }
    }

    public static final void d(bm1 bm1Var, of3 of3Var, int i) {
        r13 e;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-609206229);
        int i2 = 2;
        int i3 = (av8Var.g(bm1Var) ? 4 : 2) | i;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            xtc e2 = bkh.e(bkh.d(utc.a, 1.0f), 8.0f);
            float l = 1.0f - yid.l(bm1Var.f);
            if (l < 0.05f) {
                l = 0.05f;
            }
            Float f = bm1Var.f;
            if (f == null) {
                av8Var.d0(1243989141);
                av8Var.s(false);
                e = null;
            } else {
                av8Var.d0(1243989142);
                float floatValue = f.floatValue();
                e = vxd.e(av8Var, false, (0.6666667f > floatValue || floatValue > 1.0f) ? (0.33333334f > floatValue || floatValue > 0.6666667f) ? ljg.f(av8Var, 1369895620, R.color.sentiment_positive, av8Var, false) : ljg.f(av8Var, 1369894275, R.color.sentiment_neutral, av8Var, false) : ljg.f(av8Var, 1369892484, R.color.sentiment_negative, av8Var, false));
            }
            ok3.f(e2, l, e != null ? e.a : r13.h, 4.0f, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 3078, 48);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t91(bm1Var, i, i2);
        }
    }

    public static final void e(gv9 gv9Var, am1 am1Var, Function1 function1, of3 of3Var, int i) {
        int i2;
        Object obj;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1475139324);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(gv9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(am1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(function1) ? 256 : 128;
        }
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            av8Var.d0(-269674318);
            ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
            Iterator<E> it = gv9Var.iterator();
            while (it.hasNext()) {
                am1 am1Var2 = (am1) it.next();
                arrayList.add(new oxh(am1Var2, am1Var2.c, yqo.H(-981506384, av8Var, new kr1(am1Var2, 14)), null, null, false, 248));
            }
            av8Var.s(false);
            gv9 W = l6g.W(arrayList);
            Iterator<E> it2 = W.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                oxh oxhVar = (oxh) obj;
                if (am1Var != null && ((am1) oxhVar.a).a == am1Var.a) {
                    break;
                }
            }
            oxh oxhVar2 = (oxh) obj;
            boolean z = (i2 & 896) == 256;
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new vi(8, function1);
                av8Var.n0(O);
            }
            r4a.j(W, oxhVar2, (Function1) O, null, null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, W3.l);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b30(gv9Var, am1Var, function1, i, 3);
        }
    }

    public static final void f(int i, int i2, of3 of3Var, xtc xtcVar) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-347670846);
        int i3 = (av8Var2.e(i) ? 4 : 2) | i2;
        if (av8Var2.T(i3 & 1, (i3 & 19) != 18)) {
            String v = oea.v(i, av8Var2);
            yf8 yf8Var = xth.a;
            av8Var = av8Var2;
            udj.c(v, l98.f0(l98.d0(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var2), o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12)), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131064);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xz(i, xtcVar, i2, 1);
        }
    }

    public static final void g(bm1 bm1Var, boolean z, xtc xtcVar, of3 of3Var, int i) {
        float f;
        zg3 zg3Var;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(217896028);
        int i2 = i | (av8Var.g(bm1Var) ? 4 : 2) | (av8Var.h(z) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            xtc f0 = l98.f0(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var), z ? o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 3) : oyn.e), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            utc utcVar = utc.a;
            if (z) {
                f = 8.0f;
                f0 = f0.z(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7));
            } else {
                f = 8.0f;
            }
            l8g a2 = k8g.a(new ng0(f, true, new a70(6)), uxf.l, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            String v = oea.v(bm1Var.b, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, l98.d0(new goa(1.0f, true), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 1), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 131064);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(Boolean.FALSE);
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            av8Var.d0(-1328854831);
            xtc p = bkh.p(utcVar, 112.0f);
            if (bm1Var.d != null) {
                xtc A = wnn.A(utcVar, o7g.a(16.0f));
                long D = lz.D(R.color.n_lv_4, av8Var);
                Object O2 = av8Var.O();
                if (O2 == a99Var) {
                    O2 = mz1.e(av8Var);
                }
                wzc wzcVar = (wzc) O2;
                Object[] objArr = new Object[0];
                Object O3 = av8Var.O();
                if (O3 == a99Var) {
                    O3 = fi.i;
                    av8Var.n0(O3);
                }
                p = p.z(tol.y(A, true, true, true, D, wzcVar, new dk1((boh) o3a.N(objArr, (Function0) O3, av8Var, 48), e1dVar, 0), av8Var, 0));
            }
            av8Var.s(false);
            xtc d0 = l98.d0(p, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            k1c c = e12.c(uxf.c, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d0);
            av8Var.h0();
            if (av8Var.S) {
                zg3Var = zg3Var2;
                av8Var.l(zg3Var);
            } else {
                zg3Var = zg3Var2;
                av8Var.q0();
            }
            waa.K(av8Var, c, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            xtc d02 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            u23 a3 = t23.a(new ng0(4.0f, true, new a70(6)), uxf.q, av8Var, 54);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d02);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            String str = bm1Var.c;
            Regex regex = yid.a;
            if (str == null) {
                str = "-";
            }
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            d(bm1Var, av8Var, i2 & 14);
            av8Var.s(true);
            if (((Boolean) e1dVar.getValue()).booleanValue()) {
                av8Var.d0(415433238);
                mv1 mv1Var = uxf.j;
                Object O4 = av8Var.O();
                if (O4 == a99Var) {
                    O4 = new v30(3, e1dVar);
                    av8Var.n0(O4);
                }
                t20.b(mv1Var, 0L, (Function0) O4, null, yqo.H(-23733670, av8Var, new t91(bm1Var)), av8Var, 24966, 10);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                av8Var.d0(416350032);
                av8Var.s(false);
            }
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t60((Object) bm1Var, z, xtcVar, i, 1);
        }
    }

    public static final void h(gv9 gv9Var, wj1 wj1Var, Function1 function1, of3 of3Var, int i) {
        int i2;
        Object obj;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(190805497);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(gv9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.e(wj1Var == null ? -1 : wj1Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(function1) ? 256 : 128;
        }
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            Resources resources = (Resources) av8Var.k(nz.c);
            boolean z = (i2 & 14) == 4;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
                Iterator<E> it = gv9Var.iterator();
                while (it.hasNext()) {
                    wj1 wj1Var2 = (wj1) it.next();
                    arrayList.add(new oxh(wj1Var2, resources.getString(wj1Var2.a), null, null, null, false, 252));
                }
                O = l6g.W(arrayList);
                av8Var.n0(O);
            }
            gv9 gv9Var2 = (gv9) O;
            Iterator<E> it2 = gv9Var2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (((oxh) obj).a == wj1Var) {
                        break;
                    }
                }
            }
            oxh oxhVar = (oxh) obj;
            boolean z2 = (i2 & 896) == 256;
            Object O2 = av8Var.O();
            if (z2 || O2 == a99Var) {
                O2 = new vi(9, function1);
                av8Var.n0(O2);
            }
            r4a.j(gv9Var2, oxhVar, (Function1) O2, null, null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, W3.l);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b30(gv9Var, wj1Var, function1, i, 4);
        }
    }

    public static final void i(gv9 gv9Var, Season.SubSeasonType subSeasonType, Function1 function1, goa goaVar, of3 of3Var, int i) {
        int i2;
        goa goaVar2;
        Object obj;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(283841882);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(gv9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.e(subSeasonType == null ? -1 : subSeasonType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            goaVar2 = goaVar;
            i2 |= av8Var.g(goaVar2) ? a.o : 1024;
        } else {
            goaVar2 = goaVar;
        }
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) av8Var.k(nz.b);
            boolean z = (i2 & 14) == 4;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
                Iterator<E> it = gv9Var.iterator();
                while (it.hasNext()) {
                    Season.SubSeasonType subSeasonType2 = (Season.SubSeasonType) it.next();
                    Set set = f5k.a;
                    arrayList.add(new oxh(subSeasonType2, f5k.b(context, subSeasonType2.getLabel(), Sports.BASEBALL), null, null, null, false, 252));
                }
                O = l6g.W(arrayList);
                av8Var.n0(O);
            }
            gv9 gv9Var2 = (gv9) O;
            Iterator<E> it2 = gv9Var2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (((oxh) obj).a == subSeasonType) {
                        break;
                    }
                }
            }
            oxh oxhVar = (oxh) obj;
            boolean z2 = (i2 & 896) == 256;
            Object O2 = av8Var.O();
            if (z2 || O2 == a99Var) {
                O2 = new vi(7, function1);
                av8Var.n0(O2);
            }
            r4a.j(gv9Var2, oxhVar, (Function1) O2, goaVar2, null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, i2 & 7168, 1008);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bk1(i, 0, gv9Var, subSeasonType, function1, goaVar);
        }
    }
}
