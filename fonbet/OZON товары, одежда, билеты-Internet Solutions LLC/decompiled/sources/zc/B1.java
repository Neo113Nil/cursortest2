package zc;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class B1 extends io.reactivex.p<Long> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.x f107562a;

    /* renamed from: b, reason: collision with root package name */
    final long f107563b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f107564c;

    static final class a extends AtomicReference<InterfaceC8487b> implements InterfaceC8487b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super Long> f107565a;

        a(io.reactivex.w<? super Long> wVar) {
            this.f107565a = wVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return get() == rc.d.DISPOSED;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (isDisposed()) {
                return;
            }
            io.reactivex.w<? super Long> wVar = this.f107565a;
            wVar.onNext(0L);
            lazySet(rc.e.INSTANCE);
            wVar.onComplete();
        }
    }

    public B1(long j11, TimeUnit timeUnit, io.reactivex.x xVar) {
        this.f107563b = j11;
        this.f107564c = timeUnit;
        this.f107562a = xVar;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super Long> wVar) {
        a aVar = new a(wVar);
        wVar.onSubscribe(aVar);
        InterfaceC8487b e11 = this.f107562a.e(aVar, this.f107563b, this.f107564c);
        while (!aVar.compareAndSet(null, e11)) {
            if (aVar.get() != null) {
                if (aVar.get() == rc.d.DISPOSED) {
                    e11.dispose();
                    return;
                }
                return;
            }
        }
    }
}
