package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Date;
import java.util.Map;

/* loaded from: classes9.dex */
public final class zzgx implements Clock {
    private final Bundle zza;
    private final String zzb;
    private final Date zzc;
    private final String zzd;
    private Map<String, Object> zze;
    private boolean zzf;
    private final com.google.android.gms.tagmanager.zzcp zzg;

    @VisibleForTesting
    public zzgx(String str, Bundle bundle, String str2, Date date, boolean z11, com.google.android.gms.tagmanager.zzcp zzcpVar) {
        this.zzb = str;
        this.zza = bundle == null ? new Bundle() : bundle;
        this.zzc = date;
        this.zzd = str2;
        this.zzf = z11;
        this.zzg = zzcpVar;
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long currentThreadTimeMillis() {
        return SystemClock.currentThreadTimeMillis();
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long currentTimeMillis() {
        return this.zzc.getTime();
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long nanoTime() {
        return System.nanoTime();
    }

    public final Bundle zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final Map<String, Object> zzd() {
        if (this.zze == null) {
            try {
                this.zze = this.zzg.zzb();
            } catch (RemoteException e11) {
                String valueOf = String.valueOf(e11.getMessage());
                zzhl.zza(valueOf.length() != 0 ? "Error calling measurement proxy:".concat(valueOf) : new String("Error calling measurement proxy:"));
            }
        }
        return this.zze;
    }

    public final void zze(boolean z11) {
        this.zzf = false;
    }

    public final boolean zzf() {
        return this.zzf;
    }
}
