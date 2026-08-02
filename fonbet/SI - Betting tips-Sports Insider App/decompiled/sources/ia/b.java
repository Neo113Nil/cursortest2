package ia;

import d9.e;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f11039a;

    /* renamed from: b, reason: collision with root package name */
    public final List f11040b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11041c;

    public b(String str, List list, int i5) {
        this.f11039a = i5;
        this.f11040b = list;
        this.f11041c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f11039a == bVar.f11039a && Intrinsics.areEqual(this.f11040b, bVar.f11040b) && Intrinsics.areEqual(this.f11041c, bVar.f11041c);
    }

    public final int hashCode() {
        int i5 = this.f11039a * 31;
        List list = this.f11040b;
        int hashCode = (i5 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f11041c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PostsNews(codeHttp=");
        sb2.append(this.f11039a);
        sb2.append(", postsNews=");
        sb2.append(this.f11040b);
        sb2.append(", errorHttp=");
        return e.k(sb2, this.f11041c, ')');
    }
}
