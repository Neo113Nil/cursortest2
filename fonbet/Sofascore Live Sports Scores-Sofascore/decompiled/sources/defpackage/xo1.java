package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xo1 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ lcj b;

    public /* synthetic */ xo1(lcj lcjVar, int i) {
        this.a = i;
        this.b = lcjVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(qze qzeVar, rq3 rq3Var) {
        int i = this.a;
        lcj lcjVar = this.b;
        switch (i) {
            case 0:
                lcjVar.getClass();
                Object r = s9a.r(new ccj(lcjVar, qzeVar, null, 0), rq3Var);
                lu3 lu3Var = lu3.a;
                if (r != lu3Var) {
                    r = Unit.a;
                }
                if (r != lu3Var) {
                    break;
                }
                break;
            case 1:
                lcjVar.getClass();
                Object r2 = s9a.r(new wc7(lcjVar, qzeVar, true, null), rq3Var);
                lu3 lu3Var2 = lu3.a;
                if (r2 != lu3Var2) {
                    r2 = Unit.a;
                }
                if (r2 != lu3Var2) {
                    break;
                }
                break;
            default:
                lcjVar.getClass();
                Object r3 = s9a.r(new wc7(lcjVar, qzeVar, false, null), rq3Var);
                lu3 lu3Var3 = lu3.a;
                if (r3 != lu3Var3) {
                    r3 = Unit.a;
                }
                if (r3 != lu3Var3) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
