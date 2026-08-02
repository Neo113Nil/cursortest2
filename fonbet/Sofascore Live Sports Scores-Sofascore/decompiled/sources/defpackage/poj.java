package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class poj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v23 b;
    public final /* synthetic */ ooj c;
    public final /* synthetic */ int d;

    public /* synthetic */ poj(v23 v23Var, ooj oojVar, int i, int i2) {
        this.a = i2;
        this.b = v23Var;
        this.c = oojVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        ooj oojVar = this.c;
        v23 v23Var = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                rfo.p(v23Var, oojVar, of3Var, aba.K(i2 | 1));
                break;
            case 1:
                rfo.k(v23Var, oojVar, of3Var, aba.K(i2 | 1));
                break;
            case 2:
                rfo.m(v23Var, oojVar, of3Var, aba.K(i2 | 1));
                break;
            default:
                rfo.q(v23Var, oojVar, of3Var, aba.K(i2 | 1));
                break;
        }
        return Unit.a;
    }
}
