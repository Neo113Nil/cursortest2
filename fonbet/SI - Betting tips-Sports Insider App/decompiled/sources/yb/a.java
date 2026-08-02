package yb;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f25793a;

    /* renamed from: b, reason: collision with root package name */
    public int f25794b;

    /* renamed from: c, reason: collision with root package name */
    public String f25795c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f25793a, aVar.f25793a) && this.f25794b == aVar.f25794b && Intrinsics.areEqual(this.f25795c, aVar.f25795c);
    }

    public final int hashCode() {
        int hashCode = ((this.f25793a.hashCode() * 31) + this.f25794b) * 31;
        String str = this.f25795c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ErrorBillingImpl(name=");
        sb2.append(this.f25793a);
        sb2.append(", errorCode=");
        sb2.append(this.f25794b);
        sb2.append(", debugMsg=");
        return d9.e.k(sb2, this.f25795c, ')');
    }
}
