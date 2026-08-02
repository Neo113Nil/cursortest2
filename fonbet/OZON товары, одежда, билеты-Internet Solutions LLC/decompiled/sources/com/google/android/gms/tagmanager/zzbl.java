package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.AppMeasurement;

/* loaded from: classes9.dex */
final class zzbl implements AppMeasurement.EventInterceptor {
    final /* synthetic */ zzcm zza;

    zzbl(zzbn zzbnVar, zzcm zzcmVar) {
        this.zza = zzcmVar;
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.EventInterceptor, com.google.android.gms.measurement.internal.zzhk
    public final void interceptEvent(String str, String str2, Bundle bundle, long j11) {
        try {
            this.zza.zze(str, str2, bundle, j11);
        } catch (RemoteException e11) {
            throw new IllegalStateException(e11);
        }
    }
}
