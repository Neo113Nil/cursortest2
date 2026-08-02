package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ki6 {
    public final boolean a;
    public final gv9 b;

    public ki6(gv9 gv9Var, boolean z) {
        gv9Var.getClass();
        this.a = z;
        this.b = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki6)) {
            return false;
        }
        ki6 ki6Var = (ki6) obj;
        return this.a == ki6Var.a && Intrinsics.c(this.b, ki6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ExpandedPlayerData(isLoading=" + this.a + ", events=" + this.b + ")";
    }
}
