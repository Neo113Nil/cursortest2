package vc;

import Bl0.C2645f;
import io.reactivex.AbstractC7094b;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import oc.C8691a;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class o extends AbstractC7094b {

    /* renamed from: a, reason: collision with root package name */
    final AbstractC7094b f102802a;

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super Throwable, ? extends io.reactivex.f> f102803b;

    static final class a extends AtomicReference<InterfaceC8487b> implements io.reactivex.d, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.d f102804a;

        /* renamed from: b, reason: collision with root package name */
        final qc.o<? super Throwable, ? extends io.reactivex.f> f102805b;

        /* renamed from: c, reason: collision with root package name */
        boolean f102806c;

        a(io.reactivex.d dVar, qc.o<? super Throwable, ? extends io.reactivex.f> oVar) {
            this.f102804a = dVar;
            this.f102805b = oVar;
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
            this.f102804a.onComplete();
        }

        @Override // io.reactivex.d
        public final void onError(Throwable th2) {
            boolean z11 = this.f102806c;
            io.reactivex.d dVar = this.f102804a;
            if (z11) {
                dVar.onError(th2);
                return;
            }
            this.f102806c = true;
            try {
                io.reactivex.f apply = this.f102805b.apply(th2);
                C9656b.c(apply, "The errorMapper returned a null CompletableSource");
                apply.a(this);
            } catch (Throwable th3) {
                C2645f.c(th3);
                dVar.onError(new C8691a(th2, th3));
            }
        }

        @Override // io.reactivex.d
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.d(this, interfaceC8487b);
        }
    }

    public o(AbstractC7094b abstractC7094b, qc.o oVar) {
        this.f102802a = abstractC7094b;
        this.f102803b = oVar;
    }

    @Override // io.reactivex.AbstractC7094b
    protected final void j(io.reactivex.d dVar) {
        a aVar = new a(dVar, this.f102803b);
        dVar.onSubscribe(aVar);
        this.f102802a.a(aVar);
    }
}
