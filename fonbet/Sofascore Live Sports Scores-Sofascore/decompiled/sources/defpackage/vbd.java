package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class vbd {
    public static final sbd a;
    public static final sbd b;

    static {
        kff kffVar = kff.c;
        sbd sbdVar = null;
        try {
            sbdVar = (sbd) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = sbdVar;
        b = new sbd();
    }
}
