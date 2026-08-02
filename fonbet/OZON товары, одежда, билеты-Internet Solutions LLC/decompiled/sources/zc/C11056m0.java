package zc;

import nc.InterfaceC8487b;

/* renamed from: zc.m0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11056m0<T> extends AbstractC11019a<T, T> {

    /* renamed from: zc.m0$a */
    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108410a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC8487b f108411b;

        a(io.reactivex.w<? super T> wVar) {
            this.f108410a = wVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108411b.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108411b.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108410a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108410a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            this.f108411b = interfaceC8487b;
            this.f108410a.onSubscribe(this);
        }
    }

    public C11056m0(io.reactivex.p pVar) {
        super(pVar);
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(wVar));
    }
}
