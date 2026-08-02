package com.facebook.imagepipeline.producers;

import C7.InterfaceC1039c;
import com.facebook.imagepipeline.producers.C3036u;
import com.facebook.imagepipeline.request.b;
import w6.InterfaceC6713d;

/* renamed from: com.facebook.imagepipeline.producers.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3038w implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final D6.n f30900a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.k f30901b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f30902c;

    /* renamed from: com.facebook.imagepipeline.producers.w$a */
    public static class a extends AbstractC3035t {

        /* renamed from: c, reason: collision with root package name */
        public final e0 f30903c;

        /* renamed from: d, reason: collision with root package name */
        public final D6.n f30904d;

        /* renamed from: e, reason: collision with root package name */
        public final A7.k f30905e;

        @Override // com.facebook.imagepipeline.producers.AbstractC3019c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(H7.k kVar, int i10) {
            this.f30903c.z0().d(this.f30903c, "DiskCacheWriteProducer");
            if (AbstractC3019c.e(i10) || kVar == null || AbstractC3019c.l(i10, 10) || kVar.A0() == u7.c.f66212d) {
                this.f30903c.z0().j(this.f30903c, "DiskCacheWriteProducer", null);
                o().b(kVar, i10);
                return;
            }
            com.facebook.imagepipeline.request.b D02 = this.f30903c.D0();
            InterfaceC6713d d10 = this.f30905e.d(D02, this.f30903c.d());
            InterfaceC1039c interfaceC1039c = (InterfaceC1039c) this.f30904d.get();
            A7.j a10 = C3036u.a(D02, interfaceC1039c.a(), interfaceC1039c.b(), interfaceC1039c.c());
            if (a10 != null) {
                a10.p(d10, kVar);
                this.f30903c.z0().j(this.f30903c, "DiskCacheWriteProducer", null);
                o().b(kVar, i10);
                return;
            }
            this.f30903c.z0().k(this.f30903c, "DiskCacheWriteProducer", new C3036u.a("Got no disk cache for CacheChoice: " + Integer.valueOf(D02.getCacheChoice().ordinal()).toString()), null);
            o().b(kVar, i10);
        }

        public a(InterfaceC3030n interfaceC3030n, e0 e0Var, D6.n nVar, A7.k kVar) {
            super(interfaceC3030n);
            this.f30903c = e0Var;
            this.f30904d = nVar;
            this.f30905e = kVar;
        }
    }

    public C3038w(D6.n nVar, A7.k kVar, d0 d0Var) {
        this.f30900a = nVar;
        this.f30901b = kVar;
        this.f30902c = d0Var;
    }

    private void c(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        e0 e0Var2;
        if (e0Var.T1().b() >= b.c.DISK_CACHE.b()) {
            e0Var.B("disk", "nil-result_write");
            interfaceC3030n.b(null, 1);
            return;
        }
        if (e0Var.D0().isCacheEnabled(32)) {
            e0Var2 = e0Var;
            interfaceC3030n = new a(interfaceC3030n, e0Var2, this.f30900a, this.f30901b);
        } else {
            e0Var2 = e0Var;
        }
        this.f30902c.b(interfaceC3030n, e0Var2);
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        c(interfaceC3030n, e0Var);
    }
}
