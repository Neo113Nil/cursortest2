package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class nph implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ tc3 c;

    public /* synthetic */ nph(boolean z, tc3 tc3Var, int i) {
        this.a = i;
        this.b = z;
        this.c = tc3Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        xtc r;
        xtc r2;
        xtc r3;
        int i = this.a;
        utc utcVar = utc.a;
        tc3 tc3Var = this.c;
        boolean z = this.b;
        xtc xtcVar = (xtc) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                xtcVar.getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    if (z) {
                        av8Var.d0(1098968178);
                        r = bkh.e(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-1407927791);
                        r = bkh.r(utcVar, null, 3);
                        av8Var.s(false);
                    }
                    k1c c = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, r);
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
                    fc6.v(0, tc3Var, av8Var, true);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                xtcVar.getClass();
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 17) != 16)) {
                    if (z) {
                        av8Var2.d0(-1398898750);
                        r2 = bkh.e(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(1081894177);
                        r2 = bkh.r(utcVar, null, 3);
                        av8Var2.s(false);
                    }
                    k1c c2 = e12.c(uxf.c, false);
                    int hashCode2 = Long.hashCode(av8Var2.T);
                    aee m2 = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, r2);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var2);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, c2, hf3.g);
                    waa.K(av8Var2, m2, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode2), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C2, hf3.d);
                    fc6.v(0, tc3Var, av8Var2, true);
                } else {
                    av8Var2.W();
                }
                break;
            default:
                xtcVar.getClass();
                av8 av8Var3 = (av8) of3Var;
                if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                    if (z) {
                        av8Var3.d0(-764064673);
                        r3 = bkh.e(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        av8Var3.s(false);
                    } else {
                        av8Var3.d0(1860305086);
                        r3 = bkh.r(utcVar, null, 3);
                        av8Var3.s(false);
                    }
                    k1c c3 = e12.c(uxf.c, false);
                    int hashCode3 = Long.hashCode(av8Var3.T);
                    aee m3 = av8Var3.m();
                    xtc C3 = fqj.C(av8Var3, r3);
                    if3.k7.getClass();
                    zg3 zg3Var3 = hf3.b;
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var3);
                    } else {
                        av8Var3.q0();
                    }
                    waa.K(av8Var3, c3, hf3.g);
                    waa.K(av8Var3, m3, hf3.f);
                    waa.K(av8Var3, Integer.valueOf(hashCode3), hf3.j);
                    waa.J(av8Var3, hf3.k);
                    waa.K(av8Var3, C3, hf3.d);
                    fc6.v(0, tc3Var, av8Var3, true);
                } else {
                    av8Var3.W();
                }
                break;
        }
        return Unit.a;
    }
}
