package com.google.android.gms.internal.play_billing;

import com.mbridge.msdk.foundation.same.report.h;
import defpackage.a70;
import defpackage.lnb;
import defpackage.ogj;
import defpackage.vnn;
import defpackage.yhk;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbn {
    public final zzbq a;
    public boolean b;
    public long c;
    public long d;

    public zzbn(zzbq zzbqVar) {
        if (zzbqVar != null) {
            this.a = zzbqVar;
        } else {
            yhk.s("ticker");
            throw null;
        }
    }

    public final void a() {
        if (this.b) {
            a70.r("This stopwatch is already running.");
        } else {
            this.b = true;
            this.d = this.a.a();
        }
    }

    public final String toString() {
        String str;
        long a = this.b ? (this.a.a() - this.d) + this.c : this.c;
        TimeUnit timeUnit = a / 86400000000000L > 0 ? TimeUnit.DAYS : a / 3600000000000L > 0 ? TimeUnit.HOURS : a / 60000000000L > 0 ? TimeUnit.MINUTES : a / 1000000000 > 0 ? TimeUnit.SECONDS : a / 1000000 > 0 ? TimeUnit.MILLISECONDS : a / 1000 > 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
        String format = String.format(Locale.ROOT, "%.4g", Double.valueOf(a / r2.convert(1L, timeUnit)));
        switch (vnn.a[timeUnit.ordinal()]) {
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
        return lnb.o(format, " ", str);
    }

    public zzbn() {
        this.a = zzbq.a;
    }
}
