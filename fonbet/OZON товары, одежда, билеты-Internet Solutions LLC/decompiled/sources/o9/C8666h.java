package o9;

import h9.AbstractC6877b;
import h9.m;
import java.lang.reflect.Array;

/* renamed from: o9.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C8666h extends AbstractC6877b {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f77818e = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    private byte[] f77819b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f77820c;

    /* renamed from: d, reason: collision with root package name */
    private C8660b f77821d;

    public C8666h(h9.j jVar) {
        super(jVar);
        this.f77819b = f77818e;
        this.f77820c = new int[32];
    }

    private static int d(int[] iArr) throws m {
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = iArr[i14];
            if (i15 > i11) {
                i13 = i14;
                i11 = i15;
            }
            if (i15 > i12) {
                i12 = i15;
            }
        }
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < length; i18++) {
            int i19 = i18 - i13;
            int i21 = iArr[i18] * i19 * i19;
            if (i21 > i17) {
                i16 = i18;
                i17 = i21;
            }
        }
        if (i13 <= i16) {
            int i22 = i13;
            i13 = i16;
            i16 = i22;
        }
        if (i13 - i16 <= length / 16) {
            throw m.a();
        }
        int i23 = i13 - 1;
        int i24 = -1;
        int i25 = i23;
        while (i23 > i16) {
            int i26 = i23 - i16;
            int i27 = (i12 - iArr[i23]) * (i13 - i23) * i26 * i26;
            if (i27 > i24) {
                i25 = i23;
                i24 = i27;
            }
            i23--;
        }
        return i25 << 3;
    }

    public final C8660b e() throws m {
        int[] iArr;
        C8660b c8660b = this.f77821d;
        if (c8660b != null) {
            return c8660b;
        }
        h9.j b11 = b();
        int d11 = b11.d();
        int a11 = b11.a();
        int i11 = 0;
        boolean z11 = true;
        if (d11 < 40 || a11 < 40) {
            h9.j b12 = b();
            int d12 = b12.d();
            int a12 = b12.a();
            C8660b c8660b2 = new C8660b(d12, a12);
            if (this.f77819b.length < d12) {
                this.f77819b = new byte[d12];
            }
            int i12 = 0;
            while (true) {
                iArr = this.f77820c;
                if (i12 >= 32) {
                    break;
                }
                iArr[i12] = 0;
                i12++;
            }
            for (int i13 = 1; i13 < 5; i13++) {
                byte[] c11 = b12.c((a12 * i13) / 5, this.f77819b);
                int i14 = (d12 << 2) / 5;
                for (int i15 = d12 / 5; i15 < i14; i15++) {
                    int i16 = (c11[i15] & 255) >> 3;
                    iArr[i16] = iArr[i16] + 1;
                }
            }
            int d13 = d(iArr);
            byte[] b13 = b12.b();
            for (int i17 = 0; i17 < a12; i17++) {
                int i18 = i17 * d12;
                for (int i19 = 0; i19 < d12; i19++) {
                    if ((b13[i18 + i19] & 255) < d13) {
                        c8660b2.l(i19, i17);
                    }
                }
            }
            this.f77821d = c8660b2;
        } else {
            byte[] b14 = b11.b();
            int i21 = d11 >> 3;
            if ((d11 & 7) != 0) {
                i21++;
            }
            int i22 = a11 >> 3;
            if ((a11 & 7) != 0) {
                i22++;
            }
            int i23 = a11 - 8;
            int i24 = d11 - 8;
            int i25 = 2;
            int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i22, i21);
            int i26 = 0;
            while (true) {
                int i27 = 8;
                if (i26 >= i22) {
                    break;
                }
                int i28 = i26 << 3;
                if (i28 > i23) {
                    i28 = i23;
                }
                int i29 = i11;
                while (i11 < i21) {
                    boolean z12 = z11;
                    int i31 = i11 << 3;
                    if (i31 > i24) {
                        i31 = i24;
                    }
                    int i32 = (i28 * d11) + i31;
                    int i33 = i25;
                    int i34 = i29;
                    int i35 = i34;
                    int i36 = i35;
                    int i37 = 255;
                    while (i34 < i27) {
                        byte[] bArr = b14;
                        int i38 = i29;
                        int i39 = i36;
                        while (i38 < i27) {
                            int i41 = i38;
                            int i42 = bArr[i32 + i38] & 255;
                            i35 += i42;
                            if (i42 < i37) {
                                i37 = i42;
                            }
                            if (i42 > i39) {
                                i39 = i42;
                            }
                            i38 = i41 + 1;
                            i27 = 8;
                        }
                        if (i39 - i37 > 24) {
                            while (true) {
                                i34++;
                                i32 += d11;
                                if (i34 < 8) {
                                    int i43 = i29;
                                    for (int i44 = 8; i43 < i44; i44 = 8) {
                                        i35 += bArr[i32 + i43] & 255;
                                        i43++;
                                        i11 = i11;
                                    }
                                }
                            }
                        }
                        i34++;
                        i32 += d11;
                        i36 = i39;
                        b14 = bArr;
                        i11 = i11;
                        i27 = 8;
                    }
                    byte[] bArr2 = b14;
                    int i45 = i11;
                    int i46 = i35 >> 6;
                    if (i36 - i37 <= 24) {
                        i46 = i37 / 2;
                        if (i26 > 0 && i45 > 0) {
                            int[] iArr3 = iArr2[i26 - 1];
                            int i47 = i45 - 1;
                            int i48 = (((iArr2[i26][i47] * 2) + iArr3[i45]) + iArr3[i47]) / 4;
                            if (i37 < i48) {
                                i46 = i48;
                            }
                        }
                    }
                    iArr2[i26][i45] = i46;
                    i11 = i45 + 1;
                    z11 = z12;
                    i25 = i33;
                    b14 = bArr2;
                    i27 = 8;
                }
                i26++;
                i11 = i29;
            }
            byte[] bArr3 = b14;
            int i49 = i11;
            int i51 = i25;
            C8660b c8660b3 = new C8660b(d11, a11);
            int i52 = i49;
            while (i52 < i22) {
                int i53 = i52 << 3;
                if (i53 > i23) {
                    i53 = i23;
                }
                int min = i52 < i51 ? 2 : Math.min(i52, i22 - 3);
                int i54 = i49;
                while (i54 < i21) {
                    int i55 = i54 << 3;
                    if (i55 > i24) {
                        i55 = i24;
                    }
                    int min2 = i54 < 2 ? 2 : Math.min(i54, i21 - 3);
                    int i56 = -2;
                    int i57 = i49;
                    for (int i58 = 2; i56 <= i58; i58 = 2) {
                        int[] iArr4 = iArr2[min + i56];
                        i57 = iArr4[min2 - 2] + iArr4[min2 - 1] + iArr4[min2] + iArr4[min2 + 1] + iArr4[min2 + 2] + i57;
                        i56++;
                    }
                    int i59 = i57 / 25;
                    int i61 = (i53 * d11) + i55;
                    int i62 = d11;
                    int i63 = i49;
                    while (true) {
                        if (i63 < 8) {
                            int i64 = i63;
                            int i65 = i49;
                            for (int i66 = 8; i65 < i66; i66 = 8) {
                                int i67 = i65;
                                if ((bArr3[i61 + i65] & 255) <= i59) {
                                    c8660b3.l(i55 + i67, i53 + i64);
                                }
                                i65 = i67 + 1;
                            }
                            i63 = i64 + 1;
                            i61 += i62;
                        }
                    }
                    i54++;
                    d11 = i62;
                }
                i51 = 2;
                i52++;
            }
            this.f77821d = c8660b3;
        }
        return this.f77821d;
    }

    public final C8659a f(int i11, C8659a c8659a) throws m {
        int[] iArr;
        h9.j b11 = b();
        int d11 = b11.d();
        if (c8659a.j() < d11) {
            c8659a = new C8659a(d11);
        } else {
            c8659a.d();
        }
        if (this.f77819b.length < d11) {
            this.f77819b = new byte[d11];
        }
        int i12 = 0;
        while (true) {
            iArr = this.f77820c;
            if (i12 >= 32) {
                break;
            }
            iArr[i12] = 0;
            i12++;
        }
        byte[] c11 = b11.c(i11, this.f77819b);
        for (int i13 = 0; i13 < d11; i13++) {
            int i14 = (c11[i13] & 255) >> 3;
            iArr[i14] = iArr[i14] + 1;
        }
        int d12 = d(iArr);
        if (d11 < 3) {
            for (int i15 = 0; i15 < d11; i15++) {
                if ((c11[i15] & 255) < d12) {
                    c8659a.n(i15);
                }
            }
        } else {
            int i16 = c11[0] & 255;
            int i17 = c11[1] & 255;
            int i18 = 1;
            while (i18 < d11 - 1) {
                int i19 = i18 + 1;
                int i21 = c11[i19] & 255;
                if ((((i17 << 2) - i16) - i21) / 2 < d12) {
                    c8659a.n(i18);
                }
                i16 = i17;
                i18 = i19;
                i17 = i21;
            }
        }
        return c8659a;
    }
}
