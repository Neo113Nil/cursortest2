package zc;

import java.util.concurrent.atomic.AtomicInteger;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class Q0<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f107946b;

    static final class a<T> extends AtomicInteger implements io.reactivex.w<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f107947a;

        /* renamed from: b, reason: collision with root package name */
        final rc.h f107948b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.u<? extends T> f107949c;

        /* renamed from: d, reason: collision with root package name */
        long f107950d;

        a(io.reactivex.w<? super T> wVar, long j11, rc.h hVar, io.reactivex.u<? extends T> uVar) {
            this.f107947a = wVar;
            this.f107948b = hVar;
            this.f107949c = uVar;
            this.f107950d = j11;
        }

        final void a() {
            if (getAndIncrement() == 0) {
                int i11 = 1;
                while (!this.f107948b.isDisposed()) {
                    this.f107949c.subscribe(this);
                    i11 = addAndGet(-i11);
                    if (i11 == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            long j11 = this.f107950d;
            if (j11 != Long.MAX_VALUE) {
                this.f107950d = j11 - 1;
            }
            if (j11 != 0) {
                a();
            } else {
                this.f107947a.onComplete();
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f107947a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f107947a.onNext(t2);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.h hVar = this.f107948b;
            hVar.getClass();
            rc.d.d(hVar, interfaceC8487b);
        }
    }

    public Q0(io.reactivex.p<T> pVar, long j11) {
        super(pVar);
        this.f107946b = j11;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        rc.h hVar = new rc.h();
        wVar.onSubscribe(hVar);
        long j11 = this.f107946b;
        new a(wVar, j11 != Long.MAX_VALUE ? j11 - 1 : Long.MAX_VALUE, hVar, this.f108122a).a();
    }
}
