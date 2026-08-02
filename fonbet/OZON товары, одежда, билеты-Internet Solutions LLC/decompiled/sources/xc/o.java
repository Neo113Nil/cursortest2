package xc;

import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class o<T> extends io.reactivex.h<T> {

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.n<T> f105318c;

    static final class a<T> extends Fc.c<T> implements io.reactivex.m<T> {

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f105319c;

        @Override // Fc.c, hg.InterfaceC6950c
        public final void cancel() {
            super.cancel();
            this.f105319c.dispose();
        }

        @Override // io.reactivex.m
        public final void onComplete() {
            this.f9317a.onComplete();
        }

        @Override // io.reactivex.m
        public final void onError(Throwable th2) {
            this.f9317a.onError(th2);
        }

        @Override // io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f105319c, interfaceC8487b)) {
                this.f105319c = interfaceC8487b;
                this.f9317a.d(this);
            }
        }
    }

    public o(io.reactivex.n<T> nVar) {
        this.f105318c = nVar;
    }

    @Override // io.reactivex.h
    protected final void j(io.reactivex.j jVar) {
        this.f105318c.a(new a(jVar));
    }
}
