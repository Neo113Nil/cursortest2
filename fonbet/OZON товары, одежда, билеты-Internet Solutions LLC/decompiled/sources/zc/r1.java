package zc;

import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class r1<T> extends AbstractC11019a<T, T> {

    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108591a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC8487b f108592b;

        /* renamed from: c, reason: collision with root package name */
        T f108593c;

        a(io.reactivex.w<? super T> wVar) {
            this.f108591a = wVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108593c = null;
            this.f108592b.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108592b.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            T t2 = this.f108593c;
            io.reactivex.w<? super T> wVar = this.f108591a;
            if (t2 != null) {
                this.f108593c = null;
                wVar.onNext(t2);
            }
            wVar.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108593c = null;
            this.f108591a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f108593c = t2;
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108592b, interfaceC8487b)) {
                this.f108592b = interfaceC8487b;
                this.f108591a.onSubscribe(this);
            }
        }
    }

    public r1(io.reactivex.p pVar) {
        super(pVar);
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(wVar));
    }
}
