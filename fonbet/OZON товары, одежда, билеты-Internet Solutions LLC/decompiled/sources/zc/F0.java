package zc;

import Bl0.C2645f;
import nc.InterfaceC8487b;
import oc.C8691a;

/* loaded from: classes.dex */
public final class F0<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super Throwable, ? extends T> f107646b;

    /* loaded from: classes9.dex */
    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f107647a;

        /* renamed from: b, reason: collision with root package name */
        final qc.o<? super Throwable, ? extends T> f107648b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f107649c;

        a(io.reactivex.w<? super T> wVar, qc.o<? super Throwable, ? extends T> oVar) {
            this.f107647a = wVar;
            this.f107648b = oVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f107649c.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107649c.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f107647a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            io.reactivex.w<? super T> wVar = this.f107647a;
            try {
                T apply = this.f107648b.apply(th2);
                if (apply != null) {
                    wVar.onNext(apply);
                    wVar.onComplete();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th2);
                    wVar.onError(nullPointerException);
                }
            } catch (Throwable th3) {
                C2645f.c(th3);
                wVar.onError(new C8691a(th2, th3));
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f107647a.onNext(t2);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f107649c, interfaceC8487b)) {
                this.f107649c = interfaceC8487b;
                this.f107647a.onSubscribe(this);
            }
        }
    }

    public F0(io.reactivex.p pVar, qc.o oVar) {
        super(pVar);
        this.f107646b = oVar;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f107646b));
    }
}
