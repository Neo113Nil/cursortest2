package p2;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.t;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f21492a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f21493b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f21494c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f21495d;

    public k(String name, Map columns, AbstractSet foreignKeys, AbstractSet abstractSet) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(foreignKeys, "foreignKeys");
        this.f21492a = name;
        this.f21493b = columns;
        this.f21494c = foreignKeys;
        this.f21495d = abstractSet;
    }

    public final boolean equals(Object obj) {
        Set set;
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!Intrinsics.areEqual(this.f21492a, kVar.f21492a) || !Intrinsics.areEqual(this.f21493b, kVar.f21493b) || !Intrinsics.areEqual(this.f21494c, kVar.f21494c)) {
            return false;
        }
        Set set2 = this.f21495d;
        if (set2 == null || (set = kVar.f21495d) == null) {
            return true;
        }
        return Intrinsics.areEqual(set2, set);
    }

    public final int hashCode() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        return this.f21494c.hashCode() + ((this.f21493b.hashCode() + (this.f21492a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        Collection collection;
        Intrinsics.checkNotNullParameter(this, "<this>");
        StringBuilder sb2 = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb2.append(this.f21492a);
        sb2.append("',\n            |    columns = {");
        sb2.append(l.b(CollectionsKt.R(this.f21493b.values(), new androidx.coordinatorlayout.widget.i(14))));
        sb2.append("\n            |    foreignKeys = {");
        sb2.append(l.b(this.f21494c));
        sb2.append("\n            |    indices = {");
        Set set = this.f21495d;
        if (set == null || (collection = CollectionsKt.R(set, new androidx.coordinatorlayout.widget.i(15))) == null) {
            collection = e0.f19204a;
        }
        sb2.append(l.b(collection));
        sb2.append("\n            |}\n        ");
        return t.d(sb2.toString());
    }
}
