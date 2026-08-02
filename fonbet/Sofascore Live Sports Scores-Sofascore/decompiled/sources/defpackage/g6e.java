package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g6e extends d7a {
    public final int h;
    public final ArrayList i;
    public final int j;
    public final int k;

    public g6e(int i, ArrayList arrayList, int i2, int i3) {
        this.h = i;
        this.i = arrayList;
        this.j = i2;
        this.k = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g6e)) {
            return false;
        }
        g6e g6eVar = (g6e) obj;
        return this.h == g6eVar.h && this.i.equals(g6eVar.i) && this.j == g6eVar.j && this.k == g6eVar.k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + Integer.hashCode(this.j) + this.i.hashCode() + Integer.hashCode(this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.Append loaded ");
        ArrayList arrayList = this.i;
        sb.append(arrayList.size());
        sb.append(" items (\n                    |   startIndex: ");
        sb.append(this.h);
        sb.append("\n                    |   first item: ");
        sb.append(CollectionsKt.firstOrNull(arrayList));
        sb.append("\n                    |   last item: ");
        sb.append(CollectionsKt.j0(arrayList));
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.j);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.k);
        sb.append("\n                    |)\n                    |");
        return dii.d(sb.toString());
    }
}
