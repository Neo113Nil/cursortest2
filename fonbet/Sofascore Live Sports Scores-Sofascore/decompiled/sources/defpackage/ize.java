package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lize;", "Lbuc;", "Ljze;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ize extends buc {
    public final k20 a;

    public ize(k20 k20Var) {
        this.a = k20Var;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new jze(this.a, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ize) && this.a.equals(((ize) obj).a);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        jze jzeVar = (jze) wtcVar;
        k20 k20Var = jzeVar.p;
        k20 k20Var2 = this.a;
        if (Intrinsics.c(k20Var, k20Var2)) {
            return;
        }
        jzeVar.p = k20Var2;
        if (jzeVar.q) {
            jzeVar.m1();
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.a + ", overrideDescendants=false)";
    }
}
