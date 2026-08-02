package zc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import sc.C9656b;
import zc.A1;

/* loaded from: classes9.dex */
public final class z1<T, U, V> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.u<U> f108778b;

    /* renamed from: c, reason: collision with root package name */
    final qc.o<? super T, ? extends io.reactivex.u<V>> f108779c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.u<? extends T> f108780d;

    static final class a extends AtomicReference<InterfaceC8487b> implements io.reactivex.w<Object>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final Object f108781a;

        /* renamed from: b, reason: collision with root package name */
        final long f108782b;

        a(long j11, d dVar) {
            this.f108782b = j11;
            this.f108781a = dVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(get());
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zc.A1$d] */
        @Override // io.reactivex.w
        public final void onComplete() {
            Object obj = get();
            rc.d dVar = rc.d.DISPOSED;
            if (obj != dVar) {
                lazySet(dVar);
                this.f108781a.a(this.f108782b);
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zc.z1$d] */
        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            Object obj = get();
            rc.d dVar = rc.d.DISPOSED;
            if (obj == dVar) {
                C3493a.f(th2);
            } else {
                lazySet(dVar);
                this.f108781a.b(this.f108782b, th2);
            }
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, zc.A1$d] */
        @Override // io.reactivex.w
        public final void onNext(Object obj) {
            InterfaceC8487b interfaceC8487b = (InterfaceC8487b) get();
            rc.d dVar = rc.d.DISPOSED;
            if (interfaceC8487b != dVar) {
                interfaceC8487b.dispose();
                lazySet(dVar);
                this.f108781a.a(this.f108782b);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this, interfaceC8487b);
        }
    }

    static final class b<T> extends AtomicReference<InterfaceC8487b> implements io.reactivex.w<T>, InterfaceC8487b, d {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108783a;

        /* renamed from: b, reason: collision with root package name */
        final qc.o<? super T, ? extends io.reactivex.u<?>> f108784b;

        /* renamed from: c, reason: collision with root package name */
        final rc.h f108785c = new rc.h();

        /* renamed from: d, reason: collision with root package name */
        final AtomicLong f108786d = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f108787e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        io.reactivex.u<? extends T> f108788f;

        b(io.reactivex.u uVar, io.reactivex.w wVar, qc.o oVar) {
            this.f108783a = wVar;
            this.f108784b = oVar;
            this.f108788f = uVar;
        }

        @Override // zc.A1.d
        public final void a(long j11) {
            if (this.f108786d.compareAndSet(j11, Long.MAX_VALUE)) {
                rc.d.a(this.f108787e);
                io.reactivex.u<? extends T> uVar = this.f108788f;
                this.f108788f = null;
                uVar.subscribe(new A1.a(this.f108783a, this));
            }
        }

        @Override // zc.z1.d
        public final void b(long j11, Throwable th2) {
            if (!this.f108786d.compareAndSet(j11, Long.MAX_VALUE)) {
                C3493a.f(th2);
            } else {
                rc.d.a(this);
                this.f108783a.onError(th2);
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this.f108787e);
            rc.d.a(this);
            rc.h hVar = this.f108785c;
            hVar.getClass();
            rc.d.a(hVar);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(get());
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f108786d.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                rc.h hVar = this.f108785c;
                hVar.getClass();
                rc.d.a(hVar);
                this.f108783a.onComplete();
                hVar.getClass();
                rc.d.a(hVar);
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f108786d.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                C3493a.f(th2);
                return;
            }
            rc.h hVar = this.f108785c;
            hVar.getClass();
            rc.d.a(hVar);
            this.f108783a.onError(th2);
            hVar.getClass();
            rc.d.a(hVar);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            AtomicLong atomicLong = this.f108786d;
            long j11 = atomicLong.get();
            if (j11 != Long.MAX_VALUE) {
                long j12 = 1 + j11;
                if (atomicLong.compareAndSet(j11, j12)) {
                    rc.h hVar = this.f108785c;
                    InterfaceC8487b interfaceC8487b = hVar.get();
                    if (interfaceC8487b != null) {
                        interfaceC8487b.dispose();
                    }
                    io.reactivex.w<? super T> wVar = this.f108783a;
                    wVar.onNext(t2);
                    try {
                        io.reactivex.u<?> apply = this.f108784b.apply(t2);
                        C9656b.c(apply, "The itemTimeoutIndicator returned a null ObservableSource.");
                        io.reactivex.u<?> uVar = apply;
                        a aVar = new a(j12, this);
                        if (rc.d.d(hVar, aVar)) {
                            uVar.subscribe(aVar);
                        }
                    } catch (Throwable th2) {
                        C2645f.c(th2);
                        this.f108787e.get().dispose();
                        atomicLong.getAndSet(Long.MAX_VALUE);
                        wVar.onError(th2);
                    }
                }
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this.f108787e, interfaceC8487b);
        }
    }

    static final class c<T> extends AtomicLong implements io.reactivex.w<T>, InterfaceC8487b, d {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108789a;

        /* renamed from: b, reason: collision with root package name */
        final qc.o<? super T, ? extends io.reactivex.u<?>> f108790b;

        /* renamed from: c, reason: collision with root package name */
        final rc.h f108791c = new rc.h();

        /* renamed from: d, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f108792d = new AtomicReference<>();

        c(io.reactivex.w<? super T> wVar, qc.o<? super T, ? extends io.reactivex.u<?>> oVar) {
            this.f108789a = wVar;
            this.f108790b = oVar;
        }

        @Override // zc.A1.d
        public final void a(long j11) {
            if (compareAndSet(j11, Long.MAX_VALUE)) {
                rc.d.a(this.f108792d);
                this.f108789a.onError(new TimeoutException());
            }
        }

        @Override // zc.z1.d
        public final void b(long j11, Throwable th2) {
            if (!compareAndSet(j11, Long.MAX_VALUE)) {
                C3493a.f(th2);
            } else {
                rc.d.a(this.f108792d);
                this.f108789a.onError(th2);
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this.f108792d);
            rc.h hVar = this.f108791c;
            hVar.getClass();
            rc.d.a(hVar);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(this.f108792d.get());
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                rc.h hVar = this.f108791c;
                hVar.getClass();
                rc.d.a(hVar);
                this.f108789a.onComplete();
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                C3493a.f(th2);
                return;
            }
            rc.h hVar = this.f108791c;
            hVar.getClass();
            rc.d.a(hVar);
            this.f108789a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            long j11 = get();
            if (j11 != Long.MAX_VALUE) {
                long j12 = 1 + j11;
                if (compareAndSet(j11, j12)) {
                    rc.h hVar = this.f108791c;
                    InterfaceC8487b interfaceC8487b = hVar.get();
                    if (interfaceC8487b != null) {
                        interfaceC8487b.dispose();
                    }
                    io.reactivex.w<? super T> wVar = this.f108789a;
                    wVar.onNext(t2);
                    try {
                        io.reactivex.u<?> apply = this.f108790b.apply(t2);
                        C9656b.c(apply, "The itemTimeoutIndicator returned a null ObservableSource.");
                        io.reactivex.u<?> uVar = apply;
                        a aVar = new a(j12, this);
                        if (rc.d.d(hVar, aVar)) {
                            uVar.subscribe(aVar);
                        }
                    } catch (Throwable th2) {
                        C2645f.c(th2);
                        this.f108792d.get().dispose();
                        getAndSet(Long.MAX_VALUE);
                        wVar.onError(th2);
                    }
                }
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this.f108792d, interfaceC8487b);
        }
    }

    interface d extends A1.d {
        void b(long j11, Throwable th2);
    }

    public z1(io.reactivex.p<T> pVar, io.reactivex.u<U> uVar, qc.o<? super T, ? extends io.reactivex.u<V>> oVar, io.reactivex.u<? extends T> uVar2) {
        super(pVar);
        this.f108778b = uVar;
        this.f108779c = oVar;
        this.f108780d = uVar2;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        io.reactivex.u<T> uVar = this.f108122a;
        io.reactivex.u<U> uVar2 = this.f108778b;
        qc.o<? super T, ? extends io.reactivex.u<V>> oVar = this.f108779c;
        io.reactivex.u<? extends T> uVar3 = this.f108780d;
        if (uVar3 == null) {
            c cVar = new c(wVar, oVar);
            wVar.onSubscribe(cVar);
            if (uVar2 != null) {
                a aVar = new a(0L, cVar);
                rc.h hVar = cVar.f108791c;
                hVar.getClass();
                if (rc.d.d(hVar, aVar)) {
                    uVar2.subscribe(aVar);
                }
            }
            uVar.subscribe(cVar);
            return;
        }
        b bVar = new b(uVar3, wVar, oVar);
        wVar.onSubscribe(bVar);
        if (uVar2 != null) {
            a aVar2 = new a(0L, bVar);
            rc.h hVar2 = bVar.f108785c;
            hVar2.getClass();
            if (rc.d.d(hVar2, aVar2)) {
                uVar2.subscribe(aVar2);
            }
        }
        uVar.subscribe(bVar);
    }
}
