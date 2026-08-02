package com.mbridge.msdk.tracker.network;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class n implements Runnable {
    private final BlockingQueue<t<?>> a;
    private final m b;
    private final b c;
    private final w d;
    private volatile boolean e = false;

    public n(BlockingQueue<t<?>> blockingQueue, m mVar, b bVar, w wVar) {
        this.a = blockingQueue;
        this.b = mVar;
        this.c = bVar;
        this.d = wVar;
    }

    private void a() throws InterruptedException {
        b(this.a.take());
    }

    public void b(t<?> tVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        tVar.a(3);
        try {
            try {
                try {
                    tVar.a("network-queue-take");
                } catch (Exception e) {
                    c0.a(e, "Unhandled exception %s", e.toString());
                    a0 a0Var = new a0(e);
                    a0Var.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    this.d.a(tVar, a0Var);
                    tVar.x();
                }
            } catch (b0 e2) {
                e2.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                a(tVar, e2);
                tVar.x();
            }
            if (tVar.v()) {
                tVar.c("network-discard-cancelled");
                tVar.x();
                return;
            }
            if (tVar.y()) {
                a(tVar);
            }
            q a = this.b.a(tVar);
            tVar.a("network-http-complete");
            if (a.e && tVar.u()) {
                tVar.c("not-modified");
                tVar.x();
                return;
            }
            v<?> a2 = tVar.a(a);
            tVar.a("network-parse-complete");
            if (tVar.z() && a2.b != null) {
                this.c.a(tVar.e(), a2.b);
                tVar.a("network-cache-written");
            }
            tVar.w();
            this.d.a(tVar, a2);
            tVar.a(a2);
        } finally {
            tVar.a(4);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                c0.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    private void a(t<?> tVar) {
        TrafficStats.setThreadStatsTag(tVar.s());
    }

    private void a(t<?> tVar, b0 b0Var) {
        this.d.a(tVar, tVar.c(b0Var));
    }
}
