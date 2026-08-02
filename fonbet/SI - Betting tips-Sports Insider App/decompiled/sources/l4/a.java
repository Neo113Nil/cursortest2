package l4;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f19349a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f19350b;

    public a(String str, Map map) {
        this.f19349a = str;
        this.f19350b = ci.c.b0(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f19349a, aVar.f19349a) && Intrinsics.areEqual(this.f19350b, aVar.f19350b);
    }

    public final int hashCode() {
        return this.f19350b.hashCode() + (this.f19349a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f19349a + ", extras=" + this.f19350b + ')';
    }
}
