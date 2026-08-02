package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.bm2;
import defpackage.sfe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaon implements zzanz {
    public final zzeu a = new zzeu();
    public final zzeu b = new zzeu();
    public final sfe c = new sfe(2);
    public Inflater d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzanz
    public final void a(int i, int i2, bm2 bm2Var, byte[] bArr) {
        zzeu zzeuVar;
        zzcy zzcyVar;
        int i3;
        zzeu zzeuVar2;
        int M;
        zzeu zzeuVar3 = this.a;
        zzeuVar3.z(i + i2, bArr);
        zzeuVar3.D(i);
        Inflater inflater = this.d;
        if (inflater == null) {
            inflater = new Inflater();
            this.d = inflater;
        }
        zzeu zzeuVar4 = this.b;
        if (zzfm.i(zzeuVar3, zzeuVar4, inflater)) {
            zzeuVar3.z(zzeuVar4.c, zzeuVar4.a);
        }
        sfe sfeVar = this.c;
        int i4 = 0;
        sfeVar.c = 0;
        zzeu zzeuVar5 = (zzeu) sfeVar.i;
        sfeVar.d = 0;
        sfeVar.e = 0;
        sfeVar.f = 0;
        sfeVar.g = 0;
        sfeVar.h = 0;
        zzeuVar5.y(0);
        sfeVar.b = false;
        int[] iArr = sfeVar.a;
        ArrayList arrayList = new ArrayList();
        while (zzeuVar3.B() >= 3) {
            int i5 = zzeuVar3.c;
            int I = zzeuVar3.I();
            int J = zzeuVar3.J();
            int i6 = zzeuVar3.b + J;
            if (i6 > i5) {
                zzeuVar3.D(i5);
                zzeuVar = zzeuVar3;
                zzcyVar = null;
                i3 = i4;
            } else {
                if (I != 128) {
                    switch (I) {
                        case 20:
                            if (J % 5 != 2) {
                                zzeuVar2 = zzeuVar5;
                                zzeuVar = zzeuVar3;
                            } else {
                                zzeuVar3.E(2);
                                Arrays.fill(iArr, i4);
                                int i7 = J / 5;
                                int i8 = i4;
                                while (i8 < i7) {
                                    int I2 = zzeuVar3.I();
                                    int I3 = zzeuVar3.I();
                                    int I4 = zzeuVar3.I();
                                    int I5 = zzeuVar3.I();
                                    double d = I3;
                                    int I6 = zzeuVar3.I() << 24;
                                    String str = zzfm.a;
                                    zzeu zzeuVar6 = zzeuVar5;
                                    double d2 = I4 - 128;
                                    double d3 = I5 - 128;
                                    iArr[I2] = (Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)) << 8) | I6 | (Math.max(0, Math.min((int) ((1.402d * d2) + d), 255)) << 16) | Math.max(0, Math.min((int) (d + (1.772d * d3)), 255));
                                    i8++;
                                    zzeuVar5 = zzeuVar6;
                                    zzeuVar3 = zzeuVar3;
                                }
                                zzeuVar2 = zzeuVar5;
                                zzeuVar = zzeuVar3;
                                sfeVar.b = true;
                            }
                            zzeuVar5 = zzeuVar2;
                            i3 = 0;
                            zzcyVar = null;
                            break;
                        case 21:
                            if (J >= 4) {
                                zzeuVar3.E(3);
                                int i9 = J - 4;
                                if ((128 & zzeuVar3.I()) != 0) {
                                    if (i9 >= 7 && (M = zzeuVar3.M()) >= 4) {
                                        sfeVar.g = zzeuVar3.J();
                                        sfeVar.h = zzeuVar3.J();
                                        zzeuVar5.y(M - 4);
                                        i9 = J - 11;
                                    }
                                }
                                int i10 = zzeuVar5.b;
                                int i11 = zzeuVar5.c;
                                if (i10 < i11 && i9 > 0) {
                                    int min = Math.min(i9, i11 - i10);
                                    zzeuVar3.F(i10, min, zzeuVar5.a);
                                    zzeuVar5.D(i10 + min);
                                }
                            }
                            zzeuVar = zzeuVar3;
                            zzcyVar = null;
                            i3 = i4;
                            break;
                        case 22:
                            if (J >= 19) {
                                sfeVar.c = zzeuVar3.J();
                                sfeVar.d = zzeuVar3.J();
                                zzeuVar3.E(11);
                                sfeVar.e = zzeuVar3.J();
                                sfeVar.f = zzeuVar3.J();
                            }
                            zzeuVar = zzeuVar3;
                            zzcyVar = null;
                            i3 = i4;
                            break;
                        default:
                            zzeuVar = zzeuVar3;
                            zzcyVar = null;
                            i3 = i4;
                            break;
                    }
                } else {
                    zzeu zzeuVar7 = zzeuVar5;
                    zzeuVar = zzeuVar3;
                    if (sfeVar.c == 0 || sfeVar.d == 0 || sfeVar.g == 0 || sfeVar.h == 0) {
                        zzeuVar5 = zzeuVar7;
                    } else {
                        zzeuVar5 = zzeuVar7;
                        int i12 = zzeuVar5.c;
                        if (i12 != 0 && zzeuVar5.b == i12 && sfeVar.b) {
                            zzeuVar5.D(0);
                            int i13 = sfeVar.g * sfeVar.h;
                            int[] iArr2 = new int[i13];
                            int i14 = 0;
                            while (i14 < i13) {
                                int I7 = zzeuVar5.I();
                                if (I7 != 0) {
                                    iArr2[i14] = iArr[I7];
                                    i14++;
                                } else {
                                    int I8 = zzeuVar5.I();
                                    if (I8 != 0) {
                                        int i15 = I8 & 63;
                                        if ((I8 & 64) != 0) {
                                            i15 = (i15 << 8) | zzeuVar5.I();
                                        }
                                        int i16 = (I8 & 128) == 0 ? iArr[0] : iArr[zzeuVar5.I()];
                                        int i17 = i14 + i15;
                                        Arrays.fill(iArr2, i14, i17, i16);
                                        i14 = i17;
                                    }
                                }
                            }
                            Bitmap createBitmap = Bitmap.createBitmap(iArr2, sfeVar.g, sfeVar.h, Bitmap.Config.ARGB_8888);
                            zzcx zzcxVar = new zzcx();
                            zzcxVar.b = createBitmap;
                            zzcxVar.a = null;
                            float f = sfeVar.e;
                            float f2 = sfeVar.c;
                            zzcxVar.h = f / f2;
                            zzcxVar.i = 0;
                            float f3 = sfeVar.f;
                            float f4 = sfeVar.d;
                            zzcxVar.e = f3 / f4;
                            zzcxVar.f = 0;
                            zzcxVar.g = 0;
                            zzcxVar.l = sfeVar.g / f2;
                            zzcxVar.m = sfeVar.h / f4;
                            zzcyVar = zzcxVar.b();
                            i3 = 0;
                            sfeVar.c = 0;
                            sfeVar.d = 0;
                            sfeVar.e = 0;
                            sfeVar.f = 0;
                            sfeVar.g = 0;
                            sfeVar.h = 0;
                            zzeuVar5.y(0);
                            sfeVar.b = false;
                        }
                    }
                    zzcyVar = null;
                    i3 = 0;
                    sfeVar.c = 0;
                    sfeVar.d = 0;
                    sfeVar.e = 0;
                    sfeVar.f = 0;
                    sfeVar.g = 0;
                    sfeVar.h = 0;
                    zzeuVar5.y(0);
                    sfeVar.b = false;
                }
                zzeuVar.D(i6);
            }
            if (zzcyVar != null) {
                arrayList.add(zzcyVar);
            }
            i4 = i3;
            zzeuVar3 = zzeuVar;
        }
        bm2Var.mo13zza(new zzanr(arrayList, C.TIME_UNSET, C.TIME_UNSET));
    }
}
