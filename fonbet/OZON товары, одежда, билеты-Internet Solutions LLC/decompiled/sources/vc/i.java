package vc;

import hg.InterfaceC6950c;
import io.reactivex.AbstractC7094b;
import nc.InterfaceC8487b;
import wc.K;

/* loaded from: classes.dex */
public final class i<T> extends AbstractC7094b {

    /* renamed from: a, reason: collision with root package name */
    final K f102777a;

    static final class a<T> implements io.reactivex.j<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.d f102778a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC6950c f102779b;

        a(io.reactivex.d dVar) {
            this.f102778a = dVar;
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (Fc.g.g(this.f102779b, interfaceC6950c)) {
                this.f102779b = interfaceC6950c;
                this.f102778a.onSubscribe(this);
                interfaceC6950c.n(Long.MAX_VALUE);
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f102779b.cancel();
            this.f102779b = Fc.g.CANCELLED;
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f102779b == Fc.g.CANCELLED;
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            this.f102778a.onComplete();
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            this.f102778a.onError(th2);
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
        }
    }

    public i(K k11) {
        this.f102777a = k11;
    }

    @Override // io.reactivex.AbstractC7094b
    protected final void j(io.reactivex.d dVar) {
        this.f102777a.a(new a(dVar));
    }
}
