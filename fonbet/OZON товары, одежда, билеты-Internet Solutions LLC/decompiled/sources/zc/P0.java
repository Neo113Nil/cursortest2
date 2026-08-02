package zc;

import Hc.AbstractC3137a;
import Kc.C3493a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class P0<T> extends io.reactivex.p<T> {

    /* renamed from: a, reason: collision with root package name */
    final AbstractC3137a<T> f107926a;

    /* renamed from: b, reason: collision with root package name */
    final int f107927b;

    /* renamed from: c, reason: collision with root package name */
    a f107928c;

    /* loaded from: classes9.dex */
    static final class a extends AtomicReference<InterfaceC8487b> implements Runnable, qc.g<InterfaceC8487b> {

        /* renamed from: a, reason: collision with root package name */
        final P0<?> f107929a;

        /* renamed from: b, reason: collision with root package name */
        long f107930b;

        /* renamed from: c, reason: collision with root package name */
        boolean f107931c;

        /* renamed from: d, reason: collision with root package name */
        boolean f107932d;

        a(P0<?> p02) {
            this.f107929a = p02;
        }

        @Override // qc.g
        public final void accept(InterfaceC8487b interfaceC8487b) throws Exception {
            InterfaceC8487b interfaceC8487b2 = interfaceC8487b;
            rc.d.d(this, interfaceC8487b2);
            synchronized (this.f107929a) {
                try {
                    if (this.f107932d) {
                        ((rc.g) this.f107929a.f107926a).b(interfaceC8487b2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f107929a.d(this);
        }
    }

    /* loaded from: classes9.dex */
    static final class b<T> extends AtomicBoolean implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f107933a;

        /* renamed from: b, reason: collision with root package name */
        final P0<T> f107934b;

        /* renamed from: c, reason: collision with root package name */
        final a f107935c;

        /* renamed from: d, reason: collision with root package name */
        InterfaceC8487b f107936d;

        b(io.reactivex.w<? super T> wVar, P0<T> p02, a aVar) {
            this.f107933a = wVar;
            this.f107934b = p02;
            this.f107935c = aVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f107936d.dispose();
            if (compareAndSet(false, true)) {
                P0<T> p02 = this.f107934b;
                a aVar = this.f107935c;
                synchronized (p02) {
                    try {
                        a aVar2 = p02.f107928c;
                        if (aVar2 != null && aVar2 == aVar) {
                            long j11 = aVar.f107930b - 1;
                            aVar.f107930b = j11;
                            if (j11 == 0 && aVar.f107931c) {
                                p02.d(aVar);
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107936d.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (compareAndSet(false, true)) {
                this.f107934b.c(this.f107935c);
                this.f107933a.onComplete();
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (!compareAndSet(false, true)) {
                C3493a.f(th2);
            } else {
                this.f107934b.c(this.f107935c);
                this.f107933a.onError(th2);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f107933a.onNext(t2);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f107936d, interfaceC8487b)) {
                this.f107936d = interfaceC8487b;
                this.f107933a.onSubscribe(this);
            }
        }
    }

    public P0(AbstractC3137a<T> abstractC3137a) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.f107926a = abstractC3137a;
        this.f107927b = 1;
    }

    final void c(a aVar) {
        synchronized (this) {
            try {
                a aVar2 = this.f107928c;
                if (aVar2 != null && aVar2 == aVar) {
                    this.f107928c = null;
                    aVar.getClass();
                }
                long j11 = aVar.f107930b - 1;
                aVar.f107930b = j11;
                if (j11 == 0) {
                    AbstractC3137a<T> abstractC3137a = this.f107926a;
                    if (abstractC3137a instanceof InterfaceC8487b) {
                        ((InterfaceC8487b) abstractC3137a).dispose();
                    } else if (abstractC3137a instanceof rc.g) {
                        ((rc.g) abstractC3137a).b(aVar.get());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void d(a aVar) {
        synchronized (this) {
            try {
                if (aVar.f107930b == 0 && aVar == this.f107928c) {
                    this.f107928c = null;
                    InterfaceC8487b interfaceC8487b = aVar.get();
                    rc.d.a(aVar);
                    AbstractC3137a<T> abstractC3137a = this.f107926a;
                    if (abstractC3137a instanceof InterfaceC8487b) {
                        ((InterfaceC8487b) abstractC3137a).dispose();
                    } else if (abstractC3137a instanceof rc.g) {
                        if (interfaceC8487b == null) {
                            aVar.f107932d = true;
                        } else {
                            ((rc.g) abstractC3137a).b(interfaceC8487b);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        a aVar;
        boolean z11;
        synchronized (this) {
            try {
                aVar = this.f107928c;
                if (aVar == null) {
                    aVar = new a(this);
                    this.f107928c = aVar;
                }
                long j11 = aVar.f107930b + 1;
                aVar.f107930b = j11;
                if (aVar.f107931c || j11 != this.f107927b) {
                    z11 = false;
                } else {
                    z11 = true;
                    aVar.f107931c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f107926a.subscribe(new b(wVar, this, aVar));
        if (z11) {
            this.f107926a.c(aVar);
        }
    }
}
