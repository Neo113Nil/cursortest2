package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class aq7 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1d b;

    public /* synthetic */ aq7(int i, e1d e1dVar) {
        this.a = i;
        this.b = e1dVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(qze qzeVar, rq3 rq3Var) {
        int i = this.a;
        rq3 rq3Var2 = null;
        e1d e1dVar = this.b;
        switch (i) {
            case 0:
                Object k1 = ((ooi) qzeVar).k1(new zp7(e1dVar, rq3Var2, 0), rq3Var);
                if (k1 != lu3.a) {
                    break;
                }
                break;
            case 1:
                Object s = oyn.s(qzeVar, new zp7(e1dVar, rq3Var2, 1), rq3Var);
                if (s != lu3.a) {
                    break;
                }
                break;
            default:
                Object s2 = oyn.s(qzeVar, new oqk(e1dVar, null), rq3Var);
                if (s2 != lu3.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
