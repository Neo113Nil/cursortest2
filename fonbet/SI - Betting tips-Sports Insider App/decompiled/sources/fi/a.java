package fi;

import ag.c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9626a;

    /* renamed from: b, reason: collision with root package name */
    public int f9627b;

    public a() {
        ArrayList _values = new ArrayList();
        Intrinsics.checkNotNullParameter(_values, "_values");
        this.f9626a = _values;
    }

    public final Object a(c clazz) {
        Object obj;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        ArrayList arrayList = this.f9626a;
        if (arrayList.isEmpty()) {
            return null;
        }
        int i5 = this.f9627b;
        ArrayList arrayList2 = this.f9626a;
        Object obj2 = arrayList2.get(i5);
        if (!clazz.isInstance(obj2)) {
            obj2 = null;
        }
        Object obj3 = obj2 != null ? obj2 : null;
        if (obj3 != null && this.f9627b < u.e(arrayList2)) {
            this.f9627b++;
        }
        if (obj3 != null) {
            return obj3;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (clazz.isInstance(obj)) {
                break;
            }
        }
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return Intrinsics.areEqual(this.f9626a, ((a) obj).f9626a) && Intrinsics.areEqual((Object) null, (Object) null);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9626a.hashCode() * 31;
    }

    public final String toString() {
        return "DefinitionParameters" + CollectionsKt.W(this.f9626a);
    }
}
