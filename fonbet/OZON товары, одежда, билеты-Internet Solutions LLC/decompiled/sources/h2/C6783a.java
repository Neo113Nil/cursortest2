package h2;

import java.util.Arrays;

/* renamed from: h2.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6783a extends AbstractC6784b {

    /* renamed from: a, reason: collision with root package name */
    private final double[] f64619a;

    /* renamed from: b, reason: collision with root package name */
    C1050a[] f64620b;

    /* renamed from: h2.a$a, reason: collision with other inner class name */
    private static class C1050a {

        /* renamed from: s, reason: collision with root package name */
        private static double[] f64621s = new double[91];

        /* renamed from: a, reason: collision with root package name */
        double[] f64622a;

        /* renamed from: b, reason: collision with root package name */
        double f64623b;

        /* renamed from: c, reason: collision with root package name */
        double f64624c;

        /* renamed from: d, reason: collision with root package name */
        double f64625d;

        /* renamed from: e, reason: collision with root package name */
        double f64626e;

        /* renamed from: f, reason: collision with root package name */
        double f64627f;

        /* renamed from: g, reason: collision with root package name */
        double f64628g;

        /* renamed from: h, reason: collision with root package name */
        double f64629h;

        /* renamed from: i, reason: collision with root package name */
        double f64630i;

        /* renamed from: j, reason: collision with root package name */
        double f64631j;

        /* renamed from: k, reason: collision with root package name */
        double f64632k;

        /* renamed from: l, reason: collision with root package name */
        double f64633l;

        /* renamed from: m, reason: collision with root package name */
        double f64634m;

        /* renamed from: n, reason: collision with root package name */
        double f64635n;

        /* renamed from: o, reason: collision with root package name */
        double f64636o;

        /* renamed from: p, reason: collision with root package name */
        double f64637p;

        /* renamed from: q, reason: collision with root package name */
        boolean f64638q;

        /* renamed from: r, reason: collision with root package name */
        boolean f64639r;

        C1050a(int i11, double d11, double d12, double d13, double d14, double d15, double d16) {
            double[] dArr;
            double d17 = d13;
            this.f64639r = false;
            double d18 = d15 - d17;
            double d19 = d16 - d14;
            boolean z11 = true;
            if (i11 == 1) {
                this.f64638q = true;
            } else if (i11 == 4) {
                this.f64638q = d19 > 0.0d;
            } else if (i11 != 5) {
                this.f64638q = false;
            } else {
                this.f64638q = d19 < 0.0d;
            }
            this.f64624c = d11;
            this.f64625d = d12;
            double d21 = d12 - d11;
            double d22 = 1.0d / d21;
            this.f64630i = d22;
            if (3 == i11) {
                this.f64639r = true;
            }
            if (this.f64639r || Math.abs(d18) < 0.001d || Math.abs(d19) < 0.001d) {
                this.f64639r = true;
                this.f64626e = d17;
                this.f64627f = d15;
                this.f64628g = d14;
                this.f64629h = d16;
                double hypot = Math.hypot(d19, d18);
                this.f64623b = hypot;
                this.f64635n = hypot * d22;
                this.f64633l = d18 / d21;
                this.f64634m = d19 / d21;
                return;
            }
            this.f64622a = new double[101];
            boolean z12 = this.f64638q;
            this.f64631j = (z12 ? -1 : 1) * d18;
            this.f64632k = (z12 ? 1 : -1) * d19;
            this.f64633l = z12 ? d15 : d17;
            this.f64634m = z12 ? d14 : d16;
            double d23 = d14 - d16;
            double d24 = 0.0d;
            double d25 = 0.0d;
            double d26 = 0.0d;
            int i12 = 0;
            while (true) {
                dArr = f64621s;
                if (i12 >= 91) {
                    break;
                }
                boolean z13 = z11;
                double radians = Math.toRadians((i12 * 90.0d) / 90);
                double sin = Math.sin(radians) * d18;
                double cos = Math.cos(radians) * d23;
                if (i12 > 0) {
                    d24 += Math.hypot(sin - d25, cos - d26);
                    dArr[i12] = d24;
                }
                i12++;
                d26 = cos;
                d25 = sin;
                z11 = z13;
            }
            this.f64623b = d24;
            for (int i13 = 0; i13 < 91; i13++) {
                dArr[i13] = dArr[i13] / d24;
            }
            int i14 = 0;
            while (true) {
                double[] dArr2 = this.f64622a;
                if (i14 >= dArr2.length) {
                    this.f64635n = this.f64623b * this.f64630i;
                    return;
                }
                double length = i14 / (dArr2.length - 1);
                int binarySearch = Arrays.binarySearch(dArr, length);
                if (binarySearch >= 0) {
                    dArr2[i14] = binarySearch / 90;
                } else if (binarySearch == -1) {
                    dArr2[i14] = 0.0d;
                } else {
                    int i15 = -binarySearch;
                    int i16 = i15 - 2;
                    double d27 = dArr[i16];
                    dArr2[i14] = (((length - d27) / (dArr[i15 - 1] - d27)) + i16) / 90;
                }
                i14++;
            }
        }

        final double a() {
            double d11 = this.f64631j * this.f64637p;
            double hypot = this.f64635n / Math.hypot(d11, (-this.f64632k) * this.f64636o);
            return this.f64638q ? (-d11) * hypot : d11 * hypot;
        }

        final double b() {
            double d11 = this.f64631j * this.f64637p;
            double d12 = (-this.f64632k) * this.f64636o;
            double hypot = this.f64635n / Math.hypot(d11, d12);
            return this.f64638q ? (-d12) * hypot : d12 * hypot;
        }

        public final double c(double d11) {
            double d12 = (d11 - this.f64624c) * this.f64630i;
            double d13 = this.f64627f;
            double d14 = this.f64626e;
            return ((d13 - d14) * d12) + d14;
        }

        public final double d(double d11) {
            double d12 = (d11 - this.f64624c) * this.f64630i;
            double d13 = this.f64629h;
            double d14 = this.f64628g;
            return ((d13 - d14) * d12) + d14;
        }

        final double e() {
            return (this.f64631j * this.f64636o) + this.f64633l;
        }

        final double f() {
            return (this.f64632k * this.f64637p) + this.f64634m;
        }

        final void g(double d11) {
            double d12 = (this.f64638q ? this.f64625d - d11 : d11 - this.f64624c) * this.f64630i;
            double d13 = 0.0d;
            if (d12 > 0.0d) {
                d13 = 1.0d;
                if (d12 < 1.0d) {
                    double[] dArr = this.f64622a;
                    double length = d12 * (dArr.length - 1);
                    int i11 = (int) length;
                    double d14 = dArr[i11];
                    d13 = ((dArr[i11 + 1] - d14) * (length - i11)) + d14;
                }
            }
            double d15 = d13 * 1.5707963267948966d;
            this.f64636o = Math.sin(d15);
            this.f64637p = Math.cos(d15);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        if (r5 == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C6783a(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f64619a = dArr;
        this.f64620b = new C1050a[dArr.length - 1];
        int i11 = 0;
        int i12 = 1;
        int i13 = 1;
        while (true) {
            C1050a[] c1050aArr = this.f64620b;
            if (i11 >= c1050aArr.length) {
                return;
            }
            int i14 = iArr[i11];
            int i15 = 3;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            i15 = 4;
                            if (i14 != 4) {
                                i15 = 5;
                                if (i14 != 5) {
                                    i15 = i13;
                                }
                            }
                        }
                    }
                    i12 = 2;
                    i15 = i12;
                }
                i12 = 1;
                i15 = i12;
            }
            double d11 = dArr[i11];
            int i16 = i11 + 1;
            double d12 = dArr[i16];
            double[] dArr3 = dArr2[i11];
            double d13 = dArr3[0];
            double d14 = dArr3[1];
            double[] dArr4 = dArr2[i16];
            c1050aArr[i11] = new C1050a(i15, d11, d12, d13, d14, dArr4[0], dArr4[1]);
            i11 = i16;
            i13 = i15;
        }
    }

    @Override // h2.AbstractC6784b
    public final double b(double d11) {
        C1050a[] c1050aArr = this.f64620b;
        C1050a c1050a = c1050aArr[0];
        double d12 = c1050a.f64624c;
        if (d11 < d12) {
            double d13 = d11 - d12;
            if (c1050a.f64639r) {
                return (d13 * c1050aArr[0].f64633l) + c1050a.c(d12);
            }
            c1050a.g(d12);
            return (d13 * c1050aArr[0].a()) + c1050aArr[0].e();
        }
        if (d11 > c1050aArr[c1050aArr.length - 1].f64625d) {
            double d14 = c1050aArr[c1050aArr.length - 1].f64625d;
            double d15 = d11 - d14;
            int length = c1050aArr.length - 1;
            return (d15 * c1050aArr[length].f64633l) + c1050aArr[length].c(d14);
        }
        for (int i11 = 0; i11 < c1050aArr.length; i11++) {
            C1050a c1050a2 = c1050aArr[i11];
            if (d11 <= c1050a2.f64625d) {
                if (c1050a2.f64639r) {
                    return c1050a2.c(d11);
                }
                c1050a2.g(d11);
                return c1050aArr[i11].e();
            }
        }
        return Double.NaN;
    }

    @Override // h2.AbstractC6784b
    public final void c(double d11, double[] dArr) {
        C1050a[] c1050aArr = this.f64620b;
        C1050a c1050a = c1050aArr[0];
        double d12 = c1050a.f64624c;
        if (d11 < d12) {
            double d13 = d11 - d12;
            if (c1050a.f64639r) {
                double c11 = c1050a.c(d12);
                C1050a c1050a2 = c1050aArr[0];
                dArr[0] = (c1050a2.f64633l * d13) + c11;
                dArr[1] = (d13 * c1050aArr[0].f64634m) + c1050a2.d(d12);
                return;
            }
            c1050a.g(d12);
            dArr[0] = (c1050aArr[0].a() * d13) + c1050aArr[0].e();
            dArr[1] = (d13 * c1050aArr[0].b()) + c1050aArr[0].f();
            return;
        }
        if (d11 <= c1050aArr[c1050aArr.length - 1].f64625d) {
            for (int i11 = 0; i11 < c1050aArr.length; i11++) {
                C1050a c1050a3 = c1050aArr[i11];
                if (d11 <= c1050a3.f64625d) {
                    if (c1050a3.f64639r) {
                        dArr[0] = c1050a3.c(d11);
                        dArr[1] = c1050aArr[i11].d(d11);
                        return;
                    } else {
                        c1050a3.g(d11);
                        dArr[0] = c1050aArr[i11].e();
                        dArr[1] = c1050aArr[i11].f();
                        return;
                    }
                }
            }
            return;
        }
        double d14 = c1050aArr[c1050aArr.length - 1].f64625d;
        double d15 = d11 - d14;
        int length = c1050aArr.length - 1;
        C1050a c1050a4 = c1050aArr[length];
        if (c1050a4.f64639r) {
            double c12 = c1050a4.c(d14);
            C1050a c1050a5 = c1050aArr[length];
            dArr[0] = (c1050a5.f64633l * d15) + c12;
            dArr[1] = (d15 * c1050aArr[length].f64634m) + c1050a5.d(d14);
            return;
        }
        c1050a4.g(d11);
        dArr[0] = (c1050aArr[length].a() * d15) + c1050aArr[length].e();
        dArr[1] = (d15 * c1050aArr[length].b()) + c1050aArr[length].f();
    }

    @Override // h2.AbstractC6784b
    public final void d(double d11, float[] fArr) {
        C1050a[] c1050aArr = this.f64620b;
        C1050a c1050a = c1050aArr[0];
        double d12 = c1050a.f64624c;
        if (d11 < d12) {
            double d13 = d11 - d12;
            if (c1050a.f64639r) {
                double c11 = c1050a.c(d12);
                C1050a c1050a2 = c1050aArr[0];
                fArr[0] = (float) ((c1050a2.f64633l * d13) + c11);
                fArr[1] = (float) ((d13 * c1050aArr[0].f64634m) + c1050a2.d(d12));
                return;
            }
            c1050a.g(d12);
            fArr[0] = (float) ((c1050aArr[0].a() * d13) + c1050aArr[0].e());
            fArr[1] = (float) ((d13 * c1050aArr[0].b()) + c1050aArr[0].f());
            return;
        }
        if (d11 <= c1050aArr[c1050aArr.length - 1].f64625d) {
            for (int i11 = 0; i11 < c1050aArr.length; i11++) {
                C1050a c1050a3 = c1050aArr[i11];
                if (d11 <= c1050a3.f64625d) {
                    if (c1050a3.f64639r) {
                        fArr[0] = (float) c1050a3.c(d11);
                        fArr[1] = (float) c1050aArr[i11].d(d11);
                        return;
                    } else {
                        c1050a3.g(d11);
                        fArr[0] = (float) c1050aArr[i11].e();
                        fArr[1] = (float) c1050aArr[i11].f();
                        return;
                    }
                }
            }
            return;
        }
        double d14 = c1050aArr[c1050aArr.length - 1].f64625d;
        double d15 = d11 - d14;
        int length = c1050aArr.length - 1;
        C1050a c1050a4 = c1050aArr[length];
        if (!c1050a4.f64639r) {
            c1050a4.g(d11);
            fArr[0] = (float) c1050aArr[length].e();
            fArr[1] = (float) c1050aArr[length].f();
        } else {
            double c12 = c1050a4.c(d14);
            C1050a c1050a5 = c1050aArr[length];
            fArr[0] = (float) ((c1050a5.f64633l * d15) + c12);
            fArr[1] = (float) ((d15 * c1050aArr[length].f64634m) + c1050a5.d(d14));
        }
    }

    @Override // h2.AbstractC6784b
    public final void e(double d11, double[] dArr) {
        C1050a[] c1050aArr = this.f64620b;
        double d12 = c1050aArr[0].f64624c;
        if (d11 < d12) {
            d11 = d12;
        } else if (d11 > c1050aArr[c1050aArr.length - 1].f64625d) {
            d11 = c1050aArr[c1050aArr.length - 1].f64625d;
        }
        for (int i11 = 0; i11 < c1050aArr.length; i11++) {
            C1050a c1050a = c1050aArr[i11];
            if (d11 <= c1050a.f64625d) {
                if (c1050a.f64639r) {
                    dArr[0] = c1050a.f64633l;
                    dArr[1] = c1050a.f64634m;
                    return;
                } else {
                    c1050a.g(d11);
                    dArr[0] = c1050aArr[i11].a();
                    dArr[1] = c1050aArr[i11].b();
                    return;
                }
            }
        }
    }

    @Override // h2.AbstractC6784b
    public final double[] f() {
        return this.f64619a;
    }
}
