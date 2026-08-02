package io.reactivex;

import Bl0.C2645f;
import nc.InterfaceC8487b;
import sc.C9653a;
import sc.C9656b;
import tc.InterfaceC9802d;

/* loaded from: classes.dex */
public abstract class y<T> implements C<T> {
    public static Bc.l e(Throwable th2) {
        C9656b.c(th2, "exception is null");
        return new Bc.l(C9653a.k(th2));
    }

    public static Bc.q f(Object obj) {
        C9656b.c(obj, "item is null");
        return new Bc.q(obj);
    }

    @Override // io.reactivex.C
    public final void c(A<? super T> a11) {
        C9656b.c(a11, "observer is null");
        try {
            i(a11);
        } catch (NullPointerException e11) {
            throw e11;
        } catch (Throwable th2) {
            C2645f.c(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final T d() {
        uc.g gVar = new uc.g();
        c(gVar);
        return (T) gVar.a();
    }

    public final Bc.t g(x xVar) {
        C9656b.c(xVar, "scheduler is null");
        return new Bc.t(this, xVar);
    }

    public final InterfaceC8487b h(qc.g<? super T> gVar, qc.g<? super Throwable> gVar2) {
        C9656b.c(gVar2, "onError is null");
        uc.j jVar = new uc.j(gVar, gVar2);
        c(jVar);
        return jVar;
    }

    protected abstract void i(A<? super T> a11);

    public final Bc.w j(x xVar) {
        C9656b.c(xVar, "scheduler is null");
        return new Bc.w(this, xVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p<T> k() {
        return this instanceof InterfaceC9802d ? ((InterfaceC9802d) this).b() : new Bc.z(this);
    }
}
