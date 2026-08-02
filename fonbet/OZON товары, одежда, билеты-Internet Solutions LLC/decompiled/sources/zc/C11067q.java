package zc;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* renamed from: zc.q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11067q<T> extends AbstractC11019a<T, T> implements io.reactivex.w<T> {

    /* renamed from: k, reason: collision with root package name */
    static final a[] f108534k = new a[0];

    /* renamed from: l, reason: collision with root package name */
    static final a[] f108535l = new a[0];

    /* renamed from: b, reason: collision with root package name */
    final AtomicBoolean f108536b;

    /* renamed from: c, reason: collision with root package name */
    final int f108537c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference<a<T>[]> f108538d;

    /* renamed from: e, reason: collision with root package name */
    volatile long f108539e;

    /* renamed from: f, reason: collision with root package name */
    final b<T> f108540f;

    /* renamed from: g, reason: collision with root package name */
    b<T> f108541g;

    /* renamed from: h, reason: collision with root package name */
    int f108542h;

    /* renamed from: i, reason: collision with root package name */
    Throwable f108543i;

    /* renamed from: j, reason: collision with root package name */
    volatile boolean f108544j;

    /* renamed from: zc.q$a */
    static final class a<T> extends AtomicInteger implements InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108545a;

        /* renamed from: b, reason: collision with root package name */
        final C11067q<T> f108546b;

        /* renamed from: c, reason: collision with root package name */
        b<T> f108547c;

        /* renamed from: d, reason: collision with root package name */
        int f108548d;

        /* renamed from: e, reason: collision with root package name */
        long f108549e;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f108550f;

        a(io.reactivex.w<? super T> wVar, C11067q<T> c11067q) {
            this.f108545a = wVar;
            this.f108546b = c11067q;
            this.f108547c = c11067q.f108540f;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            a<T>[] aVarArr;
            if (this.f108550f) {
                return;
            }
            this.f108550f = true;
            C11067q<T> c11067q = this.f108546b;
            while (true) {
                AtomicReference<a<T>[]> atomicReference = c11067q.f108538d;
                a<T>[] aVarArr2 = atomicReference.get();
                int length = aVarArr2.length;
                if (length == 0) {
                    return;
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        i11 = -1;
                        break;
                    } else if (aVarArr2[i11] == this) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr = C11067q.f108534k;
                } else {
                    a<T>[] aVarArr3 = new a[length - 1];
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

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108550f;
        }
    }

    /* renamed from: zc.q$b */
    static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        final T[] f108551a;

        /* renamed from: b, reason: collision with root package name */
        volatile b<T> f108552b;

        b(int i11) {
            this.f108551a = (T[]) new Object[i11];
        }
    }

    public C11067q(io.reactivex.p<T> pVar, int i11) {
        super(pVar);
        this.f108537c = i11;
        this.f108536b = new AtomicBoolean();
        b<T> bVar = new b<>(i11);
        this.f108540f = bVar;
        this.f108541g = bVar;
        this.f108538d = new AtomicReference<>(f108534k);
    }

    final void c(a<T> aVar) {
        if (aVar.getAndIncrement() != 0) {
            return;
        }
        long j11 = aVar.f108549e;
        int i11 = aVar.f108548d;
        b<T> bVar = aVar.f108547c;
        io.reactivex.w<? super T> wVar = aVar.f108545a;
        int i12 = this.f108537c;
        int i13 = 1;
        while (!aVar.f108550f) {
            boolean z11 = this.f108544j;
            boolean z12 = this.f108539e == j11;
            if (z11 && z12) {
                aVar.f108547c = null;
                Throwable th2 = this.f108543i;
                if (th2 != null) {
                    wVar.onError(th2);
                    return;
                } else {
                    wVar.onComplete();
                    return;
                }
            }
            if (z12) {
                aVar.f108549e = j11;
                aVar.f108548d = i11;
                aVar.f108547c = bVar;
                i13 = aVar.addAndGet(-i13);
                if (i13 == 0) {
                    return;
                }
            } else {
                if (i11 == i12) {
                    bVar = bVar.f108552b;
                    i11 = 0;
                }
                wVar.onNext(bVar.f108551a[i11]);
                i11++;
                j11++;
            }
        }
        aVar.f108547c = null;
    }

    @Override // io.reactivex.w
    public final void onComplete() {
        this.f108544j = true;
        for (a<T> aVar : this.f108538d.getAndSet(f108535l)) {
            c(aVar);
        }
    }

    @Override // io.reactivex.w
    public final void onError(Throwable th2) {
        this.f108543i = th2;
        this.f108544j = true;
        for (a<T> aVar : this.f108538d.getAndSet(f108535l)) {
            c(aVar);
        }
    }

    @Override // io.reactivex.w
    public final void onNext(T t2) {
        int i11 = this.f108542h;
        if (i11 == this.f108537c) {
            b<T> bVar = new b<>(i11);
            bVar.f108551a[0] = t2;
            this.f108542h = 1;
            this.f108541g.f108552b = bVar;
            this.f108541g = bVar;
        } else {
            this.f108541g.f108551a[i11] = t2;
            this.f108542h = i11 + 1;
        }
        this.f108539e++;
        for (a<T> aVar : this.f108538d.get()) {
            c(aVar);
        }
    }

    @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        a<T> aVar = new a<>(wVar, this);
        wVar.onSubscribe(aVar);
        loop0: while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f108538d;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr != f108535l) {
                int length = aVarArr.length;
                a<T>[] aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
                while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                    if (atomicReference.get() != aVarArr) {
                        break;
                    }
                }
                break loop0;
            }
            break;
        }
        AtomicBoolean atomicBoolean = this.f108536b;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            c(aVar);
        } else {
            this.f108122a.subscribe(this);
        }
    }
}
