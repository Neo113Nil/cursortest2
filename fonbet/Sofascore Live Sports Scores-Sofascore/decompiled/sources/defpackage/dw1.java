package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dw1 {
    public static final dw1 e;
    public static final dw1 f;
    public static dw1 g;
    public final /* synthetic */ int a;
    public int b;
    public long c;
    public long d;

    static {
        int i = -3;
        e = new dw1(i, 0, C.TIME_UNSET, -1L);
        int i2 = -3;
        f = new dw1(i2, 1, C.TIME_UNSET, -1L);
    }

    public /* synthetic */ dw1(int i, int i2, long j, long j2) {
        this.a = i2;
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    public static void c(dw1 dw1Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        synchronized (dw1Var) {
            try {
                if (j < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j2 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j3 = dw1Var.c + j;
                dw1Var.c = j3;
                long j4 = dw1Var.d + j2;
                dw1Var.d = j4;
                if (j4 > j3) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(double d, double d2, long j) {
        double d3 = (0.01720197f * ((j - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + Math.round((r2 - 9.0E-4f) - r6) + 9.0E-4f + ((-d2) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d4 = 0.01745329238474369d * d;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d4))) / (Math.cos(asin) * Math.cos(d4));
        if (sin3 >= 1.0d) {
            this.b = 1;
            this.c = -1L;
            this.d = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.b = 0;
                this.c = -1L;
                this.d = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.c = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.d = round;
            if (round >= j || this.c <= j) {
                this.b = 1;
            } else {
                this.b = 0;
            }
        }
    }

    public synchronized long b() {
        return this.c - this.d;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return "WindowCounter(streamId=" + this.b + ", total=" + this.c + ", acknowledged=" + this.d + ", unacknowledged=" + b() + ')';
            default:
                return super.toString();
        }
    }

    public dw1(int i) {
        this.a = 3;
        this.b = i;
    }
}
