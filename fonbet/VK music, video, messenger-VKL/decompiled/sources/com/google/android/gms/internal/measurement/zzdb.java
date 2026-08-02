package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import xsna.exc0;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
/* loaded from: classes12.dex */
final class zzdb extends zzdu {
    final /* synthetic */ zzbz zza;
    final /* synthetic */ zzef zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdb(zzef zzefVar, zzbz zzbzVar) {
        super(zzefVar, true);
        this.zzb = zzefVar;
        this.zza = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() throws RemoteException {
        zzcc zzccVar;
        zzccVar = this.zzb.zzj;
        exc0.i(zzccVar);
        zzccVar.getCachedAppInstanceId(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zzb() {
        this.zza.zze(null);
    }
}
