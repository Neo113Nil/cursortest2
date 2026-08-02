package defpackage;

import com.blaze.blazesdk.shared.results.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ukm implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4m b;

    public /* synthetic */ ukm(n4m n4mVar, int i) {
        this.a = i;
        this.b = n4mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        n4m n4mVar = this.b;
        gq5 gq5Var = (gq5) obj;
        switch (i) {
            case 0:
                int i2 = dlm.o;
                gq5Var.getClass();
                n nVar = new n();
                nVar.f = gq5Var.c;
                nVar.g = i9a.p("momentId", n4mVar.a);
                j1m.a(nVar);
                break;
            default:
                boolean z = e0n.n;
                gq5Var.getClass();
                n nVar2 = new n();
                nVar2.f = gq5Var.c;
                nVar2.g = i9a.p("videoId", n4mVar.a);
                j1m.a(nVar2);
                break;
        }
        return Unit.a;
    }
}
