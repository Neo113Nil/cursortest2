package zc;

import Bl0.C2645f;
import java.util.concurrent.atomic.AtomicInteger;
import nc.InterfaceC8487b;
import rc.C9242a;

/* renamed from: zc.c1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11027c1<T> extends io.reactivex.p<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.u<? extends T> f108169a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.u<? extends T> f108170b;

    /* renamed from: c, reason: collision with root package name */
    final qc.d<? super T, ? super T> f108171c;

    /* renamed from: d, reason: collision with root package name */
    final int f108172d;

    /* renamed from: zc.c1$a */
    static final class a<T> extends AtomicInteger implements InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super Boolean> f108173a;

        /* renamed from: b, reason: collision with root package name */
        final qc.d<? super T, ? super T> f108174b;

        /* renamed from: c, reason: collision with root package name */
        final C9242a f108175c = new C9242a(2);

        /* renamed from: d, reason: collision with root package name */
        final io.reactivex.u<? extends T> f108176d;

        /* renamed from: e, reason: collision with root package name */
        final io.reactivex.u<? extends T> f108177e;

        /* renamed from: f, reason: collision with root package name */
        final b<T>[] f108178f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f108179g;

        /* renamed from: h, reason: collision with root package name */
        T f108180h;

        /* renamed from: i, reason: collision with root package name */
        T f108181i;

        a(io.reactivex.w<? super Boolean> wVar, int i11, io.reactivex.u<? extends T> uVar, io.reactivex.u<? extends T> uVar2, qc.d<? super T, ? super T> dVar) {
            this.f108173a = wVar;
            this.f108176d = uVar;
            this.f108177e = uVar2;
            this.f108174b = dVar;
            this.f108178f = new b[]{new b<>(this, 0, i11), new b<>(this, 1, i11)};
        }

        final void a() {
            Throwable th2;
            Throwable th3;
            if (getAndIncrement() != 0) {
                return;
            }
            b<T>[] bVarArr = this.f108178f;
            b<T> bVar = bVarArr[0];
            Cc.c<T> cVar = bVar.f108183b;
            b<T> bVar2 = bVarArr[1];
            Cc.c<T> cVar2 = bVar2.f108183b;
            int i11 = 1;
            while (!this.f108179g) {
                boolean z11 = bVar.f108185d;
                if (z11 && (th3 = bVar.f108186e) != null) {
                    this.f108179g = true;
                    cVar.clear();
                    cVar2.clear();
                    this.f108173a.onError(th3);
                    return;
                }
                boolean z12 = bVar2.f108185d;
                if (z12 && (th2 = bVar2.f108186e) != null) {
                    this.f108179g = true;
                    cVar.clear();
                    cVar2.clear();
                    this.f108173a.onError(th2);
                    return;
                }
                if (this.f108180h == null) {
                    this.f108180h = cVar.poll();
                }
                boolean z13 = this.f108180h == null;
                if (this.f108181i == null) {
                    this.f108181i = cVar2.poll();
                }
                T t2 = this.f108181i;
                boolean z14 = t2 == null;
                if (z11 && z12 && z13 && z14) {
                    this.f108173a.onNext(Boolean.TRUE);
                    this.f108173a.onComplete();
                    return;
                }
                if (z11 && z12 && z13 != z14) {
                    this.f108179g = true;
                    cVar.clear();
                    cVar2.clear();
                    this.f108173a.onNext(Boolean.FALSE);
                    this.f108173a.onComplete();
                    return;
                }
                if (!z13 && !z14) {
                    try {
                        if (!this.f108174b.a(this.f108180h, t2)) {
                            this.f108179g = true;
                            cVar.clear();
                            cVar2.clear();
                            this.f108173a.onNext(Boolean.FALSE);
                            this.f108173a.onComplete();
                            return;
                        }
                        this.f108180h = null;
                        this.f108181i = null;
                    } catch (Throwable th4) {
                        C2645f.c(th4);
                        this.f108179g = true;
                        cVar.clear();
                        cVar2.clear();
                        this.f108173a.onError(th4);
                        return;
                    }
                }
                if (z13 || z14) {
                    i11 = addAndGet(-i11);
                    if (i11 == 0) {
                        return;
                    }
                }
            }
            cVar.clear();
            cVar2.clear();
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (this.f108179g) {
                return;
            }
            this.f108179g = true;
            this.f108175c.dispose();
            if (getAndIncrement() == 0) {
                b<T>[] bVarArr = this.f108178f;
                bVarArr[0].f108183b.clear();
                bVarArr[1].f108183b.clear();
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108179g;
        }
    }

    /* renamed from: zc.c1$b */
    static final class b<T> implements io.reactivex.w<T> {

        /* renamed from: a, reason: collision with root package name */
        final a<T> f108182a;

        /* renamed from: b, reason: collision with root package name */
        final Cc.c<T> f108183b;

        /* renamed from: c, reason: collision with root package name */
        final int f108184c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f108185d;

        /* renamed from: e, reason: collision with root package name */
        Throwable f108186e;

        b(a<T> aVar, int i11, int i12) {
            this.f108182a = aVar;
            this.f108184c = i11;
            this.f108183b = new Cc.c<>(i12);
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108185d = true;
            this.f108182a.a();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108186e = th2;
            this.f108185d = true;
            this.f108182a.a();
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f108183b.offer(t2);
            this.f108182a.a();
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            this.f108182a.f108175c.a(this.f108184c, interfaceC8487b);
        }
    }

    public C11027c1(io.reactivex.u<? extends T> uVar, io.reactivex.u<? extends T> uVar2, qc.d<? super T, ? super T> dVar, int i11) {
        this.f108169a = uVar;
        this.f108170b = uVar2;
        this.f108171c = dVar;
        this.f108172d = i11;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super Boolean> wVar) {
        a aVar = new a(wVar, this.f108172d, this.f108169a, this.f108170b, this.f108171c);
        wVar.onSubscribe(aVar);
        b<T>[] bVarArr = aVar.f108178f;
        aVar.f108176d.subscribe(bVarArr[0]);
        aVar.f108177e.subscribe(bVarArr[1]);
    }
}
