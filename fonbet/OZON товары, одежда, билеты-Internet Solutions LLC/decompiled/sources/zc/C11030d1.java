package zc;

import Bl0.C2645f;
import java.util.concurrent.atomic.AtomicInteger;
import nc.InterfaceC8487b;
import rc.C9242a;
import tc.InterfaceC9802d;

/* renamed from: zc.d1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11030d1<T> extends io.reactivex.y<Boolean> implements InterfaceC9802d<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.u<? extends T> f108193a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.u<? extends T> f108194b;

    /* renamed from: c, reason: collision with root package name */
    final qc.d<? super T, ? super T> f108195c;

    /* renamed from: d, reason: collision with root package name */
    final int f108196d;

    /* renamed from: zc.d1$a */
    static final class a<T> extends AtomicInteger implements InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super Boolean> f108197a;

        /* renamed from: b, reason: collision with root package name */
        final qc.d<? super T, ? super T> f108198b;

        /* renamed from: c, reason: collision with root package name */
        final C9242a f108199c = new C9242a(2);

        /* renamed from: d, reason: collision with root package name */
        final io.reactivex.u<? extends T> f108200d;

        /* renamed from: e, reason: collision with root package name */
        final io.reactivex.u<? extends T> f108201e;

        /* renamed from: f, reason: collision with root package name */
        final b<T>[] f108202f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f108203g;

        /* renamed from: h, reason: collision with root package name */
        T f108204h;

        /* renamed from: i, reason: collision with root package name */
        T f108205i;

        a(io.reactivex.A<? super Boolean> a11, int i11, io.reactivex.u<? extends T> uVar, io.reactivex.u<? extends T> uVar2, qc.d<? super T, ? super T> dVar) {
            this.f108197a = a11;
            this.f108200d = uVar;
            this.f108201e = uVar2;
            this.f108198b = dVar;
            this.f108202f = new b[]{new b<>(this, 0, i11), new b<>(this, 1, i11)};
        }

        final void a() {
            Throwable th2;
            Throwable th3;
            if (getAndIncrement() != 0) {
                return;
            }
            b<T>[] bVarArr = this.f108202f;
            b<T> bVar = bVarArr[0];
            Cc.c<T> cVar = bVar.f108207b;
            b<T> bVar2 = bVarArr[1];
            Cc.c<T> cVar2 = bVar2.f108207b;
            int i11 = 1;
            while (!this.f108203g) {
                boolean z11 = bVar.f108209d;
                if (z11 && (th3 = bVar.f108210e) != null) {
                    this.f108203g = true;
                    cVar.clear();
                    cVar2.clear();
                    this.f108197a.onError(th3);
                    return;
                }
                boolean z12 = bVar2.f108209d;
                if (z12 && (th2 = bVar2.f108210e) != null) {
                    this.f108203g = true;
                    cVar.clear();
                    cVar2.clear();
                    this.f108197a.onError(th2);
                    return;
                }
                if (this.f108204h == null) {
                    this.f108204h = cVar.poll();
                }
                boolean z13 = this.f108204h == null;
                if (this.f108205i == null) {
                    this.f108205i = cVar2.poll();
                }
                T t2 = this.f108205i;
                boolean z14 = t2 == null;
                if (z11 && z12 && z13 && z14) {
                    this.f108197a.onSuccess(Boolean.TRUE);
                    return;
                }
                if (z11 && z12 && z13 != z14) {
                    this.f108203g = true;
                    cVar.clear();
                    cVar2.clear();
                    this.f108197a.onSuccess(Boolean.FALSE);
                    return;
                }
                if (!z13 && !z14) {
                    try {
                        if (!this.f108198b.a(this.f108204h, t2)) {
                            this.f108203g = true;
                            cVar.clear();
                            cVar2.clear();
                            this.f108197a.onSuccess(Boolean.FALSE);
                            return;
                        }
                        this.f108204h = null;
                        this.f108205i = null;
                    } catch (Throwable th4) {
                        C2645f.c(th4);
                        this.f108203g = true;
                        cVar.clear();
                        cVar2.clear();
                        this.f108197a.onError(th4);
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
            if (this.f108203g) {
                return;
            }
            this.f108203g = true;
            this.f108199c.dispose();
            if (getAndIncrement() == 0) {
                b<T>[] bVarArr = this.f108202f;
                bVarArr[0].f108207b.clear();
                bVarArr[1].f108207b.clear();
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108203g;
        }
    }

    /* renamed from: zc.d1$b */
    static final class b<T> implements io.reactivex.w<T> {

        /* renamed from: a, reason: collision with root package name */
        final a<T> f108206a;

        /* renamed from: b, reason: collision with root package name */
        final Cc.c<T> f108207b;

        /* renamed from: c, reason: collision with root package name */
        final int f108208c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f108209d;

        /* renamed from: e, reason: collision with root package name */
        Throwable f108210e;

        b(a<T> aVar, int i11, int i12) {
            this.f108206a = aVar;
            this.f108208c = i11;
            this.f108207b = new Cc.c<>(i12);
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108209d = true;
            this.f108206a.a();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108210e = th2;
            this.f108209d = true;
            this.f108206a.a();
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f108207b.offer(t2);
            this.f108206a.a();
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            this.f108206a.f108199c.a(this.f108208c, interfaceC8487b);
        }
    }

    public C11030d1(io.reactivex.u<? extends T> uVar, io.reactivex.u<? extends T> uVar2, qc.d<? super T, ? super T> dVar, int i11) {
        this.f108193a = uVar;
        this.f108194b = uVar2;
        this.f108195c = dVar;
        this.f108196d = i11;
    }

    @Override // tc.InterfaceC9802d
    public final io.reactivex.p<Boolean> b() {
        return new C11027c1(this.f108193a, this.f108194b, this.f108195c, this.f108196d);
    }

    @Override // io.reactivex.y
    public final void i(io.reactivex.A<? super Boolean> a11) {
        a aVar = new a(a11, this.f108196d, this.f108193a, this.f108194b, this.f108195c);
        a11.onSubscribe(aVar);
        b<T>[] bVarArr = aVar.f108202f;
        aVar.f108200d.subscribe(bVarArr[0]);
        aVar.f108201e.subscribe(bVarArr[1]);
    }
}
