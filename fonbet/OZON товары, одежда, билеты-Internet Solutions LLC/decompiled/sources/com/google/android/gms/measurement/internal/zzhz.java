package com.google.android.gms.measurement.internal;

import T7.E;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes9.dex */
final class zzhz implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzip zzb;

    zzhz(zzip zzipVar, Bundle bundle) {
        this.zzb = zzipVar;
        this.zza = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzip zzipVar = this.zzb;
        Bundle bundle = this.zza;
        zzipVar.zzg();
        zzipVar.zza();
        Preconditions.checkNotNull(bundle);
        String checkNotEmpty = Preconditions.checkNotEmpty(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME));
        if (!zzipVar.zzs.zzJ()) {
            E.g(zzipVar.zzs, "Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            zzipVar.zzs.zzt().zzE(new zzac(bundle.getString("app_id"), "", new zzlo(checkNotEmpty, 0L, null, ""), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), bundle.getBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzipVar.zzs.zzv().zzz(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), "", bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
