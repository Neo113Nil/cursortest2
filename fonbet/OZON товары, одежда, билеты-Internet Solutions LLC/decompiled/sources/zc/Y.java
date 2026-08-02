package zc;

import Bl0.C2645f;
import Kc.C3493a;
import io.reactivex.AbstractC7094b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.C8486a;
import nc.InterfaceC8487b;
import sc.C9656b;
import tc.InterfaceC9802d;

/* loaded from: classes9.dex */
public final class Y<T> extends AbstractC7094b implements InterfaceC9802d<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.p f108086a;

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super T, ? extends io.reactivex.f> f108087b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f108088c;

    static final class a<T> extends AtomicInteger implements InterfaceC8487b, io.reactivex.w<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.d f108089a;

        /* renamed from: c, reason: collision with root package name */
        final qc.o<? super T, ? extends io.reactivex.f> f108091c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f108092d;

        /* renamed from: f, reason: collision with root package name */
        InterfaceC8487b f108094f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f108095g;

        /* renamed from: b, reason: collision with root package name */
        final Gc.c f108090b = new Gc.c();

        /* renamed from: e, reason: collision with root package name */
        final C8486a f108093e = new C8486a();

        /* renamed from: zc.Y$a$a, reason: collision with other inner class name */
        final class C2337a extends AtomicReference<InterfaceC8487b> implements io.reactivex.d, InterfaceC8487b {
            C2337a() {
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
                a aVar = a.this;
                aVar.f108093e.b(this);
                aVar.onComplete();
            }

            @Override // io.reactivex.d
            public final void onError(Throwable th2) {
                a aVar = a.this;
                aVar.f108093e.b(this);
                aVar.onError(th2);
            }

            @Override // io.reactivex.d
            public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
                rc.d.f(this, interfaceC8487b);
            }
        }

        a(io.reactivex.d dVar, qc.o<? super T, ? extends io.reactivex.f> oVar, boolean z11) {
            this.f108089a = dVar;
            this.f108091c = oVar;
            this.f108092d = z11;
            lazySet(1);
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108095g = true;
            this.f108094f.dispose();
            this.f108093e.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108094f.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                Gc.c cVar = this.f108090b;
                cVar.getClass();
                Throwable b11 = Gc.i.b(cVar);
                io.reactivex.d dVar = this.f108089a;
                if (b11 != null) {
                    dVar.onError(b11);
                } else {
                    dVar.onComplete();
                }
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            Gc.c cVar = this.f108090b;
            cVar.getClass();
            if (!Gc.i.a(cVar, th2)) {
                C3493a.f(th2);
                return;
            }
            boolean z11 = this.f108092d;
            io.reactivex.d dVar = this.f108089a;
            if (z11) {
                if (decrementAndGet() == 0) {
                    dVar.onError(Gc.i.b(cVar));
                }
            } else {
                dispose();
                if (getAndSet(0) > 0) {
                    dVar.onError(Gc.i.b(cVar));
                }
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            try {
                io.reactivex.f apply = this.f108091c.apply(t2);
                C9656b.c(apply, "The mapper returned a null CompletableSource");
                io.reactivex.f fVar = apply;
                getAndIncrement();
                C2337a c2337a = new C2337a();
                if (this.f108095g || !this.f108093e.a(c2337a)) {
                    return;
                }
                fVar.a(c2337a);
            } catch (Throwable th2) {
                C2645f.c(th2);
                this.f108094f.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108094f, interfaceC8487b)) {
                this.f108094f = interfaceC8487b;
                this.f108089a.onSubscribe(this);
            }
        }
    }

    public Y(io.reactivex.p pVar, qc.o oVar, boolean z11) {
        this.f108086a = pVar;
        this.f108087b = oVar;
        this.f108088c = z11;
    }

    @Override // tc.InterfaceC9802d
    public final io.reactivex.p<T> b() {
        return new X(this.f108086a, this.f108087b, this.f108088c);
    }

    @Override // io.reactivex.AbstractC7094b
    protected final void j(io.reactivex.d dVar) {
        this.f108086a.subscribe(new a(dVar, this.f108087b, this.f108088c));
    }
}
