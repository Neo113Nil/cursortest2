package zc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.C8486a;
import nc.InterfaceC8487b;
import sc.C9656b;

/* renamed from: zc.m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11055m<T, U extends Collection<? super T>, Open, Close> extends AbstractC11019a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final Callable<U> f108392b;

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.u<? extends Open> f108393c;

    /* renamed from: d, reason: collision with root package name */
    final qc.o<? super Open, ? extends io.reactivex.u<? extends Close>> f108394d;

    /* renamed from: zc.m$a */
    static final class a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super C> f108395a;

        /* renamed from: b, reason: collision with root package name */
        final Callable<C> f108396b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.u<? extends Open> f108397c;

        /* renamed from: d, reason: collision with root package name */
        final qc.o<? super Open, ? extends io.reactivex.u<? extends Close>> f108398d;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f108402h;

        /* renamed from: j, reason: collision with root package name */
        volatile boolean f108404j;

        /* renamed from: k, reason: collision with root package name */
        long f108405k;

        /* renamed from: i, reason: collision with root package name */
        final Cc.c<C> f108403i = new Cc.c<>(io.reactivex.p.bufferSize());

        /* renamed from: e, reason: collision with root package name */
        final C8486a f108399e = new C8486a();

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f108400f = new AtomicReference<>();

        /* renamed from: l, reason: collision with root package name */
        LinkedHashMap f108406l = new LinkedHashMap();

        /* renamed from: g, reason: collision with root package name */
        final Gc.c f108401g = new Gc.c();

        /* renamed from: zc.m$a$a, reason: collision with other inner class name */
        static final class C2341a<Open> extends AtomicReference<InterfaceC8487b> implements io.reactivex.w<Open>, InterfaceC8487b {

            /* renamed from: a, reason: collision with root package name */
            final a<?, ?, Open, ?> f108407a;

            C2341a(a<?, ?, Open, ?> aVar) {
                this.f108407a = aVar;
            }

            @Override // nc.InterfaceC8487b
            public final void dispose() {
                rc.d.a(this);
            }

            @Override // nc.InterfaceC8487b
            public final boolean isDisposed() {
                return get() == rc.d.DISPOSED;
            }

            @Override // io.reactivex.w
            public final void onComplete() {
                lazySet(rc.d.DISPOSED);
                a<?, ?, Open, ?> aVar = this.f108407a;
                aVar.f108399e.b(this);
                if (aVar.f108399e.f() == 0) {
                    rc.d.a(aVar.f108400f);
                    aVar.f108402h = true;
                    aVar.b();
                }
            }

            @Override // io.reactivex.w
            public final void onError(Throwable th2) {
                lazySet(rc.d.DISPOSED);
                a<?, ?, Open, ?> aVar = this.f108407a;
                rc.d.a(aVar.f108400f);
                aVar.f108399e.b(this);
                aVar.onError(th2);
            }

            @Override // io.reactivex.w
            public final void onNext(Open open) {
                a<?, ?, Open, ?> aVar = this.f108407a;
                aVar.getClass();
                try {
                    Object call = aVar.f108396b.call();
                    C9656b.c(call, "The bufferSupplier returned a null Collection");
                    Collection collection = (Collection) call;
                    io.reactivex.u<? extends Object> apply = aVar.f108398d.apply(open);
                    C9656b.c(apply, "The bufferClose returned a null ObservableSource");
                    io.reactivex.u<? extends Object> uVar = apply;
                    long j11 = aVar.f108405k;
                    aVar.f108405k = 1 + j11;
                    synchronized (aVar) {
                        try {
                            LinkedHashMap linkedHashMap = aVar.f108406l;
                            if (linkedHashMap == null) {
                                return;
                            }
                            linkedHashMap.put(Long.valueOf(j11), collection);
                            b bVar = new b(aVar, j11);
                            aVar.f108399e.a(bVar);
                            uVar.subscribe(bVar);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    C2645f.c(th3);
                    rc.d.a(aVar.f108400f);
                    aVar.onError(th3);
                }
            }

            @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
            public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
                rc.d.f(this, interfaceC8487b);
            }
        }

        a(io.reactivex.w<? super C> wVar, io.reactivex.u<? extends Open> uVar, qc.o<? super Open, ? extends io.reactivex.u<? extends Close>> oVar, Callable<C> callable) {
            this.f108395a = wVar;
            this.f108396b = callable;
            this.f108397c = uVar;
            this.f108398d = oVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        final void a(b<T, C> bVar, long j11) {
            boolean z11;
            this.f108399e.b(bVar);
            if (this.f108399e.f() == 0) {
                rc.d.a(this.f108400f);
                z11 = true;
            } else {
                z11 = false;
            }
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.f108406l;
                    if (linkedHashMap == null) {
                        return;
                    }
                    this.f108403i.offer(linkedHashMap.remove(Long.valueOf(j11)));
                    if (z11) {
                        this.f108402h = true;
                    }
                    b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.w<? super C> wVar = this.f108395a;
            Cc.c<C> cVar = this.f108403i;
            int i11 = 1;
            while (!this.f108404j) {
                boolean z11 = this.f108402h;
                if (z11 && this.f108401g.get() != null) {
                    cVar.clear();
                    Gc.c cVar2 = this.f108401g;
                    cVar2.getClass();
                    wVar.onError(Gc.i.b(cVar2));
                    return;
                }
                C poll = cVar.poll();
                boolean z12 = poll == null;
                if (z11 && z12) {
                    wVar.onComplete();
                    return;
                } else if (z12) {
                    i11 = addAndGet(-i11);
                    if (i11 == 0) {
                        return;
                    }
                } else {
                    wVar.onNext(poll);
                }
            }
            cVar.clear();
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (rc.d.a(this.f108400f)) {
                this.f108404j = true;
                this.f108399e.dispose();
                synchronized (this) {
                    this.f108406l = null;
                }
                if (getAndIncrement() != 0) {
                    this.f108403i.clear();
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(this.f108400f.get());
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108399e.dispose();
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.f108406l;
                    if (linkedHashMap == null) {
                        return;
                    }
                    Iterator it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                        this.f108403i.offer((Collection) it.next());
                    }
                    this.f108406l = null;
                    this.f108402h = true;
                    b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            Gc.c cVar = this.f108401g;
            cVar.getClass();
            if (!Gc.i.a(cVar, th2)) {
                C3493a.f(th2);
                return;
            }
            this.f108399e.dispose();
            synchronized (this) {
                this.f108406l = null;
            }
            this.f108402h = true;
            b();
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.f108406l;
                    if (linkedHashMap == null) {
                        return;
                    }
                    Iterator it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).add(t2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.f(this.f108400f, interfaceC8487b)) {
                C2341a c2341a = new C2341a(this);
                this.f108399e.a(c2341a);
                this.f108397c.subscribe(c2341a);
            }
        }
    }

    /* renamed from: zc.m$b */
    static final class b<T, C extends Collection<? super T>> extends AtomicReference<InterfaceC8487b> implements io.reactivex.w<Object>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final a<T, C, ?, ?> f108408a;

        /* renamed from: b, reason: collision with root package name */
        final long f108409b;

        b(a<T, C, ?, ?> aVar, long j11) {
            this.f108408a = aVar;
            this.f108409b = j11;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return get() == rc.d.DISPOSED;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            InterfaceC8487b interfaceC8487b = get();
            rc.d dVar = rc.d.DISPOSED;
            if (interfaceC8487b != dVar) {
                lazySet(dVar);
                this.f108408a.a(this, this.f108409b);
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            InterfaceC8487b interfaceC8487b = get();
            rc.d dVar = rc.d.DISPOSED;
            if (interfaceC8487b == dVar) {
                C3493a.f(th2);
                return;
            }
            lazySet(dVar);
            a<T, C, ?, ?> aVar = this.f108408a;
            rc.d.a(aVar.f108400f);
            aVar.f108399e.b(this);
            aVar.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(Object obj) {
            InterfaceC8487b interfaceC8487b = get();
            rc.d dVar = rc.d.DISPOSED;
            if (interfaceC8487b != dVar) {
                lazySet(dVar);
                interfaceC8487b.dispose();
                this.f108408a.a(this, this.f108409b);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this, interfaceC8487b);
        }
    }

    public C11055m(io.reactivex.p pVar, io.reactivex.u uVar, qc.o oVar, Callable callable) {
        super(pVar);
        this.f108393c = uVar;
        this.f108394d = oVar;
        this.f108392b = callable;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super U> wVar) {
        a aVar = new a(wVar, this.f108393c, this.f108394d, this.f108392b);
        wVar.onSubscribe(aVar);
        this.f108122a.subscribe(aVar);
    }
}
