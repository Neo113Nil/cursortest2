package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class oia {
    public final ScheduledExecutorService a;
    public final jfi b;
    public final t9d c;
    public int d;
    public ScheduledFuture e;
    public ScheduledFuture f;
    public final sib g;
    public final sib h;
    public final long i;
    public final long j;

    public oia(t9d t9dVar, ScheduledExecutorService scheduledExecutorService, long j, long j2) {
        jfi jfiVar = new jfi();
        this.d = 1;
        this.g = new sib(new mia(this, 0));
        this.h = new sib(new mia(this, 1));
        this.c = t9dVar;
        z1a.y(scheduledExecutorService, "scheduler");
        this.a = scheduledExecutorService;
        this.b = jfiVar;
        this.i = j;
        this.j = j2;
        jfiVar.a = false;
        jfiVar.b();
    }

    public final synchronized void a() {
        try {
            jfi jfiVar = this.b;
            jfiVar.a = false;
            jfiVar.b();
            int i = this.d;
            if (i == 2) {
                this.d = 3;
            } else if (i == 4 || i == 5) {
                ScheduledFuture scheduledFuture = this.e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.d == 5) {
                    this.d = 1;
                } else {
                    this.d = 2;
                    z1a.D("There should be no outstanding pingFuture", this.f == null);
                    this.f = this.a.schedule(this.h, this.i, TimeUnit.NANOSECONDS);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            int i = this.d;
            if (i == 1) {
                this.d = 2;
                if (this.f == null) {
                    ScheduledExecutorService scheduledExecutorService = this.a;
                    sib sibVar = this.h;
                    long j = this.i;
                    jfi jfiVar = this.b;
                    this.f = scheduledExecutorService.schedule(sibVar, j - jfiVar.a(), TimeUnit.NANOSECONDS);
                }
            } else if (i == 5) {
                this.d = 4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
