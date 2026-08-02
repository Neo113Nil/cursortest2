package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class wo6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gk7 b;

    public /* synthetic */ wo6(gk7 gk7Var, int i) {
        this.a = i;
        this.b = gk7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        gk7 gk7Var = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                fdi fdiVar = gk7Var.n;
                fdiVar.getClass();
                fdiVar.m(null, str);
                break;
            case 1:
                gk7Var.o.l((ho1) obj);
                break;
            case 2:
                gk7Var.p.l((Float) obj);
                break;
            case 3:
                rz6 rz6Var = (rz6) obj;
                gk7Var.q.l(rz6Var != null ? rz6Var.b : null);
                break;
            case 4:
                gk7Var.o.l((ho1) obj);
                break;
            case 5:
                gk7Var.p.l((Float) obj);
                break;
            case 6:
                rz6 rz6Var2 = (rz6) obj;
                gk7Var.q.l(rz6Var2 != null ? rz6Var2.b : null);
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                fdi fdiVar2 = gk7Var.n;
                fdiVar2.getClass();
                fdiVar2.m(null, str2);
                break;
        }
        return Unit.a;
    }
}
