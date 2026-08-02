package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class kte {
    public final ite a;
    public final hte b;
    public final sqi c;
    public int d;
    public Object e;
    public final Looper f;
    public boolean g;
    public boolean h;
    public boolean i;

    public kte(hte hteVar, ite iteVar, lij lijVar, int i, sqi sqiVar, Looper looper) {
        this.b = hteVar;
        this.a = iteVar;
        this.f = looper;
        this.c = sqiVar;
    }

    public final synchronized void a(long j) {
        boolean z;
        qx9.t(this.g);
        qx9.t(this.f.getThread() != Thread.currentThread());
        this.c.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (true) {
            z = this.i;
            if (z || j <= 0) {
                break;
            }
            this.c.getClass();
            wait(j);
            this.c.getClass();
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z) {
        this.h = z | this.h;
        this.i = true;
        notifyAll();
    }

    public final void c() {
        qx9.t(!this.g);
        this.g = true;
        hh6 hh6Var = (hh6) this.b;
        synchronized (hh6Var) {
            if (!hh6Var.x && hh6Var.i.isAlive()) {
                hh6Var.h.a(14, this).b();
                return;
            }
            m6k.f0();
            b(false);
        }
    }
}
