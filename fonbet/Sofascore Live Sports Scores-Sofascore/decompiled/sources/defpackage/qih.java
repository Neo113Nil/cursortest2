package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qih extends fsg {
    public final ScheduledExecutorService a;
    public final vf3 b = new vf3(0);
    public volatile boolean c;

    public qih(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    @Override // defpackage.fsg
    public final k55 a(Runnable runnable, TimeUnit timeUnit) {
        em5 em5Var = em5.a;
        if (this.c) {
            return em5Var;
        }
        csg csgVar = new csg(runnable, this.b);
        this.b.a(csgVar);
        try {
            csgVar.a(this.a.submit((Callable) csgVar));
            return csgVar;
        } catch (RejectedExecutionException e) {
            d();
            hda.L(e);
            return em5Var;
        }
    }

    @Override // defpackage.k55
    public final void d() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.d();
    }
}
