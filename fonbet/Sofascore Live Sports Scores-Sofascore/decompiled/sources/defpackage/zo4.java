package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class zo4 {
    public static final iv4 a;

    static {
        String str;
        iv4 iv4Var;
        int i = hri.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            hs4 hs4Var = z45.a;
            r69 r69Var = rob.a;
            r69 r69Var2 = r69Var.f;
            iv4Var = r69Var;
            if (r69Var == null) {
                iv4Var = yo4.k;
            }
        } else {
            iv4Var = yo4.k;
        }
        a = iv4Var;
    }
}
