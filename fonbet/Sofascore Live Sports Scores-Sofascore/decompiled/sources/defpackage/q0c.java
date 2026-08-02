package defpackage;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q0c extends g0c implements Callable {
    public final Callable a;

    public q0c(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.g0c
    public final void c(w0c w0cVar) {
        cm5 cm5Var = new cm5(un0.k);
        w0cVar.a(cm5Var);
        if (cm5Var.g()) {
            return;
        }
        try {
            Object call = this.a.call();
            if (cm5Var.g()) {
                return;
            }
            if (call == null) {
                w0cVar.onComplete();
            } else {
                w0cVar.onSuccess(call);
            }
        } catch (Throwable th) {
            td4.w0(th);
            if (cm5Var.g()) {
                hda.L(th);
            } else {
                w0cVar.onError(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.call();
    }
}
