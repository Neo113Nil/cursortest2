package xc;

import io.reactivex.x;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class n<T> extends AbstractC10698a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final x f105313b;

    static final class a<T> extends AtomicReference<InterfaceC8487b> implements io.reactivex.m<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final rc.h f105314a = new rc.h();

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.m<? super T> f105315b;

        a(io.reactivex.m<? super T> mVar) {
            this.f105315b = mVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this);
            rc.h hVar = this.f105314a;
            hVar.getClass();
            rc.d.a(hVar);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(get());
        }

        @Override // io.reactivex.m
        public final void onComplete() {
            this.f105315b.onComplete();
        }

        @Override // io.reactivex.m
        public final void onError(Throwable th2) {
            this.f105315b.onError(th2);
        }

        @Override // io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this, interfaceC8487b);
        }

        @Override // io.reactivex.m, io.reactivex.A
        public final void onSuccess(T t2) {
            this.f105315b.onSuccess(t2);
        }
    }

    static final class b<T> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.m<? super T> f105316a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.k f105317b;

        b(io.reactivex.m mVar, io.reactivex.k kVar) {
            this.f105316a = mVar;
            this.f105317b = kVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f105317b.a(this.f105316a);
        }
    }

    public n(io.reactivex.k kVar, x xVar) {
        super(kVar);
        this.f105313b = xVar;
    }

    @Override // io.reactivex.k
    protected final void d(io.reactivex.m<? super T> mVar) {
        a aVar = new a(mVar);
        mVar.onSubscribe(aVar);
        InterfaceC8487b d11 = this.f105313b.d(new b(aVar, this.f105265a));
        rc.h hVar = aVar.f105314a;
        hVar.getClass();
        rc.d.d(hVar, d11);
    }
}
