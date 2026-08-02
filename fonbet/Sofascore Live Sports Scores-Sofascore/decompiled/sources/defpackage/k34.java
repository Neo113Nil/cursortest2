package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class k34 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f38 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function0 e;

    public /* synthetic */ k34(f38 f38Var, Function1 function1, Function1 function12, Function0 function0, int i) {
        this.a = i;
        this.b = f38Var;
        this.c = function1;
        this.d = function12;
        this.e = function0;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        r70 r70Var = (r70) obj;
        of3 of3Var = (of3) obj2;
        ((Integer) obj3).getClass();
        switch (i) {
            case 0:
                r70Var.getClass();
                pco.o(this.b, this.c, this.d, this.e, of3Var, 0);
                break;
            default:
                r70Var.getClass();
                pco.o(this.b, this.c, this.d, this.e, of3Var, 0);
                break;
        }
        return Unit.a;
    }
}
