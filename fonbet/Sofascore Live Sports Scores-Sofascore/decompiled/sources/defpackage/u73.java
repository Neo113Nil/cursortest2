package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class u73 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gv9 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ xtc e;

    public /* synthetic */ u73(gv9 gv9Var, Function1 function1, boolean z, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.b = gv9Var;
        this.c = function1;
        this.d = z;
        this.e = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                ml4.y(aba.K(1), (of3) obj, this.b, this.e, this.c, this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ml4.F(aba.K(1), (of3) obj, this.b, this.e, this.c, this.d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                o3a.j(aba.K(1), (of3) obj, this.b, this.e, this.c, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                haa.k(aba.K(1), (of3) obj, this.b, this.e, this.c, this.d);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ u73(gv9 gv9Var, boolean z, Function1 function1, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.b = gv9Var;
        this.d = z;
        this.c = function1;
        this.e = xtcVar;
    }
}
