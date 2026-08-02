package zc;

import Bl0.C2645f;
import Hc.AbstractC3137a;
import Kc.C3493a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import sc.C9656b;

/* loaded from: classes.dex */
public final class T0<T> extends AbstractC3137a<T> implements rc.g {

    /* renamed from: e, reason: collision with root package name */
    static final o f107976e = new o();

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.p f107977a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<j<T>> f107978b;

    /* renamed from: c, reason: collision with root package name */
    final b<T> f107979c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.u<T> f107980d;

    static abstract class a<T> extends AtomicReference<f> implements h<T> {

        /* renamed from: a, reason: collision with root package name */
        f f107981a;

        /* renamed from: b, reason: collision with root package name */
        int f107982b;

        a() {
            f fVar = new f(null);
            this.f107981a = fVar;
            set(fVar);
        }

        @Override // zc.T0.h
        public final void a(Throwable th2) {
            f fVar = new f(d(Gc.k.f(th2)));
            this.f107981a.set(fVar);
            this.f107981a = fVar;
            this.f107982b++;
            i();
        }

        @Override // zc.T0.h
        public final void b(T t2) {
            f fVar = new f(d(t2));
            this.f107981a.set(fVar);
            this.f107981a = fVar;
            this.f107982b++;
            h();
        }

        Object d(Object obj) {
            return obj;
        }

        @Override // zc.T0.h
        public final void e(d<T> dVar) {
            if (dVar.getAndIncrement() != 0) {
                return;
            }
            int i11 = 1;
            do {
                f fVar = (f) dVar.f107986c;
                if (fVar == null) {
                    fVar = f();
                    dVar.f107986c = fVar;
                }
                while (!dVar.f107987d) {
                    f fVar2 = fVar.get();
                    if (fVar2 != null) {
                        if (Gc.k.a(dVar.f107985b, g(fVar2.f107990a))) {
                            dVar.f107986c = null;
                            return;
                        }
                        fVar = fVar2;
                    } else {
                        dVar.f107986c = fVar;
                        i11 = dVar.addAndGet(-i11);
                    }
                }
                dVar.f107986c = null;
                return;
            } while (i11 != 0);
        }

        f f() {
            return get();
        }

        Object g(Object obj) {
            return obj;
        }

        abstract void h();

        void i() {
            f fVar = get();
            if (fVar.f107990a != null) {
                f fVar2 = new f(null);
                fVar2.lazySet(fVar.get());
                set(fVar2);
            }
        }

        @Override // zc.T0.h
        public final void m() {
            f fVar = new f(d(Gc.k.COMPLETE));
            this.f107981a.set(fVar);
            this.f107981a = fVar;
            this.f107982b++;
            i();
        }
    }

    interface b<T> {
        h<T> call();
    }

    /* loaded from: classes9.dex */
    static final class c<R> implements qc.g<InterfaceC8487b> {

        /* renamed from: a, reason: collision with root package name */
        private final P1<R> f107983a;

        c(P1<R> p12) {
            this.f107983a = p12;
        }

        @Override // qc.g
        public final void accept(InterfaceC8487b interfaceC8487b) throws Exception {
            P1<R> p12 = this.f107983a;
            p12.getClass();
            rc.d.e(p12, interfaceC8487b);
        }
    }

    static final class d<T> extends AtomicInteger implements InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final j<T> f107984a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.w<? super T> f107985b;

        /* renamed from: c, reason: collision with root package name */
        Serializable f107986c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f107987d;

