package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u7j {
    public final q80 a;
    public q80 b;
    public boolean c = false;
    public hyc d = null;

    public u7j(q80 q80Var, q80 q80Var2) {
        this.a = q80Var;
        this.b = q80Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7j)) {
            return false;
        }
        u7j u7jVar = (u7j) obj;
        return Intrinsics.c(this.a, u7jVar.a) && Intrinsics.c(this.b, u7jVar.b) && this.c == u7jVar.c && Intrinsics.c(this.d, u7jVar.d);
    }

    public final int hashCode() {
        int e = dmi.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        hyc hycVar = this.d;
        return e + (hycVar == null ? 0 : hycVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) this.b) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ')';
    }
}
