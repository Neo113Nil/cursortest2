package com.facebook.imagepipeline.producers;

import C7.InterfaceC1039c;
import com.facebook.imagepipeline.producers.C3036u;
import com.facebook.imagepipeline.request.b;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import w6.InterfaceC6713d;

/* renamed from: com.facebook.imagepipeline.producers.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3037v implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final D6.n f30890a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.k f30891b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f30892c;

    /* renamed from: com.facebook.imagepipeline.producers.v$a */
    public class a implements d3.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g0 f30893a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0 f30894b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3030n f30895c;

        public a(g0 g0Var, e0 e0Var, InterfaceC3030n interfaceC3030n) {
            this.f30893a = g0Var;
            this.f30894b = e0Var;
            this.f30895c = interfaceC3030n;
        }

        @Override // d3.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(d3.f fVar) {
            if (C3037v.f(fVar)) {
                this.f30893a.c(this.f30894b, "DiskCacheProducer", null);
                this.f30895c.a();
            } else if (fVar.n()) {
                this.f30893a.k(this.f30894b, "DiskCacheProducer", fVar.i(), null);
                C3037v.this.f30892c.b(this.f30895c, this.f30894b);
            } else {
                H7.k kVar = (H7.k) fVar.j();
                if (kVar != null) {
                    g0 g0Var = this.f30893a;
                    e0 e0Var = this.f30894b;
                    g0Var.j(e0Var, "DiskCacheProducer", C3037v.e(g0Var, e0Var, true, kVar.y1()));
                    this.f30893a.b(this.f30894b, "DiskCacheProducer", true);
                    this.f30894b.w0("disk");
                    this.f30895c.c(1.0f);
                    this.f30895c.b(kVar, 1);
                    kVar.close();
                } else {
                    g0 g0Var2 = this.f30893a;
                    e0 e0Var2 = this.f30894b;
                    g0Var2.j(e0Var2, "DiskCacheProducer", C3037v.e(g0Var2, e0Var2, false, 0));
                    C3037v.this.f30892c.b(this.f30895c, this.f30894b);
                }
            }
            return null;
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.v$b */
    public class b extends AbstractC3022f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f30897a;

        public b(AtomicBoolean atomicBoolean) {
            this.f30897a = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void b() {
            this.f30897a.set(true);
        }
    }

    public C3037v(D6.n nVar, A7.k kVar, d0 d0Var) {
        this.f30890a = nVar;
        this.f30891b = kVar;
        this.f30892c = d0Var;
    }

    public static Map e(g0 g0Var, e0 e0Var, boolean z10, int i10) {
        if (g0Var.f(e0Var, "DiskCacheProducer")) {
            return z10 ? D6.g.of("cached_value_found", String.valueOf(z10), "encodedImageSize", String.valueOf(i10)) : D6.g.of("cached_value_found", String.valueOf(z10));
        }
        return null;
    }

    public static boolean f(d3.f fVar) {
        if (fVar.l()) {
            return true;
        }
        return fVar.n() && (fVar.i() instanceof CancellationException);
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        com.facebook.imagepipeline.request.b D02 = e0Var.D0();
        if (!e0Var.D0().isCacheEnabled(16)) {
            g(interfaceC3030n, e0Var);
            return;
        }
        e0Var.z0().d(e0Var, "DiskCacheProducer");
        InterfaceC6713d d10 = this.f30891b.d(D02, e0Var.d());
        InterfaceC1039c interfaceC1039c = (InterfaceC1039c) this.f30890a.get();
        A7.j a10 = C3036u.a(D02, interfaceC1039c.a(), interfaceC1039c.b(), interfaceC1039c.c());
        if (a10 != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            a10.m(d10, atomicBoolean).e(h(interfaceC3030n, e0Var));
            i(atomicBoolean, e0Var);
        } else {
            e0Var.z0().k(e0Var, "DiskCacheProducer", new C3036u.a("Got no disk cache for CacheChoice: " + Integer.valueOf(D02.getCacheChoice().ordinal()).toString()), null);
            g(interfaceC3030n, e0Var);
        }
    }

    public final void g(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        if (e0Var.T1().b() < b.c.DISK_CACHE.b()) {
            this.f30892c.b(interfaceC3030n, e0Var);
        } else {
            e0Var.B("disk", "nil-result_read");
            interfaceC3030n.b(null, 1);
        }
    }

    public final d3.d h(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        return new a(e0Var.z0(), e0Var, interfaceC3030n);
    }

    public final void i(AtomicBoolean atomicBoolean, e0 e0Var) {
        e0Var.k(new b(atomicBoolean));
    }
}
