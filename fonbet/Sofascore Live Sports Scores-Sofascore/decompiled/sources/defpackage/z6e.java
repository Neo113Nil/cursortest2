package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z6e implements Iterable, eia {
    public final List a;
    public final Object b;
    public final int c;
    public final int d;

    static {
        new z6e(km5.a, null, 0, 0);
    }

    public z6e(List list, Object obj, int i, int i2) {
        list.getClass();
        this.a = list;
        this.b = obj;
        this.c = i;
        this.d = i2;
        if (i != Integer.MIN_VALUE && i < 0) {
            a70.p("itemsBefore cannot be negative");
            throw null;
        }
        if (i2 == Integer.MIN_VALUE || i2 >= 0) {
            return;
        }
        a70.p("itemsAfter cannot be negative");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6e)) {
            return false;
        }
        z6e z6eVar = (z6e) obj;
        return Intrinsics.c(this.a, z6eVar.a) && Intrinsics.c(this.b, z6eVar.b) && this.c == z6eVar.c && this.d == z6eVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 961;
        Object obj = this.b;
        return Integer.hashCode(this.d) + wv8.a(this.c, (hashCode + (obj == null ? 0 : obj.hashCode())) * 31, 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.listIterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadResult.Page(\n                    |   data size: ");
        List list = this.a;
        sb.append(list.size());
        sb.append("\n                    |   first Item: ");
        sb.append(CollectionsKt.firstOrNull(list));
        sb.append("\n                    |   last Item: ");
        sb.append(CollectionsKt.j0(list));
        sb.append("\n                    |   nextKey: ");
        sb.append(this.b);
        sb.append("\n                    |   prevKey: null\n                    |   itemsBefore: ");
        sb.append(this.c);
        sb.append("\n                    |   itemsAfter: ");
        sb.append(this.d);
        sb.append("\n                    |) ");
        return dii.d(sb.toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z6e(List list, Object obj) {
        this(list, obj, Integer.MIN_VALUE, Integer.MIN_VALUE);
        list.getClass();
    }
}
