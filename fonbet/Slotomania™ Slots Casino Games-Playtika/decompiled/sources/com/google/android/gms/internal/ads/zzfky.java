package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
final class zzfky implements zzhbf {
    final /* synthetic */ zzfkz zza;
    final /* synthetic */ int zzb;

    zzfky(zzfkz zzfkzVar, int i) {
        this.zzb = i;
        Objects.requireNonNull(zzfkzVar);
        this.zza = zzfkzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zza.zzc((String) obj, this.zzb, null);
    }
}
