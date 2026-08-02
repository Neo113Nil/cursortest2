package xc;

import Bl0.C2645f;
import Kc.C3493a;
import nc.InterfaceC8487b;
import oc.C8691a;
import qc.InterfaceC9019a;
import sc.C9653a;

/* loaded from: classes.dex */
public final class m<T> extends AbstractC10698a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final qc.g<? super InterfaceC8487b> f105304b;

    /* renamed from: c, reason: collision with root package name */
    final qc.g<? super T> f105305c;

    /* renamed from: d, reason: collision with root package name */
    final qc.g<? super Throwable> f105306d;

    /* renamed from: e, reason: collision with root package name */
    final InterfaceC9019a f105307e;

    /* renamed from: f, reason: collision with root package name */
    final InterfaceC9019a f105308f;

    /* renamed from: g, reason: collision with root package name */
    final InterfaceC9019a f105309g;

    static final class a<T> implements io.reactivex.m<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.m<? super T> f105310a;

        /* renamed from: b, reason: collision with root package name */
        final m<T> f105311b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f105312c;

        a(io.reactivex.m<? super T> mVar, m<T> mVar2) {
            this.f105310a = mVar;
            this.f105311b = mVar2;
        }

        final void a() {
            try {
                this.f105311b.f105308f.run();
            } catch (Throwable th2) {
                C2645f.c(th2);
                C3493a.f(th2);
            }
        }

        final void b(Throwable th2) {
            try {
                this.f105311b.f105306d.accept(th2);
            } catch (Throwable th3) {
                C2645f.c(th3);
                th2 = new C8691a(th2, th3);
            }
            this.f105312c = rc.d.DISPOSED;
            this.f105310a.onError(th2);
            a();
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            try {
                this.f105311b.f105309g.run();
            } catch (Throwable th2) {
                C2645f.c(th2);
                C3493a.f(th2);
            }
            this.f105312c.dispose();
            this.f105312c = rc.d.DISPOSED;
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f105312c.isDisposed();
        }

        @Override // io.reactivex.m
        public final void onComplete() {
            InterfaceC8487b interfaceC8487b = this.f105312c;
            rc.d dVar = rc.d.DISPOSED;
            if (interfaceC8487b == dVar) {
                return;
            }
            try {
                this.f105311b.f105307e.getClass();
                this.f105312c = dVar;
                this.f105310a.onComplete();
                a();
            } catch (Throwable th2) {
                C2645f.c(th2);
                b(th2);
            }
        }

        @Override // io.reactivex.m
        public final void onError(Throwable th2) {
            if (this.f105312c == rc.d.DISPOSED) {
                C3493a.f(th2);
            } else {
                b(th2);
            }
        }

        @Override // io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            io.reactivex.m<? super T> mVar = this.f105310a;
            if (rc.d.g(this.f105312c, interfaceC8487b)) {
                try {
                    this.f105311b.f105304b.accept(interfaceC8487b);
                    this.f105312c = interfaceC8487b;
                    mVar.onSubscribe(this);
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    interfaceC8487b.dispose();
                    this.f105312c = rc.d.DISPOSED;
                    mVar.onSubscribe(rc.e.INSTANCE);
                    mVar.onError(th2);
                }
            }
        }

        @Override // io.reactivex.m, io.reactivex.A
        public final void onSuccess(T t2) {
            InterfaceC8487b interfaceC8487b = this.f105312c;
            rc.d dVar = rc.d.DISPOSED;
            if (interfaceC8487b == dVar) {
                return;
            }
            try {
                this.f105311b.f105305c.accept(t2);
                this.f105312c = dVar;
                this.f105310a.onSuccess(t2);
                a();
            } catch (Throwable th2) {
                C2645f.c(th2);
                b(th2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(io.reactivex.k kVar, qc.g gVar, qc.g gVar2, qc.g gVar3) {
        super(kVar);
        InterfaceC9019a interfaceC9019a = C9653a.f98523c;
        this.f105304b = gVar;
        this.f105305c = gVar2;
        this.f105306d = gVar3;
        this.f105307e = interfaceC9019a;
        this.f105308f = interfaceC9019a;
        this.f105309g = interfaceC9019a;
    }

    @Override // io.reactivex.k
    protected final void d(io.reactivex.m<? super T> mVar) {
        this.f105265a.a(new a(mVar, this));
    }
}
