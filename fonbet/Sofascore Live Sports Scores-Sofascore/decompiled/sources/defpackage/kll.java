package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class kll implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mll b;
    public final /* synthetic */ vy8 c;

    public /* synthetic */ kll(mll mllVar, vy8 vy8Var, int i, int i2) {
        this.a = i2;
        this.b = mllVar;
        this.c = vy8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        vy8 vy8Var = this.c;
        mll mllVar = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                wca.k(mllVar, vy8Var, of3Var, aba.K(1));
                break;
            case 1:
                wca.a(mllVar, vy8Var, of3Var, aba.K(1));
                break;
            default:
                wca.b(mllVar, vy8Var, of3Var, aba.K(1));
                break;
        }
        return Unit.a;
    }
}
