package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lv6 {
    public final boolean a;
    public final boolean b;

    public lv6(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv6)) {
            return false;
        }
        lv6 lv6Var = (lv6) obj;
        return this.a == lv6Var.a && this.b == lv6Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "FantasyCreateLeagueBottomSheetState(isInProgress=" + this.a + ", isError=" + this.b + ")";
    }
}
