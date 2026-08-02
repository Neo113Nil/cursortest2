package zc;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class X0<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f108075b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f108076c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.x f108077d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f108078e;

    static final class a<T> extends c<T> {

        /* renamed from: g, reason: collision with root package name */
        final AtomicInteger f108079g;

        a(Ic.e eVar, long j11, TimeUnit timeUnit, io.reactivex.x xVar) {
            super(eVar, j11, timeUnit, xVar);
            this.f108079g = new AtomicInteger(1);
        }

        @Override // zc.X0.c
        final void a() {
            T andSet = getAndSet(null);
            Ic.e eVar = this.f108080a;
            if (andSet != null) {
                eVar.onNext(andSet);
            }
            if (this.f108079g.decrementAndGet() == 0) {
                eVar.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            AtomicInteger atomicInteger = this.f108079g;
            if (atomicInteger.incrementAndGet() == 2) {
                T andSet = getAndSet(null);
                Ic.e eVar = this.f108080a;
                if (andSet != null) {
                    eVar.onNext(andSet);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    eVar.onComplete();
                }
            }
        }
    }

    static final class b<T> extends c<T> {
        @Override // zc.X0.c
        final void a() {
            this.f108080a.onComplete();
        }

        @Override // java.lang.Runnable
        public final void run() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f108080a.onNext(andSet);
            }
        }
    }

    static abstract class c<T> extends AtomicReference<T> implements io.reactivex.w<T>, InterfaceC8487b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Ic.e f108080a;

        /* renamed from: b, reason: collision with root package name */
        final long f108081b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f108082c;

        /* renamed from: d, reason: collision with root package name */
        final io.reactivex.x f108083d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f108084e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        InterfaceC8487b f108085f;

        c(Ic.e eVar, long j11, TimeUnit timeUnit, io.reactivex.x xVar) {
            this.f108080a = eVar;
            this.f108081b = j11;
            this.f108082c = timeUnit;
            this.f108083d = xVar;
        }

        abstract void a();

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this.f108084e);
            this.f108085f.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108085f.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            rc.d.a(this.f108084e);
            a();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            rc.d.a(this.f108084e);
            this.f108080a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            lazySet(t2);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108085f, interfaceC8487b)) {
                this.f108085f = interfaceC8487b;
                this.f108080a.onSubscribe(this);
                TimeUnit timeUnit = this.f108082c;
                io.reactivex.x xVar = this.f108083d;
                long j11 = this.f108081b;
                rc.d.d(this.f108084e, xVar.f(this, j11, j11, timeUnit));
            }
        }
    }

    public X0(io.reactivex.p pVar, long j11, TimeUnit timeUnit, io.reactivex.x xVar, boolean z11) {
        super(pVar);
        this.f108075b = j11;
        this.f108076c = timeUnit;
        this.f108077d = xVar;
        this.f108078e = z11;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        Ic.e eVar = new Ic.e(wVar);
        boolean z11 = this.f108078e;
        io.reactivex.u<T> uVar = this.f108122a;
        if (z11) {
            uVar.subscribe(new a(eVar, this.f108075b, this.f108076c, this.f108077d));
        } else {
            uVar.subscribe(new b(eVar, this.f108075b, this.f108076c, this.f108077d));
        }
    }
}
