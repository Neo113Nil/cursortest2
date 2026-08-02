package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import xsna.bq70;
import xsna.exc0;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
/* loaded from: classes.dex */
final class zzec extends zzdu {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzbz zzb;
    final /* synthetic */ zzee zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzec(zzee zzeeVar, Activity activity, zzbz zzbzVar) {
        super(zzeeVar.zza, true);
        this.zzc = zzeeVar;
        this.zza = activity;
        this.zzb = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() throws RemoteException {
        zzcc zzccVar;
        zzccVar = this.zzc.zza.zzj;
        exc0.i(zzccVar);
        zzccVar.onActivitySaveInstanceState(new bq70(this.zza), this.zzb, this.zzi);
    }
}
