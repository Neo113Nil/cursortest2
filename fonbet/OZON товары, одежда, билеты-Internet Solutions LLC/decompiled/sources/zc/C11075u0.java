package zc;

import java.util.NoSuchElementException;
import nc.InterfaceC8487b;

/* renamed from: zc.u0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11075u0<T> extends io.reactivex.y<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.p f108676a;

    /* renamed from: b, reason: collision with root package name */
    final T f108677b;

    /* renamed from: zc.u0$a */
    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super T> f108678a;

        /* renamed from: b, reason: collision with root package name */
        final T f108679b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f108680c;

        /* renamed from: d, reason: collision with root package name */
        T f108681d;

        a(io.reactivex.A<? super T> a11, T t2) {
            this.f108678a = a11;
            this.f108679b = t2;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108680c.dispose();
            this.f108680c = rc.d.DISPOSED;
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108680c == rc.d.DISPOSED;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108680c = rc.d.DISPOSED;
            T t2 = this.f108681d;
            io.reactivex.A<? super T> a11 = this.f108678a;
            if (t2 != null) {
                this.f108681d = null;
                a11.onSuccess(t2);
                return;
            }
            T t11 = this.f108679b;
            if (t11 != null) {
                a11.onSuccess(t11);
            } else {
                a11.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108680c = rc.d.DISPOSED;
            this.f108681d = null;
            this.f108678a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f108681d = t2;
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108680c, interfaceC8487b)) {
                this.f108680c = interfaceC8487b;
                this.f108678a.onSubscribe(this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11075u0(io.reactivex.p pVar, Object obj) {
        this.f108676a = pVar;
        this.f108677b = obj;
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super T> a11) {
        this.f108676a.subscribe(new a(a11, this.f108677b));
    }
}
