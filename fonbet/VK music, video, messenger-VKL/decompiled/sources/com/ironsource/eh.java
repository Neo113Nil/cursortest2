package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;

/* loaded from: classes13.dex */
public final class eh {
    private volatile String a;
    private volatile boolean b;
    private volatile int c;
    private volatile int d = -1;

    public final void a(int i, String str) {
        this.c = i;
        this.d = i;
        this.b = true;
        this.a = str;
        IronLog.INTERNAL.verbose("Reset load state for attempt " + i + ", pending URL: " + str);
    }

    public final String b() {
        if (this.d != this.c) {
            IronLog.INTERNAL.verbose("Ignoring stale onPageFinished callback from attempt " + this.d + ", current attempt is " + this.c);
            return null;
        }
        this.b = false;
        if (this.a == null) {
            return null;
        }
        IronLog.INTERNAL.verbose("BLANK_PAGE load completed for attempt " + this.c + ", now loading controller");
        String str = this.a;
        this.a = null;
        return str;
    }

    public final boolean c() {
        return this.b;
    }

    public final void a() {
        this.a = null;
        this.b = false;
        this.c = 0;
        this.d = -1;
    }
}
