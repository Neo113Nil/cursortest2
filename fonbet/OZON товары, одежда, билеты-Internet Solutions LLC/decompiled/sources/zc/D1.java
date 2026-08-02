package zc;

import Bl0.C2645f;
import java.util.Collection;
import java.util.concurrent.Callable;
import nc.InterfaceC8487b;
import sc.C9653a;
import sc.C9656b;
import tc.InterfaceC9802d;

/* loaded from: classes9.dex */
public final class D1<T, U extends Collection<? super T>> extends io.reactivex.y<U> implements InterfaceC9802d<U> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.p f107612a;

    /* renamed from: b, reason: collision with root package name */
    final Callable<U> f107613b;

    static final class a<T, U extends Collection<? super T>> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super U> f107614a;

        /* renamed from: b, reason: collision with root package name */
        U f107615b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f107616c;

        a(io.reactivex.A<? super U> a11, U u11) {
            this.f107614a = a11;
            this.f107615b = u11;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f107616c.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107616c.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            U u11 = this.f107615b;
            this.f107615b = null;
            this.f107614a.onSuccess(u11);
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f107615b = null;
            this.f107614a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f107615b.add(t2);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f107616c, interfaceC8487b)) {
                this.f107616c = interfaceC8487b;
                this.f107614a.onSubscribe(this);
            }
        }
    }

    public D1(io.reactivex.p pVar, int i11) {
        this.f107612a = pVar;
        this.f107613b = C9653a.e(i11);
    }

    @Override // tc.InterfaceC9802d
    public final io.reactivex.p<U> b() {
        return new C1(this.f107612a, this.f107613b);
    }

    @Override // io.reactivex.y
    public final void i(io.reactivex.A<? super U> a11) {
        try {
            U call = this.f107613b.call();
            C9656b.c(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f107612a.subscribe(new a(a11, call));
        } catch (Throwable th2) {
            C2645f.c(th2);
            a11.onSubscribe(rc.e.INSTANCE);
            a11.onError(th2);
        }
    }

    public D1(io.reactivex.p pVar, Callable callable) {
        this.f107612a = pVar;
        this.f107613b = callable;
    }
}
