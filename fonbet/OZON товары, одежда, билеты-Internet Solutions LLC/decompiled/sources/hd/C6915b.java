package hd;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: hd.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6915b extends C6917d {
    private C6915b() {
    }

    public static double a(double d11) {
        return Math.log(d11) / C6914a.f65303b;
    }

    public static int b(double d11) {
        if (Double.isNaN(d11)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d11 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        return d11 < -2.147483648E9d ? LinearLayoutManager.INVALID_OFFSET : (int) Math.round(d11);
    }

    public static int c(float f7) {
        if (Float.isNaN(f7)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f7);
    }

    public static long d(double d11) {
        if (Double.isNaN(d11)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d11);
    }
}
