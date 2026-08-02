package wc;

import Bl0.C2645f;
import Kc.C3493a;
import hg.InterfaceC6948a;
import hg.InterfaceC6950c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import pc.AbstractC8896a;
import tc.InterfaceC9805g;
import tc.InterfaceC9808j;
import wc.C10478G;

/* renamed from: wc.D, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10475D<T> extends AbstractC8896a<T> implements rc.g {

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC6948a<T> f103759c;

    /* renamed from: d, reason: collision with root package name */
    final int f103760d;

    /* renamed from: e, reason: collision with root package name */
    final AtomicReference<b<T>> f103761e = new AtomicReference<>();

    /* renamed from: wc.D$a */
    static final class a<T> extends AtomicLong implements InterfaceC6950c {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.j f103762a;

        /* renamed from: b, reason: collision with root package name */
        final b<T> f103763b;

        /* renamed from: c, reason: collision with root package name */
        long f103764c;

        a(io.reactivex.j jVar, b bVar) {
            this.f103762a = jVar;
            this.f103763b = bVar;
        }

        public final boolean a() {
            return get() == Long.MIN_VALUE;
        }

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                b<T> bVar = this.f103763b;
                bVar.e(this);
                bVar.b();
            }
        }

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
            long j12;
            do {
                j12 = get();
                if (j12 == Long.MIN_VALUE || j12 == Long.MAX_VALUE) {
                    break;
                }
            } while (!compareAndSet(j12, Gc.d.b(j12, j11)));
            this.f103763b.b();
        }
    }

    /* renamed from: wc.D$b */
    static final class b<T> extends AtomicInteger implements io.reactivex.j<T>, InterfaceC8487b {

        /* renamed from: k, reason: collision with root package name */
        static final a[] f103765k = new a[0];

        /* renamed from: l, reason: collision with root package name */
        static final a[] f103766l = new a[0];

        /* renamed from: a, reason: collision with root package name */
        final AtomicReference<b<T>> f103767a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<InterfaceC6950c> f103768b = new AtomicReference<>();

        /* renamed from: c, reason: collision with root package name */
        final AtomicBoolean f103769c = new AtomicBoolean();

        /* renamed from: d, reason: collision with root package name */
        final AtomicReference<a<T>[]> f103770d = new AtomicReference<>(f103765k);

        /* renamed from: e, reason: collision with root package name */
        final int f103771e;

        /* renamed from: f, reason: collision with root package name */
        volatile InterfaceC9808j<T> f103772f;

        /* renamed from: g, reason: collision with root package name */
        int f103773g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f103774h;

        /* renamed from: i, reason: collision with root package name */
        Throwable f103775i;

        /* renamed from: j, reason: collision with root package name */
        int f103776j;

        b(AtomicReference<b<T>> atomicReference, int i11) {
            this.f103767a = atomicReference;
            this.f103771e = i11;
        }

        final boolean a(boolean z11, boolean z12) {
            if (!z11 || !z12) {
                return false;
            }
            Throwable th2 = this.f103775i;
            if (th2 != null) {
                f(th2);
                return true;
            }
            for (a<T> aVar : this.f103770d.getAndSet(f103766l)) {
                if (!aVar.a()) {
                    aVar.f103762a.onComplete();
                }
            }
            return true;
        }

        final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC9808j<T> interfaceC9808j = this.f103772f;
            int i11 = this.f103776j;
            int i12 = this.f103771e;
            int i13 = i12 - (i12 >> 2);
            boolean z11 = this.f103773g != 1;
            InterfaceC9808j<T> interfaceC9808j2 = interfaceC9808j;
            int i14 = i11;
            int i15 = 1;
            while (true) {
                if (interfaceC9808j2 != null) {
                    a<T>[] aVarArr = this.f103770d.get();
                    long j11 = Long.MAX_VALUE;
                    boolean z12 = false;
                    for (a<T> aVar : aVarArr) {
                        long j12 = aVar.get();
                        if (j12 != Long.MIN_VALUE) {
                            j11 = Math.min(j12 - aVar.f103764c, j11);
                            z12 = true;
                        }
                    }
                    if (!z12) {
                        j11 = 0;
                    }
                    for (long j13 = 0; j11 != j13; j13 = 0) {
                        boolean z13 = this.f103774h;
                        try {
                            T poll = interfaceC9808j2.poll();
                            boolean z14 = poll == null;
                            if (a(z13, z14)) {
                                return;
                            }
                            if (z14) {
                                break;
                            }
                            for (a<T> aVar2 : aVarArr) {
                                if (!aVar2.a()) {
                                    aVar2.f103762a.onNext(poll);
                                    aVar2.f103764c++;
                                }
                            }
                            if (z11 && (i14 = i14 + 1) == i13) {
                                this.f103768b.get().n(i13);
                                i14 = 0;
                            }
                            j11--;
                            if (aVarArr != this.f103770d.get()) {
                                break;
                            }
                        } catch (Throwable th2) {
                            C2645f.c(th2);
                            this.f103768b.get().cancel();
                            interfaceC9808j2.clear();
                            this.f103774h = true;
                            f(th2);
                            return;
                        }
                    }
                    if (a(this.f103774h, interfaceC9808j2.isEmpty())) {
                        return;
                    }
                }
                this.f103776j = i14;
                i15 = addAndGet(-i15);
                if (i15 == 0) {
                    return;
                }
                if (interfaceC9808j2 == null) {
                    interfaceC9808j2 = this.f103772f;
                }
            }
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (Fc.g.e(this.f103768b, interfaceC6950c)) {
                if (interfaceC6950c instanceof InterfaceC9805g) {
                    InterfaceC9805g interfaceC9805g = (InterfaceC9805g) interfaceC6950c;
                    int a11 = interfaceC9805g.a(7);
                    if (a11 == 1) {
                        this.f103773g = a11;
                        this.f103772f = interfaceC9805g;
                        this.f103774h = true;
                        b();
                        return;
                    }
                    if (a11 == 2) {
                        this.f103773g = a11;
                        this.f103772f = interfaceC9805g;
                        interfaceC6950c.n(this.f103771e);
                        return;
                    }
                }
                this.f103772f = new Cc.b(this.f103771e);
                interfaceC6950c.n(this.f103771e);
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            AtomicReference<b<T>> atomicReference;
            this.f103770d.getAndSet(f103766l);
            do {
                atomicReference = this.f103767a;
                if (atomicReference.compareAndSet(this, null)) {
                    break;
                }
            } while (atomicReference.get() == this);
            Fc.g.a(this.f103768b);
        }

        final void e(a<T> aVar) {
            a<T>[] aVarArr;
            while (true) {
                AtomicReference<a<T>[]> atomicReference = this.f103770d;
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
                    aVarArr = f103765k;
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

        final void f(Throwable th2) {
            for (a<T> aVar : this.f103770d.getAndSet(f103766l)) {
                if (!aVar.a()) {
                    aVar.f103762a.onError(th2);
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f103770d.get() == f103766l;
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            this.f103774h = true;
            b();
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            if (this.f103774h) {
                C3493a.f(th2);
                return;
            }
            this.f103775i = th2;
            this.f103774h = true;
            b();
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            if (this.f103773g != 0 || this.f103772f.offer(t2)) {
                b();
            } else {
                onError(new oc.b("Prefetch queue is full?!"));
            }
        }
    }

    public C10475D(InterfaceC6948a<T> interfaceC6948a, int i11) {
        this.f103759c = interfaceC6948a;
        this.f103760d = i11;
    }

    @Override // rc.g
    public final void b(InterfaceC8487b interfaceC8487b) {
        AtomicReference<b<T>> atomicReference = this.f103761e;
        b<T> bVar = (b) interfaceC8487b;
        while (!atomicReference.compareAndSet(bVar, null) && atomicReference.get() == bVar) {
        }
    }

    @Override // io.reactivex.h
    protected final void j(io.reactivex.j jVar) {
        b<T> bVar;
        loop0: while (true) {
            AtomicReference<b<T>> atomicReference = this.f103761e;
            bVar = atomicReference.get();
            if (bVar != null) {
                break;
            }
            b<T> bVar2 = new b<>(atomicReference, this.f103760d);
            while (!atomicReference.compareAndSet(bVar, bVar2)) {
                if (atomicReference.get() != bVar) {
                    break;
                }
            }
            bVar = bVar2;
            break loop0;
        }
        a<T> aVar = new a<>(jVar, bVar);
        jVar.d(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference2 = bVar.f103770d;
            a<T>[] aVarArr = atomicReference2.get();
            if (aVarArr == b.f103766l) {
                Throwable th2 = bVar.f103775i;
                if (th2 != null) {
                    jVar.onError(th2);
                    return;
                } else {
                    jVar.onComplete();
                    return;
                }
            }
            int length = aVarArr.length;
            a<T>[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            while (!atomicReference2.compareAndSet(aVarArr, aVarArr2)) {
                if (atomicReference2.get() != aVarArr) {
                    break;
                }
            }
            if (aVar.a()) {
                bVar.e(aVar);
                return;
            } else {
                bVar.b();
                return;
            }
        }
    }

    @Override // pc.AbstractC8896a
    public final void l(qc.g<? super InterfaceC8487b> gVar) {
        b<T> bVar;
        loop0: while (true) {
            AtomicReference<b<T>> atomicReference = this.f103761e;
            bVar = atomicReference.get();
            if (bVar != null && !bVar.isDisposed()) {
                break;
            }
            b<T> bVar2 = new b<>(atomicReference, this.f103760d);
            while (!atomicReference.compareAndSet(bVar, bVar2)) {
                if (atomicReference.get() != bVar) {
                    break;
                }
            }
            bVar = bVar2;
            break loop0;
        }
        AtomicBoolean atomicBoolean = bVar.f103769c;
        boolean z11 = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z11 = true;
        }
        try {
            ((C10478G.a) gVar).accept(bVar);
            if (z11) {
                this.f103759c.a(bVar);
            }
        } catch (Throwable th2) {
            C2645f.c(th2);
            throw Gc.i.d(th2);
        }
    }
}
