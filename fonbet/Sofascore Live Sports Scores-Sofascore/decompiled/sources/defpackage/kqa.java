package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class kqa implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n29 b;
    public final /* synthetic */ lqa c;

    public /* synthetic */ kqa(n29 n29Var, lqa lqaVar, int i) {
        this.a = i;
        this.b = n29Var;
        this.c = lqaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        lqa lqaVar = this.c;
        n29 n29Var = this.b;
        q50 q50Var = (q50) obj;
        switch (i) {
            case 0:
                n29Var.g(((Number) q50Var.d()).floatValue());
                lqaVar.c.invoke();
                break;
            default:
                n29Var.g(((Number) q50Var.d()).floatValue());
                lqaVar.c.invoke();
                break;
        }
        return Unit.a;
    }
}
