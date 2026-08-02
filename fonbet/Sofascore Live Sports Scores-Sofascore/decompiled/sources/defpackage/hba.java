package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hba extends fsg implements Runnable {
    public final gba b;
    public final iba c;
    public final AtomicBoolean d = new AtomicBoolean();
    public final vf3 a = new vf3(0);

    public hba(gba gbaVar) {
        iba ibaVar;
        iba ibaVar2;
        this.b = gbaVar;
        if (gbaVar.c.b) {
            ibaVar2 = jba.e;
        } else {
            while (true) {
                if (gbaVar.b.isEmpty()) {
                    ibaVar = new iba(gbaVar.f);
                    gbaVar.c.a(ibaVar);
                    break;
                } else {
                    ibaVar = (iba) gbaVar.b.poll();
                    if (ibaVar != null) {
                        break;
                    }
                }
            }
            ibaVar2 = ibaVar;
        }
        this.c = ibaVar2;
    }

    @Override // defpackage.fsg
    public final k55 a(Runnable runnable, TimeUnit timeUnit) {
        if (this.a.b) {
            return em5.a;
        }
        return this.c.c(runnable, TimeUnit.NANOSECONDS, this.a);
    }

    @Override // defpackage.k55
    public final void d() {
        if (this.d.compareAndSet(false, true)) {
            this.a.d();
            boolean z = jba.f;
            iba ibaVar = this.c;
            if (z) {
                ibaVar.c(this, TimeUnit.NANOSECONDS, null);
                return;
            }
            gba gbaVar = this.b;
            gbaVar.getClass();
            ibaVar.c = System.nanoTime() + gbaVar.a;
            gbaVar.b.offer(ibaVar);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        gba gbaVar = this.b;
        gbaVar.getClass();
        long nanoTime = System.nanoTime() + gbaVar.a;
        iba ibaVar = this.c;
        ibaVar.c = nanoTime;
        gbaVar.b.offer(ibaVar);
    }
}
