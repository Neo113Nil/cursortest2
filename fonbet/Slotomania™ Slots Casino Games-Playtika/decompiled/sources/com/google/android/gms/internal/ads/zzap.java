package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzap {
    private final zzao[] zza;

    public zzap(long j, zzao... zzaoVarArr) {
        this.zza = zzaoVarArr;
    }

    public zzap(List list) {
        this.zza = (zzao[]) list.toArray(new zzao[0]);
    }

    private static final zzao zzh(zzao zzaoVar, Class cls, zzgsx zzgsxVar) {
        if (!cls.isAssignableFrom(zzaoVar.getClass())) {
            return null;
        }
        zzao zzaoVar2 = (zzao) cls.cast(zzaoVar);
        if (zzgsxVar.zza(zzaoVar2)) {
            return zzaoVar2;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Arrays.equals(this.zza, ((zzap) obj).zza);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zza) * 31) + Long.hashCode(C.TIME_UNSET);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 8);
        sb.append("entries=");
        sb.append(arrays);
        sb.append("");
        return sb.toString();
    }

    public final int zza() {
        return this.zza.length;
    }

    public final zzao zzb(int i) {
        return this.zza[i];
    }

    public final zzao zzc(Class cls, zzgsx zzgsxVar) {
        for (zzao zzaoVar : this.zza) {
            zzao zzh = zzh(zzaoVar, cls, zzgsxVar);
            if (zzh != null) {
                return zzh;
            }
        }
        return null;
    }

    public final zzgvz zzd(Class cls) {
        int i = zzgvz.zzd;
        zzgvw zzgvwVar = new zzgvw();
        for (zzao zzaoVar : this.zza) {
            if (cls.isAssignableFrom(zzaoVar.getClass())) {
                zzgvwVar.zzf((zzao) cls.cast(zzaoVar));
            }
        }
        return zzgvwVar.zzi();
    }

    public final zzgvz zze(Class cls, zzgsx zzgsxVar) {
        int i = zzgvz.zzd;
        zzgvw zzgvwVar = new zzgvw();
        for (zzao zzaoVar : this.zza) {
            zzao zzh = zzh(zzaoVar, cls, zzgsxVar);
            if (zzh != null) {
                zzgvwVar.zzf(zzh);
            }
        }
        return zzgvwVar.zzi();
    }

    public final zzap zzf(zzap zzapVar) {
        return zzapVar == null ? this : zzg(zzapVar.zza);
    }

    public final zzap zzg(zzao... zzaoVarArr) {
        int length = zzaoVarArr.length;
        if (length == 0) {
            return this;
        }
        zzao[] zzaoVarArr2 = this.zza;
        String str = zzfk.zza;
        int length2 = zzaoVarArr2.length;
        Object[] copyOf = Arrays.copyOf(zzaoVarArr2, length2 + length);
        System.arraycopy(zzaoVarArr, 0, copyOf, length2, length);
        return new zzap(C.TIME_UNSET, (zzao[]) copyOf);
    }
}
