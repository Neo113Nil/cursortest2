package zc;

import Bl0.C2645f;
import nc.InterfaceC8487b;

/* renamed from: zc.l1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11054l1<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final qc.q<? super T> f108387b;

    /* renamed from: zc.l1$a */
    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108388a;

        /* renamed from: b, reason: collision with root package name */
        final qc.q<? super T> f108389b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f108390c;

        /* renamed from: d, reason: collision with root package name */
        boolean f108391d;

        a(io.reactivex.w<? super T> wVar, qc.q<? super T> qVar) {
            this.f108388a = wVar;
            this.f108389b = qVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108390c.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108390c.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108388a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108388a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            boolean z11 = this.f108391d;
            io.reactivex.w<? super T> wVar = this.f108388a;
            if (z11) {
                wVar.onNext(t2);
                return;
            }
            try {
                if (this.f108389b.test(t2)) {
                    return;
                }
                this.f108391d = true;
                wVar.onNext(t2);
            } catch (Throwable th2) {
                C2645f.c(th2);
                this.f108390c.dispose();
                wVar.onError(th2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108390c, interfaceC8487b)) {
                this.f108390c = interfaceC8487b;
                this.f108388a.onSubscribe(this);
            }
        }
    }

    public C11054l1(io.reactivex.p pVar, qc.q qVar) {
        super(pVar);
        this.f108387b = qVar;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f108387b));
    }
}
