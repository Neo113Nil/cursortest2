package zc;

import nc.InterfaceC8487b;

/* renamed from: zc.z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11084z<T> extends AbstractC11019a<T, Long> {

    /* renamed from: zc.z$a */
    static final class a implements io.reactivex.w<Object>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super Long> f108767a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC8487b f108768b;

        /* renamed from: c, reason: collision with root package name */
        long f108769c;

        a(io.reactivex.w<? super Long> wVar) {
            this.f108767a = wVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108768b.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108768b.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            Long valueOf = Long.valueOf(this.f108769c);
            io.reactivex.w<? super Long> wVar = this.f108767a;
            wVar.onNext(valueOf);
            wVar.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108767a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(Object obj) {
            this.f108769c++;
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108768b, interfaceC8487b)) {
                this.f108768b = interfaceC8487b;
                this.f108767a.onSubscribe(this);
            }
        }
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super Long> wVar) {
        this.f108122a.subscribe(new a(wVar));
    }
}
