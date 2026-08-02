package zc;

import Bl0.C2645f;
import Kc.C3493a;
import nc.InterfaceC8487b;

/* renamed from: zc.i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11043i<T> extends AbstractC11019a<T, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final qc.q<? super T> f108271b;

    /* renamed from: zc.i$a */
    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super Boolean> f108272a;

        /* renamed from: b, reason: collision with root package name */
        final qc.q<? super T> f108273b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f108274c;

        /* renamed from: d, reason: collision with root package name */
        boolean f108275d;

        a(io.reactivex.w<? super Boolean> wVar, qc.q<? super T> qVar) {
            this.f108272a = wVar;
            this.f108273b = qVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108274c.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108274c.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f108275d) {
                return;
            }
            this.f108275d = true;
            Boolean bool = Boolean.FALSE;
            io.reactivex.w<? super Boolean> wVar = this.f108272a;
            wVar.onNext(bool);
            wVar.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f108275d) {
                C3493a.f(th2);
            } else {
                this.f108275d = true;
                this.f108272a.onError(th2);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f108275d) {
                return;
            }
            try {
                if (this.f108273b.test(t2)) {
                    this.f108275d = true;
                    this.f108274c.dispose();
                    Boolean bool = Boolean.TRUE;
                    io.reactivex.w<? super Boolean> wVar = this.f108272a;
                    wVar.onNext(bool);
                    wVar.onComplete();
                }
            } catch (Throwable th2) {
                C2645f.c(th2);
                this.f108274c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108274c, interfaceC8487b)) {
                this.f108274c = interfaceC8487b;
                this.f108272a.onSubscribe(this);
            }
        }
    }

    public C11043i(io.reactivex.p pVar, qc.q qVar) {
        super(pVar);
        this.f108271b = qVar;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super Boolean> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f108271b));
    }
}
