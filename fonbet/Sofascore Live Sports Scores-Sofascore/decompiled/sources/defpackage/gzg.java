package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class gzg implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gv9 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ gzg(gv9 gv9Var, Function1 function1, int i, int i2, int i3) {
        this.a = i3;
        this.b = gv9Var;
        this.c = function1;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        Function1 function1 = this.c;
        gv9 gv9Var = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                lz.a(aba.K(1), i2, of3Var, gv9Var, function1);
                break;
            default:
                s02.y(aba.K(1), i2, of3Var, gv9Var, function1);
                break;
        }
        return Unit.a;
    }
}
