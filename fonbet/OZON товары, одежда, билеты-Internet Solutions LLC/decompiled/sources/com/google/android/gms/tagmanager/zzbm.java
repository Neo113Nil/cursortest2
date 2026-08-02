package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.AppMeasurement;

/* loaded from: classes9.dex */
final class zzbm implements AppMeasurement.OnEventListener {
    final /* synthetic */ zzcj zza;

    zzbm(zzbn zzbnVar, zzcj zzcjVar) {
        this.zza = zzcjVar;
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.OnEventListener, com.google.android.gms.measurement.internal.zzhl
    public final void onEvent(String str, String str2, Bundle bundle, long j11) {
        try {
            this.zza.zze(str, str2, bundle, j11);
        } catch (RemoteException e11) {
            throw new IllegalStateException(e11);
        }
    }
}
