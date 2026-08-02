package zc;

import Kc.C3493a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class B0<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.C<? extends T> f107551b;

    static final class a<T> extends AtomicInteger implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f107552a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f107553b = new AtomicReference<>();

        /* renamed from: c, reason: collision with root package name */
        final C2328a<T> f107554c = new C2328a<>(this);

        /* renamed from: d, reason: collision with root package name */
        final Gc.c f107555d = new Gc.c();

        /* renamed from: e, reason: collision with root package name */
        volatile Cc.c f107556e;

        /* renamed from: f, reason: collision with root package name */
        T f107557f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f107558g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f107559h;

        /* renamed from: i, reason: collision with root package name */
        volatile int f107560i;

        /* renamed from: zc.B0$a$a, reason: collision with other inner class name */
        static final class C2328a<T> extends AtomicReference<InterfaceC8487b> implements io.reactivex.A<T> {

            /* renamed from: a, reason: collision with root package name */
            final a<T> f107561a;

            C2328a(a<T> aVar) {
                this.f107561a = aVar;
            }

            @Override // io.reactivex.A
            public final void onError(Throwable th2) {
                a<T> aVar = this.f107561a;
                Gc.c cVar = aVar.f107555d;
                cVar.getClass();
                if (!Gc.i.a(cVar, th2)) {
                    C3493a.f(th2);
                    return;
                }
                rc.d.a(aVar.f107553b);
                if (aVar.getAndIncrement() == 0) {
                    aVar.a();
                }
            }

            @Override // io.reactivex.A
            public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
                rc.d.f(this, interfaceC8487b);
            }

            @Override // io.reactivex.A
            public final void onSuccess(T t2) {
                a<T> aVar = this.f107561a;
                if (aVar.compareAndSet(0, 1)) {
                    aVar.f107552a.onNext(t2);
                    aVar.f107560i = 2;
                } else {
                    aVar.f107557f = t2;
                    aVar.f107560i = 1;
                    if (aVar.getAndIncrement() != 0) {
                        return;
                    }
                }
                aVar.a();
            }
        }

        a(io.reactivex.w<? super T> wVar) {
            this.f107552a = wVar;
        }

        final void a() {
            io.reactivex.w<? super T> wVar = this.f107552a;
            int i11 = 1;
            while (!this.f107558g) {
                if (this.f107555d.get() != null) {
                    this.f107557f = null;
                    this.f107556e = null;
                    Gc.c cVar = this.f107555d;
                    cVar.getClass();
                    wVar.onError(Gc.i.b(cVar));
                    return;
                }
                int i12 = this.f107560i;
                if (i12 == 1) {
                    T t2 = this.f107557f;
                    this.f107557f = null;
                    this.f107560i = 2;
                    wVar.onNext(t2);
                    i12 = 2;
                }
                boolean z11 = this.f107559h;
                Cc.c cVar2 = this.f107556e;
                A00.a aVar = cVar2 != null ? (Object) cVar2.poll() : null;
                boolean z12 = aVar == null;
                if (z11 && z12 && i12 == 2) {
                    this.f107556e = null;
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
            this.f107557f = null;
            this.f107556e = null;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f107558g = true;
            rc.d.a(this.f107553b);
            rc.d.a(this.f107554c);
            if (getAndIncrement() == 0) {
                this.f107556e = null;
                this.f107557f = null;
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(this.f107553b.get());
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f107559h = true;
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            Gc.c cVar = this.f107555d;
            cVar.getClass();
            if (!Gc.i.a(cVar, th2)) {
                C3493a.f(th2);
                return;
            }
            rc.d.a(this.f107553b);
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (compareAndSet(0, 1)) {
                this.f107552a.onNext(t2);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                Cc.c cVar = this.f107556e;
                if (cVar == null) {
                    cVar = new Cc.c(io.reactivex.p.bufferSize());
                    this.f107556e = cVar;
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
            rc.d.f(this.f107553b, interfaceC8487b);
        }
    }

    public B0(io.reactivex.p<T> pVar, io.reactivex.C<? extends T> c11) {
        super(pVar);
        this.f107551b = c11;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        a aVar = new a(wVar);
        wVar.onSubscribe(aVar);
        this.f108122a.subscribe(aVar);
        this.f107551b.c(aVar.f107554c);
    }
}
