package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes13.dex */
public class O5 {
    public static final int e = -1;
    private Runnable a = new a();
    private int b;
    private InterfaceC4465o c;
    private C4638xb d;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("loaded ads are expired");
            InterfaceC4465o interfaceC4465o = O5.this.c;
            if (interfaceC4465o != null) {
                interfaceC4465o.a();
            }
        }
    }

    public O5(int i, InterfaceC4465o interfaceC4465o) {
        this.c = interfaceC4465o;
        this.b = i;
    }

    public boolean b() {
        return this.b > 0;
    }

    public void a(long j) {
        if (b()) {
            long millis = TimeUnit.MINUTES.toMillis(this.b) - Math.max(j, 0L);
            if (millis <= 0) {
                IronLog.INTERNAL.verbose("no delay - onAdExpired called");
                this.c.a();
                return;
            }
            a();
            this.d = new C4638xb(millis, this.a, true);
            Calendar calendar = Calendar.getInstance();
            calendar.add(14, (int) millis);
            IronLog.INTERNAL.verbose("loaded ads will expire on: " + calendar.getTime() + " in " + String.format(Locale.getDefault(), "%.2f", Double.valueOf((millis / 1000.0d) / 60.0d)) + " minutes");
        }
    }

    public void a() {
        if (!b() || this.d == null) {
            return;
        }
        IronLog.INTERNAL.verbose("canceling expiration timer");
        this.d.e();
        this.d = null;
    }
}
