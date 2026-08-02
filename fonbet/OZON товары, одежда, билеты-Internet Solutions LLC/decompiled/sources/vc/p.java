package vc;

import io.reactivex.AbstractC7094b;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class p extends AbstractC7094b {

    /* renamed from: a, reason: collision with root package name */
    final AbstractC7094b f102807a;

    /* renamed from: b, reason: collision with root package name */
    final x f102808b;

    static final class a extends AtomicReference<InterfaceC8487b> implements io.reactivex.d, InterfaceC8487b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.d f102809a;

        /* renamed from: b, reason: collision with root package name */
        final rc.h f102810b = new rc.h();

        /* renamed from: c, reason: collision with root package name */
        final AbstractC7094b f102811c;

        a(io.reactivex.d dVar, AbstractC7094b abstractC7094b) {
            this.f102809a = dVar;
            this.f102811c = abstractC7094b;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this);
            rc.h hVar = this.f102810b;
            hVar.getClass();
            rc.d.a(hVar);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(get());
        }

        @Override // io.reactivex.d
        public final void onComplete() {
            this.f102809a.onComplete();
        }

        @Override // io.reactivex.d
        public final void onError(Throwable th2) {
            this.f102809a.onError(th2);
        }

        @Override // io.reactivex.d
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this, interfaceC8487b);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f102811c.a(this);
        }
    }

    public p(AbstractC7094b abstractC7094b, x xVar) {
        this.f102807a = abstractC7094b;
        this.f102808b = xVar;
    }

    @Override // io.reactivex.AbstractC7094b
    protected final void j(io.reactivex.d dVar) {
        a aVar = new a(dVar, this.f102807a);
        dVar.onSubscribe(aVar);
        InterfaceC8487b d11 = this.f102808b.d(aVar);
        rc.h hVar = aVar.f102810b;
        hVar.getClass();
        rc.d.d(hVar, d11);
    }
}
