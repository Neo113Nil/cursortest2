package ug;

import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f24265a;

    static {
        Object h10;
        try {
            gf.o oVar = gf.q.f10031a;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            h10 = property != null ? StringsKt.toIntOrNull(property) : null;
        } catch (Throwable th2) {
            gf.o oVar2 = gf.q.f10031a;
            h10 = h8.b.h(th2);
        }
        Integer num = (Integer) (h10 instanceof gf.p ? null : h10);
        f24265a = num != null ? num.intValue() : 2097152;
    }
}
