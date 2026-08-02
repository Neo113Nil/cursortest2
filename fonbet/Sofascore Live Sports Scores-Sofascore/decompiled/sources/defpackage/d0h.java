package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d0h {
    public static final d0h c;
    public static final d0h d;
    public static final d0h e;
    public static final d0h f;
    public final long a;
    public final long b;

    static {
        d0h d0hVar = new d0h(0L, 0L);
        c = d0hVar;
        d = new d0h(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new d0h(Long.MAX_VALUE, 0L);
        new d0h(0L, Long.MAX_VALUE);
        f = d0hVar;
    }

    public d0h(long j, long j2) {
        z1a.s(j >= 0);
        z1a.s(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j, long j2, long j3) {
        long j4 = this.a;
        long j5 = this.b;
        if (j4 == 0 && j5 == 0) {
            return j;
        }
        String str = nik.a;
        long j6 = j - j4;
        long j7 = (((j4 ^ j) > 0L ? 1 : ((j4 ^ j) == 0L ? 0 : -1)) >= 0) | (((j ^ j6) > 0L ? 1 : ((j ^ j6) == 0L ? 0 : -1)) >= 0) ? j6 : ((j6 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j7 == Long.MIN_VALUE && j6 != Long.MIN_VALUE) || (j7 == Long.MAX_VALUE && j6 != Long.MAX_VALUE)) {
            j7 = Long.MIN_VALUE;
        }
        long a = nik.a(j, j5);
        boolean z = j7 <= j2 && j2 <= a;
        boolean z2 = j7 <= j3 && j3 <= a;
        if (!z || !z2) {
            if (!z) {
                return z2 ? j3 : j7;
            }
            return j2;
        }
        if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
            return j2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d0h.class == obj.getClass()) {
            d0h d0hVar = (d0h) obj;
            if (this.a == d0hVar.a && this.b == d0hVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
