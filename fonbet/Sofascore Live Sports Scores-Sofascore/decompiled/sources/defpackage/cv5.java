package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.net.SocketTimeoutException;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class cv5 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ cv5(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        long f;
        xtc u0;
        int i3 = this.a;
        utc utcVar = utc.a;
        boolean z = this.b;
        int i4 = 6;
        switch (i3) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                of3 of3Var = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var).e(intValue) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    kq9.b(s6a.N(intValue, 6 | ((intValue2 << 3) & 112), av8Var), null, f6a.D(bkh.l(utcVar, 10.0f), z ? -1.0f : 1.0f, 1.0f), lz.D(R.color.primary_default, av8Var), av8Var, 48, 0);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                s22 s22Var = (s22) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                s22Var.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((av8) of3Var2).g(s22Var) ? 4 : 2;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue3 & 1, (intValue3 & 19) != 18)) {
                    mv1 mv1Var = uxf.g;
                    xtc d = bkh.d(utcVar, 1.0f);
                    boolean h = av8Var2.h(z);
                    Object O = av8Var2.O();
                    if (h || O == nf3.a) {
                        O = new c31(z, i4);
                        av8Var2.n0(O);
                    }
                    xtc d0 = l98.d0(n9e.q(rd0.N(s02.M(d, (Function1) O), s22Var.c() / 2.0f, 13.5f), lz.D(R.color.primary_default, av8Var2), oyn.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, 1);
                    k1c c = e12.c(mv1Var, false);
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
                    waa.K(av8Var2, c, hf3.g);
                    waa.K(av8Var2, m, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C, hf3.d);
                    long D = lz.D(R.color.on_color_primary, av8Var2);
                    yf8 yf8Var = xth.a;
                    q5a.w("NEW", null, D, null, 0L, 0L, null, 0L, 0, false, 1, 0, xth.c(), av8Var2, 6, 24576, 114682);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                of3 of3Var3 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    fz8.e(this.b, null, uo5.e(s02.h0(200, 0, null, 6), 2), uo5.f(s02.h0(200, 0, null, 6), 2), null, od3.b, av8Var3, 200064, 18);
                } else {
                    av8Var3.W();
                }
                break;
            case 3:
                of3 of3Var4 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((n8g) obj).getClass();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue5 & 1, (intValue5 & 17) != 16)) {
                    String v = oea.v(R.string.menu_live, av8Var4);
                    yf8 yf8Var2 = xth.a;
                    q5a.w(v, null, z ? ljg.f(av8Var4, -430428216, R.color.surface_1, av8Var4, false) : ljg.f(av8Var4, -430427612, R.color.live, av8Var4, false), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.b(), av8Var4, 0, 0, 131066);
                    kq9.b(s6a.N(z ? R.drawable.marker_live_1 : R.drawable.marker_live_0, 6, av8Var4), null, null, 0L, av8Var4, 48, 12);
                } else {
                    av8Var4.W();
                }
                break;
            case 4:
                Throwable th = (Throwable) obj3;
                ((pk9) obj).getClass();
                ((yj9) obj2).getClass();
                th.getClass();
                bjb bjbVar = gk9.a;
                Throwable Q = xw3.Q(th);
                if ((Q instanceof hk9) || (Q instanceof wj3) || (Q instanceof SocketTimeoutException)) {
                    r14 = z;
                } else if (!(th instanceof CancellationException)) {
                    r14 = true;
                }
                break;
            case 5:
                xsi xsiVar = (xsi) obj;
                of3 of3Var5 = (of3) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                xsiVar.getClass();
                String str = xsiVar.d;
                String str2 = xsiVar.c;
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((av8) of3Var5).g(xsiVar) ? 4 : 2;
                }
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue6 & 1, (intValue6 & 19) != 18)) {
                    String str3 = z ? str2 : str;
                    if (!z) {
                        str = str2;
                    }
                    yf8 yf8Var3 = xth.a;
                    dfj m2 = xth.m();
                    if (xsiVar.e) {
                        f = ljg.f(av8Var5, -1144437600, R.color.live, av8Var5, false);
                    } else {
                        Integer intOrNull = StringsKt.toIntOrNull(str3);
                        int intValue7 = intOrNull != null ? intOrNull.intValue() : 0;
                        Integer intOrNull2 = StringsKt.toIntOrNull(str);
                        if (intValue7 > (intOrNull2 != null ? intOrNull2.intValue() : 0)) {
                            i = -1144435104;
                            i2 = R.color.n_lv_1;
                        } else {
                            i = -1144434400;
                            i2 = R.color.n_lv_3;
                        }
                        f = ljg.f(av8Var5, i, i2, av8Var5, false);
                    }
                    long j = f;
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    udj.c(str3, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), j, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, m2, av8Var5, 0, 0, 130040);
                } else {
                    av8Var5.W();
                }
                break;
            case 6:
                mnb mnbVar = (mnb) obj;
                of3 of3Var6 = (of3) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                mnbVar.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((av8) of3Var6).g(mnbVar) ? 4 : 2;
                }
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(intValue8 & 1, (intValue8 & 19) != 18)) {
                    if (z) {
                        av8Var6.d0(1897526645);
                        u0 = bkh.d(utcVar, 1.0f);
                        av8Var6.s(false);
                    } else {
                        av8Var6.d0(-2052877292);
                        u0 = hkg.u0(hkg.J(), hkg.o0(av8Var6), false, 14);
                        av8Var6.s(false);
                    }
                    t62.h(l98.d0(u0, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), mnbVar.a.a(av8Var6), mnbVar.b.a(av8Var6), s6a.N(R.drawable.check_back_later, 6, av8Var6), null, false, 0L, av8Var6, 0, 112);
                } else {
                    av8Var6.W();
                }
                break;
            default:
                of3 of3Var7 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                kq9.b(s6a.N(z ? R.drawable.ic_search : R.drawable.ic_swap, 6, of3Var7), null, bkh.l(utcVar, 16.0f), lz.D(R.color.on_color_primary, of3Var7), of3Var7, 432, 0);
                break;
        }
        return Unit.a;
    }
}
