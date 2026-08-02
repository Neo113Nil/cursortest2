package defpackage;

import com.google.android.gms.internal.play_billing.zzdc;
import com.google.android.gms.internal.play_billing.zzdk;
import com.ironsource.U3;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class uzn extends zzdc implements zzdk {
    public zzdk h;
    public ScheduledFuture i;

    @Override // com.google.android.gms.internal.play_billing.zzcu
    public final String e() {
        zzdk zzdkVar = this.h;
        ScheduledFuture scheduledFuture = this.i;
        if (zzdkVar == null) {
            return null;
        }
        String o = lnb.o("inputFuture=[", zzdkVar.toString(), U3.j.e);
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return o + ", remaining delay=[" + delay + " ms]";
            }
        }
        return o;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcu
    public final void f() {
        zzdk zzdkVar = this.h;
        if ((this.a instanceof fwn) & (zzdkVar != null)) {
            Object obj = this.a;
            zzdkVar.cancel((obj instanceof fwn) && ((fwn) obj).a);
        }
        ScheduledFuture scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.h = null;
        this.i = null;
    }
}
