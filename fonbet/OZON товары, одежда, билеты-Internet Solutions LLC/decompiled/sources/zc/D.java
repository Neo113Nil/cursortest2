package zc;

import Kc.C3493a;
import io.reactivex.x;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class D<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f107583b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f107584c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.x f107585d;

    /* loaded from: classes9.dex */
    static final class a<T> extends AtomicReference<InterfaceC8487b> implements Runnable, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final T f107586a;

        /* renamed from: b, reason: collision with root package name */
        final long f107587b;

        /* renamed from: c, reason: collision with root package name */
        final b<T> f107588c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicBoolean f107589d = new AtomicBoolean();

        a(T t2, long j11, b<T> bVar) {
            this.f107586a = t2;
            this.f107587b = j11;
            this.f107588c = bVar;
        }

        public final void a(InterfaceC8487b interfaceC8487b) {
            rc.d.d(this, interfaceC8487b);
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return get() == rc.d.DISPOSED;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f107589d.compareAndSet(false, true)) {
                b<T> bVar = this.f107588c;
                long j11 = this.f107587b;
                T t2 = this.f107586a;
                if (j11 == bVar.f107596g) {
                    bVar.f107590a.onNext(t2);
                    rc.d.a(this);
                }
            }
        }
    }

    static final class b<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final Ic.e f107590a;

        /* renamed from: b, reason: collision with root package name */
        final long f107591b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f107592c;

        /* renamed from: d, reason: collision with root package name */
        final x.c f107593d;

        /* renamed from: e, reason: collision with root package name */
        InterfaceC8487b f107594e;

        /* renamed from: f, reason: collision with root package name */
        InterfaceC8487b f107595f;

        /* renamed from: g, reason: collision with root package name */
        volatile long f107596g;

        /* renamed from: h, reason: collision with root package name */
        boolean f107597h;

        b(Ic.e eVar, long j11, TimeUnit timeUnit, x.c cVar) {
            this.f107590a = eVar;
            this.f107591b = j11;
            this.f107592c = timeUnit;
            this.f107593d = cVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f107594e.dispose();
            this.f107593d.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107593d.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f107597h) {
                return;
            }
            this.f107597h = true;
            InterfaceC8487b interfaceC8487b = this.f107595f;
            if (interfaceC8487b != null) {
                ((a) interfaceC8487b).dispose();
            }
            a aVar = (a) interfaceC8487b;
            if (aVar != null) {
                aVar.run();
            }
            this.f107590a.onComplete();
            this.f107593d.dispose();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f107597h) {
                C3493a.f(th2);
                return;
            }
            InterfaceC8487b interfaceC8487b = this.f107595f;
            if (interfaceC8487b != null) {
                ((a) interfaceC8487b).dispose();
            }
            this.f107597h = true;
            this.f107590a.onError(th2);
            this.f107593d.dispose();
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f107597h) {
                return;
            }
            long j11 = this.f107596g + 1;
            this.f107596g = j11;
            InterfaceC8487b interfaceC8487b = this.f107595f;
            if (interfaceC8487b != null) {
                ((a) interfaceC8487b).dispose();
            }
            a aVar = new a(t2, j11, this);
            this.f107595f = aVar;
            aVar.a(this.f107593d.b(aVar, this.f107591b, this.f107592c));
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f107594e, interfaceC8487b)) {
                this.f107594e = interfaceC8487b;
                this.f107590a.onSubscribe(this);
            }
        }
    }

    public D(io.reactivex.p pVar, long j11, TimeUnit timeUnit, io.reactivex.x xVar) {
        super(pVar);
        this.f107583b = j11;
        this.f107584c = timeUnit;
        this.f107585d = xVar;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new b(new Ic.e(wVar), this.f107583b, this.f107584c, this.f107585d.b()));
    }
}
