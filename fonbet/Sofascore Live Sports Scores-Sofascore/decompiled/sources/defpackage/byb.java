package defpackage;

import com.sofascore.model.database.DisplayType;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class byb {
    public final DisplayType a;
    public final gv9 b;
    public final boolean c;

    public byb(DisplayType displayType, gv9 gv9Var, boolean z) {
        displayType.getClass();
        gv9Var.getClass();
        this.a = displayType;
        this.b = gv9Var;
        this.c = z;
    }

    public static byb a(byb bybVar, DisplayType displayType, gv9 gv9Var, int i) {
        if ((i & 1) != 0) {
            displayType = bybVar.a;
        }
        if ((i & 2) != 0) {
            gv9Var = bybVar.b;
        }
        boolean z = bybVar.c;
        bybVar.getClass();
        displayType.getClass();
        gv9Var.getClass();
        return new byb(displayType, gv9Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byb)) {
            return false;
        }
        byb bybVar = (byb) obj;
        return this.a == bybVar.a && Intrinsics.c(this.b, bybVar.b) && this.c == bybVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ljg.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MatchesFilterScreenConfig(matchesDisplayType=");
        sb.append(this.a);
        sb.append(", filterGroups=");
        sb.append(this.b);
        sb.append(", chronologicalViewSupported=");
        return wt3.p(sb, this.c, ")");
    }
}
