package wc;

import Bl0.C2645f;
import Kc.C3493a;
import hg.InterfaceC6948a;
import hg.InterfaceC6950c;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import sc.C9656b;
import tc.InterfaceC9805g;
import tc.InterfaceC9807i;
import tc.InterfaceC9808j;

/* loaded from: classes9.dex */
public final class r<T, U> extends AbstractC10480a<T, U> {

    /* renamed from: d, reason: collision with root package name */
    final ru.ozon.app.android.network.websockets.a f104025d;

    /* renamed from: e, reason: collision with root package name */
    final int f104026e;

    /* renamed from: f, reason: collision with root package name */
    final int f104027f;

    static final class a<T, U> extends AtomicReference<InterfaceC6950c> implements io.reactivex.j<U>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final long f104028a;

        /* renamed from: b, reason: collision with root package name */
        final b<T, U> f104029b;

        /* renamed from: c, reason: collision with root package name */
        final int f104030c;

        /* renamed from: d, reason: collision with root package name */
        final int f104031d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f104032e;

        /* renamed from: f, reason: collision with root package name */
        volatile InterfaceC9808j<U> f104033f;

        /* renamed from: g, reason: collision with root package name */
        long f104034g;

        /* renamed from: h, reason: collision with root package name */
        int f104035h;

        a(b<T, U> bVar, long j11) {
            this.f104028a = j11;
            this.f104029b = bVar;
            int i11 = bVar.f104041d;
            this.f104031d = i11;
            this.f104030c = i11 >> 2;
        }

