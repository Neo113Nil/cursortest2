package defpackage;

import android.content.res.Resources;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.mvvm.model.BaseballInningInfo;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class v81 {
    public static final joa a;

    static {
        tv0 tv0Var = new tv0(20);
        ysa ysaVar = ysa.c;
        ypa.a(ysaVar, tv0Var);
        a = ypa.a(ysaVar, new tv0(21));
    }

    public static final void a(w81 w81Var, float f, of3 of3Var, int i) {
        float f2;
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1281157284);
        int i3 = i | (av8Var.g(w81Var) ? 4 : 2) | (av8Var.d(f) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc d = bkh.d(utcVar, 1.0f);
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var, 48);
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
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            nq8.h(av8Var, bkh.e(utcVar, (4.0f * f) + 4.0f));
            BaseballInningInfo baseballInningInfo = w81Var.c;
            String w = oea.w(baseballInningInfo.getInningHalf() == BaseballInningInfo.InningHalf.Top ? R.string.baseball_top_of_inning_number : R.string.baseball_bottom_of_inning_number, new Object[]{yid.p(baseballInningInfo.getInning())}, av8Var);
            yf8 yf8Var = xth.a;
            q5a.w(w, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.b(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            c(w81Var.a, w81Var.b, w81Var.c, 1.0f - f, av8Var, 0);
            nq8.h(av8Var, bkh.e(utcVar, 4.0f));
            boolean z = (i3 & 112) == 32;
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                f2 = f;
                i2 = 0;
                O = new s81(f2, 0);
                av8Var.n0(O);
            } else {
                f2 = f;
                i2 = 0;
            }
            b(baseballInningInfo, s02.M(utcVar, (Function1) O), av8Var, i2);
            av8Var.s(true);
        } else {
            f2 = f;
            i2 = 0;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t81(w81Var, f2, i, i2);
        }
    }

    public static final void b(BaseballInningInfo baseballInningInfo, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2140966802);
        int i2 = (av8Var.i(baseballInningInfo) ? 4 : 2) | i | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            xtc d0 = l98.d0(bkh.e(xtcVar, 14.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1);
            l8g a2 = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
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
            String m2 = ljg.m(baseballInningInfo.getBallCount(), baseballInningInfo.getStrikeCount(), "-");
            yf8 yf8Var = xth.a;
            udj.c(m2, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var, 0, 0, 131066);
            tz9.r(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 13, lz.D(R.color.on_color_secondary, av8Var), 0L, av8Var, null);
            udj.c(String.valueOf(yid.m(baseballInningInfo.getOutCount())), null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var, 0, 0, 131066);
            udj.c(((Resources) av8Var.k(nz.c)).getQuantityString(R.plurals.baseball_outs_counter, yid.m(baseballInningInfo.getOutCount())), null, lz.D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vn6(baseballInningInfo, xtcVar, i, 8);
        }
    }

    public static final void c(int i, int i2, BaseballInningInfo baseballInningInfo, float f, of3 of3Var, int i3) {
        f50 f50Var;
        a99 a99Var;
        f50 f50Var2;
        f50 f50Var3;
        ff3 ff3Var;
        zg3 zg3Var;
        ry ryVar;
        lv1 lv1Var;
        boolean z;
        int i4;
        boolean z2;
        int i5 = i2;
        float f2 = f;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1635318325);
        int i6 = i3 | (av8Var.e(i) ? 4 : 2) | (av8Var.e(i5) ? 32 : 16) | (av8Var.i(baseballInningInfo) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.d(f2) ? a.o : 1024);
        if (av8Var.T(i6 & 1, (i6 & 1171) != 1170)) {
            utc utcVar = utc.a;
            xtc e = bkh.e(bkh.d(utcVar, 1.0f), 32.0f);
            l8g a2 = k8g.a(new ng0((10.0f * f2) + 6.0f, true, new a70(6)), uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, e);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var4 = hf3.g;
            waa.K(av8Var, a2, f50Var4);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var, m, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var, valueOf, f50Var5);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var, C, f50Var6);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            uxf uxfVar = ww9.c;
            lv1 lv1Var2 = uxf.l;
            l8g a3 = k8g.a(uxfVar, lv1Var2, av8Var, 6);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, goaVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var4);
            waa.K(av8Var, m2, ff3Var2);
            bf3.s(hashCode2, av8Var, f50Var5, av8Var, ryVar2);
            waa.K(av8Var, C2, f50Var6);
            d(i, i6 & 14, av8Var);
            av8Var.s(true);
            xtc p = bkh.p(utcVar, (20.0f * f) + 12.0f);
            k1c c = e12.c(uxf.g, false);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, p);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c, f50Var4);
            waa.K(av8Var, m3, ff3Var2);
            bf3.s(hashCode3, av8Var, f50Var5, av8Var, ryVar2);
            waa.K(av8Var, C3, f50Var6);
            a99 a99Var2 = nf3.a;
            if (f < 0.67f) {
                av8Var.d0(251346422);
                boolean z3 = (i6 & 7168) == 2048;
                Object O = av8Var.O();
                if (z3 || O == a99Var2) {
                    f2 = f;
                    z2 = true;
                    O = new s81(f2, 1);
                    av8Var.n0(O);
                } else {
                    f2 = f;
                    z2 = true;
                }
                xtc M = s02.M(utcVar, (Function1) O);
                yf8 yf8Var = xth.a;
                zg3Var = zg3Var2;
                f50Var2 = f50Var4;
                lv1Var = lv1Var2;
                f50Var = f50Var6;
                ff3Var = ff3Var2;
                f50Var3 = f50Var5;
                ryVar = ryVar2;
                z = false;
                i4 = 2048;
                a99Var = a99Var2;
                q5a.w("-", M, lz.D(R.color.stayDarkLive, av8Var), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.h(), av8Var, 6, 0, 131064);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                f2 = f;
                f50Var = f50Var6;
                a99Var = a99Var2;
                f50Var2 = f50Var4;
                f50Var3 = f50Var5;
                ff3Var = ff3Var2;
                zg3Var = zg3Var2;
                ryVar = ryVar2;
                lv1Var = lv1Var2;
                z = false;
                i4 = a.o;
                av8Var.d0(251649571);
                av8Var.s(false);
            }
            if (f2 > 0.33f) {
                av8Var.d0(251711633);
                List<Integer> basesCovered = baseballInningInfo.getBasesCovered();
                gv9 W = basesCovered != null ? l6g.W(basesCovered) : null;
                float H0 = ((kx4) av8Var.k(dh3.h)).H0(13.69f) / 2.0f;
                long D = lz.D(R.color.on_color_highlight_1, av8Var);
                long D2 = lz.D(R.color.stayDarkValue, av8Var);
                xtc f0 = l98.f0(l98.d0(bkh.c, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 5.09f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.91f, 5);
                boolean z4 = (i6 & 7168) == i4 ? true : z;
                Object O2 = av8Var.O();
                if (z4 || O2 == a99Var) {
                    O2 = new s81(f2, 2);
                    av8Var.n0(O2);
                }
                f5p.a(W, H0, D, D2, s02.M(f0, (Function1) O2), av8Var, 0, 0);
                av8Var.s(z);
            } else {
                av8Var.d0(252343971);
                av8Var.s(z);
            }
            av8Var.s(true);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar2 = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            l8g a4 = k8g.a(ww9.b, lv1Var, av8Var, 6);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, goaVar2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var2);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var3, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var);
            i5 = i2;
            d(i5, (i6 >> 3) & 14, av8Var);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new v07(i, i5, baseballInningInfo, f2, i3);
        }
    }

    public static final void d(int i, int i2, of3 of3Var) {
        int i3;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1450108526);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (av8Var2.T(i3 & 1, (i3 & 3) != 2)) {
            String valueOf = String.valueOf(i);
            yf8 yf8Var = xth.a;
            av8Var = av8Var2;
            q5a.w(valueOf, null, lz.D(R.color.stayDarkLive, av8Var2), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.h(), av8Var, 0, 0, 131066);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new u81(i, i2);
        }
    }
}
