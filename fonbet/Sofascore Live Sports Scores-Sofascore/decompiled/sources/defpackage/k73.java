package defpackage;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class k73 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gv9 b;

    public /* synthetic */ k73(int i, gv9 gv9Var) {
        this.a = i;
        this.b = gv9Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        int i3 = this.a;
        utc utcVar = utc.a;
        gv9<eze> gv9Var = this.b;
        switch (i3) {
            case 0:
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                av8 av8Var = (av8) ((of3) obj2);
                Object O = av8Var.O();
                a99 a99Var = nf3.a;
                if (O == a99Var) {
                    O = new b42(26);
                    av8Var.n0(O);
                }
                Function1 function1 = (Function1) O;
                Object O2 = av8Var.O();
                if (O2 == a99Var) {
                    O2 = new b42(27);
                    av8Var.n0(O2);
                }
                l98.b(this.b, null, function1, null, "HeatmapMorph", (Function1) O2, hkg.l, av8Var, 1794432, 10);
                return Unit.a;
            case 1:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 17) != 16)) {
                    kv1 kv1Var = uxf.p;
                    xtc f0 = l98.f0(l98.d0(n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_1, av8Var2), oyn.e), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7);
                    u23 a = t23.a(ww9.d, kv1Var, av8Var2, 48);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, f0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a, hf3.g);
                    waa.K(av8Var2, m, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C, hf3.d);
                    rha.b(oea.v(R.string.general, av8Var2), null, 0L, av8Var2, 0, 6);
                    av8Var2.d0(-978855183);
                    int i4 = 0;
                    for (Object obj4 : gv9Var) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            b.q();
                            throw null;
                        }
                        f93 f93Var = (f93) obj4;
                        if (f93Var.d.equals(CampaignEx.JSON_KEY_STAR)) {
                            av8Var2.d0(-743548700);
                            t62.l(f93Var, null, av8Var2, 0);
                            av8Var2.s(false);
                        } else {
                            av8Var2.d0(-743455638);
                            j72.k(f93Var, null, av8Var2, 0);
                            av8Var2.s(false);
                        }
                        if (i4 != gv9Var.size() - 1) {
                            av8Var2.d0(-743321904);
                            td4.w(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lz.D(R.color.n_lv_4, av8Var2), av8Var2, 0, 3);
                            av8Var2.s(false);
                        } else {
                            av8Var2.d0(-743248868);
                            av8Var2.s(false);
                        }
                        i4 = i5;
                    }
                    av8Var2.s(false);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 2:
                xpa xpaVar = (xpa) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                xpaVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(xpaVar) ? 4 : 2;
                }
                av8 av8Var3 = (av8) of3Var2;
                if (av8Var3.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    qx9.d(gv9Var, xpa.a(xpaVar, l98.f0(utc.a, 8.0f, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), 7), av8Var3, 0);
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 3:
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((kb8) obj).getClass();
                av8 av8Var4 = (av8) of3Var3;
                if (av8Var4.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    for (eze ezeVar : gv9Var) {
                        xtc q = bkh.q(utcVar, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        u23 a2 = t23.a(ww9.d, uxf.p, av8Var4, 48);
                        int hashCode2 = Long.hashCode(av8Var4.T);
                        aee m2 = av8Var4.m();
                        xtc C2 = fqj.C(av8Var4, q);
                        if3.k7.getClass();
                        zg3 zg3Var2 = hf3.b;
                        av8Var4.h0();
                        if (av8Var4.S) {
                            av8Var4.l(zg3Var2);
                        } else {
                            av8Var4.q0();
                        }
                        waa.K(av8Var4, a2, hf3.g);
                        waa.K(av8Var4, m2, hf3.f);
                        waa.K(av8Var4, Integer.valueOf(hashCode2), hf3.j);
                        waa.J(av8Var4, hf3.k);
                        waa.K(av8Var4, C2, hf3.d);
                        String str = ezeVar.a;
                        long D = lz.D(ezeVar.c, av8Var4);
                        yf8 yf8Var = xth.a;
                        dfj g = xth.g();
                        xtc g2 = bkh.g(utcVar, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        lv1 lv1Var = uxf.m;
                        av8 av8Var5 = av8Var4;
                        udj.c(str, bkh.r(g2, lv1Var, 2), D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, g, av8Var5, 48, 0, 131064);
                        udj.c(ezeVar.b, bkh.r(bkh.g(utcVar, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lv1Var, 2), lz.D(ezeVar.d, av8Var5), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var5, 48, 0, 131064);
                        av8Var5.s(true);
                        av8Var4 = av8Var5;
                    }
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            default:
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((kb8) obj).getClass();
                av8 av8Var6 = (av8) of3Var4;
                if (av8Var6.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Iterator<E> it = gv9Var.iterator();
                    while (it.hasNext()) {
                        bde bdeVar = (bde) it.next();
                        yf8 yf8Var2 = xth.a;
                        dfj g3 = xth.g();
                        String str2 = bdeVar.a;
                        int ordinal = bdeVar.b.ordinal();
                        if (ordinal == 2) {
                            i = -1564284046;
                            i2 = R.color.success;
                        } else if (ordinal != 3) {
                            i = -1564280593;
                            i2 = R.color.n_lv_3;
                        } else {
                            i = -1564281840;
                            i2 = R.color.error;
                        }
                        udj.c(str2, null, ljg.f(av8Var6, i, i2, av8Var6, false), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, g3, av8Var6, 0, 0, 131066);
                    }
                } else {
                    av8Var6.W();
                }
                return Unit.a;
        }
    }
}
