package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class j6c {
    public final gv9 a;
    public final gv9 b;

    public j6c(gv9 gv9Var, gv9 gv9Var2) {
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = gv9Var;
        this.b = gv9Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6c)) {
            return false;
        }
        j6c j6cVar = (j6c) obj;
        return Intrinsics.c(this.a, j6cVar.a) && Intrinsics.c(this.b, j6cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MediaLineupsFieldUIData(formation=" + this.a + ", players=" + this.b + ")";
    }
}