        final void a(long j11) {
            if (this.f104035h != 1) {
                long j12 = this.f104034g + j11;
                if (j12 < this.f104030c) {
                    this.f104034g = j12;
                } else {
                    this.f104034g = 0L;
                    get().n(j12);
                }
            }
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (Fc.g.e(this, interfaceC6950c)) {
                if (interfaceC6950c instanceof InterfaceC9805g) {
                    InterfaceC9805g interfaceC9805g = (InterfaceC9805g) interfaceC6950c;
                    int a11 = interfaceC9805g.a(7);
                    if (a11 == 1) {
                        this.f104035h = a11;
                        this.f104033f = interfaceC9805g;
                        this.f104032e = true;
                        this.f104029b.b();
                        return;
                    }
                    if (a11 == 2) {
                        this.f104035h = a11;
                        this.f104033f = interfaceC9805g;
                    }
                }
                interfaceC6950c.n(this.f104031d);
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            Fc.g.a(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return get() == Fc.g.CANCELLED;
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            this.f104032e = true;
            this.f104029b.b();
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            lazySet(Fc.g.CANCELLED);
            b<T, U> bVar = this.f104029b;
            Gc.c cVar = bVar.f104044g;
            cVar.getClass();
            if (!Gc.i.a(cVar, th2)) {
                C3493a.f(th2);
                return;
            }
            this.f104032e = true;
            bVar.f104048k.cancel();
            for (a<?, ?> aVar : bVar.f104046i.getAndSet(b.f104037r)) {
                aVar.getClass();
                Fc.g.a(aVar);
            }
            bVar.b();
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(U u11) {
            if (this.f104035h == 2) {
                this.f104029b.b();
                return;
            }
            b<T, U> bVar = this.f104029b;
            if (bVar.get() == 0 && bVar.compareAndSet(0, 1)) {
                long j11 = bVar.f104047j.get();
                InterfaceC9808j interfaceC9808j = this.f104033f;
                if (j11 == 0 || !(interfaceC9808j == null || interfaceC9808j.isEmpty())) {
                    if (interfaceC9808j == null && (interfaceC9808j = this.f104033f) == null) {
                        interfaceC9808j = new Cc.b(bVar.f104041d);
                        this.f104033f = interfaceC9808j;
                    }
                    if (!interfaceC9808j.offer(u11)) {
                        bVar.onError(new oc.b("Inner queue full?!"));
                        return;
                    }
                } else {
                    bVar.f104038a.onNext(u11);
                    if (j11 != Long.MAX_VALUE) {
                        bVar.f104047j.decrementAndGet();
                    }
                    a(1L);
                }
                if (bVar.decrementAndGet() == 0) {
                    return;
                }
            } else {
                InterfaceC9808j interfaceC9808j2 = this.f104033f;
                if (interfaceC9808j2 == null) {
                    interfaceC9808j2 = new Cc.b(bVar.f104041d);
                    this.f104033f = interfaceC9808j2;
                }
                if (!interfaceC9808j2.offer(u11)) {
                    bVar.onError(new oc.b("Inner queue full?!"));
                    return;
                } else if (bVar.getAndIncrement() != 0) {
                    return;
                }
            }
            bVar.e();
        }
    }

    static final class b<T, U> extends AtomicInteger implements io.reactivex.j<T>, InterfaceC6950c {

        /* renamed from: q, reason: collision with root package name */
        static final a<?, ?>[] f104036q = new a[0];

        /* renamed from: r, reason: collision with root package name */
        static final a<?, ?>[] f104037r = new a[0];

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.j f104038a;

        /* renamed from: b, reason: collision with root package name */
        final ru.ozon.app.android.network.websockets.a f104039b;

        /* renamed from: c, reason: collision with root package name */
        final int f104040c;

        /* renamed from: d, reason: collision with root package name */
        final int f104041d;

        /* renamed from: e, reason: collision with root package name */
        volatile InterfaceC9807i<U> f104042e;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f104043f;

        /* renamed from: g, reason: collision with root package name */
        final Gc.c f104044g = new Gc.c();

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f104045h;

        /* renamed from: i, reason: collision with root package name */
        final AtomicReference<a<?, ?>[]> f104046i;

        /* renamed from: j, reason: collision with root package name */
        final AtomicLong f104047j;

        /* renamed from: k, reason: collision with root package name */
        InterfaceC6950c f104048k;

        /* renamed from: l, reason: collision with root package name */
        long f104049l;

        /* renamed from: m, reason: collision with root package name */
        long f104050m;

        /* renamed from: n, reason: collision with root package name */
        int f104051n;

        /* renamed from: o, reason: collision with root package name */
        int f104052o;

        /* renamed from: p, reason: collision with root package name */
        final int f104053p;

        b(io.reactivex.j jVar, ru.ozon.app.android.network.websockets.a aVar, int i11, int i12) {
            AtomicReference<a<?, ?>[]> atomicReference = new AtomicReference<>();
            this.f104046i = atomicReference;
            this.f104047j = new AtomicLong();
            this.f104038a = jVar;
            this.f104039b = aVar;
            this.f104040c = i11;
            this.f104041d = i12;
            this.f104053p = Math.max(1, i11 >> 1);
            atomicReference.lazySet(f104036q);
        }

        final boolean a() {
            if (this.f104045h) {
                InterfaceC9807i<U> interfaceC9807i = this.f104042e;
                if (interfaceC9807i != null) {
                    interfaceC9807i.clear();
                    return true;
                }
            } else {
                if (this.f104044g.get() == null) {
                    return false;
                }
                InterfaceC9807i<U> interfaceC9807i2 = this.f104042e;
                if (interfaceC9807i2 != null) {
                    interfaceC9807i2.clear();
                }
                Gc.c cVar = this.f104044g;
                cVar.getClass();
                Throwable b11 = Gc.i.b(cVar);
                if (b11 != Gc.i.f9907a) {
                    this.f104038a.onError(b11);
                }
            }
            return true;
        }

        final void b() {
            if (getAndIncrement() == 0) {
                e();
            }
        }

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            InterfaceC9807i<U> interfaceC9807i;
            a<?, ?>[] andSet;
            if (this.f104045h) {
                return;
            }
            this.f104045h = true;
            this.f104048k.cancel();
            AtomicReference<a<?, ?>[]> atomicReference = this.f104046i;
            a<?, ?>[] aVarArr = atomicReference.get();
            a<?, ?>[] aVarArr2 = f104037r;
            if (aVarArr != aVarArr2 && (andSet = atomicReference.getAndSet(aVarArr2)) != aVarArr2) {
                for (a<?, ?> aVar : andSet) {
                    aVar.getClass();
                    Fc.g.a(aVar);
                }
                Gc.c cVar = this.f104044g;
                cVar.getClass();
                Throwable b11 = Gc.i.b(cVar);
                if (b11 != null && b11 != Gc.i.f9907a) {
                    C3493a.f(b11);
                }
            }
            if (getAndIncrement() != 0 || (interfaceC9807i = this.f104042e) == null) {
                return;
            }
            interfaceC9807i.clear();
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (Fc.g.g(this.f104048k, interfaceC6950c)) {
                this.f104048k = interfaceC6950c;
                this.f104038a.d(this);
                if (this.f104045h) {
                    return;
                }
                int i11 = this.f104040c;
                if (i11 == Integer.MAX_VALUE) {
                    interfaceC6950c.n(Long.MAX_VALUE);
                } else {
                    interfaceC6950c.n(i11);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x00b5, code lost:
        
            if (r7[r0].f104028a != r10) goto L52;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void e() {
            boolean z11;
            long j11;
            long j12;
            boolean z12;
            long j13;
            a<T, U>[] aVarArr;
            U u11;
            io.reactivex.j jVar = this.f104038a;
            int i11 = 1;
            while (!a()) {
                InterfaceC9807i<U> interfaceC9807i = this.f104042e;
                long j14 = this.f104047j.get();
                boolean z13 = j14 == Long.MAX_VALUE;
                long j15 = 0;
                if (interfaceC9807i != null) {
                    j11 = 0;
                    do {
                        long j16 = 0;
                        u11 = null;
                        while (true) {
                            if (j14 == 0) {
                                z11 = true;
                                break;
                            }
                            z11 = true;
                            U poll = interfaceC9807i.poll();
                            if (a()) {
                                return;
                            }
                            if (poll == null) {
                                u11 = poll;
                                break;
                            }
                            jVar.onNext(poll);
                            j11++;
                            j16++;
                            j14--;
                            u11 = poll;
                        }
                        if (j16 != 0) {
                            j14 = z13 ? Long.MAX_VALUE : this.f104047j.addAndGet(-j16);
                        }
                        if (j14 == 0) {
                            break;
                        }
                    } while (u11 != null);
                } else {
                    z11 = true;
                    j11 = 0;
                }
                boolean z14 = this.f104043f;
                InterfaceC9807i<U> interfaceC9807i2 = this.f104042e;
                a<?, ?>[] aVarArr2 = this.f104046i.get();
                int length = aVarArr2.length;
                if (z14 && ((interfaceC9807i2 == null || interfaceC9807i2.isEmpty()) && length == 0)) {
                    Gc.c cVar = this.f104044g;
                    cVar.getClass();
                    Throwable b11 = Gc.i.b(cVar);
                    if (b11 != Gc.i.f9907a) {
                        if (b11 == null) {
                            jVar.onComplete();
                            return;
                        } else {
                            jVar.onError(b11);
                            return;
                        }
                    }
                    return;
                }
                if (length != 0) {
                    long j17 = this.f104050m;
                    int i12 = this.f104051n;
                    if (length > i12) {
                        j13 = 1;
                    } else {
                        j13 = 1;
                    }
                    if (length <= i12) {
                        i12 = 0;
                    }
                    for (int i13 = 0; i13 < length && aVarArr2[i12].f104028a != j17; i13++) {
                        i12++;
                        if (i12 == length) {
                            i12 = 0;
                        }
                    }
                    this.f104051n = i12;
                    this.f104050m = aVarArr2[i12].f104028a;
                    int i14 = i12;
                    boolean z15 = false;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= length) {
                            aVarArr = aVarArr2;
                            j12 = j15;
                            break;
                        }
                        if (a()) {
                            return;
                        }
                        a<T, U> aVar = aVarArr2[i14];
                        U u12 = null;
                        while (!a()) {
                            InterfaceC9808j<U> interfaceC9808j = aVar.f104033f;
                            if (interfaceC9808j == null) {
                                aVarArr = aVarArr2;
                                j12 = j15;
                            } else {
                                j12 = j15;
                                while (j14 != j12) {
                                    try {
                                        u12 = interfaceC9808j.poll();
                                        if (u12 == null) {
                                            break;
                                        }
                                        jVar.onNext(u12);
                                        if (a()) {
                                            return;
                                        }
                                        j14 -= j13;
                                        j15 += j13;
                                    } catch (Throwable th2) {
                                        C2645f.c(th2);
                                        Fc.g.a(aVar);
                                        Gc.c cVar2 = this.f104044g;
                                        cVar2.getClass();
                                        Gc.i.a(cVar2, th2);
                                        this.f104048k.cancel();
                                        if (a()) {
                                            return;
                                        }
                                        h(aVar);
                                        i15++;
                                        aVarArr = aVarArr2;
                                        z15 = z11;
                                    }
                                }
                                if (j15 != j12) {
                                    if (z13) {
                                        aVarArr = aVarArr2;
                                        j14 = Long.MAX_VALUE;
                                    } else {
                                        aVarArr = aVarArr2;
                                        j14 = this.f104047j.addAndGet(-j15);
                                    }
                                    aVar.a(j15);
                                } else {
                                    aVarArr = aVarArr2;
                                }
                                if (j14 != j12 && u12 != null) {
                                    aVarArr2 = aVarArr;
                                    j15 = j12;
                                }
                            }
                            boolean z16 = aVar.f104032e;
                            InterfaceC9808j<U> interfaceC9808j2 = aVar.f104033f;
                            if (z16 && (interfaceC9808j2 == null || interfaceC9808j2.isEmpty())) {
                                h(aVar);
                                if (a()) {
                                    return;
                                }
                                j11 += j13;
                                z15 = z11;
                            }
                            if (j14 == j12) {
                                break;
                            }
                            i14++;
                            if (i14 == length) {
                                i14 = 0;
                            }
                            i15++;
                            aVarArr2 = aVarArr;
                            j15 = j12;
                        }
                        return;
                    }
                    z12 = z15;
                    this.f104051n = i14;
                    this.f104050m = aVarArr[i14].f104028a;
                } else {
                    j12 = 0;
                    z12 = false;
                }
                long j18 = j11;
                if (j18 != j12 && !this.f104045h) {
                    this.f104048k.n(j18);
                }
                if (!z12 && (i11 = addAndGet(-i11)) == 0) {
                    return;
                }
            }
        }

        final InterfaceC9807i f() {
            InterfaceC9807i<U> interfaceC9807i = this.f104042e;
            if (interfaceC9807i == null) {
                interfaceC9807i = this.f104040c == Integer.MAX_VALUE ? new Cc.c<>(this.f104041d) : new Cc.b<>(this.f104040c);
                this.f104042e = interfaceC9807i;
            }
            return interfaceC9807i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        final void h(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            while (true) {
                AtomicReference<a<?, ?>[]> atomicReference = this.f104046i;
                a<?, ?>[] aVarArr2 = atomicReference.get();
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
                    aVarArr = f104036q;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
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

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
            if (Fc.g.f(j11)) {
                Gc.d.a(this.f104047j, j11);
                b();
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            if (this.f104043f) {
                return;
            }
            this.f104043f = true;
            b();
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            if (this.f104043f) {
                C3493a.f(th2);
                return;
            }
            Gc.c cVar = this.f104044g;
            cVar.getClass();
            if (!Gc.i.a(cVar, th2)) {
                C3493a.f(th2);
            } else {
                this.f104043f = true;
                b();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            if (this.f104043f) {
                return;
            }
            try {
                Object apply = this.f104039b.apply(t2);
                C9656b.c(apply, "The mapper returned a null Publisher");
                InterfaceC6948a interfaceC6948a = (InterfaceC6948a) apply;
                if (!(interfaceC6948a instanceof Callable)) {
                    long j11 = this.f104049l;
                    this.f104049l = 1 + j11;
                    a<?, ?> aVar = new a<>(this, j11);
                    while (true) {
                        AtomicReference<a<?, ?>[]> atomicReference = this.f104046i;
                        a<?, ?>[] aVarArr = atomicReference.get();
                        if (aVarArr == f104037r) {
                            Fc.g.a(aVar);
                            return;
                        }
                        int length = aVarArr.length;
                        a<?, ?>[] aVarArr2 = new a[length + 1];
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                        aVarArr2[length] = aVar;
                        while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                            if (atomicReference.get() != aVarArr) {
                                break;
                            }
                        }
                        interfaceC6948a.a(aVar);
                        return;
                    }
                }
                try {
                    Object call = ((Callable) interfaceC6948a).call();
                    if (call == null) {
                        if (this.f104040c == Integer.MAX_VALUE || this.f104045h) {
                            return;
                        }
                        int i11 = this.f104052o + 1;
                        this.f104052o = i11;
                        int i12 = this.f104053p;
                        if (i11 == i12) {
                            this.f104052o = 0;
                            this.f104048k.n(i12);
                            return;
                        }
                        return;
                    }
                    if (get() == 0 && compareAndSet(0, 1)) {
                        long j12 = this.f104047j.get();
                        InterfaceC9807i<U> interfaceC9807i = this.f104042e;
                        if (j12 == 0 || !(interfaceC9807i == 0 || interfaceC9807i.isEmpty())) {
                            if (interfaceC9807i == 0) {
                                interfaceC9807i = (InterfaceC9807i<U>) f();
                            }
                            if (!interfaceC9807i.offer(call)) {
                                onError(new IllegalStateException("Scalar queue full?!"));
                                return;
                            }
                        } else {
                            this.f104038a.onNext(call);
                            if (j12 != Long.MAX_VALUE) {
                                this.f104047j.decrementAndGet();
                            }
                            if (this.f104040c != Integer.MAX_VALUE && !this.f104045h) {
                                int i13 = this.f104052o + 1;
                                this.f104052o = i13;
                                int i14 = this.f104053p;
                                if (i13 == i14) {
                                    this.f104052o = 0;
                                    this.f104048k.n(i14);
                                }
                            }
                        }
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    } else if (!f().offer(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    } else if (getAndIncrement() != 0) {
                        return;
                    }
                    e();
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    Gc.c cVar = this.f104044g;
                    cVar.getClass();
                    Gc.i.a(cVar, th2);
                    b();
                }
            } catch (Throwable th3) {
                C2645f.c(th3);
                this.f104048k.cancel();
                onError(th3);
            }
        }
    }

    public r(io.reactivex.h hVar, ru.ozon.app.android.network.websockets.a aVar, int i11, int i12) {
        super(hVar);
        this.f104025d = aVar;
        this.f104026e = i11;
        this.f104027f = i12;
    }

    @Override // io.reactivex.h
    protected final void j(io.reactivex.j jVar) {
        io.reactivex.h<T> hVar = this.f103914c;
        ru.ozon.app.android.network.websockets.a aVar = this.f104025d;
        if (M.b(hVar, jVar, aVar)) {
            return;
        }
        hVar.i(new b(jVar, aVar, this.f104026e, this.f104027f));
    }
}
