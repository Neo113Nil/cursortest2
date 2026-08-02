package c1;

import e1.AbstractC4134a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f26798a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26799b;

    /* renamed from: c, reason: collision with root package name */
    public final float f26800c;

    /* renamed from: d, reason: collision with root package name */
    public final float f26801d;
    private final short[] downSampleBuffer;

    /* renamed from: e, reason: collision with root package name */
    public final float f26802e;

    /* renamed from: f, reason: collision with root package name */
    public final int f26803f;

    /* renamed from: g, reason: collision with root package name */
    public final int f26804g;

    /* renamed from: h, reason: collision with root package name */
    public final int f26805h;

    /* renamed from: i, reason: collision with root package name */
    public int f26806i;
    private short[] inputBuffer;

    /* renamed from: j, reason: collision with root package name */
    public int f26807j;

    /* renamed from: k, reason: collision with root package name */
    public int f26808k;

    /* renamed from: l, reason: collision with root package name */
    public int f26809l;

    /* renamed from: m, reason: collision with root package name */
    public int f26810m;

    /* renamed from: n, reason: collision with root package name */
    public int f26811n;

    /* renamed from: o, reason: collision with root package name */
    public int f26812o;
    private short[] outputBuffer;

    /* renamed from: p, reason: collision with root package name */
    public int f26813p;
    private short[] pitchBuffer;

    /* renamed from: q, reason: collision with root package name */
    public int f26814q;

    /* renamed from: r, reason: collision with root package name */
    public int f26815r;

    /* renamed from: s, reason: collision with root package name */
    public double f26816s;

    public u(int i10, int i11, float f10, float f11, int i12) {
        this.f26798a = i10;
        this.f26799b = i11;
        this.f26800c = f10;
        this.f26801d = f11;
        this.f26802e = i10 / i12;
        this.f26803f = i10 / 400;
        int i13 = i10 / 65;
        this.f26804g = i13;
        int i14 = i13 * 2;
        this.f26805h = i14;
        this.downSampleBuffer = new short[i14];
        this.inputBuffer = new short[i14 * i11];
        this.outputBuffer = new short[i14 * i11];
        this.pitchBuffer = new short[i14 * i11];
    }

    public static long b(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        RoundingMode roundingMode = RoundingMode.HALF_EVEN;
        BigDecimal divide = bigDecimal.divide(bigDecimal2, 20, roundingMode);
        BigDecimal divide2 = bigDecimal2.divide(bigDecimal3, 20, roundingMode);
        RoundingMode roundingMode2 = RoundingMode.FLOOR;
        return divide.multiply(divide2.subtract(divide2.setScale(0, roundingMode2))).setScale(0, roundingMode2).longValueExact();
    }

    public static long k(int i10, int i11, float f10, float f11, long j10) {
        float f12 = (i10 / i11) * f11;
        double d10 = f10 / f11;
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(f12));
        BigDecimal valueOf = BigDecimal.valueOf(j10);
        if (d10 > 1.0000100135803223d || d10 < 0.9999899864196777d) {
            valueOf = valueOf.divide(BigDecimal.valueOf(d10), RoundingMode.HALF_EVEN);
        }
        return f12 == 1.0f ? valueOf.longValueExact() : valueOf.divide(bigDecimal, RoundingMode.HALF_EVEN).longValueExact() - b(valueOf, BigDecimal.valueOf(i10), bigDecimal);
    }

    public static void r(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    public final void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f26807j == i10) {
            return;
        }
        int i13 = this.f26798a;
        long j10 = (long) (i13 / f10);
        long j11 = i13;
        while (j10 != 0 && j11 != 0 && j10 % 2 == 0 && j11 % 2 == 0) {
            j10 /= 2;
            j11 /= 2;
        }
        q(i10);
        int i14 = 0;
        while (true) {
            int i15 = this.f26808k;
            if (i14 >= i15 - 1) {
                w(i15 - 1);
                return;
            }
            while (true) {
                i11 = this.f26809l;
                long j12 = (i11 + 1) * j10;
                i12 = this.f26810m;
                if (j12 <= i12 * j11) {
                    break;
                }
                this.outputBuffer = g(this.outputBuffer, this.f26807j, 1);
                int i16 = 0;
                while (true) {
                    int i17 = this.f26799b;
                    if (i16 < i17) {
                        this.outputBuffer[(this.f26807j * i17) + i16] = p(this.pitchBuffer, (i17 * i14) + i16, j11, j10);
                        i16++;
                    }
                }
                this.f26810m++;
                this.f26807j++;
            }
            int i18 = i11 + 1;
            this.f26809l = i18;
            if (i18 == j11) {
                this.f26809l = 0;
                AbstractC4134a.g(((long) i12) == j10);
                this.f26810m = 0;
            }
            i14++;
        }
    }

    public final void c(double d10) {
        u uVar;
        double d11;
        int i10 = this.f26806i;
        if (i10 < this.f26805h) {
            return;
        }
        int i11 = 0;
        while (true) {
            if (this.f26811n > 0) {
                i11 += d(i11);
                uVar = this;
                d11 = d10;
            } else {
                int h10 = h(this.inputBuffer, i11);
                if (d10 > 1.0d) {
                    uVar = this;
                    d11 = d10;
                    i11 += h10 + uVar.y(this.inputBuffer, i11, d11, h10);
                } else {
                    uVar = this;
                    d11 = d10;
                    i11 += uVar.o(uVar.inputBuffer, i11, d11, h10);
                }
            }
            if (uVar.f26805h + i11 > i10) {
                x(i11);
                return;
            }
            d10 = d11;
        }
    }

    public final int d(int i10) {
        int min = Math.min(this.f26805h, this.f26811n);
        e(this.inputBuffer, i10, min);
        this.f26811n -= min;
        return min;
    }

    public final void e(short[] sArr, int i10, int i11) {
        short[] g10 = g(this.outputBuffer, this.f26807j, i11);
        this.outputBuffer = g10;
        int i12 = this.f26799b;
        System.arraycopy(sArr, i10 * i12, g10, this.f26807j * i12, i12 * i11);
        this.f26807j += i11;
    }

    public final void f(short[] sArr, int i10, int i11) {
        int i12 = this.f26805h / i11;
        int i13 = this.f26799b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.downSampleBuffer[i16] = (short) (i17 / i14);
        }
    }

    public final short[] g(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f26799b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int h(short[] sArr, int i10) {
        int i11;
        int i12 = this.f26798a;
        int i13 = i12 > 4000 ? i12 / 4000 : 1;
        if (this.f26799b == 1 && i13 == 1) {
            i11 = i(sArr, i10, this.f26803f, this.f26804g);
        } else {
            f(sArr, i10, i13);
            int i14 = i(this.downSampleBuffer, 0, this.f26803f / i13, this.f26804g / i13);
            if (i13 != 1) {
                int i15 = i14 * i13;
                int i16 = i13 * 4;
                int i17 = i15 - i16;
                int i18 = i15 + i16;
                int i19 = this.f26803f;
                if (i17 < i19) {
                    i17 = i19;
                }
                int i20 = this.f26804g;
                if (i18 > i20) {
                    i18 = i20;
                }
                if (this.f26799b == 1) {
                    i11 = i(sArr, i10, i17, i18);
                } else {
                    f(sArr, i10, 1);
                    i11 = i(this.downSampleBuffer, 0, i17, i18);
                }
            } else {
                i11 = i14;
            }
        }
        int i21 = s(this.f26814q, this.f26815r) ? this.f26812o : i11;
        this.f26813p = this.f26814q;
        this.f26812o = i11;
        return i21;
    }

    public final int i(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f26799b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                i18 += Math.abs(sArr[i13 + i19] - sArr[(i13 + i11) + i19]);
            }
            if (i18 * i16 < i15 * i11) {
                i16 = i11;
                i15 = i18;
            }
            if (i18 * i14 > i17 * i11) {
                i14 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.f26814q = i15 / i16;
        this.f26815r = i17 / i14;
        return i16;
    }

    public void j() {
        this.f26806i = 0;
        this.f26807j = 0;
        this.f26808k = 0;
        this.f26809l = 0;
        this.f26810m = 0;
        this.f26811n = 0;
        this.f26812o = 0;
        this.f26813p = 0;
        this.f26814q = 0;
        this.f26815r = 0;
        this.f26816s = 0.0d;
    }

    public void l(ShortBuffer shortBuffer) {
        AbstractC4134a.g(this.f26807j >= 0);
        int min = Math.min(shortBuffer.remaining() / this.f26799b, this.f26807j);
        shortBuffer.put(this.outputBuffer, 0, this.f26799b * min);
        int i10 = this.f26807j - min;
        this.f26807j = i10;
        short[] sArr = this.outputBuffer;
        int i11 = this.f26799b;
        System.arraycopy(sArr, min * i11, sArr, 0, i10 * i11);
    }

    public int m() {
        AbstractC4134a.g(this.f26807j >= 0);
        return this.f26807j * this.f26799b * 2;
    }

    public int n() {
        return this.f26806i * this.f26799b * 2;
    }

    public final int o(short[] sArr, int i10, double d10, int i11) {
        int i12;
        if (d10 < 0.5d) {
            double d11 = ((i11 * d10) / (1.0d - d10)) + this.f26816s;
            int round = (int) Math.round(d11);
            this.f26816s = d11 - round;
            i12 = round;
        } else {
            double d12 = ((i11 * ((2.0d * d10) - 1.0d)) / (1.0d - d10)) + this.f26816s;
            int round2 = (int) Math.round(d12);
            this.f26811n = round2;
            this.f26816s = d12 - round2;
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] g10 = g(this.outputBuffer, this.f26807j, i13);
        this.outputBuffer = g10;
        int i14 = this.f26799b;
        System.arraycopy(sArr, i10 * i14, g10, this.f26807j * i14, i14 * i11);
        r(i12, this.f26799b, this.outputBuffer, this.f26807j + i11, sArr, i10 + i11, sArr, i10);
        this.f26807j += i13;
        return i12;
    }

    public final short p(short[] sArr, int i10, long j10, long j11) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f26799b];
        long j12 = this.f26810m * j10;
        long j13 = this.f26809l * j11;
        long j14 = (r7 + 1) * j11;
        long j15 = j14 - j12;
        long j16 = j14 - j13;
        return (short) (((s10 * j15) + ((j16 - j15) * s11)) / j16);
    }

    public final void q(int i10) {
        int i11 = this.f26807j - i10;
        short[] g10 = g(this.pitchBuffer, this.f26808k, i11);
        this.pitchBuffer = g10;
        short[] sArr = this.outputBuffer;
        int i12 = this.f26799b;
        System.arraycopy(sArr, i10 * i12, g10, this.f26808k * i12, i12 * i11);
        this.f26807j = i10;
        this.f26808k += i11;
    }

    public final boolean s(int i10, int i11) {
        return i10 != 0 && this.f26812o != 0 && i11 <= i10 * 3 && i10 * 2 > this.f26813p * 3;
    }

    public final void t() {
        int i10 = this.f26807j;
        float f10 = this.f26800c;
        float f11 = this.f26801d;
        double d10 = f10 / f11;
        float f12 = this.f26802e * f11;
        if (d10 > 1.0000100135803223d || d10 < 0.9999899864196777d) {
            c(d10);
        } else {
            e(this.inputBuffer, 0, this.f26806i);
            this.f26806i = 0;
        }
        if (f12 != 1.0f) {
            a(f12, i10);
        }
    }

    public void u() {
        int i10;
        int i11 = this.f26806i;
        float f10 = this.f26800c;
        float f11 = this.f26801d;
        double d10 = f10 / f11;
        int i12 = this.f26807j + ((int) (((((((i11 - r5) / d10) + this.f26811n) + this.f26816s) + this.f26808k) / (this.f26802e * f11)) + 0.5d));
        this.f26816s = 0.0d;
        this.inputBuffer = g(this.inputBuffer, i11, (this.f26805h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f26805h;
            int i14 = this.f26799b;
            if (i13 >= i10 * 2 * i14) {
                break;
            }
            this.inputBuffer[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f26806i += i10 * 2;
        t();
        if (this.f26807j > i12) {
            this.f26807j = Math.max(i12, 0);
        }
        this.f26806i = 0;
        this.f26811n = 0;
        this.f26808k = 0;
    }

    public void v(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.f26799b;
        int i11 = remaining / i10;
        short[] g10 = g(this.inputBuffer, this.f26806i, i11);
        this.inputBuffer = g10;
        shortBuffer.get(g10, this.f26806i * this.f26799b, ((i10 * i11) * 2) / 2);
        this.f26806i += i11;
        t();
    }

    public final void w(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.pitchBuffer;
        int i11 = this.f26799b;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f26808k - i10) * i11);
        this.f26808k -= i10;
    }

    public final void x(int i10) {
        int i11 = this.f26806i - i10;
        short[] sArr = this.inputBuffer;
        int i12 = this.f26799b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f26806i = i11;
    }

    public final int y(short[] sArr, int i10, double d10, int i11) {
        int i12;
        if (d10 >= 2.0d) {
            double d11 = (i11 / (d10 - 1.0d)) + this.f26816s;
            int round = (int) Math.round(d11);
            this.f26816s = d11 - round;
            i12 = round;
        } else {
            double d12 = ((i11 * (2.0d - d10)) / (d10 - 1.0d)) + this.f26816s;
            int round2 = (int) Math.round(d12);
            this.f26811n = round2;
            this.f26816s = d12 - round2;
            i12 = i11;
        }
        short[] g10 = g(this.outputBuffer, this.f26807j, i12);
        this.outputBuffer = g10;
        r(i12, this.f26799b, g10, this.f26807j, sArr, i10, sArr, i10 + i11);
        this.f26807j += i12;
        return i12;
    }
}
