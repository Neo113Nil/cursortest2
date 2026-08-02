package defpackage;

import com.google.android.gms.internal.ads.zzguk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vvh {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public double p;
    public final Object q;

    public vvh(int i, int i2, float f, float f2, int i3, boolean z, int i4) {
        switch (i4) {
            case 1:
                this.a = i;
                this.b = i2;
                this.c = f;
                this.d = f2;
                this.e = i / i3;
                this.f = i / 400;
                int i5 = i / 65;
                this.g = i5;
                this.h = i5 + i5;
                this.q = z ? new svh(this, false) : new sah(this, false);
                break;
            default:
                this.a = i;
                this.b = i2;
                this.c = f;
                this.d = f2;
                this.e = i / i3;
                this.f = i / 400;
                int i6 = i / 65;
                this.g = i6;
                this.h = i6 * 2;
                this.q = z ? new svh(this) : new sah(this);
                break;
        }
    }

    public void a(int i, int i2) {
        tvh tvhVar = (tvh) this.q;
        tvhVar.g(i2);
        Object s = tvhVar.s();
        int i3 = this.b;
        System.arraycopy(s, i * i3, tvhVar.t(), this.j * i3, i3 * i2);
        this.j += i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        long j2;
        tvh tvhVar = (tvh) this.q;
        int i9 = this.j;
        float f = this.c;
        float f2 = this.d;
        double d = f / f2;
        float f3 = this.e * f2;
        int i10 = this.a;
        int i11 = 1;
        int i12 = this.b;
        if (d > 1.0000100135803223d || d < 0.9999899864196777d) {
            int i13 = this.i;
            int i14 = this.h;
            if (i13 >= i14) {
                int i15 = 0;
                while (true) {
                    int i16 = this.n;
                    if (i16 > 0) {
                        int min = Math.min(i14, i16);
                        a(i15, min);
                        this.n -= min;
                        i15 += min;
                        i = i14;
                        i3 = i11;
                        i4 = i12;
                    } else {
                        int i17 = i10 > 4000 ? i10 / 4000 : i11;
                        int i18 = this.g;
                        int i19 = this.f;
                        if (i12 == i11 && i17 == i11) {
                            i2 = tvhVar.f(i15, i19, i18);
                            i = i14;
                        } else {
                            tvhVar.e(i15, i17);
                            i = i14;
                            int m = tvhVar.m(i19 / i17, i18 / i17);
                            if (i17 != i11) {
                                int i20 = m * i17;
                                int i21 = i17 * 4;
                                int i22 = i20 - i21;
                                int i23 = i20 + i21;
                                if (i22 >= i19) {
                                    i19 = i22;
                                }
                                if (i23 <= i18) {
                                    i18 = i23;
                                }
                                if (i12 == i11) {
                                    i2 = tvhVar.f(i15, i19, i18);
                                } else {
                                    tvhVar.e(i15, i11);
                                    i2 = tvhVar.m(i19, i18);
                                }
                            } else {
                                i2 = m;
                            }
                        }
                        int i24 = tvhVar.h() ? this.o : i2;
                        tvhVar.r();
                        this.o = i2;
                        double d2 = this.p;
                        if (d > 1.0d) {
                            if (d >= 2.0d) {
                                i3 = i11;
                                i4 = i12;
                                double d3 = (i24 / (d - 1.0d)) + d2;
                                i6 = (int) Math.round(d3);
                                this.p = d3 - i6;
                            } else {
                                i3 = i11;
                                i4 = i12;
                                double d4 = (((2.0d - d) * i24) / (d - 1.0d)) + d2;
                                int round = (int) Math.round(d4);
                                this.n = round;
                                this.p = d4 - round;
                                i6 = i24;
                            }
                            tvhVar.g(i6);
                            tvhVar.i(i6, this.b, this.j, i15, i15 + i24);
                            this.j += i6;
                            i15 = i24 + i6 + i15;
                        } else {
                            i3 = i11;
                            i4 = i12;
                            if (d < 0.5d) {
                                double d5 = ((i24 * d) / (1.0d - d)) + d2;
                                i5 = (int) Math.round(d5);
                                this.p = d5 - i5;
                            } else {
                                double d6 = ((((2.0d * d) - 1.0d) * i24) / (1.0d - d)) + d2;
                                int round2 = (int) Math.round(d6);
                                this.n = round2;
                                this.p = d6 - round2;
                                i5 = i24;
                            }
                            int i25 = i24 + i5;
                            tvhVar.g(i25);
                            System.arraycopy(tvhVar.s(), i15 * i4, tvhVar.t(), this.j * i4, i24 * i4);
                            int i26 = i15;
                            tvhVar = tvhVar;
                            tvhVar.i(i5, this.b, this.j + i24, i15 + i24, i26);
                            this.j += i25;
                            i15 = i26 + i5;
                        }
                    }
                    if (i15 + i > i13) {
                        break;
                    }
                    i14 = i;
                    i11 = i3;
                    i12 = i4;
                }
                int i27 = this.i - i15;
                System.arraycopy(tvhVar.s(), i15 * i4, tvhVar.s(), 0, i27 * i4);
                this.i = i27;
                if (f3 != 1.0f || this.j == i9) {
                }
                long j3 = (long) (i10 / f3);
                long j4 = i10;
                while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
                    j3 /= 2;
                    j4 /= 2;
                }
                int i28 = this.j - i9;
                tvhVar.x(i28);
                System.arraycopy(tvhVar.t(), i9 * i4, tvhVar.w(), this.k * i4, i28 * i4);
                this.j = i9;
                this.k += i28;
                int i29 = 0;
                while (true) {
                    i7 = this.k - 1;
                    if (i29 >= i7) {
                        break;
                    }
                    while (true) {
                        i8 = this.l + 1;
                        j = i8;
                        long j5 = j * j3;
                        j2 = this.m;
                        if (j5 <= j2 * j4) {
                            break;
                        }
                        int i30 = i3;
                        tvhVar.g(i30);
                        tvhVar.o(i29, j4, j3);
                        this.m += i30;
                        this.j += i30;
                    }
                    int i31 = i3;
                    this.l = i8;
                    if (j == j4) {
                        this.l = 0;
                        z1a.E(j2 == j3 ? i31 : 0);
                        this.m = 0;
                    }
                    i29++;
                    i3 = i31;
                }
                if (i7 == 0) {
                    return;
                }
                System.arraycopy(tvhVar.w(), i7 * i4, tvhVar.w(), 0, (this.k - i7) * i4);
                this.k -= i7;
                return;
            }
        } else {
            a(0, this.i);
            this.i = 0;
        }
        i3 = 1;
        i4 = i12;
        if (f3 != 1.0f) {
        }
    }

    public void c(int i, int i2) {
        uvn uvnVar = (uvn) this.q;
        uvnVar.d(i2);
        Object zzr = uvnVar.zzr();
        Object zzq = uvnVar.zzq();
        int i3 = this.j;
        int i4 = this.b;
        System.arraycopy(zzr, i * i4, zzq, i3 * i4, i2 * i4);
        this.j += i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        long j2;
        int i8;
        long j3;
        uvn uvnVar = (uvn) this.q;
        float f = this.c;
        float f2 = this.d;
        double d = f / f2;
        int i9 = this.j;
        int i10 = this.a;
        int i11 = this.b;
        int i12 = 1;
        if (d > 1.0000100135803223d || d < 0.9999899864196777d) {
            int i13 = this.i;
            int i14 = this.h;
            if (i13 >= i14) {
                int i15 = 0;
                while (true) {
                    int i16 = this.n;
                    if (i16 > 0) {
                        int min = Math.min(i14, i16);
                        c(i15, min);
                        this.n -= min;
                        i15 += min;
                        i2 = i14;
                    } else {
                        int i17 = i10 > 4000 ? i10 / 4000 : i12;
                        int i18 = this.g;
                        int i19 = this.f;
                        if (i11 != i12) {
                            i = i11;
                        } else if (i17 == i12) {
                            i3 = uvnVar.n(i15, i19, i18);
                            i2 = i14;
                            i = i12;
                            int i20 = !uvnVar.zzc() ? this.o : i3;
                            int i21 = i15 + i20;
                            uvnVar.zzi();
                            this.o = i3;
                            double d2 = i20;
                            double d3 = this.p;
                            if (d <= 1.0d) {
                                double d4 = d - 1.0d;
                                if (d >= 2.0d) {
                                    double d5 = (d2 / d4) + d3;
                                    i5 = (int) Math.round(d5);
                                    this.p = d5 - i5;
                                } else {
                                    double d6 = (((2.0d - d) * d2) / d4) + d3;
                                    int round = (int) Math.round(d6);
                                    this.n = round;
                                    this.p = d6 - round;
                                    i5 = i20;
                                }
                                uvnVar.d(i5);
                                uvnVar.v(i5, i, this.j, i15, i21);
                                this.j += i5;
                                i15 = i20 + i5 + i15;
                            } else {
                                double d7 = 1.0d - d;
                                if (d < 0.5d) {
                                    double d8 = ((d2 * d) / d7) + d3;
                                    i4 = (int) Math.round(d8);
                                    this.p = d8 - i4;
                                } else {
                                    double d9 = ((((d + d) - 1.0d) * d2) / d7) + d3;
                                    int round2 = (int) Math.round(d9);
                                    this.n = round2;
                                    this.p = d9 - round2;
                                    i4 = i20;
                                }
                                int i22 = i20 + i4;
                                uvnVar.d(i22);
                                uvn uvnVar2 = uvnVar;
                                int i23 = i4;
                                int i24 = i15;
                                System.arraycopy(uvnVar2.zzr(), i15 * i, uvnVar2.zzq(), this.j * i, i20 * i);
                                uvnVar = uvnVar2;
                                uvnVar.v(i23, i, this.j + i20, i21, i24);
                                this.j += i22;
                                i15 = i24 + i23;
                            }
                        } else {
                            i = i12;
                        }
                        uvnVar.j(i15, i17);
                        i2 = i14;
                        int l = uvnVar.l(i19 / i17, i18 / i17);
                        if (i17 != 1) {
                            int i25 = l * i17;
                            int i26 = i17 * 4;
                            int i27 = i25 - i26;
                            if (i27 >= i19) {
                                i19 = i27;
                            }
                            int i28 = i25 + i26;
                            if (i28 <= i18) {
                                i18 = i28;
                            }
                            if (i == 1) {
                                i3 = uvnVar.n(i15, i19, i18);
                            } else {
                                uvnVar.j(i15, 1);
                                i3 = uvnVar.l(i19, i18);
                            }
                        } else {
                            i3 = l;
                        }
                        if (!uvnVar.zzc()) {
                        }
                        int i212 = i15 + i20;
                        uvnVar.zzi();
                        this.o = i3;
                        double d22 = i20;
                        double d32 = this.p;
                        if (d <= 1.0d) {
                        }
                    }
                    if (i15 + i2 > i13) {
                        break;
                    }
                    i14 = i2;
                    i12 = 1;
                }
                int i29 = this.i - i15;
                System.arraycopy(uvnVar.zzr(), i15 * i11, uvnVar.zzr(), 0, i29 * i11);
                this.i = i29;
            }
        } else {
            c(0, this.i);
            this.i = 0;
        }
        float f3 = this.e * f2;
        if (f3 == 1.0f || this.j == i9) {
            return;
        }
        long j4 = i10;
        long j5 = (long) (i10 / f3);
        while (j5 != 0 && j4 != 0 && j5 % 2 == 0 && j4 % 2 == 0) {
            j5 /= 2;
            j4 /= 2;
        }
        int i30 = this.j - i9;
        uvnVar.u(i30);
        System.arraycopy(uvnVar.zzq(), i9 * i11, uvnVar.zzp(), this.k * i11, i30 * i11);
        this.j = i9;
        this.k += i30;
        int i31 = 0;
        while (true) {
            i6 = this.k - 1;
            if (i31 >= i6) {
                break;
            }
            while (true) {
                i7 = this.l + 1;
                j = i7;
                long j6 = j * j5;
                j2 = j4;
                i8 = i31;
                j3 = this.m;
                if (j6 <= j3 * j2) {
                    break;
                }
                uvnVar.d(1);
                i31 = i8;
                uvnVar.q(i31, j2, j5);
                this.m++;
                this.j++;
                j4 = j2;
            }
            this.l = i7;
            if (j == j2) {
                this.l = 0;
                zzguk.f(j3 == j5);
                this.m = 0;
            }
            i31 = i8 + 1;
            j4 = j2;
        }
        if (i6 != 0) {
            System.arraycopy(uvnVar.zzp(), i6 * i11, uvnVar.zzp(), 0, (this.k - i6) * i11);
            this.k -= i6;
        }
    }
}
