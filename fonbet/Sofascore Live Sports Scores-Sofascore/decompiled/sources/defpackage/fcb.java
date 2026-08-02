package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class fcb {
    public static final dcb a;
    public static final dcb b;

    static {
        kff kffVar = kff.c;
        dcb dcbVar = null;
        try {
            dcbVar = (dcb) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = dcbVar;
        b = new dcb();
    }
}
