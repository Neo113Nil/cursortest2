package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
final class zzene implements zzdnc {
    private final zzfjt zza;
    private final zzbwp zzb;
    private final AdFormat zzc;
    private zzdcx zzd = null;

    zzene(zzfjt zzfjtVar, zzbwp zzbwpVar, AdFormat adFormat) {
        this.zza = zzfjtVar;
        this.zzb = zzbwpVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdnc
    public final void zza(boolean z, Context context, zzdcs zzdcsVar) throws zzdnb {
        boolean zzk;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int ordinal = this.zzc.ordinal();
            if (ordinal == 1) {
                zzk = this.zzb.zzk(ObjectWrapper.wrap(context));
            } else {
                if (ordinal != 2) {
                    if (ordinal == 5) {
                        zzk = this.zzb.zzt(ObjectWrapper.wrap(context));
                    }
                    throw new zzdnb("Adapter failed to show.");
                }
                zzk = this.zzb.zzm(ObjectWrapper.wrap(context));
            }
            if (zzk) {
                zzdcx zzdcxVar = this.zzd;
                if (zzdcxVar == null) {
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzch)).booleanValue() || this.zza.zzY != 2) {
                    return;
                }
                zzdcxVar.zza();
                return;
            }
            throw new zzdnb("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdnb(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnc
    public final zzfjt zzb() {
        return this.zza;
    }

    public final void zzc(zzdcx zzdcxVar) {
        this.zzd = zzdcxVar;
    }
}
