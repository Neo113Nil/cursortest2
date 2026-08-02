package com.fyber.inneractive.sdk.util;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public final class v1 {
    public final TimeUnit a;
    public final long b;
    public final t1 c;
    public u1 e;
    public boolean d = false;
    public long f = 0;

    public v1(TimeUnit timeUnit, long j) {
        this.b = j;
        this.a = timeUnit;
        IAlog.a("Visible time counter init - time %d", Long.valueOf(j));
        this.c = new t1(this);
    }

    public final void a(long j) {
        long uptimeMillis = (SystemClock.uptimeMillis() - j) + 50 + this.f;
        this.f = uptimeMillis;
        if (this.e != null && uptimeMillis > this.a.toMillis(this.b)) {
            this.e.a();
            return;
        }
        t1 t1Var = this.c;
        if (t1Var == null || this.e == null) {
            return;
        }
        t1Var.removeMessages(1932593528);
        this.c.sendEmptyMessageDelayed(1932593528, 50L);
    }
}
