package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class nce {
    static {
        ypa.b(new t2e(4));
    }

    public static final void a(int i, of3 of3Var) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1684829799);
        if (av8Var2.T(i & 1, i != 0)) {
            String v = oea.v(R.string.tennis_break, av8Var2);
            long D = lz.D(R.color.surface_1, av8Var2);
            yf8 yf8Var = xth.a;
            av8Var = av8Var2;
            udj.c(v, l98.d0(n9e.q(utc.a, lz.D(R.color.value, av8Var2), o7g.a(12.0f)), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), D, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 109560);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mpa(i, 25);
        }
    }

    public static final void b(int i, int i2, of3 of3Var, String str, String str2) {
        String str3;
        String str4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1380485751);
        int i3 = (av8Var.g(str) ? 4 : 2) | i2 | (av8Var.g(str2) ? 32 : 16) | (av8Var.e(i) ? 256 : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                O = Boolean.valueOf(ph0.a0(new Integer[]{0, 1, 5}).contains(Integer.valueOf(i)));
                av8Var.n0(O);
            }
            boolean booleanValue = ((Boolean) O).booleanValue();
            boolean z2 = i4 == 256;
            Object O2 = av8Var.O();
            if (z2 || O2 == a99Var) {
                O2 = Boolean.valueOf(ph0.a0(new Integer[]{2, 3, 6}).contains(Integer.valueOf(i)));
                av8Var.n0(O2);
            }
            str3 = str;
            str4 = str2;
            bea.d(str3, str4, i == 4 ? ljg.f(av8Var, -498071296, R.color.live, av8Var, false) : booleanValue ? ljg.f(av8Var, -498070080, R.color.n_lv_1, av8Var, false) : ljg.f(av8Var, -498069120, R.color.n_lv_3, av8Var, false), i == 4 ? ljg.f(av8Var, -498066112, R.color.live, av8Var, false) : ((Boolean) O2).booleanValue() ? ljg.f(av8Var, -498064896, R.color.n_lv_1, av8Var, false) : ljg.f(av8Var, -498063936, R.color.n_lv_3, av8Var, false), bkh.q(l98.d0(utc.a, 6.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 20.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var, (i3 & 14) | 24576 | (i3 & 112));
        } else {
            str3 = str;
            str4 = str2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lce(str3, str4, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    public static final void c(gv9 gv9Var, int i, Integer num, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        boolean z;
        av8 av8Var2;
        ?? r0;
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(1978107481);
        int i3 = i2 | (av8Var3.g(gv9Var) ? 4 : 2) | (av8Var3.e(i) ? 32 : 16) | (av8Var3.g(num) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var3.g(xtcVar) ? a.o : 1024);
        if (av8Var3.T(i3 & 1, (i3 & 1171) != 1170)) {
            Context context = (Context) av8Var3.k(nz.b);
            av8Var3.d0(-1709213746);
            xtc A = wnn.A(xtcVar, o7g.a(8.0f));
            utc utcVar = utc.a;
            if (num != null) {
                long D = lz.D(R.color.n_lv_4, av8Var3);
                Object O = av8Var3.O();
                Object obj = nf3.a;
                if (O == obj) {
                    O = mz1.e(av8Var3);
                }
                wzc wzcVar = (wzc) O;
                Object[] objArr = new Object[0];
                Object O2 = av8Var3.O();
                if (O2 == obj) {
                    O2 = mce.b;
                    av8Var3.n0(O2);
                }
                z = 0;
                A = A.z(tol.y(utcVar, true, true, true, D, wzcVar, new gi(23, (boh) o3a.N(objArr, (Function0) O2, av8Var3, 48), num, context), av8Var3, 0));
            } else {
                z = 0;
            }
            av8Var3.s(z);
            xtc p = bkh.p(l98.d0(n9e.q(A, lz.D(R.color.surface_2, av8Var3), oyn.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1), 84.0f);
            u23 a = t23.a(new ng0(8.0f, true, new a70(6)), uxf.p, av8Var3, 54);
            int hashCode = Long.hashCode(av8Var3.T);
            aee m = av8Var3.m();
            xtc C = fqj.C(av8Var3, p);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a, hf3.g);
            waa.K(av8Var3, m, hf3.f);
            waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var3, hf3.k);
            waa.K(av8Var3, C, hf3.d);
            if (i == 3) {
                av8Var3.d0(2081116919);
                a(z, av8Var3);
                av8Var3.s(z);
            } else {
                av8Var3.d0(2081155359);
                av8Var3.s(z);
            }
            int size = gv9Var.size();
            boolean z2 = true;
            if (size != 1) {
                if (size != 2) {
                    av8Var3.d0(2081969791);
                    av8Var3.s(z);
                } else {
                    av8Var3.d0(2081801306);
                    yso.b((String) gv9Var.get(z), (String) gv9Var.get(1), null, av8Var3, z);
                    av8Var3.s(z);
                }
                r0 = z;
                av8Var2 = av8Var3;
            } else {
                av8Var3.d0(2081265657);
                String str = (String) gv9Var.get(z);
                long D2 = lz.D(R.color.n_lv_1, av8Var3);
                yf8 yf8Var = xth.a;
                boolean z3 = z;
                udj.c(str, l98.d0(bkh.r(bkh.g(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), uxf.m, 2), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), D2, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.b(), av8Var3, 48, 24960, 109560);
                av8 av8Var4 = av8Var3;
                av8Var4.s(z3);
                z2 = true;
                r0 = z3;
                av8Var2 = av8Var4;
            }
            if (i == z2) {
                av8Var2.d0(2082016663);
                a(r0, av8Var2);
                av8Var2.s(r0);
            } else {
                av8Var2.d0(2082055103);
                av8Var2.s(r0);
            }
            av8Var2.s(z2);
            av8Var = av8Var2;
        } else {
            av8Var3.W();
            av8Var = av8Var3;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zt7(gv9Var, xtcVar, num, i, i2, 25);
        }
    }

    public static final void d(int i, int i2, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1644805777);
        int i3 = (av8Var.e(i) ? 4 : 2) | i2;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var, utcVar);
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
            tz9.r(2.0f, 390, 8, i != 0 ? i != 3 ? ljg.f(av8Var, -1405998608, R.color.n_lv_4, av8Var, false) : ljg.f(av8Var, -1405999727, R.color.error, av8Var, false) : ljg.f(av8Var, -1406001325, R.color.success, av8Var, false), 0L, av8Var, bkh.e(utcVar, 24.0f));
            tz9.r(2.0f, 390, 8, i != 1 ? i != 2 ? ljg.f(av8Var, -1405989104, R.color.n_lv_4, av8Var, false) : ljg.f(av8Var, -1405991821, R.color.success, av8Var, false) : ljg.f(av8Var, -1405990223, R.color.error, av8Var, false), 0L, av8Var, bkh.e(utcVar, 24.0f));
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new o81(i, i2, 8);
        }
    }

    public static final void e(zye zyeVar, of3 of3Var, int i) {
        int i2;
        lv1 lv1Var = uxf.n;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-157933774);
        int i3 = (av8Var.g(zyeVar) ? 4 : 2) | i;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            utc utcVar = utc.a;
            xtc c0 = l98.c0(bkh.d(utcVar, 1.0f), 16.0f, 8.0f);
            ng0 ng0Var = new ng0(6.0f, true, new a70(6));
            lv1 lv1Var2 = uxf.l;
            l8g a = k8g.a(ng0Var, lv1Var2, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            int i4 = zyeVar.f;
            boolean z = zyeVar.c;
            a99 a99Var = nf3.a;
            if (i4 == 4) {
                av8Var.d0(-1059448121);
                boolean h = av8Var.h(z);
                Object O = av8Var.O();
                if (h || O == a99Var) {
                    if (!z) {
                        lv1Var2 = lv1Var;
                    }
                    av8Var.n0(lv1Var2);
                    O = lv1Var2;
                }
                f(zyeVar.g, 0, av8Var, new nok((lv1) O));
                av8Var.s(false);
                i2 = 0;
            } else if (i4 != -1) {
                av8Var.d0(-1059083499);
                boolean e = av8Var.e(i4);
                Object O2 = av8Var.O();
                if (e || O2 == a99Var) {
                    if (!ph0.a0(new Integer[]{0, 1}).contains(Integer.valueOf(i4))) {
                        lv1Var2 = lv1Var;
                    }
                    av8Var.n0(lv1Var2);
                    O2 = lv1Var2;
                }
                c(zyeVar.e, zyeVar.f, zyeVar.i, new nok((lv1) O2), av8Var, 0);
                i2 = 0;
                av8Var.s(false);
            } else {
                i2 = 0;
                ljg.r(84.0f, -1058591064, av8Var, av8Var, utcVar);
                av8Var.s(false);
            }
            b(i4, i2, av8Var, zyeVar.a, zyeVar.b);
            d(i4, i2, av8Var);
            av8Var.s(true);
            bea.c(zyeVar.d, null, av8Var, i2);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kce(zyeVar, i);
        }
    }

    public static final void f(int i, int i2, of3 of3Var, xtc xtcVar) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(88907939);
        int i3 = (av8Var.e(i) ? 4 : 2) | i2 | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            xtc p = bkh.p(l98.d0(xtcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1), 84.0f);
            u23 a = t23.a(ww9.d, uxf.q, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, p);
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
            kq9.b(s6a.N(i, ((i3 << 3) & 112) | 6, av8Var), null, bkh.l(utc.a, 16.0f), lz.D(R.color.secondary_default, av8Var), av8Var, 432, 0);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xz(i, xtcVar, i2, 16);
        }
    }
}
