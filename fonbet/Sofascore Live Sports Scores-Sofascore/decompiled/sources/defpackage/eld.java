package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class eld {
    public final r9k a;
    public final gv9 b;

    public eld(m9k m9kVar, gv9 gv9Var) {
        gv9Var.getClass();
        this.a = m9kVar;
        this.b = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eld)) {
            return false;
        }
        eld eldVar = (eld) obj;
        return Intrinsics.c(this.a, eldVar.a) && Intrinsics.c(this.b, eldVar.b);
    }

    public final int hashCode() {
        r9k r9kVar = this.a;
        return this.b.hashCode() + ((r9kVar == null ? 0 : r9kVar.hashCode()) * 31);
    }

    public final String toString() {
        return "OddsComparisonUIModel(marketName=" + this.a + ", oddsList=" + this.b + ")";
    }
}
