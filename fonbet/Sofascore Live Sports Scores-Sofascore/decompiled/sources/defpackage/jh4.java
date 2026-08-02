package defpackage;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jh4 {
    public final ArrayList a;
    public final Map b;
    public final Set c;

    public jh4(ArrayList arrayList, Map map, Set set) {
        set.getClass();
        this.a = arrayList;
        this.b = map;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh4)) {
            return false;
        }
        jh4 jh4Var = (jh4) obj;
        return this.a.equals(jh4Var.a) && this.b.equals(jh4Var.b) && Intrinsics.c(this.c, jh4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dmi.g(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FetchedCategories(categories=" + this.a + ", filteredCategoryEventIds=" + this.b + ", uniqueTournamentsPlaying=" + this.c + ")";
    }
}
