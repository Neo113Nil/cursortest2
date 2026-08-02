package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes8.dex */
public final class zzfl implements ServiceConnection {
    final /* synthetic */ zzfm zza;
    private final String zzb;

    zzfl(zzfm zzfmVar, String str) {
        this.zza = zzfmVar;
        this.zzb = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.zza.zza.zzaA().zzk().zza("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.zzbr zzb = com.google.android.gms.internal.measurement.zzbq.zzb(iBinder);
            if (zzb == null) {
                this.zza.zza.zzaA().zzk().zza("Install Referrer Service implementation was not found");
            } else {
                this.zza.zza.zzaA().zzj().zza("Install Referrer Service connected");
                this.zza.zza.zzaB().zzp(new zzfk(this, zzb, this));
            }
        } catch (RuntimeException e) {
            this.zza.zza.zzaA().zzk().zzb("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zza.zza.zzaA().zzj().zza("Install Referrer Service disconnected");
    }
}
