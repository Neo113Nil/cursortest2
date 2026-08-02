package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class obf extends pbf {
    public final gv9 a;
    public final qbf b;

    public obf(b7 b7Var, qbf qbfVar) {
        b7Var.getClass();
        this.a = b7Var;
        this.b = qbfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obf)) {
            return false;
        }
        obf obfVar = (obf) obj;
        return Intrinsics.c(this.a, obfVar.a) && Intrinsics.c(this.b, obfVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        qbf qbfVar = this.b;
        return hashCode + (qbfVar == null ? 0 : qbfVar.hashCode());
    }

    public final String toString() {
        return "Success(topProfiles=" + this.a + ", myProfile=" + this.b + ")";
    }
}
