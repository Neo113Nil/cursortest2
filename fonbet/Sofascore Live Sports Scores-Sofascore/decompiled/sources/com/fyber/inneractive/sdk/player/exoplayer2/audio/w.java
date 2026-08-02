package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import defpackage.bf3;
import defpackage.zzl;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class w {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final short[] f;
    public int g;
    public short[] h;
    public int i;
    public short[] j;
    public int k;
    public short[] l;
    public int q;
    public int r;
    public int s;
    public int t;
    public int v;
    public int w;
    public int x;
    public int m = 0;
    public int n = 0;
    public int u = 0;
    public float o = 1.0f;
    public float p = 1.0f;

    public w(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = i / 400;
        int i3 = i / 65;
        this.d = i3;
        int i4 = i3 * 2;
        this.e = i4;
        this.f = new short[i4];
        this.g = i4;
        int i5 = i2 * i4;
        this.h = new short[i5];
        this.i = i4;
        this.j = new short[i5];
        this.k = i4;
        this.l = new short[i5];
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x024f A[LOOP:4: B:56:0x0048->B:62:0x024f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0173 A[EDGE_INSN: B:63:0x0173->B:64:0x0173 BREAK  A[LOOP:4: B:56:0x0048->B:62:0x024f], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i;
        int i2;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9 = this.r;
        float f3 = this.o / this.p;
        double d = f3;
        float f4 = 1.0f;
        int i10 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i11 = this.q;
            if (i11 >= this.e) {
                int i12 = 0;
                while (true) {
                    int i13 = this.t;
                    if (i13 > 0) {
                        i4 = Math.min(this.e, i13);
                        short[] sArr = this.h;
                        b(i4);
                        int i14 = this.b;
                        System.arraycopy(sArr, i12 * i14, this.j, this.r * i14, i14 * i4);
                        this.r += i4;
                        this.t -= i4;
                        f = f4;
                        i3 = i10;
                    } else {
                        short[] sArr2 = this.h;
                        int i15 = this.a;
                        int i16 = i15 > 4000 ? i15 / 4000 : i10;
                        if (this.b == i10 && i16 == i10) {
                            i = a(sArr2, i12, this.c, this.d);
                        } else {
                            a(sArr2, i12, i16);
                            int a = a(this.f, 0, this.c / i16, this.d / i16);
                            if (i16 != i10) {
                                int i17 = a * i16;
                                int i18 = i16 * 4;
                                int i19 = i17 - i18;
                                int i20 = i17 + i18;
                                int i21 = this.c;
                                if (i19 < i21) {
                                    i19 = i21;
                                }
                                int i22 = this.d;
                                if (i20 > i22) {
                                    i20 = i22;
                                }
                                if (this.b == i10) {
                                    i = a(sArr2, i12, i19, i20);
                                } else {
                                    a(sArr2, i12, i10);
                                    i = a(this.f, 0, i19, i20);
                                }
                            } else {
                                i = a;
                            }
                        }
                        int i23 = this.w;
                        int i24 = (i23 == 0 || (i6 = this.u) == 0 || this.x > i23 * 3 || i23 * 2 <= this.v * 3) ? i : i6;
                        this.v = i23;
                        this.u = i;
                        short[] sArr3 = this.h;
                        if (d > 1.0d) {
                            if (f3 >= 2.0f) {
                                i5 = (int) (i24 / (f3 - f4));
                            } else {
                                this.t = (int) (((2.0f - f3) * i24) / (f3 - f4));
                                i5 = i24;
                            }
                            b(i5);
                            int i25 = i24;
                            a(i5, this.b, this.j, this.r, sArr3, i12, sArr3, i12 + i25);
                            this.r += i5;
                            f = f4;
                            i3 = i10;
                            i12 = i25 + i5 + i12;
                            if (this.e + i12 <= i11) {
                                break;
                            }
                            f4 = f;
                            i10 = i3;
                        } else {
                            int i26 = i24;
                            if (f3 < 0.5f) {
                                i2 = (int) ((i26 * f3) / (f4 - f3));
                            } else {
                                this.t = (int) ((((2.0f * f3) - f4) * i26) / (f4 - f3));
                                i2 = i26;
                            }
                            int i27 = i26 + i2;
                            b(i27);
                            int i28 = this.b;
                            f = f4;
                            i3 = i10;
                            System.arraycopy(sArr3, i12 * i28, this.j, this.r * i28, i28 * i26);
                            int i29 = i12;
                            a(i2, this.b, this.j, this.r + i26, sArr3, i12 + i26, sArr3, i29);
                            i12 = i29;
                            this.r += i27;
                            i4 = i2;
                        }
                    }
                    i12 += i4;
                    if (this.e + i12 <= i11) {
                    }
                }
                int i30 = this.q - i12;
                short[] sArr4 = this.h;
                int i31 = this.b;
                System.arraycopy(sArr4, i12 * i31, sArr4, 0, i31 * i30);
                this.q = i30;
                f2 = this.p;
                if (f2 != f || this.r == i9) {
                }
                int i32 = this.a;
                int i33 = (int) (i32 / f2);
                while (true) {
                    if (i33 <= 16384 && i32 <= 16384) {
                        break;
                    }
                    i33 /= 2;
                    i32 /= 2;
                }
                int i34 = this.r - i9;
                int i35 = this.s + i34;
                int i36 = this.k;
                if (i35 > i36) {
                    int i37 = (i36 / 2) + i34 + i36;
                    this.k = i37;
                    this.l = Arrays.copyOf(this.l, i37 * this.b);
                }
                short[] sArr5 = this.j;
                int i38 = this.b;
                System.arraycopy(sArr5, i9 * i38, this.l, this.s * i38, i38 * i34);
                this.r = i9;
                this.s += i34;
                int i39 = 0;
                while (true) {
                    int i40 = this.s;
                    int i41 = i40 - 1;
                    if (i39 >= i41) {
                        if (i41 == 0) {
                            return;
                        }
                        short[] sArr6 = this.l;
                        int i42 = this.b;
                        System.arraycopy(sArr6, i41 * i42, sArr6, 0, (i40 - i41) * i42);
                        this.s -= i41;
                        return;
                    }
                    while (true) {
                        i7 = this.m + 1;
                        int i43 = i7 * i33;
                        i8 = this.n;
                        if (i43 <= i8 * i32) {
                            break;
                        }
                        b(i3);
                        int i44 = 0;
                        while (true) {
                            int i45 = this.b;
                            if (i44 < i45) {
                                short[] sArr7 = this.j;
                                int i46 = (this.r * i45) + i44;
                                short[] sArr8 = this.l;
                                int i47 = (i39 * i45) + i44;
                                short s = sArr8[i47];
                                short s2 = sArr8[i47 + i45];
                                int i48 = this.n * i32;
                                int i49 = this.m;
                                int i50 = i49 * i33;
                                int i51 = (i49 + 1) * i33;
                                int i52 = i51 - i48;
                                int i53 = i51 - i50;
                                sArr7[i46] = (short) ((((i53 - i52) * s2) + (s * i52)) / i53);
                                i44++;
                            }
                        }
                        i3 = 1;
                        this.n++;
                        this.r++;
                    }
                    this.m = i7;
                    if (i7 == i32) {
                        this.m = 0;
                        if (i8 != i33) {
                            zzl.s();
                            return;
                        }
                        this.n = 0;
                    }
                    i39++;
                }
            }
        } else {
            short[] sArr9 = this.h;
            int i54 = this.q;
            b(i54);
            int i55 = this.b;
            System.arraycopy(sArr9, 0, this.j, this.r * i55, i55 * i54);
            this.r += i54;
            this.q = 0;
        }
        f = 1.0f;
        i3 = 1;
        f2 = this.p;
        if (f2 != f) {
        }
    }

    public final void b(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        if (i2 > i3) {
            int i4 = (i3 / 2) + i + i3;
            this.i = i4;
            this.j = Arrays.copyOf(this.j, i4 * this.b);
        }
    }

    public final void a(short[] sArr, int i, int i2) {
        int i3 = this.e / i2;
        int i4 = this.b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[bf3.c(i7, i5, i6, i9)];
            }
            this.f[i7] = (short) (i8 / i5);
        }
    }

    public final int a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.b;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
            }
            if (i9 * i7 < i6 * i2) {
                i7 = i2;
                i6 = i9;
            }
            if (i9 * i5 > i8 * i2) {
                i5 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.w = i6 / i7;
        this.x = i8 / i5;
        return i7;
    }

    public final void a(int i) {
        int i2 = this.q + i;
        int i3 = this.g;
        if (i2 > i3) {
            int i4 = (i3 / 2) + i + i3;
            this.g = i4;
            this.h = Arrays.copyOf(this.h, i4 * this.b);
        }
    }

    public static void a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }
}
