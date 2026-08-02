package zc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* renamed from: zc.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11040h<T> extends io.reactivex.p<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.u<? extends T>[] f108257a;

    /* renamed from: b, reason: collision with root package name */
    final Iterable<? extends io.reactivex.u<? extends T>> f108258b;

    /* renamed from: zc.h$a */
    static final class a<T> implements InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108259a;

        /* renamed from: b, reason: collision with root package name */
        final b<T>[] f108260b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicInteger f108261c = new AtomicInteger();

        a(io.reactivex.w<? super T> wVar, int i11) {
            this.f108259a = wVar;
            this.f108260b = new b[i11];
        }

        public final boolean a(int i11) {
            AtomicInteger atomicInteger = this.f108261c;
            int i12 = atomicInteger.get();
            int i13 = 0;
            if (i12 != 0) {
                return i12 == i11;
            }
            if (!atomicInteger.compareAndSet(0, i11)) {
                return false;
            }
            b<T>[] bVarArr = this.f108260b;
            int length = bVarArr.length;
            while (i13 < length) {
                int i14 = i13 + 1;
                if (i14 != i11) {
                    b<T> bVar = bVarArr[i13];
                    bVar.getClass();
                    rc.d.a(bVar);
                }
                i13 = i14;
            }
            return true;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            AtomicInteger atomicInteger = this.f108261c;
            if (atomicInteger.get() != -1) {
                atomicInteger.lazySet(-1);
                for (b<T> bVar : this.f108260b) {
                    bVar.getClass();
                    rc.d.a(bVar);
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108261c.get() == -1;
        }
    }

    /* renamed from: zc.h$b */
    static final class b<T> extends AtomicReference<InterfaceC8487b> implements io.reactivex.w<T> {

        /* renamed from: a, reason: collision with root package name */
        final a<T> f108262a;

        /* renamed from: b, reason: collision with root package name */
        final int f108263b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.w<? super T> f108264c;

        /* renamed from: d, reason: collision with root package name */
        boolean f108265d;

        b(a<T> aVar, int i11, io.reactivex.w<? super T> wVar) {
            this.f108262a = aVar;
            this.f108263b = i11;
            this.f108264c = wVar;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            boolean z11 = this.f108265d;
            io.reactivex.w<? super T> wVar = this.f108264c;
            if (z11) {
                wVar.onComplete();
            } else if (this.f108262a.a(this.f108263b)) {
                this.f108265d = true;
                wVar.onComplete();
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            boolean z11 = this.f108265d;
            io.reactivex.w<? super T> wVar = this.f108264c;
            if (z11) {
                wVar.onError(th2);
            } else if (!this.f108262a.a(this.f108263b)) {
                C3493a.f(th2);
            } else {
                this.f108265d = true;
                wVar.onError(th2);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            boolean z11 = this.f108265d;
            io.reactivex.w<? super T> wVar = this.f108264c;
            if (z11) {
                wVar.onNext(t2);
            } else if (!this.f108262a.a(this.f108263b)) {
                get().dispose();
            } else {
                this.f108265d = true;
                wVar.onNext(t2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this, interfaceC8487b);
        }
    }

    public C11040h(io.reactivex.u<? extends T>[] uVarArr, Iterable<? extends io.reactivex.u<? extends T>> iterable) {
        this.f108257a = uVarArr;
        this.f108258b = iterable;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        int length;
        io.reactivex.w<? super T> wVar2;
        io.reactivex.u<? extends T>[] uVarArr = this.f108257a;
        if (uVarArr == null) {
            uVarArr = new io.reactivex.p[8];
            try {
                length = 0;
                for (io.reactivex.u<? extends T> uVar : this.f108258b) {
                    if (uVar == null) {
                        rc.e.d(new NullPointerException("One of the sources is null"), wVar);
                        return;
                    }
                    if (length == uVarArr.length) {
                        io.reactivex.u<? extends T>[] uVarArr2 = new io.reactivex.u[(length >> 2) + length];
                        System.arraycopy(uVarArr, 0, uVarArr2, 0, length);
                        uVarArr = uVarArr2;
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
            rc.e.b(wVar);
            return;
        }
        if (length == 1) {
            uVarArr[0].subscribe(wVar);
            return;
        }
        a aVar = new a(wVar, length);
        b<T>[] bVarArr = aVar.f108260b;
        int length2 = bVarArr.length;
        int i12 = 0;
        while (true) {
            wVar2 = aVar.f108259a;
            if (i12 >= length2) {
                break;
            }
            int i13 = i12 + 1;
            bVarArr[i12] = new b<>(aVar, i13, wVar2);
            i12 = i13;
        }
        AtomicInteger atomicInteger = aVar.f108261c;
        atomicInteger.lazySet(0);
        wVar2.onSubscribe(aVar);
        for (int i14 = 0; i14 < length2 && atomicInteger.get() == 0; i14++) {
            uVarArr[i14].subscribe(bVarArr[i14]);
        }
    }
}
