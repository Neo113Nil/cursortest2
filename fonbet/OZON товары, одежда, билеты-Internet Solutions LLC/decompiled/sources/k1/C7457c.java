package k1;

import org.jetbrains.annotations.NotNull;

/* renamed from: k1.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7457c {
    @NotNull
    public static final String a(float f7) {
        if (Float.isNaN(f7)) {
            return "NaN";
        }
        if (Float.isInfinite(f7)) {
            return f7 < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f11 = f7 * pow;
        int i11 = (int) f11;
        if (f11 - i11 >= 0.5f) {
            i11++;
        }
        float f12 = i11 / pow;
        return max > 0 ? String.valueOf(f12) : String.valueOf((int) f12);
    }
}
