package c4;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f3594b = new l(ci.c.b0(new LinkedHashMap()));

    /* renamed from: a, reason: collision with root package name */
    public final Map f3595a;

    public l(Map map) {
        this.f3595a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.areEqual(this.f3595a, ((l) obj).f3595a);
    }

    public final int hashCode() {
        return this.f3595a.hashCode();
    }

    public final String toString() {
        return "Extras(data=" + this.f3595a + ')';
    }
}
