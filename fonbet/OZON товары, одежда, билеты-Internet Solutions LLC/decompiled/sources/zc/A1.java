package zc;

import Kc.C3493a;
import io.reactivex.x;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class A1<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f107527b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f107528c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.x f107529d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.u<? extends T> f107530e;

    /* loaded from: classes9.dex */
    static final class a<T> implements io.reactivex.w<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f107531a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f107532b;

        a(io.reactivex.w<? super T> wVar, AtomicReference<InterfaceC8487b> atomicReference) {
            this.f107531a = wVar;
            this.f107532b = atomicReference;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f107531a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f107531a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f107531a.onNext(t2);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.d(this.f107532b, interfaceC8487b);
        }
    }

    /* loaded from: classes9.dex */
    static final class b<T> extends AtomicReference<InterfaceC8487b> implements io.reactivex.w<T>, InterfaceC8487b, d {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f107533a;

        /* renamed from: b, reason: collision with root package name */
        final long f107534b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f107535c;

        /* renamed from: d, reason: collision with root package name */
        final x.c f107536d;

        /* renamed from: e, reason: collision with root package name */
        final rc.h f107537e = new rc.h();

        /* renamed from: f, reason: collision with root package name */
        final AtomicLong f107538f = new AtomicLong();

        /* renamed from: g, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f107539g = new AtomicReference<>();

        /* renamed from: h, reason: collision with root package name */
        io.reactivex.u<? extends T> f107540h;

        b(io.reactivex.w<? super T> wVar, long j11, TimeUnit timeUnit, x.c cVar, io.reactivex.u<? extends T> uVar) {
            this.f107533a = wVar;
            this.f107534b = j11;
            this.f107535c = timeUnit;
            this.f107536d = cVar;
            this.f107540h = uVar;
        }

        @Override // zc.A1.d
        public final void a(long j11) {
            if (this.f107538f.compareAndSet(j11, Long.MAX_VALUE)) {
                rc.d.a(this.f107539g);
                io.reactivex.u<? extends T> uVar = this.f107540h;
                this.f107540h = null;
                uVar.subscribe(new a(this.f107533a, this));
                this.f107536d.dispose();
            }
        }

        final void d(long j11) {
            InterfaceC8487b b11 = this.f107536d.b(new e(j11, this), this.f107534b, this.f107535c);
            rc.h hVar = this.f107537e;
            hVar.getClass();
            rc.d.d(hVar, b11);
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this.f107539g);
            rc.d.a(this);
            this.f107536d.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(get());
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f107538f.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                rc.h hVar = this.f107537e;
                hVar.getClass();
                rc.d.a(hVar);
                this.f107533a.onComplete();
                this.f107536d.dispose();
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f107538f.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                C3493a.f(th2);
                return;
            }
            rc.h hVar = this.f107537e;
            hVar.getClass();
            rc.d.a(hVar);
            this.f107533a.onError(th2);
            this.f107536d.dispose();
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            AtomicLong atomicLong = this.f107538f;
            long j11 = atomicLong.get();
            if (j11 != Long.MAX_VALUE) {
                long j12 = 1 + j11;
                if (atomicLong.compareAndSet(j11, j12)) {
                    this.f107537e.get().dispose();
                    this.f107533a.onNext(t2);
                    d(j12);
                }
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this.f107539g, interfaceC8487b);
        }
    }

    /* loaded from: classes9.dex */
    static final class c<T> extends AtomicLong implements io.reactivex.w<T>, InterfaceC8487b, d {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f107541a;

        /* renamed from: b, reason: collision with root package name */
        final long f107542b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f107543c;

        /* renamed from: d, reason: collision with root package name */
        final x.c f107544d;

        /* renamed from: e, reason: collision with root package name */
        final rc.h f107545e = new rc.h();

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f107546f = new AtomicReference<>();

        c(io.reactivex.w<? super T> wVar, long j11, TimeUnit timeUnit, x.c cVar) {
            this.f107541a = wVar;
            this.f107542b = j11;
            this.f107543c = timeUnit;
            this.f107544d = cVar;
        }

        @Override // zc.A1.d
        public final void a(long j11) {
            if (compareAndSet(j11, Long.MAX_VALUE)) {
                rc.d.a(this.f107546f);
                this.f107541a.onError(new TimeoutException(Gc.i.c(this.f107542b, this.f107543c)));
                this.f107544d.dispose();
            }
        }

        final void d(long j11) {
            InterfaceC8487b b11 = this.f107544d.b(new e(j11, this), this.f107542b, this.f107543c);
            rc.h hVar = this.f107545e;
            hVar.getClass();
            rc.d.d(hVar, b11);
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this.f107546f);
            this.f107544d.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(this.f107546f.get());
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                rc.h hVar = this.f107545e;
                hVar.getClass();
                rc.d.a(hVar);
                this.f107541a.onComplete();
                this.f107544d.dispose();
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                C3493a.f(th2);
                return;
            }
            rc.h hVar = this.f107545e;
            hVar.getClass();
            rc.d.a(hVar);
            this.f107541a.onError(th2);
            this.f107544d.dispose();
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            long j11 = get();
            if (j11 != Long.MAX_VALUE) {
                long j12 = 1 + j11;
                if (compareAndSet(j11, j12)) {
                    this.f107545e.get().dispose();
                    this.f107541a.onNext(t2);
                    d(j12);
                }
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this.f107546f, interfaceC8487b);
        }
    }

    /* loaded from: classes9.dex */
    interface d {
        void a(long j11);
    }

    /* loaded from: classes9.dex */
    static final class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Object f107547a;

        /* renamed from: b, reason: collision with root package name */
        final long f107548b;

        e(long j11, d dVar) {
            this.f107548b = j11;
            this.f107547a = dVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zc.A1$d] */
        @Override // java.lang.Runnable
        public final void run() {
            this.f107547a.a(this.f107548b);
        }
    }

    public A1(io.reactivex.p<T> pVar, long j11, TimeUnit timeUnit, io.reactivex.x xVar, io.reactivex.u<? extends T> uVar) {
        super(pVar);
        this.f107527b = j11;
        this.f107528c = timeUnit;
        this.f107529d = xVar;
        this.f107530e = uVar;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        io.reactivex.u<? extends T> uVar = this.f107530e;
        io.reactivex.u<T> uVar2 = this.f108122a;
        io.reactivex.x xVar = this.f107529d;
        if (uVar == null) {
            c cVar = new c(wVar, this.f107527b, this.f107528c, xVar.b());
            wVar.onSubscribe(cVar);
            cVar.d(0L);
            uVar2.subscribe(cVar);
            return;
        }
        b bVar = new b(wVar, this.f107527b, this.f107528c, xVar.b(), this.f107530e);
        wVar.onSubscribe(bVar);
        bVar.d(0L);
        uVar2.subscribe(bVar);
    }
}
