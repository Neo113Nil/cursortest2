package wc;

import Kc.C3493a;
import hg.InterfaceC6950c;
import io.reactivex.x;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class U<T> extends AbstractC10480a<T, T> {

    /* renamed from: d, reason: collision with root package name */
    final long f103902d;

    /* renamed from: e, reason: collision with root package name */
    final TimeUnit f103903e;

    /* renamed from: f, reason: collision with root package name */
    final io.reactivex.x f103904f;

    static final class a<T> extends AtomicLong implements io.reactivex.j<T>, InterfaceC6950c, b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.j f103905a;

        /* renamed from: b, reason: collision with root package name */
        final long f103906b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f103907c;

        /* renamed from: d, reason: collision with root package name */
        final x.c f103908d;

        /* renamed from: e, reason: collision with root package name */
        final rc.h f103909e = new rc.h();

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference<InterfaceC6950c> f103910f = new AtomicReference<>();

        /* renamed from: g, reason: collision with root package name */
        final AtomicLong f103911g = new AtomicLong();

        a(io.reactivex.j jVar, long j11, TimeUnit timeUnit, x.c cVar) {
            this.f103905a = jVar;
            this.f103906b = j11;
            this.f103907c = timeUnit;
            this.f103908d = cVar;
        }

        @Override // wc.U.b
        public final void a(long j11) {
            if (compareAndSet(j11, Long.MAX_VALUE)) {
                Fc.g.a(this.f103910f);
                this.f103905a.onError(new TimeoutException(Gc.i.c(this.f103906b, this.f103907c)));
                this.f103908d.dispose();
            }
        }

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            Fc.g.a(this.f103910f);
            this.f103908d.dispose();
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            Fc.g.d(this.f103910f, this.f103911g, interfaceC6950c);
        }

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
            Fc.g.b(this.f103910f, this.f103911g, j11);
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                rc.h hVar = this.f103909e;
                hVar.getClass();
                rc.d.a(hVar);
                this.f103905a.onComplete();
                this.f103908d.dispose();
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                C3493a.f(th2);
                return;
            }
            rc.h hVar = this.f103909e;
            hVar.getClass();
            rc.d.a(hVar);
            this.f103905a.onError(th2);
            this.f103908d.dispose();
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            long j11 = get();
            if (j11 != Long.MAX_VALUE) {
                long j12 = 1 + j11;
                if (compareAndSet(j11, j12)) {
                    rc.h hVar = this.f103909e;
                    hVar.get().dispose();
                    this.f103905a.onNext(t2);
                    InterfaceC8487b b11 = this.f103908d.b(new c(j12, this), this.f103906b, this.f103907c);
                    hVar.getClass();
                    rc.d.d(hVar, b11);
                }
            }
        }
    }

    interface b {
        void a(long j11);
    }

    static final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Number f103912a;

        /* renamed from: b, reason: collision with root package name */
        final long f103913b;

        /* JADX WARN: Multi-variable type inference failed */
        c(long j11, b bVar) {
            this.f103913b = j11;
            this.f103912a = (Number) bVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Number, wc.U$b] */
        @Override // java.lang.Runnable
        public final void run() {
            this.f103912a.a(this.f103913b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(C10494o c10494o, long j11, io.reactivex.x xVar) {
        super(c10494o);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f103902d = j11;
        this.f103903e = timeUnit;
        this.f103904f = xVar;
    }

    @Override // io.reactivex.h
    protected final void j(io.reactivex.j jVar) {
        a aVar = new a(jVar, this.f103902d, this.f103903e, this.f103904f.b());
        jVar.d(aVar);
        InterfaceC8487b b11 = aVar.f103908d.b(new c(0L, aVar), aVar.f103906b, aVar.f103907c);
        rc.h hVar = aVar.f103909e;
        hVar.getClass();
        rc.d.d(hVar, b11);
        this.f103914c.i(aVar);
    }
}
