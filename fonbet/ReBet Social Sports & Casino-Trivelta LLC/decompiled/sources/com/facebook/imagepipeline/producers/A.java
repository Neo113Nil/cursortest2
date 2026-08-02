package com.facebook.imagepipeline.producers;

import A7.C1025d;
import C7.InterfaceC1039c;
import com.facebook.imagepipeline.request.b;
import w6.InterfaceC6713d;

/* loaded from: classes2.dex */
public class A implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final D6.n f30599a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.k f30600b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f30601c;

    /* renamed from: d, reason: collision with root package name */
    public final C1025d f30602d;

    /* renamed from: e, reason: collision with root package name */
    public final C1025d f30603e;

    public static class a extends AbstractC3035t {

        /* renamed from: c, reason: collision with root package name */
        public final e0 f30604c;

        /* renamed from: d, reason: collision with root package name */
        public final D6.n f30605d;

        /* renamed from: e, reason: collision with root package name */
        public final A7.k f30606e;

        /* renamed from: f, reason: collision with root package name */
        public final C1025d f30607f;

        /* renamed from: g, reason: collision with root package name */
        public final C1025d f30608g;

        public a(InterfaceC3030n interfaceC3030n, e0 e0Var, D6.n nVar, A7.k kVar, C1025d c1025d, C1025d c1025d2) {
            super(interfaceC3030n);
            this.f30604c = e0Var;
            this.f30605d = nVar;
            this.f30606e = kVar;
            this.f30607f = c1025d;
            this.f30608g = c1025d2;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3019c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(H7.k kVar, int i10) {
            try {
                if (N7.b.d()) {
                    N7.b.a("EncodedProbeProducer#onNewResultImpl");
                }
                if (!AbstractC3019c.e(i10) && kVar != null && !AbstractC3019c.l(i10, 10) && kVar.A0() != u7.c.f66212d) {
                    com.facebook.imagepipeline.request.b D02 = this.f30604c.D0();
                    InterfaceC6713d d10 = this.f30606e.d(D02, this.f30604c.d());
                    this.f30607f.a(d10);
                    if ("memory_encoded".equals(this.f30604c.y1("origin"))) {
                        if (!this.f30608g.b(d10)) {
                            boolean z10 = D02.getCacheChoice() == b.EnumC0484b.SMALL;
                            InterfaceC1039c interfaceC1039c = (InterfaceC1039c) this.f30605d.get();
                            (z10 ? interfaceC1039c.a() : interfaceC1039c.b()).f(d10);
                            this.f30608g.a(d10);
                        }
                    } else if ("disk".equals(this.f30604c.y1("origin"))) {
                        this.f30608g.a(d10);
                    }
                    o().b(kVar, i10);
                    if (N7.b.d()) {
                        N7.b.b();
                        return;
                    }
                    return;
                }
                o().b(kVar, i10);
                if (N7.b.d()) {
                    N7.b.b();
                }
            } catch (Throwable th2) {
                if (N7.b.d()) {
                    N7.b.b();
                }
                throw th2;
            }
        }
    }

    public A(D6.n nVar, A7.k kVar, C1025d c1025d, C1025d c1025d2, d0 d0Var) {
        this.f30599a = nVar;
        this.f30600b = kVar;
        this.f30602d = c1025d;
        this.f30603e = c1025d2;
        this.f30601c = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        try {
            if (N7.b.d()) {
                N7.b.a("EncodedProbeProducer#produceResults");
            }
            g0 z02 = e0Var.z0();
            z02.d(e0Var, c());
            a aVar = new a(interfaceC3030n, e0Var, this.f30599a, this.f30600b, this.f30602d, this.f30603e);
            z02.j(e0Var, "EncodedProbeProducer", null);
            if (N7.b.d()) {
                N7.b.a("mInputProducer.produceResult");
            }
            this.f30601c.b(aVar, e0Var);
            if (N7.b.d()) {
                N7.b.b();
            }
            if (N7.b.d()) {
                N7.b.b();
            }
        } finally {
        }
    }

    public String c() {
        return "EncodedProbeProducer";
    }
}
