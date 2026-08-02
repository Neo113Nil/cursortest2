package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class evg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ivg b;

    public /* synthetic */ evg(ivg ivgVar, int i) {
        this.a = i;
        this.b = ivgVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ivg ivgVar = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(ivgVar.n);
            default:
                ne8 ne8Var = ivgVar.P;
                if (!ne8Var.a.n) {
                    return null;
                }
                ie8 p1 = ne8Var.p1();
                if (!p1.d()) {
                    return null;
                }
                if (p1.g()) {
                    return ne8Var.n1(null);
                }
                ne8 g = ((yd8) ((xy) c6o.d0(ne8Var)).getFocusOwner()).g();
                if (g != null) {
                    return g.n1(c6o.b0(ne8Var));
                }
                return null;
        }
    }
}
