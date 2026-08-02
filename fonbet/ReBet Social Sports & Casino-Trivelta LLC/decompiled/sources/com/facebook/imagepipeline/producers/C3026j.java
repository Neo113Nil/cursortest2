package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;

/* renamed from: com.facebook.imagepipeline.producers.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3026j implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f30783a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30784b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30785c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f30786d;

    /* renamed from: com.facebook.imagepipeline.producers.j$a */
    public static class a extends AbstractC3035t {

        /* renamed from: c, reason: collision with root package name */
        public final int f30787c;

        /* renamed from: d, reason: collision with root package name */
        public final int f30788d;

        public a(InterfaceC3030n interfaceC3030n, int i10, int i11) {
            super(interfaceC3030n);
            this.f30787c = i10;
            this.f30788d = i11;
        }

        public final void p(H6.a aVar) {
            H7.e eVar;
            Bitmap A12;
            int rowBytes;
            if (aVar == null || !aVar.isValid() || (eVar = (H7.e) aVar.z0()) == null || eVar.isClosed() || !(eVar instanceof H7.f) || (A12 = ((H7.f) eVar).A1()) == null || (rowBytes = A12.getRowBytes() * A12.getHeight()) < this.f30787c || rowBytes > this.f30788d) {
                return;
            }
            A12.prepareToDraw();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3019c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(H6.a aVar, int i10) {
            p(aVar);
            o().b(aVar, i10);
        }
    }

    public C3026j(d0 d0Var, int i10, int i11, boolean z10) {
        D6.k.b(Boolean.valueOf(i10 <= i11));
        this.f30783a = (d0) D6.k.g(d0Var);
        this.f30784b = i10;
        this.f30785c = i11;
        this.f30786d = z10;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        if (!e0Var.n1() || this.f30786d) {
            this.f30783a.b(new a(interfaceC3030n, this.f30784b, this.f30785c), e0Var);
        } else {
            this.f30783a.b(interfaceC3030n, e0Var);
        }
    }
}
