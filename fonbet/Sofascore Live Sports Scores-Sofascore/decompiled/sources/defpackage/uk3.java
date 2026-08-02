package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uk3 extends vk3 {
    public final b5g e;
    public final b5g f;
    public final float[] g;

    public uk3(b5g b5gVar, b5g b5gVar2) {
        super(b5gVar2, b5gVar, b5gVar2, null);
        float[] F;
        this.e = b5gVar;
        this.f = b5gVar2;
        float[] fArr = (float[]) de0.e.b;
        u5l u5lVar = b5gVar.d;
        float[] fArr2 = b5gVar.i;
        u5l u5lVar2 = b5gVar2.d;
        float[] fArr3 = b5gVar2.j;
        if (pd0.l(u5lVar, u5lVar2)) {
            F = pd0.F(fArr3, fArr2);
        } else {
            float[] a = u5lVar.a();
            float[] a2 = u5lVar2.a();
            u5l u5lVar3 = xw3.f;
            F = pd0.F(pd0.l(u5lVar2, u5lVar3) ? fArr3 : pd0.A(pd0.F(pd0.k(fArr, a2, new float[]{0.964212f, 1.0f, 0.825188f}), b5gVar2.i)), pd0.l(u5lVar, u5lVar3) ? fArr2 : pd0.F(pd0.k(fArr, a, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = F;
    }

    @Override // defpackage.vk3
    public final long a(long j) {
        float h = r13.h(j);
        float g = r13.g(j);
        float e = r13.e(j);
        float d = r13.d(j);
        x4g x4gVar = this.e.p;
        float h2 = (float) x4gVar.h(h);
        float h3 = (float) x4gVar.h(g);
        float h4 = (float) x4gVar.h(e);
        float[] fArr = this.g;
        float f = (fArr[6] * h4) + (fArr[3] * h3) + (fArr[0] * h2);
        float f2 = (fArr[7] * h4) + (fArr[4] * h3) + (fArr[1] * h2);
        float f3 = (fArr[8] * h4) + (fArr[5] * h3) + (fArr[2] * h2);
        b5g b5gVar = this.f;
        x4g x4gVar2 = b5gVar.m;
        return hkg.a((float) x4gVar2.h(f), (float) x4gVar2.h(f2), (float) x4gVar2.h(f3), d, b5gVar);
    }
}
