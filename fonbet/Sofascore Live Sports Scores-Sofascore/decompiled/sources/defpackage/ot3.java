package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ot3 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ot3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(qze qzeVar, rq3 rq3Var) {
        int i = this.a;
        rq3 rq3Var2 = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Object r = s9a.r(new t53(qzeVar, (b9j) obj2, (tbj) obj, (rq3) null, 1), rq3Var);
                if (r != lu3.a) {
                    break;
                }
                break;
            case 1:
                Object s = oyn.s(qzeVar, new kj6((String) obj2, (b93) obj, rq3Var2, 0), rq3Var);
                if (s != lu3.a) {
                    break;
                }
                break;
            default:
                Object d = rti.d(qzeVar, null, new xz4((Function1) obj2, (e1d) obj, 4), rq3Var, 7);
                if (d != lu3.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
