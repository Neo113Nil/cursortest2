package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class n97 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1d b;
    public final /* synthetic */ wb7 c;

    public /* synthetic */ n97(int i, wb7 wb7Var, e1d e1dVar) {
        this.a = i;
        this.b = e1dVar;
        this.c = wb7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        a99 a99Var = nf3.a;
        e1d e1dVar = this.b;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    r9 r9Var = ((pb7) e1dVar.getValue()).q;
                    if (r9Var == null) {
                        av8Var.d0(-1893622954);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-1893622953);
                        wb7 wb7Var = this.c;
                        boolean i2 = av8Var.i(wb7Var);
                        Object O = av8Var.O();
                        if (i2 || O == a99Var) {
                            av6 av6Var = new av6(0, wb7Var, wb7.class, "dismissAutoSelectError", "dismissAutoSelectError()V", 0, 14);
                            av8Var.n0(av6Var);
                            O = av6Var;
                        }
                        yqo.h(r9Var, (Function0) ((KFunction) O), null, av8Var, 0);
                        av8Var.s(false);
                    }
                } else {
                    av8Var.W();
                }
                break;
            default:
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    r9 r9Var2 = ((pb7) e1dVar.getValue()).t;
                    if (r9Var2 == null) {
                        av8Var2.d0(-1125401943);
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(-1125401942);
                        wb7 wb7Var2 = this.c;
                        boolean i3 = av8Var2.i(wb7Var2);
                        Object O2 = av8Var2.O();
                        if (i3 || O2 == a99Var) {
                            av6 av6Var2 = new av6(0, wb7Var2, wb7.class, "dismissCreateTeamError", "dismissCreateTeamError()V", 0, 16);
                            av8Var2.n0(av6Var2);
                            O2 = av6Var2;
                        }
                        yqo.h(r9Var2, (Function0) ((KFunction) O2), null, av8Var2, 0);
                        av8Var2.s(false);
                    }
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
