package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pil implements ril {
    public final gv9 a;

    public pil(gv9 gv9Var) {
        gv9Var.getClass();
        this.a = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pil) && Intrinsics.c(this.a, ((pil) obj).a);
    }

    @Override // defpackage.ril
    public final String getKey() {
        return "header";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WorldCupStandingsTableHeader(statNames=" + this.a + ")";
    }
}
