package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o9g {
    public final gv9 a;
    public final int b;

    public o9g(int i, gv9 gv9Var) {
        gv9Var.getClass();
        this.a = gv9Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9g)) {
            return false;
        }
        o9g o9gVar = (o9g) obj;
        return Intrinsics.c(this.a, o9gVar.a) && this.b == o9gVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RugbyFieldLineupsTeamData(players=" + this.a + ", jerseyColor=" + this.b + ")";
    }
}
