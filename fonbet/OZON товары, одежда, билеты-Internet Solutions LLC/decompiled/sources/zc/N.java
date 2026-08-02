package zc;

import Bl0.C2645f;
import Kc.C3493a;
import nc.InterfaceC8487b;
import oc.C8691a;
import qc.InterfaceC9019a;

/* loaded from: classes.dex */
public final class N<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final qc.g<? super T> f107869b;

    /* renamed from: c, reason: collision with root package name */
    final qc.g<? super Throwable> f107870c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC9019a f107871d;

    /* renamed from: e, reason: collision with root package name */
    final InterfaceC9019a f107872e;

    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f107873a;

        /* renamed from: b, reason: collision with root package name */
        final qc.g<? super T> f107874b;

        /* renamed from: c, reason: collision with root package name */
        final qc.g<? super Throwable> f107875c;

        /* renamed from: d, reason: collision with root package name */
        final InterfaceC9019a f107876d;

        /* renamed from: e, reason: collision with root package name */
        final InterfaceC9019a f107877e;

        /* renamed from: f, reason: collision with root package name */
        InterfaceC8487b f107878f;

        /* renamed from: g, reason: collision with root package name */
        boolean f107879g;

        a(io.reactivex.w<? super T> wVar, qc.g<? super T> gVar, qc.g<? super Throwable> gVar2, InterfaceC9019a interfaceC9019a, InterfaceC9019a interfaceC9019a2) {
            this.f107873a = wVar;
            this.f107874b = gVar;
            this.f107875c = gVar2;
            this.f107876d = interfaceC9019a;
            this.f107877e = interfaceC9019a2;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f107878f.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107878f.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f107879g) {
                return;
            }
            try {
                this.f107876d.run();
                this.f107879g = true;
                this.f107873a.onComplete();
                try {
                    this.f107877e.run();
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    C3493a.f(th2);
                }
            } catch (Throwable th3) {
                C2645f.c(th3);
                onError(th3);
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f107879g) {
                C3493a.f(th2);
                return;
            }
            this.f107879g = true;
            try {
                this.f107875c.accept(th2);
            } catch (Throwable th3) {
                C2645f.c(th3);
                th2 = new C8691a(th2, th3);
            }
            this.f107873a.onError(th2);
            try {
                this.f107877e.run();
            } catch (Throwable th4) {
                C2645f.c(th4);
                C3493a.f(th4);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f107879g) {
                return;
            }
            try {
                this.f107874b.accept(t2);
                this.f107873a.onNext(t2);
            } catch (Throwable th2) {
                C2645f.c(th2);
                this.f107878f.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f107878f, interfaceC8487b)) {
                this.f107878f = interfaceC8487b;
                this.f107873a.onSubscribe(this);
            }
        }
    }

    public N(io.reactivex.p pVar, qc.g gVar, qc.g gVar2, InterfaceC9019a interfaceC9019a, InterfaceC9019a interfaceC9019a2) {
        super(pVar);
        this.f107869b = gVar;
        this.f107870c = gVar2;
        this.f107871d = interfaceC9019a;
        this.f107872e = interfaceC9019a2;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f107869b, this.f107870c, this.f107871d, this.f107872e));
    }
}
