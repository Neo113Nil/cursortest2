package zc;

import Bl0.C2645f;
import Kc.C3493a;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class u1<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final qc.q<? super T> f108682b;

    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108683a;

        /* renamed from: b, reason: collision with root package name */
        final qc.q<? super T> f108684b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f108685c;

        /* renamed from: d, reason: collision with root package name */
        boolean f108686d;

        a(io.reactivex.w<? super T> wVar, qc.q<? super T> qVar) {
            this.f108683a = wVar;
            this.f108684b = qVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108685c.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108685c.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f108686d) {
                return;
            }
            this.f108686d = true;
            this.f108683a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f108686d) {
                C3493a.f(th2);
            } else {
                this.f108686d = true;
                this.f108683a.onError(th2);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f108686d) {
                return;
            }
            io.reactivex.w<? super T> wVar = this.f108683a;
            wVar.onNext(t2);
            try {
                if (this.f108684b.test(t2)) {
                    this.f108686d = true;
                    this.f108685c.dispose();
                    wVar.onComplete();
                }
            } catch (Throwable th2) {
                C2645f.c(th2);
                this.f108685c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108685c, interfaceC8487b)) {
                this.f108685c = interfaceC8487b;
                this.f108683a.onSubscribe(this);
            }
        }
    }

    public u1(io.reactivex.p pVar, qc.q qVar) {
        super(pVar);
        this.f108682b = qVar;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f108682b));
    }
}
