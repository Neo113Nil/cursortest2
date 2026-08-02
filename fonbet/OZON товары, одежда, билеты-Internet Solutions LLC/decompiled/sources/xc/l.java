package xc;

import Bl0.C2645f;
import nc.InterfaceC8487b;
import oc.C8691a;

/* loaded from: classes.dex */
public final class l<T> extends AbstractC10698a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final qc.q<? super Throwable> f105300b;

    static final class a<T> implements io.reactivex.m<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.m<? super T> f105301a;

        /* renamed from: b, reason: collision with root package name */
        final qc.q<? super Throwable> f105302b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f105303c;

        a(io.reactivex.m<? super T> mVar, qc.q<? super Throwable> qVar) {
            this.f105301a = mVar;
            this.f105302b = qVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f105303c.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f105303c.isDisposed();
        }

        @Override // io.reactivex.m
        public final void onComplete() {
            this.f105301a.onComplete();
        }

        @Override // io.reactivex.m
        public final void onError(Throwable th2) {
            io.reactivex.m<? super T> mVar = this.f105301a;
            try {
                this.f105302b.test(th2);
                mVar.onComplete();
            } catch (Throwable th3) {
                C2645f.c(th3);
                mVar.onError(new C8691a(th2, th3));
            }
        }

        @Override // io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f105303c, interfaceC8487b)) {
                this.f105303c = interfaceC8487b;
                this.f105301a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.m, io.reactivex.A
        public final void onSuccess(T t2) {
            this.f105301a.onSuccess(t2);
        }
    }

    public l(m mVar, qc.q qVar) {
        super(mVar);
        this.f105300b = qVar;
    }

    @Override // io.reactivex.k
    protected final void d(io.reactivex.m<? super T> mVar) {
        this.f105265a.a(new a(mVar, this.f105300b));
    }
}
