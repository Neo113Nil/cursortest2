package zc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.concurrent.Callable;
import sc.C9656b;

/* renamed from: zc.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC11029d0<T> extends io.reactivex.p<T> implements Callable<T> {

    /* renamed from: a, reason: collision with root package name */
    final Callable<? extends T> f108192a;

    public CallableC11029d0(Callable<? extends T> callable) {
        this.f108192a = callable;
    }

    @Override // java.util.concurrent.Callable
    public final T call() throws Exception {
        T call = this.f108192a.call();
        C9656b.c(call, "The callable returned a null value");
        return call;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        uc.k kVar = new uc.k(wVar);
        wVar.onSubscribe(kVar);
        if (kVar.isDisposed()) {
            return;
        }
        try {
            T call = this.f108192a.call();
            C9656b.c(call, "Callable returned null");
            kVar.b(call);
        } catch (Throwable th2) {
            C2645f.c(th2);
            if (kVar.isDisposed()) {
                C3493a.f(th2);
            } else {
                wVar.onError(th2);
            }
        }
    }
}
