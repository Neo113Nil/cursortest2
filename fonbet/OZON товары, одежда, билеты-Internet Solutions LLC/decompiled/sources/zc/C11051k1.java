package zc;

import nc.InterfaceC8487b;
import rc.C9242a;

/* renamed from: zc.k1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11051k1<T, U> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.u<U> f108359b;

    /* renamed from: zc.k1$a */
    final class a implements io.reactivex.w<U> {

        /* renamed from: a, reason: collision with root package name */
        final C9242a f108360a;

        /* renamed from: b, reason: collision with root package name */
        final b<T> f108361b;

        /* renamed from: c, reason: collision with root package name */
        final Ic.e<T> f108362c;

        /* renamed from: d, reason: collision with root package name */
        InterfaceC8487b f108363d;

        a(C9242a c9242a, b bVar, Ic.e eVar) {
            this.f108360a = c9242a;
            this.f108361b = bVar;
            this.f108362c = eVar;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108361b.f108367d = true;
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108360a.dispose();
            this.f108362c.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(U u11) {
            this.f108363d.dispose();
            this.f108361b.f108367d = true;
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108363d, interfaceC8487b)) {
                this.f108363d = interfaceC8487b;
                this.f108360a.a(1, interfaceC8487b);
            }
        }
    }

    /* renamed from: zc.k1$b */
    static final class b<T> implements io.reactivex.w<T> {

        /* renamed from: a, reason: collision with root package name */
        final Ic.e f108364a;

        /* renamed from: b, reason: collision with root package name */
        final C9242a f108365b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f108366c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f108367d;

        /* renamed from: e, reason: collision with root package name */
        boolean f108368e;

        b(Ic.e eVar, C9242a c9242a) {
            this.f108364a = eVar;
            this.f108365b = c9242a;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108365b.dispose();
            this.f108364a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108365b.dispose();
            this.f108364a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f108368e) {
                this.f108364a.onNext(t2);
            } else if (this.f108367d) {
                this.f108368e = true;
                this.f108364a.onNext(t2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108366c, interfaceC8487b)) {
                this.f108366c = interfaceC8487b;
                this.f108365b.a(0, interfaceC8487b);
            }
        }
    }

    public C11051k1(io.reactivex.p pVar, io.reactivex.u uVar) {
        super(pVar);
        this.f108359b = uVar;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        Ic.e eVar = new Ic.e(wVar);
        C9242a c9242a = new C9242a(2);
        eVar.onSubscribe(c9242a);
        b bVar = new b(eVar, c9242a);
        this.f108359b.subscribe(new a(c9242a, bVar, eVar));
        this.f108122a.subscribe(bVar);
    }
}
