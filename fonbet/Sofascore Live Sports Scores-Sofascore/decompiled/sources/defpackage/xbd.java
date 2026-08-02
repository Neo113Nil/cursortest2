package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public class xbd extends fsg {
    public final ScheduledExecutorService a;
    public volatile boolean b;

    public xbd(ThreadFactory threadFactory) {
        boolean z = jsg.a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (jsg.a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            jsg.d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        this.a = newScheduledThreadPool;
    }

    @Override // defpackage.fsg
    public final k55 a(Runnable runnable, TimeUnit timeUnit) {
        return this.b ? em5.a : c(runnable, timeUnit, null);
    }

    @Override // defpackage.fsg
    public final void b(tc8 tc8Var) {
        a(tc8Var, null);
    }

    public final csg c(Runnable runnable, TimeUnit timeUnit, vf3 vf3Var) {
        csg csgVar = new csg(runnable, vf3Var);
        if (vf3Var != null && !vf3Var.a(csgVar)) {
            return csgVar;
        }
        try {
            csgVar.a(this.a.submit((Callable) csgVar));
            return csgVar;
        } catch (RejectedExecutionException e) {
            if (vf3Var != null) {
                vf3Var.c(csgVar);
            }
            hda.L(e);
            return csgVar;
        }
    }

    @Override // defpackage.k55
    public final void d() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.shutdownNow();
    }
}
