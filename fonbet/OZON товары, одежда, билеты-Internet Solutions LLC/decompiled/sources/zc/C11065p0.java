package zc;

import io.reactivex.x;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* renamed from: zc.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11065p0 extends io.reactivex.p<Long> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.x f108523a;

    /* renamed from: b, reason: collision with root package name */
    final long f108524b;

    /* renamed from: c, reason: collision with root package name */
    final long f108525c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f108526d;

    /* renamed from: zc.p0$a */
    static final class a extends AtomicReference<InterfaceC8487b> implements InterfaceC8487b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super Long> f108527a;

        /* renamed from: b, reason: collision with root package name */
        long f108528b;

        a(io.reactivex.w<? super Long> wVar) {
            this.f108527a = wVar;
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
            if (get() != rc.d.DISPOSED) {
                long j11 = this.f108528b;
                this.f108528b = 1 + j11;
                this.f108527a.onNext(Long.valueOf(j11));
            }
        }
    }

    public C11065p0(long j11, long j12, TimeUnit timeUnit, io.reactivex.x xVar) {
        this.f108524b = j11;
        this.f108525c = j12;
        this.f108526d = timeUnit;
        this.f108523a = xVar;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super Long> wVar) {
        a aVar = new a(wVar);
        wVar.onSubscribe(aVar);
        io.reactivex.x xVar = this.f108523a;
        if (!(xVar instanceof Dc.p)) {
            rc.d.f(aVar, xVar.f(aVar, this.f108524b, this.f108525c, this.f108526d));
        } else {
            x.c b11 = xVar.b();
            rc.d.f(aVar, b11);
            b11.c(aVar, this.f108524b, this.f108525c, this.f108526d);
        }
    }
}
