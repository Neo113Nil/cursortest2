package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class hxk {
    public static final Set a = ph0.a0(new String[]{StatusKt.STATUS_IN_PROGRESS, StatusKt.STATUS_WILL_CONTINUE});

    public static final void a(long j, boolean z, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1384364629);
        if ((i & 6) == 0) {
            i2 = (av8Var.f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.d(1.0f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.g(xtcVar) ? a.o : 1024;
        }
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object O = av8Var.O();
            if (z2 || O == nf3.a) {
                O = new ut6(z, j, 2);
                av8Var.n0(O);
            }
            lz.d((i2 >> 9) & 14, av8Var, xtcVar, (Function1) O);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gxe(j, z, xtcVar, i);
        }
    }

    public static final void b(jxk jxkVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1297989223);
        if ((i & 6) == 0) {
            i2 = i | (av8Var.i(jxkVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            qug o0 = hkg.o0(av8Var);
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            boolean g = av8Var.g((Configuration) av8Var.k(nz.a));
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (g || O == a99Var) {
                O = e.c(0);
                av8Var.n0(O);
            }
            znh znhVar = (znh) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = goh.b(new s31(znhVar, 1));
                av8Var.n0(O2);
            }
            cdi cdiVar = (cdi) O2;
            Unit unit = Unit.a;
            boolean i3 = av8Var.i(jxkVar) | av8Var.g(o0);
            Object O3 = av8Var.O();
            if (i3 || O3 == a99Var) {
                O3 = new vki(jxkVar, o0, null, 29);
                av8Var.n0(O3);
            }
            hz8.o(av8Var, unit, (Function2) O3);
            utc utcVar = utc.a;
            xtc f0 = l98.f0(bkh.e(bkh.d(utcVar, 1.0f), 144.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            lv1 lv1Var = uxf.m;
            wxf wxfVar = ww9.b;
            l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 48);
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
            e(jxkVar.a, jxkVar.b, 0, av8Var);
            xtc xtcVar = bkh.c;
            if (((Boolean) cdiVar.getValue()).booleanValue()) {
                xtcVar = xtcVar.z(hkg.Z(utcVar, o0, false, 14));
            }
            l8g a3 = k8g.a(wxfVar, uxf.l, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, xtcVar);
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
            boolean g2 = av8Var.g(znhVar) | av8Var.i(jxkVar) | av8Var.g(kx4Var);
            Object O4 = av8Var.O();
            if (g2 || O4 == a99Var) {
                O4 = new mfh(18, kx4Var, jxkVar, znhVar);
                av8Var.n0(O4);
            }
            rz8.r(null, (Function2) O4, av8Var, 0, 1);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new n61(jxkVar, i, 17);
        }
    }

    public static final void c(boolean z, final int i, final boolean z2, of3 of3Var, final int i2) {
        final boolean z3;
        mv1 mv1Var = uxf.c;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1072695869);
        int i3 = (av8Var.e(i) ? 32 : 16) | i2 | (av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            long f = !z2 ? ljg.f(av8Var, 68582474, R.color.surface_2, av8Var, false) : z ? ljg.f(av8Var, 68583476, R.color.secondary_highlight, av8Var, false) : ljg.f(av8Var, 68584754, R.color.primary_highlight, av8Var, false);
            long f2 = z ? ljg.f(av8Var, 68586822, R.color.n_lv_1, av8Var, false) : ljg.f(av8Var, 68587312, R.color.neutral_default, av8Var, false);
            mv1 mv1Var2 = z ? mv1Var : uxf.k;
            long f3 = z2 ? ljg.f(av8Var, 68591462, R.color.n_lv_1, av8Var, false) : ljg.f(av8Var, 68591942, R.color.n_lv_3, av8Var, false);
            utc utcVar = utc.a;
            xtc q = n9e.q(bkh.e(bkh.d(utcVar, 1.0f), 40.0f), f, oyn.e);
            k1c c = e12.c(mv1Var, false);
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
            waa.K(av8Var, c, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            xtc e = bkh.e(bkh.d(utcVar, 1.0f), 8.0f);
            n12 n12Var = n12.a;
            z3 = z;
            a(f2, z3, n12Var.a(e, mv1Var2), av8Var, 432);
            xtc a2 = n12Var.a(utcVar, uxf.g);
            String valueOf = String.valueOf(i);
            yf8 yf8Var = xth.a;
            udj.c(valueOf, a2, f3, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.h(), av8Var, 0, 0, 131064);
            av8Var.s(true);
        } else {
            z3 = z;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(i, i2, z3, z2) { // from class: gxk
                public final /* synthetic */ boolean a;
                public final /* synthetic */ int b;
                public final /* synthetic */ boolean c;

                {
                    this.a = z3;
                    this.c = z2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(7);
                    hxk.c(this.a, this.b, this.c, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(jxk jxkVar, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        ixk ixkVar = jxkVar.c;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(329238981);
        if ((i & 6) == 0) {
            i2 = i | (av8Var2.i(jxkVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.g(xtcVar) ? 32 : 16;
        }
        if (av8Var2.T(i2 & 1, (i2 & 19) != 18)) {
            String c = afi.c((Context) av8Var2.k(nz.b), ixkVar.b, Sports.VOLLEYBALL, true);
            long f = a.contains(ixkVar.a) ? ljg.f(av8Var2, -1428910706, R.color.live, av8Var2, false) : ljg.f(av8Var2, -1428910226, R.color.n_lv_1, av8Var2, false);
            yf8 yf8Var = xth.a;
            av8Var = av8Var2;
            udj.c(c, xtcVar, f, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, i2 & 112, 0, 131064);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nmi(jxkVar, xtcVar, i, 20);
        }
    }

    public static final void e(int i, int i2, int i3, of3 of3Var) {
        int i4;
        int i5;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1159901951);
        int i6 = (av8Var.e(i) ? 4 : 2) | i3 | (av8Var.e(i2) ? 32 : 16);
        if (av8Var.T(i6 & 1, (i6 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
            u23 a2 = t23.a(new ng0(20.0f, true, new a70(6)), uxf.o, av8Var, 6);
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
            td4.G(i, bkh.l(utcVar, 20.0f), false, 0L, av8Var, (i6 & 14) | 48, 12);
            i4 = i;
            i5 = i2;
            td4.G(i5, bkh.l(utcVar, 20.0f), false, 0L, av8Var, ((i6 >> 3) & 14) | 48, 12);
            av8Var.s(true);
        } else {
            i4 = i;
            i5 = i2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new u81(i4, i5, i3, 1);
        }
    }

    public static final void f(jxk jxkVar, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1612977239);
        int i2 = (av8Var.i(jxkVar) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            xtc q = n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f));
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
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            int i3 = i2 & 14;
            d(jxkVar, l98.f0(bkh.o(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 40.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5).z(new we9(uxf.p)), av8Var, i3);
            b(jxkVar, av8Var, i3);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bmj(jxkVar, xtcVar, i, 10);
        }
    }
}
