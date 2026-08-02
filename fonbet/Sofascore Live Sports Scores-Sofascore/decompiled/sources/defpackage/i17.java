package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class i17 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ double b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i17(double d, j17 j17Var) {
        this.b = d;
        this.c = j17Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        double d = this.b;
        switch (i) {
            case 0:
                j17 j17Var = (j17) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    xtc d0 = l98.d0(utc.a, (float) d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    gv9 gv9Var = j17Var.a.c;
                    il8 il8Var = il8.f;
                    ev6 ev6Var = j17Var.e;
                    Object O = av8Var.O();
                    if (O == nf3.a) {
                        O = new au6(16);
                        av8Var.n0(O);
                    }
                    un0.k(gv9Var, ev6Var, il8Var, false, false, true, null, (Function0) O, d0, false, false, av8Var, 14380416, 6, 512);
                } else {
                    av8Var.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                b9b.h(d, (xtc) obj3, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ i17(double d, xtc xtcVar, int i) {
        this.b = d;
        this.c = xtcVar;
    }
}
