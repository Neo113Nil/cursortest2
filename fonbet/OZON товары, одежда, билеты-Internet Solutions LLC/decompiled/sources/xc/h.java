package xc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.concurrent.Callable;
import nc.C8488c;
import nc.InterfaceC8487b;
import sc.C9653a;

/* loaded from: classes.dex */
public final class h<T> extends io.reactivex.k<T> implements Callable<T> {

    /* renamed from: a, reason: collision with root package name */
    final Callable<? extends T> f105287a;

    public h(Callable<? extends T> callable) {
        this.f105287a = callable;
    }

    @Override // java.util.concurrent.Callable
    public final T call() throws Exception {
        return this.f105287a.call();
    }

    @Override // io.reactivex.k
    protected final void d(io.reactivex.m<? super T> mVar) {
        InterfaceC8487b a11 = C8488c.a(C9653a.f98522b);
        mVar.onSubscribe(a11);
        if (a11.isDisposed()) {
            return;
        }
        try {
            T call = this.f105287a.call();
            if (a11.isDisposed()) {
                return;
            }
            if (call == null) {
                mVar.onComplete();
            } else {
                mVar.onSuccess(call);
            }
        } catch (Throwable th2) {
            C2645f.c(th2);
            if (a11.isDisposed()) {
                C3493a.f(th2);
            } else {
                mVar.onError(th2);
            }
        }
    }
}
