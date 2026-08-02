package m3;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f20321a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20322b;

    public j(String workSpecId, int i5) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f20321a = workSpecId;
        this.f20322b = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f20321a, jVar.f20321a) && this.f20322b == jVar.f20322b;
    }

    public final int hashCode() {
        return (this.f20321a.hashCode() * 31) + this.f20322b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb2.append(this.f20321a);
        sb2.append(", generation=");
        return d9.e.i(sb2, this.f20322b, ')');
    }
}
