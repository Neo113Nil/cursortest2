package d2;

import androidx.appcompat.widget.c1;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f8086a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8087b;

    public d(int i5, List list) {
        this.f8086a = list;
        this.f8087b = i5;
        if (list.isEmpty() && i5 == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i5 >= 0 && i5 < size) {
                return;
            }
        }
        StringBuilder r5 = c1.r(i5, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '");
        r5.append(u.d(list));
        r5.append("'.");
        throw new IllegalArgumentException(r5.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f8087b == dVar.f8087b && Intrinsics.areEqual(this.f8086a, dVar.f8086a);
    }

    public final int hashCode() {
        return this.f8086a.hashCode() + (this.f8087b * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavigationEventHistory(currentIndex=");
        sb2.append(this.f8087b);
        sb2.append(", mergedHistory=");
        return c1.p(sb2, this.f8086a, ')');
    }

    public d() {
        this(-1, e0.f19204a);
    }
}
