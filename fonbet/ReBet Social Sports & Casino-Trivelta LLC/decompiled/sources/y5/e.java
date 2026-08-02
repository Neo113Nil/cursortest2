package y5;

import A5.E;
import A5.H;
import android.graphics.RectF;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f68286a;

    public e(List viewList) {
        Intrinsics.checkNotNullParameter(viewList, "viewList");
        this.f68286a = viewList;
    }

    public final boolean a(RectF rectF, C6854a c6854a) {
        return rectF.contains(c6854a.a(), c6854a.b());
    }

    public final d b(C6854a coordinates, Function1 predicate) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator it = CollectionsKt.asReversed(this.f68286a).iterator();
        while (it.hasNext()) {
            d c10 = c((d) it.next(), coordinates, predicate);
            if (c10 != null) {
                return c10;
            }
        }
        return null;
    }

    public final d c(d dVar, C6854a c6854a, Function1 function1) {
        if (dVar instanceof E) {
            Iterator it = CollectionsKt.asReversed(((E) dVar).l()).iterator();
            while (it.hasNext()) {
                d c10 = c((d) it.next(), c6854a, function1);
                if (c10 != null) {
                    return c10;
                }
            }
        }
        if (d(dVar, c6854a) && ((Boolean) function1.invoke(dVar)).booleanValue()) {
            return dVar;
        }
        return null;
    }

    public final boolean d(d dVar, C6854a c6854a) {
        H h10 = dVar instanceof H ? (H) dVar : null;
        return h10 != null && h10.h() && a(h10.i(), c6854a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.areEqual(this.f68286a, ((e) obj).f68286a);
    }

    public int hashCode() {
        return this.f68286a.hashCode();
    }

    public String toString() {
        return "ViewHierarchy(viewList=" + this.f68286a + ")";
    }
}
