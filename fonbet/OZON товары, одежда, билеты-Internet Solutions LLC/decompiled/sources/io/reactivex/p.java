package io.reactivex;

import Bl0.C2645f;
import Hc.AbstractC3137a;
import I0.C3173b;
import Kc.C3493a;
import hg.InterfaceC6948a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import nc.InterfaceC8487b;
import qc.InterfaceC9019a;
import qc.InterfaceC9020b;
import qc.InterfaceC9021c;
import sc.C9653a;
import sc.C9656b;
import tc.InterfaceCallableC9806h;
import wc.C10472A;
import wc.C10473B;
import wc.C10474C;
import wc.C10499u;
import yc.C10881b;
import zc.A0;
import zc.A1;
import zc.B0;
import zc.B1;
import zc.C0;
import zc.C1;
import zc.C11018A;
import zc.C11020a0;
import zc.C11021a1;
import zc.C11022b;
import zc.C11023b0;
import zc.C11024b1;
import zc.C11025c;
import zc.C11026c0;
import zc.C11028d;
import zc.C11030d1;
import zc.C11031e;
import zc.C11032e0;
import zc.C11033e1;
import zc.C11035f0;
import zc.C11036f1;
import zc.C11037g;
import zc.C11038g0;
import zc.C11039g1;
import zc.C11040h;
import zc.C11041h0;
import zc.C11042h1;
import zc.C11044i0;
import zc.C11045i1;
import zc.C11046j;
import zc.C11047j0;
import zc.C11048j1;
import zc.C11050k0;
import zc.C11051k1;
import zc.C11052l;
import zc.C11053l0;
import zc.C11054l1;
import zc.C11055m;
import zc.C11056m0;
import zc.C11057m1;
import zc.C11058n;
import zc.C11059n0;
import zc.C11060n1;
import zc.C11061o;
import zc.C11062o0;
import zc.C11063o1;
import zc.C11064p;
import zc.C11065p0;
import zc.C11066p1;
import zc.C11067q;
import zc.C11068q0;
import zc.C11069r0;
import zc.C11070s;
import zc.C11071s0;
import zc.C11072t;
import zc.C11073t0;
import zc.C11074u;
import zc.C11075u0;
import zc.C11076v;
import zc.C11077v0;
import zc.C11078w;
import zc.C11079w0;
import zc.C11080x;
import zc.C11081x0;
import zc.C11082y;
import zc.C11083y0;
import zc.C11085z0;
import zc.CallableC11029d0;
import zc.D;
import zc.D0;
import zc.D1;
import zc.E;
import zc.E0;
import zc.E1;
import zc.F;
import zc.F0;
import zc.F1;
import zc.G;
import zc.G0;
import zc.G1;
import zc.H;
import zc.H0;
import zc.H1;
import zc.I;
import zc.I0;
import zc.I1;
import zc.J;
import zc.J0;
import zc.J1;
import zc.K;
import zc.K0;
import zc.K1;
import zc.L;
import zc.L0;
import zc.L1;
import zc.M;
import zc.M0;
import zc.M1;
import zc.N;
import zc.N0;
import zc.N1;
import zc.O;
import zc.O0;
import zc.O1;
import zc.P0;
import zc.Q;
import zc.Q0;
import zc.R0;
import zc.S;
import zc.S0;
import zc.T;
import zc.T0;
import zc.U;
import zc.U0;
import zc.V;
import zc.V0;
import zc.W;
import zc.W0;
import zc.X0;
import zc.Y;
import zc.Y0;
import zc.Z;
import zc.Z0;
import zc.q1;
import zc.r1;
import zc.s1;
import zc.t1;
import zc.u1;
import zc.v1;
import zc.w1;
import zc.x1;
import zc.y1;
import zc.z1;

/* loaded from: classes.dex */
public abstract class p<T> implements u<T> {

