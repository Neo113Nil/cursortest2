package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class txg implements uxg {
    public final e93 a;
    public final Integer b;

    public txg(e93 e93Var, Integer num) {
        e93Var.getClass();
        this.a = e93Var;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txg)) {
            return false;
        }
        txg txgVar = (txg) obj;
        return this.a == txgVar.a && Intrinsics.c(this.b, txgVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "OpenSeasonPickerSheet(slotIndex=" + this.a + ", selectedTournamentId=" + this.b + ")";
    }
}
