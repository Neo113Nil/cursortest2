package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class v80 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y80 b;

    public /* synthetic */ v80(y80 y80Var, int i) {
        this.a = i;
        this.b = y80Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int size;
        int i = this.a;
        y80 y80Var = this.b;
        switch (i) {
            case 0:
                size = y80Var.q.size();
                break;
            default:
                size = y80Var.q.size();
                break;
        }
        return Integer.valueOf(size);
    }
}
