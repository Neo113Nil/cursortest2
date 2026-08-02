package com.google.android.gms.internal.measurement;

import B3.p;
import Lh.a;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class zzmm {
    private static final zzmm zza = new zzmm(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzmm(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.zze = -1;
        this.zzb = i11;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z11;
    }

    public static zzmm zzc() {
        return zza;
    }

    static zzmm zzd(zzmm zzmmVar, zzmm zzmmVar2) {
        int i11 = zzmmVar.zzb + zzmmVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzmmVar.zzc, i11);
        System.arraycopy(zzmmVar2.zzc, 0, copyOf, zzmmVar.zzb, zzmmVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzmmVar.zzd, i11);
        System.arraycopy(zzmmVar2.zzd, 0, copyOf2, zzmmVar.zzb, zzmmVar2.zzb);
        return new zzmm(i11, copyOf, copyOf2, true);
    }

    static zzmm zze() {
        return new zzmm(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzmm)) {
            return false;
        }
        zzmm zzmmVar = (zzmm) obj;
        int i11 = this.zzb;
        if (i11 == zzmmVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzmmVar.zzc;
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzmmVar.zzd;
                    int i13 = this.zzb;
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (objArr[i14].equals(objArr2[i14])) {
                        }
                    }
                    return true;
                }
                if (iArr[i12] != iArr2[i12]) {
                    break;
                }
                i12++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.zzb;
        int i12 = (i11 + 527) * 31;
        int[] iArr = this.zzc;
        int i13 = 17;
        int i14 = 17;
        for (int i15 = 0; i15 < i11; i15++) {
            i14 = (i14 * 31) + iArr[i15];
        }
        int i16 = (i12 + i14) * 31;
        Object[] objArr = this.zzd;
        int i17 = this.zzb;
        for (int i18 = 0; i18 < i17; i18++) {
            i13 = (i13 * 31) + objArr[i18].hashCode();
        }
        return i16 + i13;
    }

    public final int zza() {
        int zzA;
        int zzB;
        int i11 = this.zze;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.zzb; i13++) {
            int i14 = this.zzc[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 != 0) {
                if (i16 == 1) {
                    ((Long) this.zzd[i13]).getClass();
                    i12 = p.a(i15 << 3, 8, i12);
                } else if (i16 == 2) {
                    zzjb zzjbVar = (zzjb) this.zzd[i13];
                    int zzA2 = zzjj.zzA(i15 << 3);
                    int zzd = zzjbVar.zzd();
                    i12 = a.a(zzd, zzd, zzA2, i12);
                } else if (i16 == 3) {
                    int zzz = zzjj.zzz(i15);
                    zzA = zzz + zzz;
                    zzB = ((zzmm) this.zzd[i13]).zza();
                } else {
                    if (i16 != 5) {
                        throw new IllegalStateException(zzkm.zza());
                    }
                    ((Integer) this.zzd[i13]).getClass();
                    i12 = p.a(i15 << 3, 4, i12);
                }
            } else {
                long longValue = ((Long) this.zzd[i13]).longValue();
                zzA = zzjj.zzA(i15 << 3);
                zzB = zzjj.zzB(longValue);
            }
            i12 = zzB + zzA + i12;
        }
        this.zze = i12;
        return i12;
    }

    public final int zzb() {
        int i11 = this.zze;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.zzb; i13++) {
            int i14 = this.zzc[i13];
            zzjb zzjbVar = (zzjb) this.zzd[i13];
            int zzA = zzjj.zzA(8);
            int zzd = zzjbVar.zzd();
            i12 += zzjj.zzA(zzd) + zzd + zzjj.zzA(24) + p.a(i14 >>> 3, zzjj.zzA(16), zzA + zzA);
        }
        this.zze = i12;
        return i12;
    }

    public final void zzf() {
        this.zzf = false;
    }

    final void zzg(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < this.zzb; i12++) {
            zzll.zzb(sb2, i11, String.valueOf(this.zzc[i12] >>> 3), this.zzd[i12]);
        }
    }

    final void zzh(int i11, Object obj) {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
        int i12 = this.zzb;
        int[] iArr = this.zzc;
        if (i12 == iArr.length) {
            int i13 = i12 + (i12 < 4 ? 8 : i12 >> 1);
            this.zzc = Arrays.copyOf(iArr, i13);
            this.zzd = Arrays.copyOf(this.zzd, i13);
        }
        int[] iArr2 = this.zzc;
        int i14 = this.zzb;
        iArr2[i14] = i11;
        this.zzd[i14] = obj;
        this.zzb = i14 + 1;
    }

    public final void zzi(zznd zzndVar) throws IOException {
        if (this.zzb != 0) {
            for (int i11 = 0; i11 < this.zzb; i11++) {
                int i12 = this.zzc[i11];
                Object obj = this.zzd[i11];
                int i13 = i12 >>> 3;
                int i14 = i12 & 7;
                if (i14 == 0) {
                    zzndVar.zzt(i13, ((Long) obj).longValue());
                } else if (i14 == 1) {
                    zzndVar.zzm(i13, ((Long) obj).longValue());
                } else if (i14 == 2) {
                    zzndVar.zzd(i13, (zzjb) obj);
                } else if (i14 == 3) {
                    zzndVar.zzE(i13);
                    ((zzmm) obj).zzi(zzndVar);
                    zzndVar.zzh(i13);
                } else {
                    if (i14 != 5) {
                        throw new RuntimeException(zzkm.zza());
                    }
                    zzndVar.zzk(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzmm() {
        this(0, new int[8], new Object[8], true);
    }
}
