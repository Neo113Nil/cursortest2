package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzcsq implements zzhbf {
    final /* synthetic */ zzfro zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzv zzc;
    final /* synthetic */ zzcsx zzd;

    zzcsq(zzcsx zzcsxVar, zzfro zzfroVar, String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.zza = zzfroVar;
        this.zzb = str;
        this.zzc = zzvVar;
        Objects.requireNonNull(zzcsxVar);
        this.zzd = zzcsxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(final Throwable th) {
        final zzfro zzfroVar = this.zza;
        final String str = this.zzb;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        this.zzd.zzj().submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlI)).booleanValue();
                Throwable th2 = th;
                zzcsq zzcsqVar = zzcsq.this;
                if (booleanValue) {
                    zzcsx zzcsxVar = zzcsqVar.zzd;
                    zzcsxVar.zzb = zzbzm.zzc(zzcsxVar.zzi());
                    zzcsxVar.zzb.zzh(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    zzcsx zzcsxVar2 = zzcsqVar.zzd;
                    zzcsxVar2.zza = zzbzm.zza(zzcsxVar2.zzi());
                    zzcsxVar2.zza.zzh(th2, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                com.google.android.gms.ads.internal.util.client.zzv zzvVar2 = zzvVar;
                zzfroVar.zzb(str, zzvVar2, null, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final zzfro zzfroVar = this.zza;
        final String str = (String) obj;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        this.zzd.zzj().submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcso
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfro.this.zzb(str, zzvVar, null, null);
            }
        });
    }
}
