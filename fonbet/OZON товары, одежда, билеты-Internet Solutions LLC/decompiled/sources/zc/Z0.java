package zc;

import Bl0.C2645f;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import sc.C9656b;
import tc.InterfaceC9803e;

/* loaded from: classes.dex */
public final class Z0 {

    /* loaded from: classes9.dex */
    public static final class a<T> extends AtomicInteger implements InterfaceC9803e<T>, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108118a;

        /* renamed from: b, reason: collision with root package name */
        final T f108119b;

        public a(io.reactivex.w<? super T> wVar, T t2) {
            this.f108118a = wVar;
            this.f108119b = t2;
        }

        @Override // tc.InterfaceC9804f
        public final int a(int i11) {
            lazySet(1);
            return 1;
        }

        @Override // tc.InterfaceC9808j
        public final void clear() {
            lazySet(3);
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            set(3);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return get() == 3;
        }

        @Override // tc.InterfaceC9808j
        public final boolean isEmpty() {
            return get() != 1;
        }

        @Override // tc.InterfaceC9808j
        public final boolean offer(T t2) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // tc.InterfaceC9808j
        public final T poll() throws Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f108119b;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                T t2 = this.f108119b;
                io.reactivex.w<? super T> wVar = this.f108118a;
                wVar.onNext(t2);
                if (get() == 2) {
                    lazySet(3);
                    wVar.onComplete();
                }
            }
        }
    }

    /* loaded from: classes9.dex */
    static final class b<T, R> extends io.reactivex.p<R> {

        /* renamed from: a, reason: collision with root package name */
        final T f108120a;

        /* renamed from: b, reason: collision with root package name */
        final qc.o<? super T, ? extends io.reactivex.u<? extends R>> f108121b;

        b(T t2, qc.o<? super T, ? extends io.reactivex.u<? extends R>> oVar) {
            this.f108120a = t2;
            this.f108121b = oVar;
        }

        @Override // io.reactivex.p
        public final void subscribeActual(io.reactivex.w<? super R> wVar) {
            try {
                io.reactivex.u<? extends R> apply = this.f108121b.apply(this.f108120a);
                C9656b.c(apply, "The mapper returned a null ObservableSource");
                io.reactivex.u<? extends R> uVar = apply;
                if (!(uVar instanceof Callable)) {
                    uVar.subscribe(wVar);
                    return;
                }
                try {
                    Object call = ((Callable) uVar).call();
                    if (call == null) {
                        rc.e.b(wVar);
                        return;
                    }
                    a aVar = new a(wVar, call);
                    wVar.onSubscribe(aVar);
                    aVar.run();
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    rc.e.d(th2, wVar);
                }
            } catch (Throwable th3) {
                rc.e.d(th3, wVar);
            }
        }
    }

    public static <T, U> io.reactivex.p<U> a(T t2, qc.o<? super T, ? extends io.reactivex.u<? extends U>> oVar) {
        return new b(t2, oVar);
    }

    public static <T, R> boolean b(io.reactivex.u<T> uVar, io.reactivex.w<? super R> wVar, qc.o<? super T, ? extends io.reactivex.u<? extends R>> oVar) {
        if (!(uVar instanceof Callable)) {
            return false;
        }
        try {
            A0.h hVar = (Object) ((Callable) uVar).call();
            if (hVar == null) {
                rc.e.b(wVar);
                return true;
            }
            try {
                io.reactivex.u<? extends R> apply = oVar.apply(hVar);
                C9656b.c(apply, "The mapper returned a null ObservableSource");
                io.reactivex.u<? extends R> uVar2 = apply;
                if (!(uVar2 instanceof Callable)) {
                    uVar2.subscribe(wVar);
                    return true;
                }
                try {
                    Object call = ((Callable) uVar2).call();
                    if (call == null) {
                        rc.e.b(wVar);
                        return true;
                    }
                    a aVar = new a(wVar, call);
                    wVar.onSubscribe(aVar);
                    aVar.run();
                    return true;
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    rc.e.d(th2, wVar);
                    return true;
                }
            } catch (Throwable th3) {
                C2645f.c(th3);
                rc.e.d(th3, wVar);
                return true;
            }
        } catch (Throwable th4) {
            C2645f.c(th4);
            rc.e.d(th4, wVar);
            return true;
        }
    }
}
