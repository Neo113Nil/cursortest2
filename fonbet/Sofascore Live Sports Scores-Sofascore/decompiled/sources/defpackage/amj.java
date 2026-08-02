package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class amj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v23 b;
    public final /* synthetic */ ylj c;
    public final /* synthetic */ int d;

    public /* synthetic */ amj(v23 v23Var, ylj yljVar, int i, int i2) {
        this.a = i2;
        this.b = v23Var;
        this.c = yljVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        ylj yljVar = this.c;
        v23 v23Var = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                n4o.j(v23Var, yljVar, of3Var, aba.K(i2 | 1));
                break;
            case 1:
                n4o.s(v23Var, yljVar, of3Var, aba.K(i2 | 1));
                break;
            case 2:
                n4o.o(v23Var, yljVar, of3Var, aba.K(i2 | 1));
                break;
            default:
                n4o.p(v23Var, yljVar, of3Var, aba.K(i2 | 1));
                break;
        }
        return Unit.a;
    }
}
