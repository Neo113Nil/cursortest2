package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class w6j implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z6j b;

    public /* synthetic */ w6j(z6j z6jVar, int i) {
        this.a = i;
        this.b = z6jVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        z6j z6jVar = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    String str = z6jVar.k;
                    bx7 bx7Var = z6jVar.l;
                    l98.r(str, bx7Var != null ? bx7Var.c : null, bx7Var != null ? bx7Var.b : null, bx7Var != null ? bx7Var.d : null, av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                fy7 fy7Var = z6jVar.m;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    k1c c = e12.c(uxf.g, false);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    utc utcVar = utc.a;
                    xtc C = fqj.C(av8Var2, utcVar);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var2, c, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var2, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var2, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var2, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var2, C, f50Var3);
                    kq9.b(s6a.N(R.drawable.ic_tennis_tournament, 6, av8Var2), null, bkh.m(utcVar, 344.0f, 136.0f), lz.D(R.color.n_lv_5, av8Var2), av8Var2, 432, 0);
                    xtc d = bkh.d(utcVar, 1.0f);
                    l8g a = k8g.a(new ng0(48.0f, true, new a70(6)), uxf.m, av8Var2, 54);
                    int hashCode2 = Long.hashCode(av8Var2.T);
                    aee m2 = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, d);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a, f50Var);
                    waa.K(av8Var2, m2, ff3Var);
                    bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                    waa.K(av8Var2, C2, f50Var3);
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    u23 a2 = t23.a(ww9.d, uxf.p, av8Var2, 48);
                    int hashCode3 = Long.hashCode(av8Var2.T);
                    aee m3 = av8Var2.m();
                    xtc C3 = fqj.C(av8Var2, goaVar);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a2, f50Var);
                    waa.K(av8Var2, m3, ff3Var);
                    bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
                    waa.K(av8Var2, C3, f50Var3);
                    td4.J(fy7Var.a, 48, av8Var2, bkh.l(utcVar, 64.0f));
                    xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    String str2 = fy7Var.b;
                    String str3 = str2 == null ? "" : str2;
                    yf8 yf8Var = xth.a;
                    udj.c(str3, f0, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.j(), av8Var2, 48, 0, 130040);
                    av8Var2.s(true);
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    wkn.l(s6a.N(R.drawable.ic_tennis_trophy, 6, av8Var2), new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var2, 48, 120);
                    av8Var2.s(true);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                break;
            default:
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    mv1 mv1Var = uxf.c;
                    k1c c2 = e12.c(mv1Var, false);
                    int hashCode4 = Long.hashCode(av8Var3.T);
                    aee m4 = av8Var3.m();
                    utc utcVar2 = utc.a;
                    xtc C4 = fqj.C(av8Var3, utcVar2);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var2);
                    } else {
                        av8Var3.q0();
                    }
                    f50 f50Var4 = hf3.g;
                    waa.K(av8Var3, c2, f50Var4);
                    ff3 ff3Var2 = hf3.f;
                    waa.K(av8Var3, m4, ff3Var2);
                    Integer valueOf2 = Integer.valueOf(hashCode4);
                    f50 f50Var5 = hf3.j;
                    waa.K(av8Var3, valueOf2, f50Var5);
                    ry ryVar2 = hf3.k;
                    waa.J(av8Var3, ryVar2);
                    f50 f50Var6 = hf3.d;
                    waa.K(av8Var3, C4, f50Var6);
                    kq9.b(s6a.N(R.drawable.ic_tennis_tournament, 6, av8Var3), null, bkh.m(utcVar2, 320.0f, 240.0f), lz.D(R.color.n_lv_5, av8Var3), av8Var3, 432, 0);
                    xtc m5 = bkh.m(utcVar2, 120.0f, 140.0f);
                    mv1 mv1Var2 = uxf.d;
                    n12 n12Var = n12.a;
                    wkn.l(s6a.N(R.drawable.ic_tennis_trophy, 6, av8Var3), n12Var.a(m5, mv1Var2), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var3, 48, 120);
                    xtc a3 = n12Var.a(utcVar2, uxf.j);
                    u23 a4 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.p, av8Var3, 54);
                    int hashCode5 = Long.hashCode(av8Var3.T);
                    aee m6 = av8Var3.m();
                    xtc C5 = fqj.C(av8Var3, a3);
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var2);
                    } else {
                        av8Var3.q0();
                    }
                    waa.K(av8Var3, a4, f50Var4);
                    waa.K(av8Var3, m6, ff3Var2);
                    bf3.s(hashCode5, av8Var3, f50Var5, av8Var3, ryVar2);
                    waa.K(av8Var3, C5, f50Var6);
                    k1c c3 = e12.c(mv1Var, false);
                    int hashCode6 = Long.hashCode(av8Var3.T);
                    aee m7 = av8Var3.m();
                    xtc C6 = fqj.C(av8Var3, utcVar2);
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var2);
                    } else {
                        av8Var3.q0();
                    }
                    waa.K(av8Var3, c3, f50Var4);
                    waa.K(av8Var3, m7, ff3Var2);
                    bf3.s(hashCode6, av8Var3, f50Var5, av8Var3, ryVar2);
                    waa.K(av8Var3, C6, f50Var6);
                    xtc l = bkh.l(utcVar2, 92.0f);
                    fy7 fy7Var2 = z6jVar.m;
                    td4.J(fy7Var2.a, 48, av8Var3, l);
                    td4.k(fy7Var2.i, n12Var.a(bkh.l(utcVar2, 32.0f), uxf.i), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var3, 0, 12);
                    av8Var3.s(true);
                    String str4 = fy7Var2.b;
                    String str5 = str4 == null ? "" : str4;
                    yf8 yf8Var2 = xth.a;
                    udj.c(str5, null, lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.j(), av8Var3, 0, 0, 130042);
                    av8Var3.s(true);
                    av8Var3.s(true);
                } else {
                    av8Var3.W();
                }
                break;
        }
        return Unit.a;
    }
}
