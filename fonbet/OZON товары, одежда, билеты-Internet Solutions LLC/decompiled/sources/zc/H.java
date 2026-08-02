package zc;

import Bl0.C2645f;
import Kc.C3493a;
import nc.InterfaceC8487b;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class H<T, R> extends AbstractC11019a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super T, ? extends io.reactivex.o<R>> f107697b;

    static final class a<T, R> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super R> f107698a;

        /* renamed from: b, reason: collision with root package name */
        final qc.o<? super T, ? extends io.reactivex.o<R>> f107699b;

        /* renamed from: c, reason: collision with root package name */
        boolean f107700c;

        /* renamed from: d, reason: collision with root package name */
        InterfaceC8487b f107701d;

        a(io.reactivex.w<? super R> wVar, qc.o<? super T, ? extends io.reactivex.o<R>> oVar) {
            this.f107698a = wVar;
            this.f107699b = oVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f107701d.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107701d.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f107700c) {
                return;
            }
            this.f107700c = true;
            this.f107698a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f107700c) {
                C3493a.f(th2);
            } else {
                this.f107700c = true;
                this.f107698a.onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f107700c) {
                if (t2 instanceof io.reactivex.o) {
                    io.reactivex.o oVar = (io.reactivex.o) t2;
                    if (oVar.g()) {
                        C3493a.f(oVar.d());
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                io.reactivex.o<R> apply = this.f107699b.apply(t2);
                C9656b.c(apply, "The selector returned a null Notification");
                io.reactivex.o<R> oVar2 = apply;
                if (oVar2.g()) {
                    this.f107701d.dispose();
                    onError(oVar2.d());
                } else if (!oVar2.f()) {
                    this.f107698a.onNext(oVar2.e());
                } else {
                    this.f107701d.dispose();
                    onComplete();
                }
            } catch (Throwable th2) {
                C2645f.c(th2);
                this.f107701d.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f107701d, interfaceC8487b)) {
                this.f107701d = interfaceC8487b;
                this.f107698a.onSubscribe(this);
            }
        }
    }

    public H(io.reactivex.p pVar, qc.o oVar) {
        super(pVar);
        this.f107697b = oVar;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super R> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f107697b));
    }
}
