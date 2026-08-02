package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class cn8 extends hd8 {
    public final ddb i;

    public cn8(ddb ddbVar) {
        ddbVar.getClass();
        this.i = ddbVar;
    }

    @Override // defpackage.g4, defpackage.ddb
    public final void addListener(Runnable runnable, Executor executor) {
        this.i.addListener(runnable, executor);
    }

    @Override // defpackage.g4, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.i.cancel(z);
    }

    @Override // defpackage.g4, java.util.concurrent.Future
    public final Object get() {
        return this.i.get();
    }

    @Override // defpackage.g4, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.i.isCancelled();
    }

    @Override // defpackage.g4, java.util.concurrent.Future
    public final boolean isDone() {
        return this.i.isDone();
    }

    @Override // defpackage.g4
    public final String toString() {
        return this.i.toString();
    }

    @Override // defpackage.g4, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.i.get(j, timeUnit);
    }
}
