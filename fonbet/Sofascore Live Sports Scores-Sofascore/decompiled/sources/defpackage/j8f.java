package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class j8f extends c3 implements k8f, ln2 {
    public final g62 e;

    public j8f(CoroutineContext coroutineContext, g62 g62Var) {
        super(coroutineContext, true);
        this.e = g62Var;
    }

    @Override // defpackage.l4h
    public final void b(Function1 function1) {
        this.e.b(function1);
    }

    @Override // defpackage.l4h
    public final Object d(Object obj) {
        return this.e.d(obj);
    }

    @Override // defpackage.kea, defpackage.yda
    public final void e(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new zda(A(), null, this);
        }
        y(cancellationException);
    }

    @Override // defpackage.ln2
    public final Object f(rq3 rq3Var) {
        return this.e.f(rq3Var);
    }

    @Override // defpackage.ln2
    public final Object g(hoi hoiVar) {
        g62 g62Var = this.e;
        g62Var.getClass();
        Object H = g62.H(g62Var, hoiVar);
        lu3 lu3Var = lu3.a;
        return H;
    }

    @Override // defpackage.ln2
    public final b62 iterator() {
        g62 g62Var = this.e;
        g62Var.getClass();
        return new b62(g62Var);
    }

    @Override // defpackage.c3
    public final void j0(Throwable th, boolean z) {
        if (this.e.c(th, false) || z) {
            return;
        }
        qx9.A(this.d, th);
    }

    @Override // defpackage.c3
    public final void k0(Object obj) {
        this.e.r(null);
    }

    @Override // defpackage.ln2
    public final ujg l() {
        return this.e.l();
    }

    @Override // defpackage.ln2
    public final Object o() {
        return this.e.o();
    }

    @Override // defpackage.l4h
    public final Object q(rq3 rq3Var, Object obj) {
        return this.e.q(rq3Var, obj);
    }

    @Override // defpackage.l4h
    public final boolean r(Throwable th) {
        return this.e.c(th, false);
    }

    @Override // defpackage.kea
    public final void y(CancellationException cancellationException) {
        this.e.c(cancellationException, true);
        x(cancellationException);
    }
}
