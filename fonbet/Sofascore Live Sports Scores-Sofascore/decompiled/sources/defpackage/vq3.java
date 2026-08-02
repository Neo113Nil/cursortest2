package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class vq3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tr3 b;

    public /* synthetic */ vq3(tr3 tr3Var, int i) {
        this.a = i;
        this.b = tr3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        int i = this.a;
        tr3 tr3Var = this.b;
        switch (i) {
            case 0:
                tr3Var.v();
                break;
            default:
                fdi fdiVar = tr3Var.p;
                do {
                    value = fdiVar.getValue();
                    ((Boolean) value).getClass();
                } while (!fdiVar.k(value, Boolean.FALSE));
        }
        return Unit.a;
    }
}
