package zc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import nc.InterfaceC8487b;
import oc.C8691a;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class F1<T, D> extends io.reactivex.p<T> {

    /* renamed from: a, reason: collision with root package name */
    final Callable<? extends D> f107650a;

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super D, ? extends io.reactivex.u<? extends T>> f107651b;

    /* renamed from: c, reason: collision with root package name */
    final qc.g<? super D> f107652c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f107653d;

    static final class a<T, D> extends AtomicBoolean implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f107654a;

        /* renamed from: b, reason: collision with root package name */
        final D f107655b;

        /* renamed from: c, reason: collision with root package name */
        final qc.g<? super D> f107656c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f107657d;

        /* renamed from: e, reason: collision with root package name */
        InterfaceC8487b f107658e;

        a(io.reactivex.w<? super T> wVar, D d11, qc.g<? super D> gVar, boolean z11) {
            this.f107654a = wVar;
            this.f107655b = d11;
            this.f107656c = gVar;
            this.f107657d = z11;
        }

        final void a() {
            if (compareAndSet(false, true)) {
                try {
                    this.f107656c.accept(this.f107655b);
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    C3493a.f(th2);
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            a();
            this.f107658e.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return get();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            boolean z11 = this.f107657d;
            io.reactivex.w<? super T> wVar = this.f107654a;
            if (!z11) {
                wVar.onComplete();
                this.f107658e.dispose();
                a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f107656c.accept(this.f107655b);
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    wVar.onError(th2);
                    return;
                }
            }
            this.f107658e.dispose();
            wVar.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            boolean z11 = this.f107657d;
            io.reactivex.w<? super T> wVar = this.f107654a;
            if (!z11) {
                wVar.onError(th2);
                this.f107658e.dispose();
                a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f107656c.accept(this.f107655b);
                } catch (Throwable th3) {
                    C2645f.c(th3);
                    th2 = new C8691a(th2, th3);
                }
            }
            this.f107658e.dispose();
            wVar.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f107654a.onNext(t2);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f107658e, interfaceC8487b)) {
                this.f107658e = interfaceC8487b;
                this.f107654a.onSubscribe(this);
            }
        }
    }

    public F1(Callable<? extends D> callable, qc.o<? super D, ? extends io.reactivex.u<? extends T>> oVar, qc.g<? super D> gVar, boolean z11) {
        this.f107650a = callable;
        this.f107651b = oVar;
        this.f107652c = gVar;
        this.f107653d = z11;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        qc.g<? super D> gVar = this.f107652c;
        try {
            D call = this.f107650a.call();
            try {
                io.reactivex.u<? extends T> apply = this.f107651b.apply(call);
                C9656b.c(apply, "The sourceSupplier returned a null ObservableSource");
                apply.subscribe(new a(wVar, call, gVar, this.f107653d));
            } catch (Throwable th2) {
                C2645f.c(th2);
                try {
                    gVar.accept(call);
                    rc.e.d(th2, wVar);
                } catch (Throwable th3) {
                    C2645f.c(th3);
                    rc.e.d(new C8691a(th2, th3), wVar);
                }
            }
        } catch (Throwable th4) {
            C2645f.c(th4);
            rc.e.d(th4, wVar);
        }
    }
}
