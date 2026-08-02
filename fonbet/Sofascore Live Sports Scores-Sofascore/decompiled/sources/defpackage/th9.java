package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class th9 implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ vh9 b;

    public /* synthetic */ th9(vh9 vh9Var) {
        this.b = vh9Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        vh9 vh9Var = this.b;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                if (th != null) {
                    s9a.o(vh9Var.a, null);
                }
                break;
            default:
                if (th != null) {
                    vh9Var.j.B(n4o.e);
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ th9(vh9 vh9Var, aq4 aq4Var) {
        this.b = vh9Var;
    }
}
