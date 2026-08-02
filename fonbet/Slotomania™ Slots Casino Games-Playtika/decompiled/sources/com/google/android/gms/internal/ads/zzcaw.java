package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzcaw implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcay zzb;

    zzcaw(zzcay zzcayVar, Context context) {
        this.zza = context;
        Objects.requireNonNull(zzcayVar);
        this.zzb = zzcayVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzcav zza;
        zzcay zzcayVar = this.zzb;
        WeakHashMap zzb = zzcayVar.zzb();
        Context context = this.zza;
        zzcax zzcaxVar = (zzcax) zzb.get(context);
        if (zzcaxVar != null) {
            if (zzcaxVar.zza + ((Long) zzbjt.zzd.zze()).longValue() >= com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()) {
                zza = new zzcau(context, zzcaxVar.zzb).zza();
                zzcayVar.zzb().put(context, new zzcax(zzcayVar, zza));
                return zza;
            }
        }
        zza = new zzcau(context).zza();
        zzcayVar.zzb().put(context, new zzcax(zzcayVar, zza));
        return zza;
    }
}
