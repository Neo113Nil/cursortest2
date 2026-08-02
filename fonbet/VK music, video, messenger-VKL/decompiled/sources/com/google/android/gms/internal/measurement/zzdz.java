package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import xsna.bq70;
import xsna.exc0;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
/* loaded from: classes.dex */
final class zzdz extends zzdu {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzee zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdz(zzee zzeeVar, Activity activity) {
        super(zzeeVar.zza, true);
        this.zzb = zzeeVar;
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() throws RemoteException {
        zzcc zzccVar;
        zzccVar = this.zzb.zza.zzj;
        exc0.i(zzccVar);
        zzccVar.onActivityResumed(new bq70(this.zza), this.zzi);
    }
}
