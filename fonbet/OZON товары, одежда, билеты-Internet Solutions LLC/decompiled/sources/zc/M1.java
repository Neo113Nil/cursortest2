package zc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import nc.InterfaceC8487b;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class M1<T, R> extends AbstractC11019a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.u<?>[] f107855b;

    /* renamed from: c, reason: collision with root package name */
    final Iterable<? extends io.reactivex.u<?>> f107856c;

    /* renamed from: d, reason: collision with root package name */
    final qc.o<? super Object[], R> f107857d;

    final class a implements qc.o<T, R> {
        a() {
        }

        @Override // qc.o
        public final R apply(T t2) throws Exception {
            R apply = M1.this.f107857d.apply(new Object[]{t2});
            C9656b.c(apply, "The combiner returned a null value");
            return apply;
        }
    }

    static final class b<T, R> extends AtomicInteger implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super R> f107859a;

        /* renamed from: b, reason: collision with root package name */
        final qc.o<? super Object[], R> f107860b;

        /* renamed from: c, reason: collision with root package name */
        final c[] f107861c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceArray<Object> f107862d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f107863e;

        /* renamed from: f, reason: collision with root package name */
        final Gc.c f107864f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f107865g;

        b(io.reactivex.w<? super R> wVar, qc.o<? super Object[], R> oVar, int i11) {
            this.f107859a = wVar;
            this.f107860b = oVar;
            c[] cVarArr = new c[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                cVarArr[i12] = new c(this, i12);
            }
            this.f107861c = cVarArr;
            this.f107862d = new AtomicReferenceArray<>(i11);
            this.f107863e = new AtomicReference<>();
            this.f107864f = new Gc.c();
        }

        final void a(int i11) {
            int i12 = 0;
            while (true) {
                c[] cVarArr = this.f107861c;
                if (i12 >= cVarArr.length) {
                    return;
                }
                if (i12 != i11) {
                    c cVar = cVarArr[i12];
                    cVar.getClass();
                    rc.d.a(cVar);
                }
                i12++;
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this.f107863e);
            for (c cVar : this.f107861c) {
                cVar.getClass();
                rc.d.a(cVar);
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(this.f107863e.get());
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f107865g) {
                return;
            }
            this.f107865g = true;
            a(-1);
            Bl0.B.b(this.f107859a, this, this.f107864f);
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f107865g) {
                C3493a.f(th2);
                return;
            }
            this.f107865g = true;
            a(-1);
            Bl0.B.c(this.f107859a, th2, this, this.f107864f);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f107865g) {
                return;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.f107862d;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[length + 1];
            int i11 = 0;
            objArr[0] = t2;
            while (i11 < length) {
                Object obj = atomicReferenceArray.get(i11);
                if (obj == null) {
                    return;
                }
                i11++;
                objArr[i11] = obj;
            }
            try {
                R apply = this.f107860b.apply(objArr);
                C9656b.c(apply, "combiner returned a null value");
                Bl0.B.d(this.f107859a, apply, this, this.f107864f);
            } catch (Throwable th2) {
                C2645f.c(th2);
                dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this.f107863e, interfaceC8487b);
        }
    }

    static final class c extends AtomicReference<InterfaceC8487b> implements io.reactivex.w<Object> {

        /* renamed from: a, reason: collision with root package name */
        final b<?, ?> f107866a;

        /* renamed from: b, reason: collision with root package name */
        final int f107867b;

        /* renamed from: c, reason: collision with root package name */
        boolean f107868c;

        c(b<?, ?> bVar, int i11) {
            this.f107866a = bVar;
            this.f107867b = i11;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            b<?, ?> bVar = this.f107866a;
            int i11 = this.f107867b;
            if (this.f107868c) {
                bVar.getClass();
                return;
            }
            bVar.f107865g = true;
            bVar.a(i11);
            Bl0.B.b(bVar.f107859a, bVar, bVar.f107864f);
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            b<?, ?> bVar = this.f107866a;
            int i11 = this.f107867b;
            bVar.f107865g = true;
            rc.d.a(bVar.f107863e);
            bVar.a(i11);
            Bl0.B.c(bVar.f107859a, th2, bVar, bVar.f107864f);
        }

        @Override // io.reactivex.w
        public final void onNext(Object obj) {
            if (!this.f107868c) {
                this.f107868c = true;
            }
            this.f107866a.f107862d.set(this.f107867b, obj);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this, interfaceC8487b);
        }
    }

    public M1(io.reactivex.p pVar, io.reactivex.u[] uVarArr, qc.o oVar) {
        super(pVar);
        this.f107855b = uVarArr;
        this.f107856c = null;
        this.f107857d = oVar;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super R> wVar) {
        int length;
        io.reactivex.u<?>[] uVarArr = this.f107855b;
        if (uVarArr == null) {
            uVarArr = new io.reactivex.u[8];
            try {
                length = 0;
                for (io.reactivex.u<?> uVar : this.f107856c) {
                    if (length == uVarArr.length) {
                        uVarArr = (io.reactivex.u[]) Arrays.copyOf(uVarArr, (length >> 1) + length);
                    }
                    int i11 = length + 1;
                    uVarArr[length] = uVar;
                    length = i11;
                }
            } catch (Throwable th2) {
                C2645f.c(th2);
                rc.e.d(th2, wVar);
                return;
            }
        } else {
            length = uVarArr.length;
        }
        if (length == 0) {
            new C11079w0(this.f108122a, new a()).subscribeActual(wVar);
            return;
        }
        b bVar = new b(wVar, this.f107857d, length);
        wVar.onSubscribe(bVar);
        c[] cVarArr = bVar.f107861c;
        AtomicReference<InterfaceC8487b> atomicReference = bVar.f107863e;
        for (int i12 = 0; i12 < length && !rc.d.b(atomicReference.get()) && !bVar.f107865g; i12++) {
            uVarArr[i12].subscribe(cVarArr[i12]);
        }
        this.f108122a.subscribe(bVar);
    }

    public M1(io.reactivex.p pVar, Iterable iterable, qc.o oVar) {
        super(pVar);
        this.f107855b = null;
        this.f107856c = iterable;
        this.f107857d = oVar;
    }
}
