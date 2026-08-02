package zc;

import Bl0.C2645f;
import Hc.AbstractC3137a;
import Kc.C3493a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class G0<T> extends AbstractC3137a<T> implements I0<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.p f107666a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<b<T>> f107667b;

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.u<T> f107668c;

    /* loaded from: classes9.dex */
    static final class a<T> extends AtomicReference<Object> implements InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f107669a;

        a(io.reactivex.w<? super T> wVar) {
            this.f107669a = wVar;
        }

        final void a(b<T> bVar) {
            if (compareAndSet(null, bVar)) {
                return;
            }
            bVar.b(this);
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            Object andSet = getAndSet(this);
            if (andSet == null || andSet == this) {
                return;
            }
            ((b) andSet).b(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return get() == this;
        }
    }

    /* loaded from: classes9.dex */
    static final class b<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: e, reason: collision with root package name */
        static final a[] f107670e = new a[0];

        /* renamed from: f, reason: collision with root package name */
        static final a[] f107671f = new a[0];

        /* renamed from: a, reason: collision with root package name */
        final AtomicReference<b<T>> f107672a;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f107675d = new AtomicReference<>();

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<a<T>[]> f107673b = new AtomicReference<>(f107670e);

        /* renamed from: c, reason: collision with root package name */
        final AtomicBoolean f107674c = new AtomicBoolean();

        b(AtomicReference<b<T>> atomicReference) {
            this.f107672a = atomicReference;
        }

        final boolean a(a<T> aVar) {
            while (true) {
                AtomicReference<a<T>[]> atomicReference = this.f107673b;
                a<T>[] aVarArr = atomicReference.get();
                if (aVarArr == f107671f) {
                    return false;
                }
                int length = aVarArr.length;
                a<T>[] aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
                while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                    if (atomicReference.get() != aVarArr) {
                        break;
                    }
                }
                return true;
            }
        }

        final void b(a<T> aVar) {
            a<T>[] aVarArr;
            while (true) {
                AtomicReference<a<T>[]> atomicReference = this.f107673b;
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
                    } else if (aVarArr2[i11].equals(aVar)) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr = f107670e;
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
        public final void dispose() {
            AtomicReference<b<T>> atomicReference;
            AtomicReference<a<T>[]> atomicReference2 = this.f107673b;
            a<T>[] aVarArr = f107671f;
            if (atomicReference2.getAndSet(aVarArr) != aVarArr) {
                do {
                    atomicReference = this.f107672a;
                    if (atomicReference.compareAndSet(this, null)) {
                        break;
                    }
                } while (atomicReference.get() == this);
                rc.d.a(this.f107675d);
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107673b.get() == f107671f;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            AtomicReference<b<T>> atomicReference;
            do {
                atomicReference = this.f107672a;
                if (atomicReference.compareAndSet(this, null)) {
                    break;
                }
            } while (atomicReference.get() == this);
            for (a<T> aVar : this.f107673b.getAndSet(f107671f)) {
                aVar.f107669a.onComplete();
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            AtomicReference<b<T>> atomicReference;
            do {
                atomicReference = this.f107672a;
                if (atomicReference.compareAndSet(this, null)) {
                    break;
                }
            } while (atomicReference.get() == this);
            a<T>[] andSet = this.f107673b.getAndSet(f107671f);
            if (andSet.length == 0) {
                C3493a.f(th2);
                return;
            }
            for (a<T> aVar : andSet) {
                aVar.f107669a.onError(th2);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            for (a<T> aVar : this.f107673b.get()) {
                aVar.f107669a.onNext(t2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this.f107675d, interfaceC8487b);
        }
    }

    static final class c<T> implements io.reactivex.u<T> {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicReference<b<T>> f107676a;

        c(AtomicReference<b<T>> atomicReference) {
            this.f107676a = atomicReference;
        }

        @Override // io.reactivex.u
        public final void subscribe(io.reactivex.w<? super T> wVar) {
            a aVar = new a(wVar);
            wVar.onSubscribe(aVar);
            while (true) {
                AtomicReference<b<T>> atomicReference = this.f107676a;
                b<T> bVar = atomicReference.get();
                if (bVar == null || bVar.isDisposed()) {
                    b<T> bVar2 = new b<>(atomicReference);
                    if (Bl.b.e(atomicReference, bVar, bVar2)) {
                        bVar = bVar2;
                    } else {
                        continue;
                    }
                }
                if (bVar.a(aVar)) {
                    aVar.a(bVar);
                    return;
                }
            }
        }
    }

    private G0(io.reactivex.u uVar, io.reactivex.p pVar, AtomicReference atomicReference) {
        this.f107668c = uVar;
        this.f107666a = pVar;
        this.f107667b = atomicReference;
    }

    public static G0 d(io.reactivex.p pVar) {
        AtomicReference atomicReference = new AtomicReference();
        return new G0(new c(atomicReference), pVar, atomicReference);
    }

    @Override // zc.I0
    public final io.reactivex.u<T> a() {
        return this.f107666a;
    }

    @Override // Hc.AbstractC3137a
    public final void c(qc.g<? super InterfaceC8487b> gVar) {
        b<T> bVar;
        while (true) {
            AtomicReference<b<T>> atomicReference = this.f107667b;
            bVar = atomicReference.get();
            if (bVar != null && !bVar.isDisposed()) {
                break;
            }
            b<T> bVar2 = new b<>(atomicReference);
            if (Bl.b.e(atomicReference, bVar, bVar2)) {
                bVar = bVar2;
                break;
            }
        }
        AtomicBoolean atomicBoolean = bVar.f107674c;
        boolean z11 = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z11 = true;
        }
        try {
            gVar.accept(bVar);
            if (z11) {
                this.f107666a.subscribe(bVar);
            }
        } catch (Throwable th2) {
            C2645f.c(th2);
            throw Gc.i.d(th2);
        }
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f107668c.subscribe(wVar);
    }
}
