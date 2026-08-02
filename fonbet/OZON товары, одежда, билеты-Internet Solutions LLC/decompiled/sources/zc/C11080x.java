package zc;

import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* renamed from: zc.x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11080x<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.n<? extends T> f108726b;

    /* renamed from: zc.x$a */
    static final class a<T> extends AtomicReference<InterfaceC8487b> implements io.reactivex.w<T>, io.reactivex.m<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108727a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.n<? extends T> f108728b;

        /* renamed from: c, reason: collision with root package name */
        boolean f108729c;

        a(io.reactivex.w<? super T> wVar, io.reactivex.n<? extends T> nVar) {
            this.f108727a = wVar;
            this.f108728b = nVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(get());
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f108729c) {
                this.f108727a.onComplete();
                return;
            }
            this.f108729c = true;
            rc.d.d(this, null);
            io.reactivex.n<? extends T> nVar = this.f108728b;
            this.f108728b = null;
            nVar.a(this);
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108727a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f108727a.onNext(t2);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (!rc.d.f(this, interfaceC8487b) || this.f108729c) {
                return;
            }
            this.f108727a.onSubscribe(this);
        }

        @Override // io.reactivex.m, io.reactivex.A
        public final void onSuccess(T t2) {
            io.reactivex.w<? super T> wVar = this.f108727a;
            wVar.onNext(t2);
            wVar.onComplete();
        }
    }

    public C11080x(io.reactivex.p<T> pVar, io.reactivex.n<? extends T> nVar) {
        super(pVar);
        this.f108726b = nVar;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f108726b));
    }
}
