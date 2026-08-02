package xc;

import io.reactivex.A;
import io.reactivex.y;
import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class i<T> extends io.reactivex.k<T> {

    /* renamed from: a, reason: collision with root package name */
    final y f105288a;

    static final class a<T> implements A<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.m<? super T> f105289a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC8487b f105290b;

        a(io.reactivex.m<? super T> mVar) {
            this.f105289a = mVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f105290b.dispose();
            this.f105290b = rc.d.DISPOSED;
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f105290b.isDisposed();
        }

        @Override // io.reactivex.A
        public final void onError(Throwable th2) {
            this.f105290b = rc.d.DISPOSED;
            this.f105289a.onError(th2);
        }

        @Override // io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f105290b, interfaceC8487b)) {
                this.f105290b = interfaceC8487b;
                this.f105289a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.A
        public final void onSuccess(T t2) {
            this.f105290b = rc.d.DISPOSED;
            this.f105289a.onSuccess(t2);
        }
    }

    public i(y yVar) {
        this.f105288a = yVar;
    }

    @Override // io.reactivex.k
    protected final void d(io.reactivex.m<? super T> mVar) {
        this.f105288a.c(new a(mVar));
    }
}
