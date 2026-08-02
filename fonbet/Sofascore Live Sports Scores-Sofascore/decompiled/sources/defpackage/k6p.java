package defpackage;

import com.google.android.gms.internal.play_billing.zzdk;
import com.google.android.gms.internal.play_billing.zzp;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class k6p implements zzdk {
    public final WeakReference a;
    public final e5p b = new e5p(this);

    public k6p(zzp zzpVar) {
        this.a = new WeakReference(zzpVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdk
    public final void a(Runnable runnable, Executor executor) {
        this.b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        zzp zzpVar = (zzp) this.a.get();
        boolean cancel = this.b.cancel(z);
        if (!cancel || zzpVar == null) {
            return cancel;
        }
        zzpVar.a = null;
        zzpVar.b = null;
        zzpVar.c.h(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.a instanceof a2o;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
