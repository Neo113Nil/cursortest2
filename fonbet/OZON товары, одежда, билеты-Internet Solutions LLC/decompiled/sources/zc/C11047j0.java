package zc;

import Bl0.C2645f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import sc.C9656b;

/* renamed from: zc.j0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11047j0<T, K, V> extends AbstractC11019a<T, Hc.b<K, V>> {

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super T, ? extends K> f108295b;

    /* renamed from: c, reason: collision with root package name */
    final qc.o<? super T, ? extends V> f108296c;

    /* renamed from: d, reason: collision with root package name */
    final int f108297d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f108298e;

    /* renamed from: zc.j0$a */
    public static final class a<T, K, V> extends AtomicInteger implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: i, reason: collision with root package name */
        static final Object f108299i = new Object();

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super Hc.b<K, V>> f108300a;

        /* renamed from: b, reason: collision with root package name */
        final qc.o<? super T, ? extends K> f108301b;

        /* renamed from: c, reason: collision with root package name */
        final qc.o<? super T, ? extends V> f108302c;

        /* renamed from: d, reason: collision with root package name */
        final int f108303d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f108304e;

        /* renamed from: g, reason: collision with root package name */
        InterfaceC8487b f108306g;

        /* renamed from: h, reason: collision with root package name */
        final AtomicBoolean f108307h = new AtomicBoolean();

        /* renamed from: f, reason: collision with root package name */
        final ConcurrentHashMap f108305f = new ConcurrentHashMap();

        public a(io.reactivex.w<? super Hc.b<K, V>> wVar, qc.o<? super T, ? extends K> oVar, qc.o<? super T, ? extends V> oVar2, int i11, boolean z11) {
            this.f108300a = wVar;
            this.f108301b = oVar;
            this.f108302c = oVar2;
            this.f108303d = i11;
            this.f108304e = z11;
            lazySet(1);
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (this.f108307h.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.f108306g.dispose();
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108307h.get();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            ArrayList arrayList = new ArrayList(this.f108305f.values());
            this.f108305f.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c<T, K> cVar = ((b) it.next()).f108308b;
                cVar.f108313e = true;
                cVar.a();
            }
            this.f108300a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            ArrayList arrayList = new ArrayList(this.f108305f.values());
            this.f108305f.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c<T, K> cVar = ((b) it.next()).f108308b;
                cVar.f108314f = th2;
                cVar.f108313e = true;
                cVar.a();
            }
            this.f108300a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            try {
                Object apply = this.f108301b.apply(t2);
                Object obj = apply != null ? apply : f108299i;
                ConcurrentHashMap concurrentHashMap = this.f108305f;
                b bVar = (b) concurrentHashMap.get(obj);
                if (bVar == null) {
                    if (this.f108307h.get()) {
                        return;
                    }
                    b bVar2 = new b(apply, new c(this.f108303d, this, apply, this.f108304e));
                    concurrentHashMap.put(obj, bVar2);
                    getAndIncrement();
                    this.f108300a.onNext(bVar2);
                    bVar = bVar2;
                }
                try {
                    V apply2 = this.f108302c.apply(t2);
                    C9656b.c(apply2, "The value supplied is null");
                    c<T, K> cVar = bVar.f108308b;
                    cVar.f108310b.offer(apply2);
                    cVar.a();
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    this.f108306g.dispose();
                    onError(th2);
                }
            } catch (Throwable th3) {
                C2645f.c(th3);
                this.f108306g.dispose();
                onError(th3);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108306g, interfaceC8487b)) {
                this.f108306g = interfaceC8487b;
                this.f108300a.onSubscribe(this);
            }
        }
    }

    /* renamed from: zc.j0$b */
    static final class b<K, T> extends Hc.b<K, T> {

        /* renamed from: b, reason: collision with root package name */
        final c<T, K> f108308b;

        protected b(K k11, c<T, K> cVar) {
            super(k11);
            this.f108308b = cVar;
        }

        @Override // io.reactivex.p
        protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
            this.f108308b.subscribe(wVar);
        }
    }

    /* renamed from: zc.j0$c */
    static final class c<T, K> extends AtomicInteger implements InterfaceC8487b, io.reactivex.u<T> {

        /* renamed from: a, reason: collision with root package name */
        final K f108309a;

        /* renamed from: b, reason: collision with root package name */
        final Cc.c<T> f108310b;

        /* renamed from: c, reason: collision with root package name */
        final a<?, K, T> f108311c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f108312d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f108313e;

        /* renamed from: f, reason: collision with root package name */
        Throwable f108314f;

        /* renamed from: g, reason: collision with root package name */
        final AtomicBoolean f108315g = new AtomicBoolean();

        /* renamed from: h, reason: collision with root package name */
        final AtomicBoolean f108316h = new AtomicBoolean();

        /* renamed from: i, reason: collision with root package name */
        final AtomicReference<io.reactivex.w<? super T>> f108317i = new AtomicReference<>();

        c(int i11, a<?, K, T> aVar, K k11, boolean z11) {
            this.f108310b = new Cc.c<>(i11);
            this.f108311c = aVar;
            this.f108309a = k11;
            this.f108312d = z11;
        }

        final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Cc.c<T> cVar = this.f108310b;
            boolean z11 = this.f108312d;
            io.reactivex.w<? super T> wVar = this.f108317i.get();
            int i11 = 1;
            while (true) {
                if (wVar != null) {
                    while (true) {
                        boolean z12 = this.f108313e;
                        T poll = cVar.poll();
                        boolean z13 = poll == null;
                        boolean z14 = this.f108315g.get();
                        Cc.c<T> cVar2 = this.f108310b;
                        AtomicReference<io.reactivex.w<? super T>> atomicReference = this.f108317i;
                        if (z14) {
                            cVar2.clear();
                            a<?, K, T> aVar = this.f108311c;
                            Object obj = this.f108309a;
                            aVar.getClass();
                            if (obj == null) {
                                obj = a.f108299i;
                            }
                            aVar.f108305f.remove(obj);
                            if (aVar.decrementAndGet() == 0) {
                                aVar.f108306g.dispose();
                            }
                            atomicReference.lazySet(null);
                            return;
                        }
                        if (z12) {
                            if (!z11) {
                                Throwable th2 = this.f108314f;
                                if (th2 != null) {
                                    cVar2.clear();
                                    atomicReference.lazySet(null);
                                    wVar.onError(th2);
                                    return;
                                } else if (z13) {
                                    atomicReference.lazySet(null);
                                    wVar.onComplete();
                                    return;
                                }
                            } else if (z13) {
                                Throwable th3 = this.f108314f;
                                atomicReference.lazySet(null);
                                if (th3 != null) {
                                    wVar.onError(th3);
                                    return;
                                } else {
                                    wVar.onComplete();
                                    return;
                                }
                            }
                        }
                        if (z13) {
                            break;
                        } else {
                            wVar.onNext(poll);
                        }
                    }
                }
                i11 = addAndGet(-i11);
                if (i11 == 0) {
                    return;
                }
                if (wVar == null) {
                    wVar = this.f108317i.get();
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (this.f108315g.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.f108317i.lazySet(null);
                a<?, K, T> aVar = this.f108311c;
                aVar.getClass();
                Object obj = this.f108309a;
                if (obj == null) {
                    obj = a.f108299i;
                }
                aVar.f108305f.remove(obj);
                if (aVar.decrementAndGet() == 0) {
                    aVar.f108306g.dispose();
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108315g.get();
        }

        @Override // io.reactivex.u
        public final void subscribe(io.reactivex.w<? super T> wVar) {
            if (!this.f108316h.compareAndSet(false, true)) {
                rc.e.d(new IllegalStateException("Only one Observer allowed!"), wVar);
                return;
            }
            wVar.onSubscribe(this);
            AtomicReference<io.reactivex.w<? super T>> atomicReference = this.f108317i;
            atomicReference.lazySet(wVar);
            if (this.f108315g.get()) {
                atomicReference.lazySet(null);
            } else {
                a();
            }
        }
    }

    public C11047j0(io.reactivex.p pVar, qc.o oVar, qc.o oVar2, int i11, boolean z11) {
        super(pVar);
        this.f108295b = oVar;
        this.f108296c = oVar2;
        this.f108297d = i11;
        this.f108298e = z11;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super Hc.b<K, V>> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f108295b, this.f108296c, this.f108297d, this.f108298e));
    }
}
