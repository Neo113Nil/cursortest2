package l1;

import org.jetbrains.annotations.NotNull;

/* renamed from: l1.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7794L {
    public static final long a(float f7, float f11, @NotNull float[] fArr) {
        int b11;
        float f12 = (f7 - 0.0f) * 3.0f;
        float f13 = (f11 - f7) * 3.0f;
        float f14 = (1.0f - f11) * 3.0f;
        double d11 = f12;
        double d12 = f13;
        double d13 = f14;
        double d14 = d12 * 2.0d;
        double d15 = (d11 - d14) + d13;
        if (d15 == 0.0d) {
            b11 = d12 == d13 ? 0 : b((float) ((d14 - d13) / (d14 - (d13 * 2.0d))), fArr, 0);
        } else {
            double d16 = -Math.sqrt((d12 * d12) - (d13 * d11));
            double d17 = (-d11) + d12;
            int b12 = b((float) ((-(d16 + d17)) / d15), fArr, 0);
            b11 = b((float) ((d16 - d17) / d15), fArr, b12) + b12;
            if (b11 > 1) {
                float f15 = fArr[0];
                float f16 = fArr[1];
                if (f15 > f16) {
                    fArr[0] = f16;
                    fArr[1] = f15;
                } else if (f15 == f16) {
                    b11--;
                }
            }
        }
        float f17 = (f13 - f12) * 2.0f;
        int b13 = b11 + b((-f17) / (((f14 - f13) * 2.0f) - f17), fArr, b11);
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i11 = 0; i11 < b13; i11++) {
            float f18 = fArr[i11];
            float f19 = (((((((((f7 - f11) * 3.0f) + 1.0f) - 0.0f) * f18) + (((f11 - (f7 * 2.0f)) + 0.0f) * 3.0f)) * f18) + f12) * f18) + 0.0f;
            min = Math.min(min, f19);
            max = Math.max(max, f19);
        }
        return (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        if (r3 <= 1.0000008f) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r3 >= (-8.34465E-7f)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000f, code lost:
    
        r3 = Float.NaN;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int b(float f7, float[] fArr, int i11) {
        float f11 = 0.0f;
        if (f7 >= 0.0f) {
            f11 = 1.0f;
            if (f7 > 1.0f) {
            }
        }
        fArr[i11] = f7;
        return !Float.isNaN(f7) ? 1 : 0;
    }
}
