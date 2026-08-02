package hc;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public String f10488a;

    @Override // hc.f
    public final boolean areContentsTheSame(Object obj) {
        String str = this.f10488a;
        b bVar = obj instanceof b ? (b) obj : null;
        return Intrinsics.areEqual(str, bVar != null ? bVar.f10488a : null);
    }

    @Override // hc.f
    public final boolean areItemsTheSame(Object obj) {
        return obj instanceof b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.areEqual(this.f10488a, ((b) obj).f10488a);
    }

    @Override // hc.f
    public final Object getChangePayload(Object obj) {
        b bVar = obj instanceof b ? (b) obj : null;
        if (bVar != null) {
            return bVar.f10488a;
        }
        return null;
    }

    public final int hashCode() {
        return this.f10488a.hashCode();
    }

    public final String toString() {
        return d9.e.k(new StringBuilder("DateStringClass(dateString="), this.f10488a, ')');
    }
}
