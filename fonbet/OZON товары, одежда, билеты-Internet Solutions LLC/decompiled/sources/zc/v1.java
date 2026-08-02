package zc;

import Bl0.C2645f;
import Kc.C3493a;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class v1<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final qc.q<? super T> f108705b;

    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108706a;

        /* renamed from: b, reason: collision with root package name */
        final qc.q<? super T> f108707b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f108708c;

        /* renamed from: d, reason: collision with root package name */
        boolean f108709d;

        a(io.reactivex.w<? super T> wVar, qc.q<? super T> qVar) {
            this.f108706a = wVar;
            this.f108707b = qVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108708c.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108708c.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f108709d) {
                return;
            }
            this.f108709d = true;
            this.f108706a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f108709d) {
                C3493a.f(th2);
            } else {
                this.f108709d = true;
                this.f108706a.onError(th2);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f108709d) {
                return;
            }
            try {
                boolean test = this.f108707b.test(t2);
                io.reactivex.w<? super T> wVar = this.f108706a;
                if (test) {
                    wVar.onNext(t2);
                    return;
                }
                this.f108709d = true;
                this.f108708c.dispose();
                wVar.onComplete();
            } catch (Throwable th2) {
                C2645f.c(th2);
                this.f108708c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108708c, interfaceC8487b)) {
                this.f108708c = interfaceC8487b;
                this.f108706a.onSubscribe(this);
            }
        }
    }

    public v1(io.reactivex.p pVar, qc.q qVar) {
        super(pVar);
        this.f108705b = qVar;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f108705b));
    }
}
