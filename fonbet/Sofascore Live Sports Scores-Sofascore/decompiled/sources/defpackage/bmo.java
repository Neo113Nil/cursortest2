package defpackage;

import com.google.android.gms.internal.ads.zzhdj;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class bmo extends hsn implements zzhdj {
    public final ScheduledExecutorService c;

    public bmo(ScheduledExecutorService scheduledExecutorService) {
        super((ExecutorService) scheduledExecutorService);
        this.c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzhdj, java.util.concurrent.ScheduledExecutorService
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final zlo schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        emo emoVar = new emo(Executors.callable(runnable, null));
        return new zlo(emoVar, this.c.schedule(emoVar, j, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzhdj, java.util.concurrent.ScheduledExecutorService
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final zlo scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        amo amoVar = new amo(runnable);
        return new zlo(amoVar, this.c.scheduleWithFixedDelay(amoVar, j, j2, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzhdj, java.util.concurrent.ScheduledExecutorService
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final zlo scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        amo amoVar = new amo(runnable);
        return new zlo(amoVar, this.c.scheduleAtFixedRate(amoVar, j, j2, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzhdj, java.util.concurrent.ScheduledExecutorService
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public final zlo schedule(Callable callable, long j, TimeUnit timeUnit) {
        emo emoVar = new emo(callable);
        return new zlo(emoVar, this.c.schedule(emoVar, j, timeUnit));
    }
}
