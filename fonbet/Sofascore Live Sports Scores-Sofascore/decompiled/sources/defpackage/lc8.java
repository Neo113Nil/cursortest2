package defpackage;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lc8 extends n3 {
    public final /* synthetic */ int c;
    public final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lc8(ob8 ob8Var, int i, int i2) {
        super(ob8Var);
        this.c = i2;
        this.d = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ob8
    public final void e(ed8 ed8Var) {
        int i = this.c;
        int i2 = this.d;
        ob8 ob8Var = this.b;
        switch (i) {
            case 0:
                if (!ao2.I(ob8Var, ed8Var, un0.j)) {
                    ob8Var.d(new kc8(ed8Var, i2));
                    break;
                }
                break;
            case 1:
                if (!(ob8Var instanceof Callable)) {
                    ob8Var.d(new nc8(ed8Var, i2));
                    break;
                } else {
                    try {
                        Object call = ((Callable) ob8Var).call();
                        if (call == null) {
                            xm5.a(ed8Var);
                            break;
                        } else {
                            try {
                                zb8.f(ed8Var, ((Iterable) call).iterator());
                                break;
                            } catch (Throwable th) {
                                td4.w0(th);
                                xm5.b(th, ed8Var);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        td4.w0(th2);
                        xm5.b(th2, ed8Var);
                        return;
                    }
                }
            default:
                ob8Var.d(new xc8(ed8Var, i2));
                break;
        }
    }
}
