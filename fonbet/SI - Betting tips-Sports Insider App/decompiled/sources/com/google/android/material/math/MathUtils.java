package com.google.android.material.math;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class MathUtils {
    public static final float DEFAULT_EPSILON = 1.0E-4f;

    private MathUtils() {
    }

    public static boolean areAllElementsEqual(@NonNull float[] fArr) {
        if (fArr.length <= 1) {
            return true;
        }
        float f6 = fArr[0];
        for (int i5 = 1; i5 < fArr.length; i5++) {
            if (fArr[i5] != f6) {
                return false;
            }
        }
        return true;
    }

    public static float dist(float f6, float f10, float f11, float f12) {
        return (float) Math.hypot(f11 - f6, f12 - f10);
    }

    public static float distanceToFurthestCorner(float f6, float f10, float f11, float f12, float f13, float f14) {
        return max(dist(f6, f10, f11, f12), dist(f6, f10, f13, f12), dist(f6, f10, f13, f14), dist(f6, f10, f11, f14));
    }

    public static float floorMod(float f6, int i5) {
        float f10 = i5;
        int i10 = (int) (f6 / f10);
        if (Math.signum(f6) * f10 < 0.0f && i10 * i5 != f6) {
            i10--;
        }
        return f6 - (i10 * i5);
    }

    public static boolean geq(float f6, float f10, float f11) {
        return f6 + f11 >= f10;
    }

    public static float lerp(float f6, float f10, float f11) {
        return (f11 * f10) + ((1.0f - f11) * f6);
    }

    private static float max(float f6, float f10, float f11, float f12) {
        return (f6 <= f10 || f6 <= f11 || f6 <= f12) ? (f10 <= f11 || f10 <= f12) ? f11 > f12 ? f11 : f12 : f10 : f6;
    }

    public static int floorMod(int i5, int i10) {
        int i11 = i5 / i10;
        if ((i5 ^ i10) < 0 && i11 * i10 != i5) {
            i11--;
        }
        return i5 - (i11 * i10);
    }
}
