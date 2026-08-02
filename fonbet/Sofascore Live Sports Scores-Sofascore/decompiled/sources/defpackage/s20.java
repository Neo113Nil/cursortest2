package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class s20 extends xka implements Function2 {
    public final /* synthetic */ int i;
    public final /* synthetic */ b2f j;
    public final /* synthetic */ e1d k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s20(b2f b2fVar, e1d e1dVar, int i) {
        super(2);
        this.i = i;
        this.j = b2fVar;
        this.k = e1dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.i;
        e1d e1dVar = this.k;
        b2f b2fVar = this.j;
        int i2 = 0;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Number) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    Object O = av8Var.O();
                    a99 a99Var = nf3.a;
                    if (O == a99Var) {
                        O = ry.q;
                        av8Var.n0(O);
                    }
                    xtc a = o3h.a(utc.a, false, (Function1) O);
                    boolean i3 = av8Var.i(b2fVar);
                    Object O2 = av8Var.O();
                    if (i3 || O2 == a99Var) {
                        O2 = new p20(b2fVar, 1);
                        av8Var.n0(O2);
                    }
                    xtc C = u6h.C(o02.h0(a, (Function1) O2), b2fVar.getCanCalculatePosition() ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    ff5 ff5Var = t20.a;
                    Function2 function2 = (Function2) e1dVar.getValue();
                    Object O3 = av8Var.O();
                    if (O3 == a99Var) {
                        O3 = g00.c;
                        av8Var.n0(O3);
                    }
                    k1c k1cVar = (k1c) O3;
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C2 = fqj.C(av8Var, C);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, k1cVar, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C2, hf3.d);
                    me4.l(0, function2, av8Var, true);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Number) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    tol.b(t20.b.a(Boolean.TRUE), yqo.H(1022273628, av8Var2, new s20(b2fVar, e1dVar, i2)), av8Var2, 56);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
