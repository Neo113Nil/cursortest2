package wc;

import hg.InterfaceC6948a;
import hg.InterfaceC6950c;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class Q<T> extends AbstractC10480a<T, T> {

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.x f103868d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f103869e;

    static final class a<T> extends AtomicReference<Thread> implements io.reactivex.j<T>, InterfaceC6950c, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.j f103870a;

        /* renamed from: b, reason: collision with root package name */
        final x.c f103871b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference<InterfaceC6950c> f103872c = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        final AtomicLong f103873d = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        final boolean f103874e;

        /* renamed from: f, reason: collision with root package name */
        InterfaceC6948a<T> f103875f;

        /* renamed from: wc.Q$a$a, reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        static final class RunnableC2250a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final InterfaceC6950c f103876a;

            /* renamed from: b, reason: collision with root package name */
            final long f103877b;

            RunnableC2250a(long j11, InterfaceC6950c interfaceC6950c) {
                this.f103876a = interfaceC6950c;
                this.f103877b = j11;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f103876a.n(this.f103877b);
            }
        }

        a(io.reactivex.j jVar, x.c cVar, InterfaceC6948a interfaceC6948a, boolean z11) {
            this.f103870a = jVar;
            this.f103871b = cVar;
            this.f103875f = interfaceC6948a;
            this.f103874e = !z11;
        }

        final void a(long j11, InterfaceC6950c interfaceC6950c) {
            if (this.f103874e || Thread.currentThread() == get()) {
                interfaceC6950c.n(j11);
            } else {
                this.f103871b.a(new RunnableC2250a(j11, interfaceC6950c));
            }
        }

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            Fc.g.a(this.f103872c);
            this.f103871b.dispose();
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (Fc.g.e(this.f103872c, interfaceC6950c)) {
                long andSet = this.f103873d.getAndSet(0L);
                if (andSet != 0) {
                    a(andSet, interfaceC6950c);
                }
            }
        }

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
            if (Fc.g.f(j11)) {
                AtomicReference<InterfaceC6950c> atomicReference = this.f103872c;
                InterfaceC6950c interfaceC6950c = atomicReference.get();
                if (interfaceC6950c != null) {
                    a(j11, interfaceC6950c);
                    return;
                }
                AtomicLong atomicLong = this.f103873d;
                Gc.d.a(atomicLong, j11);
                InterfaceC6950c interfaceC6950c2 = atomicReference.get();
                if (interfaceC6950c2 != null) {
                    long andSet = atomicLong.getAndSet(0L);
                    if (andSet != 0) {
                        a(andSet, interfaceC6950c2);
                    }
                }
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            this.f103870a.onComplete();
            this.f103871b.dispose();
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            this.f103870a.onError(th2);
            this.f103871b.dispose();
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            this.f103870a.onNext(t2);
        }

        @Override // java.lang.Runnable
        public final void run() {
            lazySet(Thread.currentThread());
            InterfaceC6948a<T> interfaceC6948a = this.f103875f;
            this.f103875f = null;
            interfaceC6948a.a(this);
        }
    }

    public Q(io.reactivex.h<T> hVar, io.reactivex.x xVar, boolean z11) {
        super(hVar);
        this.f103868d = xVar;
        this.f103869e = z11;
    }

    @Override // io.reactivex.h
    public final void j(io.reactivex.j jVar) {
        x.c b11 = this.f103868d.b();
        a aVar = new a(jVar, b11, this.f103914c, this.f103869e);
        jVar.d(aVar);
        b11.a(aVar);
    }
}
