package zc;

import nc.InterfaceC8487b;

/* renamed from: zc.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11053l0<T> extends AbstractC11019a<T, T> {

    /* renamed from: zc.l0$a */
    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108385a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC8487b f108386b;

        a(io.reactivex.w<? super T> wVar) {
            this.f108385a = wVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108386b.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108386b.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108385a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108385a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f108385a.onNext(t2);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108386b, interfaceC8487b)) {
                this.f108386b = interfaceC8487b;
                this.f108385a.onSubscribe(this);
            }
        }
    }

    public C11053l0(io.reactivex.p pVar) {
        super(pVar);
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(wVar));
    }
}
