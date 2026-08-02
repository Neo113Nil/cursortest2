package defpackage;

import java.time.Duration;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class toh extends soh {
    public long h;
    public long i;
    public dsg j;
    public final AtomicLong k = new AtomicLong(Long.MAX_VALUE);

    @Override // defpackage.soh
    public final void a(vvd vvdVar) {
        Duration duration = vvdVar.j;
        long nanos = duration == null ? vvd.C.toNanos() : duration.toNanos();
        this.h = nanos;
        this.i = (nanos * 51) / 100;
    }

    @Override // defpackage.soh
    public final void b() {
        this.j.a();
        super.b();
    }

    @Override // defpackage.soh
    public final void c(p4d p4dVar, v5d v5dVar, long j) {
        super.c(p4dVar, v5dVar, j);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = p4dVar.N;
        long j2 = this.i;
        this.j = new dsg(scheduledThreadPoolExecutor, j2, j2, TimeUnit.NANOSECONDS, new t4f(this, 8));
    }

    @Override // defpackage.soh
    public final void e(int i, byte[] bArr) {
        long nanoTime = System.nanoTime() + this.h;
        AtomicLong atomicLong = this.k;
        atomicLong.set(nanoTime);
        this.g.write(bArr, 0, i);
        atomicLong.set(Long.MAX_VALUE);
    }
}
