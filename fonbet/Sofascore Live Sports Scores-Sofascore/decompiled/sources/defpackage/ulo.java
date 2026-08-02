package defpackage;

import com.google.android.gms.internal.ads.zzhcq;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ulo extends zzhcq {
    public final ddb h;

    public ulo(ddb ddbVar) {
        ddbVar.getClass();
        this.h = ddbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbr, defpackage.ddb
    public final void addListener(Runnable runnable, Executor executor) {
        this.h.addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhbr, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.h.cancel(z);
    }

    @Override // com.google.android.gms.internal.ads.zzhbr, java.util.concurrent.Future
    public final Object get() {
        return this.h.get();
    }

    @Override // com.google.android.gms.internal.ads.zzhbr, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.h.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzhbr, java.util.concurrent.Future
    public final boolean isDone() {
        return this.h.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final String toString() {
        return this.h.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhbr, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.h.get(j, timeUnit);
    }
}
