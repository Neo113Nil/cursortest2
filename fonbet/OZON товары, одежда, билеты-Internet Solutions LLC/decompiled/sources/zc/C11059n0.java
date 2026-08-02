package zc;

import io.reactivex.AbstractC7094b;
import nc.InterfaceC8487b;
import tc.InterfaceC9802d;

/* renamed from: zc.n0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11059n0<T> extends AbstractC7094b implements InterfaceC9802d<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.p f108426a;

    /* renamed from: zc.n0$a */
    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.d f108427a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC8487b f108428b;

        a(io.reactivex.d dVar) {
            this.f108427a = dVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108428b.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108428b.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108427a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108427a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            this.f108428b = interfaceC8487b;
            this.f108427a.onSubscribe(this);
        }
    }

    public C11059n0(io.reactivex.p pVar) {
        this.f108426a = pVar;
    }

    @Override // tc.InterfaceC9802d
    public final io.reactivex.p<T> b() {
        return new C11056m0((io.reactivex.u) this.f108426a);
    }

    @Override // io.reactivex.AbstractC7094b
    public final void j(io.reactivex.d dVar) {
        this.f108426a.subscribe(new a(dVar));
    }
}
