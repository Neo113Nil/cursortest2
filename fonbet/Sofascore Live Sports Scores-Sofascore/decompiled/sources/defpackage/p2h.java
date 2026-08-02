package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class p2h {
    public final gv9 a;
    public final String b;
    public final boolean c;

    public p2h(gv9 gv9Var, String str, boolean z) {
        gv9Var.getClass();
        this.a = gv9Var;
        this.b = str;
        this.c = z;
    }

    public static p2h a(p2h p2hVar, boolean z) {
        gv9 gv9Var = p2hVar.a;
        String str = p2hVar.b;
        p2hVar.getClass();
        gv9Var.getClass();
        return new p2h(gv9Var, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2h)) {
            return false;
        }
        p2h p2hVar = (p2h) obj;
        return Intrinsics.c(this.a, p2hVar.a) && this.b.equals(p2hVar.b) && this.c == p2hVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + dmi.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectSportState(sportPickerItems=");
        sb.append(this.a);
        sb.append(", selectedSportSlug=");
        sb.append(this.b);
        sb.append(", isReorderMode=");
        return wt3.p(sb, this.c, ")");
    }
}
