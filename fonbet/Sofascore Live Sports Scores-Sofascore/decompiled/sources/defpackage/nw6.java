package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class nw6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Double b;
    public final /* synthetic */ xtc c;

    public /* synthetic */ nw6(Double d, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.b = d;
        this.c = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                tgj.l(this.b, this.c, of3Var, aba.K(49));
                break;
            case 1:
                b9b.f(this.b, this.c, of3Var, aba.K(49));
                break;
            default:
                m9b.i(this.b, this.c, of3Var, aba.K(49));
                break;
        }
        return Unit.a;
    }
}
