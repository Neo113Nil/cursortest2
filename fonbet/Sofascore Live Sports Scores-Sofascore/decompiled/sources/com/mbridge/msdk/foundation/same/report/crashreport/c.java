package com.mbridge.msdk.foundation.same.report.crashreport;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class c extends Thread {
    private static volatile c e;
    private final Handler a;
    private volatile b b;
    private com.mbridge.msdk.foundation.same.report.crashreport.a c;
    private int d;

    private c() {
        super("AnrMonitor-Thread");
        this.a = new Handler(Looper.getMainLooper());
        this.d = 5000;
    }

    public static c a() {
        if (e == null) {
            synchronized (c.class) {
                try {
                    if (e == null) {
                        e = new c();
                    }
                } finally {
                }
            }
        }
        return e;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            if (isInterrupted() || !(this.b == null || this.b.b)) {
                try {
                    Thread.sleep(this.d);
                } catch (Exception unused) {
                }
            } else {
                synchronized (this) {
                    try {
                        if (this.b == null) {
                            this.b = new b();
                        }
                        this.b.b();
                        long j = this.d;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        while (j > 0) {
                            try {
                                wait(j);
                            } catch (InterruptedException e2) {
                                e2.toString();
                            }
                            j = this.d - (SystemClock.uptimeMillis() - uptimeMillis);
                        }
                        if (!this.b.a()) {
                            com.mbridge.msdk.foundation.same.report.crashreport.a aVar = this.c;
                            if (aVar != null) {
                                aVar.a();
                            }
                        } else if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger() && this.c != null) {
                            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                            this.c.a(d.b(stackTrace), stackTrace);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b implements Runnable {
        private long a;
        private boolean b;
        private long c;

        private b() {
            this.a = SystemClock.uptimeMillis();
        }

        public boolean a() {
            return !this.b || this.a - this.c >= ((long) c.this.d);
        }

        public void b() {
            this.b = false;
            this.c = SystemClock.uptimeMillis();
            c.this.a.postAtFrontOfQueue(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.this) {
                this.b = true;
                this.a = SystemClock.uptimeMillis();
            }
        }
    }

    public c a(int i, com.mbridge.msdk.foundation.same.report.crashreport.a aVar) {
        this.d = i;
        this.c = aVar;
        return this;
    }
}
