package zc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import sc.C9656b;
import tc.InterfaceC9803e;
import tc.InterfaceC9808j;

/* renamed from: zc.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11063o1<T, R> extends AbstractC11019a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super T, ? extends io.reactivex.u<? extends R>> f108468b;

    /* renamed from: c, reason: collision with root package name */
    final int f108469c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f108470d;

    /* renamed from: zc.o1$a */
    static final class a<T, R> extends AtomicReference<InterfaceC8487b> implements io.reactivex.w<R> {

        /* renamed from: a, reason: collision with root package name */
        final b<T, R> f108471a;

        /* renamed from: b, reason: collision with root package name */
        final long f108472b;

        /* renamed from: c, reason: collision with root package name */
        final int f108473c;

        /* renamed from: d, reason: collision with root package name */
        volatile InterfaceC9808j<R> f108474d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f108475e;

        a(b<T, R> bVar, long j11, int i11) {
            this.f108471a = bVar;
            this.f108472b = j11;
            this.f108473c = i11;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f108472b == this.f108471a.f108486j) {
                this.f108475e = true;
                this.f108471a.b();
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            b<T, R> bVar = this.f108471a;
            bVar.getClass();
            if (this.f108472b == bVar.f108486j) {
                Gc.c cVar = bVar.f108481e;
                cVar.getClass();
                if (Gc.i.a(cVar, th2)) {
                    if (!bVar.f108480d) {
                        bVar.f108484h.dispose();
                    }
                    this.f108475e = true;
                    bVar.b();
                    return;
                }
            }
            C3493a.f(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(R r11) {
            if (this.f108472b == this.f108471a.f108486j) {
                if (r11 != null) {
                    this.f108474d.offer(r11);
                }
                this.f108471a.b();
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.f(this, interfaceC8487b)) {
                if (interfaceC8487b instanceof InterfaceC9803e) {
                    InterfaceC9803e interfaceC9803e = (InterfaceC9803e) interfaceC8487b;
                    int a11 = interfaceC9803e.a(7);
                    if (a11 == 1) {
                        this.f108474d = interfaceC9803e;
                        this.f108475e = true;
                        this.f108471a.b();
                        return;
                    } else if (a11 == 2) {
                        this.f108474d = interfaceC9803e;
                        return;
                    }
                }
                this.f108474d = new Cc.c(this.f108473c);
            }
        }
    }

    /* renamed from: zc.o1$b */
    static final class b<T, R> extends AtomicInteger implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: k, reason: collision with root package name */
        static final a<Object, Object> f108476k;

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super R> f108477a;

        /* renamed from: b, reason: collision with root package name */
        final qc.o<? super T, ? extends io.reactivex.u<? extends R>> f108478b;

        /* renamed from: c, reason: collision with root package name */
        final int f108479c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f108480d;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f108482f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f108483g;

        /* renamed from: h, reason: collision with root package name */
        InterfaceC8487b f108484h;

        /* renamed from: j, reason: collision with root package name */
        volatile long f108486j;

        /* renamed from: i, reason: collision with root package name */
        final AtomicReference<a<T, R>> f108485i = new AtomicReference<>();

        /* renamed from: e, reason: collision with root package name */
        final Gc.c f108481e = new Gc.c();

        static {
            a<Object, Object> aVar = new a<>(null, -1L, 1);
            f108476k = aVar;
            rc.d.a(aVar);
        }

        b(io.reactivex.w<? super R> wVar, qc.o<? super T, ? extends io.reactivex.u<? extends R>> oVar, int i11, boolean z11) {
            this.f108477a = wVar;
            this.f108478b = oVar;
            this.f108479c = i11;
            this.f108480d = z11;
        }

        final void a() {
            a<Object, Object> aVar;
            AtomicReference<a<T, R>> atomicReference = this.f108485i;
            a<Object, Object> aVar2 = (a) atomicReference.get();
            a<Object, Object> aVar3 = f108476k;
            if (aVar2 == aVar3 || (aVar = (a) atomicReference.getAndSet(aVar3)) == aVar3 || aVar == null) {
                return;
            }
            rc.d.a(aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:79:0x0125 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0010 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void b() {
            InterfaceC9808j<R> interfaceC9808j;
            A00.a aVar;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.w<? super R> wVar = this.f108477a;
            AtomicReference<a<T, R>> atomicReference = this.f108485i;
            boolean z11 = this.f108480d;
            int i11 = 1;
            while (!this.f108483g) {
                if (this.f108482f) {
                    boolean z12 = atomicReference.get() == null;
                    if (z11) {
                        if (z12) {
                            Throwable th2 = this.f108481e.get();
                            if (th2 != null) {
                                wVar.onError(th2);
                                return;
                            } else {
                                wVar.onComplete();
                                return;
                            }
                        }
                    } else if (this.f108481e.get() != null) {
                        Gc.c cVar = this.f108481e;
                        cVar.getClass();
                        wVar.onError(Gc.i.b(cVar));
                        return;
                    } else if (z12) {
                        wVar.onComplete();
                        return;
                    }
                }
                a<T, R> aVar2 = atomicReference.get();
                if (aVar2 != null && (interfaceC9808j = aVar2.f108474d) != null) {
                    if (aVar2.f108475e) {
                        boolean isEmpty = interfaceC9808j.isEmpty();
                        if (z11) {
                            if (isEmpty) {
                                while (!atomicReference.compareAndSet(aVar2, null) && atomicReference.get() == aVar2) {
                                }
                            }
                        } else if (this.f108481e.get() != null) {
                            Gc.c cVar2 = this.f108481e;
                            cVar2.getClass();
                            wVar.onError(Gc.i.b(cVar2));
                            return;
                        } else if (isEmpty) {
                            while (!atomicReference.compareAndSet(aVar2, null) && atomicReference.get() == aVar2) {
                            }
                        }
                    }
                    boolean z13 = false;
                    while (!this.f108483g) {
                        if (aVar2 == atomicReference.get()) {
                            if (!z11 && this.f108481e.get() != null) {
                                Gc.c cVar3 = this.f108481e;
                                cVar3.getClass();
                                wVar.onError(Gc.i.b(cVar3));
                                return;
                            }
                            boolean z14 = aVar2.f108475e;
                            try {
                                aVar = interfaceC9808j.poll();
                            } catch (Throwable th3) {
                                C2645f.c(th3);
                                Gc.c cVar4 = this.f108481e;
                                cVar4.getClass();
                                Gc.i.a(cVar4, th3);
                                while (!atomicReference.compareAndSet(aVar2, null) && atomicReference.get() == aVar2) {
                                }
                                if (z11) {
                                    rc.d.a(aVar2);
                                } else {
                                    a();
                                    this.f108484h.dispose();
                                    this.f108482f = true;
                                }
                                z13 = true;
                                aVar = null;
                            }
                            boolean z15 = aVar == null;
                            if (z14 && z15) {
                                while (!atomicReference.compareAndSet(aVar2, null) && atomicReference.get() == aVar2) {
                                }
                            } else if (!z15) {
                                wVar.onNext(aVar);
                            } else if (!z13) {
                                continue;
                            }
                        }
                        z13 = true;
                        if (!z13) {
                        }
                    }
                    return;
                }
                i11 = addAndGet(-i11);
                if (i11 == 0) {
                    return;
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (this.f108483g) {
                return;
            }
            this.f108483g = true;
            this.f108484h.dispose();
            a();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108483g;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f108482f) {
                return;
            }
            this.f108482f = true;
            b();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (!this.f108482f) {
                Gc.c cVar = this.f108481e;
                cVar.getClass();
                if (Gc.i.a(cVar, th2)) {
                    if (!this.f108480d) {
                        a();
                    }
                    this.f108482f = true;
                    b();
                    return;
                }
            }
            C3493a.f(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            long j11 = this.f108486j + 1;
            this.f108486j = j11;
            a<T, R> aVar = this.f108485i.get();
            if (aVar != null) {
                rc.d.a(aVar);
            }
            try {
                io.reactivex.u<? extends R> apply = this.f108478b.apply(t2);
                C9656b.c(apply, "The ObservableSource returned is null");
                io.reactivex.u<? extends R> uVar = apply;
                a<T, R> aVar2 = new a<>(this, j11, this.f108479c);
                while (true) {
                    a<T, R> aVar3 = this.f108485i.get();
                    if (aVar3 == f108476k) {
                        return;
                    }
                    AtomicReference<a<T, R>> atomicReference = this.f108485i;
                    while (!atomicReference.compareAndSet(aVar3, aVar2)) {
                        if (atomicReference.get() != aVar3) {
                            break;
                        }
                    }
                    uVar.subscribe(aVar2);
                    return;
                }
            } catch (Throwable th2) {
                C2645f.c(th2);
                this.f108484h.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108484h, interfaceC8487b)) {
                this.f108484h = interfaceC8487b;
                this.f108477a.onSubscribe(this);
            }
        }
    }

    public C11063o1(io.reactivex.u<T> uVar, qc.o<? super T, ? extends io.reactivex.u<? extends R>> oVar, int i11, boolean z11) {
        super(uVar);
        this.f108468b = oVar;
        this.f108469c = i11;
        this.f108470d = z11;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super R> wVar) {
        io.reactivex.u<T> uVar = this.f108122a;
        qc.o<? super T, ? extends io.reactivex.u<? extends R>> oVar = this.f108468b;
        if (Z0.b(uVar, wVar, oVar)) {
            return;
        }
        uVar.subscribe(new b(wVar, oVar, this.f108469c, this.f108470d));
    }
}
