package m1;

import l1.C7811b0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class s extends AbstractC8032c {
    @Override // m1.AbstractC8032c
    @NotNull
    public final float[] a(@NotNull float[] fArr) {
        float f7 = fArr[0];
        if (f7 < -2.0f) {
            f7 = -2.0f;
        }
        if (f7 > 2.0f) {
            f7 = 2.0f;
        }
        fArr[0] = f7;
        float f11 = fArr[1];
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        fArr[1] = f11;
        float f12 = fArr[2];
        float f13 = f12 >= -2.0f ? f12 : -2.0f;
        fArr[2] = f13 <= 2.0f ? f13 : 2.0f;
        return fArr;
    }

    @Override // m1.AbstractC8032c
    public final float d(int i11) {
        return 2.0f;
    }

    @Override // m1.AbstractC8032c
    public final float e(int i11) {
        return -2.0f;
    }

    @Override // m1.AbstractC8032c
    public final long i(float f7, float f11, float f12) {
        if (f7 < -2.0f) {
            f7 = -2.0f;
        }
        if (f7 > 2.0f) {
            f7 = 2.0f;
        }
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        return (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f11 <= 2.0f ? f11 : 2.0f) & 4294967295L);
    }

    @Override // m1.AbstractC8032c
    @NotNull
    public final float[] j(@NotNull float[] fArr) {
        float f7 = fArr[0];
        if (f7 < -2.0f) {
            f7 = -2.0f;
        }
        if (f7 > 2.0f) {
            f7 = 2.0f;
        }
        fArr[0] = f7;
        float f11 = fArr[1];
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        fArr[1] = f11;
        float f12 = fArr[2];
        float f13 = f12 >= -2.0f ? f12 : -2.0f;
        fArr[2] = f13 <= 2.0f ? f13 : 2.0f;
        return fArr;
    }

    @Override // m1.AbstractC8032c
    public final float k(float f7, float f11, float f12) {
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        if (f12 > 2.0f) {
            return 2.0f;
        }
        return f12;
    }

    @Override // m1.AbstractC8032c
    public final long l(float f7, float f11, float f12, float f13, @NotNull AbstractC8032c abstractC8032c) {
        if (f7 < -2.0f) {
            f7 = -2.0f;
        }
        if (f7 > 2.0f) {
            f7 = 2.0f;
        }
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        return C7811b0.a(f7, f11, f12 <= 2.0f ? f12 : 2.0f, f13, abstractC8032c);
    }
}
