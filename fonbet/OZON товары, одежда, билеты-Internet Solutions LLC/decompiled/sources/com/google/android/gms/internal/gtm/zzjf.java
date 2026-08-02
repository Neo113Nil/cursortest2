package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes9.dex */
final class zzjf implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzhg zzd;
    final /* synthetic */ zzji zze;

    zzjf(zzji zzjiVar, String str, String str2, String str3, zzhg zzhgVar) {
        this.zze = zzjiVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzhgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        boolean z11;
        Context context2;
        Map map;
        zzgr zzgrVar;
        Map map2;
        try {
            map = this.zze.zza;
            z11 = true;
            if (!map.containsKey(this.zza)) {
                zzgrVar = this.zze.zzc;
                zzgq zza = zzgrVar.zza(this.zza, this.zzb, this.zzc);
                map2 = this.zze.zza;
                map2.put(this.zza, zza);
            }
        } catch (Exception e11) {
            context = this.zze.zze;
            zzgt.zzb("Fail to load container: ", e11, context);
            z11 = false;
        }
        try {
            zzhg zzhgVar = this.zzd;
            if (zzhgVar != null) {
                zzhgVar.zze(z11, this.zza);
            }
        } catch (RemoteException e12) {
            context2 = this.zze.zze;
            zzgt.zzb("Error relaying callback: ", e12, context2);
        }
    }
}
