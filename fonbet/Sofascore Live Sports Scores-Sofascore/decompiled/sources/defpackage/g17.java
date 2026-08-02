package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class g17 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j17 b;

    public /* synthetic */ g17(j17 j17Var, int i) {
        this.a = i;
        this.b = j17Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        String str;
        int i = this.a;
        j17 j17Var = this.b;
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
                    av8Var.d0(1143363355);
                    s6a.f(36.0f, 4.0f, 438, 56, 0L, 0L, av8Var, bkh.c);
                    av8Var.s(false);
                } else {
                    av8Var.d0(1143698558);
                    ol7 ol7Var = j17Var.a;
                    ev6 ev6Var = j17Var.e;
                    if (ol7Var != null) {
                        av8Var.d0(1143752591);
                        kg0 kg0Var = ww9.f;
                        kv1 kv1Var = uxf.p;
                        xtc f0 = l98.f0(bkh.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, 5);
                        u23 a = t23.a(kg0Var, kv1Var, av8Var, 54);
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
                        rha.b(oea.v(R.string.fantasy_team_of_the_round, av8Var), null, lz.D(R.color.on_color_primary, av8Var), av8Var, 0, 2);
                        utc utcVar = utc.a;
                        nq8.h(av8Var, bkh.e(utcVar, 16.0f));
                        lv1 lv1Var = uxf.m;
                        ng0 ng0Var = new ng0(16.0f, true, new a70(6));
                        xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        l8g a2 = k8g.a(ng0Var, lv1Var, av8Var, 54);
                        int hashCode2 = Long.hashCode(av8Var.T);
                        aee m2 = av8Var.m();
                        xtc C2 = fqj.C(av8Var, d0);
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
                        p8g p8gVar = p8g.a;
                        xtc a3 = p8gVar.a(1.0f, utcVar, true);
                        String v = oea.v(R.string.average, av8Var);
                        Float f = j17Var.b;
                        fkf.t(v, f != null ? String.format(dla.d(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f.floatValue())}, 1)) : "-", a3, null, 0L, 0L, av8Var, 0, 56);
                        xtc a4 = p8gVar.a(1.0f, utcVar, true);
                        String v2 = oea.v(R.string.points, av8Var);
                        String valueOf2 = String.valueOf(ol7Var.b);
                        yf8 yf8Var = xth.a;
                        fkf.t(v2, valueOf2, a4, xth.h(), 0L, 0L, av8Var, 0, 48);
                        xtc a5 = p8gVar.a(1.0f, utcVar, true);
                        String v3 = oea.v(R.string.highest_points_scored, av8Var);
                        Integer num = j17Var.c;
                        if (num == null || (str = String.valueOf(num.intValue())) == null) {
                            str = "-";
                        }
                        fkf.t(v3, str, a5, null, 0L, 0L, av8Var, 0, 56);
                        av8Var = av8Var;
                        bf3.t(av8Var, true, utcVar, 16.0f, av8Var);
                        dy0.b(fn0.e(1.0f, bkh.d(utcVar, 1.0f), false), uxf.g, yqo.H(1698180087, av8Var, new g17(j17Var, 1)), av8Var, 3120, 4);
                        nq8.h(av8Var, bkh.e(utcVar, 16.0f));
                        ng0 ng0Var2 = new ng0(8.0f, true, new a70(6));
                        xtc d02 = l98.d0(bkh.d(utcVar, 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        l8g a6 = k8g.a(ng0Var2, uxf.l, av8Var, 6);
                        int hashCode3 = Long.hashCode(av8Var.T);
                        aee m3 = av8Var.m();
                        xtc C3 = fqj.C(av8Var, d02);
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, a6, f50Var);
                        waa.K(av8Var, m3, ff3Var);
                        bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                        waa.K(av8Var, C3, f50Var3);
                        pl7 pl7Var = ol7Var.e;
                        String v4 = oea.v(R.string.least_points_short, av8Var);
                        Locale locale = Locale.ROOT;
                        String upperCase = v4.toUpperCase(locale);
                        upperCase.getClass();
                        Boolean valueOf3 = ev6Var != null ? Boolean.valueOf(ev6Var.A) : null;
                        Boolean bool = Boolean.TRUE;
                        fz8.A(pl7Var, upperCase, Intrinsics.c(valueOf3, bool), l98.d0(n9e.q(p8gVar.a(1.0f, utcVar, true), lz.D(R.color.darken_overlay_1, av8Var), o7g.a(16.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1), lz.D(R.color.on_color_primary, av8Var), av8Var, 0, 0);
                        pl7 pl7Var2 = ol7Var.d;
                        String upperCase2 = oea.v(R.string.most_points_short, av8Var).toUpperCase(locale);
                        upperCase2.getClass();
                        fz8.A(pl7Var2, upperCase2, Intrinsics.c(ev6Var != null ? Boolean.valueOf(ev6Var.A) : null, bool), l98.d0(n9e.q(p8gVar.a(1.0f, utcVar, true), lz.D(R.color.darken_overlay_1, av8Var), o7g.a(16.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1), lz.D(R.color.on_color_primary, av8Var), av8Var, 0, 0);
                        z = false;
                        ljg.t(av8Var, true, true, false);
                    } else {
                        z = false;
                        av8Var.d0(1148672384);
                        av8Var.s(false);
                    }
                    av8Var.s(z);
                }
                break;
            default:
                s22 s22Var = (s22) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                s22Var.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(s22Var) ? 4 : 2;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    double min = Math.min(s22Var.b() / 350.0072918185795d, s22Var.c() / 360.0d);
                    double c = (s22Var.c() - (360.0d * min)) / 2.0d;
                    if (c < 0.0d) {
                        c = 0.0d;
                    }
                    tol.b(thb.a.a(Double.valueOf(min)), yqo.H(87699255, av8Var2, new i17(c, j17Var)), av8Var2, 56);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
