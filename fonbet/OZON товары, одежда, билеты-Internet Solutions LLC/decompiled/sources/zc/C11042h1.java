package zc;

import nc.InterfaceC8487b;

/* renamed from: zc.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11042h1<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f108267b;

    /* renamed from: zc.h1$a */
    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108268a;

        /* renamed from: b, reason: collision with root package name */
        long f108269b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f108270c;

        a(io.reactivex.w<? super T> wVar, long j11) {
            this.f108268a = wVar;
            this.f108269b = j11;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108270c.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108270c.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108268a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108268a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            long j11 = this.f108269b;
            if (j11 != 0) {
                this.f108269b = j11 - 1;
            } else {
                this.f108268a.onNext(t2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108270c, interfaceC8487b)) {
                this.f108270c = interfaceC8487b;
                this.f108268a.onSubscribe(this);
            }
        }
    }

    public C11042h1(io.reactivex.p pVar, long j11) {
        super(pVar);
        this.f108267b = j11;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f108267b));
    }
}
