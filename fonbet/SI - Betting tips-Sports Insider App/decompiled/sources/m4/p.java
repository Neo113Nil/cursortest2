package m4;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final p f20413b = new p(n0.i(new LinkedHashMap()));

    /* renamed from: a, reason: collision with root package name */
    public final Map f20414a;

    public p(Map map) {
        this.f20414a = map;
    }

    public final String a() {
        String lowerCase = "Content-Type".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        List list = (List) this.f20414a.get(lowerCase);
        if (list != null) {
            return (String) CollectionsKt.L(list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.areEqual(this.f20414a, ((p) obj).f20414a);
    }

    public final int hashCode() {
        return this.f20414a.hashCode();
    }

    public final String toString() {
        return "NetworkHeaders(data=" + this.f20414a + ')';
    }
}
