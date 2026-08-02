package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import defpackage.f8o;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcvk implements zzbga {
    public final ScheduledExecutorService a;
    public final Clock b;
    public ScheduledFuture c;
    public long d = -1;
    public long e = -1;
    public f8o f = null;
    public boolean g = false;

    public zzcvk(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.a = scheduledExecutorService;
        this.b = clock;
        com.google.android.gms.ads.internal.zzt.zzg().b(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zza(boolean z) {
        ScheduledFuture scheduledFuture;
        if (z) {
            synchronized (this) {
                try {
                    if (this.g) {
                        if (this.e > 0 && (scheduledFuture = this.c) != null && scheduledFuture.isCancelled()) {
                            this.c = this.a.schedule(this.f, this.e, TimeUnit.MILLISECONDS);
                        }
                        this.g = false;
                        return;
                    }
                    return;
                } finally {
                }
            }
        }
        synchronized (this) {
            try {
                if (this.g) {
                    return;
                }
                ScheduledFuture scheduledFuture2 = this.c;
                if (scheduledFuture2 == null || scheduledFuture2.isDone()) {
                    this.e = -1L;
                } else {
                    this.c.cancel(true);
                    this.e = this.d - this.b.elapsedRealtime();
                }
                this.g = true;
            } finally {
            }
        }
    }
}
