package wc;

import Ec.AbstractC2965a;
import tc.InterfaceC9799a;

/* renamed from: wc.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10492m<T, K> extends AbstractC10480a<T, T> {

    /* renamed from: d, reason: collision with root package name */
    final qc.o<? super T, K> f103983d;

    /* renamed from: e, reason: collision with root package name */
    final qc.d<? super K, ? super K> f103984e;

    /* renamed from: wc.m$a */
    /* loaded from: classes9.dex */
    static final class a<T, K> extends AbstractC2965a<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final qc.o<? super T, K> f103985f;

        /* renamed from: g, reason: collision with root package name */
        final qc.d<? super K, ? super K> f103986g;

        /* renamed from: h, reason: collision with root package name */
        K f103987h;

        /* renamed from: i, reason: collision with root package name */
        boolean f103988i;

        a(InterfaceC9799a<? super T> interfaceC9799a, qc.o<? super T, K> oVar, qc.d<? super K, ? super K> dVar) {
            super(interfaceC9799a);
            this.f103985f = oVar;
            this.f103986g = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // tc.InterfaceC9799a
        public final boolean g(T t2) {
            if (this.f7804d) {
                return false;
            }
            int i11 = this.f7805e;
            InterfaceC9799a<? super R> interfaceC9799a = this.f7801a;
            if (i11 != 0) {
                return interfaceC9799a.g(t2);
            }
            try {
                this.f103985f.apply(t2);
                if (this.f103988i) {
                    boolean a11 = this.f103986g.a(this.f103987h, t2);
                    this.f103987h = t2;
                    if (a11) {
                        return false;
                    }
                } else {
                    this.f103988i = true;
                    this.f103987h = t2;
                }
                interfaceC9799a.onNext(t2);
                return true;
            } catch (Throwable th2) {
                b(th2);
                return true;
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            if (g(t2)) {
                return;
            }
            this.f7802b.n(1L);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [K, T, java.lang.Object] */
        @Override // tc.InterfaceC9808j
        public final T poll() throws Exception {
            while (true) {
                T poll = this.f7803c.poll();
                if (poll == 0) {
                    return null;
                }
                this.f103985f.apply(poll);
                if (!this.f103988i) {
                    this.f103988i = true;
                    this.f103987h = poll;
                    return poll;
                }
                if (!this.f103986g.a(this.f103987h, poll)) {
                    this.f103987h = poll;
                    return poll;
                }
                this.f103987h = poll;
                if (this.f7805e != 1) {
                    this.f7802b.n(1L);
                }
            }
        }
    }

    /* renamed from: wc.m$b */
    static final class b<T, K> extends Ec.b<T, T> implements InterfaceC9799a<T> {

        /* renamed from: f, reason: collision with root package name */
        final qc.o<? super T, K> f103989f;

        /* renamed from: g, reason: collision with root package name */
        final qc.d<? super K, ? super K> f103990g;

        /* renamed from: h, reason: collision with root package name */
        K f103991h;

        /* renamed from: i, reason: collision with root package name */
        boolean f103992i;

        b(io.reactivex.j jVar, qc.o oVar, qc.d dVar) {
            super(jVar);
            this.f103989f = oVar;
            this.f103990g = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // tc.InterfaceC9799a
        public final boolean g(T t2) {
            if (this.f7809d) {
                return false;
            }
            int i11 = this.f7810e;
            io.reactivex.j jVar = this.f7806a;
            if (i11 != 0) {
                jVar.onNext(t2);
                return true;
            }
            try {
                this.f103989f.apply(t2);
                if (this.f103992i) {
                    boolean a11 = this.f103990g.a(this.f103991h, t2);
                    this.f103991h = t2;
                    if (a11) {
                        return false;
                    }
                } else {
                    this.f103992i = true;
                    this.f103991h = t2;
                }
                jVar.onNext(t2);
                return true;
            } catch (Throwable th2) {
                b(th2);
                return true;
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            if (g(t2)) {
                return;
            }
            this.f7807b.n(1L);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [K, T, java.lang.Object] */
        @Override // tc.InterfaceC9808j
        public final T poll() throws Exception {
            while (true) {
                T poll = this.f7808c.poll();
                if (poll == 0) {
                    return null;
                }
                this.f103989f.apply(poll);
                if (!this.f103992i) {
                    this.f103992i = true;
                    this.f103991h = poll;
                    return poll;
                }
                if (!this.f103990g.a(this.f103991h, poll)) {
                    this.f103991h = poll;
                    return poll;
                }
                this.f103991h = poll;
                if (this.f7810e != 1) {
                    this.f7807b.n(1L);
                }
            }
        }
    }

    public C10492m(io.reactivex.h<T> hVar, qc.o<? super T, K> oVar, qc.d<? super K, ? super K> dVar) {
        super(hVar);
        this.f103983d = oVar;
        this.f103984e = dVar;
    }

    @Override // io.reactivex.h
    protected final void j(io.reactivex.j jVar) {
        boolean z11 = jVar instanceof InterfaceC9799a;
        qc.d<? super K, ? super K> dVar = this.f103984e;
        qc.o<? super T, K> oVar = this.f103983d;
        io.reactivex.h<T> hVar = this.f103914c;
        if (z11) {
            hVar.i(new a((InterfaceC9799a) jVar, oVar, dVar));
        } else {
            hVar.i(new b(jVar, oVar, dVar));
        }
    }
}
