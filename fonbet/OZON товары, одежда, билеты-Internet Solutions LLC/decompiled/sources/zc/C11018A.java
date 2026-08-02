package zc;

import nc.InterfaceC8487b;
import tc.InterfaceC9802d;

/* renamed from: zc.A, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11018A<T> extends io.reactivex.y<Long> implements InterfaceC9802d<Long> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.p f107512a;

    /* renamed from: zc.A$a */
    static final class a implements io.reactivex.w<Object>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super Long> f107513a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC8487b f107514b;

        /* renamed from: c, reason: collision with root package name */
        long f107515c;

        a(io.reactivex.A<? super Long> a11) {
            this.f107513a = a11;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f107514b.dispose();
            this.f107514b = rc.d.DISPOSED;
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107514b.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f107514b = rc.d.DISPOSED;
            this.f107513a.onSuccess(Long.valueOf(this.f107515c));
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f107514b = rc.d.DISPOSED;
            this.f107513a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(Object obj) {
            this.f107515c++;
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f107514b, interfaceC8487b)) {
                this.f107514b = interfaceC8487b;
                this.f107513a.onSubscribe(this);
            }
        }
    }

    public C11018A(io.reactivex.p pVar) {
        this.f107512a = pVar;
    }

    @Override // tc.InterfaceC9802d
    public final io.reactivex.p<Long> b() {
        return new C11084z(this.f107512a);
    }

    @Override // io.reactivex.y
    public final void i(io.reactivex.A<? super Long> a11) {
        this.f107512a.subscribe(new a(a11));
    }
}
