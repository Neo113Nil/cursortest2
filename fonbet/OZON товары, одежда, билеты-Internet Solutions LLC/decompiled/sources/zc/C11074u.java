package zc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import sc.C9656b;
import tc.InterfaceC9803e;
import tc.InterfaceC9808j;

/* renamed from: zc.u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11074u<T, U> extends AbstractC11019a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super T, ? extends io.reactivex.u<? extends U>> f108647b;

    /* renamed from: c, reason: collision with root package name */
    final int f108648c;

    /* renamed from: d, reason: collision with root package name */
    final Gc.h f108649d;

    /* renamed from: zc.u$a */
    static final class a<T, R> extends AtomicInteger implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super R> f108650a;

        /* renamed from: b, reason: collision with root package name */
        final qc.o<? super T, ? extends io.reactivex.u<? extends R>> f108651b;

        /* renamed from: c, reason: collision with root package name */
        final int f108652c;

        /* renamed from: d, reason: collision with root package name */
        final Gc.c f108653d = new Gc.c();

        /* renamed from: e, reason: collision with root package name */
        final C2343a<R> f108654e;

        /* renamed from: f, reason: collision with root package name */
        final boolean f108655f;

        /* renamed from: g, reason: collision with root package name */
        InterfaceC9808j<T> f108656g;

        /* renamed from: h, reason: collision with root package name */
        InterfaceC8487b f108657h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f108658i;

        /* renamed from: j, reason: collision with root package name */
        volatile boolean f108659j;

        /* renamed from: k, reason: collision with root package name */
        volatile boolean f108660k;

        /* renamed from: l, reason: collision with root package name */
        int f108661l;

        /* renamed from: zc.u$a$a, reason: collision with other inner class name */
        static final class C2343a<R> extends AtomicReference<InterfaceC8487b> implements io.reactivex.w<R> {

            /* renamed from: a, reason: collision with root package name */
            final io.reactivex.w<? super R> f108662a;

            /* renamed from: b, reason: collision with root package name */
            final a<?, R> f108663b;

            C2343a(io.reactivex.w<? super R> wVar, a<?, R> aVar) {
                this.f108662a = wVar;
                this.f108663b = aVar;
            }

            @Override // io.reactivex.w
            public final void onComplete() {
                a<?, R> aVar = this.f108663b;
                aVar.f108658i = false;
                aVar.a();
            }

            @Override // io.reactivex.w
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f108663b;
                Gc.c cVar = aVar.f108653d;
                cVar.getClass();
                if (!Gc.i.a(cVar, th2)) {
                    C3493a.f(th2);
                    return;
                }
                if (!aVar.f108655f) {
                    aVar.f108657h.dispose();
                }
                aVar.f108658i = false;
                aVar.a();
            }

            @Override // io.reactivex.w
            public final void onNext(R r11) {
                this.f108662a.onNext(r11);
            }

            @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
            public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
                rc.d.d(this, interfaceC8487b);
            }
        }

        a(io.reactivex.w<? super R> wVar, qc.o<? super T, ? extends io.reactivex.u<? extends R>> oVar, int i11, boolean z11) {
            this.f108650a = wVar;
            this.f108651b = oVar;
            this.f108652c = i11;
            this.f108655f = z11;
            this.f108654e = new C2343a<>(wVar, this);
        }

        final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.w<? super R> wVar = this.f108650a;
            InterfaceC9808j<T> interfaceC9808j = this.f108656g;
            Gc.c cVar = this.f108653d;
            while (true) {
                if (!this.f108658i) {
                    if (this.f108660k) {
                        interfaceC9808j.clear();
                        return;
                    }
                    if (!this.f108655f && cVar.get() != null) {
                        interfaceC9808j.clear();
                        this.f108660k = true;
                        wVar.onError(Gc.i.b(cVar));
                        return;
                    }
                    boolean z11 = this.f108659j;
                    try {
                        T poll = interfaceC9808j.poll();
                        boolean z12 = poll == null;
                        if (z11 && z12) {
                            this.f108660k = true;
                            cVar.getClass();
                            Throwable b11 = Gc.i.b(cVar);
                            if (b11 != null) {
                                wVar.onError(b11);
                                return;
                            } else {
                                wVar.onComplete();
                                return;
                            }
                        }
                        if (!z12) {
                            try {
                                io.reactivex.u<? extends R> apply = this.f108651b.apply(poll);
                                C9656b.c(apply, "The mapper returned a null ObservableSource");
                                io.reactivex.u<? extends R> uVar = apply;
                                if (uVar instanceof Callable) {
                                    try {
                                        A0.h hVar = (Object) ((Callable) uVar).call();
                                        if (hVar != null && !this.f108660k) {
                                            wVar.onNext(hVar);
                                        }
                                    } catch (Throwable th2) {
                                        C2645f.c(th2);
                                        cVar.getClass();
                                        Gc.i.a(cVar, th2);
                                    }
                                } else {
                                    this.f108658i = true;
                                    uVar.subscribe(this.f108654e);
                                }
                            } catch (Throwable th3) {
                                C2645f.c(th3);
                                this.f108660k = true;
                                this.f108657h.dispose();
                                interfaceC9808j.clear();
                                cVar.getClass();
                                Gc.i.a(cVar, th3);
                                wVar.onError(Gc.i.b(cVar));
                                return;
                            }
                        }
                    } catch (Throwable th4) {
                        C2645f.c(th4);
                        this.f108660k = true;
                        this.f108657h.dispose();
                        cVar.getClass();
                        Gc.i.a(cVar, th4);
                        wVar.onError(Gc.i.b(cVar));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108660k = true;
            this.f108657h.dispose();
            C2343a<R> c2343a = this.f108654e;
            c2343a.getClass();
            rc.d.a(c2343a);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108660k;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108659j = true;
            a();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            Gc.c cVar = this.f108653d;
            cVar.getClass();
            if (!Gc.i.a(cVar, th2)) {
                C3493a.f(th2);
            } else {
                this.f108659j = true;
                a();
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f108661l == 0) {
                this.f108656g.offer(t2);
            }
            a();
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108657h, interfaceC8487b)) {
                this.f108657h = interfaceC8487b;
                if (interfaceC8487b instanceof InterfaceC9803e) {
                    InterfaceC9803e interfaceC9803e = (InterfaceC9803e) interfaceC8487b;
                    int a11 = interfaceC9803e.a(3);
                    if (a11 == 1) {
                        this.f108661l = a11;
                        this.f108656g = interfaceC9803e;
                        this.f108659j = true;
                        this.f108650a.onSubscribe(this);
                        a();
                        return;
                    }
                    if (a11 == 2) {
                        this.f108661l = a11;
                        this.f108656g = interfaceC9803e;
                        this.f108650a.onSubscribe(this);
                        return;
                    }
                }
                this.f108656g = new Cc.c(this.f108652c);
                this.f108650a.onSubscribe(this);
            }
        }
    }

    /* renamed from: zc.u$b */
    static final class b<T, U> extends AtomicInteger implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final Ic.e f108664a;

        /* renamed from: b, reason: collision with root package name */
        final qc.o<? super T, ? extends io.reactivex.u<? extends U>> f108665b;

        /* renamed from: c, reason: collision with root package name */
        final a<U> f108666c;

        /* renamed from: d, reason: collision with root package name */
        final int f108667d;

        /* renamed from: e, reason: collision with root package name */
        InterfaceC9808j<T> f108668e;

        /* renamed from: f, reason: collision with root package name */
        InterfaceC8487b f108669f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f108670g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f108671h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f108672i;

        /* renamed from: j, reason: collision with root package name */
        int f108673j;

        /* renamed from: zc.u$b$a */
        static final class a<U> extends AtomicReference<InterfaceC8487b> implements io.reactivex.w<U> {

            /* renamed from: a, reason: collision with root package name */
            final Ic.e f108674a;

            /* renamed from: b, reason: collision with root package name */
            final b<?, ?> f108675b;

            a(Ic.e eVar, b bVar) {
                this.f108674a = eVar;
                this.f108675b = bVar;
            }

            @Override // io.reactivex.w
            public final void onComplete() {
                b<?, ?> bVar = this.f108675b;
                bVar.f108670g = false;
                bVar.a();
            }

            @Override // io.reactivex.w
            public final void onError(Throwable th2) {
                this.f108675b.dispose();
                this.f108674a.onError(th2);
            }

            @Override // io.reactivex.w
            public final void onNext(U u11) {
                this.f108674a.onNext(u11);
            }

            @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
            public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
                rc.d.d(this, interfaceC8487b);
            }
        }

        b(Ic.e eVar, qc.o oVar, int i11) {
            this.f108664a = eVar;
            this.f108665b = oVar;
            this.f108667d = i11;
            this.f108666c = new a<>(eVar, this);
        }

        final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f108671h) {
                if (!this.f108670g) {
                    boolean z11 = this.f108672i;
                    try {
                        T poll = this.f108668e.poll();
                        boolean z12 = poll == null;
                        if (z11 && z12) {
                            this.f108671h = true;
                            this.f108664a.onComplete();
                            return;
                        }
                        if (!z12) {
                            try {
                                io.reactivex.u<? extends U> apply = this.f108665b.apply(poll);
                                C9656b.c(apply, "The mapper returned a null ObservableSource");
                                io.reactivex.u<? extends U> uVar = apply;
                                this.f108670g = true;
                                uVar.subscribe(this.f108666c);
                            } catch (Throwable th2) {
                                C2645f.c(th2);
                                dispose();
                                this.f108668e.clear();
                                this.f108664a.onError(th2);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        C2645f.c(th3);
                        dispose();
                        this.f108668e.clear();
                        this.f108664a.onError(th3);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f108668e.clear();
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108671h = true;
            a<U> aVar = this.f108666c;
            aVar.getClass();
            rc.d.a(aVar);
            this.f108669f.dispose();
            if (getAndIncrement() == 0) {
                this.f108668e.clear();
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108671h;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f108672i) {
                return;
            }
            this.f108672i = true;
            a();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f108672i) {
                C3493a.f(th2);
                return;
            }
            this.f108672i = true;
            dispose();
            this.f108664a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f108672i) {
                return;
            }
            if (this.f108673j == 0) {
                this.f108668e.offer(t2);
            }
            a();
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108669f, interfaceC8487b)) {
                this.f108669f = interfaceC8487b;
                if (interfaceC8487b instanceof InterfaceC9803e) {
                    InterfaceC9803e interfaceC9803e = (InterfaceC9803e) interfaceC8487b;
                    int a11 = interfaceC9803e.a(3);
                    if (a11 == 1) {
                        this.f108673j = a11;
                        this.f108668e = interfaceC9803e;
                        this.f108672i = true;
                        this.f108664a.onSubscribe(this);
                        a();
                        return;
                    }
                    if (a11 == 2) {
                        this.f108673j = a11;
                        this.f108668e = interfaceC9803e;
                        this.f108664a.onSubscribe(this);
                        return;
                    }
                }
                this.f108668e = new Cc.c(this.f108667d);
                this.f108664a.onSubscribe(this);
            }
        }
    }

    public C11074u(io.reactivex.u<T> uVar, qc.o<? super T, ? extends io.reactivex.u<? extends U>> oVar, int i11, Gc.h hVar) {
        super(uVar);
        this.f108647b = oVar;
        this.f108649d = hVar;
        this.f108648c = Math.max(8, i11);
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super U> wVar) {
        io.reactivex.u<T> uVar = this.f108122a;
        qc.o<? super T, ? extends io.reactivex.u<? extends U>> oVar = this.f108647b;
        if (Z0.b(uVar, wVar, oVar)) {
            return;
        }
        Gc.h hVar = Gc.h.IMMEDIATE;
        int i11 = this.f108648c;
        Gc.h hVar2 = this.f108649d;
        if (hVar2 == hVar) {
            uVar.subscribe(new b(new Ic.e(wVar), oVar, i11));
        } else {
            uVar.subscribe(new a(wVar, oVar, i11, hVar2 == Gc.h.END));
        }
    }
}