    /* loaded from: classes9.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f66523a;

        static {
            int[] iArr = new int[EnumC7093a.values().length];
            f66523a = iArr;
            try {
                iArr[EnumC7093a.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66523a[EnumC7093a.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66523a[EnumC7093a.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f66523a[EnumC7093a.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static <T> p<T> amb(Iterable<? extends u<? extends T>> iterable) {
        C9656b.c(iterable, "sources is null");
        return new C11040h(null, iterable);
    }

    public static <T> p<T> ambArray(u<? extends T>... uVarArr) {
        C9656b.c(uVarArr, "sources is null");
        int length = uVarArr.length;
        return length == 0 ? empty() : length == 1 ? wrap(uVarArr[0]) : new C11040h(uVarArr, null);
    }

    public static int bufferSize() {
        return h.f66519a;
    }

    public static <T, R> p<R> combineLatest(qc.o<? super Object[], ? extends R> oVar, int i11, u<? extends T>... uVarArr) {
        return combineLatest(uVarArr, oVar, i11);
    }

    public static <T, R> p<R> combineLatestDelayError(u<? extends T>[] uVarArr, qc.o<? super Object[], ? extends R> oVar) {
        return combineLatestDelayError(uVarArr, oVar, bufferSize());
    }

    public static <T> p<T> concat(Iterable<? extends u<? extends T>> iterable) {
        C9656b.c(iterable, "sources is null");
        return fromIterable(iterable).concatMapDelayError(C9653a.i(), bufferSize(), false);
    }

    public static <T> p<T> concatArray(u<? extends T>... uVarArr) {
        return uVarArr.length == 0 ? empty() : uVarArr.length == 1 ? wrap(uVarArr[0]) : new C11074u(fromArray(uVarArr), C9653a.i(), bufferSize(), Gc.h.BOUNDARY);
    }

    public static <T> p<T> concatArrayDelayError(u<? extends T>... uVarArr) {
        return uVarArr.length == 0 ? empty() : uVarArr.length == 1 ? wrap(uVarArr[0]) : concatDelayError(fromArray(uVarArr));
    }

    public static <T> p<T> concatArrayEager(u<? extends T>... uVarArr) {
        return concatArrayEager(bufferSize(), bufferSize(), uVarArr);
    }

    public static <T> p<T> concatArrayEagerDelayError(u<? extends T>... uVarArr) {
        return concatArrayEagerDelayError(bufferSize(), bufferSize(), uVarArr);
    }

    public static <T> p<T> concatDelayError(Iterable<? extends u<? extends T>> iterable) {
        C9656b.c(iterable, "sources is null");
        return concatDelayError(fromIterable(iterable));
    }

    public static <T> p<T> concatEager(u<? extends u<? extends T>> uVar) {
        return concatEager(uVar, bufferSize(), bufferSize());
    }

    public static <T> p<T> create(s<T> sVar) {
        C9656b.c(sVar, "source is null");
        return new zc.B(sVar);
    }

    public static <T> p<T> defer(Callable<? extends u<? extends T>> callable) {
        C9656b.c(callable, "supplier is null");
        return new E(callable);
    }

    private p<T> doOnEach(qc.g<? super T> gVar, qc.g<? super Throwable> gVar2, InterfaceC9019a interfaceC9019a, InterfaceC9019a interfaceC9019a2) {
        C9656b.c(gVar, "onNext is null");
        C9656b.c(gVar2, "onError is null");
        C9656b.c(interfaceC9019a, "onComplete is null");
        C9656b.c(interfaceC9019a2, "onAfterTerminate is null");
        return new N(this, gVar, gVar2, interfaceC9019a, interfaceC9019a2);
    }

    public static <T> p<T> empty() {
        return T.f107975a;
    }

    public static <T> p<T> error(Callable<? extends Throwable> callable) {
        C9656b.c(callable, "errorSupplier is null");
        return new U(callable);
    }

    public static <T> p<T> fromArray(T... tArr) {
        C9656b.c(tArr, "items is null");
        return tArr.length == 0 ? empty() : tArr.length == 1 ? just(tArr[0]) : new C11026c0(tArr);
    }

    public static <T> p<T> fromCallable(Callable<? extends T> callable) {
        C9656b.c(callable, "supplier is null");
        return new CallableC11029d0(callable);
    }

    public static <T> p<T> fromFuture(Future<? extends T> future) {
        C9656b.c(future, "future is null");
        return new C11032e0(future, 0L, null);
    }

    public static <T> p<T> fromIterable(Iterable<? extends T> iterable) {
        C9656b.c(iterable, "source is null");
        return new C11035f0(iterable);
    }

    public static <T> p<T> fromPublisher(InterfaceC6948a<? extends T> interfaceC6948a) {
        C9656b.c(interfaceC6948a, "publisher is null");
        return new C11038g0(interfaceC6948a);
    }

    public static <T> p<T> generate(qc.g<g<T>> gVar) {
        C9656b.c(gVar, "generator is null");
        return generate(C9653a.s(), C11062o0.m(gVar), C9653a.g());
    }

    public static p<Long> interval(long j11, long j12, TimeUnit timeUnit) {
        return interval(j11, j12, timeUnit, Mc.a.a());
    }

    public static p<Long> intervalRange(long j11, long j12, long j13, long j14, TimeUnit timeUnit) {
        return intervalRange(j11, j12, j13, j14, timeUnit, Mc.a.a());
    }

    public static <T> p<T> just(T t2) {
        C9656b.c(t2, "item is null");
        return new C11071s0(t2);
    }

    public static <T> p<T> merge(Iterable<? extends u<? extends T>> iterable, int i11, int i12) {
        return fromIterable(iterable).flatMap(C9653a.i(), false, i11, i12);
    }

    public static <T> p<T> mergeArray(int i11, int i12, u<? extends T>... uVarArr) {
        return fromArray(uVarArr).flatMap(C9653a.i(), false, i11, i12);
    }

    public static <T> p<T> mergeArrayDelayError(int i11, int i12, u<? extends T>... uVarArr) {
        return fromArray(uVarArr).flatMap(C9653a.i(), true, i11, i12);
    }

    public static <T> p<T> mergeDelayError(Iterable<? extends u<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(C9653a.i(), true);
    }

    public static <T> p<T> never() {
        return C0.f107578a;
    }

    public static p<Integer> range(int i11, int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException(Ej.b.a(i12, "count >= 0 required but it was "));
        }
        if (i12 == 0) {
            return empty();
        }
        if (i12 == 1) {
            return just(Integer.valueOf(i11));
        }
        if (i11 + (i12 - 1) <= 2147483647L) {
            return new K0(i11, i12);
        }
        throw new IllegalArgumentException("Integer overflow");
    }

    public static p<Long> rangeLong(long j11, long j12) {
        if (j12 < 0) {
            throw new IllegalArgumentException(C3173b.b(j12, "count >= 0 required but it was "));
        }
        if (j12 == 0) {
            return empty();
        }
        if (j12 == 1) {
            return just(Long.valueOf(j11));
        }
        long j13 = (j12 - 1) + j11;
        if (j11 <= 0 || j13 >= 0) {
            return new L0(j11, j12);
        }
        throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
    }

    public static <T> y<Boolean> sequenceEqual(u<? extends T> uVar, u<? extends T> uVar2) {
        return sequenceEqual(uVar, uVar2, C9656b.b(), bufferSize());
    }

    public static <T> p<T> switchOnNext(u<? extends u<? extends T>> uVar, int i11) {
        C9656b.c(uVar, "sources is null");
        C9656b.d(i11, "bufferSize");
        return new C11063o1(uVar, C9653a.i(), i11, false);
    }

    public static <T> p<T> switchOnNextDelayError(u<? extends u<? extends T>> uVar) {
        return switchOnNextDelayError(uVar, bufferSize());
    }

    private p<T> timeout0(long j11, TimeUnit timeUnit, u<? extends T> uVar, x xVar) {
        C9656b.c(timeUnit, "timeUnit is null");
        C9656b.c(xVar, "scheduler is null");
        return new A1(this, j11, timeUnit, xVar, uVar);
    }

    public static p<Long> timer(long j11, TimeUnit timeUnit) {
        return timer(j11, timeUnit, Mc.a.a());
    }

    public static <T> p<T> unsafeCreate(u<T> uVar) {
        C9656b.c(uVar, "onSubscribe is null");
        if (uVar instanceof p) {
            throw new IllegalArgumentException("unsafeCreate(Observable) should be upgraded");
        }
        return new C11041h0(uVar);
    }

    public static <T, D> p<T> using(Callable<? extends D> callable, qc.o<? super D, ? extends u<? extends T>> oVar, qc.g<? super D> gVar) {
        return using(callable, oVar, gVar, true);
    }

    public static <T> p<T> wrap(u<T> uVar) {
        C9656b.c(uVar, "source is null");
        return uVar instanceof p ? (p) uVar : new C11041h0(uVar);
    }

    public static <T, R> p<R> zip(Iterable<? extends u<? extends T>> iterable, qc.o<? super Object[], ? extends R> oVar) {
        C9656b.c(oVar, "zipper is null");
        C9656b.c(iterable, "sources is null");
        return new N1(null, iterable, oVar, bufferSize(), false);
    }

    public static <T, R> p<R> zipArray(qc.o<? super Object[], ? extends R> oVar, boolean z11, int i11, u<? extends T>... uVarArr) {
        if (uVarArr.length == 0) {
            return empty();
        }
        C9656b.c(oVar, "zipper is null");
        C9656b.d(i11, "bufferSize");
        return new N1(uVarArr, null, oVar, i11, z11);
    }

    public static <T, R> p<R> zipIterable(Iterable<? extends u<? extends T>> iterable, qc.o<? super Object[], ? extends R> oVar, boolean z11, int i11) {
        C9656b.c(oVar, "zipper is null");
        C9656b.c(iterable, "sources is null");
        C9656b.d(i11, "bufferSize");
        return new N1(null, iterable, oVar, i11, z11);
    }

    public final y<Boolean> all(qc.q<? super T> qVar) {
        C9656b.c(qVar, "predicate is null");
        return new C11037g(this, qVar);
    }

    public final p<T> ambWith(u<? extends T> uVar) {
        C9656b.c(uVar, "other is null");
        return ambArray(this, uVar);
    }

    public final y<Boolean> any(qc.q<? super T> qVar) {
        C9656b.c(qVar, "predicate is null");
        return new C11046j(this, qVar);
    }

    public final <R> R as(q<T, ? extends R> qVar) {
        C9656b.c(qVar, "converter is null");
        return (R) qVar.apply();
    }

    public final T blockingFirst() {
        uc.e eVar = new uc.e();
        subscribe(eVar);
        T a11 = eVar.a();
        if (a11 != null) {
            return a11;
        }
        throw new NoSuchElementException();
    }

    public final void blockingForEach(qc.g<? super T> gVar) {
        Iterator<T> it = blockingIterable().iterator();
        while (it.hasNext()) {
            try {
                gVar.accept(it.next());
            } catch (Throwable th2) {
                C2645f.c(th2);
                ((InterfaceC8487b) it).dispose();
                throw Gc.i.d(th2);
            }
        }
    }

    public final Iterable<T> blockingIterable() {
        return blockingIterable(bufferSize());
    }

    public final T blockingLast() {
        uc.f fVar = new uc.f();
        subscribe(fVar);
        T a11 = fVar.a();
        if (a11 != null) {
            return a11;
        }
        throw new NoSuchElementException();
    }

    public final Iterable<T> blockingLatest() {
        return new C11025c(this);
    }

    public final Iterable<T> blockingMostRecent(T t2) {
        return new C11028d(this, t2);
    }

    public final Iterable<T> blockingNext() {
        return new C11031e(this);
    }

    public final T blockingSingle() {
        k<T> singleElement = singleElement();
        singleElement.getClass();
        uc.g gVar = new uc.g();
        singleElement.a(gVar);
        T t2 = (T) gVar.a();
        if (t2 != null) {
            return t2;
        }
        throw new NoSuchElementException();
    }

    public final void blockingSubscribe() {
        ru.ozon.android.messenger.framework.network.di.a.a(this);
    }

    public final p<List<T>> buffer(int i11) {
        return buffer(i11, i11);
    }

    public final p<T> cache() {
        return cacheWithInitialCapacity(16);
    }

    public final p<T> cacheWithInitialCapacity(int i11) {
        C9656b.d(i11, "initialCapacity");
        return new C11067q(this, i11);
    }

    public final <U> p<U> cast(Class<U> cls) {
        C9656b.c(cls, "clazz is null");
        return (p<U>) map(C9653a.d(cls));
    }

    public final <U> y<U> collect(Callable<? extends U> callable, InterfaceC9020b<? super U, ? super T> interfaceC9020b) {
        C9656b.c(callable, "initialValueSupplier is null");
        C9656b.c(interfaceC9020b, "collector is null");
        return new C11070s(this, callable, interfaceC9020b);
    }

    public final <U> y<U> collectInto(U u11, InterfaceC9020b<? super U, ? super T> interfaceC9020b) {
        C9656b.c(u11, "initialValue is null");
        return collect(C9653a.k(u11), interfaceC9020b);
    }

    public final <R> p<R> compose(v<? super T, ? extends R> vVar) {
        C9656b.c(vVar, "composer is null");
        return wrap(vVar.apply());
    }

    public final <R> p<R> concatMap(qc.o<? super T, ? extends u<? extends R>> oVar) {
        return concatMap(oVar, 2);
    }

    public final AbstractC7094b concatMapCompletable(qc.o<? super T, ? extends f> oVar) {
        return concatMapCompletable(oVar, 2);
    }

    public final AbstractC7094b concatMapCompletableDelayError(qc.o<? super T, ? extends f> oVar) {
        return concatMapCompletableDelayError(oVar, true, 2);
    }

    public final <R> p<R> concatMapDelayError(qc.o<? super T, ? extends u<? extends R>> oVar) {
        return concatMapDelayError(oVar, bufferSize(), true);
    }

    public final <R> p<R> concatMapEager(qc.o<? super T, ? extends u<? extends R>> oVar) {
        return concatMapEager(oVar, Integer.MAX_VALUE, bufferSize());
    }

    public final <R> p<R> concatMapEagerDelayError(qc.o<? super T, ? extends u<? extends R>> oVar, boolean z11) {
        return concatMapEagerDelayError(oVar, Integer.MAX_VALUE, bufferSize(), z11);
    }

    public final <U> p<U> concatMapIterable(qc.o<? super T, ? extends Iterable<? extends U>> oVar) {
        C9656b.c(oVar, "mapper is null");
        return new C11023b0(this, oVar);
    }

    public final <R> p<R> concatMapMaybe(qc.o<? super T, ? extends n<? extends R>> oVar) {
        return concatMapMaybe(oVar, 2);
    }

    public final <R> p<R> concatMapMaybeDelayError(qc.o<? super T, ? extends n<? extends R>> oVar) {
        return concatMapMaybeDelayError(oVar, true, 2);
    }

    public final <R> p<R> concatMapSingle(qc.o<? super T, ? extends C<? extends R>> oVar) {
        return concatMapSingle(oVar, 2);
    }

    public final <R> p<R> concatMapSingleDelayError(qc.o<? super T, ? extends C<? extends R>> oVar) {
        return concatMapSingleDelayError(oVar, true, 2);
    }

    public final p<T> concatWith(u<? extends T> uVar) {
        C9656b.c(uVar, "other is null");
        return concat(this, uVar);
    }

    public final y<Boolean> contains(Object obj) {
        C9656b.c(obj, "element is null");
        return any(C9653a.h(obj));
    }

    public final y<Long> count() {
        return new C11018A(this);
    }

    public final <U> p<T> debounce(qc.o<? super T, ? extends u<U>> oVar) {
        C9656b.c(oVar, "debounceSelector is null");
        return new zc.C(this, oVar);
    }

    public final p<T> defaultIfEmpty(T t2) {
        C9656b.c(t2, "defaultItem is null");
        return switchIfEmpty(just(t2));
    }

    public final <U> p<T> delay(qc.o<? super T, ? extends u<U>> oVar) {
        C9656b.c(oVar, "itemDelay is null");
        return (p<T>) flatMap(C11062o0.c(oVar));
    }

    public final <U> p<T> delaySubscription(u<U> uVar) {
        C9656b.c(uVar, "other is null");
        return new G(this, uVar);
    }

    @Deprecated
    public final <T2> p<T2> dematerialize() {
        return new H(this, C9653a.i());
    }

    public final p<T> distinct() {
        return distinct(C9653a.i(), C9653a.f());
    }

    public final p<T> distinctUntilChanged() {
        return distinctUntilChanged(C9653a.i());
    }

    public final p<T> doAfterNext(qc.g<? super T> gVar) {
        C9656b.c(gVar, "onAfterNext is null");
        return new L(this, gVar);
    }

    public final p<T> doAfterTerminate(InterfaceC9019a interfaceC9019a) {
        C9656b.c(interfaceC9019a, "onFinally is null");
        return doOnEach(C9653a.g(), C9653a.g(), C9653a.f98523c, interfaceC9019a);
    }

    public final p<T> doFinally(InterfaceC9019a interfaceC9019a) {
        C9656b.c(interfaceC9019a, "onFinally is null");
        return new M(this, interfaceC9019a);
    }

    public final p<T> doOnComplete(InterfaceC9019a interfaceC9019a) {
        return doOnEach(C9653a.g(), C9653a.g(), interfaceC9019a, C9653a.f98523c);
    }

    public final p<T> doOnDispose(InterfaceC9019a interfaceC9019a) {
        return doOnLifecycle(C9653a.g(), interfaceC9019a);
    }

    public final p<T> doOnError(qc.g<? super Throwable> gVar) {
        qc.g<? super T> g10 = C9653a.g();
        InterfaceC9019a interfaceC9019a = C9653a.f98523c;
        return doOnEach(g10, gVar, interfaceC9019a, interfaceC9019a);
    }

    public final p<T> doOnLifecycle(qc.g<? super InterfaceC8487b> gVar, InterfaceC9019a interfaceC9019a) {
        C9656b.c(gVar, "onSubscribe is null");
        C9656b.c(interfaceC9019a, "onDispose is null");
        return new O(this, gVar, interfaceC9019a);
    }

    public final p<T> doOnNext(qc.g<? super T> gVar) {
        qc.g<? super Throwable> g10 = C9653a.g();
        InterfaceC9019a interfaceC9019a = C9653a.f98523c;
        return doOnEach(gVar, g10, interfaceC9019a, interfaceC9019a);
    }

    public final p<T> doOnSubscribe(qc.g<? super InterfaceC8487b> gVar) {
        return doOnLifecycle(gVar, C9653a.f98523c);
    }

    public final p<T> doOnTerminate(InterfaceC9019a interfaceC9019a) {
        C9656b.c(interfaceC9019a, "onTerminate is null");
        return doOnEach(C9653a.g(), C9653a.a(interfaceC9019a), interfaceC9019a, C9653a.f98523c);
    }

    public final k<T> elementAt(long j11) {
        if (j11 >= 0) {
            return new Q(this, j11);
        }
        throw new IndexOutOfBoundsException(C3173b.b(j11, "index >= 0 required but it was "));
    }

    public final y<T> elementAtOrError(long j11) {
        if (j11 >= 0) {
            return new S(this, j11, null);
        }
        throw new IndexOutOfBoundsException(C3173b.b(j11, "index >= 0 required but it was "));
    }

    public final p<T> filter(qc.q<? super T> qVar) {
        C9656b.c(qVar, "predicate is null");
        return new V(this, qVar);
    }

    public final y<T> first(T t2) {
        return elementAt(0L, t2);
    }

    public final k<T> firstElement() {
        return elementAt(0L);
    }

    public final y<T> firstOrError() {
        return elementAtOrError(0L);
    }

    public final <R> p<R> flatMap(qc.o<? super T, ? extends u<? extends R>> oVar) {
        return flatMap((qc.o) oVar, false);
    }

    public final AbstractC7094b flatMapCompletable(qc.o<? super T, ? extends f> oVar) {
        return flatMapCompletable(oVar, false);
    }

    public final <U> p<U> flatMapIterable(qc.o<? super T, ? extends Iterable<? extends U>> oVar) {
        C9656b.c(oVar, "mapper is null");
        return new C11023b0(this, oVar);
    }

    public final <R> p<R> flatMapMaybe(qc.o<? super T, ? extends n<? extends R>> oVar) {
        return flatMapMaybe(oVar, false);
    }

    public final <R> p<R> flatMapSingle(qc.o<? super T, ? extends C<? extends R>> oVar) {
        return flatMapSingle(oVar, false);
    }

    public final InterfaceC8487b forEach(qc.g<? super T> gVar) {
        return subscribe(gVar);
    }

    public final InterfaceC8487b forEachWhile(qc.q<? super T> qVar) {
        return forEachWhile(qVar, C9653a.f98525e, C9653a.f98523c);
    }

    public final <K> p<Hc.b<K, T>> groupBy(qc.o<? super T, ? extends K> oVar) {
        return (p<Hc.b<K, T>>) groupBy(oVar, C9653a.i(), false, bufferSize());
    }

    public final <TRight, TLeftEnd, TRightEnd, R> p<R> groupJoin(u<? extends TRight> uVar, qc.o<? super T, ? extends u<TLeftEnd>> oVar, qc.o<? super TRight, ? extends u<TRightEnd>> oVar2, InterfaceC9021c<? super T, ? super p<TRight>, ? extends R> interfaceC9021c) {
        C9656b.c(uVar, "other is null");
        C9656b.c(oVar, "leftEnd is null");
        C9656b.c(oVar2, "rightEnd is null");
        C9656b.c(interfaceC9021c, "resultSelector is null");
        return new C11050k0(this, uVar, oVar, oVar2, interfaceC9021c);
    }

    public final p<T> hide() {
        return new C11053l0(this);
    }

    public final AbstractC7094b ignoreElements() {
        return new C11059n0(this);
    }

    public final y<Boolean> isEmpty() {
        return all(C9653a.b());
    }

    public final <TRight, TLeftEnd, TRightEnd, R> p<R> join(u<? extends TRight> uVar, qc.o<? super T, ? extends u<TLeftEnd>> oVar, qc.o<? super TRight, ? extends u<TRightEnd>> oVar2, InterfaceC9021c<? super T, ? super TRight, ? extends R> interfaceC9021c) {
        C9656b.c(uVar, "other is null");
        C9656b.c(oVar, "leftEnd is null");
        C9656b.c(oVar2, "rightEnd is null");
        C9656b.c(interfaceC9021c, "resultSelector is null");
        return new C11069r0(this, uVar, oVar, oVar2, interfaceC9021c);
    }

    public final y<T> last(T t2) {
        C9656b.c(t2, "defaultItem is null");
        return new C11075u0(this, t2);
    }

    public final k<T> lastElement() {
        return new C11073t0(this);
    }

    public final y<T> lastOrError() {
        return new C11075u0(this, null);
    }

    public final <R> p<R> lift(t<? extends R, ? super T> tVar) {
        C9656b.c(tVar, "lifter is null");
        return new C11077v0(this);
    }

    public final <R> p<R> map(qc.o<? super T, ? extends R> oVar) {
        C9656b.c(oVar, "mapper is null");
        return new C11079w0(this, oVar);
    }

    public final p<o<T>> materialize() {
        return new C11083y0(this);
    }

    public final p<T> mergeWith(u<? extends T> uVar) {
        C9656b.c(uVar, "other is null");
        return merge(this, uVar);
    }

    public final p<T> observeOn(x xVar) {
        return observeOn(xVar, false, bufferSize());
    }

    public final <U> p<U> ofType(Class<U> cls) {
        C9656b.c(cls, "clazz is null");
        return filter(C9653a.j(cls)).cast(cls);
    }

    public final p<T> onErrorResumeNext(qc.o<? super Throwable, ? extends u<? extends T>> oVar) {
        C9656b.c(oVar, "resumeFunction is null");
        return new E0(this, oVar, false);
    }

    public final p<T> onErrorReturn(qc.o<? super Throwable, ? extends T> oVar) {
        C9656b.c(oVar, "valueSupplier is null");
        return new F0(this, oVar);
    }

    public final p<T> onErrorReturnItem(T t2) {
        C9656b.c(t2, "item is null");
        return onErrorReturn(C9653a.l(t2));
    }

    public final p<T> onExceptionResumeNext(u<? extends T> uVar) {
        C9656b.c(uVar, "next is null");
        return new E0(this, C9653a.l(uVar), true);
    }

    public final p<T> onTerminateDetach() {
        return new I(this);
    }

    public final AbstractC3137a<T> publish() {
        return G0.d(this);
    }

    public final k<T> reduce(InterfaceC9021c<T, T, T> interfaceC9021c) {
        C9656b.c(interfaceC9021c, "reducer is null");
        return new M0(this, interfaceC9021c);
    }

    public final <R> y<R> reduceWith(Callable<R> callable, InterfaceC9021c<R, ? super T, R> interfaceC9021c) {
        C9656b.c(callable, "seedSupplier is null");
        C9656b.c(interfaceC9021c, "reducer is null");
        return new O0(this, callable, interfaceC9021c);
    }

    public final p<T> repeat() {
        return repeat(Long.MAX_VALUE);
    }

    public final p<T> repeatUntil(qc.e eVar) {
        C9656b.c(eVar, "stop is null");
        return new R0(this, eVar);
    }

    public final p<T> repeatWhen(qc.o<? super p<Object>, ? extends u<?>> oVar) {
        C9656b.c(oVar, "handler is null");
        return new S0(this, oVar);
    }

    public final AbstractC3137a<T> replay() {
        return T0.g(this);
    }

    public final p<T> retry() {
        return retry(Long.MAX_VALUE, C9653a.c());
    }

    public final p<T> retryUntil(qc.e eVar) {
        C9656b.c(eVar, "stop is null");
        return retry(Long.MAX_VALUE, C9653a.t(eVar));
    }

    public final p<T> retryWhen(qc.o<? super p<Throwable>, ? extends u<?>> oVar) {
        C9656b.c(oVar, "handler is null");
        return new W0(this, oVar);
    }

    public final void safeSubscribe(w<? super T> wVar) {
        C9656b.c(wVar, "observer is null");
        if (wVar instanceof Ic.d) {
            subscribe(wVar);
        } else {
            subscribe(new Ic.d(wVar));
        }
    }

    public final p<T> sample(long j11, TimeUnit timeUnit) {
        return sample(j11, timeUnit, Mc.a.a());
    }

    public final p<T> scan(InterfaceC9021c<T, T, T> interfaceC9021c) {
        C9656b.c(interfaceC9021c, "accumulator is null");
        return new C11021a1(this, interfaceC9021c);
    }

    public final <R> p<R> scanWith(Callable<R> callable, InterfaceC9021c<R, ? super T, R> interfaceC9021c) {
        C9656b.c(callable, "seedSupplier is null");
        C9656b.c(interfaceC9021c, "accumulator is null");
        return new C11024b1(this, callable, interfaceC9021c);
    }

    public final p<T> serialize() {
        return new C11033e1(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [Hc.a] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final p<T> share() {
        AbstractC3137a<T> publish = publish();
        publish.getClass();
        boolean z11 = publish instanceof I0;
        ?? r02 = publish;
        if (z11) {
            r02 = new H0(((I0) publish).a());
        }
        return new P0(r02);
    }

    public final y<T> single(T t2) {
        C9656b.c(t2, "defaultItem is null");
        return new C11039g1(this, t2);
    }

    public final k<T> singleElement() {
        return new C11036f1(this);
    }

    public final y<T> singleOrError() {
        return new C11039g1(this, null);
    }

    public final p<T> skip(long j11) {
        return j11 <= 0 ? this : new C11042h1(this, j11);
    }

    public final p<T> skipLast(int i11) {
        if (i11 >= 0) {
            return i11 == 0 ? this : new C11045i1(this, i11);
        }
        throw new IndexOutOfBoundsException(Ej.b.a(i11, "count >= 0 required but it was "));
    }

    public final <U> p<T> skipUntil(u<U> uVar) {
        C9656b.c(uVar, "other is null");
        return new C11051k1(this, uVar);
    }

    public final p<T> skipWhile(qc.q<? super T> qVar) {
        C9656b.c(qVar, "predicate is null");
        return new C11054l1(this, qVar);
    }

    public final p<T> sorted() {
        return toList().k().map(C9653a.m(C9653a.n())).flatMapIterable(C9653a.i());
    }

    public final p<T> startWith(Iterable<? extends T> iterable) {
        return concatArray(fromIterable(iterable), this);
    }

    public final p<T> startWithArray(T... tArr) {
        p fromArray = fromArray(tArr);
        return fromArray == empty() ? this : concatArray(fromArray, this);
    }

    public final InterfaceC8487b subscribe() {
        return subscribe(C9653a.g(), C9653a.f98525e, C9653a.f98523c, C9653a.g());
    }

    protected abstract void subscribeActual(w<? super T> wVar);

    public final p<T> subscribeOn(x xVar) {
        C9656b.c(xVar, "scheduler is null");
        return new C11057m1(this, xVar);
    }

    public final <E extends w<? super T>> E subscribeWith(E e11) {
        subscribe(e11);
        return e11;
    }

    public final p<T> switchIfEmpty(u<? extends T> uVar) {
        C9656b.c(uVar, "other is null");
        return new C11060n1(this, uVar);
    }

    public final <R> p<R> switchMap(qc.o<? super T, ? extends u<? extends R>> oVar) {
        return switchMap(oVar, bufferSize());
    }

    public final AbstractC7094b switchMapCompletable(qc.o<? super T, ? extends f> oVar) {
        C9656b.c(oVar, "mapper is null");
        return new yc.e(this, oVar, false);
    }

    public final AbstractC7094b switchMapCompletableDelayError(qc.o<? super T, ? extends f> oVar) {
        C9656b.c(oVar, "mapper is null");
        return new yc.e(this, oVar, true);
    }

    public final <R> p<R> switchMapDelayError(qc.o<? super T, ? extends u<? extends R>> oVar) {
        return switchMapDelayError(oVar, bufferSize());
    }

    public final <R> p<R> switchMapMaybe(qc.o<? super T, ? extends n<? extends R>> oVar) {
        C9656b.c(oVar, "mapper is null");
        return new yc.f(this, oVar, false);
    }

    public final <R> p<R> switchMapMaybeDelayError(qc.o<? super T, ? extends n<? extends R>> oVar) {
        C9656b.c(oVar, "mapper is null");
        return new yc.f(this, oVar, true);
    }

    public final <R> p<R> switchMapSingle(qc.o<? super T, ? extends C<? extends R>> oVar) {
        C9656b.c(oVar, "mapper is null");
        return new yc.g(this, oVar, false);
    }

    public final <R> p<R> switchMapSingleDelayError(qc.o<? super T, ? extends C<? extends R>> oVar) {
        C9656b.c(oVar, "mapper is null");
        return new yc.g(this, oVar, true);
    }

    public final p<T> take(long j11) {
        if (j11 >= 0) {
            return new C11066p1(this, j11);
        }
        throw new IllegalArgumentException(C3173b.b(j11, "count >= 0 required but it was "));
    }

    public final p<T> takeLast(int i11) {
        if (i11 >= 0) {
            return i11 == 0 ? new C11056m0(this) : i11 == 1 ? new r1(this) : new q1(this, i11);
        }
        throw new IndexOutOfBoundsException(Ej.b.a(i11, "count >= 0 required but it was "));
    }

    public final <U> p<T> takeUntil(u<U> uVar) {
        C9656b.c(uVar, "other is null");
        return new t1(this, uVar);
    }

    public final p<T> takeWhile(qc.q<? super T> qVar) {
        C9656b.c(qVar, "predicate is null");
        return new v1(this, qVar);
    }

    public final Ic.f<T> test() {
        Ic.f<T> fVar = new Ic.f<>();
        subscribe(fVar);
        return fVar;
    }

    public final p<T> throttleFirst(long j11, TimeUnit timeUnit) {
        return throttleFirst(j11, timeUnit, Mc.a.a());
    }

    public final p<T> throttleLast(long j11, TimeUnit timeUnit) {
        return sample(j11, timeUnit);
    }

    public final p<T> throttleLatest(long j11, TimeUnit timeUnit) {
        return throttleLatest(j11, timeUnit, Mc.a.a(), false);
    }

    public final p<T> throttleWithTimeout(long j11, TimeUnit timeUnit) {
        return debounce(j11, timeUnit);
    }

    public final p<Mc.b<T>> timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, Mc.a.a());
    }

    public final <V> p<T> timeout(qc.o<? super T, ? extends u<V>> oVar) {
        return timeout0(null, oVar, null);
    }

    public final p<Mc.b<T>> timestamp() {
        return timestamp(TimeUnit.MILLISECONDS, Mc.a.a());
    }

    public final <R> R to(qc.o<? super p<T>, R> oVar) {
        try {
            C9656b.c(oVar, "converter is null");
            return oVar.apply(this);
        } catch (Throwable th2) {
            C2645f.c(th2);
            throw Gc.i.d(th2);
        }
    }

    public final h<T> toFlowable(EnumC7093a enumC7093a) {
        C10499u c10499u = new C10499u(this);
        int i11 = a.f66523a[enumC7093a.ordinal()];
        if (i11 == 1) {
            return new C10472A(c10499u);
        }
        if (i11 == 2) {
            return new C10474C(c10499u);
        }
        if (i11 == 3) {
            return c10499u;
        }
        if (i11 == 4) {
            return new C10473B(c10499u);
        }
        int i12 = h.f66519a;
        C9656b.d(i12, "capacity");
        return new wc.z(c10499u, i12);
    }

    public final Future<T> toFuture() {
        return (Future) subscribeWith(new uc.o());
    }

    public final y<List<T>> toList() {
        return toList(16);
    }

    public final <K> y<Map<K, T>> toMap(qc.o<? super T, ? extends K> oVar) {
        C9656b.c(oVar, "keySelector is null");
        return (y<Map<K, T>>) collect(Gc.j.a(), C9653a.D(oVar));
    }

    public final <K> y<Map<K, Collection<T>>> toMultimap(qc.o<? super T, ? extends K> oVar) {
        return (y<Map<K, Collection<T>>>) toMultimap(oVar, C9653a.i(), Gc.j.a(), Gc.b.b());
    }

    public final y<List<T>> toSortedList() {
        return toSortedList(C9653a.o());
    }

    public final p<T> unsubscribeOn(x xVar) {
        C9656b.c(xVar, "scheduler is null");
        return new E1(this, xVar);
    }

    public final p<p<T>> window(long j11) {
        return window(j11, j11, bufferSize());
    }

    public final <U, R> p<R> withLatestFrom(u<? extends U> uVar, InterfaceC9021c<? super T, ? super U, ? extends R> interfaceC9021c) {
        C9656b.c(uVar, "other is null");
        C9656b.c(interfaceC9021c, "combiner is null");
        return new L1(this, interfaceC9021c, uVar);
    }

    public final <U, R> p<R> zipWith(Iterable<U> iterable, InterfaceC9021c<? super T, ? super U, ? extends R> interfaceC9021c) {
        C9656b.c(iterable, "other is null");
        C9656b.c(interfaceC9021c, "zipper is null");
        return new O1(this, iterable, interfaceC9021c);
    }

    public static <T, R> p<R> combineLatest(Iterable<? extends u<? extends T>> iterable, qc.o<? super Object[], ? extends R> oVar) {
        return combineLatest(iterable, oVar, bufferSize());
    }

    public static <T, R> p<R> combineLatestDelayError(qc.o<? super Object[], ? extends R> oVar, int i11, u<? extends T>... uVarArr) {
        return combineLatestDelayError(uVarArr, oVar, i11);
    }

    public static <T> p<T> concatArrayEager(int i11, int i12, u<? extends T>... uVarArr) {
        return fromArray(uVarArr).concatMapEagerDelayError(C9653a.i(), i11, i12, false);
    }

    public static <T> p<T> concatArrayEagerDelayError(int i11, int i12, u<? extends T>... uVarArr) {
        return fromArray(uVarArr).concatMapEagerDelayError(C9653a.i(), i11, i12, true);
    }

    public static <T> p<T> concatEager(u<? extends u<? extends T>> uVar, int i11, int i12) {
        return wrap(uVar).concatMapEager(C9653a.i(), i11, i12);
    }

    public static p<Long> interval(long j11, long j12, TimeUnit timeUnit, x xVar) {
        C9656b.c(timeUnit, "unit is null");
        C9656b.c(xVar, "scheduler is null");
        return new C11065p0(Math.max(0L, j11), Math.max(0L, j12), timeUnit, xVar);
    }

    public static p<Long> intervalRange(long j11, long j12, long j13, long j14, TimeUnit timeUnit, x xVar) {
        if (j12 < 0) {
            throw new IllegalArgumentException(C3173b.b(j12, "count >= 0 required but it was "));
        }
        if (j12 == 0) {
            return empty().delay(j13, timeUnit, xVar);
        }
        long j15 = (j12 - 1) + j11;
        if (j11 > 0 && j15 < 0) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        C9656b.c(timeUnit, "unit is null");
        C9656b.c(xVar, "scheduler is null");
        return new C11068q0(j11, j15, Math.max(0L, j13), Math.max(0L, j14), timeUnit, xVar);
    }

    public static <T> p<T> merge(Iterable<? extends u<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(C9653a.i());
    }

    public static <T> p<T> mergeArray(u<? extends T>... uVarArr) {
        return fromArray(uVarArr).flatMap(C9653a.i(), uVarArr.length);
    }

    public static <T> p<T> mergeArrayDelayError(u<? extends T>... uVarArr) {
        return fromArray(uVarArr).flatMap(C9653a.i(), true, uVarArr.length);
    }

    public static <T> p<T> mergeDelayError(Iterable<? extends u<? extends T>> iterable, int i11, int i12) {
        return fromIterable(iterable).flatMap(C9653a.i(), true, i11, i12);
    }

    public static <T> y<Boolean> sequenceEqual(u<? extends T> uVar, u<? extends T> uVar2, qc.d<? super T, ? super T> dVar) {
        return sequenceEqual(uVar, uVar2, dVar, bufferSize());
    }

    public static <T> p<T> switchOnNextDelayError(u<? extends u<? extends T>> uVar, int i11) {
        C9656b.c(uVar, "sources is null");
        C9656b.d(i11, "prefetch");
        return new C11063o1(uVar, C9653a.i(), i11, true);
    }

    public static p<Long> timer(long j11, TimeUnit timeUnit, x xVar) {
        C9656b.c(timeUnit, "unit is null");
        C9656b.c(xVar, "scheduler is null");
        return new B1(Math.max(j11, 0L), timeUnit, xVar);
    }

    public static <T, D> p<T> using(Callable<? extends D> callable, qc.o<? super D, ? extends u<? extends T>> oVar, qc.g<? super D> gVar, boolean z11) {
        C9656b.c(callable, "resourceSupplier is null");
        C9656b.c(oVar, "sourceSupplier is null");
        C9656b.c(gVar, "disposer is null");
        return new F1(callable, oVar, gVar, z11);
    }

    public final Iterable<T> blockingIterable(int i11) {
        C9656b.d(i11, "bufferSize");
        return new C11022b(this, i11);
    }

    public final void blockingSubscribe(qc.g<? super T> gVar) {
        ru.ozon.android.messenger.framework.network.di.a.c(this, gVar, C9653a.f98525e, C9653a.f98523c);
    }

    public final p<List<T>> buffer(int i11, int i12) {
        return (p<List<T>>) buffer(i11, i12, Gc.b.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> p<R> concatMap(qc.o<? super T, ? extends u<? extends R>> oVar, int i11) {
        C9656b.c(oVar, "mapper is null");
        C9656b.d(i11, "prefetch");
        if (!(this instanceof InterfaceCallableC9806h)) {
            return new C11074u(this, oVar, i11, Gc.h.IMMEDIATE);
        }
        T call = ((InterfaceCallableC9806h) this).call();
        return call == null ? empty() : Z0.a(call, oVar);
    }

    public final AbstractC7094b concatMapCompletable(qc.o<? super T, ? extends f> oVar, int i11) {
        C9656b.c(oVar, "mapper is null");
        C9656b.d(i11, "capacityHint");
        return new C10881b(this, oVar, Gc.h.IMMEDIATE, i11);
    }

    public final AbstractC7094b concatMapCompletableDelayError(qc.o<? super T, ? extends f> oVar, boolean z11) {
        return concatMapCompletableDelayError(oVar, z11, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> p<R> concatMapDelayError(qc.o<? super T, ? extends u<? extends R>> oVar, int i11, boolean z11) {
        C9656b.c(oVar, "mapper is null");
        C9656b.d(i11, "prefetch");
        if (!(this instanceof InterfaceCallableC9806h)) {
            return new C11074u(this, oVar, i11, z11 ? Gc.h.END : Gc.h.BOUNDARY);
        }
        T call = ((InterfaceCallableC9806h) this).call();
        return call == null ? empty() : Z0.a(call, oVar);
    }

    public final <R> p<R> concatMapEager(qc.o<? super T, ? extends u<? extends R>> oVar, int i11, int i12) {
        C9656b.c(oVar, "mapper is null");
        C9656b.d(i11, "maxConcurrency");
        C9656b.d(i12, "prefetch");
        return new C11076v(this, oVar, Gc.h.IMMEDIATE, i11, i12);
    }

    public final <R> p<R> concatMapEagerDelayError(qc.o<? super T, ? extends u<? extends R>> oVar, int i11, int i12, boolean z11) {
        C9656b.c(oVar, "mapper is null");
        C9656b.d(i11, "maxConcurrency");
        C9656b.d(i12, "prefetch");
        return new C11076v(this, oVar, z11 ? Gc.h.END : Gc.h.BOUNDARY, i11, i12);
    }

    public final <R> p<R> concatMapMaybe(qc.o<? super T, ? extends n<? extends R>> oVar, int i11) {
        C9656b.c(oVar, "mapper is null");
        C9656b.d(i11, "prefetch");
        return new yc.c(this, oVar, Gc.h.IMMEDIATE, i11);
    }

    public final <R> p<R> concatMapMaybeDelayError(qc.o<? super T, ? extends n<? extends R>> oVar, boolean z11) {
        return concatMapMaybeDelayError(oVar, z11, 2);
    }

    public final <R> p<R> concatMapSingle(qc.o<? super T, ? extends C<? extends R>> oVar, int i11) {
        C9656b.c(oVar, "mapper is null");
        C9656b.d(i11, "prefetch");
        return new yc.d(this, oVar, Gc.h.IMMEDIATE, i11);
    }

    public final <R> p<R> concatMapSingleDelayError(qc.o<? super T, ? extends C<? extends R>> oVar, boolean z11) {
        return concatMapSingleDelayError(oVar, z11, 2);
    }

    public final <R> p<R> dematerialize(qc.o<? super T, o<R>> oVar) {
        C9656b.c(oVar, "selector is null");
        return new H(this, oVar);
    }

    public final <K> p<T> distinct(qc.o<? super T, K> oVar) {
        return distinct(oVar, C9653a.f());
    }

    public final <K> p<T> distinctUntilChanged(qc.o<? super T, K> oVar) {
        C9656b.c(oVar, "keySelector is null");
        return new K(this, oVar, C9656b.b());
    }

    public final <R> p<R> flatMap(qc.o<? super T, ? extends u<? extends R>> oVar, boolean z11) {
        return flatMap(oVar, z11, Integer.MAX_VALUE);
    }

    public final AbstractC7094b flatMapCompletable(qc.o<? super T, ? extends f> oVar, boolean z11) {
        C9656b.c(oVar, "mapper is null");
        return new Y(this, oVar, z11);
    }

    public final <R> p<R> flatMapMaybe(qc.o<? super T, ? extends n<? extends R>> oVar, boolean z11) {
        C9656b.c(oVar, "mapper is null");
        return new Z(this, oVar, z11);
    }

    public final <R> p<R> flatMapSingle(qc.o<? super T, ? extends C<? extends R>> oVar, boolean z11) {
        C9656b.c(oVar, "mapper is null");
        return new C11020a0(this, oVar, z11);
    }

    public final InterfaceC8487b forEachWhile(qc.q<? super T> qVar, qc.g<? super Throwable> gVar) {
        return forEachWhile(qVar, gVar, C9653a.f98523c);
    }

    public final <K> p<Hc.b<K, T>> groupBy(qc.o<? super T, ? extends K> oVar, boolean z11) {
        return (p<Hc.b<K, T>>) groupBy(oVar, C9653a.i(), z11, bufferSize());
    }

    public final p<T> observeOn(x xVar, boolean z11) {
        return observeOn(xVar, z11, bufferSize());
    }

    public final <R> p<R> publish(qc.o<? super p<T>, ? extends u<R>> oVar) {
        C9656b.c(oVar, "selector is null");
        return new J0(this, oVar);
    }

    public final p<T> repeat(long j11) {
        if (j11 >= 0) {
            return j11 == 0 ? empty() : new Q0(this, j11);
        }
        throw new IllegalArgumentException(C3173b.b(j11, "times >= 0 required but it was "));
    }

    public final <R> p<R> replay(qc.o<? super p<T>, ? extends u<R>> oVar) {
        C9656b.c(oVar, "selector is null");
        return T0.h(oVar, C11062o0.h(this));
    }

    public final p<T> retry(qc.d<? super Integer, ? super Throwable> dVar) {
        C9656b.c(dVar, "predicate is null");
        return new U0(this, dVar);
    }

    public final p<T> sample(long j11, TimeUnit timeUnit, boolean z11) {
        return sample(j11, timeUnit, Mc.a.a(), z11);
    }

    public final p<T> skip(long j11, TimeUnit timeUnit) {
        return skipUntil(timer(j11, timeUnit));
    }

    public final p<T> sorted(Comparator<? super T> comparator) {
        C9656b.c(comparator, "sortFunction is null");
        return toList().k().map(C9653a.m(comparator)).flatMapIterable(C9653a.i());
    }

    public final p<T> startWith(u<? extends T> uVar) {
        C9656b.c(uVar, "other is null");
        return concatArray(uVar, this);
    }

    public final InterfaceC8487b subscribe(qc.g<? super T> gVar) {
        return subscribe(gVar, C9653a.f98525e, C9653a.f98523c, C9653a.g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> p<R> switchMap(qc.o<? super T, ? extends u<? extends R>> oVar, int i11) {
        C9656b.c(oVar, "mapper is null");
        C9656b.d(i11, "bufferSize");
        if (!(this instanceof InterfaceCallableC9806h)) {
            return new C11063o1(this, oVar, i11, false);
        }
        T call = ((InterfaceCallableC9806h) this).call();
        return call == null ? empty() : Z0.a(call, oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> p<R> switchMapDelayError(qc.o<? super T, ? extends u<? extends R>> oVar, int i11) {
        C9656b.c(oVar, "mapper is null");
        C9656b.d(i11, "bufferSize");
        if (!(this instanceof InterfaceCallableC9806h)) {
            return new C11063o1(this, oVar, i11, true);
        }
        T call = ((InterfaceCallableC9806h) this).call();
        return call == null ? empty() : Z0.a(call, oVar);
    }

    public final p<T> throttleFirst(long j11, TimeUnit timeUnit, x xVar) {
        C9656b.c(timeUnit, "unit is null");
        C9656b.c(xVar, "scheduler is null");
        return new w1(this, j11, timeUnit, xVar);
    }

    public final p<T> throttleLast(long j11, TimeUnit timeUnit, x xVar) {
        return sample(j11, timeUnit, xVar);
    }

    public final p<T> throttleLatest(long j11, TimeUnit timeUnit, boolean z11) {
        return throttleLatest(j11, timeUnit, Mc.a.a(), z11);
    }

    public final p<T> throttleWithTimeout(long j11, TimeUnit timeUnit, x xVar) {
        return debounce(j11, timeUnit, xVar);
    }

    public final p<Mc.b<T>> timeInterval(x xVar) {
        return timeInterval(TimeUnit.MILLISECONDS, xVar);
    }

    public final <V> p<T> timeout(qc.o<? super T, ? extends u<V>> oVar, u<? extends T> uVar) {
        C9656b.c(uVar, "other is null");
        return timeout0(null, oVar, uVar);
    }

    public final p<Mc.b<T>> timestamp(x xVar) {
        return timestamp(TimeUnit.MILLISECONDS, xVar);
    }

    public final y<List<T>> toList(int i11) {
        C9656b.d(i11, "capacityHint");
        return new D1(this, i11);
    }

    public final y<List<T>> toSortedList(Comparator<? super T> comparator) {
        C9656b.c(comparator, "comparator is null");
        y<List<T>> list = toList();
        qc.o m11 = C9653a.m(comparator);
        list.getClass();
        return new Bc.r(list, m11);
    }

    public final p<p<T>> window(long j11, long j12) {
        return window(j11, j12, bufferSize());
    }

    public static <T, R> p<R> combineLatest(Iterable<? extends u<? extends T>> iterable, qc.o<? super Object[], ? extends R> oVar, int i11) {
        C9656b.c(iterable, "sources is null");
        C9656b.c(oVar, "combiner is null");
        C9656b.d(i11, "bufferSize");
        return new C11072t(null, iterable, oVar, i11 << 1, false);
    }

    public static <T, R> p<R> combineLatestDelayError(u<? extends T>[] uVarArr, qc.o<? super Object[], ? extends R> oVar, int i11) {
        C9656b.d(i11, "bufferSize");
        C9656b.c(oVar, "combiner is null");
        if (uVarArr.length == 0) {
            return empty();
        }
        return new C11072t(uVarArr, null, oVar, i11 << 1, true);
    }

    public static <T> p<T> concat(u<? extends u<? extends T>> uVar) {
        return concat(uVar, bufferSize());
    }

    public static <T> p<T> concatDelayError(u<? extends u<? extends T>> uVar) {
        return concatDelayError(uVar, bufferSize(), true);
    }

    public static <T> p<T> concatEager(Iterable<? extends u<? extends T>> iterable) {
        return concatEager(iterable, bufferSize(), bufferSize());
    }

    public static <T> p<T> error(Throwable th2) {
        C9656b.c(th2, "exception is null");
        return error((Callable<? extends Throwable>) C9653a.k(th2));
    }

    public static <T> p<T> fromFuture(Future<? extends T> future, long j11, TimeUnit timeUnit) {
        C9656b.c(future, "future is null");
        C9656b.c(timeUnit, "unit is null");
        return new C11032e0(future, j11, timeUnit);
    }

    public static <T> p<T> just(T t2, T t11) {
        C9656b.c(t2, "item1 is null");
        C9656b.c(t11, "item2 is null");
        return fromArray(t2, t11);
    }

    public static <T> p<T> merge(Iterable<? extends u<? extends T>> iterable, int i11) {
        return fromIterable(iterable).flatMap(C9653a.i(), i11);
    }

    public static <T> p<T> mergeDelayError(Iterable<? extends u<? extends T>> iterable, int i11) {
        return fromIterable(iterable).flatMap(C9653a.i(), true, i11);
    }

    public static <T> y<Boolean> sequenceEqual(u<? extends T> uVar, u<? extends T> uVar2, qc.d<? super T, ? super T> dVar, int i11) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        C9656b.c(dVar, "isEqual is null");
        C9656b.d(i11, "bufferSize");
        return new C11030d1(uVar, uVar2, dVar, i11);
    }

    public final void blockingSubscribe(qc.g<? super T> gVar, qc.g<? super Throwable> gVar2) {
        ru.ozon.android.messenger.framework.network.di.a.c(this, gVar, gVar2, C9653a.f98523c);
    }

    public final <U extends Collection<? super T>> p<U> buffer(int i11, int i12, Callable<U> callable) {
        C9656b.d(i11, "count");
        C9656b.d(i12, "skip");
        C9656b.c(callable, "bufferSupplier is null");
        return new C11052l(this, i11, i12, callable);
    }

    public final AbstractC7094b concatMapCompletableDelayError(qc.o<? super T, ? extends f> oVar, boolean z11, int i11) {
        C9656b.c(oVar, "mapper is null");
        C9656b.d(i11, "prefetch");
        return new C10881b(this, oVar, z11 ? Gc.h.END : Gc.h.BOUNDARY, i11);
    }

    public final <U> p<U> concatMapIterable(qc.o<? super T, ? extends Iterable<? extends U>> oVar, int i11) {
        C9656b.c(oVar, "mapper is null");
        C9656b.d(i11, "prefetch");
        return (p<U>) concatMap(C11062o0.a(oVar), i11);
    }

    public final <R> p<R> concatMapMaybeDelayError(qc.o<? super T, ? extends n<? extends R>> oVar, boolean z11, int i11) {
        C9656b.c(oVar, "mapper is null");
        C9656b.d(i11, "prefetch");
        return new yc.c(this, oVar, z11 ? Gc.h.END : Gc.h.BOUNDARY, i11);
    }

    public final <R> p<R> concatMapSingleDelayError(qc.o<? super T, ? extends C<? extends R>> oVar, boolean z11, int i11) {
        C9656b.c(oVar, "mapper is null");
        C9656b.d(i11, "prefetch");
        return new yc.d(this, oVar, z11 ? Gc.h.END : Gc.h.BOUNDARY, i11);
    }

    public final p<T> concatWith(C<? extends T> c11) {
        C9656b.c(c11, "other is null");
        return new C11082y(this, c11);
    }

    public final p<T> debounce(long j11, TimeUnit timeUnit) {
        return debounce(j11, timeUnit, Mc.a.a());
    }

    public final p<T> delay(long j11, TimeUnit timeUnit) {
        return delay(j11, timeUnit, Mc.a.a(), false);
    }

    public final p<T> delaySubscription(long j11, TimeUnit timeUnit) {
        return delaySubscription(j11, timeUnit, Mc.a.a());
    }

    public final <K> p<T> distinct(qc.o<? super T, K> oVar, Callable<? extends Collection<? super K>> callable) {
        C9656b.c(oVar, "keySelector is null");
        C9656b.c(callable, "collectionSupplier is null");
        return new J(this, oVar, callable);
    }

    public final <R> p<R> flatMap(qc.o<? super T, ? extends u<? extends R>> oVar, boolean z11, int i11) {
        return flatMap(oVar, z11, i11, bufferSize());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <U, V> p<V> flatMapIterable(qc.o<? super T, ? extends Iterable<? extends U>> oVar, InterfaceC9021c<? super T, ? super U, ? extends V> interfaceC9021c) {
        C9656b.c(oVar, "mapper is null");
        C9656b.c(interfaceC9021c, "resultSelector is null");
        return (p<V>) flatMap(C11062o0.a(oVar), interfaceC9021c, false, bufferSize(), bufferSize());
    }

    public final InterfaceC8487b forEachWhile(qc.q<? super T> qVar, qc.g<? super Throwable> gVar, InterfaceC9019a interfaceC9019a) {
        C9656b.c(qVar, "onNext is null");
        C9656b.c(gVar, "onError is null");
        C9656b.c(interfaceC9019a, "onComplete is null");
        uc.n nVar = new uc.n(qVar, gVar, interfaceC9019a);
        subscribe(nVar);
        return nVar;
    }

    public final <K, V> p<Hc.b<K, V>> groupBy(qc.o<? super T, ? extends K> oVar, qc.o<? super T, ? extends V> oVar2) {
        return groupBy(oVar, oVar2, false, bufferSize());
    }

    public final p<T> mergeWith(C<? extends T> c11) {
        C9656b.c(c11, "other is null");
        return new B0(this, c11);
    }

    public final p<T> observeOn(x xVar, boolean z11, int i11) {
        C9656b.c(xVar, "scheduler is null");
        C9656b.d(i11, "bufferSize");
        return new D0(this, xVar, z11, i11);
    }

    public final p<T> onErrorResumeNext(u<? extends T> uVar) {
        C9656b.c(uVar, "next is null");
        return onErrorResumeNext(C9653a.l(uVar));
    }

    public final <R> y<R> reduce(R r11, InterfaceC9021c<R, ? super T, R> interfaceC9021c) {
        C9656b.c(r11, "seed is null");
        C9656b.c(interfaceC9021c, "reducer is null");
        return new N0(this, r11, interfaceC9021c);
    }

    public final p<T> sample(long j11, TimeUnit timeUnit, x xVar) {
        C9656b.c(timeUnit, "unit is null");
        C9656b.c(xVar, "scheduler is null");
        return new X0(this, j11, timeUnit, xVar, false);
    }

    public final <R> p<R> scan(R r11, InterfaceC9021c<R, ? super T, R> interfaceC9021c) {
        C9656b.c(r11, "initialValue is null");
        return scanWith(C9653a.k(r11), interfaceC9021c);
    }

    public final p<T> skip(long j11, TimeUnit timeUnit, x xVar) {
        return skipUntil(timer(j11, timeUnit, xVar));
    }

    public final InterfaceC8487b subscribe(qc.g<? super T> gVar, qc.g<? super Throwable> gVar2) {
        return subscribe(gVar, gVar2, C9653a.f98523c, C9653a.g());
    }

    public final p<T> takeUntil(qc.q<? super T> qVar) {
        C9656b.c(qVar, "stopPredicate is null");
        return new u1(this, qVar);
    }

    public final Ic.f<T> test(boolean z11) {
        Ic.f<T> fVar = new Ic.f<>();
        if (z11) {
            fVar.dispose();
        }
        subscribe(fVar);
        return fVar;
    }

    public final p<T> throttleLatest(long j11, TimeUnit timeUnit, x xVar) {
        return throttleLatest(j11, timeUnit, xVar, false);
    }

    public final p<Mc.b<T>> timeInterval(TimeUnit timeUnit) {
        return timeInterval(timeUnit, Mc.a.a());
    }

    public final p<Mc.b<T>> timestamp(TimeUnit timeUnit) {
        return timestamp(timeUnit, Mc.a.a());
    }

    public final <K, V> y<Map<K, V>> toMap(qc.o<? super T, ? extends K> oVar, qc.o<? super T, ? extends V> oVar2) {
        C9656b.c(oVar, "keySelector is null");
        C9656b.c(oVar2, "valueSelector is null");
        return (y<Map<K, V>>) collect(Gc.j.a(), C9653a.E(oVar, oVar2));
    }

    public final p<p<T>> window(long j11, long j12, int i11) {
        C9656b.e(j11, "count");
        C9656b.e(j12, "skip");
        C9656b.d(i11, "bufferSize");
        return new G1(this, j11, j12, i11);
    }

    public static <T> p<T> concat(u<? extends u<? extends T>> uVar, int i11) {
        C9656b.c(uVar, "sources is null");
        C9656b.d(i11, "prefetch");
        return new C11074u(uVar, C9653a.i(), i11, Gc.h.IMMEDIATE);
    }

    public static <T> p<T> concatDelayError(u<? extends u<? extends T>> uVar, int i11, boolean z11) {
        C9656b.c(uVar, "sources is null");
        C9656b.d(i11, "prefetch is null");
        return new C11074u(uVar, C9653a.i(), i11, z11 ? Gc.h.END : Gc.h.BOUNDARY);
    }

    public static <T> p<T> concatEager(Iterable<? extends u<? extends T>> iterable, int i11, int i12) {
        return fromIterable(iterable).concatMapEagerDelayError(C9653a.i(), i11, i12, false);
    }

    public static <T> p<T> merge(u<? extends u<? extends T>> uVar) {
        C9656b.c(uVar, "sources is null");
        return new W(uVar, C9653a.i(), false, Integer.MAX_VALUE, bufferSize());
    }

    public static <T> p<T> mergeDelayError(u<? extends u<? extends T>> uVar) {
        C9656b.c(uVar, "sources is null");
        return new W(uVar, C9653a.i(), true, Integer.MAX_VALUE, bufferSize());
    }

    public static <T> p<T> switchOnNext(u<? extends u<? extends T>> uVar) {
        return switchOnNext(uVar, bufferSize());
    }

    private <U, V> p<T> timeout0(u<U> uVar, qc.o<? super T, ? extends u<V>> oVar, u<? extends T> uVar2) {
        C9656b.c(oVar, "itemTimeoutIndicator is null");
        return new z1(this, uVar, oVar, uVar2);
    }

    public static <T, R> p<R> zip(u<? extends u<? extends T>> uVar, qc.o<? super Object[], ? extends R> oVar) {
        C9656b.c(oVar, "zipper is null");
        C9656b.c(uVar, "sources is null");
        return new C1(uVar).flatMap(C11062o0.n(oVar));
    }

    public final void blockingSubscribe(qc.g<? super T> gVar, qc.g<? super Throwable> gVar2, InterfaceC9019a interfaceC9019a) {
        ru.ozon.android.messenger.framework.network.di.a.c(this, gVar, gVar2, interfaceC9019a);
    }

    public final p<T> debounce(long j11, TimeUnit timeUnit, x xVar) {
        C9656b.c(timeUnit, "unit is null");
        C9656b.c(xVar, "scheduler is null");
        return new D(this, j11, timeUnit, xVar);
    }

    public final p<T> delay(long j11, TimeUnit timeUnit, boolean z11) {
        return delay(j11, timeUnit, Mc.a.a(), z11);
    }

    public final p<T> delaySubscription(long j11, TimeUnit timeUnit, x xVar) {
        return delaySubscription(timer(j11, timeUnit, xVar));
    }

    public final p<T> distinctUntilChanged(qc.d<? super T, ? super T> dVar) {
        C9656b.c(dVar, "comparer is null");
        return new K(this, C9653a.i(), dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> p<R> flatMap(qc.o<? super T, ? extends u<? extends R>> oVar, boolean z11, int i11, int i12) {
        C9656b.c(oVar, "mapper is null");
        C9656b.d(i11, "maxConcurrency");
        C9656b.d(i12, "bufferSize");
        if (this instanceof InterfaceCallableC9806h) {
            T call = ((InterfaceCallableC9806h) this).call();
            if (call == null) {
                return empty();
            }
            return Z0.a(call, oVar);
        }
        return new W(this, oVar, z11, i11, i12);
    }

    public final <K, V> p<Hc.b<K, V>> groupBy(qc.o<? super T, ? extends K> oVar, qc.o<? super T, ? extends V> oVar2, boolean z11) {
        return groupBy(oVar, oVar2, z11, bufferSize());
    }

    public final <R> p<R> replay(qc.o<? super p<T>, ? extends u<R>> oVar, int i11) {
        C9656b.c(oVar, "selector is null");
        C9656b.d(i11, "bufferSize");
        return T0.h(oVar, C11062o0.i(this, i11));
    }

    public final p<T> retry(long j11) {
        return retry(j11, C9653a.c());
    }

    public final p<T> startWith(T t2) {
        C9656b.c(t2, "item is null");
        return concatArray(just(t2), this);
    }

    public final InterfaceC8487b subscribe(qc.g<? super T> gVar, qc.g<? super Throwable> gVar2, InterfaceC9019a interfaceC9019a) {
        return subscribe(gVar, gVar2, interfaceC9019a, C9653a.g());
    }

    public final p<T> throttleLatest(long j11, TimeUnit timeUnit, x xVar, boolean z11) {
        C9656b.c(timeUnit, "unit is null");
        C9656b.c(xVar, "scheduler is null");
        return new x1(this, j11, timeUnit, xVar, z11);
    }

    public final p<Mc.b<T>> timeInterval(TimeUnit timeUnit, x xVar) {
        C9656b.c(timeUnit, "unit is null");
        C9656b.c(xVar, "scheduler is null");
        return new y1(this, timeUnit, xVar);
    }

    public final p<T> timeout(long j11, TimeUnit timeUnit) {
        return timeout0(j11, timeUnit, null, Mc.a.a());
    }

    public final p<Mc.b<T>> timestamp(TimeUnit timeUnit, x xVar) {
        C9656b.c(timeUnit, "unit is null");
        C9656b.c(xVar, "scheduler is null");
        return (p<Mc.b<T>>) map(C9653a.u(timeUnit, xVar));
    }

    public final <U extends Collection<? super T>> y<U> toList(Callable<U> callable) {
        C9656b.c(callable, "collectionSupplier is null");
        return new D1(this, callable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T1, T2, R> p<R> withLatestFrom(u<T1> uVar, u<T2> uVar2, qc.h<? super T, ? super T1, ? super T2, R> hVar) {
        C9656b.c(uVar, "o1 is null");
        C9656b.c(uVar2, "o2 is null");
        C9656b.c(hVar, "combiner is null");
        return withLatestFrom((u<?>[]) new u[]{uVar, uVar2}, C9653a.x(hVar));
    }

    public final <U, R> p<R> zipWith(u<? extends U> uVar, InterfaceC9021c<? super T, ? super U, ? extends R> interfaceC9021c) {
        C9656b.c(uVar, "other is null");
        return zip(this, uVar, interfaceC9021c);
    }

    public static <T, S> p<T> generate(Callable<S> callable, InterfaceC9020b<S, g<T>> interfaceC9020b) {
        C9656b.c(interfaceC9020b, "generator is null");
        return generate(callable, C11062o0.l(interfaceC9020b), C9653a.g());
    }

    public static p<Long> interval(long j11, TimeUnit timeUnit) {
        return interval(j11, j11, timeUnit, Mc.a.a());
    }

    public final T blockingFirst(T t2) {
        uc.e eVar = new uc.e();
        subscribe(eVar);
        T a11 = eVar.a();
        return a11 != null ? a11 : t2;
    }

    public final T blockingLast(T t2) {
        uc.f fVar = new uc.f();
        subscribe(fVar);
        T a11 = fVar.a();
        return a11 != null ? a11 : t2;
    }

    public final void blockingSubscribe(w<? super T> wVar) {
        ru.ozon.android.messenger.framework.network.di.a.b(this, wVar);
    }

    public final p<T> concatWith(n<? extends T> nVar) {
        C9656b.c(nVar, "other is null");
        return new C11080x(this, nVar);
    }

    public final p<T> delay(long j11, TimeUnit timeUnit, x xVar) {
        return delay(j11, timeUnit, xVar, false);
    }

    public final <K, V> p<Hc.b<K, V>> groupBy(qc.o<? super T, ? extends K> oVar, qc.o<? super T, ? extends V> oVar2, boolean z11, int i11) {
        C9656b.c(oVar, "keySelector is null");
        C9656b.c(oVar2, "valueSelector is null");
        C9656b.d(i11, "bufferSize");
        return new C11047j0(this, oVar, oVar2, i11, z11);
    }

    public final p<T> mergeWith(n<? extends T> nVar) {
        C9656b.c(nVar, "other is null");
        return new A0(this, nVar);
    }

    public final p<T> retry(long j11, qc.q<? super Throwable> qVar) {
        if (j11 >= 0) {
            C9656b.c(qVar, "predicate is null");
            return new V0(this, j11, qVar);
        }
        throw new IllegalArgumentException(C3173b.b(j11, "times >= 0 required but it was "));
    }

    public final InterfaceC8487b subscribe(qc.g<? super T> gVar, qc.g<? super Throwable> gVar2, InterfaceC9019a interfaceC9019a, qc.g<? super InterfaceC8487b> gVar3) {
        C9656b.c(gVar, "onNext is null");
        C9656b.c(gVar2, "onError is null");
        C9656b.c(interfaceC9019a, "onComplete is null");
        C9656b.c(gVar3, "onSubscribe is null");
        uc.r rVar = new uc.r(gVar, gVar2, interfaceC9019a, gVar3);
        subscribe(rVar);
        return rVar;
    }

    public final p<T> timeout(long j11, TimeUnit timeUnit, u<? extends T> uVar) {
        C9656b.c(uVar, "other is null");
        return timeout0(j11, timeUnit, uVar, Mc.a.a());
    }

    public final <K, V> y<Map<K, Collection<V>>> toMultimap(qc.o<? super T, ? extends K> oVar, qc.o<? super T, ? extends V> oVar2) {
        return toMultimap(oVar, oVar2, Gc.j.a(), Gc.b.b());
    }

    public final y<List<T>> toSortedList(Comparator<? super T> comparator, int i11) {
        C9656b.c(comparator, "comparator is null");
        y<List<T>> list = toList(i11);
        qc.o m11 = C9653a.m(comparator);
        list.getClass();
        return new Bc.r(list, m11);
    }

    public static <T> p<T> fromFuture(Future<? extends T> future, long j11, TimeUnit timeUnit, x xVar) {
        C9656b.c(xVar, "scheduler is null");
        return fromFuture(future, j11, timeUnit).subscribeOn(xVar);
    }

    public static p<Long> interval(long j11, TimeUnit timeUnit, x xVar) {
        return interval(j11, j11, timeUnit, xVar);
    }

    public static <T> p<T> just(T t2, T t11, T t12) {
        C9656b.c(t2, "item1 is null");
        C9656b.c(t11, "item2 is null");
        C9656b.c(t12, "item3 is null");
        return fromArray(t2, t11, t12);
    }

    public static <T> p<T> merge(u<? extends u<? extends T>> uVar, int i11) {
        C9656b.c(uVar, "sources is null");
        C9656b.d(i11, "maxConcurrency");
        return new W(uVar, C9653a.i(), false, i11, bufferSize());
    }

    public static <T> p<T> mergeDelayError(u<? extends u<? extends T>> uVar, int i11) {
        C9656b.c(uVar, "sources is null");
        C9656b.d(i11, "maxConcurrency");
        return new W(uVar, C9653a.i(), true, i11, bufferSize());
    }

    public final T blockingSingle(T t2) {
        return single(t2).d();
    }

    public final p<T> delay(long j11, TimeUnit timeUnit, x xVar, boolean z11) {
        C9656b.c(timeUnit, "unit is null");
        C9656b.c(xVar, "scheduler is null");
        return new F(this, j11, timeUnit, xVar, z11);
    }

    public final p<T> doOnEach(qc.g<? super o<T>> gVar) {
        C9656b.c(gVar, "onNotification is null");
        return doOnEach(C9653a.r(gVar), C9653a.q(gVar), C9653a.p(gVar), C9653a.f98523c);
    }

    public final p<T> sample(long j11, TimeUnit timeUnit, x xVar, boolean z11) {
        C9656b.c(timeUnit, "unit is null");
        C9656b.c(xVar, "scheduler is null");
        return new X0(this, j11, timeUnit, xVar, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> y<Map<K, V>> toMap(qc.o<? super T, ? extends K> oVar, qc.o<? super T, ? extends V> oVar2, Callable<? extends Map<K, V>> callable) {
        C9656b.c(oVar, "keySelector is null");
        C9656b.c(oVar2, "valueSelector is null");
        C9656b.c(callable, "mapSupplier is null");
        return (y<Map<K, V>>) collect(callable, C9653a.E(oVar, oVar2));
    }

    public final <U, R> p<R> zipWith(u<? extends U> uVar, InterfaceC9021c<? super T, ? super U, ? extends R> interfaceC9021c, boolean z11) {
        return zip(this, uVar, interfaceC9021c, z11);
    }

    public static <T, R> p<R> combineLatest(u<? extends T>[] uVarArr, qc.o<? super Object[], ? extends R> oVar) {
        return combineLatest(uVarArr, oVar, bufferSize());
    }

    public static <T> p<T> concat(u<? extends T> uVar, u<? extends T> uVar2) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        return concatArray(uVar, uVar2);
    }

    public static <T, S> p<T> generate(Callable<S> callable, InterfaceC9020b<S, g<T>> interfaceC9020b, qc.g<? super S> gVar) {
        C9656b.c(interfaceC9020b, "generator is null");
        return generate(callable, C11062o0.l(interfaceC9020b), gVar);
    }

    public final <U extends Collection<? super T>> p<U> buffer(int i11, Callable<U> callable) {
        return buffer(i11, i11, callable);
    }

    public final p<T> concatWith(f fVar) {
        C9656b.c(fVar, "other is null");
        return new C11078w(this, fVar);
    }

    public final p<T> mergeWith(f fVar) {
        C9656b.c(fVar, "other is null");
        return new C11085z0(this, fVar);
    }

    public final <R> p<R> replay(qc.o<? super p<T>, ? extends u<R>> oVar, int i11, long j11, TimeUnit timeUnit) {
        return replay(oVar, i11, j11, timeUnit, Mc.a.a());
    }

    public final p<T> timeout(long j11, TimeUnit timeUnit, x xVar, u<? extends T> uVar) {
        C9656b.c(uVar, "other is null");
        return timeout0(j11, timeUnit, uVar, xVar);
    }

    public final p<p<T>> window(long j11, long j12, TimeUnit timeUnit) {
        return window(j11, j12, timeUnit, Mc.a.a(), bufferSize());
    }

    public final <U, R> p<R> zipWith(u<? extends U> uVar, InterfaceC9021c<? super T, ? super U, ? extends R> interfaceC9021c, boolean z11, int i11) {
        return zip(this, uVar, interfaceC9021c, z11, i11);
    }

    public static <T, R> p<R> combineLatest(u<? extends T>[] uVarArr, qc.o<? super Object[], ? extends R> oVar, int i11) {
        C9656b.c(uVarArr, "sources is null");
        if (uVarArr.length == 0) {
            return empty();
        }
        C9656b.c(oVar, "combiner is null");
        C9656b.d(i11, "bufferSize");
        return new C11072t(uVarArr, null, oVar, i11 << 1, false);
    }

    public static <T, R> p<R> combineLatestDelayError(Iterable<? extends u<? extends T>> iterable, qc.o<? super Object[], ? extends R> oVar) {
        return combineLatestDelayError(iterable, oVar, bufferSize());
    }

    public static <T> y<Boolean> sequenceEqual(u<? extends T> uVar, u<? extends T> uVar2, int i11) {
        return sequenceEqual(uVar, uVar2, C9656b.b(), i11);
    }

    public static <T1, T2, R> p<R> zip(u<? extends T1> uVar, u<? extends T2> uVar2, InterfaceC9021c<? super T1, ? super T2, ? extends R> interfaceC9021c) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        return zipArray(C9653a.w(interfaceC9021c), false, bufferSize(), uVar, uVar2);
    }

    public final p<List<T>> buffer(long j11, long j12, TimeUnit timeUnit) {
        return (p<List<T>>) buffer(j11, j12, timeUnit, Mc.a.a(), Gc.b.a());
    }

    public final <R> p<R> replay(qc.o<? super p<T>, ? extends u<R>> oVar, int i11, long j11, TimeUnit timeUnit, x xVar) {
        C9656b.c(oVar, "selector is null");
        C9656b.d(i11, "bufferSize");
        C9656b.c(timeUnit, "unit is null");
        C9656b.c(xVar, "scheduler is null");
        return T0.h(oVar, C11062o0.g(i11, j11, this, xVar, timeUnit));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> y<Map<K, Collection<V>>> toMultimap(qc.o<? super T, ? extends K> oVar, qc.o<? super T, ? extends V> oVar2, Callable<? extends Map<K, Collection<V>>> callable, qc.o<? super K, ? extends Collection<? super V>> oVar3) {
        C9656b.c(oVar, "keySelector is null");
        C9656b.c(oVar2, "valueSelector is null");
        C9656b.c(callable, "mapSupplier is null");
        C9656b.c(oVar3, "collectionFactory is null");
        return (y<Map<K, Collection<V>>>) collect(callable, C9653a.F(oVar, oVar2, oVar3));
    }

    public final y<List<T>> toSortedList(int i11) {
        return toSortedList(C9653a.o(), i11);
    }

    public final p<p<T>> window(long j11, long j12, TimeUnit timeUnit, x xVar) {
        return window(j11, j12, timeUnit, xVar, bufferSize());
    }

    public static <T, R> p<R> combineLatestDelayError(Iterable<? extends u<? extends T>> iterable, qc.o<? super Object[], ? extends R> oVar, int i11) {
        C9656b.c(iterable, "sources is null");
        C9656b.c(oVar, "combiner is null");
        C9656b.d(i11, "bufferSize");
        return new C11072t(null, iterable, oVar, i11 << 1, true);
    }

    public static <T> p<T> fromFuture(Future<? extends T> future, x xVar) {
        C9656b.c(xVar, "scheduler is null");
        return fromFuture(future).subscribeOn(xVar);
    }

    public static <T, S> p<T> generate(Callable<S> callable, InterfaceC9021c<S, g<T>, S> interfaceC9021c) {
        return generate(callable, interfaceC9021c, C9653a.g());
    }

    public static <T> p<T> merge(u<? extends T> uVar, u<? extends T> uVar2) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        return fromArray(uVar, uVar2).flatMap(C9653a.i(), false, 2);
    }

    public static <T> p<T> mergeDelayError(u<? extends T> uVar, u<? extends T> uVar2) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        return fromArray(uVar, uVar2).flatMap(C9653a.i(), true, 2);
    }

    public final p<List<T>> buffer(long j11, long j12, TimeUnit timeUnit, x xVar) {
        return (p<List<T>>) buffer(j11, j12, timeUnit, xVar, Gc.b.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <U, V> p<T> delay(u<U> uVar, qc.o<? super T, ? extends u<V>> oVar) {
        return delaySubscription(uVar).delay(oVar);
    }

    public final y<T> elementAt(long j11, T t2) {
        if (j11 >= 0) {
            C9656b.c(t2, "defaultItem is null");
            return new S(this, j11, t2);
        }
        throw new IndexOutOfBoundsException(C3173b.b(j11, "index >= 0 required but it was "));
    }

    public final <U> p<T> sample(u<U> uVar) {
        C9656b.c(uVar, "sampler is null");
        return new Y0(this, uVar, false);
    }

    public final p<T> skipLast(long j11, TimeUnit timeUnit) {
        return skipLast(j11, timeUnit, Mc.a.d(), false, bufferSize());
    }

    public final p<T> take(long j11, TimeUnit timeUnit) {
        return takeUntil(timer(j11, timeUnit));
    }

    public final p<T> timeout(long j11, TimeUnit timeUnit, x xVar) {
        return timeout0(j11, timeUnit, null, xVar);
    }

    public final p<p<T>> window(long j11, long j12, TimeUnit timeUnit, x xVar, int i11) {
        C9656b.e(j11, "timespan");
        C9656b.e(j12, "timeskip");
        C9656b.d(i11, "bufferSize");
        C9656b.c(xVar, "scheduler is null");
        C9656b.c(timeUnit, "unit is null");
        return new K1(this, j11, j12, timeUnit, xVar, Long.MAX_VALUE, i11, false);
    }

    public final <T1, T2, T3, R> p<R> withLatestFrom(u<T1> uVar, u<T2> uVar2, u<T3> uVar3, qc.i<? super T, ? super T1, ? super T2, ? super T3, R> iVar) {
        C9656b.c(uVar, "o1 is null");
        C9656b.c(uVar2, "o2 is null");
        C9656b.c(uVar3, "o3 is null");
        C9656b.c(iVar, "combiner is null");
        C9653a.v();
        throw null;
    }

    public static <T> p<T> concat(u<? extends T> uVar, u<? extends T> uVar2, u<? extends T> uVar3) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        C9656b.c(uVar3, "source3 is null");
        return concatArray(uVar, uVar2, uVar3);
    }

    public static <T, S> p<T> generate(Callable<S> callable, InterfaceC9021c<S, g<T>, S> interfaceC9021c, qc.g<? super S> gVar) {
        C9656b.c(callable, "initialState is null");
        C9656b.c(interfaceC9021c, "generator is null");
        C9656b.c(gVar, "disposeState is null");
        return new C11044i0(callable, interfaceC9021c, gVar);
    }

    public static <T> p<T> just(T t2, T t11, T t12, T t13) {
        C9656b.c(t2, "item1 is null");
        C9656b.c(t11, "item2 is null");
        C9656b.c(t12, "item3 is null");
        C9656b.c(t13, "item4 is null");
        return fromArray(t2, t11, t12, t13);
    }

    public final <U extends Collection<? super T>> p<U> buffer(long j11, long j12, TimeUnit timeUnit, x xVar, Callable<U> callable) {
        C9656b.c(timeUnit, "unit is null");
        C9656b.c(xVar, "scheduler is null");
        C9656b.c(callable, "bufferSupplier is null");
        return new C11064p(this, j11, j12, timeUnit, xVar, callable, Integer.MAX_VALUE, false);
    }

    public final p<T> skipLast(long j11, TimeUnit timeUnit, boolean z11) {
        return skipLast(j11, timeUnit, Mc.a.d(), z11, bufferSize());
    }

    public final p<T> take(long j11, TimeUnit timeUnit, x xVar) {
        return takeUntil(timer(j11, timeUnit, xVar));
    }

    public final <U, V> p<T> timeout(u<U> uVar, qc.o<? super T, ? extends u<V>> oVar) {
        C9656b.c(uVar, "firstTimeoutIndicator is null");
        return timeout0(uVar, oVar, null);
    }

    public static <T1, T2, R> p<R> zip(u<? extends T1> uVar, u<? extends T2> uVar2, InterfaceC9021c<? super T1, ? super T2, ? extends R> interfaceC9021c, boolean z11) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        return zipArray(C9653a.w(interfaceC9021c), z11, bufferSize(), uVar, uVar2);
    }

    public final p<T> doOnEach(w<? super T> wVar) {
        C9656b.c(wVar, "observer is null");
        return doOnEach(C11062o0.f(wVar), C11062o0.e(wVar), C11062o0.d(wVar), C9653a.f98523c);
    }

    public final <U> p<T> sample(u<U> uVar, boolean z11) {
        C9656b.c(uVar, "sampler is null");
        return new Y0(this, uVar, z11);
    }

    public final p<T> skipLast(long j11, TimeUnit timeUnit, x xVar) {
        return skipLast(j11, timeUnit, xVar, false, bufferSize());
    }

    @Override // io.reactivex.u
    public final void subscribe(w<? super T> wVar) {
        C9656b.c(wVar, "observer is null");
        try {
            subscribeActual(wVar);
        } catch (NullPointerException e11) {
            throw e11;
        } catch (Throwable th2) {
            C2645f.c(th2);
            C3493a.f(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final p<T> takeLast(long j11, long j12, TimeUnit timeUnit) {
        return takeLast(j11, j12, timeUnit, Mc.a.d(), false, bufferSize());
    }

    public static <T> p<T> merge(u<? extends T> uVar, u<? extends T> uVar2, u<? extends T> uVar3) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        C9656b.c(uVar3, "source3 is null");
        return fromArray(uVar, uVar2, uVar3).flatMap(C9653a.i(), false, 3);
    }

    public static <T> p<T> mergeDelayError(u<? extends T> uVar, u<? extends T> uVar2, u<? extends T> uVar3) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        C9656b.c(uVar3, "source3 is null");
        return fromArray(uVar, uVar2, uVar3).flatMap(C9653a.i(), true, 3);
    }

    public final <R> p<R> flatMap(qc.o<? super T, ? extends u<? extends R>> oVar, qc.o<? super Throwable, ? extends u<? extends R>> oVar2, Callable<? extends u<? extends R>> callable) {
        C9656b.c(oVar, "onNextMapper is null");
        C9656b.c(oVar2, "onErrorMapper is null");
        C9656b.c(callable, "onCompleteSupplier is null");
        return merge(new C11081x0(this, oVar, oVar2, callable));
    }

    public final p<T> skipLast(long j11, TimeUnit timeUnit, x xVar, boolean z11) {
        return skipLast(j11, timeUnit, xVar, z11, bufferSize());
    }

    public final p<T> takeLast(long j11, long j12, TimeUnit timeUnit, x xVar) {
        return takeLast(j11, j12, timeUnit, xVar, false, bufferSize());
    }

    public final <U, V> p<T> timeout(u<U> uVar, qc.o<? super T, ? extends u<V>> oVar, u<? extends T> uVar2) {
        C9656b.c(uVar, "firstTimeoutIndicator is null");
        C9656b.c(uVar2, "other is null");
        return timeout0(uVar, oVar, uVar2);
    }

    public final p<T> skipLast(long j11, TimeUnit timeUnit, x xVar, boolean z11, int i11) {
        C9656b.c(timeUnit, "unit is null");
        C9656b.c(xVar, "scheduler is null");
        C9656b.d(i11, "bufferSize");
        return new C11048j1(this, j11, timeUnit, xVar, i11 << 1, z11);
    }

    public final p<T> takeLast(long j11, long j12, TimeUnit timeUnit, x xVar, boolean z11, int i11) {
        C9656b.c(timeUnit, "unit is null");
        C9656b.c(xVar, "scheduler is null");
        C9656b.d(i11, "bufferSize");
        if (j11 >= 0) {
            return new s1(this, j11, j12, timeUnit, xVar, i11, z11);
        }
        throw new IndexOutOfBoundsException(C3173b.b(j11, "count >= 0 required but it was "));
    }

    public final <K, V> y<Map<K, Collection<V>>> toMultimap(qc.o<? super T, ? extends K> oVar, qc.o<? super T, ? extends V> oVar2, Callable<Map<K, Collection<V>>> callable) {
        return toMultimap(oVar, oVar2, callable, Gc.b.b());
    }

    public static <T1, T2, R> p<R> combineLatest(u<? extends T1> uVar, u<? extends T2> uVar2, InterfaceC9021c<? super T1, ? super T2, ? extends R> interfaceC9021c) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        return combineLatest(C9653a.w(interfaceC9021c), bufferSize(), uVar, uVar2);
    }

    public static <T> p<T> concat(u<? extends T> uVar, u<? extends T> uVar2, u<? extends T> uVar3, u<? extends T> uVar4) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        C9656b.c(uVar3, "source3 is null");
        C9656b.c(uVar4, "source4 is null");
        return concatArray(uVar, uVar2, uVar3, uVar4);
    }

    public static <T1, T2, R> p<R> zip(u<? extends T1> uVar, u<? extends T2> uVar2, InterfaceC9021c<? super T1, ? super T2, ? extends R> interfaceC9021c, boolean z11, int i11) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        return zipArray(C9653a.w(interfaceC9021c), z11, i11, uVar, uVar2);
    }

    public final p<List<T>> buffer(long j11, TimeUnit timeUnit) {
        return buffer(j11, timeUnit, Mc.a.a(), Integer.MAX_VALUE);
    }

    public final <R> p<R> replay(qc.o<? super p<T>, ? extends u<R>> oVar, int i11, x xVar) {
        C9656b.c(oVar, "selector is null");
        C9656b.c(xVar, "scheduler is null");
        C9656b.d(i11, "bufferSize");
        return T0.h(C11062o0.k(oVar, xVar), C11062o0.i(this, i11));
    }

    public final p<T> retry(qc.q<? super Throwable> qVar) {
        return retry(Long.MAX_VALUE, qVar);
    }

    public final <T1, T2, T3, T4, R> p<R> withLatestFrom(u<T1> uVar, u<T2> uVar2, u<T3> uVar3, u<T4> uVar4, qc.j<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> jVar) {
        C9656b.c(uVar, "o1 is null");
        C9656b.c(uVar2, "o2 is null");
        C9656b.c(uVar3, "o3 is null");
        C9656b.c(uVar4, "o4 is null");
        C9656b.c(jVar, "combiner is null");
        C9653a.y();
        throw null;
    }

    public static <T> p<T> just(T t2, T t11, T t12, T t13, T t14) {
        C9656b.c(t2, "item1 is null");
        C9656b.c(t11, "item2 is null");
        C9656b.c(t12, "item3 is null");
        C9656b.c(t13, "item4 is null");
        C9656b.c(t14, "item5 is null");
        return fromArray(t2, t11, t12, t13, t14);
    }

    public final p<List<T>> buffer(long j11, TimeUnit timeUnit, int i11) {
        return buffer(j11, timeUnit, Mc.a.a(), i11);
    }

    public final p<p<T>> window(long j11, TimeUnit timeUnit) {
        return window(j11, timeUnit, Mc.a.a(), Long.MAX_VALUE, false);
    }

    public static <T> p<T> merge(u<? extends T> uVar, u<? extends T> uVar2, u<? extends T> uVar3, u<? extends T> uVar4) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        C9656b.c(uVar3, "source3 is null");
        C9656b.c(uVar4, "source4 is null");
        return fromArray(uVar, uVar2, uVar3, uVar4).flatMap(C9653a.i(), false, 4);
    }

    public static <T> p<T> mergeDelayError(u<? extends T> uVar, u<? extends T> uVar2, u<? extends T> uVar3, u<? extends T> uVar4) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        C9656b.c(uVar3, "source3 is null");
        C9656b.c(uVar4, "source4 is null");
        return fromArray(uVar, uVar2, uVar3, uVar4).flatMap(C9653a.i(), true, 4);
    }

    public final p<List<T>> buffer(long j11, TimeUnit timeUnit, x xVar, int i11) {
        return (p<List<T>>) buffer(j11, timeUnit, xVar, i11, Gc.b.a(), false);
    }

    public final <R> p<R> flatMap(qc.o<? super T, ? extends u<? extends R>> oVar, qc.o<Throwable, ? extends u<? extends R>> oVar2, Callable<? extends u<? extends R>> callable, int i11) {
        C9656b.c(oVar, "onNextMapper is null");
        C9656b.c(oVar2, "onErrorMapper is null");
        C9656b.c(callable, "onCompleteSupplier is null");
        return merge(new C11081x0(this, oVar, oVar2, callable), i11);
    }

    public final p<p<T>> window(long j11, TimeUnit timeUnit, long j12) {
        return window(j11, timeUnit, Mc.a.a(), j12, false);
    }

    public static <T1, T2, T3, R> p<R> combineLatest(u<? extends T1> uVar, u<? extends T2> uVar2, u<? extends T3> uVar3, qc.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        C9656b.c(uVar3, "source3 is null");
        return combineLatest(C9653a.x(hVar), bufferSize(), uVar, uVar2, uVar3);
    }

    public static <T1, T2, T3, R> p<R> zip(u<? extends T1> uVar, u<? extends T2> uVar2, u<? extends T3> uVar3, qc.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        C9656b.c(uVar3, "source3 is null");
        return zipArray(C9653a.x(hVar), false, bufferSize(), uVar, uVar2, uVar3);
    }

    public final <U extends Collection<? super T>> p<U> buffer(long j11, TimeUnit timeUnit, x xVar, int i11, Callable<U> callable, boolean z11) {
        C9656b.c(timeUnit, "unit is null");
        C9656b.c(xVar, "scheduler is null");
        C9656b.c(callable, "bufferSupplier is null");
        C9656b.d(i11, "count");
        return new C11064p(this, j11, j11, timeUnit, xVar, callable, i11, z11);
    }

    public final p<p<T>> window(long j11, TimeUnit timeUnit, long j12, boolean z11) {
        return window(j11, timeUnit, Mc.a.a(), j12, z11);
    }

    public final p<p<T>> window(long j11, TimeUnit timeUnit, x xVar) {
        return window(j11, timeUnit, xVar, Long.MAX_VALUE, false);
    }

    public final p<p<T>> window(long j11, TimeUnit timeUnit, x xVar, long j12) {
        return window(j11, timeUnit, xVar, j12, false);
    }

    public final <R> p<R> flatMap(qc.o<? super T, ? extends u<? extends R>> oVar, int i11) {
        return flatMap((qc.o) oVar, false, i11, bufferSize());
    }

    public final <R> p<R> replay(qc.o<? super p<T>, ? extends u<R>> oVar, long j11, TimeUnit timeUnit) {
        return replay(oVar, j11, timeUnit, Mc.a.a());
    }

    public final p<p<T>> window(long j11, TimeUnit timeUnit, x xVar, long j12, boolean z11) {
        return window(j11, timeUnit, xVar, j12, z11, bufferSize());
    }

    public final <R> p<R> withLatestFrom(u<?>[] uVarArr, qc.o<? super Object[], R> oVar) {
        C9656b.c(uVarArr, "others is null");
        C9656b.c(oVar, "combiner is null");
        return new M1(this, uVarArr, oVar);
    }

    public static <T1, T2, T3, T4, R> p<R> combineLatest(u<? extends T1> uVar, u<? extends T2> uVar2, u<? extends T3> uVar3, u<? extends T4> uVar4, qc.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        C9656b.c(uVar3, "source3 is null");
        C9656b.c(uVar4, "source4 is null");
        C9653a.v();
        throw null;
    }

    public static <T> p<T> just(T t2, T t11, T t12, T t13, T t14, T t15) {
        C9656b.c(t2, "item1 is null");
        C9656b.c(t11, "item2 is null");
        C9656b.c(t12, "item3 is null");
        C9656b.c(t13, "item4 is null");
        C9656b.c(t14, "item5 is null");
        C9656b.c(t15, "item6 is null");
        return fromArray(t2, t11, t12, t13, t14, t15);
    }

    public static <T1, T2, T3, T4, R> p<R> zip(u<? extends T1> uVar, u<? extends T2> uVar2, u<? extends T3> uVar3, u<? extends T4> uVar4, qc.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        C9656b.c(uVar3, "source3 is null");
        C9656b.c(uVar4, "source4 is null");
        C9653a.v();
        throw null;
    }

    public final <U, R> p<R> flatMap(qc.o<? super T, ? extends u<? extends U>> oVar, InterfaceC9021c<? super T, ? super U, ? extends R> interfaceC9021c) {
        return flatMap(oVar, interfaceC9021c, false, bufferSize(), bufferSize());
    }

    public final <R> p<R> replay(qc.o<? super p<T>, ? extends u<R>> oVar, long j11, TimeUnit timeUnit, x xVar) {
        C9656b.c(oVar, "selector is null");
        C9656b.c(timeUnit, "unit is null");
        C9656b.c(xVar, "scheduler is null");
        return T0.h(oVar, C11062o0.j(this, j11, timeUnit, xVar));
    }

    public final p<p<T>> window(long j11, TimeUnit timeUnit, x xVar, long j12, boolean z11, int i11) {
        C9656b.d(i11, "bufferSize");
        C9656b.c(xVar, "scheduler is null");
        C9656b.c(timeUnit, "unit is null");
        C9656b.e(j12, "count");
        return new K1(this, j11, j11, timeUnit, xVar, j12, i11, z11);
    }

    public final p<List<T>> buffer(long j11, TimeUnit timeUnit, x xVar) {
        return (p<List<T>>) buffer(j11, timeUnit, xVar, Integer.MAX_VALUE, Gc.b.a(), false);
    }

    public final <U, R> p<R> flatMap(qc.o<? super T, ? extends u<? extends U>> oVar, InterfaceC9021c<? super T, ? super U, ? extends R> interfaceC9021c, boolean z11) {
        return flatMap(oVar, interfaceC9021c, z11, bufferSize(), bufferSize());
    }

    public final <TOpening, TClosing> p<List<T>> buffer(u<? extends TOpening> uVar, qc.o<? super TOpening, ? extends u<? extends TClosing>> oVar) {
        return (p<List<T>>) buffer(uVar, oVar, Gc.b.a());
    }

    public final <U, R> p<R> flatMap(qc.o<? super T, ? extends u<? extends U>> oVar, InterfaceC9021c<? super T, ? super U, ? extends R> interfaceC9021c, boolean z11, int i11) {
        return flatMap(oVar, interfaceC9021c, z11, i11, bufferSize());
    }

    public final <R> p<R> withLatestFrom(Iterable<? extends u<?>> iterable, qc.o<? super Object[], R> oVar) {
        C9656b.c(iterable, "others is null");
        C9656b.c(oVar, "combiner is null");
        return new M1(this, iterable, oVar);
    }

    public final <TOpening, TClosing, U extends Collection<? super T>> p<U> buffer(u<? extends TOpening> uVar, qc.o<? super TOpening, ? extends u<? extends TClosing>> oVar, Callable<U> callable) {
        C9656b.c(uVar, "openingIndicator is null");
        C9656b.c(oVar, "closingIndicator is null");
        C9656b.c(callable, "bufferSupplier is null");
        return new C11055m(this, uVar, oVar, callable);
    }

    public final <U, R> p<R> flatMap(qc.o<? super T, ? extends u<? extends U>> oVar, InterfaceC9021c<? super T, ? super U, ? extends R> interfaceC9021c, boolean z11, int i11, int i12) {
        C9656b.c(oVar, "mapper is null");
        C9656b.c(interfaceC9021c, "combiner is null");
        return flatMap(C11062o0.b(oVar, interfaceC9021c), z11, i11, i12);
    }

    public final p<T> takeLast(long j11, TimeUnit timeUnit) {
        return takeLast(j11, timeUnit, Mc.a.d(), false, bufferSize());
    }

    public final <R> p<R> replay(qc.o<? super p<T>, ? extends u<R>> oVar, x xVar) {
        C9656b.c(oVar, "selector is null");
        C9656b.c(xVar, "scheduler is null");
        return T0.h(C11062o0.k(oVar, xVar), C11062o0.h(this));
    }

    public final p<T> takeLast(long j11, TimeUnit timeUnit, boolean z11) {
        return takeLast(j11, timeUnit, Mc.a.d(), z11, bufferSize());
    }

    public static <T1, T2, T3, T4, T5, R> p<R> combineLatest(u<? extends T1> uVar, u<? extends T2> uVar2, u<? extends T3> uVar3, u<? extends T4> uVar4, u<? extends T5> uVar5, qc.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        C9656b.c(uVar3, "source3 is null");
        C9656b.c(uVar4, "source4 is null");
        C9656b.c(uVar5, "source5 is null");
        C9653a.y();
        throw null;
    }

    public static <T1, T2, T3, T4, T5, R> p<R> zip(u<? extends T1> uVar, u<? extends T2> uVar2, u<? extends T3> uVar3, u<? extends T4> uVar4, u<? extends T5> uVar5, qc.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        C9656b.c(uVar3, "source3 is null");
        C9656b.c(uVar4, "source4 is null");
        C9656b.c(uVar5, "source5 is null");
        C9653a.y();
        throw null;
    }

    public final p<T> takeLast(long j11, TimeUnit timeUnit, x xVar) {
        return takeLast(j11, timeUnit, xVar, false, bufferSize());
    }

    public final <B> p<p<T>> window(u<B> uVar) {
        return window(uVar, bufferSize());
    }

    public final <U, R> p<R> flatMap(qc.o<? super T, ? extends u<? extends U>> oVar, InterfaceC9021c<? super T, ? super U, ? extends R> interfaceC9021c, int i11) {
        return flatMap(oVar, interfaceC9021c, false, i11, bufferSize());
    }

    public final p<T> takeLast(long j11, TimeUnit timeUnit, x xVar, boolean z11) {
        return takeLast(j11, timeUnit, xVar, z11, bufferSize());
    }

    public final <B> p<p<T>> window(u<B> uVar, int i11) {
        C9656b.c(uVar, "boundary is null");
        C9656b.d(i11, "bufferSize");
        return new H1(this, uVar, i11);
    }

    public static <T> p<T> just(T t2, T t11, T t12, T t13, T t14, T t15, T t16) {
        C9656b.c(t2, "item1 is null");
        C9656b.c(t11, "item2 is null");
        C9656b.c(t12, "item3 is null");
        C9656b.c(t13, "item4 is null");
        C9656b.c(t14, "item5 is null");
        C9656b.c(t15, "item6 is null");
        C9656b.c(t16, "item7 is null");
        return fromArray(t2, t11, t12, t13, t14, t15, t16);
    }

    public final <B> p<List<T>> buffer(u<B> uVar) {
        return (p<List<T>>) buffer((u) uVar, (Callable) Gc.b.a());
    }

    public final p<T> takeLast(long j11, TimeUnit timeUnit, x xVar, boolean z11, int i11) {
        return takeLast(Long.MAX_VALUE, j11, timeUnit, xVar, z11, i11);
    }

    public final <B> p<List<T>> buffer(u<B> uVar, int i11) {
        C9656b.d(i11, "initialCapacity");
        return (p<List<T>>) buffer(uVar, C9653a.e(i11));
    }

    public final AbstractC3137a<T> replay(int i11) {
        C9656b.d(i11, "bufferSize");
        return T0.e(this, i11);
    }

    public final <U, V> p<p<T>> window(u<U> uVar, qc.o<? super U, ? extends u<V>> oVar) {
        return window(uVar, oVar, bufferSize());
    }

    public final <B, U extends Collection<? super T>> p<U> buffer(u<B> uVar, Callable<U> callable) {
        C9656b.c(uVar, "boundary is null");
        C9656b.c(callable, "bufferSupplier is null");
        return new C11061o(this, uVar, callable);
    }

    public final <U, V> p<p<T>> window(u<U> uVar, qc.o<? super U, ? extends u<V>> oVar, int i11) {
        C9656b.c(uVar, "openingIndicator is null");
        C9656b.c(oVar, "closingIndicator is null");
        C9656b.d(i11, "bufferSize");
        return new I1(this, uVar, oVar, i11);
    }

    public static <T1, T2, T3, T4, T5, T6, R> p<R> combineLatest(u<? extends T1> uVar, u<? extends T2> uVar2, u<? extends T3> uVar3, u<? extends T4> uVar4, u<? extends T5> uVar5, u<? extends T6> uVar6, qc.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        C9656b.c(uVar3, "source3 is null");
        C9656b.c(uVar4, "source4 is null");
        C9656b.c(uVar5, "source5 is null");
        C9656b.c(uVar6, "source6 is null");
        C9653a.z();
        throw null;
    }

    public static <T1, T2, T3, T4, T5, T6, R> p<R> zip(u<? extends T1> uVar, u<? extends T2> uVar2, u<? extends T3> uVar3, u<? extends T4> uVar4, u<? extends T5> uVar5, u<? extends T6> uVar6, qc.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        C9656b.c(uVar3, "source3 is null");
        C9656b.c(uVar4, "source4 is null");
        C9656b.c(uVar5, "source5 is null");
        C9656b.c(uVar6, "source6 is null");
        C9653a.z();
        throw null;
    }

    public final AbstractC3137a<T> replay(int i11, long j11, TimeUnit timeUnit) {
        return replay(i11, j11, timeUnit, Mc.a.a());
    }

    public final AbstractC3137a<T> replay(int i11, long j11, TimeUnit timeUnit, x xVar) {
        C9656b.d(i11, "bufferSize");
        C9656b.c(timeUnit, "unit is null");
        C9656b.c(xVar, "scheduler is null");
        return T0.d(i11, j11, this, xVar, timeUnit);
    }

    public final <B> p<List<T>> buffer(Callable<? extends u<B>> callable) {
        return (p<List<T>>) buffer(callable, Gc.b.a());
    }

    public final <B, U extends Collection<? super T>> p<U> buffer(Callable<? extends u<B>> callable, Callable<U> callable2) {
        C9656b.c(callable, "boundarySupplier is null");
        C9656b.c(callable2, "bufferSupplier is null");
        return new C11058n(this, callable, callable2);
    }

    public final <B> p<p<T>> window(Callable<? extends u<B>> callable) {
        return window(callable, bufferSize());
    }

    public static <T> p<T> just(T t2, T t11, T t12, T t13, T t14, T t15, T t16, T t17) {
        C9656b.c(t2, "item1 is null");
        C9656b.c(t11, "item2 is null");
        C9656b.c(t12, "item3 is null");
        C9656b.c(t13, "item4 is null");
        C9656b.c(t14, "item5 is null");
        C9656b.c(t15, "item6 is null");
        C9656b.c(t16, "item7 is null");
        C9656b.c(t17, "item8 is null");
        return fromArray(t2, t11, t12, t13, t14, t15, t16, t17);
    }

    public final <B> p<p<T>> window(Callable<? extends u<B>> callable, int i11) {
        C9656b.c(callable, "boundary is null");
        C9656b.d(i11, "bufferSize");
        return new J1(this, callable, i11);
    }

    public final AbstractC3137a<T> replay(int i11, x xVar) {
        C9656b.d(i11, "bufferSize");
        return T0.i(replay(i11), xVar);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> p<R> combineLatest(u<? extends T1> uVar, u<? extends T2> uVar2, u<? extends T3> uVar3, u<? extends T4> uVar4, u<? extends T5> uVar5, u<? extends T6> uVar6, u<? extends T7> uVar7, qc.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        C9656b.c(uVar3, "source3 is null");
        C9656b.c(uVar4, "source4 is null");
        C9656b.c(uVar5, "source5 is null");
        C9656b.c(uVar6, "source6 is null");
        C9656b.c(uVar7, "source7 is null");
        C9653a.A();
        throw null;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> p<R> zip(u<? extends T1> uVar, u<? extends T2> uVar2, u<? extends T3> uVar3, u<? extends T4> uVar4, u<? extends T5> uVar5, u<? extends T6> uVar6, u<? extends T7> uVar7, qc.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        C9656b.c(uVar3, "source3 is null");
        C9656b.c(uVar4, "source4 is null");
        C9656b.c(uVar5, "source5 is null");
        C9656b.c(uVar6, "source6 is null");
        C9656b.c(uVar7, "source7 is null");
        C9653a.A();
        throw null;
    }

    public final AbstractC3137a<T> replay(long j11, TimeUnit timeUnit) {
        return replay(j11, timeUnit, Mc.a.a());
    }

    public final AbstractC3137a<T> replay(long j11, TimeUnit timeUnit, x xVar) {
        C9656b.c(timeUnit, "unit is null");
        C9656b.c(xVar, "scheduler is null");
        return T0.d(Integer.MAX_VALUE, j11, this, xVar, timeUnit);
    }

    public final AbstractC3137a<T> replay(x xVar) {
        C9656b.c(xVar, "scheduler is null");
        return T0.i(replay(), xVar);
    }

    public static <T> p<T> just(T t2, T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18) {
        C9656b.c(t2, "item1 is null");
        C9656b.c(t11, "item2 is null");
        C9656b.c(t12, "item3 is null");
        C9656b.c(t13, "item4 is null");
        C9656b.c(t14, "item5 is null");
        C9656b.c(t15, "item6 is null");
        C9656b.c(t16, "item7 is null");
        C9656b.c(t17, "item8 is null");
        C9656b.c(t18, "item9 is null");
        return fromArray(t2, t11, t12, t13, t14, t15, t16, t17, t18);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> p<R> combineLatest(u<? extends T1> uVar, u<? extends T2> uVar2, u<? extends T3> uVar3, u<? extends T4> uVar4, u<? extends T5> uVar5, u<? extends T6> uVar6, u<? extends T7> uVar7, u<? extends T8> uVar8, qc.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        C9656b.c(uVar3, "source3 is null");
        C9656b.c(uVar4, "source4 is null");
        C9656b.c(uVar5, "source5 is null");
        C9656b.c(uVar6, "source6 is null");
        C9656b.c(uVar7, "source7 is null");
        C9656b.c(uVar8, "source8 is null");
        C9653a.B();
        throw null;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> p<R> zip(u<? extends T1> uVar, u<? extends T2> uVar2, u<? extends T3> uVar3, u<? extends T4> uVar4, u<? extends T5> uVar5, u<? extends T6> uVar6, u<? extends T7> uVar7, u<? extends T8> uVar8, qc.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        C9656b.c(uVar3, "source3 is null");
        C9656b.c(uVar4, "source4 is null");
        C9656b.c(uVar5, "source5 is null");
        C9656b.c(uVar6, "source6 is null");
        C9656b.c(uVar7, "source7 is null");
        C9656b.c(uVar8, "source8 is null");
        C9653a.B();
        throw null;
    }

    public static <T> p<T> just(T t2, T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18, T t19) {
        C9656b.c(t2, "item1 is null");
        C9656b.c(t11, "item2 is null");
        C9656b.c(t12, "item3 is null");
        C9656b.c(t13, "item4 is null");
        C9656b.c(t14, "item5 is null");
        C9656b.c(t15, "item6 is null");
        C9656b.c(t16, "item7 is null");
        C9656b.c(t17, "item8 is null");
        C9656b.c(t18, "item9 is null");
        C9656b.c(t19, "item10 is null");
        return fromArray(t2, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> p<R> combineLatest(u<? extends T1> uVar, u<? extends T2> uVar2, u<? extends T3> uVar3, u<? extends T4> uVar4, u<? extends T5> uVar5, u<? extends T6> uVar6, u<? extends T7> uVar7, u<? extends T8> uVar8, u<? extends T9> uVar9, qc.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        C9656b.c(uVar3, "source3 is null");
        C9656b.c(uVar4, "source4 is null");
        C9656b.c(uVar5, "source5 is null");
        C9656b.c(uVar6, "source6 is null");
        C9656b.c(uVar7, "source7 is null");
        C9656b.c(uVar8, "source8 is null");
        C9656b.c(uVar9, "source9 is null");
        C9653a.C();
        throw null;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> p<R> zip(u<? extends T1> uVar, u<? extends T2> uVar2, u<? extends T3> uVar3, u<? extends T4> uVar4, u<? extends T5> uVar5, u<? extends T6> uVar6, u<? extends T7> uVar7, u<? extends T8> uVar8, u<? extends T9> uVar9, qc.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        C9656b.c(uVar, "source1 is null");
        C9656b.c(uVar2, "source2 is null");
        C9656b.c(uVar3, "source3 is null");
        C9656b.c(uVar4, "source4 is null");
        C9656b.c(uVar5, "source5 is null");
        C9656b.c(uVar6, "source6 is null");
        C9656b.c(uVar7, "source7 is null");
        C9656b.c(uVar8, "source8 is null");
        C9656b.c(uVar9, "source9 is null");
        C9653a.C();
        throw null;
    }
}
