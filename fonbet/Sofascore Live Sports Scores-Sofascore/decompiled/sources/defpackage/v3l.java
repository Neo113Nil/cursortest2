package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v3l extends x3l {
    public final edd a;

    public v3l(edd eddVar) {
        this.a = eddVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v3l) && this.a.equals(((v3l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NoLeaderboard(noLeaderboardUiModel=" + this.a + ")";
    }
}
