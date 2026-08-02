package defpackage;

import com.google.firebase.perf.metrics.Trace;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class stg {
    public static final l10 a = l10.c();

    public static void a(Trace trace, hr8 hr8Var) {
        int i = hr8Var.a;
        int i2 = hr8Var.c;
        int i3 = hr8Var.b;
        if (i > 0) {
            trace.putMetric("_fr_tot", i);
        }
        if (i3 > 0) {
            trace.putMetric("_fr_slo", i3);
        }
        if (i2 > 0) {
            trace.putMetric("_fr_fzn", i2);
        }
        String str = trace.d;
        a.getClass();
    }
}
