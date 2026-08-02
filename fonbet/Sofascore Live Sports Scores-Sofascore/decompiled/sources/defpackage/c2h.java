package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class c2h implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ c2h(xtc xtcVar, List list, Function1 function1, int i) {
        this.b = xtcVar;
        this.c = list;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                num.getClass();
                e2h.b(aba.K(this.e | 1), of3Var, this.b, this.c, this.d);
                break;
            default:
                num.intValue();
                s7m.b(aba.K(this.e | 1), of3Var, this.b, this.c, this.d);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ c2h(List list, Function1 function1, xtc xtcVar, int i) {
        this.c = list;
        this.d = function1;
        this.b = xtcVar;
        this.e = i;
    }
}
