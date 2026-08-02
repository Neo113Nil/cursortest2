package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
final class zzegy implements zzefk {
    final /* synthetic */ zzehb zza;

    zzegy(zzehb zzehbVar) {
        Objects.requireNonNull(zzehbVar);
        this.zza = zzehbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefk
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpA)).booleanValue()) {
            zzdyy zza = this.zza.zzd().zza();
            zza.zzc("action", "ptard");
            zza.zzc("ptard", AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            zza.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefk
    public final void zzb(RemoteException remoteException) {
        this.zza.zzc();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpB)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(remoteException, "Preconnect Remote");
        }
    }
}
