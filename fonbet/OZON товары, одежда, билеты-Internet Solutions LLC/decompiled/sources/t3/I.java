package t3;

import m3.N;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: c, reason: collision with root package name */
    public static final I f98999c;

    /* renamed from: a, reason: collision with root package name */
    public final long f99000a;

    /* renamed from: b, reason: collision with root package name */
    public final long f99001b;

    static {
        I i11 = new I(0L, 0L);
        new I(Long.MAX_VALUE, Long.MAX_VALUE);
        new I(Long.MAX_VALUE, 0L);
        new I(0L, Long.MAX_VALUE);
        f98999c = i11;
    }

    public I(long j11, long j12) {
        G10.a.c(j11 >= 0);
        G10.a.c(j12 >= 0);
        this.f99000a = j11;
        this.f99001b = j12;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j11, long j12, long j13) {
        long j14 = this.f99000a;
        long j15 = this.f99001b;
        if (j14 == 0 && j15 == 0) {
            return j11;
        }
        int i11 = N.f74289a;
        long j16 = j11 - j14;
        if (((j14 ^ j11) & (j11 ^ j16)) < 0) {
            j16 = Long.MIN_VALUE;
        }
        long j17 = j11 + j15;
        if (((j15 ^ j17) & (j11 ^ j17)) < 0) {
            j17 = Long.MAX_VALUE;
        }
        boolean z11 = false;
        boolean z12 = j16 <= j12 && j12 <= j17;
        if (j16 <= j13 && j13 <= j17) {
            z11 = true;
        }
        if (!z12 || !z11) {
            if (!z12) {
                return z11 ? j13 : j16;
            }
            return j12;
        }
        if (Math.abs(j12 - j11) <= Math.abs(j13 - j11)) {
            return j12;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && I.class == obj.getClass()) {
            I i11 = (I) obj;
            if (this.f99000a == i11.f99000a && this.f99001b == i11.f99001b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f99000a) * 31) + ((int) this.f99001b);
    }
}
