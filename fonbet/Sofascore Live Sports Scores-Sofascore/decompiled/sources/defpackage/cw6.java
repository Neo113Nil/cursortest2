package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cw6 {
    public final boolean a;
    public final boolean b;

    public cw6(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw6)) {
            return false;
        }
        cw6 cw6Var = (cw6) obj;
        return this.a == cw6Var.a && this.b == cw6Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "FantasyEditLeagueBottomSheetState(editInProgress=" + this.a + ", isError=" + this.b + ")";
    }
}
