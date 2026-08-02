package zc;

import Bl0.C2645f;
import Kc.C3493a;
import nc.InterfaceC8487b;
import tc.InterfaceC9802d;

/* renamed from: zc.j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11046j<T> extends io.reactivex.y<Boolean> implements InterfaceC9802d<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.p f108289a;

    /* renamed from: b, reason: collision with root package name */
    final qc.q<? super T> f108290b;

    /* renamed from: zc.j$a */
    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super Boolean> f108291a;

        /* renamed from: b, reason: collision with root package name */
        final qc.q<? super T> f108292b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f108293c;

        /* renamed from: d, reason: collision with root package name */
        boolean f108294d;

        a(io.reactivex.A<? super Boolean> a11, qc.q<? super T> qVar) {
            this.f108291a = a11;
            this.f108292b = qVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108293c.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108293c.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f108294d) {
                return;
            }
            this.f108294d = true;
            this.f108291a.onSuccess(Boolean.FALSE);
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f108294d) {
                C3493a.f(th2);
            } else {
                this.f108294d = true;
                this.f108291a.onError(th2);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f108294d) {
                return;
            }
            try {
                if (this.f108292b.test(t2)) {
                    this.f108294d = true;
                    this.f108293c.dispose();
                    this.f108291a.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th2) {
                C2645f.c(th2);
                this.f108293c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108293c, interfaceC8487b)) {
                this.f108293c = interfaceC8487b;
                this.f108291a.onSubscribe(this);
            }
        }
    }

    public C11046j(io.reactivex.p pVar, qc.q qVar) {
        this.f108289a = pVar;
        this.f108290b = qVar;
    }

    @Override // tc.InterfaceC9802d
    public final io.reactivex.p<Boolean> b() {
        return new C11043i(this.f108289a, this.f108290b);
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super Boolean> a11) {
        this.f108289a.subscribe(new a(a11, this.f108290b));
    }
}
