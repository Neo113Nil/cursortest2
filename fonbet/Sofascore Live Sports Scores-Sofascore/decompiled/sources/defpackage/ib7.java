package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ib7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ob7 b;

    public /* synthetic */ ib7(ob7 ob7Var, int i) {
        this.a = i;
        this.b = ob7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        int i = this.a;
        ob7 ob7Var = this.b;
        switch (i) {
            case 0:
                fdi fdiVar = ob7Var.f;
                do {
                    value = fdiVar.getValue();
                } while (!fdiVar.k(value, mb7.a((mb7) value, null, null, null, false, false, null, 47)));
            case 1:
                ob7Var.k(false);
                break;
            default:
                ob7Var.k(false);
                break;
        }
        return Unit.a;
    }
}
