package zc;

import Bl0.C2645f;
import Nc.C3669c;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class J0<T, R> extends AbstractC11019a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super io.reactivex.p<T>, ? extends io.reactivex.u<R>> f107750b;

    static final class a<T, R> implements io.reactivex.w<T> {

        /* renamed from: a, reason: collision with root package name */
        final C3669c<T> f107751a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f107752b;

        a(C3669c<T> c3669c, AtomicReference<InterfaceC8487b> atomicReference) {
            this.f107751a = c3669c;
            this.f107752b = atomicReference;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f107751a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f107751a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f107751a.onNext(t2);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this.f107752b, interfaceC8487b);
        }
    }

    static final class b<T, R> extends AtomicReference<InterfaceC8487b> implements io.reactivex.w<R>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super R> f107753a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC8487b f107754b;

        b(io.reactivex.w<? super R> wVar) {
            this.f107753a = wVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f107754b.dispose();
            rc.d.a(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107754b.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            rc.d.a(this);
            this.f107753a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            rc.d.a(this);
            this.f107753a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(R r11) {
            this.f107753a.onNext(r11);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f107754b, interfaceC8487b)) {
                this.f107754b = interfaceC8487b;
                this.f107753a.onSubscribe(this);
            }
        }
    }

    public J0(io.reactivex.p pVar, qc.o oVar) {
        super(pVar);
        this.f107750b = oVar;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super R> wVar) {
        C3669c d11 = C3669c.d();
        try {
            io.reactivex.u<R> apply = this.f107750b.apply(d11);
            C9656b.c(apply, "The selector returned a null ObservableSource");
            io.reactivex.u<R> uVar = apply;
            b bVar = new b(wVar);
            uVar.subscribe(bVar);
            this.f108122a.subscribe(new a(d11, bVar));
        } catch (Throwable th2) {
            C2645f.c(th2);
            rc.e.d(th2, wVar);
        }
    }
}
