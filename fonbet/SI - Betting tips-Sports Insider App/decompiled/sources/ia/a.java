package ia;

import d9.e;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f11034a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11035b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11036c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11037d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11038e;

    public a(int i5, int i10, String str, String str2, String str3) {
        this.f11034a = i5;
        this.f11035b = i10;
        this.f11036c = str;
        this.f11037d = str2;
        this.f11038e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f11034a == aVar.f11034a && this.f11035b == aVar.f11035b && Intrinsics.areEqual(this.f11036c, aVar.f11036c) && Intrinsics.areEqual(this.f11037d, aVar.f11037d) && Intrinsics.areEqual(this.f11038e, aVar.f11038e);
    }

    public final int hashCode() {
        int i5 = ((this.f11034a * 31) + this.f11035b) * 31;
        String str = this.f11036c;
        int hashCode = (i5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11037d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f11038e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NewsDataImpl(id=");
        sb2.append(this.f11034a);
        sb2.append(", dateTime=");
        sb2.append(this.f11035b);
        sb2.append(", title=");
        sb2.append(this.f11036c);
        sb2.append(", picture=");
        sb2.append(this.f11037d);
        sb2.append(", text=");
        return e.k(sb2, this.f11038e, ')');
    }
}
