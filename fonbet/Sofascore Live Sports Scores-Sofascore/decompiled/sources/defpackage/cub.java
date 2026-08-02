package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class cub {
    public static final ztb a;
    public static final ztb b;

    static {
        kff kffVar = kff.c;
        ztb ztbVar = null;
        try {
            ztbVar = (ztb) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = ztbVar;
        b = new ztb();
    }
}
