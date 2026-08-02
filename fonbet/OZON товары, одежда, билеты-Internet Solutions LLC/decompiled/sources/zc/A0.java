package zc;

import Kc.C3493a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class A0<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.n<? extends T> f107516b;

    static final class a<T> extends AtomicInteger implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f107517a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f107518b = new AtomicReference<>();

        /* renamed from: c, reason: collision with root package name */
        final C2327a<T> f107519c = new C2327a<>(this);

        /* renamed from: d, reason: collision with root package name */
        final Gc.c f107520d = new Gc.c();

        /* renamed from: e, reason: collision with root package name */
        volatile Cc.c f107521e;

        /* renamed from: f, reason: collision with root package name */
        T f107522f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f107523g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f107524h;

        /* renamed from: i, reason: collision with root package name */
        volatile int f107525i;

        /* renamed from: zc.A0$a$a, reason: collision with other inner class name */
        static final class C2327a<T> extends AtomicReference<InterfaceC8487b> implements io.reactivex.m<T> {

            /* renamed from: a, reason: collision with root package name */
            final a<T> f107526a;

            C2327a(a<T> aVar) {
                this.f107526a = aVar;
            }

            @Override // io.reactivex.m
            public final void onComplete() {
                a<T> aVar = this.f107526a;
                aVar.f107525i = 2;
                if (aVar.getAndIncrement() == 0) {
                    aVar.a();
                }
            }

            @Override // io.reactivex.m
            public final void onError(Throwable th2) {
                a<T> aVar = this.f107526a;
                Gc.c cVar = aVar.f107520d;
                cVar.getClass();
                if (!Gc.i.a(cVar, th2)) {
                    C3493a.f(th2);
                    return;
                }
                rc.d.a(aVar.f107518b);
                if (aVar.getAndIncrement() == 0) {
                    aVar.a();
                }
            }

            @Override // io.reactivex.m, io.reactivex.A
            public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
                rc.d.f(this, interfaceC8487b);
            }

            @Override // io.reactivex.m, io.reactivex.A
            public final void onSuccess(T t2) {
                a<T> aVar = this.f107526a;
                if (aVar.compareAndSet(0, 1)) {
                    aVar.f107517a.onNext(t2);
                    aVar.f107525i = 2;
                } else {
                    aVar.f107522f = t2;
                    aVar.f107525i = 1;
                    if (aVar.getAndIncrement() != 0) {
                        return;
                    }
                }
                aVar.a();
            }
        }

        a(io.reactivex.w<? super T> wVar) {
            this.f107517a = wVar;
        }

        final void a() {
            io.reactivex.w<? super T> wVar = this.f107517a;
            int i11 = 1;
            while (!this.f107523g) {
                if (this.f107520d.get() != null) {
                    this.f107522f = null;
                    this.f107521e = null;
                    Gc.c cVar = this.f107520d;
                    cVar.getClass();
                    wVar.onError(Gc.i.b(cVar));
                    return;
                }
                int i12 = this.f107525i;
                if (i12 == 1) {
                    T t2 = this.f107522f;
                    this.f107522f = null;
                    this.f107525i = 2;
                    wVar.onNext(t2);
                    i12 = 2;
                }
                boolean z11 = this.f107524h;
                Cc.c cVar2 = this.f107521e;
                A00.a aVar = cVar2 != null ? (Object) cVar2.poll() : null;
                boolean z12 = aVar == null;
                if (z11 && z12 && i12 == 2) {
                    this.f107521e = null;
                    wVar.onComplete();
                    return;
                } else if (z12) {
                    i11 = addAndGet(-i11);
                    if (i11 == 0) {
                        return;
                    }
                } else {
                    wVar.onNext(aVar);
                }
            }
            this.f107522f = null;
            this.f107521e = null;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f107523g = true;
            rc.d.a(this.f107518b);
            rc.d.a(this.f107519c);
            if (getAndIncrement() == 0) {
                this.f107521e = null;
                this.f107522f = null;
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(this.f107518b.get());
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f107524h = true;
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            Gc.c cVar = this.f107520d;
            cVar.getClass();
            if (!Gc.i.a(cVar, th2)) {
                C3493a.f(th2);
                return;
            }
            rc.d.a(this.f107518b);
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (compareAndSet(0, 1)) {
                this.f107517a.onNext(t2);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                Cc.c cVar = this.f107521e;
                if (cVar == null) {
                    cVar = new Cc.c(io.reactivex.p.bufferSize());
                    this.f107521e = cVar;
                }
                cVar.offer(t2);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            a();
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this.f107518b, interfaceC8487b);
        }
    }

    public A0(io.reactivex.p<T> pVar, io.reactivex.n<? extends T> nVar) {
        super(pVar);
        this.f107516b = nVar;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        a aVar = new a(wVar);
        wVar.onSubscribe(aVar);
        this.f108122a.subscribe(aVar);
        this.f107516b.a(aVar.f107519c);
    }
}
