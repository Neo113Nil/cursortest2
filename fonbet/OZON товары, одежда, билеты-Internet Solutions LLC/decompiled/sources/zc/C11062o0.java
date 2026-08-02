package zc;

import Hc.AbstractC3137a;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import qc.InterfaceC9019a;
import qc.InterfaceC9020b;
import qc.InterfaceC9021c;
import sc.C9653a;
import sc.C9656b;

/* renamed from: zc.o0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11062o0 {

    /* renamed from: zc.o0$a */
    static final class a<T> implements Callable<AbstractC3137a<T>> {

        /* renamed from: a, reason: collision with root package name */
        private final io.reactivex.p<T> f108442a;

        /* renamed from: b, reason: collision with root package name */
        private final int f108443b;

        a(io.reactivex.p<T> pVar, int i11) {
            this.f108442a = pVar;
            this.f108443b = i11;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() throws Exception {
            return this.f108442a.replay(this.f108443b);
        }
    }

    /* renamed from: zc.o0$b */
    static final class b<T> implements Callable<AbstractC3137a<T>> {

        /* renamed from: a, reason: collision with root package name */
        private final io.reactivex.p<T> f108444a;

        /* renamed from: b, reason: collision with root package name */
        private final int f108445b;

        /* renamed from: c, reason: collision with root package name */
        private final long f108446c;

        /* renamed from: d, reason: collision with root package name */
        private final TimeUnit f108447d;

        /* renamed from: e, reason: collision with root package name */
        private final io.reactivex.x f108448e;

        b(int i11, long j11, io.reactivex.p pVar, io.reactivex.x xVar, TimeUnit timeUnit) {
            this.f108444a = pVar;
            this.f108445b = i11;
            this.f108446c = j11;
            this.f108447d = timeUnit;
            this.f108448e = xVar;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() throws Exception {
            return this.f108444a.replay(this.f108445b, this.f108446c, this.f108447d, this.f108448e);
        }
    }

    /* renamed from: zc.o0$c */
    static final class c<T, U> implements qc.o<T, io.reactivex.u<U>> {

        /* renamed from: a, reason: collision with root package name */
        private final qc.o<? super T, ? extends Iterable<? extends U>> f108449a;

        c(qc.o<? super T, ? extends Iterable<? extends U>> oVar) {
            this.f108449a = oVar;
        }

        @Override // qc.o
        public final Object apply(Object obj) throws Exception {
            Iterable<? extends U> apply = this.f108449a.apply(obj);
            C9656b.c(apply, "The mapper returned a null Iterable");
            return new C11035f0(apply);
        }
    }

    /* renamed from: zc.o0$d */
    static final class d<U, R, T> implements qc.o<U, R> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC9021c<? super T, ? super U, ? extends R> f108450a;

        /* renamed from: b, reason: collision with root package name */
        private final T f108451b;

        /* JADX WARN: Multi-variable type inference failed */
        d(Object obj, InterfaceC9021c interfaceC9021c) {
            this.f108450a = interfaceC9021c;
            this.f108451b = obj;
        }

        @Override // qc.o
        public final R apply(U u11) throws Exception {
            return this.f108450a.apply(this.f108451b, u11);
        }
    }

    /* renamed from: zc.o0$e */
    static final class e<T, R, U> implements qc.o<T, io.reactivex.u<R>> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC9021c<? super T, ? super U, ? extends R> f108452a;

        /* renamed from: b, reason: collision with root package name */
        private final qc.o<? super T, ? extends io.reactivex.u<? extends U>> f108453b;

        e(qc.o oVar, InterfaceC9021c interfaceC9021c) {
            this.f108452a = interfaceC9021c;
            this.f108453b = oVar;
        }

        @Override // qc.o
        public final Object apply(Object obj) throws Exception {
            io.reactivex.u<? extends U> apply = this.f108453b.apply(obj);
            C9656b.c(apply, "The mapper returned a null ObservableSource");
            return new C11079w0(apply, new d(obj, this.f108452a));
        }
    }

    /* renamed from: zc.o0$f */
    static final class f<T, U> implements qc.o<T, io.reactivex.u<T>> {

        /* renamed from: a, reason: collision with root package name */
        final qc.o<? super T, ? extends io.reactivex.u<U>> f108454a;

        f(qc.o<? super T, ? extends io.reactivex.u<U>> oVar) {
            this.f108454a = oVar;
        }

        @Override // qc.o
        public final Object apply(Object obj) throws Exception {
            io.reactivex.u<U> apply = this.f108454a.apply(obj);
            C9656b.c(apply, "The itemDelay returned a null ObservableSource");
            return new C11066p1(apply, 1L).map(C9653a.l(obj)).defaultIfEmpty(obj);
        }
    }

    /* renamed from: zc.o0$g */
    static final class g<T> implements InterfaceC9019a {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<T> f108455a;

        g(io.reactivex.w<T> wVar) {
            this.f108455a = wVar;
        }

        @Override // qc.InterfaceC9019a
        public final void run() throws Exception {
            this.f108455a.onComplete();
        }
    }

    /* renamed from: zc.o0$h */
    static final class h<T> implements qc.g<Throwable> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<T> f108456a;

        h(io.reactivex.w<T> wVar) {
            this.f108456a = wVar;
        }

        @Override // qc.g
        public final void accept(Throwable th2) throws Exception {
            this.f108456a.onError(th2);
        }
    }

    /* renamed from: zc.o0$i */
    static final class i<T> implements qc.g<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<T> f108457a;

        i(io.reactivex.w<T> wVar) {
            this.f108457a = wVar;
        }

        @Override // qc.g
        public final void accept(T t2) throws Exception {
            this.f108457a.onNext(t2);
        }
    }

    /* renamed from: zc.o0$j */
    static final class j<T> implements Callable<AbstractC3137a<T>> {

        /* renamed from: a, reason: collision with root package name */
        private final io.reactivex.p<T> f108458a;

        j(io.reactivex.p<T> pVar) {
            this.f108458a = pVar;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() throws Exception {
            return this.f108458a.replay();
        }
    }

    /* renamed from: zc.o0$k */
    static final class k<T, R> implements qc.o<io.reactivex.p<T>, io.reactivex.u<R>> {

        /* renamed from: a, reason: collision with root package name */
        private final qc.o<? super io.reactivex.p<T>, ? extends io.reactivex.u<R>> f108459a;

        /* renamed from: b, reason: collision with root package name */
        private final io.reactivex.x f108460b;

        k(qc.o<? super io.reactivex.p<T>, ? extends io.reactivex.u<R>> oVar, io.reactivex.x xVar) {
            this.f108459a = oVar;
            this.f108460b = xVar;
        }

        @Override // qc.o
        public final Object apply(Object obj) throws Exception {
            io.reactivex.u<R> apply = this.f108459a.apply((io.reactivex.p) obj);
            C9656b.c(apply, "The selector returned a null ObservableSource");
            return io.reactivex.p.wrap(apply).observeOn(this.f108460b);
        }
    }

    /* renamed from: zc.o0$l */
    static final class l<T, S> implements InterfaceC9021c<S, io.reactivex.g<T>, S> {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC9020b<S, io.reactivex.g<T>> f108461a;

        l(InterfaceC9020b<S, io.reactivex.g<T>> interfaceC9020b) {
            this.f108461a = interfaceC9020b;
        }

        @Override // qc.InterfaceC9021c
        public final Object apply(Object obj, Object obj2) throws Exception {
            this.f108461a.accept(obj, (io.reactivex.g) obj2);
            return obj;
        }
    }

    /* renamed from: zc.o0$m */
    static final class m<T, S> implements InterfaceC9021c<S, io.reactivex.g<T>, S> {

        /* renamed from: a, reason: collision with root package name */
        final qc.g<io.reactivex.g<T>> f108462a;

        m(qc.g<io.reactivex.g<T>> gVar) {
            this.f108462a = gVar;
        }

        @Override // qc.InterfaceC9021c
        public final Object apply(Object obj, Object obj2) throws Exception {
            this.f108462a.accept((io.reactivex.g) obj2);
            return obj;
        }
    }

    /* renamed from: zc.o0$n */
    static final class n<T> implements Callable<AbstractC3137a<T>> {

        /* renamed from: a, reason: collision with root package name */
        private final io.reactivex.p<T> f108463a;

        /* renamed from: b, reason: collision with root package name */
        private final long f108464b;

        /* renamed from: c, reason: collision with root package name */
        private final TimeUnit f108465c;

        /* renamed from: d, reason: collision with root package name */
        private final io.reactivex.x f108466d;

        n(io.reactivex.p<T> pVar, long j11, TimeUnit timeUnit, io.reactivex.x xVar) {
            this.f108463a = pVar;
            this.f108464b = j11;
            this.f108465c = timeUnit;
            this.f108466d = xVar;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() throws Exception {
            return this.f108463a.replay(this.f108464b, this.f108465c, this.f108466d);
        }
    }

    /* renamed from: zc.o0$o */
    static final class o<T, R> implements qc.o<List<io.reactivex.u<? extends T>>, io.reactivex.u<? extends R>> {

        /* renamed from: a, reason: collision with root package name */
        private final qc.o<? super Object[], ? extends R> f108467a;

        o(qc.o<? super Object[], ? extends R> oVar) {
            this.f108467a = oVar;
        }

        @Override // qc.o
        public final Object apply(Object obj) throws Exception {
            return io.reactivex.p.zipIterable((List) obj, this.f108467a, false, io.reactivex.p.bufferSize());
        }
    }

    public static <T, U> qc.o<T, io.reactivex.u<U>> a(qc.o<? super T, ? extends Iterable<? extends U>> oVar) {
        return new c(oVar);
    }

    public static <T, U, R> qc.o<T, io.reactivex.u<R>> b(qc.o<? super T, ? extends io.reactivex.u<? extends U>> oVar, InterfaceC9021c<? super T, ? super U, ? extends R> interfaceC9021c) {
        return new e(oVar, interfaceC9021c);
    }

    public static <T, U> qc.o<T, io.reactivex.u<T>> c(qc.o<? super T, ? extends io.reactivex.u<U>> oVar) {
        return new f(oVar);
    }

    public static <T> InterfaceC9019a d(io.reactivex.w<T> wVar) {
        return new g(wVar);
    }

    public static <T> qc.g<Throwable> e(io.reactivex.w<T> wVar) {
        return new h(wVar);
    }

    public static <T> qc.g<T> f(io.reactivex.w<T> wVar) {
        return new i(wVar);
    }

    public static Callable g(int i11, long j11, io.reactivex.p pVar, io.reactivex.x xVar, TimeUnit timeUnit) {
        return new b(i11, j11, pVar, xVar, timeUnit);
    }

    public static <T> Callable<AbstractC3137a<T>> h(io.reactivex.p<T> pVar) {
        return new j(pVar);
    }

    public static <T> Callable<AbstractC3137a<T>> i(io.reactivex.p<T> pVar, int i11) {
        return new a(pVar, i11);
    }

    public static <T> Callable<AbstractC3137a<T>> j(io.reactivex.p<T> pVar, long j11, TimeUnit timeUnit, io.reactivex.x xVar) {
        return new n(pVar, j11, timeUnit, xVar);
    }

    public static <T, R> qc.o<io.reactivex.p<T>, io.reactivex.u<R>> k(qc.o<? super io.reactivex.p<T>, ? extends io.reactivex.u<R>> oVar, io.reactivex.x xVar) {
        return new k(oVar, xVar);
    }

    public static <T, S> InterfaceC9021c<S, io.reactivex.g<T>, S> l(InterfaceC9020b<S, io.reactivex.g<T>> interfaceC9020b) {
        return new l(interfaceC9020b);
    }

    public static <T, S> InterfaceC9021c<S, io.reactivex.g<T>, S> m(qc.g<io.reactivex.g<T>> gVar) {
        return new m(gVar);
    }

    public static <T, R> qc.o<List<io.reactivex.u<? extends T>>, io.reactivex.u<? extends R>> n(qc.o<? super Object[], ? extends R> oVar) {
        return new o(oVar);
    }
}
