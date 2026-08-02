package m0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class J implements I {

    /* renamed from: a, reason: collision with root package name */
    private final float f73542a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C8009p0 f73543b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public J() {
        this(r1, 7, r1);
        float f7 = 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x019c  */
    @Override // m0.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(float f7, float f11, float f12) {
        double d11;
        double d12;
        C8023x c8023x;
        double d13;
        double d14;
        double d15;
        double d16;
        double d17;
        double d18;
        double d19;
        double d21;
        double d22;
        long j11;
        double d23;
        C8009p0 c8009p0 = this.f73543b;
        float b11 = c8009p0.b();
        float a11 = c8009p0.a();
        float f13 = this.f73542a;
        float f14 = (f7 - f11) / f13;
        float f15 = f12 / f13;
        if (a11 == 0.0f) {
            j11 = 9223372036854L;
        } else {
            double d24 = b11;
            double d25 = a11;
            double d26 = f15;
            double d27 = f14;
            double d28 = 1.0f;
            double sqrt = d25 * 2.0d * Math.sqrt(d24);
            double d29 = (sqrt * sqrt) - (d24 * 4.0d);
            double d31 = -sqrt;
            if (d29 < 0.0d) {
                d12 = 2.0d;
                d11 = d25;
                c8023x = new C8023x(0.0d, Math.sqrt(Math.abs(d29)));
            } else {
                d11 = d25;
                d12 = 2.0d;
                c8023x = new C8023x(Math.sqrt(d29), 0.0d);
            }
            d13 = c8023x.f73902a;
            c8023x.f73902a = d13 + d31;
            d14 = c8023x.f73902a;
            c8023x.f73902a = d14 * 0.5d;
            d15 = c8023x.f73903b;
            c8023x.f73903b = d15 * 0.5d;
            C8023x c8023x2 = d29 < 0.0d ? new C8023x(0.0d, Math.sqrt(Math.abs(d29))) : new C8023x(Math.sqrt(d29), 0.0d);
            d16 = c8023x2.f73902a;
            double d32 = -1;
            c8023x2.f73902a = d16 * d32;
            d17 = c8023x2.f73903b;
            c8023x2.f73903b = d17 * d32;
            d18 = c8023x2.f73902a;
            c8023x2.f73902a = d18 + d31;
            d19 = c8023x2.f73902a;
            c8023x2.f73902a = d19 * 0.5d;
            d21 = c8023x2.f73903b;
            c8023x2.f73903b = d21 * 0.5d;
            if (d27 == 0.0d && d26 == 0.0d) {
                j11 = 0;
            } else {
                if (d27 < 0.0d) {
                    d26 = -d26;
                }
                double abs = Math.abs(d27);
                double d33 = Double.MAX_VALUE;
                if (d11 > 1.0d) {
                    double f16 = c8023x.f();
                    double f17 = c8023x2.f();
                    double d34 = (f16 * abs) - d26;
                    double d35 = f16 - f17;
                    double d36 = d34 / d35;
                    double d37 = abs - d36;
                    d22 = Math.log(Math.abs(d28 / d37)) / f16;
                    double log = Math.log(Math.abs(d28 / d36)) / f17;
                    if (Double.isInfinite(d22) || Double.isNaN(d22)) {
                        d22 = log;
                    } else if (!Double.isInfinite(log) && !Double.isNaN(log)) {
                        d22 = Math.max(d22, log);
                    }
                    double d38 = d37 * f16;
                    double log2 = Math.log(d38 / ((-d36) * f17)) / (f17 - f16);
                    if (!Double.isNaN(log2) && log2 > 0.0d) {
                        if (log2 > 0.0d) {
                            if ((-((Math.exp(log2 * f17) * d36) + (Math.exp(f16 * log2) * d37))) < d28) {
                                if (d36 > 0.0d && d37 < 0.0d) {
                                    d22 = 0.0d;
                                }
                            }
                        }
                        d22 = Math.log((-((d36 * f17) * f17)) / (d38 * f16)) / d35;
                        d23 = d36 * f17;
                        if (Math.abs((Math.exp(f17 * d22) * d23) + (Math.exp(f16 * d22) * d38)) >= 1.0E-4d) {
                            double d39 = d22;
                            int i11 = 0;
                            while (d33 > 0.001d && i11 < 100) {
                                i11++;
                                double d41 = f16 * d39;
                                double d42 = f17 * d39;
                                double exp = d39 - ((((Math.exp(d42) * d36) + (Math.exp(d41) * d37)) + d28) / ((Math.exp(d42) * d23) + (Math.exp(d41) * d38)));
                                d33 = Math.abs(d39 - exp);
                                d39 = exp;
                            }
                            d22 = d39;
                        }
                    }
                    d28 = -d28;
                    d23 = d36 * f17;
                    if (Math.abs((Math.exp(f17 * d22) * d23) + (Math.exp(f16 * d22) * d38)) >= 1.0E-4d) {
                    }
                } else if (d11 < 1.0d) {
                    double f18 = c8023x.f();
                    double e11 = (d26 - (f18 * abs)) / c8023x.e();
                    d22 = Math.log(d28 / Math.sqrt((e11 * e11) + (abs * abs))) / f18;
                } else {
                    double f19 = c8023x.f();
                    double d43 = f19 * abs;
                    double d44 = d26 - d43;
                    double log3 = Math.log(Math.abs(d28 / abs)) / f19;
                    double log4 = Math.log(Math.abs(d28 / d44));
                    double d45 = log4;
                    for (int i12 = 0; i12 < 6; i12++) {
                        d45 = log4 - Math.log(Math.abs(d45 / f19));
                    }
                    double d46 = d45 / f19;
                    if (Double.isInfinite(log3) || Double.isNaN(log3)) {
                        log3 = d46;
                    } else if (!Double.isInfinite(d46) && !Double.isNaN(d46)) {
                        log3 = Math.max(log3, d46);
                    }
                    double d47 = (-(d43 + d44)) / (f19 * d44);
                    double d48 = f19 * d47;
                    double exp2 = (Math.exp(d48) * d44 * d47) + (Math.exp(d48) * abs);
                    if (Double.isNaN(d47) || d47 <= 0.0d) {
                        d28 = -d28;
                    } else if (d47 <= 0.0d || (-exp2) >= d28) {
                        log3 = (-(d12 / f19)) - (abs / d44);
                    } else {
                        d28 = -d28;
                        log3 = (d44 >= 0.0d || abs <= 0.0d) ? log3 : 0.0d;
                    }
                    int i13 = 0;
                    while (d33 > 0.001d && i13 < 100) {
                        i13++;
                        double d49 = f19 * log3;
                        double exp3 = log3 - (((Math.exp(d49) * ((d44 * log3) + abs)) + d28) / (Math.exp(d49) * (((1 + d49) * d44) + d43)));
                        d33 = Math.abs(log3 - exp3);
                        log3 = exp3;
                    }
                    d22 = log3;
                }
                j11 = (long) (d22 * 1000.0d);
            }
        }
        return j11 * 1000000;
    }

    @Override // m0.I
    public final float c(float f7, float f11, float f12, long j11) {
        C8009p0 c8009p0 = this.f73543b;
        c8009p0.d(f11);
        return X.a(c8009p0.f(f7, f12, j11 / 1000000));
    }

    @Override // m0.I
    public final float d(float f7, float f11, float f12, long j11) {
        C8009p0 c8009p0 = this.f73543b;
        c8009p0.d(f11);
        return X.b(c8009p0.f(f7, f12, j11 / 1000000));
    }

    @Override // m0.I
    public final float e(float f7, float f11, float f12) {
        return 0.0f;
    }

    public J(float f7, float f11, float f12) {
        this.f73542a = f12;
        C8009p0 c8009p0 = new C8009p0();
        c8009p0.c(f7);
        c8009p0.e(f11);
        this.f73543b = c8009p0;
    }

    public /* synthetic */ J(float f7, int i11, float f11) {
        this((i11 & 1) != 0 ? 1.0f : f7, (i11 & 2) != 0 ? 1500.0f : f11, 0.01f);
    }
}
