package zc;

import Bl0.C2645f;
import java.util.Collection;
import java.util.concurrent.Callable;
import nc.InterfaceC8487b;
import sc.C9653a;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class C1<T, U extends Collection<? super T>> extends AbstractC11019a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final Callable<U> f107579b;

    static final class a<T, U extends Collection<? super T>> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super U> f107580a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC8487b f107581b;

        /* renamed from: c, reason: collision with root package name */
        U f107582c;

        a(io.reactivex.w<? super U> wVar, U u11) {
            this.f107580a = wVar;
            this.f107582c = u11;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f107581b.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107581b.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            U u11 = this.f107582c;
            this.f107582c = null;
            io.reactivex.w<? super U> wVar = this.f107580a;
            wVar.onNext(u11);
            wVar.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f107582c = null;
            this.f107580a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f107582c.add(t2);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f107581b, interfaceC8487b)) {
                this.f107581b = interfaceC8487b;
                this.f107580a.onSubscribe(this);
            }
        }
    }

    public C1(io.reactivex.u uVar) {
        super(uVar);
        this.f107579b = C9653a.e(16);
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super U> wVar) {
        try {
            U call = this.f107579b.call();
            C9656b.c(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f108122a.subscribe(new a(wVar, call));
        } catch (Throwable th2) {
            C2645f.c(th2);
            rc.e.d(th2, wVar);
        }
    }

    public C1(io.reactivex.p pVar, Callable callable) {
        super(pVar);
        this.f107579b = callable;
    }
}
