package com.google.android.gms.internal.ads;

import android.os.Process;
import defpackage.g7h;
import defpackage.pyn;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzate extends Thread {
    public static final boolean g = zzaue.a;
    public final PriorityBlockingQueue a;
    public final PriorityBlockingQueue b;
    public final zzauo c;
    public volatile boolean d = false;
    public final g7h e;
    public final zzatj f;

    public zzate(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, zzauo zzauoVar, zzatj zzatjVar) {
        this.a = priorityBlockingQueue;
        this.b = priorityBlockingQueue2;
        this.c = zzauoVar;
        this.f = zzatjVar;
        this.e = new g7h(this, priorityBlockingQueue2, zzatjVar);
    }

    public final void a() {
        zzatj zzatjVar = this.f;
        PriorityBlockingQueue priorityBlockingQueue = this.b;
        g7h g7hVar = this.e;
        zzats zzatsVar = (zzats) this.a.take();
        zzatsVar.zzc("cache-queue-take");
        zzatsVar.b();
        try {
            zzatsVar.zzl();
            zzauo zzauoVar = this.c;
            zzatb a = zzauoVar.a(zzatsVar.zzi());
            if (a == null) {
                zzatsVar.zzc("cache-miss");
                if (!g7hVar.E(zzatsVar)) {
                    priorityBlockingQueue.put(zzatsVar);
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                boolean z = false;
                if (a.e < currentTimeMillis) {
                    zzatsVar.zzc("cache-hit-expired");
                    zzatsVar.zzj(a);
                    if (!g7hVar.E(zzatsVar)) {
                        priorityBlockingQueue.put(zzatsVar);
                    }
                } else {
                    zzatsVar.zzc("cache-hit");
                    byte[] bArr = a.a;
                    Map map = a.g;
                    zzaty c = zzatsVar.c(new zzato(200, bArr, map, zzato.a(map), false));
                    zzatsVar.zzc("cache-hit-parsed");
                    if (!(c.c == null)) {
                        zzatsVar.zzc("cache-parsing-failed");
                        String zzi = zzatsVar.zzi();
                        synchronized (zzauoVar) {
                            zzatb a2 = zzauoVar.a(zzi);
                            if (a2 != null) {
                                a2.f = 0L;
                                a2.e = 0L;
                                zzauoVar.b(zzi, a2);
                            }
                        }
                        zzatsVar.zzj(null);
                        if (!g7hVar.E(zzatsVar)) {
                            priorityBlockingQueue.put(zzatsVar);
                        }
                    } else if (a.f < currentTimeMillis) {
                        zzatsVar.zzc("cache-hit-refresh-needed");
                        zzatsVar.zzj(a);
                        c.d = true;
                        if (g7hVar.E(zzatsVar)) {
                            zzatjVar.a(zzatsVar, c, null);
                        } else {
                            zzatjVar.a(zzatsVar, c, new pyn(this, zzatsVar, z, 28));
                        }
                    } else {
                        zzatjVar.a(zzatsVar, c, null);
                    }
                }
            }
            zzatsVar.b();
        } catch (Throwable th) {
            zzatsVar.b();
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (g) {
            zzaue.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.c.c();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.d) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzaue.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
