package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class xx7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ct8 b;

    public /* synthetic */ xx7(ct8 ct8Var, int i) {
        this.a = i;
        this.b = ct8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ct8 ct8Var = this.b;
        switch (i) {
            case 0:
                ct8Var.invoke(xv7.a, null, null);
                break;
            case 1:
                ct8Var.invoke(wv7.a, null, null);
                break;
            default:
                ct8Var.invoke(hw7.a, null, null);
                break;
        }
        return Unit.a;
    }
}
