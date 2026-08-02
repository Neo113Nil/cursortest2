package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sni implements Function2 {
    public final /* synthetic */ xtc a;
    public final /* synthetic */ uah b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ qz1 e;
    public final /* synthetic */ wzc f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ float i;
    public final /* synthetic */ tc3 j;

    public sni(float f, float f2, long j, qz1 qz1Var, tc3 tc3Var, xtc xtcVar, wzc wzcVar, uah uahVar, Function0 function0, boolean z) {
        this.a = xtcVar;
        this.b = uahVar;
        this.c = j;
        this.d = f;
        this.e = qz1Var;
        this.f = wzcVar;
        this.g = z;
        this.h = function0;
        this.i = f2;
        this.j = tc3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        int intValue = ((Number) obj2).intValue();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
            ye9 ye9Var = l7a.a;
            xtc G = u6h.G(oyn.u(uni.d(this.a.z(yjc.a), this.b, uni.e(this.c, this.d, av8Var), this.e, ((kx4) av8Var.k(dh3.h)).H0(this.i)), this.f, n5g.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false), this.g, null, null, this.h, 24));
            k1c c = e12.c(uxf.c, true);
            int G2 = z8e.G(av8Var);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, G);
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
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G2))) {
                mz1.t(G2, av8Var, G2, f50Var);
            }
            waa.K(av8Var, C, hf3.d);
            fc6.v(0, this.j, av8Var, true);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
