package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzcis extends zzcio {
    public zzcis(zzchb zzchbVar) {
        super(zzchbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcio
    public final boolean zze(String str) {
        String zzg = com.google.android.gms.ads.internal.util.client.zzf.zzg(str);
        zzchb zzchbVar = (zzchb) this.zzc.get();
        if (zzchbVar != null && zzg != null) {
            zzchbVar.zzt(zzg, this);
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("VideoStreamNoopCache is doing nothing.");
        zzq(str, zzg, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcio
    public final void zzl() {
    }
}
