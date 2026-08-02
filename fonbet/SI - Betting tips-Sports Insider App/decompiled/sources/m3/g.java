package m3;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f20313a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20314b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20315c;

    public g(String workSpecId, int i5, int i10) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f20313a = workSpecId;
        this.f20314b = i5;
        this.f20315c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f20313a, gVar.f20313a) && this.f20314b == gVar.f20314b && this.f20315c == gVar.f20315c;
    }

    public final int hashCode() {
        return (((this.f20313a.hashCode() * 31) + this.f20314b) * 31) + this.f20315c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SystemIdInfo(workSpecId=");
        sb2.append(this.f20313a);
        sb2.append(", generation=");
        sb2.append(this.f20314b);
        sb2.append(", systemId=");
        return d9.e.i(sb2, this.f20315c, ')');
    }
}
