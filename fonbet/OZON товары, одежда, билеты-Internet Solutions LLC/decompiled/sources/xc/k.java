package xc;

import io.reactivex.x;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class k<T> extends AbstractC10698a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final x f105295b;

    static final class a<T> extends AtomicReference<InterfaceC8487b> implements io.reactivex.m<T>, InterfaceC8487b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.m<? super T> f105296a;

        /* renamed from: b, reason: collision with root package name */
        final x f105297b;

        /* renamed from: c, reason: collision with root package name */
        T f105298c;

        /* renamed from: d, reason: collision with root package name */
        Throwable f105299d;

        a(io.reactivex.m<? super T> mVar, x xVar) {
            this.f105296a = mVar;
            this.f105297b = xVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(get());
        }

        @Override // io.reactivex.m
        public final void onComplete() {
            rc.d.d(this, this.f105297b.d(this));
        }

        @Override // io.reactivex.m
        public final void onError(Throwable th2) {
            this.f105299d = th2;
            rc.d.d(this, this.f105297b.d(this));
        }

        @Override // io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.f(this, interfaceC8487b)) {
                this.f105296a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.m, io.reactivex.A
        public final void onSuccess(T t2) {
            this.f105298c = t2;
            rc.d.d(this, this.f105297b.d(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th2 = this.f105299d;
            io.reactivex.m<? super T> mVar = this.f105296a;
            if (th2 != null) {
                this.f105299d = null;
                mVar.onError(th2);
                return;
            }
            T t2 = this.f105298c;
            if (t2 == null) {
                mVar.onComplete();
            } else {
                this.f105298c = null;
                mVar.onSuccess(t2);
            }
        }
    }

    public k(io.reactivex.k kVar, x xVar) {
        super(kVar);
        this.f105295b = xVar;
    }

    @Override // io.reactivex.k
    protected final void d(io.reactivex.m<? super T> mVar) {
        this.f105265a.a(new a(mVar, this.f105295b));
    }
}
