package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class yp9 implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ux7 b;
    public final /* synthetic */ w31 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ fy7 e;

    public /* synthetic */ yp9(ux7 ux7Var, w31 w31Var, Function1 function1, fy7 fy7Var) {
        this.b = ux7Var;
        this.c = w31Var;
        this.d = function1;
        this.e = fy7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        fy7 fy7Var = this.e;
        Function1 function1 = this.d;
        w31 w31Var = this.c;
        ux7 ux7Var = this.b;
        switch (i) {
            case 0:
                if (ux7Var != null) {
                    int i2 = ux7Var.a;
                    Integer valueOf = Integer.valueOf(fy7Var.a);
                    bx7 h = w31Var.h();
                    function1.invoke(new gw7(valueOf, i2, 24, h != null ? Integer.valueOf(h.a) : null));
                } else {
                    bx7 h2 = w31Var.h();
                    if (h2 != null) {
                        function1.invoke(new aw7(h2.a, 30));
                    }
                }
                break;
            default:
                if (ux7Var != null && w31Var.h() != null) {
                    int i3 = ux7Var.a;
                    Integer valueOf2 = Integer.valueOf(fy7Var.a);
                    bx7 h3 = w31Var.h();
                    h3.getClass();
                    function1.invoke(new gw7(valueOf2, i3, 8, Integer.valueOf(h3.a)));
                } else if (w31Var.h() != null) {
                    bx7 h4 = w31Var.h();
                    h4.getClass();
                    function1.invoke(new aw7(h4.a, 26));
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ yp9(ux7 ux7Var, Function1 function1, fy7 fy7Var, w31 w31Var) {
        this.b = ux7Var;
        this.d = function1;
        this.e = fy7Var;
        this.c = w31Var;
    }
}
