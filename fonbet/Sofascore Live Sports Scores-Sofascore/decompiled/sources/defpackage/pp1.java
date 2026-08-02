package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pp1 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ ykj b;

    public /* synthetic */ pp1(ykj ykjVar, int i) {
        this.a = i;
        this.b = ykjVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(qze qzeVar, rq3 rq3Var) {
        int i = this.a;
        rq3 rq3Var2 = null;
        ykj ykjVar = this.b;
        switch (i) {
            case 0:
                Object r = s9a.r(new op1(qzeVar, ykjVar, rq3Var2, 0), rq3Var);
                if (r != lu3.a) {
                    break;
                }
                break;
            default:
                Object r2 = s9a.r(new op1(qzeVar, ykjVar, rq3Var2, 1), rq3Var);
                if (r2 != lu3.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
