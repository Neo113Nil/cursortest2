package k3;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes8.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private final int f70395a;

    /* renamed from: b, reason: collision with root package name */
    private final int f70396b;

    /* renamed from: c, reason: collision with root package name */
    private final float f70397c;

    /* renamed from: d, reason: collision with root package name */
    private final float f70398d;

    /* renamed from: e, reason: collision with root package name */
    private final float f70399e;

    /* renamed from: f, reason: collision with root package name */
    private final int f70400f;

    /* renamed from: g, reason: collision with root package name */
    private final int f70401g;

    /* renamed from: h, reason: collision with root package name */
    private final int f70402h;

    /* renamed from: i, reason: collision with root package name */
    private final short[] f70403i;

    /* renamed from: j, reason: collision with root package name */
    private short[] f70404j;

    /* renamed from: k, reason: collision with root package name */
    private int f70405k;

    /* renamed from: l, reason: collision with root package name */
    private short[] f70406l;

    /* renamed from: m, reason: collision with root package name */
    private int f70407m;

    /* renamed from: n, reason: collision with root package name */
    private short[] f70408n;

    /* renamed from: o, reason: collision with root package name */
    private int f70409o;

    /* renamed from: p, reason: collision with root package name */
    private int f70410p;

    /* renamed from: q, reason: collision with root package name */
    private int f70411q;

    /* renamed from: r, reason: collision with root package name */
    private int f70412r;

    /* renamed from: s, reason: collision with root package name */
    private int f70413s;

    /* renamed from: t, reason: collision with root package name */
    private int f70414t;

    /* renamed from: u, reason: collision with root package name */
    private int f70415u;

    /* renamed from: v, reason: collision with root package name */
    private int f70416v;

    /* renamed from: w, reason: collision with root package name */
    private double f70417w;

    public h(int i11, int i12, float f7, float f11, int i13) {
        this.f70395a = i11;
        this.f70396b = i12;
        this.f70397c = f7;
        this.f70398d = f11;
        this.f70399e = i11 / i13;
        this.f70400f = i11 / 400;
        int i14 = i11 / 65;
        this.f70401g = i14;
        int i15 = i14 * 2;
        this.f70402h = i15;
        this.f70403i = new short[i15];
        this.f70404j = new short[i15 * i12];
        this.f70406l = new short[i15 * i12];
        this.f70408n = new short[i15 * i12];
    }

    private void a(short[] sArr, int i11, int i12) {
        short[] c11 = c(this.f70406l, this.f70407m, i12);
        this.f70406l = c11;
        int i13 = this.f70396b;
        System.arraycopy(sArr, i11 * i13, c11, this.f70407m * i13, i13 * i12);
        this.f70407m += i12;
    }

    private void b(short[] sArr, int i11, int i12) {
        int i13 = this.f70402h / i12;
        int i14 = this.f70396b;
        int i15 = i12 * i14;
        int i16 = i11 * i14;
        for (int i17 = 0; i17 < i13; i17++) {
            int i18 = 0;
            for (int i19 = 0; i19 < i15; i19++) {
                i18 += sArr[(i17 * i15) + i16 + i19];
            }
            this.f70403i[i17] = (short) (i18 / i15);
        }
    }

    private short[] c(short[] sArr, int i11, int i12) {
        int length = sArr.length;
        int i13 = this.f70396b;
        int i14 = length / i13;
        return i11 + i12 <= i14 ? sArr : Arrays.copyOf(sArr, (((i14 * 3) / 2) + i12) * i13);
    }

    private int d(short[] sArr, int i11, int i12, int i13) {
        int i14 = i11 * this.f70396b;
        int i15 = 255;
        int i16 = 1;
        int i17 = 0;
        int i18 = 0;
        while (i12 <= i13) {
            int i19 = 0;
            for (int i21 = 0; i21 < i12; i21++) {
                i19 += Math.abs(sArr[i14 + i21] - sArr[(i14 + i12) + i21]);
            }
            if (i19 * i17 < i16 * i12) {
                i17 = i12;
                i16 = i19;
            }
            if (i19 * i15 > i18 * i12) {
                i15 = i12;
                i18 = i19;
            }
            i12++;
        }
        this.f70415u = i16 / i17;
        this.f70416v = i18 / i15;
        return i17;
    }

    private static void i(int i11, int i12, short[] sArr, int i13, short[] sArr2, int i14, short[] sArr3, int i15) {
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = (i13 * i12) + i16;
            int i18 = (i15 * i12) + i16;
            int i19 = (i14 * i12) + i16;
            for (int i21 = 0; i21 < i11; i21++) {
                sArr[i17] = (short) (((sArr3[i18] * i21) + ((i11 - i21) * sArr2[i19])) / i11);
                i17 += i12;
                i19 += i12;
                i18 += i12;
            }
        }
    }

    private void j() {
        float f7;
        double d11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j11;
        long j12;
        int i18 = this.f70407m;
        float f11 = this.f70397c;
        float f12 = this.f70398d;
        double d12 = f11 / f12;
        float f13 = this.f70399e * f12;
        int i19 = this.f70395a;
        int i21 = this.f70396b;
        int i22 = 0;
        int i23 = 1;
        if (d12 > 1.0000100135803223d || d12 < 0.9999899864196777d) {
            int i24 = this.f70405k;
            int i25 = this.f70402h;
            if (i24 >= i25) {
                int i26 = 0;
                while (true) {
                    int i27 = this.f70412r;
                    if (i27 > 0) {
                        int min = Math.min(i25, i27);
                        a(this.f70404j, i26, min);
                        this.f70412r -= min;
                        i26 += min;
                        f7 = f13;
                        d11 = d12;
                    } else {
                        short[] sArr = this.f70404j;
                        int i28 = i19 > 4000 ? i19 / 4000 : i23;
                        int i29 = this.f70401g;
                        int i31 = this.f70400f;
                        if (i21 == i23 && i28 == i23) {
                            i11 = d(sArr, i26, i31, i29);
                            f7 = f13;
                            d11 = d12;
                        } else {
                            b(sArr, i26, i28);
                            f7 = f13;
                            d11 = d12;
                            short[] sArr2 = this.f70403i;
                            int d13 = d(sArr2, i22, i31 / i28, i29 / i28);
                            if (i28 != 1) {
                                int i32 = d13 * i28;
                                int i33 = i28 * 4;
                                int i34 = i32 - i33;
                                int i35 = i32 + i33;
                                if (i34 >= i31) {
                                    i31 = i34;
                                }
                                if (i35 <= i29) {
                                    i29 = i35;
                                }
                                if (i21 == 1) {
                                    i11 = d(sArr, i26, i31, i29);
                                } else {
                                    b(sArr, i26, 1);
                                    i11 = d(sArr2, i22, i31, i29);
                                }
                            } else {
                                i11 = d13;
                            }
                        }
                        int i36 = this.f70415u;
                        int i37 = this.f70416v;
                        if (i36 == 0 || (i12 = this.f70413s) == 0 || i37 > i36 * 3 || i36 * 2 <= this.f70414t * 3) {
                            i12 = i11;
                        }
                        this.f70414t = i36;
                        this.f70413s = i11;
                        if (d11 > 1.0d) {
                            short[] sArr3 = this.f70404j;
                            if (d11 >= 2.0d) {
                                double d14 = (i12 / (d11 - 1.0d)) + this.f70417w;
                                i14 = (int) Math.round(d14);
                                this.f70417w = d14 - i14;
                            } else {
                                double d15 = (((2.0d - d11) * i12) / (d11 - 1.0d)) + this.f70417w;
                                int round = (int) Math.round(d15);
                                this.f70412r = round;
                                this.f70417w = d15 - round;
                                i14 = i12;
                            }
                            short[] c11 = c(this.f70406l, this.f70407m, i14);
                            this.f70406l = c11;
                            int i38 = i26 + i12;
                            int i39 = i26;
                            int i41 = i14;
                            i(i41, this.f70396b, c11, this.f70407m, sArr3, i39, sArr3, i38);
                            this.f70407m += i41;
                            i26 = i12 + i41 + i39;
                        } else {
                            int i42 = i26;
                            short[] sArr4 = this.f70404j;
                            if (d11 < 0.5d) {
                                double d16 = ((i12 * d11) / (1.0d - d11)) + this.f70417w;
                                int round2 = (int) Math.round(d16);
                                this.f70417w = d16 - round2;
                                i13 = round2;
                            } else {
                                double d17 = ((((d11 * 2.0d) - 1.0d) * i12) / (1.0d - d11)) + this.f70417w;
                                int round3 = (int) Math.round(d17);
                                this.f70412r = round3;
                                this.f70417w = d17 - round3;
                                i13 = i12;
                            }
                            int i43 = i12 + i13;
                            short[] c12 = c(this.f70406l, this.f70407m, i43);
                            this.f70406l = c12;
                            System.arraycopy(sArr4, i42 * i21, c12, this.f70407m * i21, i12 * i21);
                            i(i13, this.f70396b, this.f70406l, this.f70407m + i12, sArr4, i42 + i12, sArr4, i42);
                            this.f70407m += i43;
                            i26 = i42 + i13;
                        }
                    }
                    if (i26 + i25 > i24) {
                        break;
                    }
                    i22 = 0;
                    i23 = 1;
                    f13 = f7;
                    d12 = d11;
                }
                int i44 = this.f70405k - i26;
                short[] sArr5 = this.f70404j;
                System.arraycopy(sArr5, i26 * i21, sArr5, 0, i44 * i21);
                this.f70405k = i44;
                if (f7 != 1.0f || this.f70407m == i18) {
                }
                long j13 = (long) (i19 / f7);
                long j14 = i19;
                while (j13 != 0 && j14 != 0 && j13 % 2 == 0 && j14 % 2 == 0) {
                    j13 /= 2;
                    j14 /= 2;
                }
                int i45 = this.f70407m - i18;
                short[] c13 = c(this.f70408n, this.f70409o, i45);
                this.f70408n = c13;
                System.arraycopy(this.f70406l, i18 * i21, c13, this.f70409o * i21, i45 * i21);
                this.f70407m = i18;
                this.f70409o += i45;
                int i46 = 0;
                while (true) {
                    i15 = this.f70409o;
                    i16 = i15 - 1;
                    if (i46 >= i16) {
                        break;
                    }
                    while (true) {
                        i17 = this.f70410p + 1;
                        j11 = i17;
                        long j15 = j11 * j13;
                        j12 = this.f70411q;
                        if (j15 <= j12 * j14) {
                            break;
                        }
                        this.f70406l = c(this.f70406l, this.f70407m, 1);
                        int i47 = 0;
                        while (i47 < i21) {
                            short[] sArr6 = this.f70406l;
                            int i48 = (this.f70407m * i21) + i47;
                            short[] sArr7 = this.f70408n;
                            int i49 = (i46 * i21) + i47;
                            short s11 = sArr7[i49];
                            short s12 = sArr7[i49 + i21];
                            long j16 = j13;
                            int i51 = i46;
                            long j17 = (r12 + 1) * j16;
                            long j18 = j17 - (this.f70411q * j14);
                            long j19 = j17 - (this.f70410p * j16);
                            sArr6[i48] = (short) ((((j19 - j18) * s12) + (s11 * j18)) / j19);
                            i47++;
                            i46 = i51;
                            j13 = j16;
                        }
                        this.f70411q++;
                        this.f70407m++;
                        i46 = i46;
                        j13 = j13;
                    }
                    long j21 = j13;
                    int i52 = i46;
                    this.f70410p = i17;
                    if (j11 == j14) {
                        this.f70410p = 0;
                        G10.a.h(j12 == j21);
                        this.f70411q = 0;
                    }
                    i46 = i52 + 1;
                    j13 = j21;
                }
                if (i16 == 0) {
                    return;
                }
                short[] sArr8 = this.f70408n;
                System.arraycopy(sArr8, i16 * i21, sArr8, 0, (i15 - i16) * i21);
                this.f70409o -= i16;
                return;
            }
        } else {
            a(this.f70404j, 0, this.f70405k);
            this.f70405k = 0;
        }
        f7 = f13;
        if (f7 != 1.0f) {
        }
    }

    public final void e() {
        this.f70405k = 0;
        this.f70407m = 0;
        this.f70409o = 0;
        this.f70410p = 0;
        this.f70411q = 0;
        this.f70412r = 0;
        this.f70413s = 0;
        this.f70414t = 0;
        this.f70415u = 0;
        this.f70416v = 0;
        this.f70417w = 0.0d;
    }

    public final void f(ShortBuffer shortBuffer) {
        G10.a.h(this.f70407m >= 0);
        int remaining = shortBuffer.remaining();
        int i11 = this.f70396b;
        int min = Math.min(remaining / i11, this.f70407m);
        shortBuffer.put(this.f70406l, 0, min * i11);
        int i12 = this.f70407m - min;
        this.f70407m = i12;
        short[] sArr = this.f70406l;
        System.arraycopy(sArr, min * i11, sArr, 0, i12 * i11);
    }

    public final int g() {
        G10.a.h(this.f70407m >= 0);
        return this.f70407m * this.f70396b * 2;
    }

    public final int h() {
        return this.f70405k * this.f70396b * 2;
    }

    public final void k() {
        int i11 = this.f70405k;
        float f7 = this.f70397c;
        float f11 = this.f70398d;
        double d11 = f7 / f11;
        int i12 = this.f70407m + ((int) (((((((i11 - r5) / d11) + this.f70412r) + this.f70417w) + this.f70409o) / (this.f70399e * f11)) + 0.5d));
        this.f70417w = 0.0d;
        short[] sArr = this.f70404j;
        int i13 = this.f70402h;
        this.f70404j = c(sArr, i11, (i13 * 2) + i11);
        int i14 = 0;
        while (true) {
            int i15 = this.f70396b;
            if (i14 >= i13 * 2 * i15) {
                break;
            }
            this.f70404j[(i15 * i11) + i14] = 0;
            i14++;
        }
        this.f70405k = (i13 * 2) + this.f70405k;
        j();
        if (this.f70407m > i12) {
            this.f70407m = Math.max(i12, 0);
        }
        this.f70405k = 0;
        this.f70412r = 0;
        this.f70409o = 0;
    }

    public final void l(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i11 = this.f70396b;
        int i12 = remaining / i11;
        short[] c11 = c(this.f70404j, this.f70405k, i12);
        this.f70404j = c11;
        shortBuffer.get(c11, this.f70405k * i11, ((i12 * i11) * 2) / 2);
        this.f70405k += i12;
        j();
    }
}
