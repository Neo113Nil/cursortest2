package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class x6g implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ w31 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ x6g(w31 w31Var, Function1 function1, xtc xtcVar, int i) {
        this.c = w31Var;
        this.d = function1;
        this.b = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                jaa.j(aba.K(1), this.c, of3Var, this.b, this.d);
                break;
            default:
                ufa.f(aba.K(1), this.c, of3Var, this.b, this.d);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ x6g(xtc xtcVar, w31 w31Var, Function1 function1, int i) {
        this.b = xtcVar;
        this.c = w31Var;
        this.d = function1;
    }
}
