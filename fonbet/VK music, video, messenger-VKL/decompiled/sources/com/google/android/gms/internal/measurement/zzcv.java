package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import xsna.exc0;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
/* loaded from: classes12.dex */
final class zzcv extends zzdu {
    final /* synthetic */ zzef zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcv(zzef zzefVar) {
        super(zzefVar, true);
        this.zza = zzefVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() throws RemoteException {
        zzcc zzccVar;
        zzccVar = this.zza.zzj;
        exc0.i(zzccVar);
        zzccVar.resetAnalyticsData(this.zzh);
    }
}
