package zc;

import Bl0.C2645f;
import java.util.concurrent.Callable;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class U<T> extends io.reactivex.p<T> {

    /* renamed from: a, reason: collision with root package name */
    final Callable<? extends Throwable> f108012a;

    public U(Callable<? extends Throwable> callable) {
        this.f108012a = callable;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        try {
            Throwable call = this.f108012a.call();
            C9656b.c(call, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            th = call;
        } catch (Throwable th2) {
            th = th2;
            C2645f.c(th);
        }
        rc.e.d(th, wVar);
    }
}
