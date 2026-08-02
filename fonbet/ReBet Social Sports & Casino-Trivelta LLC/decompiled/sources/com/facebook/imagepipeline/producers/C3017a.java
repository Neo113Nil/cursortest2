package com.facebook.imagepipeline.producers;

/* renamed from: com.facebook.imagepipeline.producers.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3017a implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f30733a;

    /* renamed from: com.facebook.imagepipeline.producers.a$a, reason: collision with other inner class name */
    public static class C0480a extends AbstractC3035t {
        @Override // com.facebook.imagepipeline.producers.AbstractC3019c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(H7.k kVar, int i10) {
            if (kVar == null) {
                o().b(null, i10);
                return;
            }
            if (!H7.k.b2(kVar)) {
                kVar.c2();
            }
            o().b(kVar, i10);
        }

        public C0480a(InterfaceC3030n interfaceC3030n) {
            super(interfaceC3030n);
        }
    }

    public C3017a(d0 d0Var) {
        this.f30733a = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        this.f30733a.b(new C0480a(interfaceC3030n), e0Var);
    }
}
