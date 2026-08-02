package l4;

import c4.m;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final m f19351a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f19352b;

    public b(m mVar, Map map) {
        this.f19351a = mVar;
        this.f19352b = ci.c.b0(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f19351a, bVar.f19351a) && Intrinsics.areEqual(this.f19352b, bVar.f19352b);
    }

    public final int hashCode() {
        return this.f19352b.hashCode() + (this.f19351a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(image=" + this.f19351a + ", extras=" + this.f19352b + ')';
    }
}
