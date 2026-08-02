package com.facebook.imagepipeline.producers;

/* loaded from: classes2.dex */
public class n0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f30827a;

    public class a extends AbstractC3035t {
        public a(InterfaceC3030n interfaceC3030n) {
            super(interfaceC3030n);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3019c
        public void h(Object obj, int i10) {
            if (AbstractC3019c.d(i10)) {
                o().b(null, i10);
            }
        }
    }

    public n0(d0 d0Var) {
        this.f30827a = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        this.f30827a.b(new a(interfaceC3030n), e0Var);
    }
}
