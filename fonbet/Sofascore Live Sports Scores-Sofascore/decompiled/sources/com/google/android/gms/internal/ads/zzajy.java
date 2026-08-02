package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.mio;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzajy {
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(zzeu zzeuVar, int i, int i2, boolean z) {
        boolean z2;
        int M;
        long M2;
        int i3;
        int i4;
        int i5 = zzeuVar.b;
        while (true) {
            try {
                z2 = true;
                z2 = true;
                int i6 = 1;
                int i7 = 1;
                if (zzeuVar.B() < i2) {
                    break;
                }
                if (i >= 3) {
                    M = zzeuVar.b();
                    M2 = zzeuVar.N();
                    i3 = zzeuVar.J();
                } else {
                    M = zzeuVar.M();
                    M2 = zzeuVar.M();
                    i3 = 0;
                }
                if (M != 0 || M2 != 0 || i3 != 0) {
                    if (i == 4 && !z) {
                        if ((8421504 & M2) != 0) {
                            break;
                        }
                        M2 = ((M2 >> 24) << 21) | (((M2 >> 16) & 255) << 14) | (M2 & 255) | (((M2 >> 8) & 255) << 7);
                    }
                    if (i == 4) {
                        if ((i3 & 64) == 0) {
                            i6 = 0;
                        }
                        int i8 = i6;
                        i7 = i3 & 1;
                        i4 = i8;
                    } else if (i == 3) {
                        i4 = (i3 & 32) != 0 ? 1 : 0;
                        if ((i3 & 128) == 0) {
                            i7 = 0;
                        }
                    } else {
                        i4 = 0;
                        i7 = 0;
                    }
                    if (i7 != 0) {
                        i4 += 4;
                    }
                    if (M2 >= i4 && zzeuVar.B() >= M2) {
                        zzeuVar.E((int) M2);
                    }
                }
            } finally {
                zzeuVar.D(i5);
            }
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:219:0x025c, code lost:
    
        if (r8 == 67) goto L149;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x04c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzajz b(int i, zzeu zzeuVar, boolean z, zzajv zzajvVar) {
        int h;
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        zzajz zzajzVar;
        int i5;
        zzajz zzajqVar;
        zzajz zzakcVar;
        int h2;
        String concat;
        zzajz zzajpVar;
        int I = zzeuVar.I();
        int I2 = zzeuVar.I();
        int I3 = zzeuVar.I();
        int I4 = i >= 3 ? zzeuVar.I() : 0;
        if (i == 4) {
            h = zzeuVar.h();
            if (!z) {
                h = ((h >> 24) << 21) | (h & 255) | (((h >> 8) & 255) << 7) | (((h >> 16) & 255) << 14);
            }
        } else {
            h = i == 3 ? zzeuVar.h() : zzeuVar.M();
        }
        int J = i >= 3 ? zzeuVar.J() : 0;
        if (I == 0 && I2 == 0 && I3 == 0 && I4 == 0 && h == 0 && J == 0) {
            zzeuVar.D(zzeuVar.c);
            return null;
        }
        int i6 = zzeuVar.b + h;
        if (i6 > zzeuVar.c) {
            zzeh.c("Frame size exceeds remaining tag data");
            zzeuVar.D(zzeuVar.c);
            return null;
        }
        if (zzajvVar != null) {
            zzeuVar.D(i6);
            return null;
        }
        if (i == 3) {
            int i7 = J & 64;
            i2 = (J & 128) != 0 ? 1 : 0;
            z4 = false;
            z3 = i7 != 0;
            z2 = (J & 32) != 0;
            i3 = i2;
        } else if (i == 4) {
            boolean z5 = (J & 64) != 0;
            int i8 = (J & 8) != 0 ? 1 : 0;
            z3 = (J & 4) != 0;
            z4 = (J & 2) != 0;
            i3 = J & 1;
            int i9 = i8;
            z2 = z5;
            i2 = i9;
        } else {
            i2 = 0;
            i3 = 0;
            z2 = false;
            z3 = false;
            z4 = false;
        }
        if (i2 != 0 || z3) {
            zzeh.c("Skipping unsupported compressed or encrypted frame");
            zzeuVar.D(i6);
            return null;
        }
        if (z2) {
            zzeuVar.E(1);
            h--;
        }
        if (i3 != 0) {
            zzeuVar.E(4);
            h -= 4;
        }
        if (z4) {
            h = d(h, zzeuVar);
        }
        try {
            try {
                if (I == 84 && I2 == 88 && I3 == 88 && (i == 2 || I4 == 88)) {
                    if (h > 0) {
                        int I5 = zzeuVar.I();
                        int i10 = h - 1;
                        byte[] bArr = new byte[i10];
                        zzeuVar.F(0, i10, bArr);
                        int g = g(0, I5, bArr);
                        zzajqVar = new zzake("TXXX", new String(bArr, 0, g, e(I5)), c(I5, g + i(I5), bArr));
                        i4 = I;
                    }
                    i4 = I;
                    zzajqVar = null;
                } else if (I == 84) {
                    String f = f(i, 84, I2, I3, I4);
                    if (h <= 0) {
                        i4 = I;
                        zzajqVar = null;
                    } else {
                        int I6 = zzeuVar.I();
                        int i11 = h - 1;
                        byte[] bArr2 = new byte[i11];
                        zzeuVar.F(0, i11, bArr2);
                        zzajpVar = new zzake(f, null, c(I6, 0, bArr2));
                        i4 = I;
                        zzajqVar = zzajpVar;
                    }
                } else {
                    if (I == 87) {
                        if (I2 != 88 || I3 != 88 || (i != 2 && I4 != 88)) {
                            i5 = 87;
                        }
                        int I7 = zzeuVar.I();
                        int i12 = h - 1;
                        byte[] bArr3 = new byte[i12];
                        zzeuVar.F(0, i12, bArr3);
                        int g2 = g(0, I7, bArr3);
                        String str = new String(bArr3, 0, g2, e(I7));
                        int i13 = g2 + i(I7);
                        zzajqVar = new zzakf("WXXX", str, j(bArr3, i13, h(i13, bArr3), StandardCharsets.ISO_8859_1));
                        i4 = I;
                    } else {
                        i5 = I;
                    }
                    if (i5 == 87) {
                        String f2 = f(i, 87, I2, I3, I4);
                        byte[] bArr4 = new byte[h];
                        zzeuVar.F(0, h, bArr4);
                        zzajqVar = new zzakf(f2, null, new String(bArr4, 0, h(0, bArr4), StandardCharsets.ISO_8859_1));
                    } else {
                        if (i5 == 80) {
                            if (I2 == 82 && I3 == 73 && I4 == 86) {
                                byte[] bArr5 = new byte[h];
                                zzeuVar.F(0, h, bArr5);
                                int h3 = h(0, bArr5);
                                String str2 = new String(bArr5, 0, h3, StandardCharsets.ISO_8859_1);
                                int i14 = h3 + 1;
                                zzajqVar = new zzakd(str2, h <= i14 ? zzfm.b : Arrays.copyOfRange(bArr5, i14, h));
                            } else {
                                i5 = 80;
                            }
                        }
                        if (i5 == 71) {
                            if (I2 != 69 || I3 != 79 || (I4 != 66 && i != 2)) {
                                i5 = 71;
                            }
                            int I8 = zzeuVar.I();
                            Charset e = e(I8);
                            int i15 = h - 1;
                            byte[] bArr6 = new byte[i15];
                            zzeuVar.F(0, i15, bArr6);
                            int h4 = h(0, bArr6);
                            String h5 = zzas.h(new String(bArr6, 0, h4, StandardCharsets.ISO_8859_1));
                            int i16 = h4 + 1;
                            int g3 = g(i16, I8, bArr6);
                            String j = j(bArr6, i16, g3, e);
                            int i17 = g3 + i(I8);
                            int g4 = g(i17, I8, bArr6);
                            String j2 = j(bArr6, i17, g4, e);
                            int i18 = g4 + i(I8);
                            i4 = I;
                            zzajqVar = new zzaju(h5, j, j2, i15 <= i18 ? zzfm.b : Arrays.copyOfRange(bArr6, i18, i15));
                        }
                        try {
                            if (i == 2) {
                                if (i5 == 80 && I2 == 73 && I3 == 67) {
                                    int I9 = zzeuVar.I();
                                    Charset e2 = e(I9);
                                    int i19 = h - 1;
                                    byte[] bArr7 = new byte[i19];
                                    zzeuVar.F(0, i19, bArr7);
                                    if (i == 2) {
                                        i4 = I;
                                        concat = "image/".concat(String.valueOf(zzgts.a(new String(bArr7, 0, 3, StandardCharsets.ISO_8859_1))));
                                        if ("image/jpg".equals(concat)) {
                                            concat = "image/jpeg";
                                        }
                                        h2 = 2;
                                    } else {
                                        i4 = I;
                                        h2 = h(0, bArr7);
                                        String a = zzgts.a(new String(bArr7, 0, h2, StandardCharsets.ISO_8859_1));
                                        concat = a.indexOf(47) == -1 ? "image/".concat(a) : a;
                                    }
                                    int i20 = bArr7[h2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    int i21 = h2 + 2;
                                    int g5 = g(i21, I9, bArr7);
                                    String str3 = new String(bArr7, i21, g5 - i21, e2);
                                    int i22 = g5 + i(I9);
                                    zzajpVar = new zzajp(concat, str3, i20, i19 <= i22 ? zzfm.b : Arrays.copyOfRange(bArr7, i22, i19));
                                    zzajqVar = zzajpVar;
                                }
                                i4 = I;
                                if (i5 != 67 && I2 == 79 && I3 == 77 && (I4 == 77 || i == 2)) {
                                    if (h >= 4) {
                                        int I10 = zzeuVar.I();
                                        Charset e3 = e(I10);
                                        byte[] bArr8 = new byte[3];
                                        zzeuVar.F(0, 3, bArr8);
                                        String str4 = new String(bArr8, 0, 3);
                                        int i23 = h - 4;
                                        byte[] bArr9 = new byte[i23];
                                        zzeuVar.F(0, i23, bArr9);
                                        int g6 = g(0, I10, bArr9);
                                        String str5 = new String(bArr9, 0, g6, e3);
                                        int i24 = g6 + i(I10);
                                        zzajqVar = new zzajt(str4, str5, j(bArr9, i24, g(i24, I10, bArr9), e3));
                                    }
                                    zzajqVar = null;
                                } else {
                                    if (i5 != 67 && I2 == 72 && I3 == 65 && I4 == 80) {
                                        int i25 = zzeuVar.b;
                                        int h6 = h(i25, zzeuVar.a);
                                        String str6 = new String(zzeuVar.a, i25, h6 - i25, StandardCharsets.ISO_8859_1);
                                        zzeuVar.D(h6 + 1);
                                        int b = zzeuVar.b();
                                        int b2 = zzeuVar.b();
                                        if (b > b2) {
                                            zzajqVar = null;
                                        } else {
                                            long N = zzeuVar.N();
                                            long j3 = N == 4294967295L ? -1L : N;
                                            long N2 = zzeuVar.N();
                                            long j4 = N2 == 4294967295L ? -1L : N2;
                                            ArrayList arrayList = new ArrayList();
                                            int i26 = i25 + h;
                                            while (zzeuVar.b < i26) {
                                                zzajz b3 = b(i, zzeuVar, z, null);
                                                if (b3 != null) {
                                                    arrayList.add(b3);
                                                }
                                            }
                                            zzakcVar = new zzajr(str6, b, b2, j3, j4, (zzajz[]) arrayList.toArray(new zzajz[0]));
                                        }
                                    } else if (i5 != 67 && I2 == 84 && I3 == 79 && I4 == 67) {
                                        int i27 = zzeuVar.b;
                                        int h7 = h(i27, zzeuVar.a);
                                        String str7 = new String(zzeuVar.a, i27, h7 - i27, StandardCharsets.ISO_8859_1);
                                        zzeuVar.D(h7 + 1);
                                        int I11 = zzeuVar.I();
                                        boolean z6 = (I11 & 2) != 0;
                                        int i28 = I11 & 1;
                                        int I12 = zzeuVar.I();
                                        String[] strArr = new String[I12];
                                        int i29 = 0;
                                        while (i29 < I12) {
                                            int i30 = zzeuVar.b;
                                            int h8 = h(i30, zzeuVar.a);
                                            strArr[i29] = new String(zzeuVar.a, i30, h8 - i30, StandardCharsets.ISO_8859_1);
                                            zzeuVar.D(h8 + 1);
                                            i29++;
                                            i27 = i27;
                                            I12 = I12;
                                            str7 = str7;
                                        }
                                        int i31 = i27;
                                        String str8 = str7;
                                        ArrayList arrayList2 = new ArrayList();
                                        int i32 = i31 + h;
                                        while (zzeuVar.b < i32) {
                                            zzajz b4 = b(i, zzeuVar, z, null);
                                            if (b4 != null) {
                                                arrayList2.add(b4);
                                            }
                                        }
                                        zzakcVar = new zzajs(str8, z6, 1 == i28, strArr, (zzajz[]) arrayList2.toArray(new zzajz[0]));
                                    } else if (i5 != 77 && I2 == 76 && I3 == 76 && I4 == 84) {
                                        int J2 = zzeuVar.J();
                                        int M = zzeuVar.M();
                                        int M2 = zzeuVar.M();
                                        int I13 = zzeuVar.I();
                                        int I14 = zzeuVar.I();
                                        zzet zzetVar = new zzet();
                                        zzetVar.a(zzeuVar);
                                        int i33 = ((h - 10) * 8) / (I13 + I14);
                                        int[] iArr = new int[i33];
                                        int[] iArr2 = new int[i33];
                                        for (int i34 = 0; i34 < i33; i34++) {
                                            int h9 = zzetVar.h(I13);
                                            int h10 = zzetVar.h(I14);
                                            iArr[i34] = h9;
                                            iArr2[i34] = h10;
                                        }
                                        zzakcVar = new zzakc(J2, M, iArr, iArr2, M2);
                                    } else {
                                        String f3 = f(i, i5, I2, I3, I4);
                                        byte[] bArr10 = new byte[h];
                                        zzeuVar.F(0, h, bArr10);
                                        zzajqVar = new zzajq(f3, bArr10);
                                    }
                                    zzajqVar = zzakcVar;
                                }
                            } else {
                                if (i5 == 65) {
                                    if (I2 == 80) {
                                        if (I3 == 73) {
                                        }
                                    }
                                }
                                i4 = I;
                                if (i5 != 67) {
                                }
                                if (i5 != 67) {
                                }
                                if (i5 != 67) {
                                }
                                if (i5 != 77) {
                                }
                                String f32 = f(i, i5, I2, I3, I4);
                                byte[] bArr102 = new byte[h];
                                zzeuVar.F(0, h, bArr102);
                                zzajqVar = new zzajq(f32, bArr102);
                            }
                        } catch (Exception e4) {
                            e = e4;
                            zzeuVar.D(i6);
                            zzajzVar = null;
                            if (zzajzVar == null) {
                            }
                            return zzajzVar;
                        } catch (OutOfMemoryError e5) {
                            e = e5;
                            zzeuVar.D(i6);
                            zzajzVar = null;
                            if (zzajzVar == null) {
                            }
                            return zzajzVar;
                        }
                    }
                    i4 = I;
                }
                zzeuVar.D(i6);
                zzajzVar = zzajqVar;
                e = null;
            } catch (Throwable th) {
                zzeuVar.D(i6);
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            i4 = I;
            zzeuVar.D(i6);
            zzajzVar = null;
            if (zzajzVar == null) {
            }
            return zzajzVar;
        } catch (OutOfMemoryError e7) {
            e = e7;
            i4 = I;
            zzeuVar.D(i6);
            zzajzVar = null;
            if (zzajzVar == null) {
            }
            return zzajzVar;
        }
        if (zzajzVar == null) {
            String f4 = f(i, i4, I2, I3, I4);
            StringBuilder sb = new StringBuilder(f4.length() + 39 + String.valueOf(h).length());
            sb.append("Failed to decode frame: id=");
            sb.append(f4);
            sb.append(", frameSize=");
            sb.append(h);
            zzeh.d(sb.toString(), e);
        }
        return zzajzVar;
    }

    public static s c(int i, int i2, byte[] bArr) {
        if (i2 >= bArr.length) {
            return zzgxm.t("");
        }
        mio mioVar = zzgxm.b;
        zzgxj zzgxjVar = new zzgxj();
        int g = g(i2, i, bArr);
        while (i2 < g) {
            zzgxjVar.c(new String(bArr, i2, g - i2, e(i)));
            i2 = i(i) + g;
            g = g(i2, i, bArr);
        }
        s f = zzgxjVar.f();
        return f.isEmpty() ? zzgxm.t("") : f;
    }

    public static int d(int i, zzeu zzeuVar) {
        byte[] bArr = zzeuVar.a;
        int i2 = zzeuVar.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    public static Charset e(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String f(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int g(int i, int i2, byte[] bArr) {
        int h = h(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return h;
        }
        while (true) {
            int length = bArr.length;
            if (h >= length - 1) {
                return length;
            }
            int i3 = h + 1;
            if ((h - i) % 2 == 0 && bArr[i3] == 0) {
                return h;
            }
            h = h(i3, bArr);
        }
    }

    public static int h(int i, byte[] bArr) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    public static int i(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static String j(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }
}
