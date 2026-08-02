package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class u7p extends z2p implements Future {
    @Override // defpackage.z2p
    public /* bridge */ /* synthetic */ Object b() {
        throw null;
    }

    public abstract Future c();

    public boolean cancel(boolean z) {
        return c().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return c().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return c().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return c().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return c().get(j, timeUnit);
    }
}
