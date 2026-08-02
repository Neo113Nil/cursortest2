package zc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import sc.C9656b;

/* renamed from: zc.t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11072t<T, R> extends io.reactivex.p<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.u<? extends T>[] f108619a;

    /* renamed from: b, reason: collision with root package name */
    final Iterable<? extends io.reactivex.u<? extends T>> f108620b;

    /* renamed from: c, reason: collision with root package name */
    final qc.o<? super Object[], ? extends R> f108621c;

    /* renamed from: d, reason: collision with root package name */
    final int f108622d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f108623e;

    /* renamed from: zc.t$a */
    static final class a<T, R> extends AtomicReference<InterfaceC8487b> implements io.reactivex.w<T> {

        /* renamed from: a, reason: collision with root package name */
        final b<T, R> f108624a;

        /* renamed from: b, reason: collision with root package name */
        final int f108625b;

        a(b<T, R> bVar, int i11) {
            this.f108624a = bVar;
            this.f108625b = i11;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
        
            if (r4 == r2.length) goto L17;
         */
        @Override // io.reactivex.w
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onComplete() {
            b<T, R> bVar = this.f108624a;
            int i11 = this.f108625b;
            synchronized (bVar) {
                try {
                    Object[] objArr = bVar.f108629d;
                    if (objArr == null) {
                        return;
                    }
                    boolean z11 = objArr[i11] == null;
                    if (!z11) {
                        int i12 = bVar.f108636k + 1;
                        bVar.f108636k = i12;
                    }
                    bVar.f108633h = true;
                    if (z11) {
                        bVar.a();
                    }
                    bVar.d();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        
            if (r3 == r5.length) goto L20;
         */
        @Override // io.reactivex.w
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onError(Throwable th2) {
            b<T, R> bVar = this.f108624a;
            int i11 = this.f108625b;
            Gc.c cVar = bVar.f108634i;
            cVar.getClass();
            if (!Gc.i.a(cVar, th2)) {
                C3493a.f(th2);
                return;
            }
            boolean z11 = true;
            if (bVar.f108631f) {
                synchronized (bVar) {
                    try {
                        Object[] objArr = bVar.f108629d;
                        if (objArr == null) {
                            return;
                        }
                        boolean z12 = objArr[i11] == null;
                        if (!z12) {
                            int i12 = bVar.f108636k + 1;
                            bVar.f108636k = i12;
                        }
                        bVar.f108633h = true;
                        z11 = z12;
                    } finally {
                    }
                }
            }
            if (z11) {
                bVar.a();
            }
            bVar.d();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.w
        public final void onNext(T t2) {
            boolean z11;
            b<T, R> bVar = this.f108624a;
            int i11 = this.f108625b;
            synchronized (bVar) {
                try {
                    Object[] objArr = bVar.f108629d;
                    if (objArr == null) {
                        return;
                    }
                    Object obj = objArr[i11];
                    int i12 = bVar.f108635j;
                    if (obj == null) {
                        i12++;
                        bVar.f108635j = i12;
                    }
                    objArr[i11] = t2;
                    if (i12 == objArr.length) {
                        bVar.f108630e.offer(objArr.clone());
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        bVar.d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this, interfaceC8487b);
        }
    }

    /* renamed from: zc.t$b */
    static final class b<T, R> extends AtomicInteger implements InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super R> f108626a;

        /* renamed from: b, reason: collision with root package name */
        final qc.o<? super Object[], ? extends R> f108627b;

        /* renamed from: c, reason: collision with root package name */
        final a<T, R>[] f108628c;

        /* renamed from: d, reason: collision with root package name */
        Object[] f108629d;

        /* renamed from: e, reason: collision with root package name */
        final Cc.c<Object[]> f108630e;

        /* renamed from: f, reason: collision with root package name */
        final boolean f108631f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f108632g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f108633h;

        /* renamed from: i, reason: collision with root package name */
        final Gc.c f108634i = new Gc.c();

        /* renamed from: j, reason: collision with root package name */
        int f108635j;

        /* renamed from: k, reason: collision with root package name */
        int f108636k;

        b(int i11, int i12, io.reactivex.w wVar, qc.o oVar, boolean z11) {
            this.f108626a = wVar;
            this.f108627b = oVar;
            this.f108631f = z11;
            this.f108629d = new Object[i11];
            a<T, R>[] aVarArr = new a[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                aVarArr[i13] = new a<>(this, i13);
            }
            this.f108628c = aVarArr;
            this.f108630e = new Cc.c<>(i12);
        }

        final void a() {
            for (a<T, R> aVar : this.f108628c) {
                aVar.getClass();
                rc.d.a(aVar);
            }
        }

        final void b(Cc.c<?> cVar) {
            synchronized (this) {
                this.f108629d = null;
            }
            cVar.clear();
        }

        final void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            Cc.c<Object[]> cVar = this.f108630e;
            io.reactivex.w<? super R> wVar = this.f108626a;
            boolean z11 = this.f108631f;
            int i11 = 1;
            while (!this.f108632g) {
                if (!z11 && this.f108634i.get() != null) {
                    a();
                    b(cVar);
                    Gc.c cVar2 = this.f108634i;
                    cVar2.getClass();
                    wVar.onError(Gc.i.b(cVar2));
                    return;
                }
                boolean z12 = this.f108633h;
                Object[] poll = cVar.poll();
                boolean z13 = poll == null;
                if (z12 && z13) {
                    b(cVar);
                    Gc.c cVar3 = this.f108634i;
                    cVar3.getClass();
                    Throwable b11 = Gc.i.b(cVar3);
                    if (b11 == null) {
                        wVar.onComplete();
                        return;
                    } else {
                        wVar.onError(b11);
                        return;
                    }
                }
                if (z13) {
                    i11 = addAndGet(-i11);
                    if (i11 == 0) {
                        return;
                    }
                } else {
                    try {
                        R apply = this.f108627b.apply(poll);
                        C9656b.c(apply, "The combiner returned a null value");
                        wVar.onNext(apply);
                    } catch (Throwable th2) {
                        C2645f.c(th2);
                        Gc.c cVar4 = this.f108634i;
                        cVar4.getClass();
                        Gc.i.a(cVar4, th2);
                        a();
                        b(cVar);
                        Gc.c cVar5 = this.f108634i;
                        cVar5.getClass();
                        wVar.onError(Gc.i.b(cVar5));
                        return;
                    }
                }
            }
            b(cVar);
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (this.f108632g) {
                return;
            }
            this.f108632g = true;
            a();
            if (getAndIncrement() == 0) {
                b(this.f108630e);
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108632g;
        }
    }

    public C11072t(io.reactivex.u<? extends T>[] uVarArr, Iterable<? extends io.reactivex.u<? extends T>> iterable, qc.o<? super Object[], ? extends R> oVar, int i11, boolean z11) {
        this.f108619a = uVarArr;
        this.f108620b = iterable;
        this.f108621c = oVar;
        this.f108622d = i11;
        this.f108623e = z11;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super R> wVar) {
        int length;
        io.reactivex.u<? extends T>[] uVarArr = this.f108619a;
        if (uVarArr == null) {
            uVarArr = new io.reactivex.p[8];
            length = 0;
            for (io.reactivex.u<? extends T> uVar : this.f108620b) {
                if (length == uVarArr.length) {
                    io.reactivex.u<? extends T>[] uVarArr2 = new io.reactivex.u[(length >> 2) + length];
                    System.arraycopy(uVarArr, 0, uVarArr2, 0, length);
                    uVarArr = uVarArr2;
                }
                uVarArr[length] = uVar;
                length++;
            }
        } else {
            length = uVarArr.length;
        }
        if (length == 0) {
            rc.e.b(wVar);
            return;
        }
        b bVar = new b(length, this.f108622d, wVar, this.f108621c, this.f108623e);
        a<T, R>[] aVarArr = bVar.f108628c;
        int length2 = aVarArr.length;
        bVar.f108626a.onSubscribe(bVar);
        for (int i11 = 0; i11 < length2 && !bVar.f108633h && !bVar.f108632g; i11++) {
            uVarArr[i11].subscribe(aVarArr[i11]);
        }
    }
}
