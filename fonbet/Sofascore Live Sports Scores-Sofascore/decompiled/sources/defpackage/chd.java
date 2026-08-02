package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class chd implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vnb b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ chd(vnb vnbVar, Function1 function1, int i, int i2) {
        this.a = i2;
        this.b = vnbVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ehd.b(this.b, this.c, of3Var, aba.K(1));
                break;
            case 1:
                y6a.i(this.b, this.c, of3Var, aba.K(1));
                break;
            default:
                gz8.v(this.b, this.c, of3Var, aba.K(1));
                break;
        }
        return Unit.a;
    }
}
