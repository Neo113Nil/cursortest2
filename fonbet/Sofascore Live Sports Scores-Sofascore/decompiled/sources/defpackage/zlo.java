package defpackage;

import com.google.android.gms.internal.ads.zzhbr;
import com.google.android.gms.internal.ads.zzhct;
import com.google.android.gms.internal.ads.zzhdh;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zlo extends zzhct implements zzhdh {
    public final ScheduledFuture b;

    public zlo(zzhbr zzhbrVar, ScheduledFuture scheduledFuture) {
        super(zzhbrVar);
        this.b = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzhcs, java.util.concurrent.Future
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
