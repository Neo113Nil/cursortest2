package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzwm implements zzyw {
    private final zzgvz zza;
    private long zzb;

    public zzwm(List list, List list2) {
        int i = zzgvz.zzd;
        zzgvw zzgvwVar = new zzgvw();
        zzgsw.zza(list.size() == list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgvwVar.zzf(new zzwl((zzyw) list.get(i2), (List) list2.get(i2)));
        }
        this.zza = zzgvwVar.zzi();
        this.zzb = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final void zzg(long j) {
        int i = 0;
        while (true) {
            zzgvz zzgvzVar = this.zza;
            if (i >= zzgvzVar.size()) {
                return;
            }
            ((zzwl) zzgvzVar.get(i)).zzg(j);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final long zzi() {
        int i = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            zzgvz zzgvzVar = this.zza;
            if (i >= zzgvzVar.size()) {
                break;
            }
            zzwl zzwlVar = (zzwl) zzgvzVar.get(i);
            long zzi = zzwlVar.zzi();
            if ((zzwlVar.zza().contains(1) || zzwlVar.zza().contains(2) || zzwlVar.zza().contains(4)) && zzi != Long.MIN_VALUE) {
                j = Math.min(j, zzi);
            }
            if (zzi != Long.MIN_VALUE) {
                j2 = Math.min(j2, zzi);
            }
            i++;
        }
        if (j != Long.MAX_VALUE) {
            this.zzb = j;
            return j;
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j3 = this.zzb;
        return j3 != C.TIME_UNSET ? j3 : j2;
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final long zzl() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            zzgvz zzgvzVar = this.zza;
            if (i >= zzgvzVar.size()) {
                break;
            }
            long zzl = ((zzwl) zzgvzVar.get(i)).zzl();
            if (zzl != Long.MIN_VALUE) {
                j = Math.min(j, zzl);
            }
            i++;
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final boolean zzm(zzlu zzluVar) {
        boolean z;
        boolean z2 = false;
        do {
            long zzl = zzl();
            if (zzl == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            z = false;
            while (true) {
                zzgvz zzgvzVar = this.zza;
                if (i >= zzgvzVar.size()) {
                    break;
                }
                long zzl2 = ((zzwl) zzgvzVar.get(i)).zzl();
                boolean z3 = zzl2 != Long.MIN_VALUE && zzl2 <= zzluVar.zza;
                if (zzl2 == zzl || z3) {
                    z |= ((zzwl) zzgvzVar.get(i)).zzm(zzluVar);
                }
                i++;
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final boolean zzn() {
        int i = 0;
        while (true) {
            zzgvz zzgvzVar = this.zza;
            if (i >= zzgvzVar.size()) {
                return false;
            }
            if (((zzwl) zzgvzVar.get(i)).zzn()) {
                return true;
            }
            i++;
        }
    }
}
