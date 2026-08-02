package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class til implements wil {
    public final wci a;
    public final gv9 b;

    public til(wci wciVar, gv9 gv9Var) {
        gv9Var.getClass();
        this.a = wciVar;
        this.b = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof til)) {
            return false;
        }
        til tilVar = (til) obj;
        return this.a.equals(tilVar.a) && Intrinsics.c(this.b, tilVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Fantasy(leader=" + this.a + ", otherPlayers=" + this.b + ")";
    }
}
