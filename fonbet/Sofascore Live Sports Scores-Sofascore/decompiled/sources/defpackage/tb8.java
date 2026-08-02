package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tb8 extends AtomicBoolean implements iki {
    public final ed8 a;
    public final Object b;

    public tb8(ed8 ed8Var, Object obj) {
        this.b = obj;
        this.a = ed8Var;
    }

    @Override // defpackage.iki
    public final void request(long j) {
        if (j <= 0 || !compareAndSet(false, true)) {
            return;
        }
        Object obj = this.b;
        ed8 ed8Var = this.a;
        ed8Var.onNext(obj);
        ed8Var.onComplete();
    }

    @Override // defpackage.iki
    public final void cancel() {
    }
}
