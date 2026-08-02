package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class v0c extends AtomicReference implements w0c, k55, Runnable {
    public final w0c a;
    public final gsg b;
    public Object c;
    public Throwable d;

    public v0c(w0c w0cVar, gsg gsgVar) {
        this.a = w0cVar;
        this.b = gsgVar;
    }

    @Override // defpackage.w0c
    public final void a(k55 k55Var) {
        if (r55.e(this, k55Var)) {
            this.a.a(this);
        }
    }

    @Override // defpackage.k55
    public final void d() {
        r55.a(this);
    }

    @Override // defpackage.w0c
    public final void onComplete() {
        r55.c(this, this.b.b(this));
    }

    @Override // defpackage.w0c
    public final void onError(Throwable th) {
        this.d = th;
        r55.c(this, this.b.b(this));
    }

    @Override // defpackage.w0c
    public final void onSuccess(Object obj) {
        this.c = obj;
        r55.c(this, this.b.b(this));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th = this.d;
        w0c w0cVar = this.a;
        if (th != null) {
            this.d = null;
            w0cVar.onError(th);
            return;
        }
        Object obj = this.c;
        if (obj == null) {
            w0cVar.onComplete();
        } else {
            this.c = null;
            w0cVar.onSuccess(obj);
        }
    }
}
