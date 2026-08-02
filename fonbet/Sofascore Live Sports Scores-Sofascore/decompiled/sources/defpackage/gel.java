package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class gel implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ gel(gv9 gv9Var, xtc xtcVar, Function1 function1, float f, float f2, int i) {
        this.g = gv9Var;
        this.b = xtcVar;
        this.c = function1;
        this.d = f;
        this.e = f2;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                b0a.e(this.b, (wn1) this.g, this.c, this.d, this.e, (of3) obj, aba.K(this.f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                b0a.b((gv9) this.g, this.b, this.c, this.d, this.e, (of3) obj, aba.K(this.f | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ gel(xtc xtcVar, wn1 wn1Var, Function1 function1, float f, float f2, int i) {
        this.b = xtcVar;
        this.g = wn1Var;
        this.c = function1;
        this.d = f;
        this.e = f2;
        this.f = i;
    }
}
