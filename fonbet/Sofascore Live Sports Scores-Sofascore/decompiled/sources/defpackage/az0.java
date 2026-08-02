package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class az0 {
    public static final Logger e = Logger.getLogger(az0.class.getName());
    public final orb a;
    public final xx3 b;
    public bj6 c;
    public y3g d;

    public az0(ccd ccdVar, orb orbVar, xx3 xx3Var) {
        this.a = orbVar;
        this.b = xx3Var;
    }

    public final void a(kac kacVar) {
        xx3 xx3Var = this.b;
        xx3Var.i();
        bj6 bj6Var = this.c;
        if (bj6Var == null) {
            bj6Var = ccd.r();
            this.c = bj6Var;
        }
        y3g y3gVar = this.d;
        if (y3gVar != null) {
            jqi jqiVar = (jqi) y3gVar.b;
            if (!jqiVar.c && !jqiVar.b) {
                return;
            }
        }
        long a = bj6Var.a();
        this.d = xx3Var.f(this.a, kacVar, a, TimeUnit.NANOSECONDS);
        e.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(a));
    }
}
