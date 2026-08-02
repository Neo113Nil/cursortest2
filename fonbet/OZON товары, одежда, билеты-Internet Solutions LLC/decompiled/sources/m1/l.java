package m1;

import Bl0.C2656q;
import l1.C7811b0;
import m1.AbstractC8030a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class l extends AbstractC8032c {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final float[] f73973d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final float[] f73974e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final float[] f73975f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final float[] f73976g;

    static {
        AbstractC8030a.C1252a c1252a;
        c1252a = AbstractC8030a.f73928b;
        float[] g10 = C8033d.g(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, C8033d.b(c1252a.b(), j.b().c(), j.e().c()));
        f73973d = g10;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f73974e = fArr;
        f73975f = C8033d.f(g10);
        f73976g = C8033d.f(fArr);
    }

    @Override // m1.AbstractC8032c
    @NotNull
    public final float[] a(@NotNull float[] fArr) {
        C8033d.h(f73973d, fArr);
        fArr[0] = C2656q.a(fArr[0]);
        fArr[1] = C2656q.a(fArr[1]);
        fArr[2] = C2656q.a(fArr[2]);
        C8033d.h(f73974e, fArr);
        return fArr;
    }

    @Override // m1.AbstractC8032c
    public final float d(int i11) {
        return i11 == 0 ? 1.0f : 0.5f;
    }

    @Override // m1.AbstractC8032c
    public final float e(int i11) {
        return i11 == 0 ? 0.0f : -0.5f;
    }

    @Override // m1.AbstractC8032c
    public final long i(float f7, float f11, float f12) {
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float[] fArr = f73976g;
        float f14 = (fArr[6] * f13) + (fArr[3] * f11) + (fArr[0] * f7);
        float f15 = (fArr[7] * f13) + (fArr[4] * f11) + (fArr[1] * f7);
        float f16 = (fArr[8] * f13) + (fArr[5] * f11) + (fArr[2] * f7);
        float f17 = f15 * f15 * f15;
        float f18 = f16 * f16 * f16;
        float[] fArr2 = f73975f;
        float f19 = (fArr2[6] * f18) + (fArr2[3] * f17) + (fArr2[0] * f14 * f14 * f14);
        return (Float.floatToRawIntBits((fArr2[7] * f18) + (fArr2[4] * f17) + (fArr2[1] * r11)) & 4294967295L) | (Float.floatToRawIntBits(f19) << 32);
    }

    @Override // m1.AbstractC8032c
    @NotNull
    public final float[] j(@NotNull float[] fArr) {
        float f7 = fArr[0];
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        fArr[0] = f7;
        float f11 = fArr[1];
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        fArr[1] = f11;
        float f12 = fArr[2];
        float f13 = f12 >= -0.5f ? f12 : -0.5f;
        fArr[2] = f13 <= 0.5f ? f13 : 0.5f;
        C8033d.h(f73976g, fArr);
        float f14 = fArr[0];
        fArr[0] = f14 * f14 * f14;
        float f15 = fArr[1];
        fArr[1] = f15 * f15 * f15;
        float f16 = fArr[2];
        fArr[2] = f16 * f16 * f16;
        C8033d.h(f73975f, fArr);
        return fArr;
    }

    @Override // m1.AbstractC8032c
    public final float k(float f7, float f11, float f12) {
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float[] fArr = f73976g;
        float f14 = (fArr[6] * f13) + (fArr[3] * f11) + (fArr[0] * f7);
        float f15 = (fArr[7] * f13) + (fArr[4] * f11) + (fArr[1] * f7);
        float f16 = (fArr[8] * f13) + (fArr[5] * f11) + (fArr[2] * f7);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float[] fArr2 = f73975f;
        return (fArr2[8] * f19) + (fArr2[5] * f18) + (fArr2[2] * f17);
    }

    @Override // m1.AbstractC8032c
    public final long l(float f7, float f11, float f12, float f13, @NotNull AbstractC8032c abstractC8032c) {
        float[] fArr = f73973d;
        float f14 = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f7);
        float f15 = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f7);
        float f16 = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f7);
        float a11 = C2656q.a(f14);
        float a12 = C2656q.a(f15);
        float a13 = C2656q.a(f16);
        float[] fArr2 = f73974e;
        return C7811b0.a((fArr2[6] * a13) + (fArr2[3] * a12) + (fArr2[0] * a11), (fArr2[7] * a13) + (fArr2[4] * a12) + (fArr2[1] * a11), (fArr2[8] * a13) + (fArr2[5] * a12) + (fArr2[2] * a11), f13, abstractC8032c);
    }
}
