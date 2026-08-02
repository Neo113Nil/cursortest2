package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import xsna.exc0;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
/* loaded from: classes12.dex */
final class zzdn extends zzdu {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzef zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdn(zzef zzefVar, boolean z) {
        super(zzefVar, true);
        this.zzb = zzefVar;
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() throws RemoteException {
        zzcc zzccVar;
        zzccVar = this.zzb.zzj;
        exc0.i(zzccVar);
        zzccVar.setDataCollectionEnabled(this.zza);
    }
}
