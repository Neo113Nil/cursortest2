package ka;

import d9.e;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f18962a;

    /* renamed from: b, reason: collision with root package name */
    public a f18963b;

    /* renamed from: c, reason: collision with root package name */
    public String f18964c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f18962a == cVar.f18962a && Intrinsics.areEqual(this.f18963b, cVar.f18963b) && Intrinsics.areEqual(this.f18964c, cVar.f18964c);
    }

    public final int hashCode() {
        int i5 = this.f18962a * 31;
        a aVar = this.f18963b;
        int hashCode = (i5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f18964c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SupportMsgResult(httpCode=");
        sb2.append(this.f18962a);
        sb2.append(", messages=");
        sb2.append(this.f18963b);
        sb2.append(", msgError=");
        return e.k(sb2, this.f18964c, ')');
    }
}
