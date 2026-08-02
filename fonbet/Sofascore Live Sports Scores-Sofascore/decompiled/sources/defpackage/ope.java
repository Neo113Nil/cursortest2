package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ope {
    public final gv9 a;
    public final wj1 b;

    public ope(gv9 gv9Var, wj1 wj1Var) {
        gv9Var.getClass();
        this.a = gv9Var;
        this.b = wj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ope)) {
            return false;
        }
        ope opeVar = (ope) obj;
        return Intrinsics.c(this.a, opeVar.a) && this.b == opeVar.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        wj1 wj1Var = this.b;
        return hashCode + (wj1Var == null ? 0 : wj1Var.hashCode());
    }

    public final String toString() {
        return "PESMBaseballCategoryPickerUiData(availableCategories=" + this.a + ", selectedCategory=" + this.b + ")";
    }
}
