package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class p94 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b94 b;

    public /* synthetic */ p94(b94 b94Var, int i) {
        this.a = i;
        this.b = b94Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int size;
        int i = this.a;
        b94 b94Var = this.b;
        switch (i) {
            case 0:
                size = b94Var.o.size();
                break;
            default:
                size = b94Var.o.size();
                break;
        }
        return Integer.valueOf(size);
    }
}
