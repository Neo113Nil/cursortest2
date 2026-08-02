package ve;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public int f24582a;

    /* renamed from: b, reason: collision with root package name */
    public int f24583b;

    /* renamed from: c, reason: collision with root package name */
    public List f24584c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f24585d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f24582a == b0Var.f24582a && this.f24583b == b0Var.f24583b && Intrinsics.areEqual(this.f24584c, b0Var.f24584c) && Intrinsics.areEqual(this.f24585d, b0Var.f24585d);
    }

    public final int hashCode() {
        return this.f24585d.hashCode() + ((this.f24584c.hashCode() + ((((6200 + this.f24582a) * 31) + this.f24583b) * 31)) * 31);
    }

    public final String toString() {
        return "Content(minX=200, minY=" + this.f24582a + ", maxHeightItem=" + this.f24583b + ", gamesList=" + this.f24584c + ", cacheMap=" + this.f24585d + ')';
    }
}
