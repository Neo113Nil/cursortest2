package defpackage;

import com.moloco.sdk.internal.publisher.h0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class g30 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g30(long j, boolean z, xtc xtcVar, pnd pndVar) {
        this.c = j;
        this.b = z;
        this.d = xtcVar;
        this.e = pndVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                xtc xtcVar = (xtc) obj3;
                final pnd pndVar = (pnd) obj4;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                final int i2 = 0;
                final int i3 = 1;
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    long j = this.c;
                    boolean z = this.b;
                    a99 a99Var = nf3.a;
                    if (j != 9205357640488583168L) {
                        av8Var.d0(3458246);
                        lg0 lg0Var = z ? rz8.c : rz8.a;
                        xtc k = bkh.k(xtcVar, s75.b(j), s75.a(j), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
                        l8g a = k8g.a(lg0Var, uxf.l, av8Var, 0);
                        int hashCode = Long.hashCode(av8Var.T);
                        aee m = av8Var.m();
                        xtc C = fqj.C(av8Var, k);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, a, hf3.g);
                        waa.K(av8Var, m, hf3.f);
                        waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                        waa.J(av8Var, hf3.k);
                        waa.K(av8Var, C, hf3.d);
                        boolean i4 = av8Var.i(pndVar);
                        Object O = av8Var.O();
                        if (i4 || O == a99Var) {
                            O = new Function0() { // from class: h30
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i5 = i2;
                                    pnd pndVar2 = pndVar;
                                    switch (i5) {
                                        case 0:
                                            return Boolean.valueOf((9223372034707292159L & pndVar2.a()) != 9205357640488583168L);
                                        default:
                                            return Boolean.valueOf((9223372034707292159L & pndVar2.a()) != 9205357640488583168L);
                                    }
                                }
                            };
                            av8Var.n0(O);
                        }
                        fcp.Z(6, av8Var, utc.a, (Function0) O, z);
                        av8Var.s(true);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(4389176);
                        boolean i5 = av8Var.i(pndVar);
                        Object O2 = av8Var.O();
                        if (i5 || O2 == a99Var) {
                            O2 = new Function0() { // from class: h30
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i52 = i3;
                                    pnd pndVar2 = pndVar;
                                    switch (i52) {
                                        case 0:
                                            return Boolean.valueOf((9223372034707292159L & pndVar2.a()) != 9205357640488583168L);
                                        default:
                                            return Boolean.valueOf((9223372034707292159L & pndVar2.a()) != 9205357640488583168L);
                                    }
                                }
                            };
                            av8Var.n0(O2);
                        }
                        fcp.Z(0, av8Var, xtcVar, (Function0) O2, z);
                        av8Var.s(false);
                    }
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                qha.h((tt2) obj3, this.b, this.c, (Function0) obj4, (of3) obj, aba.K(3073));
                break;
            default:
                ((Integer) obj2).getClass();
                h0.m(this.b, (o) obj4, (xtc) obj3, this.c, (of3) obj, 1);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ g30(tt2 tt2Var, boolean z, long j, Function0 function0, int i) {
        this.d = tt2Var;
        this.b = z;
        this.c = j;
        this.e = function0;
    }

    public /* synthetic */ g30(boolean z, o oVar, xtc xtcVar, long j, int i) {
        this.b = z;
        this.e = oVar;
        this.d = xtcVar;
        this.c = j;
    }
}
