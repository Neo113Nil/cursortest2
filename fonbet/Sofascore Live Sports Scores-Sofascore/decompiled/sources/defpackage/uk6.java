package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class uk6 {
    public static final rk6 a = new rk6();
    public static final rk6 b;

    static {
        kff kffVar = kff.c;
        rk6 rk6Var = null;
        try {
            rk6Var = (rk6) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = rk6Var;
    }
}
