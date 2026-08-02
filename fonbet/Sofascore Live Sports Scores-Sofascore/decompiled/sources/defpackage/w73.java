package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class w73 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ xtc c;

    public /* synthetic */ w73(xtc xtcVar, float f, int i) {
        this.a = 3;
        this.c = xtcVar;
        this.b = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ml4.H(this.b, aba.K(7), of3Var, this.c);
                break;
            case 1:
                rfo.h(this.b, aba.K(49), of3Var, this.c);
                break;
            case 2:
                d7a.g(this.b, aba.K(1), of3Var, this.c);
                break;
            default:
                ufa.h(this.b, aba.K(1), of3Var, this.c);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ w73(float f, int i, int i2, xtc xtcVar) {
        this.a = i2;
        this.b = f;
        this.c = xtcVar;
    }
}
