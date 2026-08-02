package com.facebook.imagepipeline.producers;

import java.util.Map;
import java.util.concurrent.Executor;
import z7.AbstractC6940d;

/* loaded from: classes2.dex */
public class b0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f30741a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC6940d f30742b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f30743c;

    public class a extends AbstractC3035t {

        /* renamed from: c, reason: collision with root package name */
        public final g0 f30744c;

        /* renamed from: d, reason: collision with root package name */
        public final e0 f30745d;

        /* renamed from: e, reason: collision with root package name */
        public final com.facebook.imagepipeline.request.d f30746e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f30747f;

        /* renamed from: g, reason: collision with root package name */
        public H6.a f30748g;

        /* renamed from: h, reason: collision with root package name */
        public int f30749h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f30750i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f30751j;

        /* renamed from: com.facebook.imagepipeline.producers.b0$a$a, reason: collision with other inner class name */
        public class C0481a extends AbstractC3022f {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b0 f30753a;

            public C0481a(b0 b0Var) {
                this.f30753a = b0Var;
            }

            @Override // com.facebook.imagepipeline.producers.f0
            public void b() {
                a.this.B();
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                H6.a aVar;
                int i10;
                synchronized (a.this) {
                    aVar = a.this.f30748g;
                    i10 = a.this.f30749h;
                    a.this.f30748g = null;
                    a.this.f30750i = false;
                }
                if (H6.a.isValid(aVar)) {
                    try {
                        a.this.y(aVar, i10);
                    } finally {
                        H6.a.U(aVar);
                    }
                }
                a.this.w();
            }
        }

        public a(InterfaceC3030n interfaceC3030n, g0 g0Var, com.facebook.imagepipeline.request.d dVar, e0 e0Var) {
            super(interfaceC3030n);
            this.f30748g = null;
            this.f30749h = 0;
            this.f30750i = false;
            this.f30751j = false;
            this.f30744c = g0Var;
            this.f30746e = dVar;
            this.f30745d = e0Var;
            e0Var.k(new C0481a(b0.this));
        }

        private boolean x() {
            synchronized (this) {
                try {
                    if (this.f30747f) {
                        return false;
                    }
                    H6.a aVar = this.f30748g;
                    this.f30748g = null;
                    this.f30747f = true;
                    H6.a.U(aVar);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final synchronized boolean A() {
            return this.f30747f;
        }

        public final void B() {
            if (x()) {
                o().a();
            }
        }

        public final void C(Throwable th2) {
            if (x()) {
                o().onFailure(th2);
            }
        }

        public final void D(H6.a aVar, int i10) {
            boolean d10 = AbstractC3019c.d(i10);
            if ((d10 || A()) && !(d10 && x())) {
                return;
            }
            o().b(aVar, i10);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3019c
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public void h(H6.a aVar, int i10) {
            if (H6.a.isValid(aVar)) {
                J(aVar, i10);
            } else if (AbstractC3019c.d(i10)) {
                D(null, i10);
            }
        }

        public final H6.a F(H7.e eVar) {
            H7.f fVar = (H7.f) eVar;
            H6.a process = this.f30746e.process(fVar.A1(), b0.this.f30742b);
            try {
                H7.f S02 = H7.f.S0(process, eVar.t1(), fVar.Y0(), fVar.K0());
                S02.m1(fVar.getExtras());
                return H6.a.D0(S02);
            } finally {
                H6.a.U(process);
            }
        }

        public final synchronized boolean G() {
            if (this.f30747f || !this.f30750i || this.f30751j || !H6.a.isValid(this.f30748g)) {
                return false;
            }
            this.f30751j = true;
            return true;
        }

        public final boolean H(H7.e eVar) {
            return eVar instanceof H7.f;
        }

        public final void I() {
            b0.this.f30743c.execute(new b());
        }

        public final void J(H6.a aVar, int i10) {
            synchronized (this) {
                try {
                    if (this.f30747f) {
                        return;
                    }
                    H6.a aVar2 = this.f30748g;
                    this.f30748g = H6.a.B(aVar);
                    this.f30749h = i10;
                    this.f30750i = true;
                    boolean G10 = G();
                    H6.a.U(aVar2);
                    if (G10) {
                        I();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3035t, com.facebook.imagepipeline.producers.AbstractC3019c
        public void f() {
            B();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3035t, com.facebook.imagepipeline.producers.AbstractC3019c
        public void g(Throwable th2) {
            C(th2);
        }

        public final void w() {
            boolean G10;
            synchronized (this) {
                this.f30751j = false;
                G10 = G();
            }
            if (G10) {
                I();
            }
        }

        public final void y(H6.a aVar, int i10) {
            D6.k.b(Boolean.valueOf(H6.a.isValid(aVar)));
            if (!H((H7.e) aVar.z0())) {
                D(aVar, i10);
                return;
            }
            this.f30744c.d(this.f30745d, "PostprocessorProducer");
            try {
                try {
                    H6.a F10 = F((H7.e) aVar.z0());
                    g0 g0Var = this.f30744c;
                    e0 e0Var = this.f30745d;
                    g0Var.j(e0Var, "PostprocessorProducer", z(g0Var, e0Var, this.f30746e));
                    D(F10, i10);
                    H6.a.U(F10);
                } catch (Exception e10) {
                    g0 g0Var2 = this.f30744c;
                    e0 e0Var2 = this.f30745d;
                    g0Var2.k(e0Var2, "PostprocessorProducer", e10, z(g0Var2, e0Var2, this.f30746e));
                    C(e10);
                    H6.a.U(null);
                }
            } catch (Throwable th2) {
                H6.a.U(null);
                throw th2;
            }
        }

        public final Map z(g0 g0Var, e0 e0Var, com.facebook.imagepipeline.request.d dVar) {
            if (g0Var.f(e0Var, "PostprocessorProducer")) {
                return D6.g.of("Postprocessor", dVar.getName());
            }
            return null;
        }
    }

    public class b extends AbstractC3035t {
        @Override // com.facebook.imagepipeline.producers.AbstractC3019c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(H6.a aVar, int i10) {
            if (AbstractC3019c.e(i10)) {
                return;
            }
            o().b(aVar, i10);
        }

        public b(a aVar) {
            super(aVar);
        }
    }

    public b0(d0 d0Var, AbstractC6940d abstractC6940d, Executor executor) {
        this.f30741a = (d0) D6.k.g(d0Var);
        this.f30742b = abstractC6940d;
        this.f30743c = (Executor) D6.k.g(executor);
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        g0 z02 = e0Var.z0();
        com.facebook.imagepipeline.request.d postprocessor = e0Var.D0().getPostprocessor();
        D6.k.g(postprocessor);
        this.f30741a.b(new b(new a(interfaceC3030n, z02, postprocessor, e0Var)), e0Var);
    }
}
