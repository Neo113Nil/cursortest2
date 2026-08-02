package xc;

import Bl0.C2645f;
import io.reactivex.A;
import io.reactivex.y;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class f<T> extends io.reactivex.k<T> {

    /* renamed from: a, reason: collision with root package name */
    final y f105276a;

    /* renamed from: b, reason: collision with root package name */
    final qc.q<? super T> f105277b;

    static final class a<T> implements A<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.m<? super T> f105278a;

        /* renamed from: b, reason: collision with root package name */
        final qc.q<? super T> f105279b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f105280c;

        a(io.reactivex.m<? super T> mVar, qc.q<? super T> qVar) {
            this.f105278a = mVar;
            this.f105279b = qVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            InterfaceC8487b interfaceC8487b = this.f105280c;
            this.f105280c = rc.d.DISPOSED;
            interfaceC8487b.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f105280c.isDisposed();
        }

        @Override // io.reactivex.A
        public final void onError(Throwable th2) {
            this.f105278a.onError(th2);
        }

        @Override // io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f105280c, interfaceC8487b)) {
                this.f105280c = interfaceC8487b;
                this.f105278a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.A
        public final void onSuccess(T t2) {
            io.reactivex.m<? super T> mVar = this.f105278a;
            try {
                if (this.f105279b.test(t2)) {
                    mVar.onSuccess(t2);
                } else {
                    mVar.onComplete();
                }
            } catch (Throwable th2) {
                C2645f.c(th2);
                mVar.onError(th2);
            }
        }
    }

    public f(y yVar, qc.q qVar) {
        this.f105276a = yVar;
        this.f105277b = qVar;
    }

    @Override // io.reactivex.k
    protected final void d(io.reactivex.m<? super T> mVar) {
        this.f105276a.c(new a(mVar, this.f105277b));
    }
}
