package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class gs5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ xtc c;
    public final /* synthetic */ int d;

    public /* synthetic */ gs5(int i, xtc xtcVar, boolean z, int i2) {
        this.a = 2;
        this.d = i;
        this.c = xtcVar;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                u6h.f(this.b, this.c, of3Var, aba.K(this.d | 1));
                break;
            case 1:
                yso.j(this.b, this.c, of3Var, aba.K(this.d | 1));
                break;
            case 2:
                td4.I(this.d, aba.K(49), of3Var, this.c, this.b);
                break;
            case 3:
                s6a.a(this.b, this.c, of3Var, aba.K(this.d | 1));
                break;
            default:
                t62.o(this.b, this.c, of3Var, aba.K(this.d | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ gs5(boolean z, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = xtcVar;
        this.d = i;
    }
}
