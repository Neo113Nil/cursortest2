package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bb3 extends AtomicReference implements ya3, k55 {
    public final ya3 a;
    public boolean b;

    public bb3(ya3 ya3Var, is8 is8Var) {
        this.a = ya3Var;
    }

    @Override // defpackage.ya3
    public final void a(k55 k55Var) {
        r55.c(this, k55Var);
    }

    @Override // defpackage.k55
    public final void d() {
        r55.a(this);
    }

    @Override // defpackage.ya3
    public final void onComplete() {
        this.a.onComplete();
    }

    @Override // defpackage.ya3
    public final void onError(Throwable th) {
        if (this.b) {
            this.a.onError(th);
            return;
        }
        this.b = true;
        try {
            a(em5.a);
            onComplete();
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            td4.w0(th2);
            hda.L(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }
}
