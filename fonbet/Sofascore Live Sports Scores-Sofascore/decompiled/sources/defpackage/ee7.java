package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ee7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn1 b;

    public /* synthetic */ ee7(wn1 wn1Var, int i) {
        this.a = i;
        this.b = wn1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        wn1 wn1Var = this.b;
        ae7 ae7Var = (ae7) obj;
        switch (i) {
            case 0:
                ae7Var.getClass();
                return ae7Var.a + "_" + wn1Var.a;
            default:
                ae7Var.getClass();
                return ae7Var.a + "_" + wn1Var.a;
        }
    }
}
