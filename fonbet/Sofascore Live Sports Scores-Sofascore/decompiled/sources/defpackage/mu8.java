package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class mu8 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qu8 b;

    public /* synthetic */ mu8(qu8 qu8Var, int i) {
        this.a = i;
        this.b = qu8Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        qu8 qu8Var = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    String str = qu8Var.k;
                    bx7 bx7Var = qu8Var.l;
                    l98.r(str, bx7Var.c, bx7Var.b, bx7Var.d, av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    ux7 ux7Var = qu8Var.m;
                    bx7 bx7Var2 = qu8Var.l;
                    int i2 = ux7Var.a;
                    String str2 = ux7Var.b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = str2;
                    String str4 = qu8Var.q;
                    int i3 = qu8Var.n.a;
                    fy7 fy7Var = bx7Var2.g;
                    Integer valueOf = fy7Var != null ? Integer.valueOf(fy7Var.a) : null;
                    fy7 fy7Var2 = bx7Var2.h;
                    Integer valueOf2 = fy7Var2 != null ? Integer.valueOf(fy7Var2.a) : null;
                    Integer num = bx7Var2.m;
                    Integer num2 = bx7Var2.n;
                    String str5 = qu8Var.r;
                    Integer num3 = bx7Var2.q;
                    l98.m(i2, str3, str4, str5, i3, valueOf, valueOf2, num, num2, num3 != null ? num3.intValue() : 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 0, 0, 1024);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    utc utcVar = utc.a;
                    xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    u23 a = t23.a(ww9.d, uxf.o, av8Var3, 0);
                    int hashCode = Long.hashCode(av8Var3.T);
                    aee m = av8Var3.m();
                    xtc C = fqj.C(av8Var3, f0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var);
                    } else {
                        av8Var3.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var3, a, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var3, m, ff3Var);
                    Integer valueOf3 = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var3, valueOf3, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var3, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var3, C, f50Var3);
                    pd0.f(qu8Var.p, 0L, av8Var3, 0, 2);
                    xtc f02 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    l8g a2 = k8g.a(ww9.f, uxf.l, av8Var3, 6);
                    int hashCode2 = Long.hashCode(av8Var3.T);
                    aee m2 = av8Var3.m();
                    xtc C2 = fqj.C(av8Var3, f02);
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var);
                    } else {
                        av8Var3.q0();
                    }
                    waa.K(av8Var3, a2, f50Var);
                    waa.K(av8Var3, m2, ff3Var);
                    bf3.s(hashCode2, av8Var3, f50Var2, av8Var3, ryVar);
                    waa.K(av8Var3, C2, f50Var3);
                    String v = oea.v(R.string.view_all_stats, av8Var3);
                    yf8 yf8Var = xth.a;
                    udj.c(v, null, lz.D(R.color.primary_default, av8Var3), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var3, 0, 0, 131066);
                    nq8.h(av8Var3, bkh.p(utcVar, 4.0f));
                    kq9.b(s6a.N(R.drawable.ic_chevron_right_large_16, 6, av8Var3), null, null, lz.D(R.color.primary_default, av8Var3), av8Var3, 48, 4);
                    av8Var3.s(true);
                    av8Var3.s(true);
                } else {
                    av8Var3.W();
                }
                break;
            default:
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    pd0.f(qu8Var.p, lz.D(R.color.surface_1, av8Var4), av8Var4, 0, 0);
                } else {
                    av8Var4.W();
                }
                break;
        }
        return Unit.a;
    }
}