        d(j<T> jVar, io.reactivex.w<? super T> wVar) {
            this.f107984a = jVar;
            this.f107985b = wVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (this.f107987d) {
                return;
            }
            this.f107987d = true;
            this.f107984a.a(this);
            this.f107986c = null;
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107987d;
        }
    }

    /* loaded from: classes9.dex */
    static final class e<R, U> extends io.reactivex.p<R> {

        /* renamed from: a, reason: collision with root package name */
        private final Callable<? extends AbstractC3137a<U>> f107988a;

        /* renamed from: b, reason: collision with root package name */
        private final qc.o<? super io.reactivex.p<U>, ? extends io.reactivex.u<R>> f107989b;

        e(qc.o oVar, Callable callable) {
            this.f107988a = callable;
            this.f107989b = oVar;
        }

        @Override // io.reactivex.p
        protected final void subscribeActual(io.reactivex.w<? super R> wVar) {
            try {
                AbstractC3137a<U> call = this.f107988a.call();
                C9656b.c(call, "The connectableFactory returned a null ConnectableObservable");
                AbstractC3137a<U> abstractC3137a = call;
                io.reactivex.u<R> apply = this.f107989b.apply(abstractC3137a);
                C9656b.c(apply, "The selector returned a null ObservableSource");
                io.reactivex.u<R> uVar = apply;
                P1 p12 = new P1(wVar);
                uVar.subscribe(p12);
                abstractC3137a.c(new c(p12));
            } catch (Throwable th2) {
                C2645f.c(th2);
                rc.e.d(th2, wVar);
            }
        }
    }

    static final class f extends AtomicReference<f> {

        /* renamed from: a, reason: collision with root package name */
        final Object f107990a;

        f(Object obj) {
            this.f107990a = obj;
        }
    }

    /* loaded from: classes9.dex */
    static final class g<T> extends AbstractC3137a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC3137a<T> f107991a;

        /* renamed from: b, reason: collision with root package name */
        private final io.reactivex.p<T> f107992b;

        g(AbstractC3137a<T> abstractC3137a, io.reactivex.p<T> pVar) {
            this.f107991a = abstractC3137a;
            this.f107992b = pVar;
        }

        @Override // Hc.AbstractC3137a
        public final void c(qc.g<? super InterfaceC8487b> gVar) {
            this.f107991a.c(gVar);
        }

        @Override // io.reactivex.p
        protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
            this.f107992b.subscribe(wVar);
        }
    }

    interface h<T> {
        void a(Throwable th2);

        void b(T t2);

        void e(d<T> dVar);

        void m();
    }

    static final class i<T> implements b<T> {

        /* renamed from: a, reason: collision with root package name */
        private final int f107993a;

        i(int i11) {
            this.f107993a = i11;
        }

        @Override // zc.T0.b
        public final h<T> call() {
            return new n(this.f107993a);
        }
    }

    static final class j<T> extends AtomicReference<InterfaceC8487b> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: e, reason: collision with root package name */
        static final d[] f107994e = new d[0];

        /* renamed from: f, reason: collision with root package name */
        static final d[] f107995f = new d[0];

        /* renamed from: a, reason: collision with root package name */
        final h<T> f107996a;

        /* renamed from: b, reason: collision with root package name */
        boolean f107997b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference<d[]> f107998c = new AtomicReference<>(f107994e);

        /* renamed from: d, reason: collision with root package name */
        final AtomicBoolean f107999d = new AtomicBoolean();

        j(h<T> hVar) {
            this.f107996a = hVar;
        }

        final void a(d<T> dVar) {
            d[] dVarArr;
            while (true) {
                AtomicReference<d[]> atomicReference = this.f107998c;
                d[] dVarArr2 = atomicReference.get();
                int length = dVarArr2.length;
                if (length == 0) {
                    return;
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        i11 = -1;
                        break;
                    } else if (dVarArr2[i11].equals(dVar)) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 < 0) {
                    return;
                }
                if (length == 1) {
                    dVarArr = f107994e;
                } else {
                    d[] dVarArr3 = new d[length - 1];
                    System.arraycopy(dVarArr2, 0, dVarArr3, 0, i11);
                    System.arraycopy(dVarArr2, i11 + 1, dVarArr3, i11, (length - i11) - 1);
                    dVarArr = dVarArr3;
                }
                while (!atomicReference.compareAndSet(dVarArr2, dVarArr)) {
                    if (atomicReference.get() != dVarArr2) {
                        break;
                    }
                }
                return;
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f107998c.set(f107995f);
            rc.d.a(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107998c.get() == f107995f;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f107997b) {
                return;
            }
            this.f107997b = true;
            h<T> hVar = this.f107996a;
            hVar.m();
            for (d<T> dVar : this.f107998c.getAndSet(f107995f)) {
                hVar.e(dVar);
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f107997b) {
                C3493a.f(th2);
                return;
            }
            this.f107997b = true;
            h<T> hVar = this.f107996a;
            hVar.a(th2);
            for (d<T> dVar : this.f107998c.getAndSet(f107995f)) {
                hVar.e(dVar);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f107997b) {
                return;
            }
            h<T> hVar = this.f107996a;
            hVar.b(t2);
            for (d<T> dVar : this.f107998c.get()) {
                hVar.e(dVar);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.f(this, interfaceC8487b)) {
                for (d<T> dVar : this.f107998c.get()) {
                    this.f107996a.e(dVar);
                }
            }
        }
    }

    static final class k<T> implements io.reactivex.u<T> {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicReference<j<T>> f108000a;

        /* renamed from: b, reason: collision with root package name */
        private final b<T> f108001b;

        k(AtomicReference<j<T>> atomicReference, b<T> bVar) {
            this.f108000a = atomicReference;
            this.f108001b = bVar;
        }

        @Override // io.reactivex.u
        public final void subscribe(io.reactivex.w<? super T> wVar) {
            j<T> jVar;
            loop0: while (true) {
                jVar = this.f108000a.get();
                if (jVar != null) {
                    break;
                }
                j<T> jVar2 = new j<>(this.f108001b.call());
                AtomicReference<j<T>> atomicReference = this.f108000a;
                while (!atomicReference.compareAndSet(null, jVar2)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                jVar = jVar2;
                break loop0;
            }
            d<T> dVar = new d<>(jVar, wVar);
            wVar.onSubscribe(dVar);
            loop2: while (true) {
                AtomicReference<d[]> atomicReference2 = jVar.f107998c;
                d[] dVarArr = atomicReference2.get();
                if (dVarArr != j.f107995f) {
                    int length = dVarArr.length;
                    d[] dVarArr2 = new d[length + 1];
                    System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
                    dVarArr2[length] = dVar;
                    while (!atomicReference2.compareAndSet(dVarArr, dVarArr2)) {
                        if (atomicReference2.get() != dVarArr) {
                            break;
                        }
                    }
                    break loop2;
                }
                break;
            }
            if (dVar.f107987d) {
                jVar.a(dVar);
            } else {
                jVar.f107996a.e(dVar);
            }
        }
    }

    /* loaded from: classes9.dex */
    static final class l<T> implements b<T> {

        /* renamed from: a, reason: collision with root package name */
        private final int f108002a;

        /* renamed from: b, reason: collision with root package name */
        private final long f108003b;

        /* renamed from: c, reason: collision with root package name */
        private final TimeUnit f108004c;

        /* renamed from: d, reason: collision with root package name */
        private final io.reactivex.x f108005d;

        l(int i11, long j11, TimeUnit timeUnit, io.reactivex.x xVar) {
            this.f108002a = i11;
            this.f108003b = j11;
            this.f108004c = timeUnit;
            this.f108005d = xVar;
        }

        @Override // zc.T0.b
        public final h<T> call() {
            return new m(this.f108002a, this.f108003b, this.f108004c, this.f108005d);
        }
    }

    /* loaded from: classes9.dex */
    static final class m<T> extends a<T> {

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.x f108006c;

        /* renamed from: d, reason: collision with root package name */
        final long f108007d;

        /* renamed from: e, reason: collision with root package name */
        final TimeUnit f108008e;

        /* renamed from: f, reason: collision with root package name */
        final int f108009f;

        m(int i11, long j11, TimeUnit timeUnit, io.reactivex.x xVar) {
            this.f108006c = xVar;
            this.f108009f = i11;
            this.f108007d = j11;
            this.f108008e = timeUnit;
        }

        @Override // zc.T0.a
        final Object d(Object obj) {
            this.f108006c.getClass();
            TimeUnit timeUnit = this.f108008e;
            return new Mc.b(obj, io.reactivex.x.c(timeUnit), timeUnit);
        }

        @Override // zc.T0.a
        final f f() {
            f fVar;
            this.f108006c.getClass();
            long c11 = io.reactivex.x.c(this.f108008e) - this.f108007d;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 != null) {
                    Mc.b bVar = (Mc.b) fVar2.f107990a;
                    if (Gc.k.h(bVar.b()) || Gc.k.i(bVar.b()) || bVar.a() > c11) {
                        break;
                    }
                    fVar3 = fVar2.get();
                } else {
                    break;
                }
            }
            return fVar;
        }

        @Override // zc.T0.a
        final Object g(Object obj) {
            return ((Mc.b) obj).b();
        }

        @Override // zc.T0.a
        final void h() {
            f fVar;
            this.f108006c.getClass();
            long c11 = io.reactivex.x.c(this.f108008e) - this.f108007d;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            int i11 = 0;
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 != null) {
                    int i12 = this.f107982b;
                    if (i12 <= this.f108009f) {
                        if (((Mc.b) fVar2.f107990a).a() > c11) {
                            break;
                        }
                        i11++;
                        this.f107982b--;
                        fVar3 = fVar2.get();
                    } else {
                        i11++;
                        this.f107982b = i12 - 1;
                        fVar3 = fVar2.get();
                    }
                } else {
                    break;
                }
            }
            if (i11 != 0) {
                set(fVar);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
        
            set(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
        
            return;
         */
        @Override // zc.T0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void i() {
            this.f108006c.getClass();
            long c11 = io.reactivex.x.c(this.f108008e) - this.f108007d;
            f fVar = get();
            f fVar2 = fVar.get();
            int i11 = 0;
            while (true) {
                f fVar3 = fVar2;
                f fVar4 = fVar;
                fVar = fVar3;
                if (fVar == null || this.f107982b <= 1 || ((Mc.b) fVar.f107990a).a() > c11) {
                    break;
                }
                i11++;
                this.f107982b--;
                fVar2 = fVar.get();
            }
        }
    }

    static final class n<T> extends a<T> {

        /* renamed from: c, reason: collision with root package name */
        final int f108010c;

        n(int i11) {
            this.f108010c = i11;
        }

        @Override // zc.T0.a
        final void h() {
            if (this.f107982b > this.f108010c) {
                this.f107982b--;
                set(get().get());
            }
        }
    }

    static final class o implements b<Object> {
        @Override // zc.T0.b
        public final h<Object> call() {
            return new p();
        }
    }

    /* loaded from: classes9.dex */
    static final class p<T> extends ArrayList<Object> implements h<T> {

        /* renamed from: a, reason: collision with root package name */
        volatile int f108011a;

        p() {
            super(16);
        }

        @Override // zc.T0.h
        public final void a(Throwable th2) {
            add(Gc.k.f(th2));
            this.f108011a++;
        }

        @Override // zc.T0.h
        public final void b(T t2) {
            add(t2);
            this.f108011a++;
        }

        @Override // zc.T0.h
        public final void e(d<T> dVar) {
            if (dVar.getAndIncrement() != 0) {
                return;
            }
            io.reactivex.w<? super T> wVar = dVar.f107985b;
            int i11 = 1;
            while (!dVar.f107987d) {
                int i12 = this.f108011a;
                Integer num = (Integer) dVar.f107986c;
                int intValue = num != null ? num.intValue() : 0;
                while (intValue < i12) {
                    if (Gc.k.a(wVar, get(intValue)) || dVar.f107987d) {
                        return;
                    } else {
                        intValue++;
                    }
                }
                dVar.f107986c = Integer.valueOf(intValue);
                i11 = dVar.addAndGet(-i11);
                if (i11 == 0) {
                    return;
                }
            }
        }

        @Override // zc.T0.h
        public final void m() {
            add(Gc.k.COMPLETE);
            this.f108011a++;
        }
    }

    private T0(io.reactivex.u uVar, io.reactivex.p pVar, AtomicReference atomicReference, b bVar) {
        this.f107980d = uVar;
        this.f107977a = pVar;
        this.f107978b = atomicReference;
        this.f107979c = bVar;
    }

    public static T0 d(int i11, long j11, io.reactivex.p pVar, io.reactivex.x xVar, TimeUnit timeUnit) {
        return f(pVar, new l(i11, j11, timeUnit, xVar));
    }

    public static T0 e(io.reactivex.p pVar, int i11) {
        return i11 == Integer.MAX_VALUE ? f(pVar, f107976e) : f(pVar, new i(i11));
    }

    static T0 f(io.reactivex.p pVar, b bVar) {
        AtomicReference atomicReference = new AtomicReference();
        return new T0(new k(atomicReference, bVar), pVar, atomicReference, bVar);
    }

    public static T0 g(io.reactivex.p pVar) {
        return f(pVar, f107976e);
    }

    public static io.reactivex.p h(qc.o oVar, Callable callable) {
        return new e(oVar, callable);
    }

    public static <T> AbstractC3137a<T> i(AbstractC3137a<T> abstractC3137a, io.reactivex.x xVar) {
        return new g(abstractC3137a, abstractC3137a.observeOn(xVar));
    }

    @Override // rc.g
    public final void b(InterfaceC8487b interfaceC8487b) {
        TY.a.f(this.f107978b, (j) interfaceC8487b);
    }

    @Override // Hc.AbstractC3137a
    public final void c(qc.g<? super InterfaceC8487b> gVar) {
        j<T> jVar;
        loop0: while (true) {
            AtomicReference<j<T>> atomicReference = this.f107978b;
            jVar = atomicReference.get();
            if (jVar != null && !jVar.isDisposed()) {
                break;
            }
            j<T> jVar2 = new j<>(this.f107979c.call());
            while (!atomicReference.compareAndSet(jVar, jVar2)) {
                if (atomicReference.get() != jVar) {
                    break;
                }
            }
            jVar = jVar2;
            break loop0;
        }
        AtomicBoolean atomicBoolean = jVar.f107999d;
        boolean z11 = !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
        try {
            gVar.accept(jVar);
            if (z11) {
                this.f107977a.subscribe(jVar);
            }
        } catch (Throwable th2) {
            if (z11) {
                atomicBoolean.compareAndSet(true, false);
            }
            C2645f.c(th2);
            throw Gc.i.d(th2);
        }
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f107980d.subscribe(wVar);
    }
}
