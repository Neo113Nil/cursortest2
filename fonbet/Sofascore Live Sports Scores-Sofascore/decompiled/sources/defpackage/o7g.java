package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class o7g {
    public static final n7g a;

    static {
        hde hdeVar = new hde(50.0f);
        a = new n7g(hdeVar, hdeVar, hdeVar, hdeVar);
    }

    public static final n7g a(float f) {
        q75 q75Var = new q75(f);
        return new n7g(q75Var, q75Var, q75Var, q75Var);
    }

    public static final n7g b(float f, float f2, float f3, float f4) {
        return new n7g(new q75(f), new q75(f2), new q75(f3), new q75(f4));
    }

    public static n7g c(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return b(f, f2, f3, f4);
    }
}
