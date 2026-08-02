package com.google.android.gms.internal.gtm;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class zzqd {
    private final ScheduledExecutorService zza;
    private ScheduledFuture<?> zzb;

    public zzqd() {
        ScheduledExecutorService zzb = zzfz.zza().zzb(1, 2);
        this.zzb = null;
        this.zza = zzb;
    }

    public final void zza(Context context, zzpq zzpqVar, long j11, zzph zzphVar) {
        synchronized (this) {
            try {
                ScheduledFuture<?> scheduledFuture = this.zzb;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.zzb = this.zza.schedule(new zzqc(context, zzpqVar, zzphVar), 0L, TimeUnit.MILLISECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
