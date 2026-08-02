package zc;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class t1<T, U> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.u<? extends U> f108641b;

    static final class a<T, U> extends AtomicInteger implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108642a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f108643b = new AtomicReference<>();

        /* renamed from: c, reason: collision with root package name */
        final a<T, U>.C2342a f108644c = new C2342a();

        /* renamed from: d, reason: collision with root package name */
        final Gc.c f108645d = new Gc.c();

        /* renamed from: zc.t1$a$a, reason: collision with other inner class name */
        final class C2342a extends AtomicReference<InterfaceC8487b> implements io.reactivex.w<U> {
            C2342a() {
            }

            @Override // io.reactivex.w
            public final void onComplete() {
                a aVar = a.this;
                rc.d.a(aVar.f108643b);
                Bl0.B.b(aVar.f108642a, aVar, aVar.f108645d);
            }

            @Override // io.reactivex.w
            public final void onError(Throwable th2) {
                a aVar = a.this;
                rc.d.a(aVar.f108643b);
                Bl0.B.c(aVar.f108642a, th2, aVar, aVar.f108645d);
            }

            @Override // io.reactivex.w
            public final void onNext(U u11) {
                rc.d.a(this);
                a aVar = a.this;
                rc.d.a(aVar.f108643b);
                Bl0.B.b(aVar.f108642a, aVar, aVar.f108645d);
            }

            @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
            public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
                rc.d.f(this, interfaceC8487b);
            }
        }

        a(io.reactivex.w<? super T> wVar) {
            this.f108642a = wVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this.f108643b);
            rc.d.a(this.f108644c);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(this.f108643b.get());
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            rc.d.a(this.f108644c);
            Bl0.B.b(this.f108642a, this, this.f108645d);
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            rc.d.a(this.f108644c);
            Bl0.B.c(this.f108642a, th2, this, this.f108645d);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            Bl0.B.d(this.f108642a, t2, this, this.f108645d);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this.f108643b, interfaceC8487b);
        }
    }

    public t1(io.reactivex.p pVar, io.reactivex.u uVar) {
        super(pVar);
        this.f108641b = uVar;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        a aVar = new a(wVar);
        wVar.onSubscribe(aVar);
        this.f108641b.subscribe(aVar.f108644c);
        this.f108122a.subscribe(aVar);
    }
}
