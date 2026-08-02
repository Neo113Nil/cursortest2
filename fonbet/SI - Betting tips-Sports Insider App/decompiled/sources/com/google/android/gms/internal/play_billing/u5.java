package com.google.android.gms.internal.play_billing;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u5 implements z1 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f5600a;

    /* renamed from: b, reason: collision with root package name */
    public final t5 f5601b = new t5(this);

    public u5(s5 s5Var) {
        this.f5600a = new WeakReference(s5Var);
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final void b(Runnable runnable, Executor executor) {
        this.f5601b.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        s5 s5Var = (s5) this.f5600a.get();
        boolean cancel = this.f5601b.cancel(z5);
        if (!cancel || s5Var == null) {
            return cancel;
        }
        s5Var.f5583a = null;
        s5Var.f5584b = null;
        s5Var.f5585c.i(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f5601b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5601b.f5563a instanceof w2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f5601b.isDone();
    }

    public final String toString() {
        return this.f5601b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f5601b.get(j, timeUnit);
    }
}
