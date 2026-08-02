package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vil implements wil {
    public final wci a;
    public final gv9 b;

    public vil(wci wciVar, gv9 gv9Var) {
        gv9Var.getClass();
        this.a = wciVar;
        this.b = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vil)) {
            return false;
        }
        vil vilVar = (vil) obj;
        return this.a.equals(vilVar.a) && Intrinsics.c(this.b, vilVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Players(leader=" + this.a + ", otherPlayers=" + this.b + ")";
    }
}
