package com.facebook.imagepipeline.producers;

import com.facebook.hermes.intl.Constants;
import com.facebook.imagepipeline.request.b;
import w6.InterfaceC6713d;

/* renamed from: com.facebook.imagepipeline.producers.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3041z implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final A7.x f30907a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.k f30908b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f30909c;

    /* renamed from: com.facebook.imagepipeline.producers.z$a */
    public static class a extends AbstractC3035t {

        /* renamed from: c, reason: collision with root package name */
        public final A7.x f30910c;

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC6713d f30911d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f30912e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f30913f;

        public a(InterfaceC3030n interfaceC3030n, A7.x xVar, InterfaceC6713d interfaceC6713d, boolean z10, boolean z11) {
            super(interfaceC3030n);
            this.f30910c = xVar;
            this.f30911d = interfaceC6713d;
            this.f30912e = z10;
            this.f30913f = z11;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3019c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(H7.k kVar, int i10) {
            try {
                if (N7.b.d()) {
                    N7.b.a("EncodedMemoryCacheProducer#onNewResultImpl");
                }
                if (!AbstractC3019c.e(i10) && kVar != null && !AbstractC3019c.l(i10, 10) && kVar.A0() != u7.c.f66212d) {
                    H6.a J10 = kVar.J();
                    if (J10 != null) {
                        try {
                            H6.a a10 = (this.f30913f && this.f30912e) ? this.f30910c.a(this.f30911d, J10) : null;
                            if (a10 != null) {
                                try {
                                    H7.k kVar2 = new H7.k(a10);
                                    kVar2.B(kVar);
                                    try {
                                        o().c(1.0f);
                                        o().b(kVar2, i10);
                                        if (N7.b.d()) {
                                            N7.b.b();
                                            return;
                                        }
                                        return;
                                    } finally {
                                        H7.k.r(kVar2);
                                    }
                                } finally {
                                    H6.a.U(a10);
                                }
                            }
                        } finally {
                            H6.a.U(J10);
                        }
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

    public C3041z(A7.x xVar, A7.k kVar, d0 d0Var) {
        this.f30907a = xVar;
        this.f30908b = kVar;
        this.f30909c = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        try {
            if (N7.b.d()) {
                N7.b.a("EncodedMemoryCacheProducer#produceResults");
            }
            g0 z02 = e0Var.z0();
            z02.d(e0Var, "EncodedMemoryCacheProducer");
            InterfaceC6713d d10 = this.f30908b.d(e0Var.D0(), e0Var.d());
            H6.a aVar = e0Var.D0().isCacheEnabled(4) ? this.f30907a.get(d10) : null;
            try {
                if (aVar != null) {
                    H7.k kVar = new H7.k(aVar);
                    try {
                        z02.j(e0Var, "EncodedMemoryCacheProducer", z02.f(e0Var, "EncodedMemoryCacheProducer") ? D6.g.of("cached_value_found", "true") : null);
                        z02.b(e0Var, "EncodedMemoryCacheProducer", true);
                        e0Var.w0("memory_encoded");
                        interfaceC3030n.c(1.0f);
                        interfaceC3030n.b(kVar, 1);
                        H7.k.r(kVar);
                        H6.a.U(aVar);
                        if (N7.b.d()) {
                            N7.b.b();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        H7.k.r(kVar);
                        throw th2;
                    }
                }
                if (e0Var.T1().b() < b.c.ENCODED_MEMORY_CACHE.b()) {
                    a aVar2 = new a(interfaceC3030n, this.f30907a, d10, e0Var.D0().isCacheEnabled(8), e0Var.r().G().D());
                    z02.j(e0Var, "EncodedMemoryCacheProducer", z02.f(e0Var, "EncodedMemoryCacheProducer") ? D6.g.of("cached_value_found", Constants.CASEFIRST_FALSE) : null);
                    this.f30909c.b(aVar2, e0Var);
                    H6.a.U(aVar);
                    if (N7.b.d()) {
                        N7.b.b();
                        return;
                    }
                    return;
                }
                z02.j(e0Var, "EncodedMemoryCacheProducer", z02.f(e0Var, "EncodedMemoryCacheProducer") ? D6.g.of("cached_value_found", Constants.CASEFIRST_FALSE) : null);
                z02.b(e0Var, "EncodedMemoryCacheProducer", false);
                e0Var.B("memory_encoded", "nil-result");
                interfaceC3030n.b(null, 1);
                H6.a.U(aVar);
                if (N7.b.d()) {
                    N7.b.b();
                }
            } catch (Throwable th3) {
                H6.a.U(aVar);
                throw th3;
            }
        } finally {
        }
    }
}
