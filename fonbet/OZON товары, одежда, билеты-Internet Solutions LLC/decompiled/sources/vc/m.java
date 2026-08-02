package vc;

import Bl0.C2645f;
import io.reactivex.AbstractC7094b;
import nc.InterfaceC8487b;
import oc.C8691a;

/* loaded from: classes9.dex */
public final class m extends AbstractC7094b {

    /* renamed from: a, reason: collision with root package name */
    final AbstractC7094b f102788a;

    /* renamed from: b, reason: collision with root package name */
    final qc.q<? super Throwable> f102789b;

    final class a implements io.reactivex.d {

        /* renamed from: a, reason: collision with root package name */
        private final io.reactivex.d f102790a;

        a(io.reactivex.d dVar) {
            this.f102790a = dVar;
        }

        @Override // io.reactivex.d
        public final void onComplete() {
            this.f102790a.onComplete();
        }

        @Override // io.reactivex.d
        public final void onError(Throwable th2) {
            io.reactivex.d dVar = this.f102790a;
            try {
                m.this.f102789b.test(th2);
                dVar.onComplete();
            } catch (Throwable th3) {
                C2645f.c(th3);
                dVar.onError(new C8691a(th2, th3));
            }
        }

        @Override // io.reactivex.d
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            this.f102790a.onSubscribe(interfaceC8487b);
        }
    }

    public m(AbstractC7094b abstractC7094b, qc.q qVar) {
        this.f102788a = abstractC7094b;
        this.f102789b = qVar;
    }

    @Override // io.reactivex.AbstractC7094b
    protected final void j(io.reactivex.d dVar) {
        this.f102788a.a(new a(dVar));
    }
}
