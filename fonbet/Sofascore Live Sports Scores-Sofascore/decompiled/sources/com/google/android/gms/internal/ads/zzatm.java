package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import defpackage.lv4;
import defpackage.m10;
import java.util.concurrent.PriorityBlockingQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzatm extends Thread {
    public final PriorityBlockingQueue a;
    public final zzauh b;
    public final zzauo c;
    public volatile boolean d = false;
    public final zzatj e;

    public zzatm(PriorityBlockingQueue priorityBlockingQueue, zzauh zzauhVar, zzauo zzauoVar, zzatj zzatjVar) {
        this.a = priorityBlockingQueue;
        this.b = zzauhVar;
        this.c = zzauoVar;
        this.e = zzatjVar;
    }

    public final void a() {
        zzatj zzatjVar = this.e;
        m10 m10Var = zzatjVar.a;
        zzats zzatsVar = (zzats) this.a.take();
        SystemClock.elapsedRealtime();
        zzatsVar.b();
        Object obj = null;
        try {
            try {
                zzatsVar.zzc("network-queue-take");
                zzatsVar.zzl();
                TrafficStats.setThreadStatsTag(zzatsVar.zzb());
                zzato zza = this.b.zza(zzatsVar);
                zzatsVar.zzc("network-http-complete");
                if (zza.e && zzatsVar.zzq()) {
                    zzatsVar.a("not-modified");
                    zzatsVar.f();
                } else {
                    zzaty c = zzatsVar.c(zza);
                    zzatsVar.zzc("network-parse-complete");
                    zzatb zzatbVar = c.b;
                    if (zzatbVar != null) {
                        this.c.b(zzatsVar.zzi(), zzatbVar);
                        zzatsVar.zzc("network-cache-written");
                    }
                    zzatsVar.zzp();
                    zzatjVar.a(zzatsVar, c, null);
                    zzatsVar.e(c);
                }
            } catch (zzaub e) {
                SystemClock.elapsedRealtime();
                zzatsVar.zzc("post-error");
                m10Var.b.post(new lv4(zzatsVar, new zzaty(e), obj, false, 15));
                zzatsVar.f();
            } catch (Exception e2) {
                zzaue.b("Unhandled exception %s", e2.toString());
                zzaub zzaubVar = new zzaub(e2);
                SystemClock.elapsedRealtime();
                zzatsVar.zzc("post-error");
                m10Var.b.post(new lv4(zzatsVar, new zzaty(zzaubVar), obj, false, 15));
                zzatsVar.f();
            }
            zzatsVar.b();
        } catch (Throwable th) {
            zzatsVar.b();
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.d) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzaue.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
