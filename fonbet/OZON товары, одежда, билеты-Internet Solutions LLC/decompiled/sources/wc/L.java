package wc;

import hg.InterfaceC6950c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class L<T> extends AbstractC10480a<T, T> {

    /* renamed from: d, reason: collision with root package name */
    final long f103847d;

    /* renamed from: e, reason: collision with root package name */
    final TimeUnit f103848e;

    /* renamed from: f, reason: collision with root package name */
    final io.reactivex.x f103849f;

    static final class a<T> extends b<T> {
        @Override // wc.L.b
        final void a() {
            this.f103850a.onComplete();
        }
    }

    static abstract class b<T> extends AtomicReference<T> implements io.reactivex.j<T>, InterfaceC6950c, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Oc.a f103850a;

        /* renamed from: b, reason: collision with root package name */
        final long f103851b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f103852c;

        /* renamed from: d, reason: collision with root package name */
        final io.reactivex.x f103853d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicLong f103854e = new AtomicLong();

        /* renamed from: f, reason: collision with root package name */
        final rc.h f103855f = new rc.h();

        /* renamed from: g, reason: collision with root package name */
        InterfaceC6950c f103856g;

        b(Oc.a aVar, long j11, TimeUnit timeUnit, io.reactivex.x xVar) {
            this.f103850a = aVar;
            this.f103851b = j11;
            this.f103852c = timeUnit;
            this.f103853d = xVar;
        }

        abstract void a();

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            rc.d.a(this.f103855f);
            this.f103856g.cancel();
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (Fc.g.g(this.f103856g, interfaceC6950c)) {
                this.f103856g = interfaceC6950c;
                this.f103850a.d(this);
                TimeUnit timeUnit = this.f103852c;
                io.reactivex.x xVar = this.f103853d;
                long j11 = this.f103851b;
                InterfaceC8487b f7 = xVar.f(this, j11, j11, timeUnit);
                rc.h hVar = this.f103855f;
                hVar.getClass();
                rc.d.d(hVar, f7);
                interfaceC6950c.n(Long.MAX_VALUE);
            }
        }

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
            if (Fc.g.f(j11)) {
                Gc.d.a(this.f103854e, j11);
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            rc.d.a(this.f103855f);
            a();
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            rc.d.a(this.f103855f);
            this.f103850a.onError(th2);
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            lazySet(t2);
        }

        @Override // java.lang.Runnable
        public void run() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                AtomicLong atomicLong = this.f103854e;
                long j11 = atomicLong.get();
                Oc.a aVar = this.f103850a;
                if (j11 != 0) {
                    aVar.onNext(andSet);
                    Gc.d.c(atomicLong, 1L);
                } else {
                    cancel();
                    aVar.onError(new oc.b("Couldn't emit value due to lack of requests!"));
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(C10492m c10492m, io.reactivex.x xVar) {
        super(c10492m);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f103847d = 16L;
        this.f103848e = timeUnit;
        this.f103849f = xVar;
    }

    @Override // io.reactivex.h
    protected final void j(io.reactivex.j jVar) {
        this.f103914c.i(new a(new Oc.a(jVar), this.f103847d, this.f103848e, this.f103849f));
    }
}
