package com.google.android.gms.internal.ads;

import android.util.Pair;
import defpackage.mio;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzabi extends zzabl {
    @Override // com.google.android.gms.internal.ads.zzabl
    public final void e(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final zzabm f(zzng[] zzngVarArr, zzzr zzzrVar, zzxo zzxoVar, zzbf zzbfVar) {
        s sVar;
        int[] iArr;
        zzzr zzzrVar2 = zzzrVar;
        int[] iArr2 = new int[3];
        zzbg[][] zzbgVarArr = new zzbg[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzzrVar2.a;
            zzbgVarArr[i] = new zzbg[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzngVarArr[i4].zzu();
        }
        int i5 = 0;
        while (i5 < zzzrVar2.a) {
            zzbg a = zzzrVar2.a(i5);
            int i6 = a.c;
            zzv[] zzvVarArr = a.d;
            int i7 = a.a;
            int i8 = i3;
            int i9 = 0;
            int i10 = 0;
            boolean z = true;
            while (i9 < i3) {
                zzng zzngVar = zzngVarArr[i9];
                int i11 = 0;
                for (int i12 = 0; i12 < i7; i12++) {
                    i11 = Math.max(i11, zzngVar.c(zzvVarArr[i12]) & 7);
                }
                boolean z2 = iArr2[i9] == 0;
                if (i11 <= i10) {
                    if (i11 == i10 && i6 == 5 && !z && z2) {
                        z = true;
                    }
                    i9++;
                    i3 = 2;
                } else {
                    z = z2;
                }
                i10 = i11;
                i8 = i9;
                i9++;
                i3 = 2;
            }
            if (i8 == i3) {
                iArr = new int[i7];
            } else {
                zzng zzngVar2 = zzngVarArr[i8];
                int[] iArr5 = new int[i7];
                for (int i13 = 0; i13 < i7; i13++) {
                    iArr5[i13] = zzngVar2.c(zzvVarArr[i13]);
                }
                iArr = iArr5;
            }
            int i14 = iArr2[i8];
            zzbgVarArr[i8][i14] = a;
            iArr3[i8][i14] = iArr;
            iArr2[i8] = i14 + 1;
            i5++;
            zzzrVar2 = zzzrVar;
            i3 = 2;
        }
        int i15 = i3;
        zzzr[] zzzrVarArr = new zzzr[i15];
        String[] strArr = new String[i15];
        int[] iArr6 = new int[i15];
        int i16 = 0;
        while (i16 < i15) {
            int i17 = iArr2[i16];
            zzzrVarArr[i16] = new zzzr((zzbg[]) zzfm.o(i17, zzbgVarArr[i16]));
            iArr3[i16] = (int[][]) zzfm.o(i17, iArr3[i16]);
            strArr[i16] = zzngVarArr[i16].a();
            iArr6[i16] = zzngVarArr[i16].zza();
            i16++;
            i15 = 2;
        }
        int i18 = i15;
        zzabh zzabhVar = new zzabh(iArr6, zzzrVarArr, iArr4, iArr3, new zzzr((zzbg[]) zzfm.o(iArr2[i18], zzbgVarArr[i18])));
        Pair g = g(zzabhVar, iArr3, iArr4);
        zzabj[] zzabjVarArr = (zzabj[]) g.second;
        int length = zzabjVarArr.length;
        List[] listArr = new List[length];
        for (int i19 = 0; i19 < zzabjVarArr.length; i19++) {
            zzabj zzabjVar = zzabjVarArr[i19];
            if (zzabjVar != null) {
                sVar = zzgxm.t(zzabjVar);
            } else {
                mio mioVar = zzgxm.b;
                sVar = s.e;
            }
            listArr[i19] = sVar;
        }
        zzgxj zzgxjVar = new zzgxj();
        int i20 = 0;
        while (i20 < 2) {
            zzzr zzzrVar3 = zzzrVarArr[i20];
            int i21 = 0;
            while (i21 < zzzrVar3.a) {
                zzbg a2 = zzzrVar3.a(i21);
                int i22 = zzzrVarArr[i20].a(i21).a;
                int[] iArr7 = new int[i22];
                int i23 = 0;
                int i24 = 0;
                while (i23 < i22) {
                    List[] listArr2 = listArr;
                    if ((iArr3[i20][i21][i23] & 7) == 4) {
                        iArr7[i24] = i23;
                        i24++;
                    }
                    i23++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr7, i24);
                String str = null;
                int i25 = 16;
                int i26 = i20;
                int i27 = 0;
                boolean z3 = false;
                int i28 = 0;
                while (i27 < copyOf.length) {
                    int[] iArr8 = copyOf;
                    String str2 = zzzrVarArr[i26].a(i21).d[copyOf[i27]].o;
                    int i29 = i28 + 1;
                    if (i28 == 0) {
                        str = str2;
                    } else {
                        z3 |= !Objects.equals(str, str2);
                    }
                    i25 = Math.min(i25, iArr3[i26][i21][i27] & 24);
                    i27++;
                    copyOf = iArr8;
                    i28 = i29;
                }
                if (z3) {
                    i25 = Math.min(i25, zzabhVar.c[i26]);
                }
                boolean z4 = i25 != 0;
                int i30 = a2.a;
                int[] iArr9 = new int[i30];
                boolean[] zArr = new boolean[i30];
                for (int i31 = 0; i31 < i30; i31++) {
                    iArr9[i31] = iArr3[i26][i21][i31] & 7;
                    int i32 = 0;
                    boolean z5 = false;
                    while (i32 < length) {
                        int i33 = length;
                        List list = listArr3[i32];
                        int i34 = i30;
                        zzzr[] zzzrVarArr2 = zzzrVarArr;
                        int i35 = 0;
                        while (true) {
                            if (i35 < list.size()) {
                                zzabj zzabjVar2 = (zzabj) list.get(i35);
                                List list2 = list;
                                if (zzabjVar2.zza().equals(a2) && zzabjVar2.f(i31) != -1) {
                                    z5 = true;
                                    break;
                                }
                                i35++;
                                list = list2;
                            }
                        }
                        i32++;
                        length = i33;
                        i30 = i34;
                        zzzrVarArr = zzzrVarArr2;
                    }
                    zArr[i31] = z5;
                }
                zzgxjVar.c(new zzbm(a2, z4, iArr9, zArr));
                i21++;
                i20 = i26;
                length = length;
                listArr = listArr3;
            }
            i20++;
        }
        int i36 = 0;
        while (true) {
            zzzr zzzrVar4 = zzabhVar.d;
            if (i36 >= zzzrVar4.a) {
                return new zzabm((zznh[]) g.first, (zzabe[]) g.second, new zzbn(zzgxjVar.f()), zzabhVar);
            }
            zzbg a3 = zzzrVar4.a(i36);
            int i37 = a3.a;
            int[] iArr10 = new int[i37];
            Arrays.fill(iArr10, 0);
            zzgxjVar.c(new zzbm(a3, false, iArr10, new boolean[i37]));
            i36++;
        }
    }

    public abstract Pair g(zzabh zzabhVar, int[][][] iArr, int[] iArr2);
}
