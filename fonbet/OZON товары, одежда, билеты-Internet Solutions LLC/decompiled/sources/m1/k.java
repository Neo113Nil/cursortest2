package m1;

import l1.C7811b0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class k extends AbstractC8032c {
    @Override // m1.AbstractC8032c
    @NotNull
    public final float[] a(@NotNull float[] fArr) {
        float f7 = fArr[0] / j.c()[0];
        float f11 = fArr[1] / j.c()[1];
        float f12 = fArr[2] / j.c()[2];
        float cbrt = f7 > 0.008856452f ? (float) Math.cbrt(f7) : (f7 * 7.787037f) + 0.13793103f;
        float cbrt2 = f11 > 0.008856452f ? (float) Math.cbrt(f11) : (f11 * 7.787037f) + 0.13793103f;
        float f13 = (116.0f * cbrt2) - 16.0f;
        float f14 = (cbrt - cbrt2) * 500.0f;
        float cbrt3 = (cbrt2 - (f12 > 0.008856452f ? (float) Math.cbrt(f12) : (f12 * 7.787037f) + 0.13793103f)) * 200.0f;
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > 100.0f) {
            f13 = 100.0f;
        }
        fArr[0] = f13;
        if (f14 < -128.0f) {
            f14 = -128.0f;
        }
        if (f14 > 128.0f) {
            f14 = 128.0f;
        }
        fArr[1] = f14;
        if (cbrt3 < -128.0f) {
            cbrt3 = -128.0f;
        }
        fArr[2] = cbrt3 <= 128.0f ? cbrt3 : 128.0f;
        return fArr;
    }

    @Override // m1.AbstractC8032c
    public final float d(int i11) {
        return i11 == 0 ? 100.0f : 128.0f;
    }

    @Override // m1.AbstractC8032c
    public final float e(int i11) {
        return i11 == 0 ? 0.0f : -128.0f;
    }

    @Override // m1.AbstractC8032c
    public final long i(float f7, float f11, float f12) {
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 > 100.0f) {
            f7 = 100.0f;
        }
        if (f11 < -128.0f) {
            f11 = -128.0f;
        }
        if (f11 > 128.0f) {
            f11 = 128.0f;
        }
        float f13 = (f7 + 16.0f) / 116.0f;
        float f14 = (f11 * 0.002f) + f13;
        float f15 = f14 > 0.20689656f ? f14 * f14 * f14 : (f14 - 0.13793103f) * 0.12841855f;
        float f16 = f13 > 0.20689656f ? f13 * f13 * f13 : (f13 - 0.13793103f) * 0.12841855f;
        float f17 = f15 * j.c()[0];
        return (Float.floatToRawIntBits(f16 * j.c()[1]) & 4294967295L) | (Float.floatToRawIntBits(f17) << 32);
    }

    @Override // m1.AbstractC8032c
    @NotNull
    public final float[] j(@NotNull float[] fArr) {
        float f7 = fArr[0];
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 > 100.0f) {
            f7 = 100.0f;
        }
        fArr[0] = f7;
        float f11 = fArr[1];
        if (f11 < -128.0f) {
            f11 = -128.0f;
        }
        if (f11 > 128.0f) {
            f11 = 128.0f;
        }
        fArr[1] = f11;
        float f12 = fArr[2];
        float f13 = f12 >= -128.0f ? f12 : -128.0f;
        float f14 = f13 <= 128.0f ? f13 : 128.0f;
        fArr[2] = f14;
        float f15 = (f7 + 16.0f) / 116.0f;
        float f16 = (f11 * 0.002f) + f15;
        float f17 = f15 - (f14 * 0.005f);
        float f18 = f16 > 0.20689656f ? f16 * f16 * f16 : (f16 - 0.13793103f) * 0.12841855f;
        float f19 = f15 > 0.20689656f ? f15 * f15 * f15 : (f15 - 0.13793103f) * 0.12841855f;
        float f21 = f17 > 0.20689656f ? f17 * f17 * f17 : (f17 - 0.13793103f) * 0.12841855f;
        fArr[0] = f18 * j.c()[0];
        fArr[1] = f19 * j.c()[1];
        fArr[2] = f21 * j.c()[2];
        return fArr;
    }

    @Override // m1.AbstractC8032c
    public final float k(float f7, float f11, float f12) {
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 > 100.0f) {
            f7 = 100.0f;
        }
        if (f12 < -128.0f) {
            f12 = -128.0f;
        }
        if (f12 > 128.0f) {
            f12 = 128.0f;
        }
        float f13 = ((f7 + 16.0f) / 116.0f) - (f12 * 0.005f);
        return (f13 > 0.20689656f ? f13 * f13 * f13 : 0.12841855f * (f13 - 0.13793103f)) * j.c()[2];
    }

    @Override // m1.AbstractC8032c
    public final long l(float f7, float f11, float f12, float f13, @NotNull AbstractC8032c abstractC8032c) {
        float f14 = f7 / j.c()[0];
        float f15 = f11 / j.c()[1];
        float f16 = f12 / j.c()[2];
        float cbrt = f14 > 0.008856452f ? (float) Math.cbrt(f14) : (f14 * 7.787037f) + 0.13793103f;
        float cbrt2 = f15 > 0.008856452f ? (float) Math.cbrt(f15) : (f15 * 7.787037f) + 0.13793103f;
        float f17 = (116.0f * cbrt2) - 16.0f;
        float f18 = (cbrt - cbrt2) * 500.0f;
        float cbrt3 = (cbrt2 - (f16 > 0.008856452f ? (float) Math.cbrt(f16) : (f16 * 7.787037f) + 0.13793103f)) * 200.0f;
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        if (f17 > 100.0f) {
            f17 = 100.0f;
        }
        if (f18 < -128.0f) {
            f18 = -128.0f;
        }
        if (f18 > 128.0f) {
            f18 = 128.0f;
        }
        if (cbrt3 < -128.0f) {
            cbrt3 = -128.0f;
        }
        return C7811b0.a(f17, f18, cbrt3 <= 128.0f ? cbrt3 : 128.0f, f13, abstractC8032c);
    }
}
