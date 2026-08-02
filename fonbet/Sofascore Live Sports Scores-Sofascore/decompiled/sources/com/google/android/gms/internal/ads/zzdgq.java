package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import defpackage.yyn;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdgq extends zzdjn {
    public final ScheduledExecutorService b;
    public final Clock c;
    public final zzeaj d;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public ScheduledFuture j;
    public ScheduledFuture k;

    public zzdgq(ScheduledExecutorService scheduledExecutorService, Clock clock, zzeaj zzeajVar) {
        super(Collections.EMPTY_SET);
        this.e = -1L;
        this.f = -1L;
        this.g = -1L;
        this.h = -1L;
        this.i = false;
        this.b = scheduledExecutorService;
        this.c = clock;
        this.d = zzeajVar;
    }

    public final synchronized void q0(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
        sb.append("In scheduleRefresh: ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.i) {
                long j = this.g;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.g = millis;
                return;
            }
            long elapsedRealtime = this.c.elapsedRealtime();
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.bf)).booleanValue();
            long j2 = this.e;
            if (booleanValue) {
                if (elapsedRealtime >= j2 || j2 - elapsedRealtime > millis) {
                    s0(millis);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.zf)).booleanValue()) {
                        zzeai a = this.d.a();
                        a.b("action", "rtnc");
                        a.e();
                    }
                }
            } else if (elapsedRealtime > j2 || j2 - elapsedRealtime > millis) {
                s0(millis);
            }
        }
    }

    public final synchronized void r0(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 28);
        sb.append("In scheduleShowRefreshedAd: ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.i) {
                long j = this.h;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.h = millis;
                return;
            }
            long elapsedRealtime = this.c.elapsedRealtime();
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.bf)).booleanValue();
            long j2 = this.f;
            if (booleanValue) {
                if (elapsedRealtime == j2) {
                    com.google.android.gms.ads.internal.util.zze.zza("In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs");
                }
                long j3 = this.f;
                if (elapsedRealtime >= j3 || j3 - elapsedRealtime > millis) {
                    t0(millis);
                }
            } else if (elapsedRealtime > j2 || j2 - elapsedRealtime > millis) {
                t0(millis);
            }
        }
    }

    public final synchronized void s0(long j) {
        try {
            ScheduledFuture scheduledFuture = this.j;
            int i = 0;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.j.cancel(false);
            }
            this.e = this.c.elapsedRealtime() + j;
            this.j = this.b.schedule(new yyn(this, i), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void t0(long j) {
        try {
            ScheduledFuture scheduledFuture = this.k;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.k.cancel(false);
            }
            this.f = this.c.elapsedRealtime() + j;
            this.k = this.b.schedule(new yyn(this, 1), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        this.i = false;
        s0(0L);
    }
}
