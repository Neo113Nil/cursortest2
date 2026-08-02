package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class wb6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cy5 b;

    public /* synthetic */ wb6(cy5 cy5Var, int i) {
        this.a = i;
        this.b = cy5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float f;
        int i = this.a;
        cy5 cy5Var = this.b;
        switch (i) {
            case 0:
                f = cy5Var.e;
                break;
            default:
                f = cy5Var.d;
                break;
        }
        return Float.valueOf(f);
    }
}
