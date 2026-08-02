package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zi3 extends c5n {
    public static zi3 h;
    public static final Map i;

    static {
        yi3 yi3Var = new yi3();
        yi3Var.put(461L, "FIREPERF_AUTOPUSH");
        yi3Var.put(462L, "FIREPERF");
        yi3Var.put(675L, "FIREPERF_INTERNAL_LOW");
        yi3Var.put(676L, "FIREPERF_INTERNAL_HIGH");
        i = Collections.unmodifiableMap(yi3Var);
    }

    @Override // defpackage.c5n
    public final String B() {
        return "com.google.firebase.perf.LogSourceName";
    }
}
