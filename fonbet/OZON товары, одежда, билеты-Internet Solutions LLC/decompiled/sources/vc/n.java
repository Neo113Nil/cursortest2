package vc;

import Bl0.C2645f;
import Kc.C3493a;
import io.reactivex.AbstractC7094b;
import nc.InterfaceC8487b;
import oc.C8691a;
import qc.InterfaceC9019a;
import sc.C9653a;

/* loaded from: classes9.dex */
public final class n extends AbstractC7094b {

    /* renamed from: a, reason: collision with root package name */
    final AbstractC7094b f102792a;

    /* renamed from: b, reason: collision with root package name */
    final qc.g<? super InterfaceC8487b> f102793b;

    /* renamed from: c, reason: collision with root package name */
    final qc.g<? super Throwable> f102794c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC9019a f102795d;

    /* renamed from: e, reason: collision with root package name */
    final InterfaceC9019a f102796e;

    /* renamed from: f, reason: collision with root package name */
    final InterfaceC9019a f102797f;

    /* renamed from: g, reason: collision with root package name */
    final InterfaceC9019a f102798g;

    final class a implements io.reactivex.d, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.d f102799a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC8487b f102800b;

        a(io.reactivex.d dVar) {
            this.f102799a = dVar;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            try {
                n.this.f102798g.run();
            } catch (Throwable th2) {
                C2645f.c(th2);
                C3493a.f(th2);
            }
            this.f102800b.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f102800b.isDisposed();
        }

        @Override // io.reactivex.d
        public final void onComplete() {
            io.reactivex.d dVar = this.f102799a;
            n nVar = n.this;
            if (this.f102800b == rc.d.DISPOSED) {
                return;
            }
            try {
                nVar.f102795d.run();
                nVar.f102796e.run();
                dVar.onComplete();
                try {
                    nVar.f102797f.run();
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    C3493a.f(th2);
                }
            } catch (Throwable th3) {
                C2645f.c(th3);
                dVar.onError(th3);
            }
        }

        @Override // io.reactivex.d
        public final void onError(Throwable th2) {
            n nVar = n.this;
            if (this.f102800b == rc.d.DISPOSED) {
                C3493a.f(th2);
                return;
            }
            try {
                nVar.f102794c.accept(th2);
                nVar.f102796e.run();
            } catch (Throwable th3) {
                C2645f.c(th3);
                th2 = new C8691a(th2, th3);
            }
            this.f102799a.onError(th2);
            try {
                nVar.f102797f.run();
            } catch (Throwable th4) {
                C2645f.c(th4);
                C3493a.f(th4);
            }
        }

        @Override // io.reactivex.d
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            io.reactivex.d dVar = this.f102799a;
            try {
                n.this.f102793b.accept(interfaceC8487b);
                if (rc.d.g(this.f102800b, interfaceC8487b)) {
                    this.f102800b = interfaceC8487b;
                    dVar.onSubscribe(this);
                }
            } catch (Throwable th2) {
                C2645f.c(th2);
                interfaceC8487b.dispose();
                this.f102800b = rc.d.DISPOSED;
                dVar.onSubscribe(rc.e.INSTANCE);
                dVar.onError(th2);
            }
        }
    }

    public n(AbstractC7094b abstractC7094b, qc.g gVar, qc.g gVar2, InterfaceC9019a interfaceC9019a, InterfaceC9019a interfaceC9019a2) {
        InterfaceC9019a interfaceC9019a3 = C9653a.f98523c;
        this.f102792a = abstractC7094b;
        this.f102793b = gVar;
        this.f102794c = gVar2;
        this.f102795d = interfaceC9019a;
        this.f102796e = interfaceC9019a2;
        this.f102797f = interfaceC9019a3;
        this.f102798g = interfaceC9019a3;
    }

    @Override // io.reactivex.AbstractC7094b
    protected final void j(io.reactivex.d dVar) {
        this.f102792a.a(new a(dVar));
    }
}
