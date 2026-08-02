package m0;

import Bl0.C2656q;
import l1.C7794L;
import org.jetbrains.annotations.NotNull;

/* renamed from: m0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8025y implements E {

    /* renamed from: a, reason: collision with root package name */
    private final float f73905a;

    /* renamed from: b, reason: collision with root package name */
    private final float f73906b;

    /* renamed from: c, reason: collision with root package name */
    private final float f73907c;

    /* renamed from: d, reason: collision with root package name */
    private final float f73908d;

    /* renamed from: e, reason: collision with root package name */
    private final float f73909e;

    /* renamed from: f, reason: collision with root package name */
    private final float f73910f;

    public C8025y(float f7, float f11, float f12, float f13) {
        this.f73905a = f7;
        this.f73906b = f11;
        this.f73907c = f12;
        this.f73908d = f13;
        if (!Float.isNaN(f7) && !Float.isNaN(f11) && !Float.isNaN(f12) && !Float.isNaN(f13)) {
            long a11 = C7794L.a(f11, f13, new float[5]);
            this.f73909e = Float.intBitsToFloat((int) (a11 >> 32));
            this.f73910f = Float.intBitsToFloat((int) (a11 & 4294967295L));
            return;
        }
        C7985d0.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f7 + ", " + f11 + ", " + f12 + ", " + f13 + '.');
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01d5, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01df, code lost:
    
        if (r2 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01fe, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0208, code lost:
    
        if (r2 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        r2 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        if (r2 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        r2 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c9, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d2, code lost:
    
        if (r2 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0193, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019d, code lost:
    
        if (r2 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017e  */
    @Override // m0.E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f7) {
        float a11;
        float cos;
        if (f7 <= 0.0f || f7 >= 1.0f) {
            return f7;
        }
        float f11 = this.f73905a;
        float f12 = this.f73907c;
        float f13 = f12 - f7;
        double d11 = 0.0f - f7;
        double d12 = ((d11 - ((f11 - f7) * 2.0d)) + f13) * 3.0d;
        double d13 = (r6 - r4) * 3.0d;
        double d14 = ((r6 - f13) * 3.0d) + (-r4) + (1.0f - f7);
        if (Math.abs(d14 - 0.0d) >= 1.0E-7d) {
            double d15 = d12 / d14;
            double d16 = d13 / d14;
            double d17 = d11 / d14;
            double d18 = ((d16 * 3.0d) - (d15 * d15)) / 9.0d;
            double d19 = ((d17 * 27.0d) + ((((2.0d * d15) * d15) * d15) - ((9.0d * d15) * d16))) / 54.0d;
            double d21 = d18 * d18 * d18;
            double d22 = (d19 * d19) + d21;
            double d23 = d15 / 3.0d;
            if (d22 < 0.0d) {
                double sqrt = Math.sqrt(-d21);
                double d24 = (-d19) / sqrt;
                if (d24 < -1.0d) {
                    d24 = -1.0d;
                }
                if (d24 > 1.0d) {
                    d24 = 1.0d;
                }
                double acos = Math.acos(d24);
                double a12 = C2656q.a((float) sqrt) * 2.0f;
                cos = (float) ((Math.cos(acos / 3.0d) * a12) - d23);
                if (cos < 0.0f) {
                    if (cos >= -8.34465E-7f) {
                        cos = 0.0f;
                        if (Float.isNaN(cos)) {
                            cos = (float) ((Math.cos((6.283185307179586d + acos) / 3.0d) * a12) - d23);
                            if (cos < 0.0f) {
                                if (cos >= -8.34465E-7f) {
                                    cos = 0.0f;
                                    if (Float.isNaN(cos)) {
                                        a11 = (float) ((Math.cos((acos + 12.566370614359172d) / 3.0d) * a12) - d23);
                                        if (a11 >= 0.0f) {
                                            if (a11 > 1.0f) {
                                            }
                                        }
                                        a11 = Float.NaN;
                                    }
                                }
                                cos = Float.NaN;
                                if (Float.isNaN(cos)) {
                                }
                            } else {
                                if (cos > 1.0f) {
                                    if (cos <= 1.0000008f) {
                                        cos = 1.0f;
                                    }
                                    cos = Float.NaN;
                                }
                                if (Float.isNaN(cos)) {
                                }
                            }
                        }
                        a11 = cos;
                    }
                    cos = Float.NaN;
                    if (Float.isNaN(cos)) {
                    }
                    a11 = cos;
                } else {
                    if (cos > 1.0f) {
                        if (cos <= 1.0000008f) {
                            cos = 1.0f;
                        }
                        cos = Float.NaN;
                    }
                    if (Float.isNaN(cos)) {
                    }
                    a11 = cos;
                }
            } else if (d22 == 0.0d) {
                float f14 = -C2656q.a((float) d19);
                float f15 = (float) d23;
                float f16 = (f14 * 2.0f) - f15;
                if (f16 < 0.0f) {
                    if (f16 >= -8.34465E-7f) {
                        f16 = 0.0f;
                        if (Float.isNaN(f16)) {
                            a11 = (-f14) - f15;
                            if (a11 >= 0.0f) {
                                if (a11 > 1.0f) {
                                }
                            }
                            a11 = Float.NaN;
                        } else {
                            a11 = f16;
                        }
                    }
                    f16 = Float.NaN;
                    if (Float.isNaN(f16)) {
                    }
                } else {
                    if (f16 > 1.0f) {
                        if (f16 <= 1.0000008f) {
                            f16 = 1.0f;
                        }
                        f16 = Float.NaN;
                    }
                    if (Float.isNaN(f16)) {
                    }
                }
            } else {
                double sqrt2 = Math.sqrt(d22);
                a11 = (float) ((C2656q.a((float) ((-d19) + sqrt2)) - C2656q.a((float) (d19 + sqrt2))) - d23);
                if (a11 >= 0.0f) {
                    if (a11 > 1.0f) {
                    }
                }
                a11 = Float.NaN;
            }
        } else if (Math.abs(d12 - 0.0d) < 1.0E-7d) {
            if (Math.abs(d13 - 0.0d) >= 1.0E-7d) {
                a11 = (float) ((-d11) / d13);
                if (a11 >= 0.0f) {
                    if (a11 > 1.0f) {
                    }
                }
            }
            a11 = Float.NaN;
        } else {
            double sqrt3 = Math.sqrt((d13 * d13) - ((4.0d * d12) * d11));
            double d25 = d12 * 2.0d;
            cos = (float) ((sqrt3 - d13) / d25);
            if (cos < 0.0f) {
                if (cos >= -8.34465E-7f) {
                    cos = 0.0f;
                    if (Float.isNaN(cos)) {
                        a11 = (float) (((-d13) - sqrt3) / d25);
                        if (a11 >= 0.0f) {
                            if (a11 > 1.0f) {
                            }
                        }
                        a11 = Float.NaN;
                    }
                    a11 = cos;
                }
                cos = Float.NaN;
                if (Float.isNaN(cos)) {
                }
                a11 = cos;
            } else {
                if (cos > 1.0f) {
                    if (cos <= 1.0000008f) {
                        cos = 1.0f;
                    }
                    cos = Float.NaN;
                }
                if (Float.isNaN(cos)) {
                }
                a11 = cos;
            }
        }
        boolean isNaN = Float.isNaN(a11);
        float f17 = this.f73908d;
        float f18 = this.f73906b;
        if (!isNaN) {
            float f19 = ((((((f18 - f17) + 0.33333334f) * a11) + (f17 - (2.0f * f18))) * a11) + f18) * 3.0f * a11;
            float f21 = this.f73909e;
            if (f19 < f21) {
                f19 = f21;
            }
            float f22 = this.f73910f;
            return f19 > f22 ? f22 : f19;
        }
        throw new IllegalArgumentException("The cubic curve with parameters (" + f11 + ", " + f18 + ", " + f12 + ", " + f17 + ") has no solution at " + f7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8025y)) {
            return false;
        }
        C8025y c8025y = (C8025y) obj;
        return this.f73905a == c8025y.f73905a && this.f73906b == c8025y.f73906b && this.f73907c == c8025y.f73907c && this.f73908d == c8025y.f73908d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f73908d) + Pk0.b.a(this.f73907c, Pk0.b.a(this.f73906b, Float.hashCode(this.f73905a) * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CubicBezierEasing(a=");
        sb2.append(this.f73905a);
        sb2.append(", b=");
        sb2.append(this.f73906b);
        sb2.append(", c=");
        sb2.append(this.f73907c);
        sb2.append(", d=");
        return F3.G.a(sb2, this.f73908d, ')');
    }
}
