package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ec9 {
    public final String a;
    public final xjc b;

    public ec9(String str, xjc xjcVar) {
        str.getClass();
        xjcVar.getClass();
        this.a = str;
        this.b = xjcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec9)) {
            return false;
        }
        ec9 ec9Var = (ec9) obj;
        return Intrinsics.c(this.a, ec9Var.a) && Intrinsics.c(this.b, ec9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HistoricalFinalEventWrapper(winnerTeamName=" + this.a + ", miniEvent=" + this.b + ")";
    }
}
