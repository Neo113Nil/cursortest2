package zc;

import nc.InterfaceC8487b;

/* renamed from: zc.t0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11073t0<T> extends io.reactivex.k<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.p f108637a;

    /* renamed from: zc.t0$a */
    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.m<? super T> f108638a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC8487b f108639b;

        /* renamed from: c, reason: collision with root package name */
        T f108640c;

        a(io.reactivex.m<? super T> mVar) {
            this.f108638a = mVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108639b.dispose();
            this.f108639b = rc.d.DISPOSED;
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108639b == rc.d.DISPOSED;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108639b = rc.d.DISPOSED;
            T t2 = this.f108640c;
            io.reactivex.m<? super T> mVar = this.f108638a;
            if (t2 == null) {
                mVar.onComplete();
            } else {
                this.f108640c = null;
                mVar.onSuccess(t2);
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108639b = rc.d.DISPOSED;
            this.f108640c = null;
            this.f108638a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f108640c = t2;
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108639b, interfaceC8487b)) {
                this.f108639b = interfaceC8487b;
                this.f108638a.onSubscribe(this);
            }
        }
    }

    public C11073t0(io.reactivex.p pVar) {
        this.f108637a = pVar;
    }

    @Override // io.reactivex.k
    protected final void d(io.reactivex.m<? super T> mVar) {
        this.f108637a.subscribe(new a(mVar));
    }
}
