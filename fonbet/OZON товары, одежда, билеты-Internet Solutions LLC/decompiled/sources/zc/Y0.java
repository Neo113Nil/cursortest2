package zc;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class Y0<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.u<?> f108097b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f108098c;

    static final class a<T> extends c<T> {

        /* renamed from: e, reason: collision with root package name */
        final AtomicInteger f108099e;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f108100f;

        a(Ic.e eVar, io.reactivex.u uVar) {
            super(eVar, uVar);
            this.f108099e = new AtomicInteger();
        }

        @Override // zc.Y0.c
        final void a() {
            this.f108100f = true;
            if (this.f108099e.getAndIncrement() == 0) {
                T andSet = getAndSet(null);
                if (andSet != null) {
                    this.f108101a.onNext(andSet);
                }
                this.f108101a.onComplete();
            }
        }

        @Override // zc.Y0.c
        final void b() {
            if (this.f108099e.getAndIncrement() == 0) {
                do {
                    boolean z11 = this.f108100f;
                    T andSet = getAndSet(null);
                    if (andSet != null) {
                        this.f108101a.onNext(andSet);
                    }
                    if (z11) {
                        this.f108101a.onComplete();
                        return;
                    }
                } while (this.f108099e.decrementAndGet() != 0);
            }
        }
    }

    static final class b<T> extends c<T> {
        @Override // zc.Y0.c
        final void a() {
            this.f108101a.onComplete();
        }

        @Override // zc.Y0.c
        final void b() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f108101a.onNext(andSet);
            }
        }
    }

    static abstract class c<T> extends AtomicReference<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final Ic.e f108101a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.u<?> f108102b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f108103c = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        InterfaceC8487b f108104d;

        c(Ic.e eVar, io.reactivex.u uVar) {
            this.f108101a = eVar;
            this.f108102b = uVar;
        }

        abstract void a();

        abstract void b();

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this.f108103c);
            this.f108104d.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108103c.get() == rc.d.DISPOSED;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            rc.d.a(this.f108103c);
            a();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            rc.d.a(this.f108103c);
            this.f108101a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            lazySet(t2);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108104d, interfaceC8487b)) {
                this.f108104d = interfaceC8487b;
                this.f108101a.onSubscribe(this);
                if (this.f108103c.get() == null) {
                    this.f108102b.subscribe(new d(this));
                }
            }
        }
    }

    static final class d<T> implements io.reactivex.w<Object> {

        /* renamed from: a, reason: collision with root package name */
        final c<T> f108105a;

        d(c<T> cVar) {
            this.f108105a = cVar;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            c<T> cVar = this.f108105a;
            cVar.f108104d.dispose();
            cVar.a();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            c<T> cVar = this.f108105a;
            cVar.f108104d.dispose();
            cVar.f108101a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(Object obj) {
            this.f108105a.b();
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this.f108105a.f108103c, interfaceC8487b);
        }
    }

    public Y0(io.reactivex.p pVar, io.reactivex.u uVar, boolean z11) {
        super(pVar);
        this.f108097b = uVar;
        this.f108098c = z11;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        Ic.e eVar = new Ic.e(wVar);
        boolean z11 = this.f108098c;
        io.reactivex.u<?> uVar = this.f108097b;
        io.reactivex.u<T> uVar2 = this.f108122a;
        if (z11) {
            uVar2.subscribe(new a(eVar, uVar));
        } else {
            uVar2.subscribe(new b(eVar, uVar));
        }
    }
}
