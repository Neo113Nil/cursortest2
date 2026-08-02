package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class h66 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ h66(int i) {
        this.a = 0;
        vmd vmdVar = vmd.EVENT_DETAILS;
        this.b = i;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        utc utcVar = utc.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                vmd vmdVar = vmd.EVENT_DETAILS;
                zpf zpfVar = (zpf) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                zpfVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(zpfVar) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    xtc d0 = l98.d0(lz.J(bkh.c, jaa.L(av8Var), null), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                    t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 5);
                    boolean e = av8Var.e(i2) | ((intValue & 14) == 4) | av8Var.e(6);
                    Object O = av8Var.O();
                    if (e || O == nf3.a) {
                        O = new tj(zpfVar, i2);
                        av8Var.n0(O);
                    }
                    v8a.a(d0, null, C, ng0Var, null, null, false, null, (Function1) O, av8Var, 24960, 490);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    utc utcVar2 = utc.a;
                    xtc d = bkh.d(utcVar2, 1.0f);
                    l8g a = k8g.a(ww9.c, uxf.l, av8Var2, 6);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, d);
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
                    waa.K(av8Var2, C2, hf3.d);
                    iu7.f(i2, 48, 0, av8Var2, l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 9));
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    rha.b(oea.v(i2, av8Var3), u0a.F(utcVar, icb.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var3, 62), 0L, av8Var3, 0, 4);
                } else {
                    av8Var3.W();
                }
                break;
            case 3:
                m1c m1cVar = (m1c) obj;
                g1c g1cVar = (g1c) obj2;
                m1cVar.getClass();
                g1cVar.getClass();
                long j = ((an3) obj3).a;
                int i3 = this.b;
                qhe J = g1cVar.J(an3.a(j, i3, i3, 0, 0, 12));
                break;
            case 4:
                xtc xtcVar = (xtc) obj;
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                xtcVar.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((av8) of3Var4).g(xtcVar) ? 4 : 2;
                }
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 19) != 18)) {
                    td4.G(this.b, xtcVar, false, 0L, av8Var4, (intValue4 << 3) & 112, 12);
                } else {
                    av8Var4.W();
                }
                break;
            case 5:
                xtc xtcVar2 = (xtc) obj;
                of3 of3Var5 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                xtcVar2.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((av8) of3Var5).g(xtcVar2) ? 4 : 2;
                }
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 19) != 18)) {
                    td4.G(this.b, xtcVar2, false, 0L, av8Var5, (intValue5 << 3) & 112, 12);
                } else {
                    av8Var5.W();
                }
                break;
            case 6:
                xpa xpaVar = (xpa) obj;
                of3 of3Var6 = (of3) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                xpaVar.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((av8) of3Var6).g(xpaVar) ? 4 : 2;
                }
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(intValue6 & 1, (intValue6 & 19) != 18)) {
                    ktm.m(oea.v(i2, av8Var6), haa.t(R.drawable.match_shotmap, 0, av8Var6), xpa.a(xpaVar, utcVar, 7), av8Var6, 64);
                } else {
                    av8Var6.W();
                }
                break;
            default:
                of3 of3Var7 = (of3) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((xtc) obj).getClass();
                av8 av8Var7 = (av8) of3Var7;
                if (av8Var7.T(intValue7 & 1, (intValue7 & 17) != 16)) {
                    td4.y(this.b, 48, 12, av8Var7, bkh.l(utcVar, 24.0f), null, false);
                } else {
                    av8Var7.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ h66(int i, int i2) {
        this.a = i2;
        this.b = i;
    }
}
