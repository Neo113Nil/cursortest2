package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
public final class zzagm {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public zzagm() {
    }

    public zzagm(zzagm zzagmVar) {
        this.zza = zzagmVar.zza;
        this.zzb = zzagmVar.zzb;
        this.zzc = zzagmVar.zzc;
        this.zzd = zzagmVar.zzd;
        this.zze = zzagmVar.zze;
        this.zzf = zzagmVar.zzf;
        this.zzg = zzagmVar.zzg;
    }

    public final boolean zza(int i) {
        boolean zzl;
        int i2;
        int i3;
        int i4;
        int i5;
        String[] strArr;
        int[] iArr;
        int zzm;
        int[] iArr2;
        int[] iArr3;
        int i6;
        int[] iArr4;
        int[] iArr5;
        int i7;
        int[] iArr6;
        zzl = zzagn.zzl(i);
        if (!zzl || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i8 = i4 - 1;
        this.zza = i2;
        strArr = zzagn.zza;
        this.zzb = strArr[3 - i3];
        iArr = zzagn.zzb;
        int i9 = iArr[i5];
        this.zzd = i9;
        if (i2 == 2) {
            i9 /= 2;
            this.zzd = i9;
        } else if (i2 == 0) {
            i9 /= 4;
            this.zzd = i9;
        }
        int i10 = (i >>> 9) & 1;
        zzm = zzagn.zzm(i2, i3);
        this.zzg = zzm;
        if (i3 == 3) {
            if (i2 == 3) {
                iArr6 = zzagn.zzc;
                i7 = iArr6[i8];
            } else {
                iArr5 = zzagn.zzd;
                i7 = iArr5[i8];
            }
            this.zzf = i7;
            this.zzc = (((i7 * 12) / i9) + i10) * 4;
        } else {
            if (i2 == 3) {
                if (i3 == 2) {
                    iArr4 = zzagn.zze;
                    i6 = iArr4[i8];
                } else {
                    iArr3 = zzagn.zzf;
                    i6 = iArr3[i8];
                }
                this.zzf = i6;
                this.zzc = ((i6 * 144) / i9) + i10;
            } else {
                iArr2 = zzagn.zzg;
                int i11 = iArr2[i8];
                this.zzf = i11;
                this.zzc = (((i3 == 1 ? 72 : 144) * i11) / i9) + i10;
            }
        }
        this.zze = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
