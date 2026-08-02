package com.google.android.gms.measurement.internal;

import T7.E;
import U7.C4056a;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes9.dex */
public final class zzfr implements ServiceConnection {
    final /* synthetic */ zzfs zza;
    private final String zzb;

    zzfr(zzfs zzfsVar, String str) {
        this.zza = zzfsVar;
        this.zzb = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            C4056a.a(this.zza.zza, "Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.zzbr zzb = com.google.android.gms.internal.measurement.zzbq.zzb(iBinder);
            if (zzb == null) {
                this.zza.zza.zzay().zzk().zza("Install Referrer Service implementation was not found");
            } else {
                this.zza.zza.zzay().zzj().zza("Install Referrer Service connected");
                this.zza.zza.zzaz().zzp(new zzfq(this, zzb, this));
            }
        } catch (RuntimeException e11) {
            this.zza.zza.zzay().zzk().zzb("Exception occurred while calling Install Referrer API", e11);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        E.g(this.zza.zza, "Install Referrer Service disconnected");
    }
}
