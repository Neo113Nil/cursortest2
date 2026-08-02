package m1;

import androidx.collection.C;
import m1.AbstractC8030a;
import m1.C8036g;
import org.jetbrains.annotations.NotNull;

/* renamed from: m1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8033d {
    public static AbstractC8032c a(AbstractC8032c abstractC8032c, r rVar) {
        AbstractC8030a.C1252a c1252a;
        long j11;
        c1252a = AbstractC8030a.f73928b;
        long f7 = abstractC8032c.f();
        j11 = C8031b.f73930a;
        if (C8031b.d(f7, j11)) {
            p pVar = (p) abstractC8032c;
            if (!c(pVar.A(), rVar)) {
                return new p(pVar, g(b(c1252a.b(), pVar.A().c(), rVar.c()), pVar.z()), rVar);
            }
        }
        return abstractC8032c;
    }

    @NotNull
    public static final float[] b(@NotNull float[] fArr, @NotNull float[] fArr2, @NotNull float[] fArr3) {
        h(fArr, fArr2);
        h(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] f7 = f(fArr);
        float f11 = fArr4[0];
        float f12 = fArr[0] * f11;
        float f13 = fArr4[1];
        float f14 = fArr[1] * f13;
        float f15 = fArr4[2];
        return g(f7, new float[]{f12, f14, fArr[2] * f15, fArr[3] * f11, fArr[4] * f13, fArr[5] * f15, f11 * fArr[6], f13 * fArr[7], f15 * fArr[8]});
    }

    public static final boolean c(@NotNull r rVar, @NotNull r rVar2) {
        if (rVar == rVar2) {
            return true;
        }
        return Math.abs(rVar.a() - rVar2.a()) < 0.001f && Math.abs(rVar.b() - rVar2.b()) < 0.001f;
    }

    public static C8036g d(AbstractC8032c abstractC8032c, AbstractC8032c abstractC8032c2) {
        int c11 = abstractC8032c.c();
        int c12 = abstractC8032c2.c();
        if ((c11 | c12) < 0) {
            return e(abstractC8032c, abstractC8032c2);
        }
        C<C8036g> a11 = C8037h.a();
        int i11 = c11 | (c12 << 6);
        C8036g c13 = a11.c(i11);
        if (c13 == null) {
            c13 = e(abstractC8032c, abstractC8032c2);
            a11.j(i11, c13);
        }
        return c13;
    }

    private static final C8036g e(AbstractC8032c abstractC8032c, AbstractC8032c abstractC8032c2) {
        long j11;
        long j12;
        if (abstractC8032c == abstractC8032c2) {
            return new C8035f(abstractC8032c, abstractC8032c, 1);
        }
        long f7 = abstractC8032c.f();
        j11 = C8031b.f73930a;
        if (C8031b.d(f7, j11)) {
            long f11 = abstractC8032c2.f();
            j12 = C8031b.f73930a;
            if (C8031b.d(f11, j12)) {
                return new C8036g.a((p) abstractC8032c, (p) abstractC8032c2);
            }
        }
        return new C8036g(abstractC8032c, abstractC8032c2, 0);
    }

    @NotNull
    public static final float[] f(@NotNull float[] fArr) {
        float f7 = fArr[0];
        float f11 = fArr[3];
        float f12 = fArr[6];
        float f13 = fArr[1];
        float f14 = fArr[4];
        float f15 = fArr[7];
        float f16 = fArr[2];
        float f17 = fArr[5];
        float f18 = fArr[8];
        float f19 = (f14 * f18) - (f15 * f17);
        float f21 = (f15 * f16) - (f13 * f18);
        float f22 = (f13 * f17) - (f14 * f16);
        float f23 = (f12 * f22) + (f11 * f21) + (f7 * f19);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f19 / f23;
        fArr2[1] = f21 / f23;
        fArr2[2] = f22 / f23;
        fArr2[3] = ((f12 * f17) - (f11 * f18)) / f23;
        fArr2[4] = ((f18 * f7) - (f12 * f16)) / f23;
        fArr2[5] = ((f16 * f11) - (f17 * f7)) / f23;
        fArr2[6] = ((f11 * f15) - (f12 * f14)) / f23;
        fArr2[7] = ((f12 * f13) - (f15 * f7)) / f23;
        fArr2[8] = ((f7 * f14) - (f11 * f13)) / f23;
        return fArr2;
    }

    @NotNull
    public static final float[] g(@NotNull float[] fArr, @NotNull float[] fArr2) {
        float f7 = fArr[0];
        float f11 = fArr2[0];
        float f12 = fArr[3];
        float f13 = fArr2[1];
        float f14 = fArr[6];
        float f15 = fArr2[2];
        float f16 = (f14 * f15) + (f12 * f13) + (f7 * f11);
        float f17 = fArr[1];
        float f18 = fArr[4];
        float f19 = fArr[7];
        float f21 = (f19 * f15) + (f18 * f13) + (f17 * f11);
        float f22 = fArr[2];
        float f23 = fArr[5];
        float f24 = fArr[8];
        float f25 = (f15 * f24) + (f13 * f23) + (f11 * f22);
        float f26 = fArr2[3];
        float f27 = fArr2[4];
        float f28 = fArr2[5];
        float f29 = (f14 * f28) + (f12 * f27) + (f7 * f26);
        float f31 = (f19 * f28) + (f18 * f27) + (f17 * f26);
        float f32 = (f28 * f24) + (f27 * f23) + (f26 * f22);
        float f33 = fArr2[6];
        float f34 = fArr2[7];
        float f35 = (f12 * f34) + (f7 * f33);
        float f36 = fArr2[8];
        return new float[]{f16, f21, f25, f29, f31, f32, (f14 * f36) + f35, (f19 * f36) + (f18 * f34) + (f17 * f33), (f24 * f36) + (f23 * f34) + (f22 * f33)};
    }

    @NotNull
    public static final void h(@NotNull float[] fArr, @NotNull float[] fArr2) {
        float f7 = fArr2[0];
        float f11 = fArr2[1];
        float f12 = fArr2[2];
        fArr2[0] = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f7);
        fArr2[1] = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f7);
        fArr2[2] = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f7);
    }
}
