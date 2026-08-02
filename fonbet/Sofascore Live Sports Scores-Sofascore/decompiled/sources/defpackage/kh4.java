package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kh4 {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final Set c;
    public final ArrayList d;

    public kh4(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, Set set, ArrayList arrayList) {
        set.getClass();
        this.a = linkedHashMap;
        this.b = linkedHashMap2;
        this.c = set;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh4)) {
            return false;
        }
        kh4 kh4Var = (kh4) obj;
        return this.a.equals(kh4Var.a) && this.b.equals(kh4Var.b) && Intrinsics.c(this.c, kh4Var.c) && this.d.equals(kh4Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ProcessedCategoriesData(eventCounts=" + this.a + ", filteredCategoryEventIds=" + this.b + ", uniqueTournamentsPlaying=" + this.c + ", sortedCategories=" + this.d + ")";
    }
}
