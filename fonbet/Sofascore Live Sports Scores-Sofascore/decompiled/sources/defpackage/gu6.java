package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gu6 {
    public final vl7 a;
    public final boolean b;

    public gu6(vl7 vl7Var, boolean z) {
        this.a = vl7Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu6)) {
            return false;
        }
        gu6 gu6Var = (gu6) obj;
        return Intrinsics.c(this.a, gu6Var.a) && this.b == gu6Var.b;
    }

    public final int hashCode() {
        vl7 vl7Var = this.a;
        return Boolean.hashCode(this.b) + ((vl7Var == null ? 0 : vl7Var.hashCode()) * 31);
    }

    public final String toString() {
        return "TokenDialogState(selectedTokenData=" + this.a + ", submitInProgress=" + this.b + ")";
    }
}
