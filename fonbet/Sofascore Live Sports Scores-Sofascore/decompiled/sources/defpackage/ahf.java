package defpackage;

import com.sofascore.local_persistance.BrandingFantasyCompetition;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ahf implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ahf(long j, ev6 ev6Var) {
        this.a = 3;
        this.b = j;
        this.c = ev6Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        int i = this.a;
        long j2 = this.b;
        utc utcVar = utc.a;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ghf ghfVar = (ghf) obj4;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).h(booleanValue) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    g28 g28Var = bkh.c;
                    k1c c = e12.c(uxf.g, false);
                    int G = z8e.G(av8Var);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, g28Var);
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
                    f50 f50Var = hf3.j;
                    if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                        mz1.t(G, av8Var, G, f50Var);
                    }
                    waa.K(av8Var, C, hf3.d);
                    float f = bhf.b;
                    float f2 = bhf.c;
                    float f3 = (f + f2) * 2.0f;
                    long j3 = this.b;
                    if (booleanValue) {
                        av8Var.d0(-1916589279);
                        ocf.a(f2, 0, 390, j3, 0L, av8Var, bkh.l(utcVar, f3));
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-1916362142);
                        bhf.a(ghfVar, j3, bkh.l(utcVar, f3), av8Var, 384);
                        av8Var = av8Var;
                        av8Var.s(false);
                    }
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                bmd bmdVar = (bmd) obj4;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    xtc b0 = l98.b0(bkh.c, 16.0f);
                    u23 a = t23.a(ww9.f, uxf.o, av8Var2, 6);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m2 = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, b0);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var2);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a, hf3.g);
                    waa.K(av8Var2, m2, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C2, hf3.d);
                    String str = bmdVar.g;
                    long j4 = this.b;
                    if (str != null) {
                        av8Var2.d0(-2182017);
                        xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                        String str2 = bmdVar.g;
                        yf8 yf8Var = xth.a;
                        j = j4;
                        udj.c(str2, f0, j, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.j(), av8Var2, 48, 0, 130040);
                        av8Var2.s(false);
                    } else {
                        j = j4;
                        av8Var2.d0(-1828896);
                        av8Var2.s(false);
                    }
                    xtc d0 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 1);
                    String str3 = bmdVar.h;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = str3;
                    yf8 yf8Var2 = xth.a;
                    udj.c(str4, d0, j, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var2, 48, 0, 131064);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                tc3 tc3Var = wnn.d;
                String str5 = (String) obj4;
                n8g n8gVar = (n8g) obj;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                n8gVar.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((av8) of3Var3).g(n8gVar) ? 4 : 2;
                }
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 19) != 18)) {
                    tc3Var.invoke(n8gVar, av8Var3, Integer.valueOf(intValue3 & 14));
                    xtc f02 = l98.f0(utc.a, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                    yf8 yf8Var3 = xth.a;
                    udj.c(str5, f02, this.b, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.a(), av8Var3, 48, 0, 130040);
                } else {
                    av8Var3.W();
                }
                break;
            case 3:
                ev6 ev6Var = (ev6) obj4;
                s22 s22Var = (s22) obj;
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                s22Var.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((av8) of3Var4).g(s22Var) ? 4 : 2;
                }
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 19) != 18)) {
                    lv1 lv1Var = uxf.m;
                    xtc s = tgj.s(bkh.e(bkh.d(n9e.q(utcVar, j2, oyn.e), 1.0f), 18.0f), Integer.MAX_VALUE, 0, 0, new a70(17), 48.0f, 10);
                    l8g a2 = k8g.a(ww9.b, lv1Var, av8Var4, 48);
                    int hashCode2 = Long.hashCode(av8Var4.T);
                    aee m3 = av8Var4.m();
                    xtc C3 = fqj.C(av8Var4, s);
                    if3.k7.getClass();
                    zg3 zg3Var3 = hf3.b;
                    av8Var4.h0();
                    if (av8Var4.S) {
                        av8Var4.l(zg3Var3);
                    } else {
                        av8Var4.q0();
                    }
                    waa.K(av8Var4, a2, hf3.g);
                    waa.K(av8Var4, m3, hf3.f);
                    waa.K(av8Var4, Integer.valueOf(hashCode2), hf3.j);
                    waa.J(av8Var4, hf3.k);
                    waa.K(av8Var4, C3, hf3.d);
                    BrandingFantasyCompetition brandingFantasyCompetition = ev6Var.D;
                    if (brandingFantasyCompetition != null) {
                        it7 it7Var = un6.b;
                        un6 un6Var = un6.FULL;
                        it7Var.getClass();
                        if (it7.x(brandingFantasyCompetition, un6Var, true)) {
                            av8Var4.d0(-774129554);
                            o02.c(ev6Var.D, s22Var.c(), av8Var4, 0);
                            av8Var4.s(false);
                            av8Var4.s(true);
                        }
                    }
                    if (!ev6Var.y || ev6Var.z == null) {
                        av8Var4.d0(-774120553);
                        o02.l(s22Var.c(), av8Var4, 0);
                        av8Var4.s(false);
                    } else {
                        av8Var4.d0(-774123860);
                        o02.s(ev6Var, s22Var.c(), av8Var4, 0);
                        av8Var4.s(false);
                    }
                    av8Var4.s(true);
                } else {
                    av8Var4.W();
                }
                break;
            default:
                dwb dwbVar = (dwb) obj4;
                of3 of3Var5 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 17) != 16)) {
                    xtc q = n9e.q(bkh.d(utcVar, 1.0f), r13.c(j2, 0.05f), oyn.e);
                    u23 a3 = t23.a(ww9.d, uxf.p, av8Var5, 48);
                    int hashCode3 = Long.hashCode(av8Var5.T);
                    aee m4 = av8Var5.m();
                    xtc C4 = fqj.C(av8Var5, q);
                    if3.k7.getClass();
                    zg3 zg3Var4 = hf3.b;
                    av8Var5.h0();
                    if (av8Var5.S) {
                        av8Var5.l(zg3Var4);
                    } else {
                        av8Var5.q0();
                    }
                    waa.K(av8Var5, a3, hf3.g);
                    waa.K(av8Var5, m4, hf3.f);
                    waa.K(av8Var5, Integer.valueOf(hashCode3), hf3.j);
                    waa.J(av8Var5, hf3.k);
                    waa.K(av8Var5, C4, hf3.d);
                    String g = bf3.g(14.0f, R.string.super_odds, av8Var5, av8Var5, utcVar);
                    yf8 yf8Var4 = xth.a;
                    udj.c(g, null, lz.D(R.color.n_lv_1, av8Var5), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var5, 0, 0, 131066);
                    nq8.h(av8Var5, bkh.e(utcVar, 8.0f));
                    String str6 = dwbVar.b;
                    String str7 = dwbVar.d;
                    udj.c(str6, null, lz.D(R.color.n_lv_1, av8Var5), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.h(), av8Var5, 0, 0, 131066);
                    nq8.h(av8Var5, bkh.e(utcVar, 2.0f));
                    if (str7 != null) {
                        av8Var5.d0(-1460767063);
                        udj.c(oea.w(R.string.standard_odds, new Object[]{str7}, av8Var5), null, lz.D(R.color.n_lv_3, av8Var5), null, 0L, null, 0L, v8j.d, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var5, 805306368, 0, 130554);
                        av8Var5.s(false);
                    } else {
                        av8Var5.d0(-1460462829);
                        av8Var5.s(false);
                    }
                    w1l.s(utcVar, 8.0f, av8Var5, true);
                } else {
                    av8Var5.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ahf(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }

    public /* synthetic */ ahf(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
