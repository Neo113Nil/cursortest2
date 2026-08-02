package zc;

import Bl0.C2645f;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import sc.C9656b;

/* renamed from: zc.e0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11032e0<T> extends io.reactivex.p<T> {

    /* renamed from: a, reason: collision with root package name */
    final Future<? extends T> f108221a;

    /* renamed from: b, reason: collision with root package name */
    final long f108222b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f108223c;

    public C11032e0(Future<? extends T> future, long j11, TimeUnit timeUnit) {
        this.f108221a = future;
        this.f108222b = j11;
        this.f108223c = timeUnit;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        uc.k kVar = new uc.k(wVar);
        wVar.onSubscribe(kVar);
        if (kVar.isDisposed()) {
            return;
        }
        try {
            TimeUnit timeUnit = this.f108223c;
            Future<? extends T> future = this.f108221a;
            T t2 = timeUnit != null ? future.get(this.f108222b, timeUnit) : future.get();
            C9656b.c(t2, "Future returned null");
            kVar.b(t2);
        } catch (Throwable th2) {
            C2645f.c(th2);
            if (kVar.isDisposed()) {
                return;
            }
            wVar.onError(th2);
        }
    }
}
