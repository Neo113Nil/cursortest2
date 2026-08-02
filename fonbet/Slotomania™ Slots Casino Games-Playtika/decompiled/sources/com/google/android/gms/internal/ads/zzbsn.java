package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
final class zzbsn implements zzbpe {
    final /* synthetic */ long zza;
    final /* synthetic */ zzbth zzb;
    final /* synthetic */ zzbsd zzc;
    final /* synthetic */ zzbti zzd;

    zzbsn(zzbti zzbtiVar, long j, zzbth zzbthVar, zzbsd zzbsdVar) {
        this.zza = j;
        this.zzb = zzbthVar;
        this.zzc = zzbsdVar;
        Objects.requireNonNull(zzbtiVar);
        this.zzd = zzbtiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(currentTimeMillis).length() + 42);
        sb.append("onGmsg /jsLoaded. JsLoaded latency is ");
        sb.append(currentTimeMillis);
        sb.append(" ms.");
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        zzbti zzbtiVar = this.zzd;
        synchronized (zzbtiVar.zzg()) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            zzbth zzbthVar = this.zzb;
            if (zzbthVar.zzi() != -1 && zzbthVar.zzi() != 1) {
                zzbtiVar.zzl(0);
                zzbsd zzbsdVar = this.zzc;
                zzbsd zzbsdVar2 = zzbsdVar;
                zzbsdVar.zzm("/log", zzbpd.zzg);
                zzbsdVar.zzm("/result", zzbpd.zzo);
                zzbthVar.zzf(zzbsdVar);
                zzbtiVar.zzj(zzbthVar);
                com.google.android.gms.ads.internal.util.zze.zza("Successfully loaded JS Engine.");
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
