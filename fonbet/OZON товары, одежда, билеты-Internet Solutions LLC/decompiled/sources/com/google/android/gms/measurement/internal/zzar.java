package com.google.android.gms.measurement.internal;

import C.o0;
import N3.C3660k;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class zzar {
    final String zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final zzau zzf;

    zzar(zzgk zzgkVar, String str, String str2, String str3, long j11, long j12, Bundle bundle) {
        zzau zzauVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j11;
        this.zze = j12;
        if (j12 != 0 && j12 > j11) {
            zzgkVar.zzay().zzk().zzb("Event created with reverse previous/current timestamps. appId", zzfa.zzn(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzauVar = new zzau(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzgkVar.zzay().zzd().zza("Param name can't be null");
                    it.remove();
                } else {
                    Object zzA = zzgkVar.zzv().zzA(next, bundle2.get(next));
                    if (zzA == null) {
                        zzgkVar.zzay().zzk().zzb("Param value can't be null", zzgkVar.zzj().zze(next));
                        it.remove();
                    } else {
                        zzgkVar.zzv().zzO(bundle2, next, zzA);
                    }
                }
            }
            zzauVar = new zzau(bundle2);
        }
        this.zzf = zzauVar;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return o0.c(C3660k.d("Event{appId='", str, "', name='", str2, "', params="), this.zzf.toString(), "}");
    }

    final zzar zza(zzgk zzgkVar, long j11) {
        return new zzar(zzgkVar, this.zzc, this.zza, this.zzb, this.zzd, j11, this.zzf);
    }

    private zzar(zzgk zzgkVar, String str, String str2, String str3, long j11, long j12, zzau zzauVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzauVar);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j11;
        this.zze = j12;
        if (j12 != 0 && j12 > j11) {
            zzgkVar.zzay().zzk().zzc("Event created with reverse previous/current timestamps. appId, name", zzfa.zzn(str2), zzfa.zzn(str3));
        }
        this.zzf = zzauVar;
    }
}
