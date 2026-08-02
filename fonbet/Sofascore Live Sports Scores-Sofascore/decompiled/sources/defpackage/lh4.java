package defpackage;

import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.newNetwork.DistinctEventSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lh4 {
    public final Category a;
    public final DistinctEventSet b;
    public final Set c;

    public lh4(Category category, DistinctEventSet distinctEventSet, Set set) {
        set.getClass();
        this.a = category;
        this.b = distinctEventSet;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh4)) {
            return false;
        }
        lh4 lh4Var = (lh4) obj;
        return this.a.equals(lh4Var.a) && this.b.equals(lh4Var.b) && Intrinsics.c(this.c, lh4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ProcessedCategory(category=" + this.a + ", eventSet=" + this.b + ", eventIds=" + this.c + ")";
    }
}
