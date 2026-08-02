package zc;

import Kc.C3493a;
import java.util.concurrent.atomic.AtomicBoolean;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class E1<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.x f107626b;

    static final class a<T> extends AtomicBoolean implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f107627a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.x f107628b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f107629c;

        /* renamed from: zc.E1$a$a, reason: collision with other inner class name */
        final class RunnableC2330a implements Runnable {
            RunnableC2330a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f107629c.dispose();
            }
        }

        a(io.reactivex.w<? super T> wVar, io.reactivex.x xVar) {
            this.f107627a = wVar;
            this.f107628b = xVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.f107628b.d(new RunnableC2330a());
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return get();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (get()) {
                return;
            }
            this.f107627a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (get()) {
                C3493a.f(th2);
            } else {
                this.f107627a.onError(th2);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (get()) {
                return;
            }
            this.f107627a.onNext(t2);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f107629c, interfaceC8487b)) {
                this.f107629c = interfaceC8487b;
                this.f107627a.onSubscribe(this);
            }
        }
    }

    public E1(io.reactivex.p pVar, io.reactivex.x xVar) {
        super(pVar);
        this.f107626b = xVar;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f107626b));
    }
}
