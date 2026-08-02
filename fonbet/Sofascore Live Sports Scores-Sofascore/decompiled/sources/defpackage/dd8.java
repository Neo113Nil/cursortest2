package defpackage;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dd8 extends ob8 {
    public final Object b;
    public final bt8 c;

    public dd8(Object obj, bt8 bt8Var) {
        this.b = obj;
        this.c = bt8Var;
    }

    @Override // defpackage.ob8
    public final void e(ed8 ed8Var) {
        try {
            Object apply = this.c.apply(this.b);
            rha.x(apply, "The mapper returned a null Publisher");
            xgf xgfVar = (xgf) apply;
            if (!(xgfVar instanceof Callable)) {
                xgfVar.a(ed8Var);
                return;
            }
            try {
                Object call = ((Callable) xgfVar).call();
                if (call == null) {
                    xm5.a(ed8Var);
                } else {
                    ed8Var.b(new irg(ed8Var, call));
                }
            } catch (Throwable th) {
                td4.w0(th);
                xm5.b(th, ed8Var);
            }
        } catch (Throwable th2) {
            xm5.b(th2, ed8Var);
        }
    }
}
