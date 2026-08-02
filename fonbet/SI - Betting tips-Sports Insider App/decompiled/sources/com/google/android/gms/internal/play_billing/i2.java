package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i2 extends t1 {

    /* renamed from: h, reason: collision with root package name */
    public z1 f5482h;

    /* renamed from: i, reason: collision with root package name */
    public ScheduledFuture f5483i;

    @Override // com.google.android.gms.internal.play_billing.o1
    public final String c() {
        z1 z1Var = this.f5482h;
        ScheduledFuture scheduledFuture = this.f5483i;
        if (z1Var == null) {
            return null;
        }
        String n9 = androidx.appcompat.widget.c1.n("inputFuture=[", z1Var.toString(), "]");
        if (scheduledFuture == null) {
            return n9;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return n9;
        }
        return n9 + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.play_billing.o1
    public final void d() {
        z1 z1Var = this.f5482h;
        if ((z1Var != null) & (this.f5532a instanceof d1)) {
            Object obj = this.f5532a;
            z1Var.cancel((obj instanceof d1) && ((d1) obj).f5423a);
        }
        ScheduledFuture scheduledFuture = this.f5483i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f5482h = null;
        this.f5483i = null;
    }
}
