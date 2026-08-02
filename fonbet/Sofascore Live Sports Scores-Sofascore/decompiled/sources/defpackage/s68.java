package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class s68 {
    public final gv9 a;
    public final boolean b;

    public s68(gv9 gv9Var, boolean z) {
        gv9Var.getClass();
        this.a = gv9Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s68)) {
            return false;
        }
        s68 s68Var = (s68) obj;
        return Intrinsics.c(this.a, s68Var.a) && this.b == s68Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FixturesFilterData(rounds=" + this.a + ", hasFdr=" + this.b + ")";
    }
}
