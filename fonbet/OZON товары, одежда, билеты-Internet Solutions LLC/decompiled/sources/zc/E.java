package zc;

import Bl0.C2645f;
import java.util.concurrent.Callable;
import sc.C9656b;

/* loaded from: classes.dex */
public final class E<T> extends io.reactivex.p<T> {

    /* renamed from: a, reason: collision with root package name */
    final Callable<? extends io.reactivex.u<? extends T>> f107617a;

    public E(Callable<? extends io.reactivex.u<? extends T>> callable) {
        this.f107617a = callable;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        try {
            io.reactivex.u<? extends T> call = this.f107617a.call();
            C9656b.c(call, "null ObservableSource supplied");
            call.subscribe(wVar);
        } catch (Throwable th2) {
            C2645f.c(th2);
            rc.e.d(th2, wVar);
        }
    }
}
