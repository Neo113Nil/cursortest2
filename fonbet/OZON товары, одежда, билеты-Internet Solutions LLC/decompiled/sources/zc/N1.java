package zc;

import Bl0.C2645f;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class N1<T, R> extends io.reactivex.p<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.u<? extends T>[] f107887a;

    /* renamed from: b, reason: collision with root package name */
    final Iterable<? extends io.reactivex.u<? extends T>> f107888b;

    /* renamed from: c, reason: collision with root package name */
    final qc.o<? super Object[], ? extends R> f107889c;

    /* renamed from: d, reason: collision with root package name */
    final int f107890d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f107891e;

    static final class a<T, R> extends AtomicInteger implements InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super R> f107892a;

        /* renamed from: b, reason: collision with root package name */
        final qc.o<? super Object[], ? extends R> f107893b;

        /* renamed from: c, reason: collision with root package name */
        final b<T, R>[] f107894c;

        /* renamed from: d, reason: collision with root package name */
        final T[] f107895d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f107896e;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f107897f;

        a(io.reactivex.w<? super R> wVar, qc.o<? super Object[], ? extends R> oVar, int i11, boolean z11) {
            this.f107892a = wVar;
            this.f107893b = oVar;
            this.f107894c = new b[i11];
            this.f107895d = (T[]) new Object[i11];
            this.f107896e = z11;
        }

        final void a() {
            b<T, R>[] bVarArr = this.f107894c;
            for (b<T, R> bVar : bVarArr) {
                bVar.f107899b.clear();
            }
            for (b<T, R> bVar2 : bVarArr) {
                rc.d.a(bVar2.f107902e);
            }
        }

        public final void b() {
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            b<T, R>[] bVarArr = this.f107894c;
            io.reactivex.w<? super R> wVar = this.f107892a;
            T[] tArr = this.f107895d;
            boolean z11 = this.f107896e;
            int i11 = 1;
            while (true) {
                int i12 = 0;
                int i13 = 0;
                for (b<T, R> bVar : bVarArr) {
                    if (tArr[i13] == null) {
                        boolean z12 = bVar.f107900c;
                        T poll = bVar.f107899b.poll();
                        boolean z13 = poll == null;
                        if (this.f107897f) {
                            a();
                            return;
                        }
                        if (z12) {
                            if (!z11) {
                                Throwable th3 = bVar.f107901d;
                                if (th3 != null) {
                                    this.f107897f = true;
                                    a();
                                    wVar.onError(th3);
                                    return;
                                } else if (z13) {
                                    this.f107897f = true;
                                    a();
                                    wVar.onComplete();
                                    return;
                                }
                            } else if (z13) {
                                Throwable th4 = bVar.f107901d;
                                this.f107897f = true;
                                a();
                                if (th4 != null) {
                                    wVar.onError(th4);
                                    return;
                                } else {
                                    wVar.onComplete();
                                    return;
                                }
                            }
                        }
                        if (z13) {
                            i12++;
                        } else {
                            tArr[i13] = poll;
                        }
                    } else if (bVar.f107900c && !z11 && (th2 = bVar.f107901d) != null) {
                        this.f107897f = true;
                        a();
                        wVar.onError(th2);
                        return;
                    }
                    i13++;
                }
                if (i12 != 0) {
                    i11 = addAndGet(-i11);
                    if (i11 == 0) {
                        return;
                    }
                } else {
                    try {
                        R apply = this.f107893b.apply(tArr.clone());
                        C9656b.c(apply, "The zipper returned a null value");
                        wVar.onNext(apply);
                        Arrays.fill(tArr, (Object) null);
                    } catch (Throwable th5) {
                        C2645f.c(th5);
                        a();
                        wVar.onError(th5);
                        return;
                    }
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (this.f107897f) {
                return;
            }
            this.f107897f = true;
            for (b<T, R> bVar : this.f107894c) {
                rc.d.a(bVar.f107902e);
            }
            if (getAndIncrement() == 0) {
                for (b<T, R> bVar2 : this.f107894c) {
                    bVar2.f107899b.clear();
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107897f;
        }
    }

    static final class b<T, R> implements io.reactivex.w<T> {

        /* renamed from: a, reason: collision with root package name */
        final a<T, R> f107898a;

        /* renamed from: b, reason: collision with root package name */
        final Cc.c<T> f107899b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f107900c;

        /* renamed from: d, reason: collision with root package name */
        Throwable f107901d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f107902e = new AtomicReference<>();

        b(a<T, R> aVar, int i11) {
            this.f107898a = aVar;
            this.f107899b = new Cc.c<>(i11);
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f107900c = true;
            this.f107898a.b();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f107901d = th2;
            this.f107900c = true;
            this.f107898a.b();
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f107899b.offer(t2);
            this.f107898a.b();
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this.f107902e, interfaceC8487b);
        }
    }

    public N1(io.reactivex.u<? extends T>[] uVarArr, Iterable<? extends io.reactivex.u<? extends T>> iterable, qc.o<? super Object[], ? extends R> oVar, int i11, boolean z11) {
        this.f107887a = uVarArr;
        this.f107888b = iterable;
        this.f107889c = oVar;
        this.f107890d = i11;
        this.f107891e = z11;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super R> wVar) {
        int length;
        io.reactivex.u<? extends T>[] uVarArr = this.f107887a;
        if (uVarArr == null) {
            uVarArr = new io.reactivex.p[8];
            length = 0;
            for (io.reactivex.u<? extends T> uVar : this.f107888b) {
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
        a aVar = new a(wVar, this.f107889c, length, this.f107891e);
        int i11 = this.f107890d;
        b<T, R>[] bVarArr = aVar.f107894c;
        int length2 = bVarArr.length;
        for (int i12 = 0; i12 < length2; i12++) {
            bVarArr[i12] = new b<>(aVar, i11);
        }
        aVar.lazySet(0);
        aVar.f107892a.onSubscribe(aVar);
        for (int i13 = 0; i13 < length2 && !aVar.f107897f; i13++) {
            uVarArr[i13].subscribe(bVarArr[i13]);
        }
    }
}
