package zc;

import Kc.C3493a;
import java.util.concurrent.Callable;
import nc.InterfaceC8487b;
import qc.InterfaceC9020b;
import sc.C9656b;
import tc.InterfaceC9802d;

/* renamed from: zc.s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11070s<T, U> extends io.reactivex.y<U> implements InterfaceC9802d<U> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.p f108594a;

    /* renamed from: b, reason: collision with root package name */
    final Callable<? extends U> f108595b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC9020b<? super U, ? super T> f108596c;

    /* renamed from: zc.s$a */
    static final class a<T, U> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super U> f108597a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC9020b<? super U, ? super T> f108598b;

        /* renamed from: c, reason: collision with root package name */
        final U f108599c;

        /* renamed from: d, reason: collision with root package name */
        InterfaceC8487b f108600d;

        /* renamed from: e, reason: collision with root package name */
        boolean f108601e;

        a(io.reactivex.A<? super U> a11, U u11, InterfaceC9020b<? super U, ? super T> interfaceC9020b) {
            this.f108597a = a11;
            this.f108598b = interfaceC9020b;
            this.f108599c = u11;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108600d.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108600d.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f108601e) {
                return;
            }
            this.f108601e = true;
            this.f108597a.onSuccess(this.f108599c);
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f108601e) {
                C3493a.f(th2);
            } else {
                this.f108601e = true;
                this.f108597a.onError(th2);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f108601e) {
                return;
            }
            try {
                this.f108598b.accept(this.f108599c, t2);
            } catch (Throwable th2) {
                this.f108600d.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108600d, interfaceC8487b)) {
                this.f108600d = interfaceC8487b;
                this.f108597a.onSubscribe(this);
            }
        }
    }

    public C11070s(io.reactivex.p pVar, Callable callable, InterfaceC9020b interfaceC9020b) {
        this.f108594a = pVar;
        this.f108595b = callable;
        this.f108596c = interfaceC9020b;
    }

    @Override // tc.InterfaceC9802d
    public final io.reactivex.p<U> b() {
        return new r(this.f108594a, this.f108595b, this.f108596c);
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super U> a11) {
        try {
            U call = this.f108595b.call();
            C9656b.c(call, "The initialSupplier returned a null value");
            this.f108594a.subscribe(new a(a11, call, this.f108596c));
        } catch (Throwable th2) {
            a11.onSubscribe(rc.e.INSTANCE);
            a11.onError(th2);
        }
    }
}
