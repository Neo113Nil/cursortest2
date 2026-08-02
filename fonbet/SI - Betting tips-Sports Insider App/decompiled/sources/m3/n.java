package m3;

import e3.i0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public String f20328a;

    /* renamed from: b, reason: collision with root package name */
    public i0 f20329b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f20328a, nVar.f20328a) && this.f20329b == nVar.f20329b;
    }

    public final int hashCode() {
        return this.f20329b.hashCode() + (this.f20328a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f20328a + ", state=" + this.f20329b + ')';
    }
}
