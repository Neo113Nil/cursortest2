package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xhl implements eil {
    public final int a;
    public final String b;
    public final String c;

    public xhl(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhl)) {
            return false;
        }
        xhl xhlVar = (xhl) obj;
        return this.a == xhlVar.a && Intrinsics.c(this.b, xhlVar.b) && Intrinsics.c(this.c, xhlVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return mz1.o(dmi.t(this.a, "OpenTournamentHighlights(highlightId=", ", title=", this.b, ", url="), this.c, ")");
    }
}
