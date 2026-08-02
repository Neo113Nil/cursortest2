package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class da5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yma b;

    public /* synthetic */ da5(yma ymaVar, int i) {
        this.a = i;
        this.b = ymaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        yma ymaVar = this.b;
        ha5 ha5Var = (ha5) obj;
        switch (i) {
            case 0:
                ha5Var.getClass();
                ymaVar.a();
                break;
            case 1:
                ha5Var.getClass();
                ymaVar.a();
                break;
            case 2:
                ymaVar.a();
                break;
            default:
                ha5Var.getClass();
                ymaVar.a();
                break;
        }
        return Unit.a;
    }
}
