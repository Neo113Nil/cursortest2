package defpackage;

import com.appsflyer.internal.i;
import com.ironsource.U3;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class cmo extends tlo {
    public ddb h;
    public ScheduledFuture i;

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final void f() {
        n(this.h);
        ScheduledFuture scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.h = null;
        this.i = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final String g() {
        ddb ddbVar = this.h;
        ScheduledFuture scheduledFuture = this.i;
        if (ddbVar == null) {
            return null;
        }
        String obj = ddbVar.toString();
        String m = wt3.m("inputFuture=[", obj, new StringBuilder(obj.length() + 14), U3.j.e);
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                int length = m.length();
                StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + length + 19 + 4);
                i.n(delay, m, ", remaining delay=[", sb);
                sb.append(" ms]");
                return sb.toString();
            }
        }
        return m;
    }
}
