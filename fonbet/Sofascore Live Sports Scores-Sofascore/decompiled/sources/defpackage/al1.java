package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class al1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gv9 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ xtc e;

    public /* synthetic */ al1(gv9 gv9Var, Function1 function1, xtc xtcVar, String str, int i) {
        this.a = 2;
        this.b = gv9Var;
        this.d = function1;
        this.e = xtcVar;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                o02.p(aba.K(1), (of3) obj, this.b, this.e, this.c, this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                rz8.g(aba.K(1), (of3) obj, this.b, this.e, this.c, this.d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                g7a.f(aba.K(1), (of3) obj, this.b, this.e, this.c, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                fyg.i(aba.K(3073), (of3) obj, this.b, this.e, this.c, this.d);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ al1(gv9 gv9Var, String str, Function1 function1, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.b = gv9Var;
        this.c = str;
        this.d = function1;
        this.e = xtcVar;
    }
}
