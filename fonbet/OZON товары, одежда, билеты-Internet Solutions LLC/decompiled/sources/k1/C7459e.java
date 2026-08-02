package k1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* renamed from: k1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7459e {

    /* renamed from: a, reason: collision with root package name */
    private final long f70278a;

    /* renamed from: k1.e$a */
    public static final class a {
    }

    private /* synthetic */ C7459e(long j11) {
        this.f70278a = j11;
    }

    public static final /* synthetic */ C7459e a(long j11) {
        return new C7459e(j11);
    }

    public static long b(long j11, float f7, int i11) {
        float intBitsToFloat = (i11 & 1) != 0 ? Float.intBitsToFloat((int) (j11 >> 32)) : 0.0f;
        if ((i11 & 2) != 0) {
            f7 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        }
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L);
    }

    public static final long c(float f7, long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) / f7;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) / f7;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final boolean d(long j11, long j12) {
        return j11 == j12;
    }

    public static final float e(long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        return (float) Math.sqrt((intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat));
    }

    public static final float f(long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        return (intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat);
    }

    public static final float g(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    public static final float h(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    public static final boolean i(long j11) {
        long j12 = j11 & 9223372034707292159L;
        return (((~j12) & (j12 - 9187343246269874177L)) & (-9223372034707292160L)) == -9223372034707292160L;
    }

    public static final long j(long j11, long j12) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) - Float.intBitsToFloat((int) (j12 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) - Float.intBitsToFloat((int) (j12 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long k(long j11, long j12) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32)) + Float.intBitsToFloat((int) (j11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L)) + Float.intBitsToFloat((int) (j11 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final long l(float f7, long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) * f7;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) * f7;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    @NotNull
    public static String m(long j11) {
        if (!P9.a.d(j11)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + C7457c.a(g(j11)) + ", " + C7457c.a(h(j11)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7459e) {
            return this.f70278a == ((C7459e) obj).f70278a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f70278a);
    }

    public final /* synthetic */ long n() {
        return this.f70278a;
    }

    @NotNull
    public final String toString() {
        return m(this.f70278a);
    }
}
