package zc;

import Kc.C3493a;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class G<T, U> extends io.reactivex.p<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.p f107659a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.u<U> f107660b;

    final class a implements io.reactivex.w<U> {

        /* renamed from: a, reason: collision with root package name */
        final rc.h f107661a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.w<? super T> f107662b;

        /* renamed from: c, reason: collision with root package name */
        boolean f107663c;

        /* renamed from: zc.G$a$a, reason: collision with other inner class name */
        final class C2332a implements io.reactivex.w<T> {
            C2332a() {
            }

            @Override // io.reactivex.w
            public final void onComplete() {
                a.this.f107662b.onComplete();
            }

            @Override // io.reactivex.w
            public final void onError(Throwable th2) {
                a.this.f107662b.onError(th2);
            }

            @Override // io.reactivex.w
            public final void onNext(T t2) {
                a.this.f107662b.onNext(t2);
            }

            @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
            public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
                rc.h hVar = a.this.f107661a;
                hVar.getClass();
                rc.d.e(hVar, interfaceC8487b);
            }
        }

        a(rc.h hVar, io.reactivex.w<? super T> wVar) {
            this.f107661a = hVar;
            this.f107662b = wVar;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f107663c) {
                return;
            }
            this.f107663c = true;
            G g10 = G.this;
            g10.f107659a.subscribe(new C2332a());
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f107663c) {
                C3493a.f(th2);
            } else {
                this.f107663c = true;
                this.f107662b.onError(th2);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(U u11) {
            onComplete();
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            rc.h hVar = this.f107661a;
            hVar.getClass();
            rc.d.e(hVar, interfaceC8487b);
        }
    }

    public G(io.reactivex.p pVar, io.reactivex.u uVar) {
        this.f107659a = pVar;
        this.f107660b = uVar;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        rc.h hVar = new rc.h();
        wVar.onSubscribe(hVar);
        this.f107660b.subscribe(new a(hVar, wVar));
    }
}
