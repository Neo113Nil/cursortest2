package zc;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* renamed from: zc.z0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11085z0<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.f f108770b;

    /* renamed from: zc.z0$a */
    static final class a<T> extends AtomicInteger implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108771a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f108772b = new AtomicReference<>();

        /* renamed from: c, reason: collision with root package name */
        final C2344a f108773c = new C2344a(this);

        /* renamed from: d, reason: collision with root package name */
        final Gc.c f108774d = new Gc.c();

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f108775e;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f108776f;

        /* renamed from: zc.z0$a$a, reason: collision with other inner class name */
        static final class C2344a extends AtomicReference<InterfaceC8487b> implements io.reactivex.d {

            /* renamed from: a, reason: collision with root package name */
            final a<?> f108777a;

            C2344a(a<?> aVar) {
                this.f108777a = aVar;
            }

            @Override // io.reactivex.d
            public final void onComplete() {
                a<?> aVar = this.f108777a;
                aVar.f108776f = true;
                if (aVar.f108775e) {
                    Bl0.B.b(aVar.f108771a, aVar, aVar.f108774d);
                }
            }

            @Override // io.reactivex.d
            public final void onError(Throwable th2) {
                a<?> aVar = this.f108777a;
                rc.d.a(aVar.f108772b);
                Bl0.B.c(aVar.f108771a, th2, aVar, aVar.f108774d);
            }

            @Override // io.reactivex.d
            public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
                rc.d.f(this, interfaceC8487b);
            }
        }

        a(io.reactivex.w<? super T> wVar) {
            this.f108771a = wVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            rc.d.a(this.f108772b);
            rc.d.a(this.f108773c);
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return rc.d.b(this.f108772b.get());
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108775e = true;
            if (this.f108776f) {
                Bl0.B.b(this.f108771a, this, this.f108774d);
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            rc.d.a(this.f108772b);
            Bl0.B.c(this.f108771a, th2, this, this.f108774d);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            Bl0.B.d(this.f108771a, t2, this, this.f108774d);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.d.f(this.f108772b, interfaceC8487b);
        }
    }

    public C11085z0(io.reactivex.p<T> pVar, io.reactivex.f fVar) {
        super(pVar);
        this.f108770b = fVar;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        a aVar = new a(wVar);
        wVar.onSubscribe(aVar);
        this.f108122a.subscribe(aVar);
        this.f108770b.a(aVar.f108773c);
    }
}
