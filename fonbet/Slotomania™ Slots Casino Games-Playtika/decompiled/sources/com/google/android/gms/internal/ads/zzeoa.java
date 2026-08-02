package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
final class zzeoa implements zzhbf {
    final /* synthetic */ zzfjt zza;
    final /* synthetic */ zzeob zzb;

    zzeoa(zzeob zzeobVar, zzfjt zzfjtVar) {
        this.zza = zzfjtVar;
        Objects.requireNonNull(zzeobVar);
        this.zzb = zzeobVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        zzeob zzeobVar = this.zzb;
        synchronized (zzeobVar) {
            zzeoc zzc = zzeobVar.zzc();
            zzfjt zzfjtVar = this.zza;
            zzc.zzc(th, zzfjtVar);
            zzfjt zza = zzeobVar.zzc().zza();
            if (zzfjtVar.zzav) {
                while (zza != null) {
                    zzeobVar.zzb(zza);
                    zza = zzeobVar.zzc().zza();
                }
            } else if (zza != null) {
                zzeobVar.zzb(zza);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeob zzeobVar = this.zzb;
        zzeos zzeosVar = (zzeos) obj;
        synchronized (zzeobVar) {
            zzeobVar.zzc().zzb(zzeosVar, this.zza);
            zzfjt zza = zzeobVar.zzc().zza();
            if (zza != null) {
                zzeobVar.zzb(zza);
            }
        }
    }
}
