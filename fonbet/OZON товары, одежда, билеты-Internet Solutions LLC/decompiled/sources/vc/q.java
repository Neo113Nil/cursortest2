package vc;

import io.reactivex.AbstractC7094b;
import io.reactivex.x;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class q extends AbstractC7094b {

    /* renamed from: a, reason: collision with root package name */
    final long f102812a;

    /* renamed from: b, reason: collision with root package name */
    final TimeUnit f102813b;

    /* renamed from: c, reason: collision with root package name */
    final x f102814c;

    static final class a extends AtomicReference<InterfaceC8487b> implements InterfaceC8487b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.d f102815a;

        a(io.reactivex.d dVar) {
            this.f102815a = dVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(get());
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f102815a.onComplete();
        }
    }

    public q(long j11, TimeUnit timeUnit, x xVar) {
        this.f102812a = j11;
        this.f102813b = timeUnit;
        this.f102814c = xVar;
    }

    @Override // io.reactivex.AbstractC7094b
    protected final void j(io.reactivex.d dVar) {
        a aVar = new a(dVar);
        dVar.onSubscribe(aVar);
        rc.d.d(aVar, this.f102814c.e(aVar, this.f102812a, this.f102813b));
    }
}
