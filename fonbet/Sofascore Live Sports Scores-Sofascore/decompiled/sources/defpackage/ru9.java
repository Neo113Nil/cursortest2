package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ru9 implements ddb {
    public static final ru9 b = new ru9(null);
    public static final nsa c = new nsa(0, ru9.class);
    public final Object a;

    public ru9(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ddb
    public final void addListener(Runnable runnable, Executor executor) {
        z1a.y(runnable, "Runnable was null.");
        z1a.y(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=SUCCESS, result=[");
        return mz1.n(sb, this.a, "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.a;
    }
}
