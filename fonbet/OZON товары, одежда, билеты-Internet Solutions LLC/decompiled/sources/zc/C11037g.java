package zc;

import Bl0.C2645f;
import Kc.C3493a;
import nc.InterfaceC8487b;
import tc.InterfaceC9802d;

/* renamed from: zc.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11037g<T> extends io.reactivex.y<Boolean> implements InterfaceC9802d<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.p f108241a;

    /* renamed from: b, reason: collision with root package name */
    final qc.q<? super T> f108242b;

    /* renamed from: zc.g$a */
    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super Boolean> f108243a;

        /* renamed from: b, reason: collision with root package name */
        final qc.q<? super T> f108244b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f108245c;

        /* renamed from: d, reason: collision with root package name */
        boolean f108246d;

        a(io.reactivex.A<? super Boolean> a11, qc.q<? super T> qVar) {
            this.f108243a = a11;
            this.f108244b = qVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108245c.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108245c.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f108246d) {
                return;
            }
            this.f108246d = true;
            this.f108243a.onSuccess(Boolean.TRUE);
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f108246d) {
                C3493a.f(th2);
            } else {
                this.f108246d = true;
                this.f108243a.onError(th2);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f108246d) {
                return;
            }
            try {
                if (this.f108244b.test(t2)) {
                    return;
                }
                this.f108246d = true;
                this.f108245c.dispose();
                this.f108243a.onSuccess(Boolean.FALSE);
            } catch (Throwable th2) {
                C2645f.c(th2);
                this.f108245c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108245c, interfaceC8487b)) {
                this.f108245c = interfaceC8487b;
                this.f108243a.onSubscribe(this);
            }
        }
    }

    public C11037g(io.reactivex.p pVar, qc.q qVar) {
        this.f108241a = pVar;
        this.f108242b = qVar;
    }

    @Override // tc.InterfaceC9802d
    public final io.reactivex.p<Boolean> b() {
        return new C11034f(this.f108241a, this.f108242b);
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super Boolean> a11) {
        this.f108241a.subscribe(new a(a11, this.f108242b));
    }
}
