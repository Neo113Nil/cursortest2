package defpackage;

import com.sofascore.model.mvvm.model.Category;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class y93 extends p2 {
    public final Category b;
    public final ArrayList c;
    public boolean d;
    public final int e;

    public y93(Category category, ArrayList arrayList, boolean z, int i) {
        super(category, arrayList);
        this.b = category;
        this.c = arrayList;
        this.d = z;
        this.e = i;
    }

    @Override // defpackage.p2
    public final ArrayList d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y93)) {
            return false;
        }
        y93 y93Var = (y93) obj;
        return this.b.equals(y93Var.b) && this.c.equals(y93Var.c) && this.d == y93Var.d && this.e == y93Var.e;
    }

    @Override // defpackage.p2
    public final boolean g() {
        return this.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + dmi.e((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        return "PinnedCompetitionsCollapsibleItem(category=" + this.b + ", items=" + this.c + ", isExpanded=" + this.d + ", groupPosition=" + this.e + ")";
    }
}
