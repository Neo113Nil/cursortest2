package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzhb;
import com.google.firebase.analytics.connector.AnalyticsConnector;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.2 */
/* loaded from: classes8.dex */
final class zzd implements AppMeasurementSdk.OnEventListener {
    final /* synthetic */ zze zza;

    public zzd(zze zzeVar) {
        this.zza = zzeVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzhf
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener;
        if (this.zza.zza.contains(str2)) {
            Bundle bundle2 = new Bundle();
            int i = zzc.zza;
            String zza = zzhb.zza(str2);
            if (zza != null) {
                str2 = zza;
            }
            bundle2.putString("events", str2);
            analyticsConnectorListener = this.zza.zzb;
            analyticsConnectorListener.onMessageTriggered(2, bundle2);
        }
    }
}
