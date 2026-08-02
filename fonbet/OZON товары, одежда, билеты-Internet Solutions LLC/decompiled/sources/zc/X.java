package zc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.concurrent.atomic.AtomicReference;
import nc.C8486a;
import nc.InterfaceC8487b;
import sc.C9656b;
import uc.AbstractC10018b;

/* loaded from: classes9.dex */
public final class X<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super T, ? extends io.reactivex.f> f108065b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f108066c;

    static final class a<T> extends AbstractC10018b<T> implements io.reactivex.w<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108067a;

        /* renamed from: c, reason: collision with root package name */
        final qc.o<? super T, ? extends io.reactivex.f> f108069c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f108070d;

        /* renamed from: f, reason: collision with root package name */
        InterfaceC8487b f108072f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f108073g;

        /* renamed from: b, reason: collision with root package name */
        final Gc.c f108068b = new Gc.c();

        /* renamed from: e, reason: collision with root package name */
        final C8486a f108071e = new C8486a();

        /* renamed from: zc.X$a$a, reason: collision with other inner class name */
        final class C2336a extends AtomicReference<InterfaceC8487b> implements io.reactivex.d, InterfaceC8487b {
            C2336a() {
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
                aVar.f108071e.b(this);
                aVar.onComplete();
            }

            @Override // io.reactivex.d
            public final void onError(Throwable th2) {
                a aVar = a.this;
                aVar.f108071e.b(this);
                aVar.onError(th2);
            }

            @Override // io.reactivex.d
            public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
                rc.d.f(this, interfaceC8487b);
            }
        }

        a(io.reactivex.w<? super T> wVar, qc.o<? super T, ? extends io.reactivex.f> oVar, boolean z11) {
            this.f108067a = wVar;
            this.f108069c = oVar;
            this.f108070d = z11;
            lazySet(1);
        }

        @Override // tc.InterfaceC9804f
        public final int a(int i11) {
            return 2;
        }

        @Override // tc.InterfaceC9808j
        public final void clear() {
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108073g = true;
            this.f108072f.dispose();
            this.f108071e.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108072f.isDisposed();
        }

        @Override // tc.InterfaceC9808j
        public final boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                Gc.c cVar = this.f108068b;
                cVar.getClass();
                Throwable b11 = Gc.i.b(cVar);
                io.reactivex.w<? super T> wVar = this.f108067a;
                if (b11 != null) {
                    wVar.onError(b11);
                } else {
                    wVar.onComplete();
                }
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            Gc.c cVar = this.f108068b;
            cVar.getClass();
            if (!Gc.i.a(cVar, th2)) {
                C3493a.f(th2);
                return;
            }
            boolean z11 = this.f108070d;
            io.reactivex.w<? super T> wVar = this.f108067a;
            if (z11) {
                if (decrementAndGet() == 0) {
                    cVar.getClass();
                    wVar.onError(Gc.i.b(cVar));
                    return;
                }
                return;
            }
            dispose();
            if (getAndSet(0) > 0) {
                cVar.getClass();
                wVar.onError(Gc.i.b(cVar));
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            try {
                io.reactivex.f apply = this.f108069c.apply(t2);
                C9656b.c(apply, "The mapper returned a null CompletableSource");
                io.reactivex.f fVar = apply;
                getAndIncrement();
                C2336a c2336a = new C2336a();
                if (this.f108073g || !this.f108071e.a(c2336a)) {
                    return;
                }
                fVar.a(c2336a);
            } catch (Throwable th2) {
                C2645f.c(th2);
                this.f108072f.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108072f, interfaceC8487b)) {
                this.f108072f = interfaceC8487b;
                this.f108067a.onSubscribe(this);
            }
        }

        @Override // tc.InterfaceC9808j
        public final T poll() throws Exception {
            return null;
        }
    }

    public X(io.reactivex.p pVar, qc.o oVar, boolean z11) {
        super(pVar);
        this.f108065b = oVar;
        this.f108066c = z11;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f108065b, this.f108066c));
    }
}
