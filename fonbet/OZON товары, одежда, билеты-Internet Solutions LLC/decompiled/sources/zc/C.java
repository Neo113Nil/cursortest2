package zc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class C<T, U> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super T, ? extends io.reactivex.u<U>> f107566b;

    static final class a<T, U> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final Ic.e f107567a;

        /* renamed from: b, reason: collision with root package name */
        final qc.o<? super T, ? extends io.reactivex.u<U>> f107568b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f107569c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f107570d = new AtomicReference<>();

        /* renamed from: e, reason: collision with root package name */
        volatile long f107571e;

        /* renamed from: f, reason: collision with root package name */
        boolean f107572f;

        /* renamed from: zc.C$a$a, reason: collision with other inner class name */
        static final class C2329a<T, U> extends Ic.c<U> {

            /* renamed from: b, reason: collision with root package name */
            final a<T, U> f107573b;

            /* renamed from: c, reason: collision with root package name */
            final long f107574c;

            /* renamed from: d, reason: collision with root package name */
            final T f107575d;

            /* renamed from: e, reason: collision with root package name */
            boolean f107576e;

            /* renamed from: f, reason: collision with root package name */
            final AtomicBoolean f107577f = new AtomicBoolean();

            C2329a(a<T, U> aVar, long j11, T t2) {
                this.f107573b = aVar;
                this.f107574c = j11;
                this.f107575d = t2;
            }

            final void a() {
                if (this.f107577f.compareAndSet(false, true)) {
                    a<T, U> aVar = this.f107573b;
                    long j11 = this.f107574c;
                    T t2 = this.f107575d;
                    if (j11 == aVar.f107571e) {
                        aVar.f107567a.onNext(t2);
                    }
                }
            }

            @Override // io.reactivex.w
            public final void onComplete() {
                if (this.f107576e) {
                    return;
                }
                this.f107576e = true;
                a();
            }

            @Override // io.reactivex.w
            public final void onError(Throwable th2) {
                if (this.f107576e) {
                    C3493a.f(th2);
                } else {
                    this.f107576e = true;
                    this.f107573b.onError(th2);
                }
            }

            @Override // io.reactivex.w
            public final void onNext(U u11) {
                if (this.f107576e) {
                    return;
                }
                this.f107576e = true;
                dispose();
                a();
            }
        }

        a(Ic.e eVar, qc.o oVar) {
            this.f107567a = eVar;
            this.f107568b = oVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f107569c.dispose();
            rc.d.a(this.f107570d);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107569c.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f107572f) {
                return;
            }
            this.f107572f = true;
            AtomicReference<InterfaceC8487b> atomicReference = this.f107570d;
            InterfaceC8487b interfaceC8487b = atomicReference.get();
            if (interfaceC8487b != rc.d.DISPOSED) {
                ((C2329a) interfaceC8487b).a();
                rc.d.a(atomicReference);
                this.f107567a.onComplete();
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            rc.d.a(this.f107570d);
            this.f107567a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f107572f) {
                return;
            }
            long j11 = this.f107571e + 1;
            this.f107571e = j11;
            InterfaceC8487b interfaceC8487b = this.f107570d.get();
            if (interfaceC8487b != null) {
                interfaceC8487b.dispose();
            }
            try {
                io.reactivex.u<U> apply = this.f107568b.apply(t2);
                C9656b.c(apply, "The ObservableSource supplied is null");
                io.reactivex.u<U> uVar = apply;
                C2329a c2329a = new C2329a(this, j11, t2);
                AtomicReference<InterfaceC8487b> atomicReference = this.f107570d;
                while (!atomicReference.compareAndSet(interfaceC8487b, c2329a)) {
                    if (atomicReference.get() != interfaceC8487b) {
                        return;
                    }
                }
                uVar.subscribe(c2329a);
            } catch (Throwable th2) {
                C2645f.c(th2);
                dispose();
                this.f107567a.onError(th2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f107569c, interfaceC8487b)) {
                this.f107569c = interfaceC8487b;
                this.f107567a.onSubscribe(this);
            }
        }
    }

    public C(io.reactivex.p pVar, qc.o oVar) {
        super(pVar);
        this.f107566b = oVar;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(new Ic.e(wVar), this.f107566b));
    }
}
