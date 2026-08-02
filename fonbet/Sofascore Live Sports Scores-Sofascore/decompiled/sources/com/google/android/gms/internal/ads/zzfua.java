package com.google.android.gms.internal.ads;

import defpackage.lv4;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfua {
    public final zzftp a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public volatile ScheduledFuture c;
    public final zzfvd d;

    public zzfua(zzftp zzftpVar, ScheduledExecutorService scheduledExecutorService, long j, zzfvd zzfvdVar) {
        this.d = zzfvdVar;
        this.a = zzftpVar;
        if (j > 0) {
            this.c = scheduledExecutorService.schedule(new lv4(this, zzftpVar, zzfvdVar, false, 28), j, TimeUnit.MILLISECONDS);
        }
    }

    public final void a() {
        if (this.b.compareAndSet(false, true)) {
            if (this.c != null) {
                this.c.cancel(false);
            }
            this.a.b(this.d, false);
        }
    }
}
