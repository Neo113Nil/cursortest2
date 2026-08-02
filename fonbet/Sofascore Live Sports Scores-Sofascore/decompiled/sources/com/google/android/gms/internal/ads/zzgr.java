package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import defpackage.lnb;
import defpackage.u0a;
import defpackage.x5n;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgr {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    public static int a(int i, byte[] bArr) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    try {
                        if (i3 >= i - 2) {
                            i3 = i;
                            break;
                        }
                        int i5 = i3 + 1;
                        if (bArr[i3] == 0 && bArr[i5] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3 = i5;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = d;
                    int length = iArr.length;
                    if (length <= i4) {
                        iArr = Arrays.copyOf(iArr, length + length);
                        d = iArr;
                    }
                    iArr[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = d[i8] - i6;
                System.arraycopy(bArr, i6, bArr, i7, i9);
                int i10 = i7 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i7 = i10 + 2;
                bArr[i11] = 0;
                i6 += i9 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i7, i2 - i7);
        }
        return i2;
    }

    public static int b(zzv zzvVar) {
        String l = l(zzvVar);
        if (Objects.equals(l, "video/avc")) {
            return 1;
        }
        return (Objects.equals(l, "video/hevc") || Objects.equals(l, "video/vvc")) ? 2 : 0;
    }

    public static boolean c(byte[] bArr, int i, zzv zzvVar) {
        int i2;
        String str = zzvVar.o;
        if (Objects.equals(str, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i2 = b2 & 31) == 1 || i2 == 9 || i2 == 14)) {
                return false;
            }
        } else if (Objects.equals(str, "video/hevc")) {
            zzgf i3 = i(new zzgz(bArr, 4, i + 4));
            int i4 = i3.a;
            if (i4 == 35) {
                return false;
            }
            if (i4 <= 14 && i4 % 2 == 0 && i3.c == zzvVar.G - 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzgq d(int i, int i2, byte[] bArr) {
        int g;
        int i3;
        int i4;
        int g2;
        int i5;
        int g3;
        boolean d2;
        int i6;
        int i7;
        int i8;
        float f;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        zzgz zzgzVar = new zzgz(bArr, i, i2);
        int e = zzgzVar.e(8);
        int e2 = zzgzVar.e(8);
        int e3 = zzgzVar.e(8);
        int g4 = zzgzVar.g();
        if (e != 100 && e != 110 && e != 122 && e != 244 && e != 44 && e != 83 && e != 86 && e != 118 && e != 128) {
            if (e != 138) {
                g = 1;
                i4 = 16;
                i5 = 0;
                g2 = 0;
                zzgzVar.g();
                g3 = zzgzVar.g();
                if (g3 != 0) {
                    zzgzVar.g();
                } else if (g3 == 1) {
                    zzgzVar.d();
                    zzgzVar.f();
                    zzgzVar.f();
                    long g5 = zzgzVar.g();
                    for (int i17 = 0; i17 < g5; i17++) {
                        zzgzVar.g();
                    }
                }
                zzgzVar.g();
                zzgzVar.a();
                int g6 = zzgzVar.g() + 1;
                int g7 = zzgzVar.g() + 1;
                d2 = zzgzVar.d();
                int i18 = 2 - (d2 ? 1 : 0);
                if (!d2) {
                    zzgzVar.a();
                }
                zzgzVar.a();
                int i19 = g6 * 16;
                int i20 = g7 * i18 * 16;
                if (zzgzVar.d()) {
                    int g8 = zzgzVar.g();
                    int g9 = zzgzVar.g();
                    int g10 = zzgzVar.g();
                    int g11 = zzgzVar.g();
                    if (g == 0) {
                        i16 = 1;
                    } else {
                        int i21 = g == 3 ? 1 : 2;
                        i18 *= g == 1 ? 2 : 1;
                        i16 = i21;
                    }
                    i19 = lnb.x(g8, g9, i16, i19);
                    i20 = lnb.x(g10, g11, i18, i20);
                }
                int i22 = i19;
                int i23 = i20;
                if (e != 44 || e == 86 || e == 100 || e == 110 || e == 122) {
                    i6 = e;
                } else {
                    if (e != 244) {
                        i7 = i4;
                        i8 = e;
                        float f2 = 1.0f;
                        int i24 = -1;
                        if (zzgzVar.d()) {
                            if (zzgzVar.d()) {
                                int e4 = zzgzVar.e(8);
                                if (e4 == 255) {
                                    int i25 = i4;
                                    int e5 = zzgzVar.e(i25);
                                    int e6 = zzgzVar.e(i25);
                                    if (e5 != 0 && e6 != 0) {
                                        f2 = e5 / e6;
                                    }
                                } else if (e4 < 17) {
                                    f2 = b[e4];
                                } else {
                                    x5n.p(e4, "Unexpected aspect_ratio_idc value: ", new StringBuilder(String.valueOf(e4).length() + 35));
                                }
                            }
                            if (zzgzVar.d()) {
                                zzgzVar.a();
                            }
                            if (zzgzVar.d()) {
                                zzgzVar.b(3);
                                int i26 = true != zzgzVar.d() ? 2 : 1;
                                if (zzgzVar.d()) {
                                    int e7 = zzgzVar.e(8);
                                    int e8 = zzgzVar.e(8);
                                    zzgzVar.b(8);
                                    int b2 = zzi.b(e7);
                                    i15 = zzi.c(e8);
                                    i14 = b2;
                                } else {
                                    i14 = -1;
                                    i15 = -1;
                                }
                                i24 = i26;
                            } else {
                                i14 = -1;
                                i15 = -1;
                            }
                            if (zzgzVar.d()) {
                                zzgzVar.g();
                                zzgzVar.g();
                            }
                            if (zzgzVar.d()) {
                                zzgzVar.b(65);
                            }
                            boolean d3 = zzgzVar.d();
                            if (d3) {
                                k(zzgzVar);
                            }
                            boolean d4 = zzgzVar.d();
                            if (d4) {
                                k(zzgzVar);
                            }
                            if (d3 || d4) {
                                zzgzVar.a();
                            }
                            zzgzVar.a();
                            if (zzgzVar.d()) {
                                zzgzVar.a();
                                zzgzVar.g();
                                zzgzVar.g();
                                zzgzVar.g();
                                zzgzVar.g();
                                i7 = zzgzVar.g();
                                zzgzVar.g();
                            }
                            i9 = i24;
                            i10 = i15;
                            i11 = g2;
                            f = f2;
                            i12 = i7;
                            i13 = i14;
                        } else {
                            f = 1.0f;
                            i9 = -1;
                            i10 = -1;
                            i11 = g2;
                            i12 = i7;
                            i13 = -1;
                        }
                        return new zzgq(i8, e2, e3, g4, i22, i23, f, i11, i5, i13, i9, i10, i12);
                    }
                    i6 = 244;
                }
                if ((e2 & 16) == 0) {
                    i8 = i6;
                    i7 = 0;
                } else {
                    i7 = i4;
                    i8 = i6;
                }
                float f22 = 1.0f;
                int i242 = -1;
                if (zzgzVar.d()) {
                }
                return new zzgq(i8, e2, e3, g4, i22, i23, f, i11, i5, i13, i9, i10, i12);
            }
            e = 138;
        }
        g = zzgzVar.g();
        if (g == 3) {
            zzgzVar.d();
            i3 = 3;
        } else {
            i3 = g;
        }
        i4 = 16;
        g2 = zzgzVar.g();
        int g12 = zzgzVar.g();
        zzgzVar.a();
        if (zzgzVar.d()) {
            int i27 = i3 != 3 ? 8 : 12;
            int i28 = 0;
            while (i28 < i27) {
                if (zzgzVar.d()) {
                    int i29 = i28 < 6 ? 16 : 64;
                    int i30 = 8;
                    int i31 = 8;
                    for (int i32 = 0; i32 < i29; i32++) {
                        if (i30 != 0) {
                            i30 = ((zzgzVar.f() + i31) + NotificationCompat.FLAG_LOCAL_ONLY) % NotificationCompat.FLAG_LOCAL_ONLY;
                        }
                        if (i30 != 0) {
                            i31 = i30;
                        }
                    }
                }
                i28++;
            }
        }
        i5 = g12;
        zzgzVar.g();
        g3 = zzgzVar.g();
        if (g3 != 0) {
        }
        zzgzVar.g();
        zzgzVar.a();
        int g62 = zzgzVar.g() + 1;
        int g72 = zzgzVar.g() + 1;
        d2 = zzgzVar.d();
        int i182 = 2 - (d2 ? 1 : 0);
        if (!d2) {
        }
        zzgzVar.a();
        int i192 = g62 * 16;
        int i202 = g72 * i182 * 16;
        if (zzgzVar.d()) {
        }
        int i222 = i192;
        int i232 = i202;
        if (e != 44) {
        }
        i6 = e;
        if ((e2 & 16) == 0) {
        }
        float f222 = 1.0f;
        int i2422 = -1;
        if (zzgzVar.d()) {
        }
        return new zzgq(i8, e2, e3, g4, i222, i232, f, i11, i5, i13, i9, i10, i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzgo e(int i, int i2, byte[] bArr) {
        int[] iArr;
        zzgn zzgnVar;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        s sVar;
        String str;
        int[] iArr2;
        s sVar2;
        int i8;
        s sVar3;
        boolean[][] zArr;
        boolean[][] zArr2;
        int[] iArr3;
        int[] iArr4;
        int i9;
        int i10;
        int i11;
        boolean d2;
        int i12;
        int i13;
        int i14;
        int i15;
        int g;
        int i16;
        int i17;
        boolean z2;
        boolean z3;
        zzgz zzgzVar = new zzgz(bArr, i, i2);
        i(zzgzVar);
        zzgzVar.b(4);
        boolean d3 = zzgzVar.d();
        boolean d4 = zzgzVar.d();
        int e = zzgzVar.e(6);
        int i18 = e + 1;
        int e2 = zzgzVar.e(3);
        zzgzVar.b(17);
        zzgg j = j(zzgzVar, true, e2, null);
        for (int i19 = true != zzgzVar.d() ? e2 : 0; i19 <= e2; i19++) {
            zzgzVar.g();
            zzgzVar.g();
            zzgzVar.g();
        }
        int e3 = zzgzVar.e(6);
        int g2 = zzgzVar.g() + 1;
        int i20 = 6;
        zzgh zzghVar = new zzgh(zzgxm.t(j), new int[1]);
        boolean z4 = i18 >= 2 && g2 >= 2;
        boolean z5 = d3 && d4;
        int i21 = e3 + 1;
        if (!z4 || !z5 || i21 < i18) {
            return new zzgo(null, zzghVar, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, g2, i21);
        int i22 = 1;
        int[] iArr6 = new int[g2];
        int[] iArr7 = new int[g2];
        iArr5[0][0] = 0;
        iArr6[0] = 1;
        iArr7[0] = 0;
        for (int i23 = 1; i23 < g2; i23++) {
            int i24 = 0;
            for (int i25 = 0; i25 <= e3; i25++) {
                if (zzgzVar.d()) {
                    iArr5[i23][i24] = i25;
                    iArr7[i23] = i25;
                    i24++;
                }
                iArr6[i23] = i24;
            }
        }
        if (zzgzVar.d()) {
            zzgzVar.b(64);
            if (zzgzVar.d()) {
                zzgzVar.g();
            }
            int g3 = zzgzVar.g();
            int i26 = 0;
            while (i26 < g3) {
                zzgzVar.g();
                if (i26 == 0 || zzgzVar.d()) {
                    boolean d5 = zzgzVar.d();
                    boolean d6 = zzgzVar.d();
                    z3 = d5;
                    z2 = d6;
                    if (d5 || d6) {
                        d2 = zzgzVar.d();
                        if (d2) {
                            zzgzVar.b(19);
                        }
                        zzgzVar.b(8);
                        if (d2) {
                            zzgzVar.b(4);
                        }
                        zzgzVar.b(15);
                        i13 = d5;
                        i12 = d6;
                        i14 = 0;
                        while (i14 <= e2) {
                            if (zzgzVar.d() || zzgzVar.d()) {
                                zzgzVar.g();
                            } else if (zzgzVar.d()) {
                                i15 = i26;
                                g = 0;
                                int[][] iArr8 = iArr5;
                                i16 = i13 + i12;
                                int[] iArr9 = iArr7;
                                i17 = 0;
                                while (i17 < i16) {
                                    int i27 = i16;
                                    for (int i28 = 0; i28 <= g; i28++) {
                                        zzgzVar.g();
                                        zzgzVar.g();
                                        if (d2) {
                                            zzgzVar.g();
                                            zzgzVar.g();
                                        }
                                        zzgzVar.a();
                                    }
                                    i17++;
                                    i16 = i27;
                                }
                                i14++;
                                iArr5 = iArr8;
                                i26 = i15;
                                iArr7 = iArr9;
                            }
                            i15 = i26;
                            g = zzgzVar.g();
                            int[][] iArr82 = iArr5;
                            i16 = i13 + i12;
                            int[] iArr92 = iArr7;
                            i17 = 0;
                            while (i17 < i16) {
                            }
                            i14++;
                            iArr5 = iArr82;
                            i26 = i15;
                            iArr7 = iArr92;
                        }
                        i26++;
                    }
                } else {
                    z3 = false;
                    z2 = false;
                }
                d2 = false;
                i13 = z3;
                i12 = z2;
                i14 = 0;
                while (i14 <= e2) {
                }
                i26++;
            }
        }
        int[][] iArr10 = iArr5;
        int[] iArr11 = iArr7;
        if (!zzgzVar.d()) {
            return new zzgo(null, zzghVar, null, null);
        }
        int i29 = zzgzVar.e;
        if (i29 > 0) {
            zzgzVar.b(8 - i29);
        }
        zzgg j2 = j(zzgzVar, false, e2, j);
        boolean d7 = zzgzVar.d();
        boolean[] zArr3 = new boolean[16];
        int i30 = 0;
        for (int i31 = 0; i31 < 16; i31++) {
            boolean d8 = zzgzVar.d();
            zArr3[i31] = d8;
            if (d8) {
                i30++;
            }
        }
        if (i30 == 0 || !zArr3[1]) {
            return new zzgo(null, zzghVar, null, null);
        }
        int i32 = i30 + 1;
        int[] iArr12 = new int[i30];
        for (int i33 = 0; i33 < i30 - (d7 ? 1 : 0); i33++) {
            iArr12[i33] = zzgzVar.e(3);
        }
        int[] iArr13 = new int[i32];
        if (d7) {
            for (int i34 = 1; i34 < i30; i34++) {
                for (int i35 = 0; i35 < i34; i35++) {
                    iArr13[i34] = iArr12[i35] + 1 + iArr13[i34];
                }
            }
            iArr13[i30] = 6;
        }
        int[][] iArr14 = (int[][]) Array.newInstance((Class<?>) cls, i18, i30);
        int[] iArr15 = new int[i18];
        iArr15[0] = 0;
        boolean d9 = zzgzVar.d();
        int i36 = 1;
        while (i36 < i18) {
            if (d9) {
                iArr15[i36] = zzgzVar.e(i20);
            } else {
                iArr15[i36] = i36;
            }
            if (d7) {
                i11 = i36;
                for (int i37 = 0; i37 < i30; i37++) {
                    iArr14[i11][i37] = (iArr15[i11] & ((1 << iArr13[r31]) - 1)) >> iArr13[i37];
                }
            } else {
                int i38 = 0;
                while (i38 < i30) {
                    iArr14[i36][i38] = zzgzVar.e(iArr12[i38] + 1);
                    i38++;
                    i36 = i36;
                }
                i11 = i36;
            }
            i36 = i11 + 1;
            i20 = 6;
        }
        int[] iArr16 = new int[i21];
        int i39 = 1;
        int i40 = 0;
        while (i40 < i18) {
            iArr16[iArr15[i40]] = -1;
            int[] iArr17 = iArr16;
            int i41 = 0;
            int i42 = 0;
            while (i41 < 16) {
                if (zArr3[i41]) {
                    i10 = i22;
                    if (i41 == i10) {
                        iArr17[iArr15[i40]] = iArr14[i40][i42];
                        i41 = i10;
                    }
                    i42++;
                } else {
                    i10 = i22;
                }
                i41 += i10;
                i22 = i10;
            }
            if (i40 > 0) {
                int i43 = 0;
                while (true) {
                    if (i43 >= i40) {
                        i39++;
                        break;
                    }
                    int i44 = i43;
                    if (iArr17[iArr15[i40]] == iArr17[iArr15[i43]]) {
                        break;
                    }
                    i43 = i44 + 1;
                }
            }
            i40++;
            iArr16 = iArr17;
            i22 = 1;
        }
        int[] iArr18 = iArr16;
        int e4 = zzgzVar.e(4);
        if (i39 < 2 || e4 == 0) {
            return new zzgo(null, zzghVar, null, null);
        }
        int[] iArr19 = new int[i39];
        for (int i45 = 0; i45 < i39; i45++) {
            iArr19[i45] = zzgzVar.e(e4);
        }
        int[] iArr20 = new int[i21];
        for (int i46 = 0; i46 < i18; i46++) {
            iArr20[Math.min(iArr15[i46], e3)] = i46;
        }
        zzgxj zzgxjVar = new zzgxj();
        int i47 = 0;
        while (i47 <= e3) {
            int[] iArr21 = iArr19;
            int i48 = i39;
            int min = Math.min(iArr18[i47], i48 - 1);
            int[] iArr22 = iArr20;
            zzgxjVar.c(new zzge(iArr22[i47], min >= 0 ? iArr21[min] : -1));
            i47++;
            i39 = i48;
            iArr19 = iArr21;
            iArr20 = iArr22;
        }
        s f = zzgxjVar.f();
        if (((zzge) f.get(0)).b == -1) {
            return new zzgo(null, zzghVar, null, null);
        }
        int i49 = 1;
        while (true) {
            if (i49 > e3) {
                i49 = -1;
                break;
            }
            if (((zzge) f.get(i49)).b != -1) {
                break;
            }
            i49++;
        }
        if (i49 == -1) {
            return new zzgo(null, zzghVar, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i18, i18);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i18, i18);
        int i50 = 1;
        while (i50 < i18) {
            boolean[][] zArr6 = zArr5;
            for (int i51 = 0; i51 < i50; i51++) {
                boolean[] zArr7 = zArr4[i50];
                boolean[] zArr8 = zArr6[i50];
                boolean d10 = zzgzVar.d();
                zArr8[i51] = d10;
                zArr7[i51] = d10;
            }
            i50++;
            zArr5 = zArr6;
        }
        boolean[][] zArr9 = zArr5;
        for (int i52 = 1; i52 < i18; i52++) {
            int i53 = 0;
            while (i53 < e) {
                boolean[][] zArr10 = zArr4;
                int i54 = 0;
                while (true) {
                    if (i54 < i52) {
                        boolean[] zArr11 = zArr9[i52];
                        if (zArr11[i54] && zArr9[i54][i53]) {
                            zArr11[i53] = true;
                            break;
                        }
                        i54++;
                    }
                }
                i53++;
                zArr4 = zArr10;
            }
        }
        boolean[][] zArr12 = zArr4;
        int[] iArr23 = new int[i21];
        for (int i55 = 0; i55 < i18; i55++) {
            int i56 = 0;
            for (int i57 = 0; i57 < i55; i57++) {
                i56 += zArr12[i55][i57] ? 1 : 0;
            }
            iArr23[iArr15[i55]] = i56;
        }
        int i58 = 0;
        for (int i59 = 0; i59 < i18; i59++) {
            if (iArr23[iArr15[i59]] == 0) {
                i58++;
            }
        }
        if (i58 > 1) {
            return new zzgo(null, zzghVar, null, null);
        }
        int[] iArr24 = new int[i18];
        int[] iArr25 = new int[g2];
        if (zzgzVar.d()) {
            iArr = iArr23;
            int i60 = 0;
            while (i60 < i18) {
                int i61 = i60;
                iArr24[i61] = zzgzVar.e(3);
                i60 = i61 + 1;
            }
        } else {
            iArr = iArr23;
            Arrays.fill(iArr24, 0, i18, e2);
        }
        int i62 = 0;
        while (i62 < g2) {
            int i63 = i62;
            int[] iArr26 = iArr24;
            int[] iArr27 = iArr25;
            int i64 = 0;
            for (int i65 = 0; i65 < iArr6[i63]; i65++) {
                i64 = Math.max(i64, iArr26[((zzge) f.get(iArr10[i63][i65])).a]);
            }
            iArr27[i63] = i64 + 1;
            i62 = i63 + 1;
            iArr24 = iArr26;
            iArr25 = iArr27;
        }
        int[] iArr28 = iArr25;
        if (zzgzVar.d()) {
            int i66 = 0;
            while (i66 < e) {
                int i67 = i66 + 1;
                int i68 = i67;
                while (i68 < i18) {
                    if (zArr12[i68][i66]) {
                        i9 = e;
                        zzgzVar.b(3);
                    } else {
                        i9 = e;
                    }
                    i68++;
                    e = i9;
                }
                i66 = i67;
            }
        }
        zzgzVar.a();
        int g4 = zzgzVar.g() + 1;
        zzgxj zzgxjVar2 = new zzgxj();
        zzgxjVar2.c(j);
        if (g4 > 1) {
            zzgxjVar2.c(j2);
            for (int i69 = 2; i69 < g4; i69++) {
                j2 = j(zzgzVar, zzgzVar.d(), e2, j2);
                zzgxjVar2.c(j2);
            }
        }
        s f2 = zzgxjVar2.f();
        int g5 = zzgzVar.g() + g2;
        if (g5 > g2) {
            return new zzgo(null, zzghVar, null, null);
        }
        int e5 = zzgzVar.e(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, g5, i21);
        int[] iArr29 = new int[g5];
        int i70 = 0;
        int[] iArr30 = new int[g5];
        int i71 = 0;
        while (i71 < g2) {
            iArr29[i71] = i70;
            int i72 = i71;
            int i73 = iArr11[i72];
            iArr30[i72] = i73;
            if (e5 == 0) {
                zArr2 = zArr13;
                iArr3 = iArr29;
                iArr4 = iArr15;
                Arrays.fill(zArr13[i72], i70, iArr6[i72], true);
                iArr3[i72] = iArr6[i72];
            } else {
                zArr2 = zArr13;
                iArr3 = iArr29;
                iArr4 = iArr15;
                if (e5 == 1) {
                    for (int i74 = 0; i74 < iArr6[i72]; i74++) {
                        zArr2[i72][i74] = iArr10[i72][i74] == i73;
                    }
                    iArr3[i72] = 1;
                } else {
                    i70 = 0;
                    zArr2[0][0] = true;
                    iArr3[0] = 1;
                    i71 = i72 + 1;
                    zArr13 = zArr2;
                    iArr29 = iArr3;
                    iArr15 = iArr4;
                }
            }
            i70 = 0;
            i71 = i72 + 1;
            zArr13 = zArr2;
            iArr29 = iArr3;
            iArr15 = iArr4;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr31 = iArr29;
        int[] iArr32 = iArr15;
        int[] iArr33 = new int[i21];
        int i75 = 2;
        int[] iArr34 = new int[2];
        iArr34[1] = i21;
        iArr34[i70] = g5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr34);
        int i76 = 1;
        int i77 = 0;
        while (i76 < g5) {
            if (e5 == i75) {
                for (int i78 = 0; i78 < iArr6[i76]; i78++) {
                    zArr14[i76][i78] = zzgzVar.d();
                    int i79 = iArr31[i76];
                    boolean z6 = zArr14[i76][i78];
                    iArr31[i76] = i79 + (z6 ? 1 : 0);
                    if (z6) {
                        iArr30[i76] = iArr10[i76][i78];
                    }
                }
            }
            if (i77 == 0) {
                i8 = 0;
                if (iArr10[i76][0] == 0 && zArr14[i76][0]) {
                    i77 = 0;
                    for (int i80 = 1; i80 < iArr6[i76]; i80++) {
                        if (iArr10[i76][i80] == i49 && zArr14[i76][i49]) {
                            i77 = i76;
                        }
                    }
                } else {
                    i77 = 0;
                }
            } else {
                i8 = 0;
            }
            int i81 = i8;
            while (i81 < iArr6[i76]) {
                if (g4 > 1) {
                    zArr15[i76][i81] = zArr14[i76][i81];
                    sVar3 = f2;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int b2 = zzhaw.b(g4);
                    if (!zArr[i76][i81]) {
                        int i82 = ((zzge) f.get(iArr10[i76][i81])).a;
                        int i83 = i8;
                        while (true) {
                            if (i83 >= i81) {
                                break;
                            }
                            int i84 = i83;
                            if (zArr9[i82][((zzge) f.get(iArr10[i76][i84])).a]) {
                                zArr[i76][i81] = true;
                                break;
                            }
                            i83 = i84 + 1;
                        }
                    }
                    if (zArr[i76][i81]) {
                        if (i77 <= 0 || i76 != i77) {
                            zzgzVar.b(b2);
                        } else {
                            iArr33[i81] = zzgzVar.e(b2);
                        }
                    }
                } else {
                    sVar3 = f2;
                    zArr = zArr15;
                }
                i81++;
                f2 = sVar3;
                zArr15 = zArr;
            }
            s sVar4 = f2;
            boolean[][] zArr16 = zArr15;
            if (iArr31[i76] == 1 && iArr[iArr30[i76]] > 0) {
                zzgzVar.a();
            }
            i76++;
            f2 = sVar4;
            zArr15 = zArr16;
            i75 = 2;
        }
        s sVar5 = f2;
        boolean[][] zArr17 = zArr15;
        if (i77 == 0) {
            return new zzgo(null, zzghVar, null, null);
        }
        int g6 = zzgzVar.g();
        int i85 = g6 + 1;
        String str2 = "expectedSize";
        u0a.S(i85, "expectedSize");
        zzgxj zzgxjVar3 = new zzgxj(i85);
        int[] iArr35 = new int[i18];
        int i86 = 0;
        while (i86 < i85) {
            int e6 = zzgzVar.e(16);
            int e7 = zzgzVar.e(16);
            if (zzgzVar.d()) {
                i4 = i86;
                i5 = zzgzVar.e(2);
                if (i5 == 3) {
                    zzgzVar.a();
                }
                i6 = zzgzVar.e(4);
                i7 = zzgzVar.e(4);
            } else {
                i4 = i86;
                i5 = 0;
                i6 = 0;
                i7 = 0;
            }
            if (zzgzVar.d()) {
                int g7 = zzgzVar.g();
                sVar2 = sVar5;
                int g8 = zzgzVar.g();
                sVar = f;
                int g9 = zzgzVar.g();
                iArr2 = iArr33;
                int g10 = zzgzVar.g();
                str = str2;
                e6 = lnb.x(g7, g8, (i5 == 1 || i5 == 2) ? 2 : 1, e6);
                e7 = lnb.x(g9, g10, i5 == 1 ? 2 : 1, e7);
            } else {
                sVar = f;
                str = str2;
                iArr2 = iArr33;
                sVar2 = sVar5;
            }
            zzgxjVar3.c(new zzgi(i5, i6, i7, e6, e7));
            i86 = i4 + 1;
            sVar5 = sVar2;
            f = sVar;
            iArr33 = iArr2;
            str2 = str;
        }
        s sVar6 = f;
        String str3 = str2;
        int[] iArr36 = iArr33;
        s sVar7 = sVar5;
        if (i85 <= 1 || !zzgzVar.d()) {
            for (int i87 = 1; i87 < i18; i87++) {
                iArr35[i87] = Math.min(i87, g6);
            }
        } else {
            double d11 = i85;
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int b3 = zzhaw.b(d11);
            for (int i88 = 1; i88 < i18; i88++) {
                iArr35[i88] = zzgzVar.e(b3);
            }
        }
        zzgj zzgjVar = new zzgj(zzgxjVar3.f(), iArr35);
        zzgzVar.b(2);
        for (int i89 = 1; i89 < i18; i89++) {
            if (iArr[iArr32[i89]] == 0) {
                zzgzVar.a();
            }
        }
        for (int i90 = 1; i90 < g5; i90++) {
            boolean d12 = zzgzVar.d();
            int i91 = 0;
            while (i91 < iArr28[i90]) {
                if ((i91 <= 0 || !d12) ? i91 == 0 : zzgzVar.d()) {
                    for (int i92 = 0; i92 < iArr6[i90]; i92++) {
                        if (zArr17[i90][i92]) {
                            zzgzVar.g();
                        }
                    }
                    zzgzVar.g();
                    zzgzVar.g();
                }
                i91++;
            }
        }
        int g11 = zzgzVar.g() + 2;
        if (zzgzVar.d()) {
            zzgzVar.b(g11);
        } else {
            for (int i93 = 1; i93 < i18; i93++) {
                for (int i94 = 0; i94 < i93; i94++) {
                    if (zArr12[i93][i94]) {
                        zzgzVar.b(g11);
                    }
                }
            }
        }
        int g12 = zzgzVar.g();
        for (int i95 = 1; i95 <= g12; i95++) {
            zzgzVar.b(8);
        }
        if (zzgzVar.d()) {
            int i96 = zzgzVar.e;
            if (i96 > 0) {
                zzgzVar.b(8 - i96);
            }
            if (zzgzVar.d() || zzgzVar.d()) {
                zzgzVar.a();
            }
            boolean d13 = zzgzVar.d();
            boolean d14 = zzgzVar.d();
            if (d13 || d14) {
                for (int i97 = 0; i97 < g2; i97++) {
                    for (int i98 = 0; i98 < iArr28[i97]; i98++) {
                        boolean d15 = d13 ? zzgzVar.d() : false;
                        boolean d16 = d14 ? zzgzVar.d() : false;
                        if (d15) {
                            zzgzVar.b(32);
                        }
                        if (d16) {
                            zzgzVar.b(18);
                        }
                    }
                }
            }
            boolean d17 = zzgzVar.d();
            if (d17) {
                z = true;
                i3 = zzgzVar.e(4) + 1;
            } else {
                z = true;
                i3 = i18;
            }
            u0a.S(i3, str3);
            zzgxj zzgxjVar4 = new zzgxj(i3);
            int[] iArr37 = new int[i18];
            int i99 = 0;
            while (i99 < i3) {
                zzgzVar.b(3);
                int i100 = z != zzgzVar.d() ? 2 : 1;
                int b4 = zzi.b(zzgzVar.e(8));
                int c2 = zzi.c(zzgzVar.e(8));
                zzgzVar.b(8);
                zzgxjVar4.c(new zzgm(b4, i100, c2));
                i99++;
                z = true;
            }
            if (d17 && i3 > 1) {
                for (int i101 = 0; i101 < i18; i101++) {
                    iArr37[i101] = zzgzVar.e(4);
                }
            }
            zzgnVar = new zzgn(zzgxjVar4.f(), iArr37);
        } else {
            zzgnVar = null;
        }
        return new zzgo(sVar6, new zzgh(sVar7, iArr36), zzgjVar, zzgnVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzgl f(byte[] bArr, int i, int i2, zzgo zzgoVar) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int g;
        int i7;
        int i8;
        int i9;
        int g2;
        int i10;
        int i11;
        int g3;
        int i12;
        float f;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        zzgn zzgnVar;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        zzgj zzgjVar;
        zzgf i24 = i(new zzgz(bArr, i, i2));
        int i25 = 2;
        zzgz zzgzVar = new zzgz(bArr, i + 2, i2);
        int i26 = 4;
        zzgzVar.b(4);
        int e = zzgzVar.e(3);
        int i27 = i24.b;
        int i28 = 1;
        if (i27 == 0 || e != 7) {
            i3 = e;
            z = false;
        } else {
            z = true;
            i3 = 7;
        }
        if (zzgoVar != null) {
            zzgxm zzgxmVar = zzgoVar.a;
            if (!zzgxmVar.isEmpty()) {
                i4 = ((zzge) zzgxmVar.get(Math.min(i27, zzgxmVar.size() - 1))).a;
                zzgg zzggVar = null;
                if (z) {
                    zzgzVar.a();
                    zzggVar = j(zzgzVar, true, i3, null);
                } else if (zzgoVar != null) {
                    zzgh zzghVar = zzgoVar.b;
                    int i29 = zzghVar.b[i4];
                    zzgxm zzgxmVar2 = zzghVar.a;
                    if (zzgxmVar2.size() > i29) {
                        zzggVar = (zzgg) zzgxmVar2.get(i29);
                    }
                }
                zzgg zzggVar2 = zzggVar;
                zzgzVar.g();
                if (!z) {
                    int e2 = zzgzVar.d() ? zzgzVar.e(8) : -1;
                    if (zzgoVar != null && (zzgjVar = zzgoVar.c) != null) {
                        if (e2 == -1) {
                            e2 = zzgjVar.b[i4];
                        }
                        if (e2 != -1) {
                            zzgxm zzgxmVar3 = zzgjVar.a;
                            if (zzgxmVar3.size() > e2) {
                                zzgi zzgiVar = (zzgi) zzgxmVar3.get(e2);
                                int i30 = zzgiVar.a;
                                int i31 = zzgiVar.d;
                                int i32 = zzgiVar.e;
                                g = zzgiVar.b;
                                i7 = i31;
                                i6 = i32;
                                i8 = i6;
                                g2 = zzgiVar.c;
                                i9 = i7;
                            }
                        }
                    }
                    i6 = 0;
                    i7 = 0;
                    i10 = 0;
                    g2 = 0;
                    i9 = 0;
                    i8 = 0;
                    int g4 = zzgzVar.g();
                    if (z) {
                        i11 = -1;
                    } else {
                        int i33 = true != zzgzVar.d() ? i3 : 0;
                        int i34 = -1;
                        while (i33 <= i3) {
                            zzgzVar.g();
                            i34 = Math.max(zzgzVar.g(), i34);
                            zzgzVar.g();
                            i33++;
                            i28 = i28;
                        }
                        i11 = i34;
                    }
                    int i35 = i28;
                    zzgzVar.g();
                    zzgzVar.g();
                    zzgzVar.g();
                    zzgzVar.g();
                    zzgzVar.g();
                    zzgzVar.g();
                    if (zzgzVar.d()) {
                        if (z && zzgzVar.d()) {
                            zzgzVar.b(6);
                        } else if (zzgzVar.d()) {
                            int i36 = 0;
                            while (i36 < i26) {
                                int i37 = 0;
                                while (i37 < 6) {
                                    if (zzgzVar.d()) {
                                        int min = Math.min(64, i35 << ((i36 + i36) + i26));
                                        if (i36 > i35) {
                                            zzgzVar.f();
                                        }
                                        for (int i38 = 0; i38 < min; i38++) {
                                            zzgzVar.f();
                                        }
                                    } else {
                                        zzgzVar.g();
                                    }
                                    i37 += i36 == 3 ? 3 : 1;
                                    i26 = 4;
                                    i35 = 1;
                                }
                                i36++;
                                i26 = 4;
                                i35 = 1;
                            }
                        }
                    }
                    zzgzVar.b(2);
                    if (zzgzVar.d()) {
                        zzgzVar.b(8);
                        zzgzVar.g();
                        zzgzVar.g();
                        zzgzVar.a();
                    }
                    g3 = zzgzVar.g();
                    int[] iArr = new int[0];
                    int[] iArr2 = new int[0];
                    int i39 = i6;
                    i12 = 0;
                    int i40 = -1;
                    int i41 = -1;
                    while (i12 < g3) {
                        if (i12 == 0 || !zzgzVar.d()) {
                            i20 = g3;
                            i21 = i4;
                            i22 = g4;
                            int g5 = zzgzVar.g();
                            i40 = zzgzVar.g();
                            int[] iArr3 = new int[g5];
                            int i42 = 0;
                            while (i42 < g5) {
                                iArr3[i42] = (i42 > 0 ? iArr3[i42 - 1] : 0) - (zzgzVar.g() + 1);
                                zzgzVar.a();
                                i42++;
                            }
                            int[] iArr4 = new int[i40];
                            int i43 = 0;
                            while (i43 < i40) {
                                iArr4[i43] = zzgzVar.g() + 1 + (i43 > 0 ? iArr4[i43 - 1] : 0);
                                zzgzVar.a();
                                i43++;
                            }
                            iArr = iArr3;
                            iArr2 = iArr4;
                            i41 = g5;
                        } else {
                            i20 = g3;
                            int i44 = i41 + i40;
                            boolean d2 = zzgzVar.d();
                            boolean z2 = true;
                            int g6 = zzgzVar.g() + 1;
                            int i45 = 1 - ((d2 ? 1 : 0) + (d2 ? 1 : 0));
                            i21 = i4;
                            int i46 = i44 + 1;
                            i22 = g4;
                            boolean[] zArr = new boolean[i46];
                            int i47 = 0;
                            while (i47 <= i44) {
                                if (zzgzVar.d()) {
                                    zArr[i47] = z2;
                                } else {
                                    zArr[i47] = zzgzVar.d();
                                }
                                i47++;
                                z2 = true;
                            }
                            int i48 = i40 - 1;
                            int[] iArr5 = new int[i46];
                            int[] iArr6 = new int[i46];
                            int i49 = 0;
                            while (true) {
                                i23 = i45 * g6;
                                if (i48 < 0) {
                                    break;
                                }
                                int i50 = iArr2[i48] + i23;
                                if (i50 < 0 && zArr[i41 + i48]) {
                                    iArr5[i49] = i50;
                                    i49++;
                                }
                                i48--;
                            }
                            if (i23 < 0 && zArr[i44]) {
                                iArr5[i49] = i23;
                                i49++;
                            }
                            int[] iArr7 = iArr;
                            int i51 = i49;
                            for (int i52 = 0; i52 < i41; i52++) {
                                int i53 = iArr7[i52] + i23;
                                if (i53 < 0 && zArr[i52]) {
                                    iArr5[i51] = i53;
                                    i51++;
                                }
                            }
                            int[] copyOf = Arrays.copyOf(iArr5, i51);
                            int i54 = 0;
                            for (int i55 = i41 - 1; i55 >= 0; i55--) {
                                int i56 = iArr7[i55] + i23;
                                if (i56 > 0 && zArr[i55]) {
                                    iArr6[i54] = i56;
                                    i54++;
                                }
                            }
                            if (i23 > 0 && zArr[i44]) {
                                iArr6[i54] = i23;
                                i54++;
                            }
                            int i57 = i54;
                            for (int i58 = 0; i58 < i40; i58++) {
                                int i59 = iArr2[i58] + i23;
                                if (i59 > 0 && zArr[i41 + i58]) {
                                    iArr6[i57] = i59;
                                    i57++;
                                }
                            }
                            iArr2 = Arrays.copyOf(iArr6, i57);
                            i41 = i51;
                            i40 = i57;
                            iArr = copyOf;
                        }
                        i12++;
                        g3 = i20;
                        i4 = i21;
                        g4 = i22;
                    }
                    int i60 = i4;
                    int i61 = g4;
                    if (zzgzVar.d()) {
                        int g7 = zzgzVar.g();
                        for (int i62 = 0; i62 < g7; i62++) {
                            zzgzVar.b(i61 + 5);
                        }
                    }
                    zzgzVar.b(2);
                    float f2 = 1.0f;
                    if (zzgzVar.d()) {
                        if (zzgzVar.d()) {
                            int e3 = zzgzVar.e(8);
                            if (e3 == 255) {
                                int e4 = zzgzVar.e(16);
                                int e5 = zzgzVar.e(16);
                                if (e4 != 0 && e5 != 0) {
                                    f2 = e4 / e5;
                                }
                            } else if (e3 < 17) {
                                f2 = b[e3];
                            } else {
                                x5n.p(e3, "Unexpected aspect_ratio_idc value: ", new StringBuilder(String.valueOf(e3).length() + 35));
                            }
                        }
                        if (zzgzVar.d()) {
                            zzgzVar.a();
                        }
                        if (zzgzVar.d()) {
                            zzgzVar.b(3);
                            i18 = true != zzgzVar.d() ? 2 : 1;
                            if (zzgzVar.d()) {
                                int e6 = zzgzVar.e(8);
                                int e7 = zzgzVar.e(8);
                                zzgzVar.b(8);
                                i19 = zzi.b(e6);
                                i17 = zzi.c(e7);
                                if (zzgzVar.d()) {
                                    zzgzVar.g();
                                    zzgzVar.g();
                                }
                                zzgzVar.a();
                                if (zzgzVar.d()) {
                                    i16 = i17;
                                    f = f2;
                                    i15 = i18;
                                    i13 = i39;
                                } else {
                                    i16 = i17;
                                    i13 = i39 + i39;
                                    f = f2;
                                    i15 = i18;
                                }
                                i14 = i19;
                            } else {
                                i17 = -1;
                                i19 = -1;
                                if (zzgzVar.d()) {
                                }
                                zzgzVar.a();
                                if (zzgzVar.d()) {
                                }
                                i14 = i19;
                            }
                        } else {
                            if (zzgoVar != null && (zzgnVar = zzgoVar.d) != null) {
                                int i63 = zzgnVar.b[i60];
                                zzgxm zzgxmVar4 = zzgnVar.a;
                                if (zzgxmVar4.size() > i63) {
                                    zzgm zzgmVar = (zzgm) zzgxmVar4.get(i63);
                                    i19 = zzgmVar.a;
                                    int i64 = zzgmVar.b;
                                    i17 = zzgmVar.c;
                                    i18 = i64;
                                    if (zzgzVar.d()) {
                                    }
                                    zzgzVar.a();
                                    if (zzgzVar.d()) {
                                    }
                                    i14 = i19;
                                }
                            }
                            i17 = -1;
                            i18 = -1;
                            i19 = -1;
                            if (zzgzVar.d()) {
                            }
                            zzgzVar.a();
                            if (zzgzVar.d()) {
                            }
                            i14 = i19;
                        }
                    } else {
                        f = 1.0f;
                        i13 = i39;
                        i14 = -1;
                        i15 = -1;
                        i16 = -1;
                    }
                    return new zzgl(i3, zzggVar2, i10, g2, i9, i13, i7, i8, f, i11, i14, i15, i16);
                }
                int g8 = zzgzVar.g();
                if (g8 == 3) {
                    zzgzVar.a();
                    g8 = 3;
                }
                int g9 = zzgzVar.g();
                int g10 = zzgzVar.g();
                if (zzgzVar.d()) {
                    int g11 = zzgzVar.g();
                    int g12 = zzgzVar.g();
                    int g13 = zzgzVar.g();
                    int g14 = zzgzVar.g();
                    if (g8 != 1 && g8 != 2) {
                        i25 = 1;
                    }
                    i5 = lnb.x(g11, g12, i25, g9);
                    i6 = lnb.x(g13, g14, g8 == 1 ? 2 : 1, g10);
                } else {
                    i5 = g9;
                    i6 = g10;
                }
                g = zzgzVar.g();
                i7 = g9;
                i8 = g10;
                i9 = i5;
                g2 = zzgzVar.g();
                i10 = g;
                int g42 = zzgzVar.g();
                if (z) {
                }
                int i352 = i28;
                zzgzVar.g();
                zzgzVar.g();
                zzgzVar.g();
                zzgzVar.g();
                zzgzVar.g();
                zzgzVar.g();
                if (zzgzVar.d()) {
                }
                zzgzVar.b(2);
                if (zzgzVar.d()) {
                }
                g3 = zzgzVar.g();
                int[] iArr8 = new int[0];
                int[] iArr22 = new int[0];
                int i392 = i6;
                i12 = 0;
                int i402 = -1;
                int i412 = -1;
                while (i12 < g3) {
                }
                int i602 = i4;
                int i612 = g42;
                if (zzgzVar.d()) {
                }
                zzgzVar.b(2);
                float f22 = 1.0f;
                if (zzgzVar.d()) {
                }
                return new zzgl(i3, zzggVar2, i10, g2, i9, i13, i7, i8, f, i11, i14, i15, i16);
            }
        }
        i4 = 0;
        zzgg zzggVar3 = null;
        if (z) {
        }
        zzgg zzggVar22 = zzggVar3;
        zzgzVar.g();
        if (!z) {
        }
        i10 = g;
        int g422 = zzgzVar.g();
        if (z) {
        }
        int i3522 = i28;
        zzgzVar.g();
        zzgzVar.g();
        zzgzVar.g();
        zzgzVar.g();
        zzgzVar.g();
        zzgzVar.g();
        if (zzgzVar.d()) {
        }
        zzgzVar.b(2);
        if (zzgzVar.d()) {
        }
        g3 = zzgzVar.g();
        int[] iArr82 = new int[0];
        int[] iArr222 = new int[0];
        int i3922 = i6;
        i12 = 0;
        int i4022 = -1;
        int i4122 = -1;
        while (i12 < g3) {
        }
        int i6022 = i4;
        int i6122 = g422;
        if (zzgzVar.d()) {
        }
        zzgzVar.b(2);
        float f222 = 1.0f;
        if (zzgzVar.d()) {
        }
        return new zzgl(i3, zzggVar22, i10, g2, i9, i13, i7, i8, f, i11, i14, i15, i16);
    }

    public static int g(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        zzguk.f(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            h(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            h(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            h(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b2 = bArr[i5];
            if ((b2 & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                    h(zArr);
                    return i6;
                }
                i5 = i6;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static void h(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static zzgf i(zzgz zzgzVar) {
        zzgzVar.a();
        return new zzgf(zzgzVar.e(6), zzgzVar.e(6), zzgzVar.e(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzgg j(zzgz zzgzVar, boolean z, int i, zzgg zzggVar) {
        int[] iArr;
        int i2;
        boolean z2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int[] iArr2 = new int[6];
        if (z) {
            int e = zzgzVar.e(2);
            z3 = zzgzVar.d();
            i5 = zzgzVar.e(5);
            i6 = 0;
            for (int i7 = 0; i7 < 32; i7++) {
                if (zzgzVar.d()) {
                    i6 |= 1 << i7;
                }
            }
            for (int i8 = 0; i8 < 6; i8++) {
                iArr2[i8] = zzgzVar.e(8);
            }
            i2 = e;
        } else {
            if (zzggVar == null) {
                iArr = iArr2;
                i2 = 0;
                z2 = false;
                i3 = 0;
                i4 = 0;
                int e2 = zzgzVar.e(8);
                int i9 = 0;
                for (int i10 = 0; i10 < i; i10++) {
                    if (zzgzVar.d()) {
                        i9 += 88;
                    }
                    if (zzgzVar.d()) {
                        i9 += 8;
                    }
                }
                zzgzVar.b(i9);
                if (i > 0) {
                    int i11 = 8 - i;
                    zzgzVar.b(i11 + i11);
                }
                return new zzgg(i2, z2, i3, i4, iArr, e2);
            }
            int i12 = zzggVar.a;
            z3 = zzggVar.b;
            i5 = zzggVar.c;
            i6 = zzggVar.d;
            iArr2 = zzggVar.e;
            i2 = i12;
        }
        iArr = iArr2;
        z2 = z3;
        i3 = i5;
        i4 = i6;
        int e22 = zzgzVar.e(8);
        int i92 = 0;
        while (i10 < i) {
        }
        zzgzVar.b(i92);
        if (i > 0) {
        }
        return new zzgg(i2, z2, i3, i4, iArr, e22);
    }

    public static void k(zzgz zzgzVar) {
        int g = zzgzVar.g() + 1;
        zzgzVar.b(8);
        for (int i = 0; i < g; i++) {
            zzgzVar.g();
            zzgzVar.g();
            zzgzVar.a();
        }
        zzgzVar.b(20);
    }

    public static String l(zzv zzvVar) {
        String str;
        String str2 = zzvVar.o;
        if (Objects.equals(str2, "video/dolby-vision") && (str = zzvVar.k) != null) {
            if (str.startsWith("dva1") || str.startsWith("dvav")) {
                return "video/avc";
            }
            if (str.startsWith("dvh1") || str.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return str2;
    }
}
