package vc;

import io.reactivex.AbstractC7094b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* renamed from: vc.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10297b extends AbstractC7094b implements io.reactivex.d {

    /* renamed from: e, reason: collision with root package name */
    static final a[] f102758e = new a[0];

    /* renamed from: f, reason: collision with root package name */
    static final a[] f102759f = new a[0];

    /* renamed from: a, reason: collision with root package name */
    final j f102760a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<a[]> f102761b = new AtomicReference<>(f102758e);

    /* renamed from: c, reason: collision with root package name */
    final AtomicBoolean f102762c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    Throwable f102763d;

    /* renamed from: vc.b$a */
    final class a extends AtomicBoolean implements InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.d f102764a;

        a(io.reactivex.d dVar) {
            this.f102764a = dVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (compareAndSet(false, true)) {
                C10297b.this.l(this);
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return get();
        }
    }

    public C10297b(j jVar) {
        this.f102760a = jVar;
    }

    @Override // io.reactivex.AbstractC7094b
    protected final void j(io.reactivex.d dVar) {
        a aVar = new a(dVar);
        dVar.onSubscribe(aVar);
        while (true) {
            AtomicReference<a[]> atomicReference = this.f102761b;
            a[] aVarArr = atomicReference.get();
            if (aVarArr == f102759f) {
                Throwable th2 = this.f102763d;
                if (th2 != null) {
                    dVar.onError(th2);
                    return;
                } else {
                    dVar.onComplete();
                    return;
                }
            }
            int length = aVarArr.length;
            a[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                if (atomicReference.get() != aVarArr) {
                    break;
                }
            }
            if (aVar.get()) {
                l(aVar);
            }
            if (this.f102762c.compareAndSet(false, true)) {
                this.f102760a.a(this);
                return;
            }
            return;
        }
    }

    final void l(a aVar) {
        a[] aVarArr;
        while (true) {
            AtomicReference<a[]> atomicReference = this.f102761b;
            a[] aVarArr2 = atomicReference.get();
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
                aVarArr = f102758e;
            } else {
                a[] aVarArr3 = new a[length - 1];
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

    @Override // io.reactivex.d
    public final void onComplete() {
        for (a aVar : this.f102761b.getAndSet(f102759f)) {
            if (!aVar.get()) {
                aVar.f102764a.onComplete();
            }
        }
    }

    @Override // io.reactivex.d
    public final void onError(Throwable th2) {
        this.f102763d = th2;
        for (a aVar : this.f102761b.getAndSet(f102759f)) {
            if (!aVar.get()) {
                aVar.f102764a.onError(th2);
            }
        }
    }

    @Override // io.reactivex.d
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
    }
}
