package zc;

import Bl0.C2645f;
import Hc.AbstractC3137a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class H0<T> extends AbstractC3137a<T> implements rc.g {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.u<T> f107702a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<b<T>> f107703b = new AtomicReference<>();

    /* loaded from: classes9.dex */
    static final class a<T> extends AtomicReference<b<T>> implements InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f107704a;

        public a(io.reactivex.w<? super T> wVar, b<T> bVar) {
            this.f107704a = wVar;
            lazySet(bVar);
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            b<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.b(this);
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return get() == null;
        }
    }

    /* loaded from: classes9.dex */
    static final class b<T> extends AtomicReference<a<T>[]> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: e, reason: collision with root package name */
        static final a[] f107705e = new a[0];

        /* renamed from: f, reason: collision with root package name */
        static final a[] f107706f = new a[0];

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<b<T>> f107708b;

        /* renamed from: d, reason: collision with root package name */
        Throwable f107710d;

        /* renamed from: a, reason: collision with root package name */
        final AtomicBoolean f107707a = new AtomicBoolean();

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f107709c = new AtomicReference<>();

        public b(AtomicReference<b<T>> atomicReference) {
            this.f107708b = atomicReference;
            lazySet(f107705e);
        }

        public final boolean a(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = get();
                if (aVarArr == f107706f) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        public final void b(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = get();
                int length = aVarArr.length;
                if (length == 0) {
                    return;
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        i11 = -1;
                        break;
                    } else if (aVarArr[i11] == aVar) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 < 0) {
                    return;
                }
                aVarArr2 = f107705e;
                if (length != 1) {
                    aVarArr2 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, i11);
                    System.arraycopy(aVarArr, i11 + 1, aVarArr2, i11, (length - i11) - 1);
                }
            } while (!compareAndSet(aVarArr, aVarArr2));
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            AtomicReference<b<T>> atomicReference;
            getAndSet(f107706f);
            do {
                atomicReference = this.f107708b;
                if (atomicReference.compareAndSet(this, null)) {
                    break;
                }
            } while (atomicReference.get() == this);
            rc.d.a(this.f107709c);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return get() == f107706f;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f107709c.lazySet(rc.d.DISPOSED);
            for (a<T> aVar : getAndSet(f107706f)) {
                aVar.f107704a.onComplete();
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f107710d = th2;
            this.f107709c.lazySet(rc.d.DISPOSED);
            for (a<T> aVar : getAndSet(f107706f)) {
                aVar.f107704a.onError(th2);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            for (a<T> aVar : get()) {
                aVar.f107704a.onNext(t2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this.f107709c, interfaceC8487b);
        }
    }

    public H0(io.reactivex.u<T> uVar) {
        this.f107702a = uVar;
    }

    @Override // rc.g
    public final void b(InterfaceC8487b interfaceC8487b) {
        TY.a.f(this.f107703b, (b) interfaceC8487b);
    }

    @Override // Hc.AbstractC3137a
    public final void c(qc.g<? super InterfaceC8487b> gVar) {
        b<T> bVar;
        while (true) {
            AtomicReference<b<T>> atomicReference = this.f107703b;
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
        AtomicBoolean atomicBoolean = bVar.f107707a;
        boolean z11 = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z11 = true;
        }
        try {
            gVar.accept(bVar);
            if (z11) {
                this.f107702a.subscribe(bVar);
            }
        } catch (Throwable th2) {
            C2645f.c(th2);
            throw Gc.i.d(th2);
        }
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        b<T> bVar;
        while (true) {
            AtomicReference<b<T>> atomicReference = this.f107703b;
            bVar = atomicReference.get();
            if (bVar != null) {
                break;
            }
            b<T> bVar2 = new b<>(atomicReference);
            if (Bl.b.e(atomicReference, bVar, bVar2)) {
                bVar = bVar2;
                break;
            }
        }
        a<T> aVar = new a<>(wVar, bVar);
        wVar.onSubscribe(aVar);
        if (bVar.a(aVar)) {
            if (aVar.isDisposed()) {
                bVar.b(aVar);
            }
        } else {
            Throwable th2 = bVar.f107710d;
            if (th2 != null) {
                wVar.onError(th2);
            } else {
                wVar.onComplete();
            }
        }
    }
}
