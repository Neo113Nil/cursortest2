package com.google.android.gms.internal.ads;

import defpackage.p53;
import defpackage.x3f;
import defpackage.x5n;
import java.io.EOFException;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzahc {
    public final zzeu a = new zzeu(10);

    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzap a(zzagi zzagiVar, x3f x3fVar, int i) {
        int i2;
        zzap zzapVar;
        p53 p53Var;
        int i3;
        int i4 = 0;
        zzap zzapVar2 = null;
        loop0: while (true) {
            int i5 = 0;
            do {
                int i6 = i5 % 10;
                zzeu zzeuVar = this.a;
                if (i6 == 0) {
                    if (i5 != 0) {
                        byte[] bArr = zzeuVar.a;
                        System.arraycopy(bArr, 10, bArr, 0, 9);
                    }
                    i2 = 0;
                } else {
                    i2 = i6;
                }
                boolean z = true;
                int i7 = i5 == 0 ? 10 : 1;
                try {
                    int i8 = i6 + 10;
                    zzagiVar.h(i8 - i7, i7, zzeuVar.a);
                    zzeuVar.D(i2);
                    zzeuVar.C(i8);
                    if (zzeuVar.B() < 3) {
                        int i9 = zzeuVar.b;
                        int i10 = zzeuVar.c;
                        defpackage.zzl.r(x5n.n(new StringBuilder(String.valueOf(i9).length() + 17 + String.valueOf(i10).length()), i9, "position=", i10, ", limit="));
                        return null;
                    }
                    int M = zzeuVar.M();
                    int i11 = zzeuVar.b - 3;
                    zzeuVar.b = i11;
                    if (M != 4801587) {
                        if (zzahf.a(zzeuVar.H()) != -1) {
                            break loop0;
                        }
                        if (i5 == 0) {
                            zzeuVar.A(20);
                        }
                        i5++;
                    } else {
                        zzeuVar.E(6);
                        int g = zzeuVar.g();
                        int i12 = g + 10;
                        if (zzapVar2 == null) {
                            byte[] bArr2 = new byte[i12];
                            System.arraycopy(zzeuVar.a, i11, bArr2, 0, 10);
                            zzagiVar.h(10, g, bArr2);
                            new zzajj();
                            ArrayList arrayList = new ArrayList();
                            zzeu zzeuVar2 = new zzeu(bArr2, i12);
                            if (zzeuVar2.B() < 10) {
                                zzeh.c("Data too short to be an ID3 tag");
                            } else {
                                int M2 = zzeuVar2.M();
                                if (M2 != 4801587) {
                                    zzeh.c("Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(M2))));
                                } else {
                                    int I = zzeuVar2.I();
                                    zzeuVar2.E(1);
                                    int I2 = zzeuVar2.I();
                                    int g2 = zzeuVar2.g();
                                    if (I == 2) {
                                        if ((I2 & 64) != 0) {
                                            zzeh.c("Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                                        }
                                    } else if (I == 3) {
                                        if ((I2 & 64) != 0) {
                                            int b = zzeuVar2.b();
                                            zzeuVar2.E(b);
                                            g2 -= b + 4;
                                        }
                                    } else if (I == 4) {
                                        if ((I2 & 64) != 0) {
                                            int g3 = zzeuVar2.g();
                                            zzapVar = null;
                                            zzeuVar2.E(g3 - 4);
                                            g2 -= g3;
                                        } else {
                                            zzapVar = null;
                                        }
                                        if ((I2 & 16) != 0) {
                                            g2 -= 10;
                                        }
                                        i3 = g2;
                                        p53Var = new p53(I, I >= 4 && (I2 & 128) != 0, i3);
                                        if (p53Var != null) {
                                            int i13 = p53Var.a;
                                            int i14 = zzeuVar2.b;
                                            int i15 = i13 == 2 ? 6 : 10;
                                            boolean z2 = p53Var.b;
                                            int i16 = p53Var.c;
                                            if (z2) {
                                                i16 = zzajy.d(i16, zzeuVar2);
                                            }
                                            zzeuVar2.C(i14 + i16);
                                            if (zzajy.a(zzeuVar2, i13, i15, false)) {
                                                z = false;
                                            } else if (i13 != 4 || !zzajy.a(zzeuVar2, 4, i15, true)) {
                                                x5n.p(i13, "Failed to validate ID3 tag with majorVersion=", new StringBuilder(String.valueOf(i13).length() + 45));
                                            }
                                            while (zzeuVar2.B() >= i15) {
                                                zzajz b2 = zzajy.b(i13, zzeuVar2, z, x3fVar);
                                                if (b2 != null) {
                                                    arrayList.add(b2);
                                                }
                                            }
                                            zzapVar2 = new zzap(arrayList);
                                        }
                                        zzapVar2 = zzapVar;
                                    } else {
                                        zzapVar = null;
                                        x5n.p(I, "Skipped ID3 tag with unsupported majorVersion=", new StringBuilder(String.valueOf(I).length() + 46));
                                        p53Var = null;
                                        if (p53Var != null) {
                                        }
                                        zzapVar2 = zzapVar;
                                    }
                                    i3 = g2;
                                    zzapVar = null;
                                    p53Var = new p53(I, I >= 4 && (I2 & 128) != 0, i3);
                                    if (p53Var != null) {
                                    }
                                    zzapVar2 = zzapVar;
                                }
                            }
                            p53Var = null;
                            zzapVar = null;
                            if (p53Var != null) {
                            }
                            zzapVar2 = zzapVar;
                        } else {
                            zzagiVar.d(g);
                        }
                        i4 += i12;
                    }
                } catch (EOFException unused) {
                }
            } while (i5 <= i);
        }
        zzagiVar.zzl();
        zzagiVar.d(i4);
        return zzapVar2;
    }
}
