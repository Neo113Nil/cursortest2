package zc;

import hg.InterfaceC6948a;
import hg.InterfaceC6950c;
import nc.InterfaceC8487b;

/* renamed from: zc.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11038g0<T> extends io.reactivex.p<T> {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC6948a<? extends T> f108247a;

    /* renamed from: zc.g0$a */
    static final class a<T> implements io.reactivex.j<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108248a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC6950c f108249b;

        a(io.reactivex.w<? super T> wVar) {
            this.f108248a = wVar;
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (Fc.g.g(this.f108249b, interfaceC6950c)) {
                this.f108249b = interfaceC6950c;
                this.f108248a.onSubscribe(this);
                interfaceC6950c.n(Long.MAX_VALUE);
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108249b.cancel();
            this.f108249b = Fc.g.CANCELLED;
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108249b == Fc.g.CANCELLED;
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            this.f108248a.onComplete();
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            this.f108248a.onError(th2);
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            this.f108248a.onNext(t2);
        }
    }

    public C11038g0(InterfaceC6948a<? extends T> interfaceC6948a) {
        this.f108247a = interfaceC6948a;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108247a.a(new a(wVar));
    }
}
