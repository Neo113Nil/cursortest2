package com.applovin.impl;

import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class j7 {
    private final com.applovin.impl.sdk.l a;
    private Timer b;
    private long c;
    private long d;
    private long e;
    private boolean f;
    private final Runnable g;
    private long h;
    private final Object i = new Object();

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                j7.this.g.run();
                synchronized (j7.this.i) {
                    if (j7.this.f) {
                        j7.this.c = System.currentTimeMillis();
                        j7 j7Var = j7.this;
                        j7Var.d = j7Var.e;
                    } else {
                        j7.this.b = null;
                    }
                }
            } catch (Throwable th) {
                try {
                    if (j7.this.a != null) {
                        j7.this.a.Q();
                        if (com.applovin.impl.sdk.p.a()) {
                            j7.this.a.Q().a("Timer", "Encountered error while executing timed task", th);
                        }
                        j7.this.a.E().a("Timer", "executingTimedTask", th);
                    }
                    synchronized (j7.this.i) {
                        if (j7.this.f) {
                            j7.this.c = System.currentTimeMillis();
                            j7 j7Var2 = j7.this;
                            j7Var2.d = j7Var2.e;
                        } else {
                            j7.this.b = null;
                        }
                    }
                } catch (Throwable th2) {
                    synchronized (j7.this.i) {
                        if (j7.this.f) {
                            j7.this.c = System.currentTimeMillis();
                            j7 j7Var3 = j7.this;
                            j7Var3.d = j7Var3.e;
                        } else {
                            j7.this.b = null;
                        }
                        throw th2;
                    }
                }
            }
        }
    }

    private j7(com.applovin.impl.sdk.l lVar, Runnable runnable) {
        this.a = lVar;
        this.g = runnable;
    }

    public long c() {
        if (this.b == null) {
            return this.d - this.h;
        }
        return this.d - (System.currentTimeMillis() - this.c);
    }

    public void d() {
        synchronized (this.i) {
            Timer timer = this.b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.h = Math.max(1L, System.currentTimeMillis() - this.c);
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.l lVar = this.a;
                        if (lVar != null) {
                            lVar.Q();
                            if (com.applovin.impl.sdk.p.a()) {
                                this.a.Q();
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.a.Q().a("Timer", "Encountered error while pausing timer", th);
                                }
                            }
                        }
                        this.b = null;
                    } finally {
                        this.b = null;
                    }
                }
            }
        }
    }

    public void e() {
        j7 j7Var;
        synchronized (this.i) {
            try {
                try {
                    long j = this.h;
                    if (j > 0) {
                        try {
                            long j2 = this.d - j;
                            this.d = j2;
                            if (j2 < 0) {
                                this.d = 0L;
                            }
                            this.b = new Timer();
                            j7Var = this;
                            try {
                                j7Var.a(b(), this.d, this.f, this.e);
                                j7Var.c = System.currentTimeMillis();
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    com.applovin.impl.sdk.l lVar = j7Var.a;
                                    if (lVar != null) {
                                        lVar.Q();
                                        if (com.applovin.impl.sdk.p.a()) {
                                            j7Var.a.Q();
                                            if (com.applovin.impl.sdk.p.a()) {
                                                j7Var.a.Q().a("Timer", "Encountered error while resuming timer", th);
                                            }
                                        }
                                    }
                                    j7Var.h = 0L;
                                } finally {
                                    j7Var.h = 0L;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            j7Var = this;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    private TimerTask b() {
        return new a();
    }

    public static j7 a(long j, com.applovin.impl.sdk.l lVar, Runnable runnable) {
        return a(j, false, lVar, runnable);
    }

    public static j7 a(long j, boolean z, com.applovin.impl.sdk.l lVar, Runnable runnable) {
        if (j < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j + ".");
        }
        if (runnable != null) {
            j7 j7Var = new j7(lVar, runnable);
            j7Var.c = System.currentTimeMillis();
            j7Var.d = j;
            j7Var.f = z;
            j7Var.e = j;
            try {
                j7Var.b = new Timer();
                j7Var.a(j7Var.b(), j, z, j7Var.e);
                return j7Var;
            } catch (OutOfMemoryError e) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("Timer", "Failed to create timer due to OOM error", e);
                }
                return j7Var;
            }
        }
        throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
    }

    public void a() {
        synchronized (this.i) {
            Timer timer = this.b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.b = null;
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.l lVar = this.a;
                        if (lVar != null) {
                            lVar.Q();
                            if (com.applovin.impl.sdk.p.a()) {
                                this.a.Q();
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.a.Q().a("Timer", "Encountered error while cancelling timer", th);
                                }
                            }
                        }
                        this.b = null;
                    } catch (Throwable th2) {
                        this.b = null;
                        this.h = 0L;
                        throw th2;
                    }
                }
                this.h = 0L;
            }
        }
    }

    private void a(TimerTask timerTask, long j, boolean z, long j2) {
        if (z) {
            this.b.schedule(timerTask, j, j2);
        } else {
            this.b.schedule(timerTask, j);
        }
    }
}
