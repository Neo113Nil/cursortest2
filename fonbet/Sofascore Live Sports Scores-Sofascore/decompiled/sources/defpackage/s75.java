package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class s75 {
    public final long a;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final long c(long j, float f) {
        float b = b(j) * f;
        float a = a(j) * f;
        return (Float.floatToRawIntBits(b) << 32) | (Float.floatToRawIntBits(a) & 4294967295L);
    }

    public static String d(long j) {
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) p75.c(b(j))) + " x " + ((Object) p75.c(a(j)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s75) {
            return this.a == ((s75) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
