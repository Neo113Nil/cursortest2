package defpackage;

import com.google.firebase.perf.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class rec {
    public static final l10 f = l10.c();
    public final ScheduledExecutorService a;
    public final ConcurrentLinkedQueue b;
    public final Runtime c;
    public ScheduledFuture d;
    public long e;

    public rec() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this.d = null;
        this.e = -1L;
        this.a = newSingleThreadScheduledExecutor;
        this.b = new ConcurrentLinkedQueue();
        this.c = runtime;
    }

    public final synchronized void a(long j, Timer timer) {
        this.e = j;
        try {
            this.d = this.a.scheduleAtFixedRate(new qec(this, timer, 0), 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            l10 l10Var = f;
            e.getMessage();
            l10Var.getClass();
        }
    }

    public final p10 b(Timer timer) {
        if (timer == null) {
            return null;
        }
        long a = timer.a() + timer.a;
        o10 h = p10.h();
        h.d(a);
        Runtime runtime = this.c;
        h.h(b0a.O((ljg.b(5) * (runtime.totalMemory() - runtime.freeMemory())) / 1024));
        return (p10) h.build();
    }
}
