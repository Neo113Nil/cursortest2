package defpackage;

import com.mbridge.msdk.foundation.same.report.h;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jfi {
    public boolean a;
    public long b;

    public final long a() {
        if (this.a) {
            return System.nanoTime() - this.b;
        }
        return 0L;
    }

    public final void b() {
        z1a.D("This stopwatch is already running.", !this.a);
        this.a = true;
        this.b = System.nanoTime();
    }

    public final String toString() {
        String str;
        long nanoTime = this.a ? System.nanoTime() - this.b : 0L;
        TimeUnit timeUnit = nanoTime / 86400000000000L > 0 ? TimeUnit.DAYS : nanoTime / 3600000000000L > 0 ? TimeUnit.HOURS : nanoTime / 60000000000L > 0 ? TimeUnit.MINUTES : nanoTime / 1000000000 > 0 ? TimeUnit.SECONDS : nanoTime / 1000000 > 0 ? TimeUnit.MILLISECONDS : nanoTime / 1000 > 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
        StringBuilder sb = new StringBuilder(String.format(Locale.ROOT, "%.4g", Double.valueOf(nanoTime / r0.convert(1L, timeUnit))));
        sb.append(" ");
        switch (ifi.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = h.b;
                break;
            case 7:
                str = "d";
                break;
            default:
                ogj.b();
                return null;
        }
        sb.append(str);
        return sb.toString();
    }
}
