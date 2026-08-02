package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import xsna.bq70;
import xsna.exc0;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
/* loaded from: classes12.dex */
final class zzdg extends zzdu {
    final /* synthetic */ String zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzef zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdg(zzef zzefVar, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(zzefVar, false);
        this.zzc = zzefVar;
        this.zza = str;
        this.zzb = obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() throws RemoteException {
        zzcc zzccVar;
        zzccVar = this.zzc.zzj;
        exc0.i(zzccVar);
        zzccVar.logHealthData(5, this.zza, new bq70(this.zzb), new bq70(null), new bq70(null));
    }
}
