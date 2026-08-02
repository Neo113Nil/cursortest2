package li;

import ag.c;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import u6.h;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f20101a = new ConcurrentHashMap();

    public static final String a(c kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        ConcurrentHashMap concurrentHashMap = f20101a;
        String str = (String) concurrentHashMap.get(kClass);
        if (str != null) {
            return str;
        }
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        String name = h.k(kClass).getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        concurrentHashMap.put(kClass, name);
        return name;
    }
}
