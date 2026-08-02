package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j6e extends d7a {
    public final ArrayList h;
    public final int i;
    public final int j;

    public j6e(ArrayList arrayList, int i, int i2) {
        this.h = arrayList;
        this.i = i;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j6e)) {
            return false;
        }
        j6e j6eVar = (j6e) obj;
        return this.h.equals(j6eVar.h) && this.i == j6eVar.i && this.j == j6eVar.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + Integer.hashCode(this.i) + this.h.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.Prepend loaded ");
        ArrayList arrayList = this.h;
        sb.append(arrayList.size());
        sb.append(" items (\n                    |   first item: ");
        sb.append(CollectionsKt.firstOrNull(arrayList));
        sb.append("\n                    |   last item: ");
        sb.append(CollectionsKt.j0(arrayList));
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.i);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.j);
        sb.append("\n                    |)\n                    |");
        return dii.d(sb.toString());
    }
}
