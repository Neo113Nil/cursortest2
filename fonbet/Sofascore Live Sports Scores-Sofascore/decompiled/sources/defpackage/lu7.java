package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lu7 {
    public final gv9 a;
    public final boolean b;

    public lu7(gv9 gv9Var, boolean z) {
        gv9Var.getClass();
        this.a = gv9Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu7)) {
            return false;
        }
        lu7 lu7Var = (lu7) obj;
        return Intrinsics.c(this.a, lu7Var.a) && this.b == lu7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FeaturedOddsWrapper(oddsList=" + this.a + ", hasAdditionalOdds=" + this.b + ")";
    }
}
