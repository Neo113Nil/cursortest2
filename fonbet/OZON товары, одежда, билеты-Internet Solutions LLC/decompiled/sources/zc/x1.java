package zc;

import io.reactivex.x;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class x1<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f108738b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f108739c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.x f108740d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f108741e;

    static final class a<T> extends AtomicInteger implements io.reactivex.w<T>, InterfaceC8487b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108742a;

        /* renamed from: b, reason: collision with root package name */
        final long f108743b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f108744c;

        /* renamed from: d, reason: collision with root package name */
        final x.c f108745d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f108746e;

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference<T> f108747f = new AtomicReference<>();

        /* renamed from: g, reason: collision with root package name */
        InterfaceC8487b f108748g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f108749h;

        /* renamed from: i, reason: collision with root package name */
        Throwable f108750i;

        /* renamed from: j, reason: collision with root package name */
        volatile boolean f108751j;

        /* renamed from: k, reason: collision with root package name */
        volatile boolean f108752k;

        /* renamed from: l, reason: collision with root package name */
        boolean f108753l;

        a(io.reactivex.w<? super T> wVar, long j11, TimeUnit timeUnit, x.c cVar, boolean z11) {
            this.f108742a = wVar;
            this.f108743b = j11;
            this.f108744c = timeUnit;
            this.f108745d = cVar;
            this.f108746e = z11;
        }

        final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<T> atomicReference = this.f108747f;
            io.reactivex.w<? super T> wVar = this.f108742a;
            int i11 = 1;
            while (!this.f108751j) {
                boolean z11 = this.f108749h;
                if (z11 && this.f108750i != null) {
                    atomicReference.lazySet(null);
                    wVar.onError(this.f108750i);
                    this.f108745d.dispose();
                    return;
                }
                boolean z12 = atomicReference.get() == null;
                if (z11) {
                    T andSet = atomicReference.getAndSet(null);
                    if (!z12 && this.f108746e) {
                        wVar.onNext(andSet);
                    }
                    wVar.onComplete();
                    this.f108745d.dispose();
                    return;
                }
                if (z12) {
                    if (this.f108752k) {
                        this.f108753l = false;
                        this.f108752k = false;
                    }
                } else if (!this.f108753l || this.f108752k) {
                    wVar.onNext(atomicReference.getAndSet(null));
                    this.f108752k = false;
                    this.f108753l = true;
                    this.f108745d.b(this, this.f108743b, this.f108744c);
                }
                i11 = addAndGet(-i11);
                if (i11 == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108751j = true;
            this.f108748g.dispose();
            this.f108745d.dispose();
            if (getAndIncrement() == 0) {
                this.f108747f.lazySet(null);
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108751j;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108749h = true;
            a();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108750i = th2;
            this.f108749h = true;
            a();
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f108747f.set(t2);
            a();
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108748g, interfaceC8487b)) {
                this.f108748g = interfaceC8487b;
                this.f108742a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f108752k = true;
            a();
        }
    }

    public x1(io.reactivex.p<T> pVar, long j11, TimeUnit timeUnit, io.reactivex.x xVar, boolean z11) {
        super(pVar);
        this.f108738b = j11;
        this.f108739c = timeUnit;
        this.f108740d = xVar;
        this.f108741e = z11;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f108738b, this.f108739c, this.f108740d.b(), this.f108741e));
    }
}
