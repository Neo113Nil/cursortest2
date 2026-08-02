package p2;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.t;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f21483a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21484b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21485c;

    /* renamed from: d, reason: collision with root package name */
    public final List f21486d;

    /* renamed from: e, reason: collision with root package name */
    public final List f21487e;

    public i(String referenceTable, String onDelete, String onUpdate, List columnNames, List referenceColumnNames) {
        Intrinsics.checkNotNullParameter(referenceTable, "referenceTable");
        Intrinsics.checkNotNullParameter(onDelete, "onDelete");
        Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
        Intrinsics.checkNotNullParameter(columnNames, "columnNames");
        Intrinsics.checkNotNullParameter(referenceColumnNames, "referenceColumnNames");
        this.f21483a = referenceTable;
        this.f21484b = onDelete;
        this.f21485c = onUpdate;
        this.f21486d = columnNames;
        this.f21487e = referenceColumnNames;
    }

    public final boolean equals(Object obj) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (Intrinsics.areEqual(this.f21483a, iVar.f21483a) && Intrinsics.areEqual(this.f21484b, iVar.f21484b) && Intrinsics.areEqual(this.f21485c, iVar.f21485c) && Intrinsics.areEqual(this.f21486d, iVar.f21486d)) {
            return Intrinsics.areEqual(this.f21487e, iVar.f21487e);
        }
        return false;
    }

    public final int hashCode() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        return this.f21487e.hashCode() + ((this.f21486d.hashCode() + r4.k.j(r4.k.j(this.f21483a.hashCode() * 31, 31, this.f21484b), 31, this.f21485c)) * 31);
    }

    public final String toString() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        return t.b(t.d("\n            |ForeignKey {\n            |   referenceTable = '" + this.f21483a + "',\n            |   onDelete = '" + this.f21484b + "',\n            |   onUpdate = '" + this.f21485c + "',\n            |   columnNames = {" + l.d(CollectionsKt.Q(this.f21486d)) + "\n            |   referenceColumnNames = {" + l.c(CollectionsKt.Q(this.f21487e)) + "\n            |}\n        "));
    }
}
