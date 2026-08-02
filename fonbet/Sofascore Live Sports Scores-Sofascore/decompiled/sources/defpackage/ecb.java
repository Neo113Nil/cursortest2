package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ecb {
    public static final ccb a;
    public static final ccb b;

    static {
        hff hffVar = hff.c;
        ccb ccbVar = null;
        try {
            ccbVar = (ccb) Class.forName("androidx.glance.appwidget.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = ccbVar;
        b = new ccb();
    }
}
