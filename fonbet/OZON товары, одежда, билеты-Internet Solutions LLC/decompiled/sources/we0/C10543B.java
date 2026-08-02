package we0;

import B90.C2618u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.I;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: we0.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10543B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<m> f104405a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<List<m>> f104406b;

    /* JADX WARN: Multi-variable type inference failed */
    public C10543B(@NotNull List<m> outerPoints, @NotNull List<? extends List<m>> innerPoints) {
        Intrinsics.checkNotNullParameter(outerPoints, "outerPoints");
        Intrinsics.checkNotNullParameter(innerPoints, "innerPoints");
        this.f104405a = outerPoints;
        this.f104406b = innerPoints;
    }

    private static boolean a(m mVar, List list) {
        ArrayList o11;
        if (list.size() >= 3) {
            ArrayList W02 = C7714v.W0(list);
            W02.add(C7714v.K(list));
            o11 = I.o(W02, 2, 1, false);
            Iterator it = o11.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                List list2 = (List) it.next();
                boolean z11 = ((mVar.getLatitude() > ((m) list2.get(0)).getLatitude() ? 1 : (mVar.getLatitude() == ((m) list2.get(0)).getLatitude() ? 0 : -1)) < 0) != ((mVar.getLatitude() > ((m) list2.get(1)).getLatitude() ? 1 : (mVar.getLatitude() == ((m) list2.get(1)).getLatitude() ? 0 : -1)) < 0);
                boolean z12 = mVar.getLongitude() < ((((m) list2.get(1)).getLongitude() - ((m) list2.get(0)).getLongitude()) * ((mVar.getLatitude() - ((m) list2.get(0)).getLatitude()) / (((m) list2.get(1)).getLatitude() - ((m) list2.get(0)).getLatitude()))) + ((m) list2.get(0)).getLongitude();
                if (z11 && z12) {
                    i11++;
                }
            }
            if (i11 % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(@NotNull m point) {
        Intrinsics.checkNotNullParameter(point, "point");
        if (!a(point, this.f104405a)) {
            return false;
        }
        Iterator<List<m>> it = this.f104406b.iterator();
        while (it.hasNext()) {
            if (a(point, it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10543B)) {
            return false;
        }
        C10543B c10543b = (C10543B) obj;
        return Intrinsics.d(this.f104405a, c10543b.f104405a) && Intrinsics.d(this.f104406b, c10543b.f104406b);
    }

    public final int hashCode() {
        return this.f104406b.hashCode() + (this.f104405a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Polygon(outerPoints=");
        sb2.append(this.f104405a);
        sb2.append(", innerPoints=");
        return C2618u.h(sb2, this.f104406b, ")");
    }
}
