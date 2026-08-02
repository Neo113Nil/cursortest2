package zc;

import java.util.concurrent.TimeUnit;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class y1<T> extends AbstractC11019a<T, Mc.b<T>> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.x f108760b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f108761c;

    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super Mc.b<T>> f108762a;

        /* renamed from: b, reason: collision with root package name */
        final TimeUnit f108763b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.x f108764c;

        /* renamed from: d, reason: collision with root package name */
        long f108765d;

        /* renamed from: e, reason: collision with root package name */
        InterfaceC8487b f108766e;

        a(io.reactivex.w<? super Mc.b<T>> wVar, TimeUnit timeUnit, io.reactivex.x xVar) {
            this.f108762a = wVar;
            this.f108764c = xVar;
            this.f108763b = timeUnit;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108766e.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108766e.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108762a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108762a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f108764c.getClass();
            TimeUnit timeUnit = this.f108763b;
            long c11 = io.reactivex.x.c(timeUnit);
            long j11 = this.f108765d;
            this.f108765d = c11;
            this.f108762a.onNext(new Mc.b(t2, c11 - j11, timeUnit));
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108766e, interfaceC8487b)) {
                this.f108766e = interfaceC8487b;
                this.f108764c.getClass();
                this.f108765d = io.reactivex.x.c(this.f108763b);
                this.f108762a.onSubscribe(this);
            }
        }
    }

    public y1(io.reactivex.p pVar, TimeUnit timeUnit, io.reactivex.x xVar) {
        super(pVar);
        this.f108760b = xVar;
        this.f108761c = timeUnit;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super Mc.b<T>> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f108761c, this.f108760b));
    }
}
