package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class aub {
    public static final xtb a;
    public static final xtb b;

    static {
        hff hffVar = hff.c;
        xtb xtbVar = null;
        try {
            xtbVar = (xtb) Class.forName("androidx.glance.appwidget.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = xtbVar;
        b = new xtb();
    }
}
