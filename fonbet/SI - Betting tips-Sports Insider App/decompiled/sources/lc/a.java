package lc;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f19667a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f19667a, ((a) obj).f19667a);
    }

    public final int hashCode() {
        return this.f19667a.hashCode();
    }

    public final String toString() {
        return d9.e.k(new StringBuilder("DateInt(date="), this.f19667a, ')');
    }
}
