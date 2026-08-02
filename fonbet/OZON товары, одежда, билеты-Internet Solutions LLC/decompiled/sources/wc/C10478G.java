package wc;

import Kc.C3493a;
import hg.InterfaceC6950c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import pc.AbstractC8896a;

/* renamed from: wc.G, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10478G<T> extends io.reactivex.h<T> {

    /* renamed from: c, reason: collision with root package name */
    final AbstractC8896a<T> f103784c;

    /* renamed from: d, reason: collision with root package name */
    final int f103785d;

    /* renamed from: e, reason: collision with root package name */
    a f103786e;

    /* renamed from: wc.G$a */
    static final class a extends AtomicReference<InterfaceC8487b> implements Runnable, qc.g<InterfaceC8487b> {

        /* renamed from: a, reason: collision with root package name */
        final C10478G<?> f103787a;

        /* renamed from: b, reason: collision with root package name */
        long f103788b;

        /* renamed from: c, reason: collision with root package name */
        boolean f103789c;

        /* renamed from: d, reason: collision with root package name */
        boolean f103790d;

        a(C10478G<?> c10478g) {
            this.f103787a = c10478g;
        }

        @Override // qc.g
        public final void accept(InterfaceC8487b interfaceC8487b) throws Exception {
            InterfaceC8487b interfaceC8487b2 = interfaceC8487b;
            rc.d.d(this, interfaceC8487b2);
            synchronized (this.f103787a) {
                try {
                    if (this.f103790d) {
                        ((rc.g) this.f103787a.f103784c).b(interfaceC8487b2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f103787a.m(this);
        }
    }

    /* renamed from: wc.G$b */
    static final class b<T> extends AtomicBoolean implements io.reactivex.j<T>, InterfaceC6950c {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.j f103791a;

        /* renamed from: b, reason: collision with root package name */
        final C10478G<T> f103792b;

        /* renamed from: c, reason: collision with root package name */
        final a f103793c;

        /* renamed from: d, reason: collision with root package name */
        InterfaceC6950c f103794d;

        b(io.reactivex.j jVar, C10478G c10478g, a aVar) {
            this.f103791a = jVar;
            this.f103792b = c10478g;
            this.f103793c = aVar;
        }

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            this.f103794d.cancel();
            if (compareAndSet(false, true)) {
                C10478G<T> c10478g = this.f103792b;
                a aVar = this.f103793c;
                synchronized (c10478g) {
                    try {
                        a aVar2 = c10478g.f103786e;
                        if (aVar2 != null && aVar2 == aVar) {
                            long j11 = aVar.f103788b - 1;
                            aVar.f103788b = j11;
                            if (j11 == 0 && aVar.f103789c) {
                                c10478g.m(aVar);
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (Fc.g.g(this.f103794d, interfaceC6950c)) {
                this.f103794d = interfaceC6950c;
                this.f103791a.d(this);
            }
        }

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
            this.f103794d.n(j11);
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            if (compareAndSet(false, true)) {
                this.f103792b.l(this.f103793c);
                this.f103791a.onComplete();
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            if (!compareAndSet(false, true)) {
                C3493a.f(th2);
            } else {
                this.f103792b.l(this.f103793c);
                this.f103791a.onError(th2);
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            this.f103791a.onNext(t2);
        }
    }

    public C10478G(AbstractC8896a<T> abstractC8896a) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.f103784c = abstractC8896a;
        this.f103785d = 1;
    }

    @Override // io.reactivex.h
    protected final void j(io.reactivex.j jVar) {
        a aVar;
        boolean z11;
        synchronized (this) {
            try {
                aVar = this.f103786e;
                if (aVar == null) {
                    aVar = new a(this);
                    this.f103786e = aVar;
                }
                long j11 = aVar.f103788b + 1;
                aVar.f103788b = j11;
                if (aVar.f103789c || j11 != this.f103785d) {
                    z11 = false;
                } else {
                    z11 = true;
                    aVar.f103789c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f103784c.i(new b(jVar, this, aVar));
        if (z11) {
            this.f103784c.l(aVar);
        }
    }

    final void l(a aVar) {
        synchronized (this) {
            try {
                a aVar2 = this.f103786e;
                if (aVar2 != null && aVar2 == aVar) {
                    this.f103786e = null;
                    aVar.getClass();
                }
                long j11 = aVar.f103788b - 1;
                aVar.f103788b = j11;
                if (j11 == 0) {
                    AbstractC8896a<T> abstractC8896a = this.f103784c;
                    if (abstractC8896a instanceof InterfaceC8487b) {
                        ((InterfaceC8487b) abstractC8896a).dispose();
                    } else if (abstractC8896a != null) {
                        ((rc.g) abstractC8896a).b(aVar.get());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void m(a aVar) {
        synchronized (this) {
            try {
                if (aVar.f103788b == 0 && aVar == this.f103786e) {
                    this.f103786e = null;
                    InterfaceC8487b interfaceC8487b = aVar.get();
                    rc.d.a(aVar);
                    AbstractC8896a<T> abstractC8896a = this.f103784c;
                    if (abstractC8896a instanceof InterfaceC8487b) {
                        ((InterfaceC8487b) abstractC8896a).dispose();
                    } else if (abstractC8896a instanceof rc.g) {
                        if (interfaceC8487b == null) {
                            aVar.f103790d = true;
                        } else {
                            ((rc.g) abstractC8896a).b(interfaceC8487b);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
