package xc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.concurrent.atomic.AtomicInteger;
import nc.InterfaceC8487b;

/* renamed from: xc.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10701d<T> extends AbstractC10698a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final KY.a f105271b;

    /* renamed from: xc.d$a */
    static final class a<T> extends AtomicInteger implements io.reactivex.m<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.m<? super T> f105272a;

        /* renamed from: b, reason: collision with root package name */
        final KY.a f105273b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f105274c;

        a(io.reactivex.m mVar, KY.a aVar) {
            this.f105272a = mVar;
            this.f105273b = aVar;
        }

        final void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f105273b.run();
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    C3493a.f(th2);
                }
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f105274c.dispose();
            a();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f105274c.isDisposed();
        }

        @Override // io.reactivex.m
        public final void onComplete() {
            this.f105272a.onComplete();
            a();
        }

        @Override // io.reactivex.m
        public final void onError(Throwable th2) {
            this.f105272a.onError(th2);
            a();
        }

        @Override // io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f105274c, interfaceC8487b)) {
                this.f105274c = interfaceC8487b;
                this.f105272a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.m, io.reactivex.A
        public final void onSuccess(T t2) {
            this.f105272a.onSuccess(t2);
            a();
        }
    }

    public C10701d(g gVar, KY.a aVar) {
        super(gVar);
        this.f105271b = aVar;
    }

    @Override // io.reactivex.k
    protected final void d(io.reactivex.m<? super T> mVar) {
        this.f105265a.a(new a(mVar, this.f105271b));
    }
}
