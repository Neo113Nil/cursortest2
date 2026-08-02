package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class iz4 implements oz4 {
    public final mi6 a;
    public final ri6 b;

    public iz4(mi6 mi6Var, ri6 ri6Var) {
        mi6Var.getClass();
        this.a = mi6Var;
        this.b = ri6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz4)) {
            return false;
        }
        iz4 iz4Var = (iz4) obj;
        return Intrinsics.c(this.a, iz4Var.a) && this.b.equals(iz4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SetExperimentGroup(experiment=" + this.a + ", group=" + this.b + ")";
    }
}
