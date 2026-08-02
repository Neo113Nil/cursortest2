package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class c47 {
    public final boolean a;
    public final boolean b;

    public c47(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c47)) {
            return false;
        }
        c47 c47Var = (c47) obj;
        return this.a == c47Var.a && this.b == c47Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "FantasyLeagueDetailsState(isAdmin=" + this.a + ", leaveLeagueInProgress=" + this.b + ")";
    }
}
