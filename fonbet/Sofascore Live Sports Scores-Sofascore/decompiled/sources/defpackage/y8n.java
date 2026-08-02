package defpackage;

import com.google.android.gms.internal.pal.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class y8n {
    public static final a a = new a();
    public static final a b;

    static {
        a aVar = null;
        try {
            aVar = (a) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = aVar;
    }
}
