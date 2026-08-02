package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.zzft;
import d3.AbstractC6069a;

/* loaded from: classes9.dex */
public final class AppMeasurementReceiver extends AbstractC6069a implements zzft.zza {
    private zzft zza;

    @NonNull
    public BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }

    @Override // com.google.android.gms.measurement.internal.zzft.zza
    public void doStartService(@NonNull Context context, @NonNull Intent intent) {
        AbstractC6069a.startWakefulService(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (this.zza == null) {
            this.zza = new zzft(this);
        }
        this.zza.zza(context, intent);
    }
}
