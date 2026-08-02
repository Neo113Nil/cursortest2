package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfhb implements zzfhk {
    private final zzfhk zza;
    private zzdbn zzb;

    public zzfhb(zzfhk zzfhkVar) {
        this.zza = zzfhkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfhk
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdbn zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfhk
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfhl zzfhlVar, zzfhj zzfhjVar, Object obj) {
        return zzb(zzfhlVar, zzfhjVar, null);
    }

    public final synchronized ListenableFuture zzb(zzfhl zzfhlVar, zzfhj zzfhjVar, zzdbn zzdbnVar) {
        zzcar zzcarVar;
        this.zzb = zzdbnVar;
        if (zzdbnVar == null || (zzcarVar = zzfhlVar.zza) == null) {
            zzdbn zzdbnVar2 = zzdbnVar;
            return ((zzfha) this.zza).zzb(zzfhlVar, zzfhjVar, zzdbnVar);
        }
        zzcyl zza = zzdbnVar.zza();
        return zza.zzc(zza.zza(zzhbi.zza(zzcarVar)));
    }
}
