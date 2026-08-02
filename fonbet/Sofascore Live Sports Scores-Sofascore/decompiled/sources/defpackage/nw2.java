package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nw2 implements PointerInputEventHandler {
    public static final nw2 b = new nw2(0);
    public static final nw2 c = new nw2(1);
    public static final nw2 d = new nw2(2);
    public static final nw2 e = new nw2(3);
    public final /* synthetic */ int a;

    public /* synthetic */ nw2(int i) {
        this.a = i;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(qze qzeVar, rq3 rq3Var) {
        switch (this.a) {
            case 0:
                Object k1 = ((ooi) qzeVar).k1(new mw2(2, null, 0), rq3Var);
                if (k1 != lu3.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
