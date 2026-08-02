package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class e8p implements ddb {
    public static final e8p b = new e8p(null);
    public static final nsa c = new nsa(6, e8p.class);
    public final Object a;

    public e8p(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ddb
    public final void addListener(Runnable runnable, Executor executor) {
        if (runnable == null) {
            yhk.s("Runnable was null.");
            return;
        }
        if (executor == null) {
            yhk.s("Executor was null.");
            return;
        }
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger b2 = c.b();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            b2.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", fc6.o(new StringBuilder(valueOf.length() + 57 + valueOf2.length()), "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), (Throwable) e);
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
        String obj = super.toString();
        String valueOf = String.valueOf(this.a);
        return fc6.o(new StringBuilder(String.valueOf(obj).length() + 25 + valueOf.length() + 2), obj, "[status=SUCCESS, result=[", valueOf, "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.a;
    }
}
