package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class L5 {
    public static final int e = -1;
    private Runnable a = new a();
    private int b;
    private InterfaceC4224o c;
    private C4361vb d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("loaded ads are expired");
            InterfaceC4224o interfaceC4224o = L5.this.c;
            if (interfaceC4224o != null) {
                interfaceC4224o.a();
            }
        }
    }

    public L5(int i, InterfaceC4224o interfaceC4224o) {
        this.c = interfaceC4224o;
        this.b = i;
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
            this.d = new C4361vb(millis, this.a, true);
            Calendar calendar = Calendar.getInstance();
            calendar.add(14, (int) millis);
            IronLog.INTERNAL.verbose("loaded ads will expire on: " + calendar.getTime() + " in " + String.format(Locale.getDefault(), "%.2f", Double.valueOf((millis / 1000.0d) / 60.0d)) + " minutes");
        }
    }

    public boolean b() {
        return this.b > 0;
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
