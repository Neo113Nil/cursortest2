package com.facebook.imagepipeline.producers;

/* loaded from: classes2.dex */
public class t0 implements d0 {
    private final u0[] mThumbnailProducers;

    public class a extends AbstractC3035t {

        /* renamed from: c, reason: collision with root package name */
        public final e0 f30885c;

        /* renamed from: d, reason: collision with root package name */
        public final int f30886d;

        /* renamed from: e, reason: collision with root package name */
        public final B7.g f30887e;

        public a(InterfaceC3030n interfaceC3030n, e0 e0Var, int i10) {
            super(interfaceC3030n);
            this.f30885c = e0Var;
            this.f30886d = i10;
            this.f30887e = e0Var.D0().getResizeOptions();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3035t, com.facebook.imagepipeline.producers.AbstractC3019c
        public void g(Throwable th2) {
            if (t0.this.e(this.f30886d + 1, o(), this.f30885c)) {
                return;
            }
            o().onFailure(th2);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3019c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(H7.k kVar, int i10) {
            if (kVar != null && (AbstractC3019c.e(i10) || v0.c(kVar, this.f30887e))) {
                o().b(kVar, i10);
            } else if (AbstractC3019c.d(i10)) {
                H7.k.r(kVar);
                if (t0.this.e(this.f30886d + 1, o(), this.f30885c)) {
                    return;
                }
                o().b(null, 1);
            }
        }
    }

    public t0(u0... u0VarArr) {
        u0[] u0VarArr2 = (u0[]) D6.k.g(u0VarArr);
        this.mThumbnailProducers = u0VarArr2;
        D6.k.e(0, u0VarArr2.length);
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        if (e0Var.D0().getResizeOptions() == null) {
            interfaceC3030n.b(null, 1);
        } else {
            if (e(0, interfaceC3030n, e0Var)) {
                return;
            }
            interfaceC3030n.b(null, 1);
        }
    }

    public final int d(int i10, B7.g gVar) {
        while (true) {
            u0[] u0VarArr = this.mThumbnailProducers;
            if (i10 >= u0VarArr.length) {
                return -1;
            }
            if (u0VarArr[i10].a(gVar)) {
                return i10;
            }
            i10++;
        }
    }

    public final boolean e(int i10, InterfaceC3030n interfaceC3030n, e0 e0Var) {
        int d10 = d(i10, e0Var.D0().getResizeOptions());
        if (d10 == -1) {
            return false;
        }
        this.mThumbnailProducers[d10].b(new a(interfaceC3030n, e0Var, d10), e0Var);
        return true;
    }
}
