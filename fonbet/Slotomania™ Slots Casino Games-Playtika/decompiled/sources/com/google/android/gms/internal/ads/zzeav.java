package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
final class zzeav extends zzccc {
    final /* synthetic */ zzeax zza;

    zzeav(zzeax zzeaxVar) {
        Objects.requireNonNull(zzeaxVar);
        this.zza = zzeaxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final void zze() throws RemoteException {
        zzeax zzeaxVar = this.zza;
        zzeaxVar.zze().zzk(zzeaxVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final void zzf(int i) throws RemoteException {
        zzeax zzeaxVar = this.zza;
        zzeaxVar.zze().zzl(zzeaxVar.zzd(), i);
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzeax zzeaxVar = this.zza;
        zzeaxVar.zze().zzl(zzeaxVar.zzd(), zzeVar.zza);
    }
}
