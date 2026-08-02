package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class oo5 {
    public final mi6 a;
    public final ri6 b;

    public oo5(mi6 mi6Var, ri6 ri6Var) {
        mi6Var.getClass();
        this.a = mi6Var;
        this.b = ri6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo5)) {
            return false;
        }
        oo5 oo5Var = (oo5) obj;
        return Intrinsics.c(this.a, oo5Var.a) && Intrinsics.c(this.b, oo5Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ri6 ri6Var = this.b;
        return hashCode + (ri6Var == null ? 0 : ri6Var.hashCode());
    }

    public final String toString() {
        return "Enrollment(experiment=" + this.a + ", group=" + this.b + ")";
    }
}
