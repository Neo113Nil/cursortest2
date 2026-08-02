package k1;

/* renamed from: k1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7465k {
    public static final long a(float f7, float f11) {
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
    }

    public static final long b(long j11) {
        if (j11 != 9205357640488583168L) {
            return P9.a.a(Float.intBitsToFloat((int) (j11 >> 32)) / 2.0f, Float.intBitsToFloat((int) (j11 & 4294967295L)) / 2.0f);
        }
        Fl0.b.d();
        throw null;
    }
}
