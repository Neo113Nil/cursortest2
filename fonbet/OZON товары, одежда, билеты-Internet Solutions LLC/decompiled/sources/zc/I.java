package zc;

import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class I<T> extends AbstractC11019a<T, T> {

    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        io.reactivex.w<? super T> f107726a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC8487b f107727b;

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            InterfaceC8487b interfaceC8487b = this.f107727b;
            Gc.f fVar = Gc.f.INSTANCE;
            this.f107727b = fVar;
            this.f107726a = fVar;
            interfaceC8487b.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107727b.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            io.reactivex.w<? super T> wVar = this.f107726a;
            Gc.f fVar = Gc.f.INSTANCE;
            this.f107727b = fVar;
            this.f107726a = fVar;
            wVar.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            io.reactivex.w<? super T> wVar = this.f107726a;
            Gc.f fVar = Gc.f.INSTANCE;
            this.f107727b = fVar;
            this.f107726a = fVar;
            wVar.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f107726a.onNext(t2);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f107727b, interfaceC8487b)) {
                this.f107727b = interfaceC8487b;
                this.f107726a.onSubscribe(this);
            }
        }
    }

    public I(io.reactivex.p pVar) {
        super(pVar);
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        a aVar = new a();
        aVar.f107726a = wVar;
        this.f108122a.subscribe(aVar);
    }
}
