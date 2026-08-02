package xc;

import Bl0.C2645f;
import nc.InterfaceC8487b;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class j<T, R> extends AbstractC10698a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super T, ? extends R> f105291b;

    static final class a<T, R> implements io.reactivex.m<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.m<? super R> f105292a;

        /* renamed from: b, reason: collision with root package name */
        final qc.o<? super T, ? extends R> f105293b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f105294c;

        a(io.reactivex.m<? super R> mVar, qc.o<? super T, ? extends R> oVar) {
            this.f105292a = mVar;
            this.f105293b = oVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            InterfaceC8487b interfaceC8487b = this.f105294c;
            this.f105294c = rc.d.DISPOSED;
            interfaceC8487b.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f105294c.isDisposed();
        }

        @Override // io.reactivex.m
        public final void onComplete() {
            this.f105292a.onComplete();
        }

        @Override // io.reactivex.m
        public final void onError(Throwable th2) {
            this.f105292a.onError(th2);
        }

        @Override // io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f105294c, interfaceC8487b)) {
                this.f105294c = interfaceC8487b;
                this.f105292a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.m, io.reactivex.A
        public final void onSuccess(T t2) {
            io.reactivex.m<? super R> mVar = this.f105292a;
            try {
                R apply = this.f105293b.apply(t2);
                C9656b.c(apply, "The mapper returned a null item");
                mVar.onSuccess(apply);
            } catch (Throwable th2) {
                C2645f.c(th2);
                mVar.onError(th2);
            }
        }
    }

    public j(io.reactivex.k kVar, qc.o oVar) {
        super(kVar);
        this.f105291b = oVar;
    }

    @Override // io.reactivex.k
    protected final void d(io.reactivex.m<? super R> mVar) {
        this.f105265a.a(new a(mVar, this.f105291b));
    }
}
