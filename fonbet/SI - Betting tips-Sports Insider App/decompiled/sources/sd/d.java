package sd;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f23477a;

    /* renamed from: b, reason: collision with root package name */
    public n f23478b;

    public d(ArrayList arrayList, int i5) {
        List list = arrayList;
        list = (i5 & 1) != 0 ? e0.f19204a : list;
        n result = n.f23496c;
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(result, "result");
        this.f23477a = list;
        this.f23478b = result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f23477a, dVar.f23477a) && this.f23478b == dVar.f23478b;
    }

    public final int hashCode() {
        return this.f23478b.hashCode() + (this.f23477a.hashCode() * 31);
    }

    public final String toString() {
        return "FiltersOfMenuOption(list=" + this.f23477a + ", result=" + this.f23478b + ')';
    }
}
