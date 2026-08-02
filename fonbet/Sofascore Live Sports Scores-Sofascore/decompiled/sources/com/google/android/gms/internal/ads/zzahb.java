package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzahb {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final String n;
    public final zzgo o;

    public zzahb(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, zzgo zzgoVar) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = f;
        this.m = i11;
        this.n = str;
        this.o = zzgoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzahb a(zzeu zzeuVar, boolean z, zzgo zzgoVar) {
        boolean z2;
        boolean z3;
        int i;
        int i2;
        char c;
        zzgk zzgkVar;
        int i3;
        int i4;
        int i5;
        int i6 = 4;
        boolean z4 = true;
        if (z) {
            try {
                zzeuVar.E(4);
            } catch (ArrayIndexOutOfBoundsException e) {
                e = e;
                z3 = true;
                throw zzat.a(e, "Error parsing".concat(z3 != z ? "HEVC config" : "L-HEVC config"));
            }
        } else {
            try {
                zzeuVar.E(21);
            } catch (ArrayIndexOutOfBoundsException e2) {
                e = e2;
                z2 = z4;
                z3 = z2;
                throw zzat.a(e, "Error parsing".concat(z3 != z ? "HEVC config" : "L-HEVC config"));
            }
        }
        int I = zzeuVar.I() & 3;
        int I2 = zzeuVar.I();
        int i7 = zzeuVar.b;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < I2; i10++) {
            zzeuVar.E(1);
            int J = zzeuVar.J();
            for (int i11 = 0; i11 < J; i11++) {
                int J2 = zzeuVar.J();
                i9 += J2 + 4;
                zzeuVar.E(J2);
            }
        }
        zzeuVar.D(i7);
        byte[] bArr = new byte[i9];
        zzgo zzgoVar2 = zzgoVar;
        int i12 = 0;
        float f = 1.0f;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        int i19 = -1;
        int i20 = -1;
        int i21 = -1;
        int i22 = -1;
        String str = null;
        int i23 = 0;
        while (i23 < I2) {
            int I3 = zzeuVar.I() & 63;
            int J3 = zzeuVar.J();
            z2 = z4;
            int i24 = i8;
            zzgo zzgoVar3 = zzgoVar2;
            while (i24 < J3) {
                try {
                    int J4 = zzeuVar.J();
                    int i25 = i24;
                    System.arraycopy(zzgr.a, i8, bArr, i12, i6);
                    int i26 = i12 + 4;
                    System.arraycopy(zzeuVar.a, zzeuVar.b, bArr, i26, J4);
                    int i27 = 32;
                    if (I3 != 32) {
                        i27 = I3;
                    } else if (i25 == 0) {
                        zzgoVar3 = zzgr.e(i26, i26 + J4, bArr);
                        i2 = i26;
                        i = I;
                        i4 = 0;
                        i3 = 0;
                        c = '?';
                        i12 = i2 + J4;
                        zzeuVar.E(J4);
                        i24 = i4 + 1;
                        i6 = 4;
                        i8 = i3;
                        I = i;
                    }
                    i = I;
                    if (i27 != 33) {
                        i2 = i26;
                        int i28 = 8;
                        if (i27 == 39 && i25 == 0) {
                            int i29 = i12 + 6;
                            int i30 = (i2 + J4) - 1;
                            while (true) {
                                byte b = bArr[i30];
                                if (b != 0) {
                                    if (b != 0) {
                                        if (i30 > i29) {
                                            zzgz zzgzVar = new zzgz(bArr, i29, i30 + 1);
                                            while (zzgzVar.c(16)) {
                                                int i31 = i28;
                                                int e3 = zzgzVar.e(i31);
                                                int i32 = 0;
                                                while (e3 == 255) {
                                                    i32 += 255;
                                                    e3 = zzgzVar.e(i31);
                                                }
                                                int i33 = i32 + e3;
                                                int e4 = zzgzVar.e(i31);
                                                int i34 = 0;
                                                while (e4 == 255) {
                                                    i34 += 255;
                                                    e4 = zzgzVar.e(8);
                                                }
                                                i28 = 8;
                                                int i35 = i34 + e4;
                                                if (i35 == 0) {
                                                    break;
                                                }
                                                if (zzgzVar.c(i35)) {
                                                    if (i33 == 176) {
                                                        int g = zzgzVar.g();
                                                        boolean d = zzgzVar.d();
                                                        int g2 = d ? zzgzVar.g() : 0;
                                                        int g3 = zzgzVar.g();
                                                        int i36 = -1;
                                                        int i37 = 0;
                                                        while (i37 <= g3) {
                                                            int g4 = zzgzVar.g();
                                                            zzgzVar.g();
                                                            int i38 = i37;
                                                            int e5 = zzgzVar.e(6);
                                                            if (e5 == 63) {
                                                                c = '?';
                                                            } else {
                                                                zzgzVar.e(e5 == 0 ? Math.max(0, g - 30) : Math.max(0, (e5 + g) - 31));
                                                                if (d) {
                                                                    int e6 = zzgzVar.e(6);
                                                                    if (e6 == 63) {
                                                                        c = '?';
                                                                    } else {
                                                                        zzgzVar.e(e6 == 0 ? Math.max(0, g2 - 30) : Math.max(0, (e6 + g2) - 31));
                                                                    }
                                                                }
                                                                if (zzgzVar.d()) {
                                                                    zzgzVar.b(10);
                                                                }
                                                                i37 = i38 + 1;
                                                                i36 = g4;
                                                            }
                                                            zzgkVar = null;
                                                            break;
                                                        }
                                                        c = '?';
                                                        zzgkVar = new zzgk(i36);
                                                    } else {
                                                        zzgzVar.b(i35 * 8);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    c = '?';
                                    zzgkVar = null;
                                    break;
                                } else {
                                    if (i30 <= i29) {
                                        break;
                                    }
                                    i30--;
                                }
                            }
                            zzgkVar = null;
                            c = '?';
                            if (zzgkVar == null || zzgoVar3 == null) {
                                i3 = 0;
                            } else {
                                i3 = 0;
                                if (zzgkVar.a == ((zzge) zzgoVar3.a.get(0)).b) {
                                    i4 = i25;
                                    i21 = 4;
                                    i12 = i2 + J4;
                                    zzeuVar.E(J4);
                                    i24 = i4 + 1;
                                    i6 = 4;
                                    i8 = i3;
                                    I = i;
                                } else {
                                    i21 = 5;
                                }
                            }
                            i4 = i25;
                            i12 = i2 + J4;
                            zzeuVar.E(J4);
                            i24 = i4 + 1;
                            i6 = 4;
                            i8 = i3;
                            I = i;
                        }
                    } else if (i25 == 0) {
                        zzgl f2 = zzgr.f(bArr, i26, i26 + J4, zzgoVar3);
                        int i39 = f2.a + 1;
                        int i40 = f2.g;
                        int i41 = f2.h;
                        int i42 = f2.c + 8;
                        i2 = i26;
                        int i43 = f2.d + 8;
                        int i44 = f2.k;
                        int i45 = f2.l;
                        int i46 = f2.m;
                        float f3 = f2.i;
                        int i47 = f2.j;
                        zzgg zzggVar = f2.b;
                        if (zzggVar != null) {
                            i5 = i47;
                            str = zzdr.a(zzggVar.a, zzggVar.b, zzggVar.c, zzggVar.d, zzggVar.e, zzggVar.f);
                        } else {
                            i5 = i47;
                        }
                        i20 = i46;
                        f = f3;
                        i22 = i5;
                        i4 = i25;
                        i17 = i43;
                        i18 = i44;
                        i19 = i45;
                        i16 = i42;
                        i14 = i40;
                        i15 = i41;
                        i3 = 0;
                        i13 = i39;
                        c = '?';
                        i12 = i2 + J4;
                        zzeuVar.E(J4);
                        i24 = i4 + 1;
                        i6 = 4;
                        i8 = i3;
                        I = i;
                    } else {
                        i2 = i26;
                    }
                    i3 = 0;
                    c = '?';
                    i4 = i25;
                    i12 = i2 + J4;
                    zzeuVar.E(J4);
                    i24 = i4 + 1;
                    i6 = 4;
                    i8 = i3;
                    I = i;
                } catch (ArrayIndexOutOfBoundsException e7) {
                    e = e7;
                    z3 = z2;
                    throw zzat.a(e, "Error parsing".concat(z3 != z ? "HEVC config" : "L-HEVC config"));
                }
            }
            i23++;
            zzgoVar2 = zzgoVar3;
            z4 = z2;
            I = I;
            i6 = 4;
        }
        z2 = z4;
        return new zzahb(i9 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), I + 1, i13, i14, i15, i16, i17, i18, i19, i20, i21, f, i22, str, zzgoVar2);
    }
}
