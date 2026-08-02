package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vi3 extends c5n {
    public static vi3 h;

    public static synchronized vi3 Q() {
        vi3 vi3Var;
        synchronized (vi3.class) {
            vi3Var = h;
            if (vi3Var == null) {
                vi3Var = new vi3();
                h = vi3Var;
            }
        }
        return vi3Var;
    }

    @Override // defpackage.c5n
    public final String B() {
        return "isEnabled";
    }

    @Override // defpackage.c5n
    public final String E() {
        return "firebase_performance_collection_enabled";
    }
}
