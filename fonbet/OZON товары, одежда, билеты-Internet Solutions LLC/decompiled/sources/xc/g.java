package xc;

import Bl0.C2645f;
import io.reactivex.A;
import io.reactivex.C;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import ru.ozon.app.android.web.webview.cache.WebViewResourcesManagerImpl;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class g<T, R> extends io.reactivex.k<R> {

    /* renamed from: a, reason: collision with root package name */
    final j f105281a;

    /* renamed from: b, reason: collision with root package name */
    final CJ.b f105282b;

    static final class a<T, R> extends AtomicReference<InterfaceC8487b> implements io.reactivex.m<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.m<? super R> f105283a;

        /* renamed from: b, reason: collision with root package name */
        final CJ.b f105284b;

        a(io.reactivex.m mVar, CJ.b bVar) {
            this.f105283a = mVar;
            this.f105284b = bVar;
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
            this.f105283a.onComplete();
        }

        @Override // io.reactivex.m
        public final void onError(Throwable th2) {
            this.f105283a.onError(th2);
        }

        @Override // io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.f(this, interfaceC8487b)) {
                this.f105283a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.m, io.reactivex.A
        public final void onSuccess(T t2) {
            C actualizeCache$lambda$2;
            try {
                actualizeCache$lambda$2 = WebViewResourcesManagerImpl.actualizeCache$lambda$2(this.f105284b.f4538b, t2);
                C9656b.c(actualizeCache$lambda$2, "The mapper returned a null SingleSource");
                actualizeCache$lambda$2.c(new b(this, this.f105283a));
            } catch (Throwable th2) {
                C2645f.c(th2);
                onError(th2);
            }
        }
    }

    static final class b<R> implements A<R> {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f105285a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.m<? super R> f105286b;

        b(AtomicReference<InterfaceC8487b> atomicReference, io.reactivex.m<? super R> mVar) {
            this.f105285a = atomicReference;
            this.f105286b = mVar;
        }

        @Override // io.reactivex.A
        public final void onError(Throwable th2) {
            this.f105286b.onError(th2);
        }

        @Override // io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.d(this.f105285a, interfaceC8487b);
        }

        @Override // io.reactivex.A
        public final void onSuccess(R r11) {
            this.f105286b.onSuccess(r11);
        }
    }

    public g(j jVar, CJ.b bVar) {
        this.f105281a = jVar;
        this.f105282b = bVar;
    }

    @Override // io.reactivex.k
    protected final void d(io.reactivex.m<? super R> mVar) {
        this.f105281a.a(new a(mVar, this.f105282b));
    }
}
