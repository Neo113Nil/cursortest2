package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
final class zzgca extends zzhab {
    Object zza;

    zzgca(Object obj, Runnable runnable) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzhab
    public final boolean zza(Object obj) {
        return super.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhab
    public final boolean zzb(Throwable th) {
        return super.zzb(th);
    }

    @Override // com.google.android.gms.internal.ads.zzhab
    protected final void zzc() {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhab
    public final String zzd() {
        Object obj = this.zza;
        return obj == null ? "" : obj.toString();
    }
}
