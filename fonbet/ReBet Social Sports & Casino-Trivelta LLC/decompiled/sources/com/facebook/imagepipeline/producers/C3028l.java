package com.facebook.imagepipeline.producers;

/* renamed from: com.facebook.imagepipeline.producers.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3028l implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f30819a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f30820b;

    /* renamed from: com.facebook.imagepipeline.producers.l$a */
    public class a extends AbstractC3035t {

        /* renamed from: c, reason: collision with root package name */
        public e0 f30821c;

        @Override // com.facebook.imagepipeline.producers.AbstractC3035t, com.facebook.imagepipeline.producers.AbstractC3019c
        public void g(Throwable th2) {
            C3028l.this.f30820b.b(o(), this.f30821c);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3019c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(H7.k kVar, int i10) {
            com.facebook.imagepipeline.request.b D02 = this.f30821c.D0();
            boolean d10 = AbstractC3019c.d(i10);
            boolean c10 = v0.c(kVar, D02.getResizeOptions());
            if (kVar != null && (c10 || D02.getLocalThumbnailPreviewsEnabled())) {
                if (d10 && c10) {
                    o().b(kVar, i10);
                } else {
                    o().b(kVar, AbstractC3019c.n(i10, 1));
                }
            }
            if (!d10 || c10 || D02.getLoadThumbnailOnlyForAndroidSdkAboveQ()) {
                return;
            }
            H7.k.r(kVar);
            C3028l.this.f30820b.b(o(), this.f30821c);
        }

        public a(InterfaceC3030n interfaceC3030n, e0 e0Var) {
            super(interfaceC3030n);
            this.f30821c = e0Var;
        }
    }

    public C3028l(d0 d0Var, d0 d0Var2) {
        this.f30819a = d0Var;
        this.f30820b = d0Var2;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        this.f30819a.b(new a(interfaceC3030n, e0Var), e0Var);
    }
}
