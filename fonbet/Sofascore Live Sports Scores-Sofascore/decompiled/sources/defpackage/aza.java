package defpackage;

import android.content.Context;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class aza {
    public static final mqi a = ypa.b(new ila(14));
    public static final mqi b = ypa.b(new ila(15));

    static {
        ypa.b(new ila(16));
        ypa.b(new ila(17));
    }

    public static final void a(int i, of3 of3Var, vnb vnbVar, Function1 function1, boolean z, boolean z2) {
        int i2;
        boolean z3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1725900642);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (av8Var.g(vnbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z3 = z;
            i2 |= av8Var.h(z3) ? 32 : 16;
        } else {
            z3 = z;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.i(function1) ? 2048 : 1024;
        }
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z4 = (i2 & 7168) == 2048;
            Object O = av8Var.O();
            if (z4 || O == nf3.a) {
                O = new l77(26, function1);
                av8Var.n0(O);
            }
            ktm.s(vnbVar, (Function0) O, z3, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, yqo.H(-492565750, av8Var, new hs5(z2, function1, i3)), av8Var, (i2 & 14) | 100663296 | ((i2 << 3) & 896), 248);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bl1(vnbVar, z, z2, function1, i, 5);
        }
    }

    public static final void b(eza ezaVar, boolean z, of3 of3Var, int i) {
        boolean z2;
        ezaVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1722594227);
        int i2 = (av8Var.i(ezaVar) ? 4 : 2) | i | (av8Var.h(z) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            e1d x = rfo.x(ezaVar.f, av8Var, 0);
            e1d x2 = rfo.x(ezaVar.j, av8Var, 0);
            vnb vnbVar = (vnb) x.getValue();
            boolean booleanValue = ((Boolean) x2.getValue()).booleanValue();
            boolean i3 = av8Var.i(context) | av8Var.g(x) | av8Var.i(ezaVar);
            Object O = av8Var.O();
            if (i3 || O == nf3.a) {
                O = new dr6(context, ezaVar, x, 22);
                av8Var.n0(O);
            }
            z2 = z;
            a((i2 << 3) & 896, av8Var, vnbVar, (Function1) O, booleanValue, z2);
        } else {
            z2 = z;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new m81(i, 8, ezaVar, z2);
        }
    }

    public static final void c(int i, of3 of3Var, xtc xtcVar, Function1 function1) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-791473470);
        int i2 = 2;
        int i3 = i | (av8Var.i(function1) ? 4 : 2) | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Object[] objArr = new Object[0];
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new ila(13);
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) o3a.N(objArr, (Function0) O, av8Var, 48);
            cdi b2 = a60.b(((Boolean) e1dVar.getValue()).booleanValue() ? -180.0f : 0.0f, s02.h0(250, 0, null, 6), "expand_rotation", av8Var, 3120, 20);
            xtc d = bkh.d(xtcVar, 1.0f);
            boolean g = ((i3 & 14) == 4) | av8Var.g(e1dVar);
            Object O2 = av8Var.O();
            if (g || O2 == a99Var) {
                O2 = new yz4(function1, e1dVar, i2);
                av8Var.n0(O2);
            }
            xtc q = n9e.q(gz8.x(d, null, (Function2) O2, 1), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f));
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, q);
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
            utc utcVar = utc.a;
            xtc A = wnn.A(bkh.d(utcVar, 1.0f), o7g.a(16.0f));
            boolean g2 = av8Var.g(e1dVar);
            Object O3 = av8Var.O();
            if (g2 || O3 == a99Var) {
                O3 = new tra(2, e1dVar);
                av8Var.n0(O3);
            }
            xtc c0 = l98.c0(tol.y(A, false, false, false, 0L, null, (Function0) O3, av8Var, 31), 16.0f, 12.0f);
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, c0);
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
            String v = oea.v(R.string.sofascore_power_rankings_what, av8Var);
            goa goaVar = new goa(1.0f, true);
            yf8 yf8Var = xth.a;
            udj.c(v, goaVar, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131064);
            ImageVector N = s6a.N(R.drawable.ic_chevron_down, 6, av8Var);
            long D = lz.D(R.color.n_lv_3, av8Var);
            xtc p = bkh.p(utcVar, 16.0f);
            boolean g3 = av8Var.g(b2);
            Object O4 = av8Var.O();
            if (g3 || O4 == a99Var) {
                O4 = new cl1(b2, 7);
                av8Var.n0(O4);
            }
            kq9.b(N, null, s02.M(p, (Function1) O4), D, av8Var, 48, 0);
            av8Var = av8Var;
            av8Var.s(true);
            if (((Boolean) e1dVar.getValue()).booleanValue()) {
                av8Var.d0(-1786442055);
                udj.c(oea.v(R.string.power_rankings_description, av8Var), l98.d0(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 5), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 48, 0, 131064);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                av8Var.d0(-1786108278);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l05(function1, xtcVar, i, 2);
        }
    }

    public static final void d(boolean z, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        utc utcVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1145520570);
        int i3 = (av8Var.h(z) ? 4 : 2) | i | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            xtc f0 = l98.f0(l98.d0(n9e.q(wnn.A(bkh.d(xtcVar, 1.0f), o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12)), lz.D(R.color.surface_1, av8Var), oyn.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 1), 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
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
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String v = oea.v(R.string.team, av8Var);
            goa goaVar = new goa(1.0f, true);
            yf8 yf8Var = xth.a;
            udj.c(v, goaVar, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.b(), av8Var, 0, 24576, 114680);
            av8 av8Var2 = av8Var;
            utc utcVar2 = utc.a;
            if (z) {
                av8Var2.d0(-963807767);
                utcVar = utcVar2;
                udj.c(oea.v(R.string.any_sport_difference_short, av8Var2), bkh.p(utcVar2, 56.0f), lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, new p7j(6), 0L, 0, false, 1, 0, null, xth.b(), av8Var2, 48, 24576, 113656);
                av8Var2 = av8Var2;
                bf3.u(utcVar, 12.0f, av8Var2, false);
            } else {
                utcVar = utcVar2;
                av8Var2.d0(-963416640);
                av8Var2.s(false);
            }
            String upperCase = oea.v(R.string.points_short, av8Var2).toUpperCase(pie.a.P().c().a);
            upperCase.getClass();
            av8 av8Var3 = av8Var2;
            udj.c(upperCase, bkh.p(utcVar, 44.0f), lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 1, 0, null, xth.b(), av8Var3, 48, 24576, 113656);
            av8Var = av8Var3;
            i2 = 1;
            av8Var.s(true);
        } else {
            i2 = 1;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new es8(z, xtcVar, i, i2);
        }
    }

    public static final void e(int i, of3 of3Var, xtc xtcVar, Function0 function0) {
        Function0 function02;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1311386069);
        int i2 = (av8Var2.i(function0) ? 4 : 2) | i | (av8Var2.g(xtcVar) ? 32 : 16);
        if (av8Var2.T(i2 & 1, (i2 & 19) != 18)) {
            lv1 lv1Var = uxf.l;
            xtc d0 = l98.d0(l98.f0(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var2), o7g.a(16.0f)), 18.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            ImageVector N = s6a.N(R.drawable.ic_info, 6, av8Var2);
            long D = lz.D(R.color.n_lv_3, av8Var2);
            utc utcVar = utc.a;
            kq9.b(N, null, bkh.l(utcVar, 20.0f).z(new nok(uxf.m)), D, av8Var2, 48, 0);
            goa d = bf3.d(utcVar, 10.0f, av8Var2, 1.0f, true);
            String v = oea.v(R.string.power_rankings_description, av8Var2);
            yf8 yf8Var = xth.a;
            udj.c(v, d, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var2, 0, 0, 131064);
            nq8.h(av8Var2, bkh.p(utcVar, 10.0f));
            ImageVector N2 = s6a.N(R.drawable.ic_close, 6, av8Var2);
            long D2 = lz.D(R.color.n_lv_1, av8Var2);
            ye9 ye9Var = l7a.a;
            function02 = function0;
            av8Var = av8Var2;
            kq9.b(N2, null, tol.y(bkh.l(yjc.a, 24.0f), false, false, false, 0L, null, function0, av8Var2, 29), D2, av8Var, 48, 0);
            av8Var.s(true);
        } else {
            function02 = function0;
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fm(function02, xtcVar, i, 7);
        }
    }
}
