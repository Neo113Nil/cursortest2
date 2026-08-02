package zc;

import Kc.C3493a;
import java.util.concurrent.Callable;
import nc.InterfaceC8487b;
import qc.InterfaceC9020b;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class r<T, U> extends AbstractC11019a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final Callable<? extends U> f108567b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC9020b<? super U, ? super T> f108568c;

    static final class a<T, U> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super U> f108569a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC9020b<? super U, ? super T> f108570b;

        /* renamed from: c, reason: collision with root package name */
        final U f108571c;

        /* renamed from: d, reason: collision with root package name */
        InterfaceC8487b f108572d;

        /* renamed from: e, reason: collision with root package name */
        boolean f108573e;

        a(io.reactivex.w<? super U> wVar, U u11, InterfaceC9020b<? super U, ? super T> interfaceC9020b) {
            this.f108569a = wVar;
            this.f108570b = interfaceC9020b;
            this.f108571c = u11;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108572d.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108572d.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f108573e) {
                return;
            }
            this.f108573e = true;
            U u11 = this.f108571c;
            io.reactivex.w<? super U> wVar = this.f108569a;
            wVar.onNext(u11);
            wVar.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f108573e) {
                C3493a.f(th2);
            } else {
                this.f108573e = true;
                this.f108569a.onError(th2);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f108573e) {
                return;
            }
            try {
                this.f108570b.accept(this.f108571c, t2);
            } catch (Throwable th2) {
                this.f108572d.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108572d, interfaceC8487b)) {
                this.f108572d = interfaceC8487b;
                this.f108569a.onSubscribe(this);
            }
        }
    }

    public r(io.reactivex.p pVar, Callable callable, InterfaceC9020b interfaceC9020b) {
        super(pVar);
        this.f108567b = callable;
        this.f108568c = interfaceC9020b;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super U> wVar) {
        try {
            U call = this.f108567b.call();
            C9656b.c(call, "The initialSupplier returned a null value");
            this.f108122a.subscribe(new a(wVar, call, this.f108568c));
        } catch (Throwable th2) {
            rc.e.d(th2, wVar);
        }
    }
}
