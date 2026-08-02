package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class vb8 extends AtomicLong implements iki {
    public final ed8 a;
    public final cm5 b = new cm5(3);

    public vb8(ed8 ed8Var) {
        this.a = ed8Var;
    }

    @Override // defpackage.iki
    public final void cancel() {
        r55.a(this.b);
        i();
    }

    public final void d() {
        cm5 cm5Var = this.b;
        if (cm5Var.g()) {
            return;
        }
        try {
            this.a.onComplete();
        } finally {
            r55.a(cm5Var);
        }
    }

    public final boolean e(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        cm5 cm5Var = this.b;
        if (cm5Var.g()) {
            return false;
        }
        try {
            this.a.onError(th);
            r55.a(cm5Var);
            return true;
        } catch (Throwable th2) {
            r55.a(cm5Var);
            throw th2;
        }
    }

    public final void f(Throwable th) {
        if (j(th)) {
            return;
        }
        hda.L(th);
    }

    public abstract void g(Object obj);

    public boolean j(Throwable th) {
        return e(th);
    }

    @Override // defpackage.iki
    public final void request(long j) {
        if (pki.c(j)) {
            wkn.n(this, j);
            h();
        }
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return fc6.n(getClass().getSimpleName(), "{", super.toString(), "}");
    }

    public void h() {
    }

    public void i() {
    }
}
