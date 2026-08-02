package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class fel implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ xtc d;
    public final /* synthetic */ int e;

    public /* synthetic */ fel(int i, Function1 function1, xtc xtcVar, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = function1;
        this.d = xtcVar;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                b0a.d(this.b, this.c, this.d, of3Var, aba.K(this.e | 1));
                break;
            default:
                b0a.v(this.b, this.c, this.d, of3Var, aba.K(this.e | 1));
                break;
        }
        return Unit.a;
    }
}
