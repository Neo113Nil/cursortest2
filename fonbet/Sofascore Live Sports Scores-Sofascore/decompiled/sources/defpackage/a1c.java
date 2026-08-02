package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class a1c extends AtomicReference implements w0c {
    public final z0c a;
    public final int b;

    public a1c(z0c z0cVar, int i) {
        this.a = z0cVar;
        this.b = i;
    }

    @Override // defpackage.w0c
    public final void a(k55 k55Var) {
        r55.e(this, k55Var);
    }

    @Override // defpackage.w0c
    public final void onComplete() {
        z0c z0cVar = this.a;
        if (z0cVar.getAndSet(0) > 0) {
            z0cVar.a(this.b);
            z0cVar.a.onComplete();
        }
    }

    @Override // defpackage.w0c
    public final void onError(Throwable th) {
        z0c z0cVar = this.a;
        if (z0cVar.getAndSet(0) <= 0) {
            hda.L(th);
        } else {
            z0cVar.a(this.b);
            z0cVar.a.onError(th);
        }
    }

    @Override // defpackage.w0c
    public final void onSuccess(Object obj) {
        z0c z0cVar = this.a;
        w0c w0cVar = z0cVar.a;
        Object[] objArr = z0cVar.d;
        objArr[this.b] = obj;
        if (z0cVar.decrementAndGet() == 0) {
            try {
                w0cVar.onSuccess(z0cVar.b.apply(objArr));
            } catch (Throwable th) {
                td4.w0(th);
                w0cVar.onError(th);
            }
        }
    }
}
