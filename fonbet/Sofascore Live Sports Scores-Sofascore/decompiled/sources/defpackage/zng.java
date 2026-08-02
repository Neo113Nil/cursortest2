package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class zng {
    public static final HashMap a;

    static {
        HashMap hashMap = new HashMap(9);
        a = hashMap;
        hashMap.put("xx-small", new amg(0.694f, 7));
        hashMap.put("x-small", new amg(0.833f, 7));
        hashMap.put("small", new amg(10.0f, 7));
        hashMap.put("medium", new amg(12.0f, 7));
        hashMap.put("large", new amg(14.4f, 7));
        hashMap.put("x-large", new amg(17.3f, 7));
        hashMap.put("xx-large", new amg(20.7f, 7));
        hashMap.put("smaller", new amg(83.33f, 9));
        hashMap.put("larger", new amg(120.0f, 9));
    }
}
