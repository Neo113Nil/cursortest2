package defpackage;

import com.mbridge.msdk.foundation.controller.a;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k6h implements Executor, Runnable {
    public static final Logger d = Logger.getLogger(k6h.class.getName());
    public static final vha e;
    public final Executor a;
    public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    public volatile int c = 0;

    static {
        vha j6hVar;
        try {
            j6hVar = new i6h(AtomicIntegerFieldUpdater.newUpdater(k6h.class, a.q));
        } catch (Throwable th) {
            d.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            j6hVar = new j6h();
        }
        e = j6hVar;
    }

    public k6h(Executor executor) {
        z1a.y(executor, "'executor' must not be null.");
        this.a = executor;
    }

    public final void a(Runnable runnable) {
        vha vhaVar = e;
        if (vhaVar.J(this)) {
            try {
                this.a.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.b.remove(runnable);
                }
                vhaVar.K(this);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        z1a.y(runnable, "'r' must not be null.");
        this.b.add(runnable);
        a(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        vha vhaVar = e;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.b;
        while (true) {
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e2) {
                    d.log(Level.SEVERE, "Exception while executing runnable " + runnable, (Throwable) e2);
                }
            } catch (Throwable th) {
                vhaVar.K(this);
                throw th;
            }
        }
        vhaVar.K(this);
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        a(null);
    }
}
