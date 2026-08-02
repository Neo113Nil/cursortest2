package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class jbn {
    public static final hbn a;
    public static final hbn b;

    static {
        hbn hbnVar = null;
        try {
            hbnVar = (hbn) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = hbnVar;
        b = new hbn();
    }
}
