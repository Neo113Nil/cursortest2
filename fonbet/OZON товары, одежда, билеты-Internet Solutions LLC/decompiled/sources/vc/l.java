package vc;

import io.reactivex.AbstractC7094b;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class l extends AbstractC7094b {

    /* renamed from: a, reason: collision with root package name */
    final AbstractC7094b f102783a;

    /* renamed from: b, reason: collision with root package name */
    final x f102784b;

    static final class a extends AtomicReference<InterfaceC8487b> implements io.reactivex.d, InterfaceC8487b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.d f102785a;

        /* renamed from: b, reason: collision with root package name */
        final x f102786b;

        /* renamed from: c, reason: collision with root package name */
        Throwable f102787c;

        a(io.reactivex.d dVar, x xVar) {
            this.f102785a = dVar;
            this.f102786b = xVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(get());
        }

        @Override // io.reactivex.d
        public final void onComplete() {
            rc.d.d(this, this.f102786b.d(this));
        }

        @Override // io.reactivex.d
        public final void onError(Throwable th2) {
            this.f102787c = th2;
            rc.d.d(this, this.f102786b.d(this));
        }

        @Override // io.reactivex.d
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.f(this, interfaceC8487b)) {
                this.f102785a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th2 = this.f102787c;
            io.reactivex.d dVar = this.f102785a;
            if (th2 == null) {
                dVar.onComplete();
            } else {
                this.f102787c = null;
                dVar.onError(th2);
            }
        }
    }

    public l(AbstractC7094b abstractC7094b, x xVar) {
        this.f102783a = abstractC7094b;
        this.f102784b = xVar;
    }

    @Override // io.reactivex.AbstractC7094b
    protected final void j(io.reactivex.d dVar) {
        this.f102783a.a(new a(dVar, this.f102784b));
    }
}
