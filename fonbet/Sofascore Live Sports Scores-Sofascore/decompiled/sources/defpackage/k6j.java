package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class k6j implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m6j b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ xtc d;
    public final /* synthetic */ int e;

    public /* synthetic */ k6j(m6j m6jVar, Function1 function1, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.b = m6jVar;
        this.c = function1;
        this.d = xtcVar;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        xtc xtcVar = this.d;
        Function1 function1 = this.c;
        m6j m6jVar = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                yaa.g(m6jVar, function1, xtcVar, of3Var, aba.K(i2 | 1));
                break;
            default:
                nq8.l(m6jVar, function1, xtcVar, of3Var, aba.K(i2 | 1));
                break;
        }
        return Unit.a;
    }
}
