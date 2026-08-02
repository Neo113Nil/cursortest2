package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c7e {
    public final List a;
    public final Integer b;
    public final k9 c;
    public final int d;

    public c7e(List list, Integer num, k9 k9Var, int i) {
        list.getClass();
        this.a = list;
        this.b = num;
        this.c = k9Var;
        this.d = i;
    }

    public final z6e a(int i) {
        List list = this.a;
        if (list != null && list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((z6e) it.next()).a.isEmpty()) {
                int i2 = i - this.d;
                int i3 = 0;
                while (i3 < b.i(list) && i2 > b.i(((z6e) list.get(i3)).a)) {
                    i2 -= ((z6e) list.get(i3)).a.size();
                    i3++;
                }
                return i2 < 0 ? (z6e) CollectionsKt.Y(list) : (z6e) list.get(i3);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c7e)) {
            return false;
        }
        c7e c7eVar = (c7e) obj;
        return Intrinsics.c(this.a, c7eVar.a) && Intrinsics.c(this.b, c7eVar.b) && this.c == c7eVar.c && this.d == c7eVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        Integer num = this.b;
        return Integer.hashCode(this.d) + this.c.hashCode() + hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingState(pages=");
        sb.append(this.a);
        sb.append(", anchorPosition=");
        sb.append(this.b);
        sb.append(", config=");
        sb.append(this.c);
        sb.append(", leadingPlaceholderCount=");
        return wv8.j(sb, this.d, ')');
    }
}
