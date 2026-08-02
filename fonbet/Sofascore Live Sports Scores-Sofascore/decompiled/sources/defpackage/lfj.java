package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lfj {
    public static final mfj[] b = {new mfj(0), new mfj(4294967296L), new mfj(8589934592L)};
    public static final long c = v8a.E(0, Float.NaN);
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final long b(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final boolean d(long j) {
        return (j & 1095216660480L) == 8589934592L;
    }

    public static String e(long j) {
        long b2 = b(j);
        if (mfj.a(b2, 0L)) {
            return "Unspecified";
        }
        if (mfj.a(b2, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!mfj.a(b2, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lfj) {
            return this.a == ((lfj) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return e(this.a);
    }
}
