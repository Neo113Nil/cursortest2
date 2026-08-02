package defpackage;

import com.google.android.gms.internal.cast.zzwa;
import com.google.android.gms.internal.cast.zzwh;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class abp extends zzwh implements ScheduledFuture {
    public final ScheduledFuture b;

    public abp(zzwa zzwaVar, ScheduledFuture scheduledFuture) {
        super(zzwaVar);
        this.b = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.cast.zzwg, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = this.a.cancel(z);
        if (cancel) {
            this.b.cancel(z);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.b.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.b.getDelay(timeUnit);
    }
}
