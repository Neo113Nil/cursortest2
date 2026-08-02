package zc;

import nc.InterfaceC8487b;

/* renamed from: zc.n1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11060n1<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.u<? extends T> f108429b;

    /* renamed from: zc.n1$a */
    static final class a<T> implements io.reactivex.w<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108430a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.u<? extends T> f108431b;

        /* renamed from: d, reason: collision with root package name */
        boolean f108433d = true;

        /* renamed from: c, reason: collision with root package name */
        final rc.h f108432c = new rc.h();

        a(io.reactivex.w<? super T> wVar, io.reactivex.u<? extends T> uVar) {
            this.f108430a = wVar;
            this.f108431b = uVar;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (!this.f108433d) {
                this.f108430a.onComplete();
            } else {
                this.f108433d = false;
                this.f108431b.subscribe(this);
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108430a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f108433d) {
                this.f108433d = false;
            }
            this.f108430a.onNext(t2);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.h hVar = this.f108432c;
            hVar.getClass();
            rc.d.e(hVar, interfaceC8487b);
        }
    }

    public C11060n1(io.reactivex.p pVar, io.reactivex.u uVar) {
        super(pVar);
        this.f108429b = uVar;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        a aVar = new a(wVar, this.f108429b);
        wVar.onSubscribe(aVar.f108432c);
        this.f108122a.subscribe(aVar);
    }
}
