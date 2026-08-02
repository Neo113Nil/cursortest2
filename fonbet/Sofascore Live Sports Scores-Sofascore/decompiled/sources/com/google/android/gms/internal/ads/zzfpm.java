package com.google.android.gms.internal.ads;

import defpackage.hsn;
import defpackage.r9o;
import defpackage.x3o;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfpm implements zzbga {
    public final ScheduledExecutorService a;
    public final hsn b;
    public final HashMap c = new HashMap();
    public boolean d = false;

    public zzfpm(ScheduledExecutorService scheduledExecutorService, hsn hsnVar) {
        this.a = scheduledExecutorService;
        this.b = hsnVar;
    }

    public final synchronized void a(long j, Runnable runnable) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (!this.d) {
                    com.google.android.gms.ads.internal.zzt.zzg().b(this);
                    this.d = true;
                }
                r9o r9oVar = new r9o(this, runnable, com.google.android.gms.ads.internal.zzt.zzk().a() + j);
                ScheduledFuture<?> schedule = this.a.schedule(new x3o(r9oVar, 14), j, timeUnit);
                r9oVar.c = schedule;
                this.c.put(schedule, r9oVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zza(boolean z) {
        if (z) {
            this.b.execute(new x3o(this, 15));
        }
    }
}
