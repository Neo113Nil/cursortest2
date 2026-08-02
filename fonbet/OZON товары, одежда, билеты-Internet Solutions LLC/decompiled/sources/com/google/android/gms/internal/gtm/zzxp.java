package com.google.android.gms.internal.gtm;

import Nh.b;
import Tl.a;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class zzxp {
    private static final zzxp zza = new zzxp(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzxp(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.zze = -1;
        this.zzb = i11;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z11;
    }

    public static zzxp zzc() {
        return zza;
    }

    static zzxp zzd(zzxp zzxpVar, zzxp zzxpVar2) {
        int i11 = zzxpVar.zzb + zzxpVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzxpVar.zzc, i11);
        System.arraycopy(zzxpVar2.zzc, 0, copyOf, zzxpVar.zzb, zzxpVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzxpVar.zzd, i11);
        System.arraycopy(zzxpVar2.zzd, 0, copyOf2, zzxpVar.zzb, zzxpVar2.zzb);
        return new zzxp(i11, copyOf, copyOf2, true);
    }

    static zzxp zze() {
        return new zzxp(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzxp)) {
            return false;
        }
        zzxp zzxpVar = (zzxp) obj;
        int i11 = this.zzb;
        if (i11 == zzxpVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzxpVar.zzc;
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzxpVar.zzd;
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
        int zzD;
        int zzE;
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
                    i12 = b.a(i15 << 3, 8, i12);
                } else if (i16 == 2) {
                    zztd zztdVar = (zztd) this.zzd[i13];
                    int zzD2 = zzto.zzD(i15 << 3);
                    int zzd = zztdVar.zzd();
                    i12 = a.b(zzd, zzd, zzD2, i12);
                } else if (i16 == 3) {
                    int zzC = zzto.zzC(i15);
                    zzD = zzC + zzC;
                    zzE = ((zzxp) this.zzd[i13]).zza();
                } else {
                    if (i16 != 5) {
                        throw new IllegalStateException(zzvk.zza());
                    }
                    ((Integer) this.zzd[i13]).getClass();
                    i12 = b.a(i15 << 3, 4, i12);
                }
            } else {
                long longValue = ((Long) this.zzd[i13]).longValue();
                zzD = zzto.zzD(i15 << 3);
                zzE = zzto.zzE(longValue);
            }
            i12 = zzE + zzD + i12;
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
            zztd zztdVar = (zztd) this.zzd[i13];
            int zzD = zzto.zzD(8);
            int zzd = zztdVar.zzd();
            i12 += zzto.zzD(zzd) + zzd + zzto.zzD(24) + b.a(i14 >>> 3, zzto.zzD(16), zzD + zzD);
        }
        this.zze = i12;
        return i12;
    }

    public final void zzf() {
        this.zzf = false;
    }

    final void zzg(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < this.zzb; i12++) {
            zzwm.zzb(sb2, i11, String.valueOf(this.zzc[i12] >>> 3), this.zzd[i12]);
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

    final void zzi(zztp zztpVar) throws IOException {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zztpVar.zzw(this.zzc[i11] >>> 3, this.zzd[i11]);
        }
    }

    public final void zzj(zztp zztpVar) throws IOException {
        if (this.zzb != 0) {
            for (int i11 = 0; i11 < this.zzb; i11++) {
                int i12 = this.zzc[i11];
                Object obj = this.zzd[i11];
                int i13 = i12 >>> 3;
                int i14 = i12 & 7;
                if (i14 == 0) {
                    zztpVar.zzt(i13, ((Long) obj).longValue());
                } else if (i14 == 1) {
                    zztpVar.zzm(i13, ((Long) obj).longValue());
                } else if (i14 == 2) {
                    zztpVar.zzd(i13, (zztd) obj);
                } else if (i14 == 3) {
                    zztpVar.zzF(i13);
                    ((zzxp) obj).zzj(zztpVar);
                    zztpVar.zzh(i13);
                } else {
                    if (i14 != 5) {
                        throw new RuntimeException(zzvk.zza());
                    }
                    zztpVar.zzk(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzxp() {
        this(0, new int[8], new Object[8], true);
    }
}
