package com.facebook.imagepipeline.producers;

import com.facebook.hermes.intl.Constants;
import w6.InterfaceC6713d;

/* loaded from: classes2.dex */
public class a0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final A7.x f30734a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.k f30735b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f30736c;

    public static class a extends AbstractC3035t {

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC6713d f30737c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f30738d;

        /* renamed from: e, reason: collision with root package name */
        public final A7.x f30739e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f30740f;

        public a(InterfaceC3030n interfaceC3030n, InterfaceC6713d interfaceC6713d, boolean z10, A7.x xVar, boolean z11) {
            super(interfaceC3030n);
            this.f30737c = interfaceC6713d;
            this.f30738d = z10;
            this.f30739e = xVar;
            this.f30740f = z11;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3019c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(H6.a aVar, int i10) {
            if (aVar == null) {
                if (AbstractC3019c.d(i10)) {
                    o().b(null, i10);
                }
            } else if (!AbstractC3019c.e(i10) || this.f30738d) {
                H6.a a10 = this.f30740f ? this.f30739e.a(this.f30737c, aVar) : null;
                try {
                    o().c(1.0f);
                    InterfaceC3030n o10 = o();
                    if (a10 != null) {
                        aVar = a10;
                    }
                    o10.b(aVar, i10);
                } finally {
                    H6.a.U(a10);
                }
            }
        }
    }

    public a0(A7.x xVar, A7.k kVar, d0 d0Var) {
        this.f30734a = xVar;
        this.f30735b = kVar;
        this.f30736c = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        g0 z02 = e0Var.z0();
        com.facebook.imagepipeline.request.b D02 = e0Var.D0();
        Object d10 = e0Var.d();
        com.facebook.imagepipeline.request.d postprocessor = D02.getPostprocessor();
        if (postprocessor == null || postprocessor.getPostprocessorCacheKey() == null) {
            this.f30736c.b(interfaceC3030n, e0Var);
            return;
        }
        z02.d(e0Var, c());
        InterfaceC6713d c10 = this.f30735b.c(D02, d10);
        H6.a aVar = e0Var.D0().isCacheEnabled(1) ? this.f30734a.get(c10) : null;
        if (aVar == null) {
            a aVar2 = new a(interfaceC3030n, c10, false, this.f30734a, e0Var.D0().isCacheEnabled(2));
            z02.j(e0Var, c(), z02.f(e0Var, c()) ? D6.g.of("cached_value_found", Constants.CASEFIRST_FALSE) : null);
            this.f30736c.b(aVar2, e0Var);
        } else {
            z02.j(e0Var, c(), z02.f(e0Var, c()) ? D6.g.of("cached_value_found", "true") : null);
            z02.b(e0Var, "PostprocessedBitmapMemoryCacheProducer", true);
            e0Var.B("memory_bitmap", "postprocessed");
            interfaceC3030n.c(1.0f);
            interfaceC3030n.b(aVar, 1);
            aVar.close();
        }
    }

    public String c() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }
}
