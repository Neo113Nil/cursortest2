package zc;

import io.reactivex.x;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* renamed from: zc.q0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11068q0 extends io.reactivex.p<Long> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.x f108553a;

    /* renamed from: b, reason: collision with root package name */
    final long f108554b;

    /* renamed from: c, reason: collision with root package name */
    final long f108555c;

    /* renamed from: d, reason: collision with root package name */
    final long f108556d;

    /* renamed from: e, reason: collision with root package name */
    final long f108557e;

    /* renamed from: f, reason: collision with root package name */
    final TimeUnit f108558f;

    /* renamed from: zc.q0$a */
    static final class a extends AtomicReference<InterfaceC8487b> implements InterfaceC8487b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super Long> f108559a;

        /* renamed from: b, reason: collision with root package name */
        final long f108560b;

        /* renamed from: c, reason: collision with root package name */
        long f108561c;

        a(io.reactivex.w<? super Long> wVar, long j11, long j12) {
            this.f108559a = wVar;
            this.f108561c = j11;
            this.f108560b = j12;
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
            long j11 = this.f108561c;
            Long valueOf = Long.valueOf(j11);
            io.reactivex.w<? super Long> wVar = this.f108559a;
            wVar.onNext(valueOf);
            if (j11 != this.f108560b) {
                this.f108561c = j11 + 1;
            } else {
                rc.d.a(this);
                wVar.onComplete();
            }
        }
    }

    public C11068q0(long j11, long j12, long j13, long j14, TimeUnit timeUnit, io.reactivex.x xVar) {
        this.f108556d = j13;
        this.f108557e = j14;
        this.f108558f = timeUnit;
        this.f108553a = xVar;
        this.f108554b = j11;
        this.f108555c = j12;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super Long> wVar) {
        a aVar = new a(wVar, this.f108554b, this.f108555c);
        wVar.onSubscribe(aVar);
        io.reactivex.x xVar = this.f108553a;
        if (!(xVar instanceof Dc.p)) {
            rc.d.f(aVar, xVar.f(aVar, this.f108556d, this.f108557e, this.f108558f));
        } else {
            x.c b11 = xVar.b();
            rc.d.f(aVar, b11);
            b11.c(aVar, this.f108556d, this.f108557e, this.f108558f);
        }
    }
}
