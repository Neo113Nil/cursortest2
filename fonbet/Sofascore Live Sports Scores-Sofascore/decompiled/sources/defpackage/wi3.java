package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wi3 extends c5n {
    public static wi3 h;

    public static synchronized wi3 Q() {
        wi3 wi3Var;
        synchronized (wi3.class) {
            wi3Var = h;
            if (wi3Var == null) {
                wi3Var = new wi3();
                h = wi3Var;
            }
        }
        return wi3Var;
    }

    @Override // defpackage.c5n
    public final String B() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // defpackage.c5n
    public final String E() {
        return "experiment_app_start_ttid";
    }
}
