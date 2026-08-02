package p2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.t;
import kotlin.text.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f21488a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21489b;

    /* renamed from: c, reason: collision with root package name */
    public final List f21490c;

    /* renamed from: d, reason: collision with root package name */
    public final List f21491d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public j(String name, boolean z5, List columns, List orders) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(orders, "orders");
        this.f21488a = name;
        this.f21489b = z5;
        this.f21490c = columns;
        this.f21491d = orders;
        if (orders.isEmpty()) {
            int size = columns.size();
            orders = new ArrayList(size);
            for (int i5 = 0; i5 < size; i5++) {
                orders.add("ASC");
            }
        }
        this.f21491d = orders;
    }

    public final boolean equals(Object obj) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            String str = jVar.f21488a;
            if (this.f21489b == jVar.f21489b && Intrinsics.areEqual(this.f21490c, jVar.f21490c) && Intrinsics.areEqual(this.f21491d, jVar.f21491d)) {
                String str2 = this.f21488a;
                return z.o(str2, "index_", false) ? z.o(str, "index_", false) : Intrinsics.areEqual(str2, str);
            }
        }
        return false;
    }

    public final int hashCode() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        String str = this.f21488a;
        return this.f21491d.hashCode() + ((this.f21490c.hashCode() + ((((z.o(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f21489b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        return t.b(t.d("\n            |Index {\n            |   name = '" + this.f21488a + "',\n            |   unique = '" + this.f21489b + "',\n            |   columns = {" + l.d(this.f21490c) + "\n            |   orders = {" + l.c(this.f21491d) + "\n            |}\n        "));
    }
}
