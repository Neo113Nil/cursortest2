package defpackage;

import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class eh0 {
    public static final int a;

    static {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            u2gVar = property != null ? StringsKt.toIntOrNull(property) : null;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Integer num = (Integer) (u2gVar instanceof u2g ? null : u2gVar);
        a = num != null ? num.intValue() : 2097152;
    }
}
