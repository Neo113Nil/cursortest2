package defpackage;

import com.google.android.gms.internal.play_billing.zzdk;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class bzn implements zzdk {
    public static final nsa b = new nsa(3, bzn.class);
    public final Object a;

    public bzn(Object obj) {
        this.a = obj;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdk
    public final void a(Runnable runnable, Executor executor) {
        if (executor == null) {
            yhk.s("Executor was null.");
            return;
        }
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            b.b().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", fc6.n("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e);
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
        return dmi.r(super.toString(), "[status=SUCCESS, result=[", this.a.toString(), "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.a;
    }
}
