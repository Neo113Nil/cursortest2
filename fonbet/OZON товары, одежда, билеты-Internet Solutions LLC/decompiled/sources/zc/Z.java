package zc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.C8486a;
import nc.InterfaceC8487b;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class Z<T, R> extends AbstractC11019a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super T, ? extends io.reactivex.n<? extends R>> f108106b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f108107c;

    static final class a<T, R> extends AtomicInteger implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super R> f108108a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f108109b;

        /* renamed from: f, reason: collision with root package name */
        final qc.o<? super T, ? extends io.reactivex.n<? extends R>> f108113f;

        /* renamed from: h, reason: collision with root package name */
        InterfaceC8487b f108115h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f108116i;

        /* renamed from: c, reason: collision with root package name */
        final C8486a f108110c = new C8486a();

        /* renamed from: e, reason: collision with root package name */
        final Gc.c f108112e = new Gc.c();

        /* renamed from: d, reason: collision with root package name */
        final AtomicInteger f108111d = new AtomicInteger(1);

        /* renamed from: g, reason: collision with root package name */
        final AtomicReference<Cc.c<R>> f108114g = new AtomicReference<>();

        /* renamed from: zc.Z$a$a, reason: collision with other inner class name */
        final class C2338a extends AtomicReference<InterfaceC8487b> implements io.reactivex.m<R>, InterfaceC8487b {
            C2338a() {
            }

            @Override // nc.InterfaceC8487b
            public final void dispose() {
                rc.d.a(this);
            }

            @Override // nc.InterfaceC8487b
            public final boolean isDisposed() {
                return rc.d.b(get());
            }

            @Override // io.reactivex.m
            public final void onComplete() {
                a aVar = a.this;
                aVar.f108110c.b(this);
                int i11 = aVar.get();
                AtomicInteger atomicInteger = aVar.f108111d;
                if (i11 == 0) {
                    if (aVar.compareAndSet(0, 1)) {
                        boolean z11 = atomicInteger.decrementAndGet() == 0;
                        Cc.c<R> cVar = aVar.f108114g.get();
                        if (!z11 || (cVar != null && !cVar.isEmpty())) {
                            if (aVar.decrementAndGet() == 0) {
                                return;
                            }
                            aVar.a();
                            return;
                        }
                        Gc.c cVar2 = aVar.f108112e;
                        cVar2.getClass();
                        Throwable b11 = Gc.i.b(cVar2);
                        io.reactivex.w<? super R> wVar = aVar.f108108a;
                        if (b11 != null) {
                            wVar.onError(b11);
                            return;
                        } else {
                            wVar.onComplete();
                            return;
                        }
                    }
                }
                atomicInteger.decrementAndGet();
                if (aVar.getAndIncrement() == 0) {
                    aVar.a();
                }
            }

            @Override // io.reactivex.m
            public final void onError(Throwable th2) {
                a aVar = a.this;
                C8486a c8486a = aVar.f108110c;
                c8486a.b(this);
                Gc.c cVar = aVar.f108112e;
                cVar.getClass();
                if (!Gc.i.a(cVar, th2)) {
                    C3493a.f(th2);
                    return;
                }
                if (!aVar.f108109b) {
                    aVar.f108115h.dispose();
                    c8486a.dispose();
                }
                aVar.f108111d.decrementAndGet();
                if (aVar.getAndIncrement() == 0) {
                    aVar.a();
                }
            }

            @Override // io.reactivex.m, io.reactivex.A
            public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
                rc.d.f(this, interfaceC8487b);
            }

            @Override // io.reactivex.m, io.reactivex.A
            public final void onSuccess(R r11) {
                Cc.c<R> cVar;
                a aVar = a.this;
                aVar.f108110c.b(this);
                if (aVar.get() == 0) {
                    if (aVar.compareAndSet(0, 1)) {
                        aVar.f108108a.onNext(r11);
                        boolean z11 = aVar.f108111d.decrementAndGet() == 0;
                        Cc.c<R> cVar2 = aVar.f108114g.get();
                        if (!z11 || (cVar2 != null && !cVar2.isEmpty())) {
                            if (aVar.decrementAndGet() == 0) {
                                return;
                            }
                            aVar.a();
                        }
                        Gc.c cVar3 = aVar.f108112e;
                        cVar3.getClass();
                        Throwable b11 = Gc.i.b(cVar3);
                        if (b11 != null) {
                            aVar.f108108a.onError(b11);
                            return;
                        } else {
                            aVar.f108108a.onComplete();
                            return;
                        }
                    }
                }
                loop0: while (true) {
                    AtomicReference<Cc.c<R>> atomicReference = aVar.f108114g;
                    cVar = atomicReference.get();
                    if (cVar == null) {
                        cVar = new Cc.c<>(io.reactivex.p.bufferSize());
                        while (!atomicReference.compareAndSet(null, cVar)) {
                            if (atomicReference.get() != null) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                Cc.c<R> cVar4 = cVar;
                synchronized (cVar4) {
                    cVar4.offer(r11);
                }
                aVar.f108111d.decrementAndGet();
                if (aVar.getAndIncrement() != 0) {
                    return;
                }
                aVar.a();
            }
        }

        a(io.reactivex.w<? super R> wVar, qc.o<? super T, ? extends io.reactivex.n<? extends R>> oVar, boolean z11) {
            this.f108108a = wVar;
            this.f108113f = oVar;
            this.f108109b = z11;
        }

        final void a() {
            io.reactivex.w<? super R> wVar = this.f108108a;
            AtomicInteger atomicInteger = this.f108111d;
            AtomicReference<Cc.c<R>> atomicReference = this.f108114g;
            int i11 = 1;
            while (!this.f108116i) {
                if (!this.f108109b && this.f108112e.get() != null) {
                    Gc.c cVar = this.f108112e;
                    cVar.getClass();
                    Throwable b11 = Gc.i.b(cVar);
                    Cc.c<R> cVar2 = this.f108114g.get();
                    if (cVar2 != null) {
                        cVar2.clear();
                    }
                    wVar.onError(b11);
                    return;
                }
                boolean z11 = atomicInteger.get() == 0;
                Cc.c<R> cVar3 = atomicReference.get();
                A00.a poll = cVar3 != null ? cVar3.poll() : null;
                boolean z12 = poll == null;
                if (z11 && z12) {
                    Gc.c cVar4 = this.f108112e;
                    cVar4.getClass();
                    Throwable b12 = Gc.i.b(cVar4);
                    if (b12 != null) {
                        wVar.onError(b12);
                        return;
                    } else {
                        wVar.onComplete();
                        return;
                    }
                }
                if (z12) {
                    i11 = addAndGet(-i11);
                    if (i11 == 0) {
                        return;
                    }
                } else {
                    wVar.onNext(poll);
                }
            }
            Cc.c<R> cVar5 = this.f108114g.get();
            if (cVar5 != null) {
                cVar5.clear();
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108116i = true;
            this.f108115h.dispose();
            this.f108110c.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108116i;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108111d.decrementAndGet();
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108111d.decrementAndGet();
            Gc.c cVar = this.f108112e;
            cVar.getClass();
            if (!Gc.i.a(cVar, th2)) {
                C3493a.f(th2);
                return;
            }
            if (!this.f108109b) {
                this.f108110c.dispose();
            }
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            try {
                io.reactivex.n<? extends R> apply = this.f108113f.apply(t2);
                C9656b.c(apply, "The mapper returned a null MaybeSource");
                io.reactivex.n<? extends R> nVar = apply;
                this.f108111d.getAndIncrement();
                C2338a c2338a = new C2338a();
                if (this.f108116i || !this.f108110c.a(c2338a)) {
                    return;
                }
                nVar.a(c2338a);
            } catch (Throwable th2) {
                C2645f.c(th2);
                this.f108115h.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108115h, interfaceC8487b)) {
                this.f108115h = interfaceC8487b;
                this.f108108a.onSubscribe(this);
            }
        }
    }

    public Z(io.reactivex.p pVar, qc.o oVar, boolean z11) {
        super(pVar);
        this.f108106b = oVar;
        this.f108107c = z11;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super R> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f108106b, this.f108107c));
    }
}
