package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
public final class zzeqb implements zzeli {
    private final zzerf zza;
    private final zzdwq zzb;

    zzeqb(zzerf zzerfVar, zzdwq zzdwqVar) {
        this.zza = zzerfVar;
        this.zzb = zzdwqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeli
    public final zzelj zza(String str, JSONObject jSONObject) throws zzfkt {
        zzbwp zzbwpVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcp)).booleanValue()) {
            try {
                zzbwpVar = this.zzb.zzb(str);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Coundn't create RTB adapter: ", e);
                zzbwpVar = null;
            }
        } else {
            zzbwpVar = this.zza.zzb(str);
        }
        if (zzbwpVar == null) {
            return null;
        }
        return new zzelj(zzbwpVar, new zzemv(), str);
    }
}
