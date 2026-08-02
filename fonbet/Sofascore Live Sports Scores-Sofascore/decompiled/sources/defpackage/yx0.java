package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class yx0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e7d b;

    public /* synthetic */ yx0(e7d e7dVar, int i) {
        this.a = i;
        this.b = e7dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        e7d e7dVar = this.b;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    e7dVar.a(0, av8Var);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    e7dVar.a(0, av8Var2);
                } else {
                    av8Var2.W();
                }
                break;
            default:
                av8 av8Var3 = (av8) of3Var;
                if (av8Var3.T(intValue & 1, (intValue & 3) != 2)) {
                    e7dVar.a(0, av8Var3);
                } else {
                    av8Var3.W();
                }
                break;
        }
        return Unit.a;
    }
}
