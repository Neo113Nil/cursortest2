package com.facebook.imagepipeline.producers;

import A7.C1025d;
import C7.InterfaceC1039c;
import com.facebook.imagepipeline.request.b;
import w6.InterfaceC6713d;

/* renamed from: com.facebook.imagepipeline.producers.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3027k implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final A7.x f30791a;

    /* renamed from: b, reason: collision with root package name */
    public final D6.n f30792b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.k f30793c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f30794d;

    /* renamed from: e, reason: collision with root package name */
    public final C1025d f30795e;

    /* renamed from: f, reason: collision with root package name */
    public final C1025d f30796f;

    /* renamed from: com.facebook.imagepipeline.producers.k$a */
    public static class a extends AbstractC3035t {

        /* renamed from: c, reason: collision with root package name */
        public final e0 f30797c;

        /* renamed from: d, reason: collision with root package name */
        public final A7.x f30798d;

        /* renamed from: e, reason: collision with root package name */
        public final D6.n f30799e;

        /* renamed from: f, reason: collision with root package name */
        public final A7.k f30800f;

        /* renamed from: g, reason: collision with root package name */
        public final C1025d f30801g;

        /* renamed from: h, reason: collision with root package name */
        public final C1025d f30802h;

        public a(InterfaceC3030n interfaceC3030n, e0 e0Var, A7.x xVar, D6.n nVar, A7.k kVar, C1025d c1025d, C1025d c1025d2) {
            super(interfaceC3030n);
            this.f30797c = e0Var;
            this.f30798d = xVar;
            this.f30799e = nVar;
            this.f30800f = kVar;
            this.f30801g = c1025d;
            this.f30802h = c1025d2;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3019c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(H6.a aVar, int i10) {
            try {
                if (N7.b.d()) {
                    N7.b.a("BitmapProbeProducer#onNewResultImpl");
                }
                if (!AbstractC3019c.e(i10) && aVar != null && !AbstractC3019c.l(i10, 8)) {
                    com.facebook.imagepipeline.request.b D02 = this.f30797c.D0();
                    InterfaceC6713d d10 = this.f30800f.d(D02, this.f30797c.d());
                    String str = (String) this.f30797c.y1("origin");
                    if (str != null && str.equals("memory_bitmap")) {
                        if (this.f30797c.r().G().E() && !this.f30801g.b(d10)) {
                            this.f30798d.b(d10);
                            this.f30801g.a(d10);
                        }
                        if (this.f30797c.r().G().C() && !this.f30802h.b(d10)) {
                            boolean z10 = D02.getCacheChoice() == b.EnumC0484b.SMALL;
                            InterfaceC1039c interfaceC1039c = (InterfaceC1039c) this.f30799e.get();
                            (z10 ? interfaceC1039c.a() : interfaceC1039c.b()).f(d10);
                            this.f30802h.a(d10);
                        }
                    }
                    o().b(aVar, i10);
                    if (N7.b.d()) {
                        N7.b.b();
                        return;
                    }
                    return;
                }
                o().b(aVar, i10);
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

    public C3027k(A7.x xVar, D6.n nVar, A7.k kVar, C1025d c1025d, C1025d c1025d2, d0 d0Var) {
        this.f30791a = xVar;
        this.f30792b = nVar;
        this.f30793c = kVar;
        this.f30795e = c1025d;
        this.f30796f = c1025d2;
        this.f30794d = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        try {
            if (N7.b.d()) {
                N7.b.a("BitmapProbeProducer#produceResults");
            }
            g0 z02 = e0Var.z0();
            z02.d(e0Var, c());
            a aVar = new a(interfaceC3030n, e0Var, this.f30791a, this.f30792b, this.f30793c, this.f30795e, this.f30796f);
            z02.j(e0Var, "BitmapProbeProducer", null);
            if (N7.b.d()) {
                N7.b.a("mInputProducer.produceResult");
            }
            this.f30794d.b(aVar, e0Var);
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
        return "BitmapProbeProducer";
    }
}
