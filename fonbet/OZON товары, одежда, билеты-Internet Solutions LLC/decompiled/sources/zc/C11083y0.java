package zc;

import nc.InterfaceC8487b;

/* renamed from: zc.y0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11083y0<T> extends AbstractC11019a<T, io.reactivex.o<T>> {

    /* renamed from: zc.y0$a */
    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super io.reactivex.o<T>> f108758a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC8487b f108759b;

        a(io.reactivex.w<? super io.reactivex.o<T>> wVar) {
            this.f108758a = wVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108759b.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108759b.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            io.reactivex.o a11 = io.reactivex.o.a();
            io.reactivex.w<? super io.reactivex.o<T>> wVar = this.f108758a;
            wVar.onNext(a11);
            wVar.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            io.reactivex.o b11 = io.reactivex.o.b(th2);
            io.reactivex.w<? super io.reactivex.o<T>> wVar = this.f108758a;
            wVar.onNext(b11);
            wVar.onComplete();
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f108758a.onNext(io.reactivex.o.c(t2));
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108759b, interfaceC8487b)) {
                this.f108759b = interfaceC8487b;
                this.f108758a.onSubscribe(this);
            }
        }
    }

    public C11083y0(io.reactivex.p pVar) {
        super(pVar);
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super io.reactivex.o<T>> wVar) {
        this.f108122a.subscribe(new a(wVar));
    }
}
