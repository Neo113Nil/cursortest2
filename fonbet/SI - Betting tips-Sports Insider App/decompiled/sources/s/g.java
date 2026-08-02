package s;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f22556a;

    public static long a(float f6, float f10) {
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    public static String b(long j) {
        return "(" + Float.intBitsToFloat((int) (j >> 32)) + ", " + Float.intBitsToFloat((int) (j & 4294967295L)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f22556a == ((g) obj).f22556a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f22556a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return b(this.f22556a);
    }
}
