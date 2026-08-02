package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class t7p extends s7p {
    public final ddb i;

    public t7p(ddb ddbVar) {
        ddbVar.getClass();
        this.i = ddbVar;
    }

    @Override // defpackage.t6p, defpackage.ddb
    public final void addListener(Runnable runnable, Executor executor) {
        this.i.addListener(runnable, executor);
    }

    @Override // defpackage.t6p, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.i.cancel(z);
    }

    @Override // defpackage.t6p, java.util.concurrent.Future
    public final Object get() {
        return this.i.get();
    }

    @Override // defpackage.t6p, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.i.isCancelled();
    }

    @Override // defpackage.t6p, java.util.concurrent.Future
    public final boolean isDone() {
        return this.i.isDone();
    }

    @Override // defpackage.t6p
    public final String toString() {
        return this.i.toString();
    }

    @Override // defpackage.t6p, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.i.get(j, timeUnit);
    }
}
