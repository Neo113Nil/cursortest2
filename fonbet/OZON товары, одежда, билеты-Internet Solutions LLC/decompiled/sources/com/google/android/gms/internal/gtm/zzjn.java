package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes9.dex */
public final class zzjn implements ServiceConnection {
    private final Context zza;
    private final ConnectionTracker zzb;
    private volatile boolean zzc = false;
    private volatile boolean zzd = false;
    private zzhj zze;

    @VisibleForTesting
    zzjn(Context context, ConnectionTracker connectionTracker) {
        this.zza = context;
        this.zzb = connectionTracker;
    }

    private static final void zzf(zzhg zzhgVar, String str) {
        try {
            zzhgVar.zze(false, str);
        } catch (RemoteException e11) {
            zzhl.zzb("Error - local callback should not throw RemoteException", e11);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzhj zzhhVar;
        synchronized (this) {
            if (iBinder == null) {
                zzhhVar = null;
            } else {
                try {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.internal.ITagManagerService");
                    zzhhVar = queryLocalInterface instanceof zzhj ? (zzhj) queryLocalInterface : new zzhh(iBinder);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.zze = zzhhVar;
            this.zzc = true;
            this.zzd = false;
            notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this) {
            this.zze = null;
            this.zzc = false;
            this.zzd = false;
        }
    }

    public final void zza() {
        if (zzd()) {
            try {
                this.zze.zze();
            } catch (RemoteException e11) {
                zzhl.zzf("Error calling service to dispatch pending events", e11);
            }
        }
    }

    public final void zzb(String str, Bundle bundle, String str2, long j11, boolean z11) {
        if (zzd()) {
            try {
                this.zze.zzf(str, bundle, str2, j11, z11);
            } catch (RemoteException e11) {
                zzhl.zzf("Error calling service to emit event", e11);
            }
        }
    }

    public final void zzc(String str, String str2, String str3, zzhg zzhgVar) {
        if (!zzd()) {
            zzf(zzhgVar, str);
            return;
        }
        try {
            this.zze.zzh(str, str2, null, zzhgVar);
        } catch (RemoteException e11) {
            zzhl.zzf("Error calling service to load container", e11);
            zzf(zzhgVar, str);
        }
    }

    public final boolean zzd() {
        if (this.zzc) {
            return true;
        }
        synchronized (this) {
            try {
                if (this.zzc) {
                    return true;
                }
                if (!this.zzd) {
                    Intent intent = new Intent("ignored");
                    intent.setAction(null);
                    intent.setClassName(this.zza.getPackageName(), "com.google.android.gms.tagmanager.TagManagerService");
                    if (!this.zzb.bindService(this.zza, intent, this, 1)) {
                        return false;
                    }
                    this.zzd = true;
                }
                while (this.zzd) {
                    try {
                        wait();
                        this.zzd = false;
                    } catch (InterruptedException e11) {
                        zzhl.zzf("Error connecting to TagManagerService", e11);
                        this.zzd = false;
                    }
                }
                return this.zzc;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zze() {
        if (!zzd()) {
            return false;
        }
        try {
            this.zze.zzi();
            return true;
        } catch (RemoteException e11) {
            zzhl.zzf("Error in resetting service", e11);
            return false;
        }
    }
}
