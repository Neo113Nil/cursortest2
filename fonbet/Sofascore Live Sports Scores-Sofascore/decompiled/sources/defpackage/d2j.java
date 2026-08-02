package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d2j {
    public final gv9 a;
    public final n1j b;
    public final gv9 c;

    public d2j(gv9 gv9Var, n1j n1jVar, gv9 gv9Var2) {
        gv9Var.getClass();
        n1jVar.getClass();
        gv9Var2.getClass();
        this.a = gv9Var;
        this.b = n1jVar;
        this.c = gv9Var2;
    }

    public static d2j a(d2j d2jVar, n1j n1jVar, gv9 gv9Var, int i) {
        gv9 gv9Var2 = d2jVar.a;
        if ((i & 2) != 0) {
            n1jVar = d2jVar.b;
        }
        if ((i & 4) != 0) {
            gv9Var = d2jVar.c;
        }
        gv9Var2.getClass();
        n1jVar.getClass();
        gv9Var.getClass();
        return new d2j(gv9Var2, n1jVar, gv9Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2j)) {
            return false;
        }
        d2j d2jVar = (d2j) obj;
        return Intrinsics.c(this.a, d2jVar.a) && this.b == d2jVar.b && Intrinsics.c(this.c, d2jVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TeamSquadState(chips=" + this.a + ", selectedChip=" + this.b + ", listItems=" + this.c + ")";
    }
}
