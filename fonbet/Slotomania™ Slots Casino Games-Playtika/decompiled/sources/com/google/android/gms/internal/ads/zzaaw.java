package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
public abstract class zzaaw extends zzaaz {
    protected abstract Pair zzh(zzaav zzaavVar, int[][][] iArr, int[] iArr2, zzxc zzxcVar, zzbf zzbfVar) throws zzje;

    @Override // com.google.android.gms.internal.ads.zzaaz
    public final void zzq(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzaaz
    public final zzaba zzr(zzmw[] zzmwVarArr, zzzf zzzfVar, zzxc zzxcVar, zzbf zzbfVar) throws zzje {
        int[] iArr;
        int[] iArr2 = new int[3];
        zzbg[][] zzbgVarArr = new zzbg[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzzfVar.zzb;
            zzbgVarArr[i] = new zzbg[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzmwVarArr[i4].zzu();
        }
        int i5 = 0;
        while (i5 < zzzfVar.zzb) {
            zzbg zza = zzzfVar.zza(i5);
            int i6 = zza.zzc;
            int i7 = i3;
            int i8 = 0;
            int i9 = 0;
            boolean z = true;
            while (i8 < i3) {
                zzmw zzmwVar = zzmwVarArr[i8];
                int i10 = 0;
                for (int i11 = 0; i11 < zza.zza; i11++) {
                    i10 = Math.max(i10, zzmwVar.zzad(zza.zza(i11)) & 7);
                }
                boolean z2 = iArr2[i8] == 0;
                if (i10 > i9) {
                    z = z2;
                    i7 = i8;
                    i9 = i10;
                } else if (i10 == i9 && i6 == 5 && !z && z2) {
                    i7 = i8;
                    i9 = i10;
                    z = true;
                }
                i8++;
                i3 = 2;
            }
            if (i7 == i3) {
                iArr = new int[zza.zza];
            } else {
                zzmw zzmwVar2 = zzmwVarArr[i7];
                int i12 = zza.zza;
                int[] iArr5 = new int[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    iArr5[i13] = zzmwVar2.zzad(zza.zza(i13));
                }
                iArr = iArr5;
            }
            int i14 = iArr2[i7];
            zzbgVarArr[i7][i14] = zza;
            iArr3[i7][i14] = iArr;
            iArr2[i7] = i14 + 1;
            i5++;
            i3 = 2;
        }
        zzzf[] zzzfVarArr = new zzzf[i3];
        String[] strArr = new String[i3];
        int[] iArr6 = new int[i3];
        int i15 = 0;
        while (i15 < i3) {
            int i16 = iArr2[i15];
            zzzfVarArr[i15] = new zzzf((zzbg[]) zzfk.zzb(zzbgVarArr[i15], i16));
            iArr3[i15] = (int[][]) zzfk.zzb(iArr3[i15], i16);
            strArr[i15] = zzmwVarArr[i15].zzU();
            iArr6[i15] = zzmwVarArr[i15].zza();
            i15++;
            i3 = 2;
        }
        int i17 = i3;
        zzaav zzaavVar = new zzaav(strArr, iArr6, zzzfVarArr, iArr4, iArr3, new zzzf((zzbg[]) zzfk.zzb(zzbgVarArr[i17], iArr2[i17])));
        Pair zzh = zzh(zzaavVar, iArr3, iArr4, zzxcVar, zzbfVar);
        zzaax[] zzaaxVarArr = (zzaax[]) zzh.second;
        int length = zzaaxVarArr.length;
        List[] listArr = new List[length];
        for (int i18 = 0; i18 < zzaaxVarArr.length; i18++) {
            zzaax zzaaxVar = zzaaxVarArr[i18];
            listArr[i18] = zzaaxVar != null ? zzgvz.zzj(zzaaxVar) : zzgvz.zzi();
        }
        zzgvw zzgvwVar = new zzgvw();
        for (int i19 = 0; i19 < 2; i19++) {
            zzzf zzb = zzaavVar.zzb(i19);
            int i20 = 0;
            while (i20 < zzb.zzb) {
                zzbg zza2 = zzb.zza(i20);
                boolean z3 = zzaavVar.zzd(i19, i20, false) != 0;
                int i21 = zza2.zza;
                int[] iArr7 = new int[i21];
                boolean[] zArr = new boolean[i21];
                for (int i22 = 0; i22 < i21; i22++) {
                    iArr7[i22] = zzaavVar.zzc(i19, i20, i22) & 7;
                    int i23 = 0;
                    boolean z4 = false;
                    while (i23 < length) {
                        List list = listArr[i23];
                        int i24 = length;
                        List[] listArr2 = listArr;
                        int i25 = 0;
                        while (true) {
                            if (i25 < list.size()) {
                                zzaax zzaaxVar2 = (zzaax) list.get(i25);
                                int i26 = i25;
                                if (zzaaxVar2.zza().equals(zza2) && zzaaxVar2.zzg(i22) != -1) {
                                    z4 = true;
                                    break;
                                }
                                i25 = i26 + 1;
                            }
                        }
                        i23++;
                        length = i24;
                        listArr = listArr2;
                    }
                    zArr[i22] = z4;
                }
                zzgvwVar.zzf(new zzbm(zza2, z3, iArr7, zArr));
                i20++;
                length = length;
            }
        }
        zzzf zze = zzaavVar.zze();
        for (int i27 = 0; i27 < zze.zzb; i27++) {
            zzbg zza3 = zze.zza(i27);
            int i28 = zza3.zza;
            int[] iArr8 = new int[i28];
            Arrays.fill(iArr8, 0);
            zzgvwVar.zzf(new zzbm(zza3, false, iArr8, new boolean[i28]));
        }
        return new zzaba((zzmx[]) zzh.first, (zzaas[]) zzh.second, new zzbn(zzgvwVar.zzi()), zzaavVar);
    }
}
