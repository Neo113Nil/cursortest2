package androidx.appcompat.app;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: e, reason: collision with root package name */
    public static t0 f346e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f347a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f348b;

    /* renamed from: c, reason: collision with root package name */
    public long f349c;

    /* renamed from: d, reason: collision with root package name */
    public long f350d;

    public /* synthetic */ t0() {
    }

    public static void c(t0 t0Var, long j, long j6, int i5) {
        if ((i5 & 1) != 0) {
            j = 0;
        }
        if ((i5 & 2) != 0) {
            j6 = 0;
        }
        synchronized (t0Var) {
            try {
                if (j < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j6 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j10 = t0Var.f349c + j;
                t0Var.f349c = j10;
                long j11 = t0Var.f350d + j6;
                t0Var.f350d = j11;
                if (j11 > j10) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(double d10, double d11, long j) {
        double d12 = (0.01720197f * ((j - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d12) * 0.03341960161924362d) + d12 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d12) * 0.0053d) + Math.round((r2 - 9.0E-4f) - r6) + 9.0E-4f + ((-d11) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d13 = 0.01745329238474369d * d10;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d13))) / (Math.cos(asin) * Math.cos(d13));
        if (sin3 >= 1.0d) {
            this.f348b = 1;
            this.f349c = -1L;
            this.f350d = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.f348b = 0;
                this.f349c = -1L;
                this.f350d = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f349c = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f350d = round;
            if (round >= j || this.f349c <= j) {
                this.f348b = 1;
            } else {
                this.f348b = 0;
            }
        }
    }

    public synchronized long b() {
        return this.f349c - this.f350d;
    }

    public String toString() {
        switch (this.f347a) {
            case 1:
                return "WindowCounter(streamId=" + this.f348b + ", total=" + this.f349c + ", acknowledged=" + this.f350d + ", unacknowledged=" + b() + ')';
            default:
                return super.toString();
        }
    }

    public t0(int i5) {
        this.f348b = i5;
    }
}
