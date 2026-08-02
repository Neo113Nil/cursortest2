package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qi5 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public qi5(String str, String str2, String str3, String str4) {
        me4.p(str, str2, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi5)) {
            return false;
        }
        qi5 qi5Var = (qi5) obj;
        return Intrinsics.c(this.a, qi5Var.a) && Intrinsics.c(this.b, qi5Var.b) && this.c.equals(qi5Var.c) && Intrinsics.c(this.d, qi5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dmi.c(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return fc6.o(mz1.s("EditorStatistics(editedEvents=", this.a, ", eventOpenings=", this.b, ", leaderboardPosition="), this.c, ", leaderboardPoints=", this.d, ")");
    }
}
