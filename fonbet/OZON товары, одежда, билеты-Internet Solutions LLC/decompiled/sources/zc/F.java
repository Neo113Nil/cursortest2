package zc;

import io.reactivex.x;
import java.util.concurrent.TimeUnit;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class F<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f107631b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f107632c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.x f107633d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f107634e;

    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f107635a;

        /* renamed from: b, reason: collision with root package name */
        final long f107636b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f107637c;

        /* renamed from: d, reason: collision with root package name */
        final x.c f107638d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f107639e;

        /* renamed from: f, reason: collision with root package name */
        InterfaceC8487b f107640f;

        /* renamed from: zc.F$a$a, reason: collision with other inner class name */
        final class RunnableC2331a implements Runnable {
            RunnableC2331a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                try {
                    aVar.f107635a.onComplete();
                } finally {
                    aVar.f107638d.dispose();
                }
            }
        }

        final class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f107642a;

            b(Throwable th2) {
                this.f107642a = th2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                try {
                    aVar.f107635a.onError(this.f107642a);
                } finally {
                    aVar.f107638d.dispose();
                }
            }
        }

        final class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final T f107644a;

            c(T t2) {
                this.f107644a = t2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f107635a.onNext(this.f107644a);
            }
        }

        a(io.reactivex.w<? super T> wVar, long j11, TimeUnit timeUnit, x.c cVar, boolean z11) {
            this.f107635a = wVar;
            this.f107636b = j11;
            this.f107637c = timeUnit;
            this.f107638d = cVar;
            this.f107639e = z11;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f107640f.dispose();
            this.f107638d.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107638d.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f107638d.b(new RunnableC2331a(), this.f107636b, this.f107637c);
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f107638d.b(new b(th2), this.f107639e ? this.f107636b : 0L, this.f107637c);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f107638d.b(new c(t2), this.f107636b, this.f107637c);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f107640f, interfaceC8487b)) {
                this.f107640f = interfaceC8487b;
                this.f107635a.onSubscribe(this);
            }
        }
    }

    public F(io.reactivex.p pVar, long j11, TimeUnit timeUnit, io.reactivex.x xVar, boolean z11) {
        super(pVar);
        this.f107631b = j11;
        this.f107632c = timeUnit;
        this.f107633d = xVar;
        this.f107634e = z11;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(this.f107634e ? wVar : new Ic.e(wVar), this.f107631b, this.f107632c, this.f107633d.b(), this.f107634e));
    }
}
