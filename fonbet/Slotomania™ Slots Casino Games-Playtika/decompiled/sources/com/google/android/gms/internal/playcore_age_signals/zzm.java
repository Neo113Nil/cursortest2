package com.google.android.gms.internal.playcore_age_signals;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* compiled from: com.google.android.play:age-signals@@0.0.3 */
/* loaded from: classes8.dex */
final class zzm implements ServiceConnection {
    final /* synthetic */ zzo zza;

    /* synthetic */ zzm(zzo zzoVar, zzn zznVar) {
        Objects.requireNonNull(zzoVar);
        this.zza = zzoVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzd zzdVar;
        zzo zzoVar = this.zza;
        zzdVar = zzoVar.zzc;
        zzdVar.zzc("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        zzoVar.zzc().post(new zzk(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzd zzdVar;
        zzo zzoVar = this.zza;
        zzdVar = zzoVar.zzc;
        zzdVar.zzc("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        zzoVar.zzc().post(new zzl(this));
    }
}
