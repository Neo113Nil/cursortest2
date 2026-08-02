package zc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import sc.C9656b;
import tc.InterfaceC9803e;
import tc.InterfaceC9807i;
import tc.InterfaceC9808j;

/* loaded from: classes.dex */
public final class W<T, U> extends AbstractC11019a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super T, ? extends io.reactivex.u<? extends U>> f108028b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f108029c;

    /* renamed from: d, reason: collision with root package name */
    final int f108030d;

    /* renamed from: e, reason: collision with root package name */
    final int f108031e;

    static final class a<T, U> extends AtomicReference<InterfaceC8487b> implements io.reactivex.w<U> {

        /* renamed from: a, reason: collision with root package name */
        final long f108032a;

        /* renamed from: b, reason: collision with root package name */
        final b<T, U> f108033b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f108034c;

        /* renamed from: d, reason: collision with root package name */
        volatile InterfaceC9808j<U> f108035d;

        /* renamed from: e, reason: collision with root package name */
        int f108036e;

        a(b<T, U> bVar, long j11) {
            this.f108032a = j11;
            this.f108033b = bVar;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108034c = true;
            this.f108033b.d();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            Gc.c cVar = this.f108033b.f108046h;
            cVar.getClass();
            if (!Gc.i.a(cVar, th2)) {
                C3493a.f(th2);
                return;
            }
            b<T, U> bVar = this.f108033b;
            if (!bVar.f108041c) {
                bVar.b();
            }
            this.f108034c = true;
            this.f108033b.d();
        }

        @Override // io.reactivex.w
        public final void onNext(U u11) {
            if (this.f108036e != 0) {
                this.f108033b.d();
                return;
            }
            b<T, U> bVar = this.f108033b;
            if (bVar.get() == 0 && bVar.compareAndSet(0, 1)) {
                bVar.f108039a.onNext(u11);
                if (bVar.decrementAndGet() == 0) {
                    return;
                }
            } else {
                InterfaceC9808j interfaceC9808j = this.f108035d;
                if (interfaceC9808j == null) {
                    interfaceC9808j = new Cc.c(bVar.f108043e);
                    this.f108035d = interfaceC9808j;
                }
                interfaceC9808j.offer(u11);
                if (bVar.getAndIncrement() != 0) {
                    return;
                }
            }
            bVar.e();
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.f(this, interfaceC8487b) && (interfaceC8487b instanceof InterfaceC9803e)) {
                InterfaceC9803e interfaceC9803e = (InterfaceC9803e) interfaceC8487b;
                int a11 = interfaceC9803e.a(7);
                if (a11 == 1) {
                    this.f108036e = a11;
                    this.f108035d = interfaceC9803e;
                    this.f108034c = true;
                    this.f108033b.d();
                    return;
                }
                if (a11 == 2) {
                    this.f108036e = a11;
                    this.f108035d = interfaceC9803e;
                }
            }
        }
    }

    static final class b<T, U> extends AtomicInteger implements InterfaceC8487b, io.reactivex.w<T> {

        /* renamed from: q, reason: collision with root package name */
        static final a<?, ?>[] f108037q = new a[0];

        /* renamed from: r, reason: collision with root package name */
        static final a<?, ?>[] f108038r = new a[0];

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super U> f108039a;

        /* renamed from: b, reason: collision with root package name */
        final qc.o<? super T, ? extends io.reactivex.u<? extends U>> f108040b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f108041c;

        /* renamed from: d, reason: collision with root package name */
        final int f108042d;

        /* renamed from: e, reason: collision with root package name */
        final int f108043e;

        /* renamed from: f, reason: collision with root package name */
        volatile InterfaceC9807i<U> f108044f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f108045g;

        /* renamed from: h, reason: collision with root package name */
        final Gc.c f108046h = new Gc.c();

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f108047i;

        /* renamed from: j, reason: collision with root package name */
        final AtomicReference<a<?, ?>[]> f108048j;

        /* renamed from: k, reason: collision with root package name */
        InterfaceC8487b f108049k;

        /* renamed from: l, reason: collision with root package name */
        long f108050l;

        /* renamed from: m, reason: collision with root package name */
        long f108051m;

        /* renamed from: n, reason: collision with root package name */
        int f108052n;

        /* renamed from: o, reason: collision with root package name */
        ArrayDeque f108053o;

        /* renamed from: p, reason: collision with root package name */
        int f108054p;

        b(int i11, int i12, io.reactivex.w wVar, qc.o oVar, boolean z11) {
            this.f108039a = wVar;
            this.f108040b = oVar;
            this.f108041c = z11;
            this.f108042d = i11;
            this.f108043e = i12;
            if (i11 != Integer.MAX_VALUE) {
                this.f108053o = new ArrayDeque(i11);
            }
            this.f108048j = new AtomicReference<>(f108037q);
        }

        final boolean a() {
            if (!this.f108047i) {
                Throwable th2 = this.f108046h.get();
                if (this.f108041c || th2 == null) {
                    return false;
                }
                b();
                Gc.c cVar = this.f108046h;
                cVar.getClass();
                Throwable b11 = Gc.i.b(cVar);
                if (b11 != Gc.i.f9907a) {
                    this.f108039a.onError(b11);
                }
            }
            return true;
        }

        final boolean b() {
            a<?, ?>[] andSet;
            this.f108049k.dispose();
            AtomicReference<a<?, ?>[]> atomicReference = this.f108048j;
            a<?, ?>[] aVarArr = atomicReference.get();
            a<?, ?>[] aVarArr2 = f108038r;
            if (aVarArr == aVarArr2 || (andSet = atomicReference.getAndSet(aVarArr2)) == aVarArr2) {
                return false;
            }
            for (a<?, ?> aVar : andSet) {
                aVar.getClass();
                rc.d.a(aVar);
            }
            return true;
        }

        final void d() {
            if (getAndIncrement() == 0) {
                e();
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (this.f108047i) {
                return;
            }
            this.f108047i = true;
            if (b()) {
                Gc.c cVar = this.f108046h;
                cVar.getClass();
                Throwable b11 = Gc.i.b(cVar);
                if (b11 == null || b11 == Gc.i.f9907a) {
                    return;
                }
                C3493a.f(b11);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:132:0x0004, code lost:
        
            continue;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void e() {
            int i11;
            int i12;
            io.reactivex.w<? super U> wVar = this.f108039a;
            int i13 = 1;
            while (!a()) {
                InterfaceC9807i<U> interfaceC9807i = this.f108044f;
                if (interfaceC9807i != null) {
                    while (!a()) {
                        U poll = interfaceC9807i.poll();
                        if (poll != null) {
                            wVar.onNext(poll);
                        }
                    }
                    return;
                }
                boolean z11 = this.f108045g;
                InterfaceC9807i<U> interfaceC9807i2 = this.f108044f;
                a<?, ?>[] aVarArr = this.f108048j.get();
                int length = aVarArr.length;
                int i14 = 0;
                if (this.f108042d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        i11 = this.f108053o.size();
                    }
                } else {
                    i11 = 0;
                }
                if (z11 && ((interfaceC9807i2 == null || interfaceC9807i2.isEmpty()) && length == 0 && i11 == 0)) {
                    Gc.c cVar = this.f108046h;
                    cVar.getClass();
                    Throwable b11 = Gc.i.b(cVar);
                    if (b11 != Gc.i.f9907a) {
                        if (b11 == null) {
                            wVar.onComplete();
                            return;
                        } else {
                            wVar.onError(b11);
                            return;
                        }
                    }
                    return;
                }
                if (length != 0) {
                    long j11 = this.f108051m;
                    int i15 = this.f108052n;
                    if (length <= i15 || aVarArr[i15].f108032a != j11) {
                        if (length <= i15) {
                            i15 = 0;
                        }
                        for (int i16 = 0; i16 < length && aVarArr[i15].f108032a != j11; i16++) {
                            i15++;
                            if (i15 == length) {
                                i15 = 0;
                            }
                        }
                        this.f108052n = i15;
                        this.f108051m = aVarArr[i15].f108032a;
                    }
                    int i17 = 0;
                    for (0; i12 < length; i12 + 1) {
                        if (a()) {
                            return;
                        }
                        a<T, U> aVar = aVarArr[i15];
                        InterfaceC9808j<U> interfaceC9808j = aVar.f108035d;
                        if (interfaceC9808j != null) {
                            do {
                                try {
                                    U poll2 = interfaceC9808j.poll();
                                    if (poll2 != null) {
                                        wVar.onNext(poll2);
                                    }
                                } catch (Throwable th2) {
                                    C2645f.c(th2);
                                    rc.d.a(aVar);
                                    Gc.c cVar2 = this.f108046h;
                                    cVar2.getClass();
                                    Gc.i.a(cVar2, th2);
                                    if (a()) {
                                        return;
                                    }
                                    f(aVar);
                                    i17++;
                                    i15++;
                                    if (i15 != length) {
                                    }
                                }
                            } while (!a());
                            return;
                        }
                        boolean z12 = aVar.f108034c;
                        InterfaceC9808j<U> interfaceC9808j2 = aVar.f108035d;
                        if (z12 && (interfaceC9808j2 == null || interfaceC9808j2.isEmpty())) {
                            f(aVar);
                            if (a()) {
                                return;
                            } else {
                                i17++;
                            }
                        }
                        i15++;
                        i12 = i15 != length ? i12 + 1 : 0;
                        i15 = 0;
                    }
                    this.f108052n = i15;
                    this.f108051m = aVarArr[i15].f108032a;
                    i14 = i17;
                }
                if (i14 == 0) {
                    i13 = addAndGet(-i13);
                    if (i13 == 0) {
                        return;
                    }
                } else if (this.f108042d != Integer.MAX_VALUE) {
                    while (true) {
                        int i18 = i14 - 1;
                        if (i14 != 0) {
                            synchronized (this) {
                                try {
                                    io.reactivex.u<? extends U> uVar = (io.reactivex.u) this.f108053o.poll();
                                    if (uVar == null) {
                                        this.f108054p--;
                                    } else {
                                        g(uVar);
                                    }
                                } finally {
                                }
                            }
                            i14 = i18;
                        }
                    }
                } else {
                    continue;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        final void f(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            while (true) {
                AtomicReference<a<?, ?>[]> atomicReference = this.f108048j;
                a<?, ?>[] aVarArr2 = atomicReference.get();
                int length = aVarArr2.length;
                if (length == 0) {
                    return;
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        i11 = -1;
                        break;
                    } else if (aVarArr2[i11] == aVar) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr = f108037q;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr2, 0, aVarArr3, 0, i11);
                    System.arraycopy(aVarArr2, i11 + 1, aVarArr3, i11, (length - i11) - 1);
                    aVarArr = aVarArr3;
                }
                while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                    if (atomicReference.get() != aVarArr2) {
                        break;
                    }
                }
                return;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
        
            if (decrementAndGet() == 0) goto L31;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v20 */
        /* JADX WARN: Type inference failed for: r3v5, types: [tc.j] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void g(io.reactivex.u<? extends U> uVar) {
            boolean z11;
            do {
                z11 = false;
                if (!(uVar instanceof Callable)) {
                    long j11 = this.f108050l;
                    this.f108050l = 1 + j11;
                    a<?, ?> aVar = new a<>(this, j11);
                    while (true) {
                        AtomicReference<a<?, ?>[]> atomicReference = this.f108048j;
                        a<?, ?>[] aVarArr = atomicReference.get();
                        if (aVarArr == f108038r) {
                            rc.d.a(aVar);
                            return;
                        }
                        int length = aVarArr.length;
                        a<?, ?>[] aVarArr2 = new a[length + 1];
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                        aVarArr2[length] = aVar;
                        while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                            if (atomicReference.get() != aVarArr) {
                                break;
                            }
                        }
                        uVar.subscribe(aVar);
                        return;
                    }
                }
                try {
                    Object call = ((Callable) uVar).call();
                    if (call != null) {
                        if (get() == 0 && compareAndSet(0, 1)) {
                            this.f108039a.onNext(call);
                        } else {
                            InterfaceC9807i<U> interfaceC9807i = this.f108044f;
                            ?? r32 = interfaceC9807i;
                            if (interfaceC9807i == false) {
                                InterfaceC9807i<U> cVar = this.f108042d == Integer.MAX_VALUE ? new Cc.c(this.f108043e) : new Cc.b(this.f108042d);
                                this.f108044f = cVar;
                                r32 = cVar;
                            }
                            if (!r32.offer(call)) {
                                onError(new IllegalStateException("Scalar queue full?!"));
                            } else if (getAndIncrement() != 0) {
                                return;
                            }
                        }
                        e();
                    }
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    Gc.c cVar2 = this.f108046h;
                    cVar2.getClass();
                    Gc.i.a(cVar2, th2);
                    d();
                }
                if (this.f108042d == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    try {
                        uVar = (io.reactivex.u) this.f108053o.poll();
                        if (uVar == null) {
                            this.f108054p--;
                            z11 = true;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } while (!z11);
            d();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108047i;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f108045g) {
                return;
            }
            this.f108045g = true;
            d();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f108045g) {
                C3493a.f(th2);
                return;
            }
            Gc.c cVar = this.f108046h;
            cVar.getClass();
            if (!Gc.i.a(cVar, th2)) {
                C3493a.f(th2);
            } else {
                this.f108045g = true;
                d();
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f108045g) {
                return;
            }
            try {
                io.reactivex.u<? extends U> apply = this.f108040b.apply(t2);
                C9656b.c(apply, "The mapper returned a null ObservableSource");
                io.reactivex.u<? extends U> uVar = apply;
                if (this.f108042d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i11 = this.f108054p;
                            if (i11 == this.f108042d) {
                                this.f108053o.offer(uVar);
                                return;
                            }
                            this.f108054p = i11 + 1;
                        } finally {
                        }
                    }
                }
                g(uVar);
            } catch (Throwable th2) {
                C2645f.c(th2);
                this.f108049k.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108049k, interfaceC8487b)) {
                this.f108049k = interfaceC8487b;
                this.f108039a.onSubscribe(this);
            }
        }
    }

    public W(io.reactivex.u<T> uVar, qc.o<? super T, ? extends io.reactivex.u<? extends U>> oVar, boolean z11, int i11, int i12) {
        super(uVar);
        this.f108028b = oVar;
        this.f108029c = z11;
        this.f108030d = i11;
        this.f108031e = i12;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super U> wVar) {
        io.reactivex.u<T> uVar = this.f108122a;
        if (Z0.b(uVar, wVar, this.f108028b)) {
            return;
        }
        uVar.subscribe(new b(this.f108030d, this.f108031e, wVar, this.f108028b, this.f108029c));
    }
}
